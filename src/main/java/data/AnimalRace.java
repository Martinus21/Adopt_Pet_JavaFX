package data;

public class AnimalRace {
    private Animal type;
    private String race;

    public AnimalRace(Animal type, String race) {
        this.type = type;
        this.race = race;
    }

    public Animal getType() {
        return type;
    }

    public void setType(Animal type) {
        this.type = type;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
