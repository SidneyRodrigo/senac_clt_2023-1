package classes;

public class Mulher extends PessoaIMC{
    public Mulher(String nome, String dataNascimento, double peso, double altura) {
        super(nome, dataNascimento, peso, altura);
    }

    public String resultIMC() {
        double imc = calculaIMC();
        if (imc < 19) {
            return "Abaixo do peso ideal";
        } else if (imc > 25.8) {
            return "Acima do peso ideal";
        } else {
            return "Peso ideal";
        }
    }
}
