import controllers.UserController;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import models.User;
import services.FileService;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("1 - Criar novo usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Deletar usuário");
            System.out.println("4 - Criar novo evento");
            System.out.println("5 - Listar eventos");
            System.out.println("6 - Deletar evento");
            System.out.println("0 - Sair do programa");

            System.out.print("Qual operação deseja realizar? ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    String path = "dados_user.txt";
                    List<User> users = UserController.createUsers(scanner);
                    FileService.saveUsersToFile(users, path);
                break;
                case 2:
                    System.out.println("Listar Usuários");
                    break;
                case 3:
                    System.out.println("Deletar Usuário");
                    break;
                case 4:
                    System.out.println("Criar Evento");
                    break;
                case 5:
                    System.out.println("Listar Eventos");
                    break;
                case 6:
                    System.out.println("Deletar Evento");
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }

            //FileService.saveToFile();

        }
        scanner.close();
    }
}