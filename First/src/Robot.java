public class Robot {
    private Double weight;
    private Double length;
    private Double width;
    private String name;
    private Double hight;
    private Double Volume;

    public Robot(Double weight, Double length, Double width, String name, Double hight){
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.name = name;
        this.hight = hight;
    }

    public Double Volume(){
        this.Volume=this.hight+this.width+this.length;

        return this.Volume;
    }


    public Double getWeight(){
        return this.weight;
    }

    public void setWeight(Double weight){
        this.weight = weight;
    }


    public Double getLength(){
        return this.length;
    }

    public void setLength(Double length){
        this.length = length;
    }


    public Double getWidth(){
        return this.width;
    }

    public void setWidth(Double width){
        this.width = width;
    }


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }


    public Double getHight(){
        return this.hight;
    }

    public void setHight(Double hight){
        this.hight = hight;
    }

    public void doString(){
        System.out.println(this.name+", ");
        System.out.print(this.hight+", ");
        System.out.print(this.length+", ");
        System.out.print(this.weight+", ");
        System.out.print(this.width);

    }
    
    
}
