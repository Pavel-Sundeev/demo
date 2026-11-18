package homework_6.homework_1;

public class Patient {

    private int planeHeal;
    private Doctor doctor;

    public Patient(int planeHeal) {
        this.planeHeal = planeHeal;
    }

    public int getPlaneHeal() {
        return planeHeal;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setPlaneHeal(int planeHeal) {
        this.planeHeal = planeHeal;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
