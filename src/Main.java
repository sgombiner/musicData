import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new musicVideo("Baby Shark Dance", 11.74f, "June 17, 2016", 1, "Pinkfong Baby Shark - Kids' Songs & Stories");

        new song("White Christmas",50000000,"1942","Bing Crosby");
        for (music data : music.getAllData()) {
            System.out.println(data);
        }
    }
}
