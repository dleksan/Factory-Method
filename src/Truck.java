public class Truck implements Vehicle{

    private double weight;
    private double cargoWeight;
    private double horsePower;
    private double fuelPer100km;
    private String model;

    public Truck(double weight,double cargoWeight,double horsePower,double fuelPer100km,String model)
    {
        this.weight=weight;
        this.cargoWeight=cargoWeight;
        this.horsePower=horsePower;
        this.fuelPer100km=fuelPer100km;
        this.model=model;
    }

    @Override
    public void printModel()
    {
        System.out.print(model);
    }


    @Override
    public double calculateFuelConsumption(double distanceDriven) {

        //Assumed fuel that will be used when driving with cargo
        double cargoConsumption=cargoWeight/2000;

        return fuelPer100km/100*distanceDriven+cargoConsumption;
    }


    @Override
    public double calculateAccelerationTime(double startingVelocity, double finalVelocity) {

        double wattsPower=this.horsePower*745.7;

        double force=wattsPower/((finalVelocity-startingVelocity)/3.6);

        double acceleration= force/(this.weight+this.cargoWeight);

        double time=((finalVelocity-startingVelocity)/3.6)/acceleration;

        return time;

    }


}
