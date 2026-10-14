package POO;

import java.util.Arrays;

public class Aluno {
    private String name;
    private float[] grades;

    public Aluno(String name, float[] grades){
        this.name = name;
        this.grades = grades;
    }

    public float getAverage(){
        float sum = 0;

        for(float grade: grades){
            sum += grade;
        }

        return sum/grades.length;
    }

    @Override
    public String toString() {
        return "Aluno(a) " + name + " \nNotas: " + Arrays.toString(grades) + " \nMédia: " + getAverage();
    }
}
