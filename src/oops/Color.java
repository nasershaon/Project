package oops;

public class Color extends Iphone implements PhoneInter{
        public static void main(String[]args){

        }

    @Override
    public void cameraFeature() {
            int numberOfCamera=2;
            int numberOfLens=3;
        System.out.println("iphone Camera Have "+numberOfCamera+" "+numberOfLens);

    }

    @Override
    public String mobileModel() {
            String name= "Iphone 12";
        System.out.println("Most Powerful Phone is "+name);
        return name;
    }

    @Override
    public int buttonNumber() {
            int numButton = 3;
        System.out.println("Number of Button "+numButton);
        return numButton;
    }

    @Override
    public void chargingPort() {
            String charger= "wireless Charger";
            int numberOfPort=1;
        System.out.println("Main Charger port "+charger+" "+numberOfPort);

    }

    @Override
    public void fontCamera() {
            double lensPower= 12.6;
        System.out.println("Font Camera Have  "+lensPower);

    }
}
