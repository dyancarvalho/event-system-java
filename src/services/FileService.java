package services;

import java.io.*;
import java.util.List;
import models.Event;
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

    public static void saveEventsToFile(List<Event> events, String path) throws IOException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Dyanz\\OneDrive\\Documentos\\dados_event.txt", true))) {
            for (Event event : events) {
                writer.write("Id: " + event.getId() + "\n" +
                        "Criador: " + event.getUser() + "\n" +
                        "Nome: " + event.getName() + "\n" +
                        "Endereço: " + event.getAddress() + "\n" +
                        "Data: " + event.getDate() + "\n" +
                        "Descrição: " + event.getDescription() + "\n" +
                        "Categoria: " + event.getCategory() + "\n\n\""
                );
                writer.newLine();
            }
            writer.close();
            System.out.println("Dados dos eventos salvos com sucesso.");

        } catch (IOException e) {
            System.out.println("Erro ao salvar dados dos eventos: " + e.getMessage());
        }
    }

    public static void openFile() throws IOException {

        try (FileReader fileReader = new FileReader("C:\\Users\\Dyanz\\OneDrive\\Documentos\\dados_user.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Erro ao abrir dados dos usuários: " + e.getMessage());
        }
    }

}
