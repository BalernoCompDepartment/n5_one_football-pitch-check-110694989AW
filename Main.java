class Main {
  public static void main(String[] args) {
    int length = Keyboard.getInt("what is the length of the pitch?");
    
    while(length < 90 || length > 120) {
      Screen.display("that is invalid", "error screen");
      length = Keyboard.getInt("what is the length of the pitch");
    }
    int width = Keyboard.getInt("what is the width of the pitch?");
    
    while(width < 45 || width > 90) {
      Screen.display("that is invalid", "error Screen");
      width = Keyboard.getInt("what is the width of the pitch?");
    }
    
    String output = "the dimensions of length " + length + " and width " + width + " are valid";
    
    Screen.display(output, "validity check");
  }
}