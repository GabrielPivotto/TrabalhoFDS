import java.time.LocalDate;

public class CodificadorMedio implements Codificador {
    public String getNome() {
        return "Codificador Médio";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 03, 19);
    }

    public int getNivelSeguranca(){
        return 2;
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