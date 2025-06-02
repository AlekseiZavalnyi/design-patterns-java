public class Main {
    public static void main(String[] args) {
        TextEditor reader = TextEditor.getInstance();
        String text = reader.readTextFile("src\\text_from.txt");
        System.out.println("Reader address: " + reader.hashCode());
        System.out.println("Text from file: " + text);

        TextEditor editor = TextEditor.getInstance();
        editor.writeTextFile("src\\text_to.txt", "Hello World!");
        System.out.println("Editor address: " + editor.hashCode());
    }
}
