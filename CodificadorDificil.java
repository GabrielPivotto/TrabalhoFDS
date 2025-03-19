import java.time.LocalDate;

public class CodificadorDificil implements Codificador {
    public String getNome() {
        return "Codificador Dificil";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 03, 19);
    }

    public int getNivelSeguranca(){
        return 3;
    }

    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                // Aplica o deslocamento no caractere
                c = (char) ((c - base) % 26 + base);
            }
            // Adiciona o caractere codificado ao resultado
            encoded.append(c);
        }
        return encoded.toString();

    }

    public String decodifica(String str) {
        return codifica(str);
    }
}