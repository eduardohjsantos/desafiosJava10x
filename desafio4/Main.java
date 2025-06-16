package NivelFacil.TiposDeDados.desafio4;

public class Main {
    public static void main(String[] args) {
        NinjaBasico Konohamaru = new NinjaBasico("Konohamaru", 10, TipoHabilidade.NINJUTSU);
        NinjaAvancado Kakashi = new NinjaAvancado("Kakashi", 30, TipoHabilidade.GENJUTSU, "Técnicas Mágicas");

        Konohamaru.mostrarInformacoes();
        Konohamaru.executarHabilidade();

        Kakashi.mostrarInformacoes();
        Kakashi.executarHabilidade();
    }
}
