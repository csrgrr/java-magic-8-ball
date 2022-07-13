public class Magic8 {
	
    public static int rn = (int) (Math.random()*8)+1;
    
   public static void main(String[] args) {
        System.out.println(ballControl(rn));
   }
   
   public static String ballControl(int num) {
       switch (num) {
       case 1:
           return "Yes.";
       case 2:
           return "No.";
       case 3:
           return "Maybe.";
       case 4:
           return "The spirits are a little confused about your question.";
       case 5:
           return "Ask your mum, not me.";
       case 6:
           return "Wow man, that's crazy.";
       case 7:
           return "Would you like me to call the police?";
       case 8:
           return "You must be joking.";
   
       default:
           break;
       }
       return null;
       
       
   }
    
   
   }