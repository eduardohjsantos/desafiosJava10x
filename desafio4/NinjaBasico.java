package NivelFacil.TiposDeDados.desafio4;

public class NinjaBasico implements Ninja {
    String nome;
    int idade;
    TipoHabilidade habilidade;

    @Override
    public void mostrarInformacoes() {
        System.out.println("Eu sou um Ninja Básico e me chamo " + nome + ", tenho " + idade + " anos e essa é minha habilidade especial: " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Eu sou "+ nome + ", um Ninja Básico e estou executando minha habilidade especial: " + habilidade);
    }

    public NinjaBasico(String nome, int idade, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }
}
