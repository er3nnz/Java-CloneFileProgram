public class FileException extends Exception {
    public FileException() {
    }

    public void printStackTrace() {
        System.out.println("Lutfen Girdiğiniz Dosya Adına Dikkat Ediniz...");
    }
}
