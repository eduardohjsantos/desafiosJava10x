package NivelFacil.TiposDeDados.desafio5;

public class BancoKonoha implements Banco{

    @Override
    public void transferencia(ContaBancaria pagador, ContaBancaria beneficiario, double valor) {
        System.out.println("Realizando transferência entre as contas no valor de: " + valor + " reais");
        pagador.saldo -= valor;
        beneficiario.depositar(valor);
    }
}
