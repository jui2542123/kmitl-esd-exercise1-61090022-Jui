package kmitl.esd.exercise1.registration;

class Employee {

    protected String name;
    protected int id;

    public Employee(int id, String name){
        this.name = name;
        this.id = id;
    }

    void showInfo(){
        System.out.println(name + ":" + id);
    }

}