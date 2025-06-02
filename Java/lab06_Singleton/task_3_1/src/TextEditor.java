import java.io.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;

public class TextEditor {
    public TextEditor() {
    }

    private static TextEditor instance = null;
    public static TextEditor getInstance() {
        if (instance == null){
            Lock lock = new ReentrantLock();
            lock.lock();
            if (instance == null) {
                System.out.println("Creating new instance of TextEditor");
                instance = new TextEditor();
            }
            lock.unlock();
        }
        return instance;
    }

    public String readTextFile(String filePath){
        StringBuilder content = new StringBuilder();
        try {
            File file = new File(filePath);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                content.append(data).append(System.lineSeparator());
            }
            reader.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return content.toString();
    }

    public void writeTextFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}
