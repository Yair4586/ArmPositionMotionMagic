public class Motor {
    private Double speed;
    private Double cost;
    private int bought;
    private String name;

    public Motor(String name,Double speed,Double cost, int bought){
        this.name = name;
        this.speed = speed;
        this.cost = cost;
        this.bought = bought;
        

    }

    public Double Dollars(){
        return this.cost*0.27;
    }

    public Double moneyEarned(){
        return this.cost*this.bought;
    }

    public Double rotationSeconds(){
        return this.speed/60;
    }


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }


    public Double getSpeed(){
        return this.speed;
    }

    public void setSpeed(Double speed){
        this.speed = speed;
    }


    public Double getCost(){
        return this.cost;
    }

    public void setCost(Double cost){
        this.cost = cost;
    }


    public int getBought(){
        return this.bought;
    }

    public void setBought(int bought){
        this.bought = bought;
    }


    public void doString(){
        System.out.print(this.name+", ");
        System.out.print(this.speed+", ");
        System.out.print(this.cost+", ");
        System.out.print(this.bought);
    }



    
}
