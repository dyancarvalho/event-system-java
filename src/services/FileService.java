package services;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileService {

    public static void saveToFile(List<String> users) {
        try (FileWriter writer = new FileWriter("C:\\Users\\Dyanz\\OneDrive\\Documentos\\Documentos\\dados.txt")) {
            writer.write(String.valueOf(users));
            System.out.println("Dados salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados no arquivo: " + e.getMessage());
        }
    }
}

