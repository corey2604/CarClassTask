public class Main {

    public static void main(String[] args) {
        Engine v = new Engine("Honda","Petrol", 12.5f, 14.5f, 15.5f);
        Vehicle w = new Vehicle("Car", "Ford", "Fiesta", v);
        Engine x = new Engine("Honda","Petrol", 12.5f, 14.5f, 15.5f);
        Vehicle y = new Vehicle("Car", "Nissan", "Micra", x);
        //Testing that methods return correct values
        System.out.println("Vehicle w is "+w.GetDescription());
        System.out.println("Vehicle y is "+y.GetDescription());
        System.out.println("Engine v is "+v.GetEngine());
        System.out.println("Engine x is "+x.GetEngine());
        System.out.println();
        //Testing that engine x is updated but v remains the same
        x.UpdateEngine("Nissan","Diesel", 24.5f, 18.5f, 20.5f);
        System.out.println("Engine v is "+v.GetEngine());
        System.out.println("Engine x is "+x.GetEngine());
    }
}
