

	
	/**
	 *
	 * @author mhakhta2
	 */
	import java.util.Random;

	public class Hash {
		
		
		
	    int[] Array;    
	    int arraySize;  //For the array size
	    static int s = 0, counter = 0; //Steps Counter
	    static int Steps[] = new int[1001]; 
	    public static void main(String[] args) {
	    
	        System.out.println("15007806");
	        System.out.println("Hash Table Insertion Linear Probing");
	        // 10 times
	        System.out.println("K=10");
	        int sum = 0, average = 0;   //Initialising sum and average 
	        while (counter <= 9) {  //Number of times operation will be completed 
	            Hash TheFunc = new Hash(101); // where buckets are created 
	            Random r = new Random();
	            int[] RNumbers = new int[100];  //number of times being inserted
	            for (int l = 0; l < RNumbers.length; l++) { 
	                RNumbers[l] = r.nextInt(15007806); // random numbers are generated using the uob number
	            }
	            TheFunc.Hash2(RNumbers, TheFunc.Array); //Calling the hash method
	            counter++;  //incrementing counter
	            Steps[counter] = s;
	            s = 0;
	        }
	        for (int count = 0; count < Steps.length; count++) { //needed for counting number of steps
	            sum += Steps[count];
	        }
	        average = sum / counter; //working out the averege by dividing the sum by the counter
	        System.out.println("Average: " + sum + "/" + counter + "=" + average); 

	        // 100 times
	        System.out.println("K=10");
	        int sum1 = 0, average1 = 0;
	        while (counter <= 99) {
	            Hash TheFunc = new Hash(101); // where buckets are created 
	            Random r = new Random();
	            int[] RNumbers = new int[100];
	            for (int l = 0; l < RNumbers.length; l++) {
	                RNumbers[l] = r.nextInt(15007806); // random numbers are generated using the uob number
	            }
	            TheFunc.Hash2(RNumbers, TheFunc.Array);
	            counter++;
	            Steps[counter] = s;
	            s = 0;
	        }
	        for (int count = 0; count < Steps.length; count++) { //needed for counting number of steps
	            sum1 += Steps[count];
	        }
	        average1 = sum1 / counter;
	        System.out.println("Average: " + sum1 + "/" + counter + "=" + average1);

	        //1000 Times
	        System.out.println("K=10");
	        int sum2 = 0, average2 = 0;
	        while (counter <= 999) {
	            Hash TheFunc = new Hash(101); // where buckets are created 
	            Random r = new Random();
	            int[] RNumbers = new int[100];
	            for (int l = 0; l < RNumbers.length; l++) {
	                RNumbers[l] = r.nextInt(15007806); // random numbers are generated using the uob number
	            }
	            TheFunc.Hash2(RNumbers, TheFunc.Array);
	            counter++;
	            Steps[counter] = s;
	            s = 0;
	        }
	        for (int count = 0; count < Steps.length; count++) { //needed for counting number of steps
	            sum2 += Steps[count];
	        }
	        average2 = sum2 / counter;
	        System.out.println("Average: " + sum2 + "/" + counter + "=" + average2);
	    }

	    public void Hash2(int[] IntsForArray, int[] Array) {    //Main Hash method takes the numbers and takes the array to do the hash function 
	        for (int i = 0; i < IntsForArray.length; i++) { //for loop used for inserting the elements into buckets 
	            int newElementVal = IntsForArray[i];
	            int arrayIndex = newElementVal % 101; //101 buckets from uob number does modulo 
	            while (Array[arrayIndex] != 0) { //keeps running through the buckets via linear probing     
	                System.out.print("P" + arrayIndex + " ");
	                ++arrayIndex;
	                arrayIndex %= arraySize;
	                ++s;
	            }
	            ++s;
	            System.out.print("P" + arrayIndex + " I" + newElementVal + "@" + arrayIndex + " "); //outputs the number of probes and insetation
	            Array[arrayIndex] = newElementVal;
	            ++s;
	        }
	        System.out.println("");
	        System.out.println("Number of steps S=" + s);
	    }

	    Hash(int size) {
	        arraySize = size;
	        Array = new int[size];
	    }
	}

