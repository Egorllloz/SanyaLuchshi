package Uchet;

public class Buyer {
    public String name;
    public int age;
    public String sex;


    public  Buyer(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getSex(){
        return this.sex;
    }
}
