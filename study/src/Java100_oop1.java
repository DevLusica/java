
class Person{
    private String name;
    private int age;
    private int height;
    private int weight;

    Person() {}
    Person( String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {return name;}
    public void setName( String name ) {this.name = name;}

    public int getAge() { return age;}
    public void setAge(int age) {this.age = age;}

    public int getHeight() { return height;}
    public void setHeight(int height) {this.height = height;}

    public int getWeight() { return weight;}
    public void setWeight(int weight) {this.weight = weight;}

    public void move() {
        System.out.println("moving...");
    }
}

class Villain extends Person{

    private String unique_key;
    private int weapon;
    private double power;

    Villain(){}
    Villain(String name, int age, int height, int weight, int weapon, String unique_key, int power) {
        super(name, age, height, weight);
        this.unique_key = unique_key;
        this.weapon = weapon;
        this.power = power;
    }

    public String getUnique_key() {return unique_key;}
    public void setUnique_key( String unique_key) { this.unique_key =  unique_key;}

    public int getWeapon() {return weapon;}
    public void setWeapon( int weapon) { this.weapon = weapon;}

    public double getPower() {return power;}
    public void setPower( double power) { this.power =  power;}

    public void printPerson() {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getHeight());
        System.out.println(getWeight());
        System.out.println(getUnique_key());
        System.out.println(getWeaponName(getWeapon()));
        System.out.println(getPower());
    }

    public String getWeaponName(int a) {
        String weapon;
        switch (a) {
            case 1:
                weapon = "chang";
                break;
            case 2:
                weapon = "bangpae";
                break;
            default:
                weapon = "--";
                break;
        }
        return weapon;
    }
}

class Hero extends Person{

}


public class Java100_oop1 {
    public static void main(String [] args) {
        Person p1 = new Person();
        p1.setName("Hong gil");
        System.out.println(p1.getName());
    }
}

