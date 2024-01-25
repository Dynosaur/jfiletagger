import java.awt.EventQueue;

class FileTagger {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        EventQueue.invokeLater(new Thread(() -> new GUI()));

        System.out.println("Success");
    }
}
