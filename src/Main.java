public class Main {

    public static void main(String[] args) {
        Engine v = new Engine("Honda","Petrol", 12.5f, 14.5f, 15.5f);
        Vehicle w = new Vehicle("Car", "Ford", "Fiesta", v);
        //System.out.println(v.VehicleName + " " + v.Engine);
        //v.intoEngine("Honda", "Petrol", "14.50", "12.50", "11.50");
        //System.out.println(v.VehicleName+" "+v.Engine);
        System.out.println(w.GetDescription());
        System.out.println(v.GetEngine());
    }
}
