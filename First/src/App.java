import java.lang.reflect.Array;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        /*
         * //1.1
         * System.out.println("Yair Lavie");
         * System.out.println("15");
         * System.out.println("Playing games");
         * 
         * 
         * 
         * //1.2
         * int Num =12;
         * System.out.println(Num);
         * String Name= "Yair Lavie";
         * System.out.println(Name);
         * String Age= "15";
         * System.out.println(Age);
         * String Likes= "Playing games";
         * System.out.println(Likes);
         * 
         * 
         * 
         * //1.3
         * int x = 4;
         * int y = 7;
         * System.out.println(x*y);
         * System.out.println(x/y);
         * System.out.println(x+y);
         * System.out.println(x-y);
         * 
         * 
         * 
         * 
         * //2.1
         * System.out.print("enter your age: ");
         * int age=input.nextInt();
         * if (age>18){
         * System.out.println("Access granted");
         * 
         * }
         * else{
         * System.out.println("Access Denied");
         * }
         * 
         * 
         * System.out.print("enter height(in meters): ");
         * int height=input.nextInt();
         * if (height>1.5){
         * System.out.println("Access granted");
         * 
         * }
         * else{
         * System.out.println("Access Denied");
         * }
         * 
         * 
         * System.out.print("enter a number: ");
         * int Num2=input.nextInt();
         * if (Num2%2==0){
         * System.out.println("even");
         * 
         * }
         * else{
         * System.out.println("odd");
         * }
         * 
         * 
         * System.out.print("guesse a number: ");
         * int Num3=input.nextInt();
         * int Num4=15;
         * if (Num3==Num4){
         * System.out.println("correct");
         * 
         * }
         * else{
         * System.out.println("not correct");
         * }
         * 
         * 
         * //2.2
         * System.out.print("enter a age: ");
         * int age2=input.nextInt();
         * 
         * if (age2<0 || age2>110){
         * System.out.println("age not appropriated");
         * 
         * }
         * 
         * else{
         * if(age>60){
         * if (age%2==0){
         * System.out.println("old with even age");
         * }
         * else{
         * System.out.println("old with odd age");
         * }
         * }
         * 
         * else{
         * System.out.println("young");
         * 
         * }
         * }
         * 
         * System.out.print("enter a age: ");
         * int age3=input.nextInt();
         * System.out.print("enter a name: ");
         * String name2=input.next();
         * 
         * if (name2=="yair" && age3==15){
         * System.out.println("Hey we have a lot in common");
         * }
         * 
         * else{
         * System.out.println("Hello");
         * 
         * }
         * 
         * //2.3
         * System.out.print("enter a number: ");
         * int Num5=input.nextInt();
         * 
         * 
         * while (Num5!=-1) {
         * System.out.println(Num5+1);
         * System.out.print("enter a number: ");
         * Num5=input.nextInt();
         * 
         * }
         * 
         * 
         * //2.4
         * System.out.print("enter a number: ");
         * int Num6=input.nextInt();
         * for (int num=1;num<Num6+1;num++){
         * System.out.println(num);
         * }
         * 
         * 
         * for (int num=1;num<101;num++){
         * if (num%7==0){
         * System.out.println("boom");
         * }
         * else{
         * System.out.println(num);
         * }
         * 
         * 
         * }
         * 
         * 
         * //3.1
         * String name="grrr";
         * First(name);
         * 
         * 
         * int num7=12;
         * int[] arr={1,12,321,4,1312,32,12,14,12,423,321,423,12,124};
         * 
         * 
         * System.out.println(Second(num7,arr));
         * 
         * int[] arr2=new int[14];
         * System.out.println(Third(arr, arr2));
         * 
         * int NUM=2;
         * System.out.println(SevenBoom(NUM));
         * 
         * 
         * 
         * //3.2
         * int NUM1=input.nextInt();
         * int NUM2=input.nextInt();
         * int NUM3=input.nextInt();
         * 
         * 
         * 
         * System.out.println(Biggest(NUM1,NUM2,NUM3));
         * 
         * 
         * for (int num=0;num<10;num++){
         * NUM1=input.nextInt();
         * NUM2=input.nextInt();
         * NUM3=input.nextInt();
         * 
         * 
         * 
         * System.out.println(Biggest(NUM1,NUM2,NUM3));
         * 
         * }
         * 
         * //4.1
         * int[] ARR=new int[14];
         * int[] arr={7,2,3,4,6,54,342};
         * for (int num=0;num<arr.length;num++){
         * System.out.println(arr[num]);
         * }
         

        Dog sheep = new Dog("white", 2.1, "Louis");

        Dog dog = new Dog("black", "Sioul");

        sheep.Grow();
        dog.Grow();

        System.out.println(dog.getColor());
        System.out.println(dog.getAge());
        System.out.println(dog.getName());
        dog.setColor("blue");
        dog.setAge(4.7);
        dog.setName("ahmed");
        System.out.println(dog.getColor());
        System.out.println(dog.getAge());
        System.out.println(dog.getName());
       
        // 5.1

        Robot robot1 = new Robot(23.0, 10.0, 5.0, "louis", 30.0);
        Robot robot2 = new Robot(10.0, 50.0, 1.0, "Louis", 10.0);
        Robot robot3 = new Robot(43.0, 20.0, 2.0, "louiS", 20.0);
        
        if (robot1.getWeight()>robot2.getWeight()){
            if (robot1.getWeight()>robot3.getWeight()){
                System.out.print("the most heavy robot is: ");
                robot1.doString();
                System.out.println(" ");
            }
            else{
                System.out.print("the most heavy robot is: ");
                robot3.doString();
                System.out.println(" ");
            }
        }
        else{
            if (robot2.getWeight()>robot3.getWeight()){
                System.out.print("the most heavy robot is: ");
                robot2.doString();
                System.out.println(" ");
            }
            else{
                System.out.print("the most heavy robot is: ");
                robot3.doString();
                System.out.println(" ");
            }
        }

        if (robot1.Volume()>robot2.Volume()){
            if (robot1.Volume()>robot3.Volume()){
                System.out.print("the biggest robot is: ");
                robot1.doString();
                System.out.println(" ");
            }
            else{
                System.out.print("the biggest robot is: ");
                robot3.doString();
                System.out.println(" ");
            }
        }
        else{
            if (robot2.Volume()>robot3.Volume()){
                System.out.print("the biggest robot is: ");
                robot2.doString();
                System.out.println(" ");
            }
            else{
                System.out.print("the biggest robot is: ");
                robot3.doString();
                System.out.println(" ");
            }
        }
        

        // 5.2
        Motor motor= new Motor(20.0,50.0,10);

        System.out.println(motor.Dollars());
        System.out.println(motor.moneyEarned());
        System.out.println(motor.rotationSeconds());

        motor.setSpeed(10.4);
        System.out.println(motor.getSpeed());
        motor.setCost(2.7);
        System.out.println(motor.getCost());
        motor.setBought(3);
        System.out.println(motor.getBought());
    
        System.out.println(motor.Dollars());
        System.out.println(motor.moneyEarned());
        System.out.println(motor.rotationSeconds());
        */

        Motor motor1= new Motor("motor1",20.0,50.0,10);
        Motor motor2= new Motor("motor2",10.0,30.0,80);
        Motor motor3= new Motor("motor3",0.5,62.0,100);

        if (motor1.getBought()>motor2.getBought()){
            if (motor1.getBought()>motor3.getBought()){
                System.out.print("the robot that is bought the most is: ");
                motor1.doString();
                System.out.println(" ");
            }
            else{
                System.out.print("the robot that is bought the most is: ");
                motor3.doString();
                System.out.println(" ");
            }
        }
        else{
            if (motor2.getBought()>motor3.getBought()){
                System.out.print("the robot that is bought the most is: ");
                motor1.doString();
                System.out.println(" ");
            }
            else{
                System.out.print("the robot that is bought the most is: ");
                motor3.doString();
                System.out.println(" ");
            }
        }


        // 5.3






        

    }

    public static String First(String name) {
        System.out.println("***");
        System.out.println("***");
        System.out.println("***");
        return name;
    }

    public static int Second(int num, int[] arr) {
        int waser = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                waser += 1;
            }
        }
        return waser;
    }

    public static int[] Third(int[] arr, int[] arr2) {

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[13 - i];
        }

        return arr2;

    }

    public static int SevenBoom(int NUM) {

        for (int num = 1; num < 100; num++) {
            if (num % 7 == 0) {
                System.out.println("boom");
            } else {
                System.out.println(num);
            }
        }
        return NUM * 100;

    }

    public static int Biggest(int num1, int num2, int num3) {
        if (num1 < num2) {
            if (num2 < num3) {
                return num3;
            } else {
                return num2;
            }
        } else {
            if (num1 < num3) {
                return num3;
            } else {
                return num1;
            }
        }

    }

}
