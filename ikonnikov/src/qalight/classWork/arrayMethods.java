package qalight.classWork;

public class arrayMethods{
    public int summKrr(int[] arr, int k){
        int summ = 0;
        int l = arr.length;
        for(int i = 0; i < l; i++){
            if (arr[i] % k == 0){
                summ += arr[i];
            }
        }
        return summ;
    }
    public int[] indexOffElements(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == 0) {
                count++;
            }
            System.out.println(count);
        }
        int[] arr1 = new int[count];
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) {
                arr1[temp] = i;
                System.out.print(arr1[temp] + "  ");
                temp++;
                }
            }
         return arr1;
    }

    public int[] replaceElements(int[] arr){
        int size = arr.length;
        int tepm = 0;
        for(int i = 0; i < size - 1 ; i+=2){
            tepm = arr [i];
            arr[i] = arr[i+1];
            arr[i+1] = tepm;
        }
        return arr;
    }

    public int[] findNambers(int[] a){
        int [] count = new int[3];
        count[0] = count [1] = count [2] = 0;
        int size = a.length;
        for(int i=0; i < size; i++){
            if(a[i] > 0) {
                count[0]++;
            }
            else if(a[i] < 0){
                count[1]++;
            }
            else count[2]++;
        }
        System.out.println("Positive" + count[0]);
        System.out.println("Negative" + count[1]);
        System.out.println("Zero" + count[2]);
        return count;
    }
}
