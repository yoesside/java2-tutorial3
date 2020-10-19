public class Vehicle {
    public String regNo;
    public String owner;

    public Vehicle(String regNo, String owner) {
        this.regNo = regNo;
        this.owner = owner;
    }
    public String getRegNo() {return regNo;
    }
    public String getOwner() {return owner;
    }
    public void setRegNo(String regNo) {this.regNo = regNo;
    }
    public void setOwner(String owner) {this.owner = owner;
    }
    public String toString() {
        return "reg number" + regNo + " owned by " + owner;
    }        
}
