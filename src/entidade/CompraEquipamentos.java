package entidade;
import controllers.Controller;
import persistencia.DAO;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.ArrayList;

public class CompraEquipamentos implements Controller {
    private int idCompra;
    private ArrayList<Equipamento> equipamentos;
    private Fornecedor fornecedor;

    public CompraEquipamentos(ArrayList<Equipamento> equipamentos, Fornecedor fornecedor) {
        this.equipamentos = equipamentos;
        this.fornecedor = fornecedor;
    }

    public String comprar() {
        Double valor = 0.0;
        String r = " ";
        for (Equipamento e : equipamentos) {
            valor += e.getValor();
            e.setQtd_estoque(e.getQtd_estoque() + 1);
            e.setDisponivel(true);

            dao.atualizar(e);
        }

        contactarFornecedor();
        r = "Compra realizada com sucesso! Valor: R$" + valor;

        return r;
    }

    public void contactarFornecedor() {
        //email alumaq
        final String username = "alumaqmaquinas@gmail.com";
        final String password = "alumaq123";
        
        //email fornecedor
        String mailto = this.fornecedor.getEmail();

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(mailto)
            );
            message.setSubject("Alumaq - Compra de Equipamentos #"+idCompra);
            String texto = "Caro "+fornecedor.getNome()+","
                    + "\n\n Nós da empresa Alumaq desejamos realizar a compra dos seguintes equipamentos:\n";
            for (Equipamento e : equipamentos) {
                texto = texto + e.getNome() + " cód " + e.getIdEq() + "\n";
            }
            texto = texto + "\nNós da Alumaq agradecemos\n\nAtt,\n\nAlumaq - Aluguel e Venda de Máquinas";
            message.setText(texto);

            Transport.send(message);

            System.out.println("Email enviado a "+fornecedor.getNome());

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}
