public class floatnsum{
    public static void main(String[] args){
        float arr[] = {34.7f, 56.89f, 34.77f, 21.6f, 86.11f};
        System.out.println(arr.length);

        float sum = 0f;
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println(sum);
    }
}