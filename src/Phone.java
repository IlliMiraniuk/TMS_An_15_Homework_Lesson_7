public class Phone {
    String number;
    String model;
    int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(int weight, String number, String model) {
        this(number,model);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void receiveCall(String name) {
        System.out.println("Incoming call " + name);

    }
    public String getNumber() {
        return   "Subscriber number: " + number;
    }
    public void receiveCall(String name, String number) {
        System.out.println("Incoming call " + name);
        System.out.println("Subscriber number: " + number);
    }
    public void sendMessage(String number){
        System.out.println("Sending a message: " + number);
    }

}
