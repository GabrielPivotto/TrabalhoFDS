public class App {
    public static void main(String[] args) throws Exception {
        String aux = "Desafio Padrões de Projeto";

        CodificadorSimples codificadorSimples = new CodificadorSimples();
        CodificadorDesloca codificadorDesloca = new CodificadorDesloca();

        Codificador cod = new Codificador(codificadorSimples);

        System.out.println(aux);
        aux = cod.codifica(aux);
        System.out.println(aux);
        aux = cod.deCodifica(aux);
        System.out.println(aux);
        cod.setCodicador(codificadorDesloca);
        aux = cod.codifica(aux);
        System.out.println(aux);
        aux = cod.deCodifica(aux);
        System.out.println(aux);
    }
}
