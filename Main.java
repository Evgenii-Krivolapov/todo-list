package practice;

import java.util.Scanner;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        for(;;) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] commandString = input.split(" ");
            String text = "";
            if (commandString[0].equals("ADD") && commandString[1].matches("[^0-9]+")) {
                for (int i = 1; i < commandString.length; i++) {
                    text += commandString[i] + " ";
                }
                todoList.add(text);
                System.out.print("Добавлено дело " + text);
            }
            if (commandString[0].equals("ADD") && commandString[1].matches("[0-9]+")) {
                for (int i = 2; i < commandString.length; i++) {
                    text += commandString[i] + " ";
                }
                todoList.add(Integer.parseInt(commandString[1]), text);
                System.out.print("Добавленое дело "+ text);
            }
            if (commandString[0].equals("LIST")) {
                for (int i = 0; i < todoList.getTodos().size(); i++) {
                    System.out.println(i + " - " + todoList.getTodos().get(i));
                }
            }
            if (commandString[0].equals("EDIT")) {
                for (int i = 2; i < commandString.length; i++) {
                    text += commandString[i] + " ";
                }
                todoList.edit(Integer.parseInt(commandString[1]), text);
                System.out.print("Дело " + todoList.buy.get(Integer.parseInt(commandString[1])) + " заменено на " + text);
            }
            if (commandString[0].equals("DELETE")) {
                todoList.delete(Integer.parseInt(commandString[1]));
            }
        }
    }
}