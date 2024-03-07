public abstract class Animal {

    private String specie;
    private String sex;
    private String name;

    public Animal(String specie, String sex, String name) {
        this.specie = specie;
        this.sex = sex;
        this.name = name;
    }

    public abstract void move();

    public abstract void stop();

    public abstract String toString();

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}