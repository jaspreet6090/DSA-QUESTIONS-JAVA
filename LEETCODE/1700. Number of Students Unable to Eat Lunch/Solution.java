class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circularSandwich = 0;
        int squareSandwich = 0;

        for(int choice : students){
            if(choice == 1){
                squareSandwich++;

            } else{
                circularSandwich++;
            }
        }

        for(int type :  sandwiches){
            if(type ==  1 & squareSandwich == 0 ){
                return circularSandwich;
            }

            if(type == 0 && circularSandwich == 0){
                return squareSandwich;
            }

            if(type == 1){
                squareSandwich--;
            }else {
                circularSandwich--;
            }
        }
        return 0;
    }
}