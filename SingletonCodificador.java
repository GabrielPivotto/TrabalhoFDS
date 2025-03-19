public class SingletonCodificador {

    static private SingletonCodificador instance;

    private SingletonCodificador(){
        instance = null;
    }

    public static Codificador getCodificadorPorNivelDeSeguraca(int nivelDeSeguranca) {
        if(nivelDeSeguranca < 25) {
            return new CodificadorSimples();
        } else if (nivelDeSeguranca < 75) {
            return new CodificadorMedio();
        } else {
            return new CodificadorDificil();
        }
    }

    public static SingletonCodificador getInstance(){
        if (instance==null) instance = new SingletonCodificador();
        return instance;
    }
}