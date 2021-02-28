package br.com.tt.model;

public class Usuario {
    private String nome;

    public Usuario(String novoNome){
        AlteraNome(novoNome);
    }

    private void AlteraNome(String novoNome){
        if(novoNome.length() < 3){
            System.err.println("Nome não deve ser menor que 3 caracteres!");
            System.exit(1); //Só usem em CONSOLE!
        }
        nome = novoNome;
    }

    public String getNome() {
        return nome;
    }
}
