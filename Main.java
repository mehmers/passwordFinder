import java.util.*;
class Main {
  public static long execute1(String pass){
    long start = System.nanoTime();
    char[] num = {'0','1','2','3','4','5','6','7','8','9'};
    char[] passa = pass.toCharArray();
    char[] predicted = new char[65];
    int count = 0;
      for(char x : passa){
        for(char y : num){
          if(x==y){
            predicted[count] = x;
            count++;
            break;
          }
        }
      }
    predicted[count] = '\u0000';
    long finish = System.nanoTime();
    System.out.printf("Elapsed Time : %d ns\n", finish-start);
    for(char t : predicted){
      System.out.print(t);
    }
    return finish-start;
  }
    public static long execute2(String pass){
    long start = System.nanoTime();
    char[] num = {'0','1','2','3','4','5','6','7','8','9'};
    char[] predicted = {'0','0','0','0','0','0','0','0'};
    int count = 0;
    char[] passx = pass.toCharArray();

    for(int i = 0; i > -1 ; i++){
      if(Arrays.equals(predicted, passx)){
        long finish = System.nanoTime();
        System.out.printf("\npassword found : %s\nElapsed time : %d ns", pass, finish-start);
        return finish-start;
      }
      for(char x : predicted){
        System.out.print(x);
      }
      System.out.println("");
      if(((int) predicted[7]+1-48) < 10){
        predicted[7] = (char)((int)predicted[7]+1);
      }
      else{
       if(((int) predicted[6]+1-48) < 10){
        predicted[6] = (char)((int)predicted[6]+1);
        predicted[7] = '0';
      }
        else{
          if(((int) predicted[5]+1-48) < 10){
          predicted[5] = (char)((int)predicted[5]+1);
          predicted[6] = '0';
          predicted[7] = '0';
          }
          else{
            if(((int) predicted[4]+1-48) < 10){
            predicted[4] = (char)((int)predicted[4]+1);
            predicted[5] = '0';
            predicted[6] = '0';
            predicted[7] = '0';
            }
            else{
             if(((int) predicted[3]+1-48) < 10){
              predicted[3] = (char)((int)predicted[3]+1);
              predicted[4] = '0';
              predicted[5] = '0';
              predicted[6] = '0';
              predicted[7] = '0';
              }
              else{
                if(((int) predicted[2]+1-48) < 10){
                predicted[2] = (char)((int)predicted[2]+1);
                predicted[3] = '0';
                predicted[4] = '0';
                predicted[5] = '0';
                predicted[6] = '0';
                predicted[7] = '0';                
                }
                else{
                  if(((int) predicted[1]+1-48) < 10){
                  predicted[1] = (char)((int)predicted[1]+1);
                  predicted[2] = '0';
                  predicted[3] = '0';
                  predicted[4] = '0';
                  predicted[5] = '0';
                  predicted[6] = '0';
                  predicted[7] = '0'; 
                  }
                  else{
                   if(((int) predicted[0]+1-48) < 10){
                    predicted[0] = (char)((int)predicted[0]+1);
                    predicted[1] = '0';
                    predicted[2] = '0';
                    predicted[3] = '0';
                    predicted[4] = '0';
                    predicted[5] = '0';
                    predicted[6] = '0';
                    predicted[7] = '0'; 
                    }
                    else{
                      break;
                    }
                  }
                }
              }
            }
          }
        }
      }
      
    }
    return 0;
  }
  public static void main(String[] args) {
    long t1 = execute1("00111111");
    long t2 = execute2("00111111");
    System.out.printf("\nMethod 1 : %d nanoseconds elapsed.\nMethod 2 : %d nanoseconds elapsed.", t1, t2);
  }
}
