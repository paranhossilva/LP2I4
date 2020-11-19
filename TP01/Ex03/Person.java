//Bruno Paranhos Silva  CB3005437

package tp01;

abstract class Person {
    protected String name;
    protected String address;

    // <editor-fold desc="Getters & Setters">
     
    protected String getName() {
        return name;
    }

    protected String getAddress() {
        return address;
    }

    protected void setAddress(String address) {
        this.address = address;
    }
    
    // </editor-fold>
    
    protected Person(String name, String address){
        this.name = name;
        this.address = address;
    }
        
    public String toString(){
        return "Person[ name = " + name + ", address = " + address + " ]";
    }
}