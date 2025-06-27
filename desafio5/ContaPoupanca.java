package NivelFacil.TiposDeDados.desafio5;

public class ContaPoupanca extends ContaBancaria{

    @Override
    public void depositar(double valor) {
        saldo += valor*0.99;
        System.out.println("Você depositou: " + valor*0.99 + " reais na Conta Poupança (taxa de 1% para depósitos em Poupança)");
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo atual em conta é: " + saldo + " reais na Conta Poupança");
    }

    public ContaPoupanca(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }
}
