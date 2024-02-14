import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CloneFile {
    private static ArrayList<Integer> file = new ArrayList<Integer>();

    public static void dosyaOku() throws FileException, IOException {
        try {
            FileInputStream in = new FileInputStream(dosyaAdıAl());
            int oku;
            while ((oku = in.read()) != -1) {
                file.add(oku);
            }
        } catch (FileNotFoundException e) {
            throw new FileException();
        } catch (IOException e) {
            throw new IOException();
        }
    }

    public static void dosyaKopyala(String DosyaAd) throws FileException, IOException {
        try {
            FileOutputStream out = new FileOutputStream(DosyaAd);
            for (int deger : file) {
                out.write(deger);
            }
        } catch (FileNotFoundException e) {
            throw new FileException();
        } catch (IOException e) {
            throw new IOException();
        }
    }

    public static String dosyaAdıAl() {
        System.out.println("Kullanacaginiz Islem Icin Dosya Adi Giriniz...");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        return fileName;
    }

    public static void main(String[] args) throws FileException, IOException {
        dosyaOku();
        dosyaKopyala(dosyaAdıAl());
    }
}
