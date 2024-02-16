public class TruckCreator extends VehicleCreator{

    public TruckCreator(double weight,double cargoWeight,double horsePower,double fuelPer100km,String model)
    {
        this.weight=weight;
        this.cargoWeight=cargoWeight;
        this.horsePower=horsePower;
        this.fuelPer100km=fuelPer100km;
        this.model=model;
    }

    public void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }
    @Override
    public Vehicle createVehicle() {
        return new Truck(weight,cargoWeight,horsePower,fuelPer100km,model);
    }
}
