import codescape.Dogbot;
public class MyDogbot extends Dogbot{
public void run() {
turnLeft();
		String consoleOutput = read();
		System.out.println("Output: "+consoleOutput);
        boolean a =consoleOutput.equals("L");
        if(a){ String moves = "111010";
            for (int i = 0; i < 99; i++) {
      char n = moves.charAt(i);
        switch(n) {
        case '0':
          move();
          break;
        case '1':
          turnLeft();
          break;
                  }
                                          }    
             }
      else{String moves = "11101110";
               for (int i = 0; i < 99; i++) {
      char n = moves.charAt(i);
        switch(n) {
        case '0':
          move();
          break;
        case '1':
          turnLeft();
          break;
                 }
                                             }    
         }
                }
                                        }
