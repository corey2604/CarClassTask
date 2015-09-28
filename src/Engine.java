/**
 * Created with IntelliJ IDEA.
 * User: kuser
 * Date: 28/09/15
 * Time: 11:47
 * To change this template use File | Settings | File Templates.
 */


import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Engine {
    String brand;
    String Fuel_Type;
    Float Capacity;
    Float Width;
    Float Height;
    String UpdateTime;

    public Engine(String brand, String Fuel_Type,Float Capacity, Float Width, Float Height){
        this.brand=brand;
        this.Fuel_Type=Fuel_Type;
        this.Capacity=Capacity;
        this.Width=Width;
        this.Height=Height;
    }
    public void UpdateEngine(String brand, String Fuel_Type, Float Capacity, Float Width, Float Height){
        this.brand=brand;
        this.Fuel_Type=Fuel_Type;
        this.Capacity=Capacity;
        this.Width=Width;
        this.Height=Height;
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        UpdateTime = dateFormat.format(date);
    }
    public String GetEngine(){
        return (brand+" "+Fuel_Type+" "+Capacity+" "+Width+" "+Height);
    }
}
