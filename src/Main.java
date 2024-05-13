import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Christiano da Silva Carchereri";
        String tipoConta = "Corrente";
        float saldoConta = 3200;
        int opcao = 0;
        String inicio;
        inicio = String.format("""
                ***********************************************************
                Dados iniciais do cliente:
                                
                Nome:		    %s
                Tipo de Conta:	%s
                Saldo inicial:	R$ %.2f
                ***********************************************************
                """, nome, tipoConta, saldoConta);

        String operacoes;
        operacoes = """
                Operações
                
                1 - Consultar Saldos
                2 - Receber Valor
                3 - Transferir Valor
                4 - Sair
                
                Digite a opção desejada:
                """;

        System.out.println(inicio);

        while (opcao != 4) {

            System.out.println(operacoes);
            opcao = leitura.nextInt();

                    switch (opcao) {
                    case 1:
                        //Consultar Saldos
                        System.out.println(String.format("Saldo disponível atual: R$ %.2f", saldoConta));
                        break;
                    case 2:
                        //Receber Valor
                        System.out.println("Informe o valor a ser recebido:");
                        float recebeValor = leitura.nextFloat();
                        saldoConta += recebeValor;
                        System.out.println(String.format("Saldo atualizado: R$ %.2f", saldoConta));
                        break;
                    case 3:
                        //Transferir Valor
                        System.out.println("Informe o valor que deseja transferir:");
                        float enviaValor = leitura.nextFloat();
                        if (enviaValor <= saldoConta) {
                            saldoConta -= enviaValor;
                            System.out.println(String.format("Saldo atualizado: R$ %.2f", saldoConta));
                        } else {
                            System.out.println("Não há saldo suficiente para fazer essa transferência.");
                        }
                        break;
                    case 4:
                        System.out.println("Sistema encerrado com sucesso!");
                        break;
                    default:
                        System.out.println("OPÇÃO INVÁLIDA!!");
                        break;
                }

        }
    }

}