package superkeyword;

public class Child  extends Father{
    // super keyword in
    public Child(){
        super(20);
    }

    // super keyword in method
    public void higherEducation(){
        super.educated();

    }
    //super keyword in variables
    public void athleticSkills(){
        int number0fSport=super.number0fSport;
        System.out.println("child"+number0fSport);

    }
}
