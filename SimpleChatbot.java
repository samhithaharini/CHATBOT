import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleChatbot {
    private static final Map<String, String> responses = new HashMap<>();

    static {
        responses.put("hi", "Hello! How can I help you?");
        responses.put("hello", "Hi there! What can I do for you?");
        responses.put("how are you?", "I'm just a computer program, but thanks for asking!");
        responses.put("what's your name?", "I'm a chatbot created to assist you.");
        responses.put("bye", "Goodbye! Have a great day!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot is ready! Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("bye")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }

            String response = getResponse(userInput);
            System.out.println("Chatbot: " + response);
        }

        scanner.close();
    }

    private static String getResponse(String input) {
        for (String key : responses.keySet()) {
            if (input.contains(key)) {
                return responses.get(key);
            }
        }
        return "I don't understand that.";
    }
}
