package NivelFacil.TiposDeDados.desafio3;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes(){
        System.out.println("Me chamo: " + nome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Essa é minha missão: " + missao);
        System.out.println("O nivel de dificuldade é: " + nivelDificuldade);
        System.out.println("O status da missão é: " + statusMissao);
    }
}
