import java.awt.*;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
       //Person ruth = new Person();
       //// change the values
       //ruth.height=2.8;
       //ruth.hairColor = "red";
       //// print the value
       //if (ruth.hairColor.equals("black")){

       //    System.out.println(ruth.hairColor);
       //    System.out.println(ruth.eyesColor);
       //    System.out.println(ruth.weight);
       //    System.out.println(ruth.height);
       //    System.out.println(ruth.skinColor);
       //}



       //Random rand = new Random();
       //LocalDateTime time = LocalDateTime.now();

        //Color c1 = new Color(0, 231, 255, 255);

       // Car NaomiCar= new Car("ford","mustang GT",
       //         "gray with one white strip" ,4 ,760,2022);
       // //NaomiCar.make= "ford";
       // //NaomiCar.model = "mustang GT";
       // //NaomiCar.hp= 760;
       // System.out.println("naomi carrrr -*-----*-*-*-----*--*-*-*-*/");
       // System.out.println(NaomiCar.make);
       // System.out.println(NaomiCar.model);
       // System.out.println(NaomiCar.numberOfWheels);
       // System.out.println(NaomiCar.hp);
       // System.out.println(NaomiCar.year);
       // System.out.println(NaomiCar.color);
//
       //Car OryaCar = new Car("seat","ibiza","white",4,115,2022);
       //System.out.println("orya carrrr -*-----*-*-*-----*--*-*-*-*/");
       //System.out.println(OryaCar.make);
       //System.out.println(OryaCar.model);
       //System.out.println(OryaCar.numberOfWheels);
       //System.out.println(OryaCar.hp);
       //System.out.println(OryaCar.color);
       //System.out.println(OryaCar.year);
//
       //Car hodiCar=new Car("seat","leon","balck",3,125,2021);
       //Car azizCAr=new Car("volvo","leon","balck",3,125,2017);
       //Car sashaCar=new Car("honda","leon","balck",3,125,2017);
       //Car danielCar=new Car("mg","leon","balck",3,125,2017);
       //Car yuriCar=new Car("toyota","leon","balck",3,125,2017);
//
//

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter a name ");
        String name = scanner.next();
        System.out.println("please enter a nickname ");
        String nickmname = scanner.next();
        System.out.println("please enter a age ");
        int age = scanner.nextInt();
        System.out.println("please enter a sound ");
        String sound = scanner.next();
        System.out.println("please enter a color");
        String color = scanner.next();

        Animal cat1= new Animal(name,nickmname,age,sound,color);
        Animal dog1 = new Animal("puma","pooooo",5,"hooww hoow",
                "black");

        System.out.println(cat1);
        System.out.println(dog1);


        //System.out.println(cat1.name);
        //System.out.println(cat1.nickname);
        //System.out.println(cat1.age);
        //System.out.println(cat1.sound);
        //System.out.println(cat1.color);
//
        //System.out.println(dog1.name);
        //System.out.println(dog1.nickname);
        //System.out.println(dog1.age);
        //System.out.println(dog1.sound);
        //System.out.println(dog1.color);

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("bob","bbboo",17,"hooow hoooow ","brown");
        animals[1] = new Animal("hatool","bbssfboo",17,"meow mewo ","brown");
        animals[2] = new Animal("puma","sss",17,"hooow hoooow ","brown");


    }
}
