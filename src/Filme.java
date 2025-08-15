public class Filme {
    String nome;
    String sinopse;
    int anoDelancamento;
    boolean incluidoNoPlano;
    double avaliacoes;
    int totalDeAvaliacoes;
    int duraçaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Ano de Lançamento: " + anoDelancamento);
        System.out.println("Duração em Minutos: " + duraçaoEmMinutos);
    }

    void avalia(double nota) {
        avaliacoes += nota;
        totalDeAvaliacoes++;
        System.out.println(nota);
    }

    double resultadoMedia() {
        return avaliacoes / totalDeAvaliacoes;

    }
}
