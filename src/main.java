public class main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Harry Potter e o Prisioneiro de Azkaban";
        meuFilme.anoDelancamento = 2004;
        meuFilme.duraçaoEmMinutos = 142;
        meuFilme.sinopse = """
                É o início do terceiro ano na escola de bruxaria Hogwarts.
                Harry, Ron e Hermione têm muito o que aprender.
                Mas uma ameaça ronda a escola e ela se chama Sirius Black.
                Após doze anos encarcerado na prisão de Azkaban
                ele consegue escapar e volta para vingar seu mestre
                Lord Voldemort""";

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(9);

        System.out.println("Soma Total das Avaliações: " + meuFilme.avaliacoes);
        System.out.println("Total de Avaliações: " + meuFilme.totalDeAvaliacoes);
        System.out.println("Avaliação do Filme: " + meuFilme.resultadoMedia());
    }
}