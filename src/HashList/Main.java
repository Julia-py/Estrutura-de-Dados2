package HashList;
public class Main {
    public static void main(String[] args) {

        TabelaHash tabela = new TabelaHash(10);

        //  Inserindo alunos
        tabela.inserirValor(1, "Julia");
        tabela.inserirValor(2, "Carlos");
        tabela.inserirValor(12, "Ana");

        //  Buscando alunos
        System.out.println("Buscar matrícula 1: " + tabela.pegarValor(1));
        System.out.println("Buscar matrícula 2: " + tabela.pegarValor(2));
        System.out.println("Buscar matrícula 12: " + tabela.pegarValor(12));
        System.out.println("Buscar matrícula 5: " + tabela.pegarValor(5)); // não existe

        //  Removendo aluno
        boolean removido = tabela.removerValor(2);
        System.out.println("\nRemoção matrícula 2: " + removido);

        //  Buscando novamente após remoção
        System.out.println("Buscar matrícula 2: " + tabela.pegarValor(2));

        //  Teste de colisão (verificando se 12 continua)
        System.out.println("Buscar matrícula 12: " + tabela.pegarValor(12));
    }
}