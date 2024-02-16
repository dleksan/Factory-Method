// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Initialize a new car creator
        VehicleCreator carCreator=new CarCreator(1200,140,8,"Audi");

        //use it to create a car
        Vehicle AudiA4=carCreator.createVehicle();


        System.out.print("AudiA4 accelerates from 50 to 100 km/h in : "+AudiA4.calculateAccelerationTime(50,100) + " seconds");
        System.out.println();
        System.out.print("AudiA4 uses "+ AudiA4.calculateFuelConsumption(200) + " litres of fuel on 200 km");

        //Change parameters of the existing car creator
        carCreator.setModel("Opel");
        carCreator.setHorsePower(90);

        //Create a new car
        Vehicle OpelAstra=carCreator.createVehicle();
        System.out.print("\nNew car is an:");
        OpelAstra.printModel();


        
        //Initialize a new truck creator
        VehicleCreator truckCreator=new TruckCreator(6000,10000,480,20,"MAN");

        //Use it to create a truck
        Vehicle MAN_TGX= truckCreator.createVehicle();

        System.out.print("\nMAN_TGX uses "+ MAN_TGX.calculateFuelConsumption(200) + " litres of fuel on 200 km");

        //Change parameters of truck creator
        truckCreator.setHorsePower(320);
        truckCreator.setFuelPer100km(22);

        Vehicle MAN_TGI=truckCreator.createVehicle();

        System.out.print("\nMAN_TGI accelerates from 20 to 80 km/h in: "+ MAN_TGI.calculateAccelerationTime(20,80) + " seconds");




    }
}