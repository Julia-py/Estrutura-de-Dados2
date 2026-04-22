package HashNEncadeada;

public class main {
    public static void main(String[] args) {

        ListHash tabela = new ListHash();

        // Inserções
        tabela.InserirValor(1, "Julia");
        tabela.InserirValor(11, "Ana");
        tabela.InserirValor(21, "Pedro");
        tabela.mostrarTabela();

        // Buscar aluno
        System.out.println("Matrícula 11: " + tabela.pegarValor(11));


        // Remover aluno
        tabela.removerValor(21);


        // depois da remoção
        System.out.println("\nTabela:");
        tabela.mostrarTabela();

        // Buscar novamente após remover
        System.out.println("Matrícula 21 após remoção: " + tabela.pegarValor(21));

        // Inserir novo aluno
        tabela.InserirValor(26, "Beatriz");
        tabela.InserirValor(16, "Carlos");
        tabela.InserirValor(20, "Teo");
        tabela.InserirValor(83, "Junior");
        tabela.InserirValor(6, "Maria");

        // Forçar rehash
        tabela.InserirValor(46, "Matilda");
        tabela.InserirValor(31, "Lucas");
        tabela.InserirValor(36, "Fernanda");
        tabela.InserirValor(41, "Rafael");
        tabela.InserirValor(45, "Talia");
        tabela.InserirValor(91, "Lola");

        // Mostrar tabela final
        System.out.println("\nTabela final:");
        tabela.mostrarTabela();
    }
}
