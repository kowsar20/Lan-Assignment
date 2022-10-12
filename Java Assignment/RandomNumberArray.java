
public class RandomNumberArray {
    public static void main(String args[]){
        final int LENGTH = 10;
        int[] array = new int[LENGTH];

        for(int i=0; i<LENGTH; i++)
        {
            array[i] = (int)(10*(Math.random()));
            System.out.print(array[i]);

        }
        System.out.println();
        for(int i=0; i<LENGTH; i+=2) {
            System.out.print(array[i]);
            if (i<(LENGTH-1)) {
                System.out.print(" ");
            }
        }
        System.out.println();
        for(int i=0; i<LENGTH; i+=2)
        {
            if(array[i]%2==0)
            {
                System.out.print(array[i]);
            }
            if(i<(LENGTH-1))
            {
                System.out.print(" ");
            }
        }
        System.out.println();
        for(int i=LENGTH-1; i>=0; i--) {
            System.out.print(array[i]);

           if (i > 0) {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.print(array[0] +" "+ array[array.length-1]);

    }
}
