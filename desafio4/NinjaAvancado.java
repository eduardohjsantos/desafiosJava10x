package NivelFacil.TiposDeDados.desafio4;

public class NinjaAvancado extends NinjaBasico implements Ninja{
    String especialidade;

    @Override
    public void mostrarInformacoes() {
        System.out.println("Eu sou um Ninja Avançado e me chamo " + nome + ", tenho " + idade + " anos, a minha habilidade especial é " + habilidade + " e minha especialidade é: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Eu sou "+ nome + ", um Ninja Avançado e estou executando minha habilidade especial: " + habilidade);
    }

    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }
}
