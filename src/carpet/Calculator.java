package carpet;


public class Calculator {Floor floor;
    Carpet carpet;

    Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return floor.length * floor.width * carpet.cost;
    }
}