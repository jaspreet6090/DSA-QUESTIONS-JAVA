class Solution {
    public String makeGood(String str) {
         
         
         if(str.length() == 1){
        System.out.println(str);
    }

    int i = 0;
    while( i <str.length()-1 ){if(str.charAt(i) ==  str.charAt(i+1)){
            i++;
        }
        else if(str.charAt(i) == Character.toUpperCase(str.charAt(i+1)) || 
            str.charAt(i) == Character.toLowerCase(str.charAt(i+1))
        ){
            String remove = str.substring(i,i+2);
            // System.out.println("  " + remove + " --" + str);
            str =  str.replace(remove, "");
            //   System.out.println("  " + remove + " --" + str);
              i=0;
        } else{
            i ++;
        }
    }
    return str;
     }
}