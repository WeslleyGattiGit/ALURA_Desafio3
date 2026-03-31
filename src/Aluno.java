public class Aluno {
    private String name;
    private double[] notas = {0,0,0};

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setNota(double nota, int i){
        this.notas[i] = notas[i];
    }

    public void getNotas(){
        for (int j = 0; j < 3; j++) {
            System.out.println(notas[j]);
        }
    }

    public double calcularMedia(){
        double somaNotas = 0;
        for(int i = 0; i < notas.length;i++){
            somaNotas += notas[i];
        }
        return somaNotas/notas.length;
    }
}
