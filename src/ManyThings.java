import java.util.Scanner;

public class ManyThings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in); 
		System.out.println("Enter Numbers");
		boolean keep_running = true;
		int curr = 0;
		int sum = 0; 
		int number = 0; 
		int even = 0; 
		int odd = 0; 
		while (keep_running) {
			curr = reader.nextInt();  
			if (curr == -1) {
				keep_running = false;
			}else {
				sum = sum + curr;
				number++;  
				if (curr % 2 == 0) {
					even++;
				}else {
					odd++;
				}
			}
			
		}
		System.out.println("Sum :" + sum + "\n Numbers: " + number + "\n Average: " + (sum/number) + "\n Even: " + even + "\n Odd: " + odd);
	}

}
