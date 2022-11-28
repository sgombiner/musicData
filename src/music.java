class music {
final private String name;
private float interactions;
final private String released;

    public music(String name, float interactions, String released) {
        this.name = name;
        this.interactions = interactions;
        this.released = released;
    }
        public void setInteractions(float interactions) {
            this.interactions = interactions;
        }

        public String getName() {
            return name;
        }

        public float getInteractions() {
            return interactions;
        }

        public String getReleased() {
            return released;
        }

}


