package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import models.User;
import services.FileService;


public class UserController {

    public static List<User> createUsers(Scanner scanner) {
        List<User> users = new ArrayList<>();
        
        while (true) {
            System.out.println("**Cadastro de Usuário**");

            System.out.print("ID do usuário: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            System.out.print("Nome do usuário: ");
            String name = scanner.nextLine();

            System.out.print("E-mail do usuário: ");
            String email = scanner.nextLine();

            System.out.print("Telefone do usuário: ");
            String phone = scanner.nextLine();
            scanner.nextLine();

            System.out.print("Documento do usuário: ");
            String document = scanner.nextLine();
            scanner.nextLine(); 
            
            User user = new User(id, name, email, phone, document);
            users.add(user);
            
            System.out.println("\nDeseja cadastrar outro usuário? (S/N)");
            String resposta = scanner.nextLine().toUpperCase();
            if (!resposta.equals("S")) {
                break;
            }
        }

        return users;
    }

    public static void listUsers() throws IOException {
        FileService.openFile();
    }


}
