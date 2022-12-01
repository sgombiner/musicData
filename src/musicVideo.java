public class musicVideo extends music {
    final private String youtubeUploader;
    private int ranking;


    public musicVideo(String name, float interactions, String released, int ranking, String youtubeUploader) {
        super(name, interactions, released);
        this.setRanking(ranking);
        this.youtubeUploader = youtubeUploader;
    }

    public String getYoutubeUploader() {
        return youtubeUploader;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    void describeSelf() {
    //    super.describeSelf();
        System.out.println(getName() + " was ranked number " + ranking + " out off all music videos on youtube with " + getInteractions() + " billion views. It was uploaded on " + youtubeUploader + "‘s account on " + getReleased() + ".");
    }
}