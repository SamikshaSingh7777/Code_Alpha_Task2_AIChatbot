import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AIChatbot {

    public static void main(String[] args) {

        JFrame frame = new JFrame("AI Chatbot");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JTextArea chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);

        JTextField inputField = new JTextField();
        JButton sendButton = new JButton("Send");

        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(inputField, BorderLayout.CENTER);
        bottomPanel.add(sendButton, BorderLayout.EAST);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        chatArea.append("Bot: Hello! I am your AI Chatbot 😊\n");

        sendButton.addActionListener(e -> {
            String userText = inputField.getText().toLowerCase();
            chatArea.append("You: " + userText + "\n");

            String response = getBotResponse(userText);
            chatArea.append("Bot: " + response + "\n\n");

            inputField.setText("");
        });

        frame.setVisible(true);
    }

    // Rule-based NLP logic
    static String getBotResponse(String input) {

        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I help you?";
        } 
        else if (input.contains("name")) {
            return "I am a Java AI Chatbot.";
        } 
        else if (input.contains("how are you")) {
            return "I'm doing great! Thanks for asking 😊";
        } 
        else if (input.contains("java")) {
            return "Java is a powerful object-oriented programming language.";
        } 
        else if (input.contains("internship")) {
            return "This chatbot is built for internship learning purposes.";
        } 
        else if (input.contains("bye")) {
            return "Goodbye! Have a great day 👋";
        } 
        else {
            return "Sorry, I didn't understand that. Please try again.";
        }
    }
}