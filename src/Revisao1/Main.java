package Revisao1;

public class Main {
    public static void main(String[] args) {

        Alien heatblast = new Heatblast("Heatblast");
        Omnitrix omnitrix = new Omnitrix(Name.FOUR_ARMS);
        omnitrix.transformIn();

        heatblast.transform();
        heatblast.power();
        heatblast.flying();




    }
}
