public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {

        //task 1
        int[] arr=generateRandomArray();
        int arrSum=0;
        for (int i=0; i < arr.length-1; i++) {
            arrSum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + arrSum + " рублей");

        //task 2
        int arrMin=0;
        int arrMax=0;
        for (int i=0; i < arr.length-1; i++){
            if (arr[i] < arr[i+1]) {
                arrMin=arrMin + arr[i];
            }
            if (arr[i] > arr[i+1]) {
                arrMax =arrMax + arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + arrMin + " рублей. Максимальная сумма трат за день составила " + arrMax + " рублей");

        //task 3
        int averageVilaceSum=0;
        averageVilaceSum=arrSum / arr.length-1;
        System.out.println("Средняя сумма затрат за месяц составила " + averageVilaceSum + " рублей");

        //task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for ( int i =0; i < reverseFullName.length; i++){
            System.out.print(reverseFullName[i]);
        }

    }

    }


