package org.tensorflow.lite.examples.classification;

public class Species {
    private int id;
    private String nameLatim;
    private String namePortuguese;
    private String description;
    private String imageURL;
    private String rarity;
    private boolean wasFound;

    public Species(int id, String nameLatim, String namePortuguese, String description, String imageURL, String rarity, boolean wasFound) {
        this.id = id;
        this.nameLatim = nameLatim;
        this.namePortuguese = namePortuguese;
        this.description = description;
        this.imageURL = imageURL;
        this.rarity = rarity;
        this.wasFound = wasFound;
    }

    @Override
    public String toString() {
        return "Species{" +
                "id=" + id +
                ", nameLatim='" + nameLatim + '\'' +
                ", namePortuguese='" + namePortuguese + '\'' +
                ", description='" + description + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", rarity='" + rarity + '\'' +
                ", wasFound=" + wasFound +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getNameLatim() {
        return nameLatim;
    }

    public String getNamePortuguese() {
        return namePortuguese;
    }

    public String getDescription() {
        return description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getRarity() {
        return rarity;
    }

    public boolean getWasFound() {
        return wasFound;
    }
}
