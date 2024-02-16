import java.util.List;

public abstract class VehicleCreator {

    protected double weight;
    protected double cargoWeight;
    protected double horsePower;
    protected double fuelPer100km;
    protected String model;

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public void setFuelPer100km(double fuelPer100km) {
        this.fuelPer100km = fuelPer100km;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract Vehicle createVehicle();

}//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
