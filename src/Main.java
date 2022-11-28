import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<music> allData = new ArrayList<>();
        musicVideo no1Vid = new musicVideo("Baby Shark Dance", 11.74f, "June 17, 2016", 1, "Pinkfong Baby Shark - Kids' Songs & Stories");
allData.add(no1Vid);
        for (music data : allData) {
            data.describeSelf();
        }
    }
}
