public class Main {
    public static int smallest(int[] array){
        int kleinste = Integer.MAX_VALUE;
        for (int i = 0; i < array.length ; i++){
            if (array[i] < kleinste){
                kleinste = array[i];
            }
        }
        return kleinste;
    }

    public static int indexOfTheSmallest (int[] array){
        int kleinsteNummerIndex = 0;
        for (int i = 0 ; i < array.length ; i++){
            if (smallest(array) == array[i]){
                kleinsteNummerIndex = i;
            }
        }
        return kleinsteNummerIndex;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int kleinsteNummer = Integer.MAX_VALUE;
        int numberIndex = 0;
        for (int i =  0 ; i < array.length ; i++){
            if (i >= index){
                if (array[i] < kleinsteNummer){
                    kleinsteNummer = array[i];
                    numberIndex = i;
                }
            }
        }
        return numberIndex;
    }

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0 ; i < array.length ; i++){
            swap(array, i, indexOfTheSmallestStartingFrom(array, i) );
        }
    }
  
}
