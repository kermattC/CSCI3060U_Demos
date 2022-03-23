// A basic java class. Since it's not the main focus here I'll just skip the explaining for this

public class StudentDetails {
    private String name;
    private String pet;

    public StudentDetails(String name, String pet){
        this.name = name;
        this.pet = pet;
    }

    public String petThePet(int numberOfPets){
        return String.format("%s petted the %s %d times \n", this.name, this.pet, numberOfPets);
    }

    public String getPet(){
        return ("The pet is a " + this.pet);
    }

    public String petChecker(String pet){
        if (pet != this.pet){
            return String.format("This is not %s's pet!", this.name);
        } else {
            return String.format("This is %s's pet! :)", this.name);
        }
    }

    public static void main (String[] args){
        StudentDetails student2 = new StudentDetails("Matt", "Dog");
        System.out.println("From the normal class: ");
        student2.petThePet(5);
    }
}