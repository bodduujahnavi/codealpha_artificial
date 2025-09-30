import java.util.HashMap;

public class KnowledgeBase {
    private final HashMap<String, String> faq;

    public KnowledgeBase() {
        faq = new HashMap<>();
        loadFAQs();
    }

    private void loadFAQs() {
        faq.put("hi", "Hello! How can I help you today?");
        faq.put("hello", "Hi there! What would you like to know?");
        faq.put("what is your name", "I'm your virtual assistant chatbot.");
        faq.put("how are you", "I'm just a bunch of code, but I'm functioning as expected!");
        faq.put("what can you do", "I can chat with you and answer common questions.");
        faq.put("bye", "Goodbye! Have a great day.");
    }

    public String getAnswer(String input) {
        for (String key : faq.keySet()) {
            if (input.contains(key)) {
                return faq.get(key);
            }
        }
        return "Sorry, I didn't understand that. Can you rephrase?";
    }
}
