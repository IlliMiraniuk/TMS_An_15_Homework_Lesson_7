public class Phone_Sor {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+375292080822","iPhone 12", 190);
        Phone phone2 = new Phone("+375298787986","iPhone 12",200 );
        Phone phone3 = new Phone("+375337569147", "iPhone 13 mini",210);


        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString() + "\n");

        phone1.receiveCall("Tatyana");
        System.out.println(phone1.getNumber());
        phone1.receiveCall("Vitaliy");
        System.out.println(phone2.getNumber());
        phone1.receiveCall("Alex");
        System.out.println(phone3.getNumber() + "\n");

        phone1.sendMessage(phone1.number+ "\n"+phone2.number+"\n"+phone3.number);

    }

}
