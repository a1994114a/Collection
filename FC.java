/**
 * Auto Generated Java Class.
 */
public class FC {
  
public static<K> void println(K arg) { System.out.println(arg);} //with this you don't have to type System.out anymore but notice println() needs to be typed as println("")
public static<T> void print(T arg) { System.out.print(arg); }
public static int rand(int min, int max){                  // randome int generator
   int range = (max - min) + 1;     
   int random= (int)(Math.random() * range) + min;

    return random;
  }
public static boolean issubarray(int[] small,int[] big){      //check if an array is subset of another
  boolean ithitemisokay=true;
  for(int i=0;i<small.length;i++){
    if(iselement(small[i],big)==false){
      return false;
    }
}
  return true;
}
public static boolean iselement(int a,int[] big){            //check if an element is present in an array
  for(int i=0;i<big.length;i++){
    if (a==big[i]){
    return true;
    }
  }return false;
}
 private static boolean checsame(String b,int n){      //check if characters of a string are the same
   for (int i=0;i<b.length()-1;i++){
     if(b.charAt(i)!=b.charAt(i+1)){
       return false;
     }
   }
   return true;
 }
public static int mostrepeats(char a, String s){                //check the most continuous repeats of a character in a stirng
  int x =-1;
  for (int i=0;i<s.length();i++){
    int counter=0;      
      while(true){
         try {
        if(s.charAt(i+counter)==a){
          counter++;
        }else{
          break;
        }    
      }catch(StringIndexOutOfBoundsException e){
        break;
      }
      } 
    if(counter>x){
            x=counter;
    }
  }
  return x; 
 }
private static int countfixedsizerepeats(char a, String s, int m){         //count how many times a string contain char a in a row with length m
   int k=0;
   for(int i=0;i<s.length()-m+1;i++){
     char[] array=new char[m];
     for(int j=0;j<m;j++){
       array[j]=s.charAt(i+j);
     }
     boolean allsame=true;
     for(int j=0;j<array.length-1;j++){
       if(array[j]!=array[j+1]||array[j]!=a){
         allsame=false;
         break;
       }
     }
     if(allsame){
       k++;
     }
   }
   return k;
 }
}
