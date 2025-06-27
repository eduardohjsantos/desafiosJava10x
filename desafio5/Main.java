package NivelFacil.TiposDeDados.desafio5;

public class Main {
    public static void main(String[] args) {

        BancoKonoha bancoKonoha = new BancoKonoha();

        ContaPoupanca pop = new ContaPoupanca(1200, TipoConta.POUPANCA);
        ContaCorrente cor = new ContaCorrente(10000, TipoConta.CORRENTE);

        pop.consultarSaldo();
        pop.depositar(125.32);
        pop.consultarSaldo();

        cor.consultarSaldo();
        cor.depositar(13453.25);
        cor.consultarSaldo();

        bancoKonoha.transferencia(cor, pop, 432.1);
        cor.consultarSaldo();
        pop.consultarSaldo();
    }
}
