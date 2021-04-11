package sample;

public class Employee extends Restaurant{
    String[] empNames = {"Emp1", "Emp2", "Emp3", "Emp4", "Emp5", "Emp6"};
    double[] empWages = {5.00, 7.00, 9.00, 13.00, 15.00, 99.99};
    int[] competence = {1, 2, 3, 4, 5, 10};
    int[] happiness = {1, 2, 3, 4, 5, 10};
    String emp = "";
    double wage = 0;
    int comp = 0;
    int happy = 0;

    public Employee(String emp) {
       this.emp = emp;
    }

    public int getEmpIndex() {
        int idx = 0;
        boolean ifound = false;
        for (int i=0; i<empNames.length; i++){
            if (empNames[i].compareTo(this.emp) == 0){
                idx = i;
                ifound = true;
                break;
            }
        }
        if (ifound) return idx;
        else return -1;
    }

    public double getWage() {
        int idx = this.getEmpIndex();
        if (idx >= 0){
            wage = empWages[idx];
        }
        return wage;
    }

    public int getHappiness() {
        int idx = this.getEmpIndex();
        if (idx >= 0){
            happy = happiness[idx];
        }
        return happy;
    }

    public int getCompetence() {
        int idx = this.getEmpIndex();
        if (idx >= 0){
            comp = competence[idx];
        }
        return comp;
    }

    /*
     Competence and happiness are measured from 1 to 10. If happiness >= 5, competence increases.
     If happiness < 5, competence decreases.
   */

    public void competenceIncrease(String name) {
        int idx = this.getEmpIndex();
        if (idx >= 0 && idx < competence.length && this.getHappiness() >= 5)
            competence[idx] = competence[idx] + 1;
    }

    public void competenceDecrease(String name) {
        int idx = this.getEmpIndex();
        if (idx > 0 && this.getHappiness() < 5)
            competence[idx] = competence[idx] - 1;
    }
}
