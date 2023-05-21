class Plant {
    private String name;
    private String color;

    public Plant(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Accessors (Getters)
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    // Mutators (Setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Plant [name=" + name + ", color=" + color + "]";
    }
}

class Flower extends Plant {
    private boolean hasSmell;
    private boolean hasThorn;

    public Flower(String name, String color, boolean hasSmell, boolean hasThorn) {
        super(name, color);
        this.hasSmell = hasSmell;
        this.hasThorn = hasThorn;
    }

    // Accessors (Getters)
    public boolean hasSmell() {
        return hasSmell;
    }

    public boolean hasThorn() {
        return hasThorn;
    }

    // Mutators (Setters)
    public void setHasSmell(boolean hasSmell) {
        this.hasSmell = hasSmell;
    }

    public void setHasThorn(boolean hasThorn) {
        this.hasThorn = hasThorn;
    }

    @Override
    public String toString() {
        return "Flower [name=" + getName() + ", color=" + getColor() + ", hasSmell=" + hasSmell + ", hasThorn="
                + hasThorn + "]";
    }
}

class Herb extends Plant {
    private boolean isMedicinal;
    private String season;

    public Herb(String name, String color, boolean isMedicinal, String season) {
        super(name, color);
        this.isMedicinal = isMedicinal;
        this.season = season;
    }

    // Accessors (Getters)
    public boolean isMedicinal() {
        return isMedicinal;
    }

    public String getSeason() {
        return season;
    }

    // Mutators (Setters)
    public void setMedicinal(boolean isMedicinal) {
        this.isMedicinal = isMedicinal;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "Herb [name=" + getName() + ", color=" + getColor() + ", isMedicinal=" + isMedicinal + ", season="
                + season + "]";
    }
}