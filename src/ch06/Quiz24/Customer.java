package ch06.Quiz24;

public class Customer {
    private  String Name;
    private  String Phone;
    private  String Address;
    private  int Point;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getPoint() {
        return Point;
    }

    public void setPoint(int point) {
        Point = point;
    }

    public Customer(String Name, String Phone, String Address, int Point) {
        this.Name = Name;
        this.Phone = Phone;
        this.Address = Address;
        this.Point = Point;
    }


}
