public class FactoryCodificador {
    public static Codificador getCodificadorPorNivelDeSeguraca(int nivelDeSeguranca) {
        if(nivelDeSeguranca < 25) {
            return new CodificadorSimples();
        } else if (nivelDeSeguranca < 75) {
            return new CodificadorMedio();
        } else {
            return new CodificadorDificil();
        }
    }
}
