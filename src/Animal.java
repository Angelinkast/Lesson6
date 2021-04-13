public class Animal {
    protected String name;
    protected String color;
    protected int age;

    Animal(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }


    public void animalRun(int x){
        System.out.println(name + " ran " + x + " m");
    }

    public void animalSwim(int y){
        System.out.println(name + " swam " + y + " m");
    }
}
