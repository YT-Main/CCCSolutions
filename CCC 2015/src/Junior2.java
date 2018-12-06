import java.util.Scanner;

public class Junior2 {

	public static void main(String[] args) {
		//initializing Scanner object
				Scanner input = new Scanner(System.in);
				
				//initializing variables
				String text = input.nextLine();
				
				int happyCount = 0;
				int sadCount = 0;
				

				for(int i = 0; i < text.length() -3; i++)
				{

					if(text.substring(i, i+3).equals(":-)"))
					{
						happyCount++;
					}
					else if (text.substring(i, i+3).equals(":-(")){
						sadCount++;
					}
			
				}

					if(happyCount == 0 && sadCount ==  0)
					{
						System.out.println("none");
					}
					else if(happyCount == sadCount && happyCount != 0)
					{
						System.out.println("unsure");
					}
					else if(happyCount > sadCount)
					{
						System.out.println("happy");
					}
					else if(sadCount > happyCount)
					{
					System.out.println("sad");
					}

	}

}
