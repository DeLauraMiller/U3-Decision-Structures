public class ScubaGear {

    /* You must be between 62 and 78 inches tall and weigh less than 220lbs to rent
    scuba diving equipment at eh resort*/


    public static void main(String[] args) {
        int height = 70;
        int weight = 250;
        if((height >= 62 && height <=78) && weight <= 220){
             System.out.println("You can rent Scuba Gear!");
        }else{
             System.out.println(" You cannot rent Scuba Gear!");
        }
    }

}
