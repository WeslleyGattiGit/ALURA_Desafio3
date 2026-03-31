public class IdadePessoa {
    private String name;
    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void verifyAge(){
        if (age >= 18){
            System.out.println("Maior de idade!");
        }else{
            System.out.println("Não é maior de Idade.");
        }
    }
}
