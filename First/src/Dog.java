public class Dog {
    

    private Double age;
    private String name;
    private String color;

    
    public Dog(String color, String name){
        this.color = color;
        this.age = 0.0;
        this.name = name;

    }
    
    public Dog(String color,Double age, String name){
        this.color = color;
        this.age = age;
        this.name = name;

    }

    public void Grow(){
        this.age++;
        System.out.println(age);
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Double getAge(){
        return this.age;
    }

    public void setAge(Double age){
        this.age = age;
    }

}
