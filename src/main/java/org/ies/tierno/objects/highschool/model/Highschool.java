package org.ies.tierno.objects.highschool.model;

import java.util.Arrays;
import java.util.Objects;

public class Highschool {
    private String name;
    private Student[] students;

    public Highschool(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Highschool that = (Highschool) o;
        return Objects.equals(name, that.name) && Objects.deepEquals(students, that.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(students));
    }

    @Override
    public String toString() {
        return "Highschool{" +
                "name='" + name + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
