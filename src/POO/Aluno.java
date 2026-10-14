package POO;

import java.util.Arrays;

public class Aluno {
    private String name;
    private final float[] grades;

    public Aluno(String name, float[] grades){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }

        if (grades == null || grades.length == 0) {
            throw new IllegalArgumentException("O aluno deve possuir pelo menos uma nota.");
        }

        this.name = name;
        this.grades = Arrays.copyOf(grades, grades.length);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }

        this.name = name;
    }

    public float[] getGrades(){
        return Arrays.copyOf(grades, grades.length);
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
        return "Aluno(a) " + name + " \nNotas: " + Arrays.toString(grades) + " \nMédia: " + String.format("%.2f", getAverage());
    }
}
