package OOP.inheritance.hierarchy;

/**
 * Created by MBCNEWMAIN on 04.03.2016.
 */
public class Employee extends Person {
    protected String position;

    public Employee(){
        super();
    }

    public Employee(String name){
        super(name);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position){
        this.position = position;
    }

    @Override
    public String getName(){
        return super.getName().toUpperCase() + "!";
    }

    public void greeting() {
        System.out.println("Hello, I'm employee, my name is " + getName());
    }


}
