public class Bus extends Vehicle
{
    public int sittingCapacity;
    public int standingCapacity;

    public Bus(String regNo, String owner,int sittingCapacity, int standingCapacity) 
    {
        super(regNo,owner);
        this.sittingCapacity = sittingCapacity;
        this.standingCapacity = standingCapacity;
    }
    public int getSittingCapacity() {return sittingCapacity;
    }
    public int getStandingCapacity() {return standingCapacity;
    }    
    public void setSittingCapacity(int sittingCapacity) {this.sittingCapacity = sittingCapacity;
    }
    public void setStandingCapacity(int standingCapacity) {this.standingCapacity = standingCapacity;
    }
    public String toString() {
        return  "No bus "+regNo+" Owned by "+owner+" sitting capacity "+this.getSittingCapacity()+" & standing capacity " +this.getStandingCapacity();
    }
}