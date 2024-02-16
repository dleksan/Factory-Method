public class Car implements Vehicle {
    private double weight;
    private double horsePower;
    private double fuelPer100km;
    private String model;

    public Car(double weight,double horsePower,double fuelPer100km,String model)
    {
        this.weight=weight;
        this.horsePower=horsePower;
        this.fuelPer100km=fuelPer100km;
        this.model=model;
    }

    @Override
    public void printModel() {
        System.out.print(model);
    }

    @Override
    public double calculateFuelConsumption(double distanceDriven) {
        return fuelPer100km/100*distanceDriven;
    }


    @Override
    public double calculateAccelerationTime(double startingVelocity, double finalVelocity) {
        double wattsPower=this.horsePower*745.7;

        double force=wattsPower/((finalVelocity-startingVelocity)/3.6);


        double acceleration= force/(this.weight);

        double time=((finalVelocity-startingVelocity)/3.6)/acceleration;

        return time;

    }
}
