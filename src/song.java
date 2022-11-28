public class song extends music {

    private String Artist;
    private int sales;

    public song(String name, float interactions, String released, String artist, int sales) {
        super(name, interactions, released);
        Artist = artist;
        this.sales = sales;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }
}
