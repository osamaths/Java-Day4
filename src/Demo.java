public class Demo extends Sum{
    public float sumOfTwo(float num1, float num2){
        return num1+num2;
    }
    public float sumOfThree(float num1, float num2, float num3){
        return  num1 + num2 + num3;
    }
    public float sumOfFour (float num1, float num2, float num3, float num4) {
        return num1 + num2 + num3 + num4;
    }
}

interface PersonInterface {
    public double getPersonAge();
    public void printInfo();
    public void feedPerson();
    public int ID=127634;
    public abstract int getId();
}