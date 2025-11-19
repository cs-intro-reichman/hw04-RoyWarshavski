public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);

        boolean [] newArr = new boolean [N+1];
        newArr[0] = false;
        newArr[1] = false;
        for (int i=2; i<=N ;i++){
            newArr[i] = true;
        }
        int p=2;
        int counter=0;


        for (int i=2;i<=N;i++){
            if (newArr[i] != false){
            p=i;

           for (int j=p*2;j<=N;j+=p){
            newArr[j] = false;
           }

        }
    }
    System.out.println("Prime numbers up to "+ N +":");

    for (int i=2; i<=N ;i++){
        if (newArr [i] == true){
        System.out.println(i);
        counter++;
        }
    }

    int prc = (int) (100.0 * counter / N);


    System.out.println("There are "+ counter + " primes between 2 and " + N+ " (" +prc + "% are primes)" );


}
}