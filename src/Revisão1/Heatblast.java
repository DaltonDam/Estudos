package Revisão1;

public class Heatblast extends Alien{
    public Heatblast(String name) {
        super(name);
    }

    @Override
    public void power() {
        System.out.println(name + " sparked a fire!");
    }

    @Override
    public void flying() {
        System.out.println(name + " is flying.");
    }
}
