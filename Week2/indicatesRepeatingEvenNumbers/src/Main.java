public class Main {
     static boolean isFind(int[] arr,int[]value){
         for (int i :arr){
             if (i==value){
                 return true;
             }
         }
         return false;
     }

    public static void main(String[] args) {
         int[] list={3,7,5,8,4,12,4,5,8,3,65,54,53,54};
         int evenDuplicate=new int[list.length];
         int startIndex=0;
         for (int i=0;i< list.length;i++){
             for (int j=0;j< list.length;j++){
                 if (i !=j && (list[i]==list[j])){
                     if (isFind.toString(evenDuplicate)){

                     }
                 }
                 break;
             }
         }
         for (int value:evenDuplicate){
             if (value!=0){
                 System.out.println();

             }
         }
    }
}