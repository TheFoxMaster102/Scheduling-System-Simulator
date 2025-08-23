package Proj4;
import java.util.PriorityQueue;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class JobSort {

	public static void main(String[] args) {
		try {
			File jobs = new File("C:\\Users\\andre\\Downloads\\jobs.txt");
			Scanner scanner= new Scanner(jobs);
			PriorityQueue<job> order=new PriorityQueue<>();
			  while (scanner.hasNextLine()) {
	                String line = scanner.nextLine();
	                order.add(new job(Integer.parseInt(line.split(" ")[0]),Integer.parseInt(line.split(" ")[1]),Integer.parseInt(line.split(" ")[2])));
	            }
			  int comptime=0;
			  job current;
			  System.out.println("jobID length priority completionTime");
			  while(!(order.isEmpty()))
			  {
				current=order.poll();
				comptime+=current.getlength();
				System.out.println(current+" "+comptime);
			  }
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File Error");
		}

	}

}
