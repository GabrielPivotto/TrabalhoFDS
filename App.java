import java.net.SocketTimeoutException;

public class App {
    public static void main(String[] args) throws Exception {
        Codificador cod = new CodificadorSimples();

        System.out.println("Codificador: "+cod.getNome());
        System.out.println("Versao: "+cod.getDataCriacao());
        System.out.println("Nivel de segurança: "+cod.getNivelSeguranca());
        
        String texto = "Este e o string a ser codificado";
        String codificado = cod.codifica(texto);
        String decodificado = cod.decodifica(codificado);

        System.out.println("Texto original: "+texto);
        System.out.println("Texto codificado: "+codificado);
        System.out.println("Texto decodificado: "+decodificado);

        Codificador codMedio = FactoryCodificador.getCodificadorPorNivelDeSeguraca(49);
        String txtMedio = "String codificada com dificuldade media";
        String txtCodMedio = codMedio.codifica(txtMedio);
        String txtDecodMedio = codMedio.decodifica(txtCodMedio);

        System.out.println("Texto original: "+txtMedio);
        System.out.println("Texto codificado: "+txtCodMedio);
        System.out.println("Texto decodificado: "+txtDecodMedio);
        
        
    }
}
