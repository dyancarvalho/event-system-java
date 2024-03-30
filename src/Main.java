import controllers.EventController;
import controllers.UserController;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import models.Event;
import models.User;
import services.FileService;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("1 - Criar novo usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Criar novo evento");
            System.out.println("4 - Listar eventos");
            System.out.println("0 - Sair do programa");

            System.out.print("Qual operação deseja realizar? ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    String pathFileDataUser = "dados_user.txt";
                    List<User> users = UserController.createUsers(scanner);
                    FileService.saveUsersToFile(users, pathFileDataUser);
                break;
                case 2:
                    UserController.listUsers();
                    break;
                case 3:
                    String pathFileDataEvent = "dados_event.txt";
                    List<Event> events = EventController.createEvent(scanner);
                    FileService.saveEventsToFile(events, pathFileDataEvent);
                case 4:
                    EventController.listEvents();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        scanner.close();
    }
}