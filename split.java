str = ("   Fatally shah      shaken    “);
str.trim();


Boolean sp = false;

char[] hi = str.toCharArray();

For (int i = 0; i < hi.length; i++){
  If (char[i] == " ".charAt(0))
        sp = true;
  Else If (char[i] != " ".charAt(0) && sp== true){
       System.out.println(char[i]);
       sp = false;
        }
  Else If (char[i] != " ".charAt(0))
       System.out.print(char[i])