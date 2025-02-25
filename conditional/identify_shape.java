package conditional;

//Check the Shape is Triangle / Rectangle / Pentagon / Other

public class identify_shape {
    public static void main (String args[])
    {
        int num_of_sides = 4;
        if  (num_of_sides == 3){
            System.out.println("Triangle");
        }
        else if (num_of_sides == 4){
            System.out.println("Rectangle");
        }
        else if (num_of_sides == 5){
            System.out.println("Pentagon");
        }
        else{
            System.err.println("Other");
        }
    }
    
}
