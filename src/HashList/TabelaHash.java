package HashList;

import java.util.ArrayList;

public class TabelaHash {

    private ArrayList<Aluno>[] tabela;
    private int tamanho;


    public TabelaHash (int tamanho){
        this.tamanho = tamanho;
        tabela = new ArrayList[tamanho];

        for(int i = 0; i < tamanho; i++) {
            tabela[i] = new ArrayList <> ();
        }
    }
    public int Hash(int matricula){
        return matricula % tamanho;
    }

    public void inserirValor(int matricula, String nome){
        int indice = Hash(matricula);
        tabela[indice].add(new Aluno(matricula, nome));
    }

    public String pegarValor (int matricula) {
        int indice = Hash(matricula);
        for(Aluno aluno : tabela[indice]) {
            if (aluno.matricula == matricula) {
                return aluno.nome;
            }
        }
        return null;
    }

    public boolean removerValor(int matricula) {
        int indice = Hash(matricula);
        for (int i = 0; i < tabela[indice].size(); i++) {
            if (tabela[indice].get(i).matricula == matricula) {
                tabela[indice].remove(i);
                return true;
            }
        }
        return false;
    }
}

