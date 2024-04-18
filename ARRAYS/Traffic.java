

public class Traffic {

    public static int traffic(int n, int m, int []vehicle) {

        // Write your code here.

        int i=0;

        int j=0;

        int count=m;

        int countans=0;

 

        while(j<vehicle.length)

        {

            if(vehicle[j]==1)

                j++;

            else if(vehicle[j]==0)

                {

                    if(count>0)   {  
                         j++;
                        count--;
                    }

                    else{

                        countans=countans>(j-i)?countans:(j-i);

 

                        if(vehicle[i]==0)

                          count++;

                        i++; 

                    }

                }

            countans=countans>(j-i)?countans:(j-i);

               

        }

          return countans;
    }
    }