import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8080"); // Control Plane endpoint
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            Scanner sc = new Scanner(conn.getInputStream());
            while(sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
            System.out.println("✅ Panel Admin conectado al Control Plane");
        } catch(Exception e) {
            System.out.println("❌ Error de conexión: " + e.getMessage());
        }
    }
}
