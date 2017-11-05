public class Person implements PersonInterface {
    String name = "Tareq";
    double age = 30;
    double stomic = 10;

    public double getPersonAge() {
        return age;
    }
    public void printInfo() {
        System.out.println("Name is: " + name + " , and the age is: " + age);
    }
    public void feedPerson() {
        stomic += 5;



        System.out.println("I am still hungry my stomic is " + stomic + "% full.");
    }
    public int getId(){
        return ID;
    }

    public static void main(String[] args) {
        Person person = new Person();

        person.printInfo();
        person.feedPerson();
    }
}
