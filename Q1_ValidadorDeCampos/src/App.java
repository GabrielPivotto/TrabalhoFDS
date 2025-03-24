public class App {
    public static void main(String[] args) throws Exception {
        String email = "bernardo.copstein@pucrs.br";
        var validador = new Validador();
        Tipo validaEmail = new TipoEmail();

        Tipo validaInteiro = new TipoInteiro();

        if (validador.valida(validaEmail, email)){
            System.out.println(email+" é um email válido!");
        }else{
            System.out.println(email+" não é um email válido!");
        }
    }
}
