public class Car extends Vehicle
{
    private int seatCapacity;
    
    public Car(String regNo, String owner, int seatCapacity){
        super(regNo,owner);        
        this.seatCapacity = seatCapacity;
    }  
    public int getSeatCapacity() {return seatCapacity;
    }
    public void setSeatCapacity(int seatCapacity) {this.seatCapacity = seatCapacity;
    }    
    public String toString() {
        return "Car"+ this.regNo+" owned by "+this.owner+" and seatCapacity <"+this.getSeatCapacity();
    }        
}