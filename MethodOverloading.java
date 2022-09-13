class MethodOverloading {

    // this method accepts int
    void display(int pincode){
        System.out.println(pincode);
    }

    // this method  accepts String object
    void display(int pincode,String police_station){
        System.out.println(pincode);
        System.out.println(police_station);
    }
    
    void display(int pincode,String police_station,String city){
        System.out.println(pincode);
        System.out.println(police_station);
        System.out.println(city);
    }

    public static void main(String[] args) {
        MethodOverloading m1 = new MethodOverloading();
        m1.display(421401);
        m1.display(421401,"Murbad Police Station");
        m1.display(421401,"Murbad Police Station","Murbad");
    }
}