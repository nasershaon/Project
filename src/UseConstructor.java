import javax.swing.plaf.multi.MultiSeparatorUI;

public class UseConstructor {

        String name;
        String address;
        int age;
        double height;
        //default con
        UseConstructor(){
            System.out.println("This is Def Constructor");

        }
        //Paraameter

        public UseConstructor(String name, String address){
                this.name=name;
                this.address=address;
                System.out.println("name is "+name+" "+ "Address Is "+ address);
        }
        public UseConstructor(String name, String address, int age){
                this.name=name;
                this.address=address;
                this.age=age;
                System.out.println("Name Is "+ name+" "+ "My Address is "+address+" "+age);

        }
        public UseConstructor(String name, String address, int age, double height){
                this.name=name;
                this.address=address;
                this.age=age;
                System.out.println("Name Is "+ name+" "+ "My Address is "+address+" My Age is "+age+" "+"My Height "+height);

        }

        public static void main(String[] args) {
                UseConstructor Guy1= new UseConstructor();
                UseConstructor Guy2= new UseConstructor("Mark","Brooklyn");
                UseConstructor  Guy3= new UseConstructor("Steve","Queens",35);
                UseConstructor Guy4 = new UseConstructor("mark", "Brooklyn, 35, 6.5");
        }

}

