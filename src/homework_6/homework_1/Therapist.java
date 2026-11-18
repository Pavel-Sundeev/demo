package homework_6.homework_1;

public class Therapist extends Doctor{

    @Override
    void heal() {
        System.out.println("Терапевт выписал таблетки для лечения");
    }


    void prescribeDoctor(Patient patient){
        if (patient.getPlaneHeal() == 1){
            Surgeon sur = new Surgeon();
            patient.setDoctor(sur);
            sur.heal();
        } else if (patient.getPlaneHeal() == 2) {
            Dentist den = new Dentist();
            patient.setDoctor(den);
            den.heal();
        } else {
            patient.setDoctor(this);
            heal();
        }
    }

}
