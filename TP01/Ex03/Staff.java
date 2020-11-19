//Bruno Paranhos Silva  CB3005437

package tp01;

public class Staff extends Person{
    private String school;
    private double pay;
    
    // <editor-fold desc="Getters & Setters">
    
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    
    // </editor-fold>

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    
    @Override
    public String toString(){
        return "Staff[ " + super.toString() + ", school = " + school + ", pay = " + pay + " ]";
    }
}
