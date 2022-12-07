public class song extends music {

    private String Artist;


    public song(String name, float interactions, String released, String artist) {
        super(name, interactions, released);
        Artist = artist;

    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }


    void describeSelf() {
        System.out.println(getName() + " was created by " + getArtist() + ". It was released in the year " + getReleased() + ". It had " + getInteractions() + "views." );
    }
}