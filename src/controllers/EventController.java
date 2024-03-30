package controllers;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import models.Event;
import models.EventType;
import services.FileService;

public class EventController {

    public static List<Event> createEvent(Scanner scanner) {
        List<Event> events = new ArrayList<>();

        while (true) {
            System.out.println("**Cadastro de Evento**");

            System.out.print("ID do evento: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            System.out.print("Nome do criador: ");
            String user = scanner.nextLine();

            System.out.print("Nome do evento: ");
            String name = scanner.nextLine();

            System.out.print("Endereço do evento: ");
            String address = scanner.nextLine();

            System.out.print("Data do evento (Formato dd/MM/yyyy): ");
            String dateString = scanner.nextLine();
            Date date = null;
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                date = dateFormat.parse(dateString);
            } catch (ParseException e) {
                System.out.println("Formato de data inválido. Use o formato dd/MM/yyyy.");
                continue; // Volta ao início do loop para tentar novamente
            }

            System.out.print("Descrição do evento: ");
            String description = scanner.nextLine();

            System.out.print("Categoria do evento (PARTY, SPORT, SHOW, MEETING): ");
            EventType category = null;
            try {
                category = EventType.valueOf(scanner.nextLine().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Categoria inválida.");
                continue; // Volta ao início do loop para tentar novamente
            }

            Event event = new Event(id, user, name, address, date, description, category);
            events.add(event);

            System.out.println("\nDeseja cadastrar outro evento? (S/N)");
            String resposta = scanner.nextLine().toUpperCase();
            if (!resposta.equals("S")) {
                break;
            }
        }
        return events;
    }

    public static void listEvents() throws IOException {
        FileService.openEventsToFile();
    }

}

