package NivelFacil.TiposDeDados.desafio3;

public class Uchiha extends Ninja {
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println("Minha habilidade especial é: " + habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Me chamo: " + nome);
        System.out.println("Tenho " + idade + "anos");
        System.out.println("Essa é minha missão: " + missao);
        System.out.println("O nivel de dificuldade é: " + nivelDificuldade);
        System.out.println("O status da missão é: " + statusMissao);
        mostrarHabilidadeEspecial();
    }
}
