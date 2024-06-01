public class SwitchCase{
  public static void main(String[] args){
    String time = "afternoon";
    String message;
    switch (time){
      case "morning": message = "Wish you a very good morning, have a nice day"; break;
      case "afternoon": message = "Good afternoon, have your lunch."; break;
      case "night": message = "Good night, sweet dream"; break;
      default: message = "No more wishes";
    }
    System.out.println(message);
  }
}

// java SwitchCase.java