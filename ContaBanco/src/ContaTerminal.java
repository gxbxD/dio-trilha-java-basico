import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        try (Scanner scanner = new Scanner(System.in)) {
            //Exibir as mensagens para o nosso usuário
            //Obter pela scanner os valores digitados no terminal
            
            System.out.println("Por favor, digite o número da conta:");
            int numero = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer
            
            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.nextLine();
            
            
            System.out.println("Por favor, digite o nome do cliente:");
            String nomeCliente = scanner.nextLine();
            
            System.out.println("Por favor digite o valor que deseja depositar:");
            double saldo = scanner.nextDouble();
            
            //Exibir a mensagem conta criada
            
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        }

    }
}
