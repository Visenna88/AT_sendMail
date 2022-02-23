public class Phone {
    private int number;
    private double weight;
    private String model;

    Phone(int number, double weight, String model){
       this.number = number;
        this.weight = weight;
        this.model = model;
    }

    Phone(int number, String model){
        this.number = number;
        this.model = model;
    }

    Phone(){}




    void modelData(){
        System.out.println("The number is: " + number);
        System.out.println("The weight is: " + weight);
        System.out.println("The model is: " + model);
    }

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }


    public void getNumber() {
        System.out.println(number);
    }
}
