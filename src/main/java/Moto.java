public class Moto extends Vehicle {

    private int cylindre;

    public Moto(String brand, int wheels, int cylindre) {
        super(brand, wheels);
        this.cylindre = cylindre;
    }

    public String noise() {
        return "brrrrrrrrrrrrrrrrr";
    }


    public int getCylindre() {
        return cylindre;
    }

    public void setCylindre(int cylindre) {
        this.cylindre = cylindre;
    }
}
