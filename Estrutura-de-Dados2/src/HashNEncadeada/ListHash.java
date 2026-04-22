package HashNEncadeada;

public class ListHash {
    private Alunos[] tabela;
    private int tamanho;
    private int quantElementos;
    private static final int TAMANHO = 5;

    public ListHash() {
        this.tamanho = TAMANHO;
        this.tabela = new Alunos[tamanho];
        this.quantElementos = 0;
    }

    public int Hashh (int matricula) {
        return matricula % tamanho ;
    }
    public void Rehash (){
        Alunos[] tabelaAntiga = tabela;

        tamanho = tamanho * 2;
        tabela = new Alunos[tamanho];
        quantElementos = 0;
        for (int i =0; i < tabelaAntiga.length; i++){
           if (tabelaAntiga[i] != null && tabelaAntiga[i].matricula !=0) {
              InserirValor(
                      tabelaAntiga[i].matricula,
                      tabelaAntiga[i].nome
              );
           }
        }

    }

    public String pegarValor(int matricula){
        int indice = Hashh(matricula);

        while(indice < tamanho && tabela[indice] != null) {
            if (tabela[indice].matricula == matricula){
                return tabela[indice].nome;
            }
            else {
               indice++;
            }
        }
        return "Aluno não encontrado";
    }
    public void InserirValor(int matricula, String nome){
        int indice= Hashh(matricula);
        int inicio = indice;


        while(true) {
            if (tabela[indice] == null) { // posição vazia
                tabela[indice] = new Alunos(matricula, nome);
                quantElementos++;
                return;
            } else if (tabela[indice].matricula == matricula) { //matricula já existe
                tabela[indice].nome = nome;
                return;
            } else {
                indice++;

                if(indice >= tamanho){
                    Rehash();
                    InserirValor(matricula, nome);
                    return;
                }
            }
        }
    }

    public void removerValor(int matricula){
        int indice = Hashh(matricula);
        while (indice < tamanho && tabela[indice] != null) {
           if (tabela[indice].matricula == matricula) {
               tabela[indice] =new Alunos(0, "Removido");
               quantElementos--;
               return;
           }
           else{
               indice++;
           }
        }
        System.out.println("Aluno não encontrado.");
    }

    public void mostrarTabela() {
        for (int i = 0; i < tamanho; i++) {

            if (tabela[i] == null) {
                System.out.println(i + " -> vazio");
            }

            else {
                System.out.println(i + " -> " +
                        tabela[i].matricula + " - " +
                        tabela[i].nome);
            }
        }
    }


}
