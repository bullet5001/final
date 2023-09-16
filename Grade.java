public class Grade {
    public static void main(String[] args){
        int mark=60;
        if(mark<40){
            System.out.println("you are fail");
        }
        else if(mark==40 || mark<60){
            System.out.println("B grade");

        }else if(mark==60 ||mark<80){
            System.out.println("B+ grade");
        } else if (mark==80 || mark<90) {
            System.out.println("A grade");
              } else if (mark==90 || mark<99) {
            System.out.println("A+ grade");

        } else {
            System.out.println(" you are Alien");

        }
    }
}
