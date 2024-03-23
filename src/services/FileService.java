package services;

import java.io.*;
import java.util.List;
import models.User;

public class FileService {

    public static void saveUsersToFile(List<User> users, String path) throws IOException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Dyanz\\OneDrive\\Documentos\\dados_user.txt", true))) {
            for (User user : users) {
                writer.write("Id: " + user.getId() + "\n" +
                        "Nome: " + user.getName() + "\n" +
                        "Email: " + user.getEmail() + "\n" +
                        "Telefone: " + user.getPhone() + "\n" +
                        "CPF: " + user.getDocument() + "\n\n\""
                );
                writer.newLine();
            }
            writer.close();
            System.out.println("Dados dos usuários salvos com sucesso.");

        } catch (IOException e) {
            System.out.println("Erro ao salvar dados dos usuários: " + e.getMessage());
        }
    }
}
