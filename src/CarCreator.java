public class CarCreator extends VehicleCreator {
    protected Vehicle vehicle;


    public CarCreator(double weight,double horsePower,double fuelPer100km,String model)
    {
        this.weight=weight;
        this.horsePower=horsePower;
        this.fuelPer100km=fuelPer100km;
        this.model=model;
    }
    @Override
    public Vehicle createVehicle() {
        return new Car(weight,horsePower,fuelPer100km,model);
    }
}
