import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        musicVideo.readAllData();

       for (music data : music.getAllData()) {
           System.out.println(data);
       }
    }
}
