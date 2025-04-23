package Revisao1;

abstract class Alien implements Fly{
    String name;

    public Alien(String name) {
        this.name = name;
    }

    public void transform() {
        System.out.println("Ben turned into " + name + ".");
    }

    public abstract void power();

}
