package bai61;
public class arraylist implements Comparable<arraylist> {
    private int codeStudent;
    private String fullName;
    private int dateOfBirth;
    private double avg;

    public arraylist(int codeStudent) {
        this.codeStudent=codeStudent;
    }

    public arraylist(int codeStudent, String fullName, int dateOfBirth, double avg) {
        this.codeStudent = codeStudent;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.avg = avg;
    }

    public int getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(int codeStudent) {
        this.codeStudent = codeStudent;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "arraylist{" +
                "codeStudent=" + codeStudent +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", avg=" + avg +
                '}';
    }
    @Override
    public int compareTo(arraylist o) {
        return this.codeStudent-(o.codeStudent);
    }
}
