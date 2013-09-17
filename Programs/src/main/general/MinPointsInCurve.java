package main.general;

/**
 * Show the minimum points in the curve.
 */
public class MinPointsInCurve {

    public int[] getMinPoints(int[] array){
        if(array.length ==0){
            return new int[0];
        }
        int previous = array[0];
        boolean isGoingUp = false;
        int[] output = new int[array.length];
        int j =0;
        for(int i =1; i< array.length; i++){
            if(previous > array[i]){ // 1
                previous = array[i];
                isGoingUp = false;
            }
            else{
                if(!isGoingUp){ // 2
                    output[j++] = previous;
                    if(i< array.length){
                        if(previous < array[i]){
                            isGoingUp = true;
                        }
                        previous = array[i];
                    }
                }else{ // 3
                    isGoingUp = true;
                    previous = array[i];

                }
            }
        }

        if(!isGoingUp){ // 2
            output[j++] = previous;


        }

        return output;

    }

}
