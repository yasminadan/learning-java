/* public class returnStatements {
     public static void main(String[] args) {
        printSomething();
        int sum = add(5,6);
    System.out.println(sum);
    }

    public static void printSomething(){

        System.out.println("you suck!");
    }
    public static int add(int a, int b){ 
        return a + b;



    }
}*/

public class returnStatements{
int age;
String name;

    public static void main(String[] args) {
        returnStatements a = new returnStatements();
        a.setAge(14);
        a.setName("yasmin");
            System.out.println(a.getAge());
            System.out.println(a.getName());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
