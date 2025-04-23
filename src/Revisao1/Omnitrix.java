package Revisao1;

public class Omnitrix {
    Name alien;

    public Omnitrix(Name alien) {
        this.alien = alien;
    }

    public void transformIn() {
        System.out.println("Transformando em: " + alien);
        switch (alien) {
            case FOUR_ARMS:
                System.out.println("Super strength activated!");
                break;
            case XLR8:
                System.out.println("Extreme speed!");
                break;
            case HEATBLAST:
                System.out.println("fire in everything!");
                break;
            default:
                System.out.println("Unknown power...");
        }
    }
}
