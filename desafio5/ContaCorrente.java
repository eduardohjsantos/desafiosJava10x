package NivelFacil.TiposDeDados.desafio5;

public class ContaCorrente extends ContaBancaria{


    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Você depositou: " + valor + " reais na Conta Corrente");
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo atual em conta é: " + saldo + " reais na Conta Corrente");
    }

    public ContaCorrente(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }
}
