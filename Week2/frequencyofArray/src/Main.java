public class Main {
    public static void main(String[] args) {
        int sum=1;
        int[] list={13,15,21,24,5,8,5,23,5,13};

        for (int i=0;i< list.length;i++){
            boolean isAgain=false;
            for (int j=0;j<i;j++){
                if (list[i]==list[j]){
                    isAgain =true;
                }
            }
            if (!isAgain){
                for (int j=i+1;j< list.length;j++){
                    if (list[i]==list[j]){
                        sum++;
                    }
                }
                System.out.println(list[i]+" sayısı "+sum+ " kere tekrar edildi." );
            }
            sum=1;
        }
    }
}