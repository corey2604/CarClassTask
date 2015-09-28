/**
 * Created with IntelliJ IDEA.
 * User: kuser
 * Date: 28/09/15
 * Time: 10:15
 * To change this template use File | Settings | File Templates.
 */

import java.awt.print.Printable;

public class Vehicle {
    public String VehicleName;
    private String Brand;
    private String Model;
    private int Wheels;
    private Engine EngineVar;

    public Vehicle (String VehicleName, String Brand, String Model, Engine EngineVar){
        this.VehicleName = VehicleName;
        this.Brand = Brand;
        this.Model = Model;
        this.Wheels = Wheels;
        this.EngineVar= EngineVar;

        if ((Brand == "Suzuki") && (Model == "gsx")){
            this.Wheels=2;
        }
        else {
            this.Wheels=4;
        }
    }

    public Vehicle (String Brand, String Model){
        this.Brand = Brand;
        this.Model = Model;
    }


    public String GetDescription(){
        return Brand+" "+Model;
    }

}
