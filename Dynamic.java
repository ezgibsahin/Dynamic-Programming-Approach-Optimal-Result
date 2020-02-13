import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Dynamic {
	
	public Dynamic() throws IOException
	{
		fileOperation();
	}

	String [][] array = new String[34][31]; 
	
	public void fileOperation() 
	{
		FileReader fileReader = null;
		BufferedReader buffReader = null;
		try 
		{
			fileReader = new FileReader(new File("src/input.txt"));
			buffReader = new BufferedReader(fileReader);
			String line ;
			int number = 0;			
			while ((line = buffReader.readLine()) != null) 
			{	
				String[] rows = line.split("/");	
				
				for(int i = 0;i<rows.length;i++)
				{
					array[number][i] = rows[i];
					
				}
				number++;			
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileReader != null)
					fileReader.close();
				if (buffReader != null)
					buffReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void DP(double M,int Y,int n,int[] investment)
	{
		double max =Integer.MIN_VALUE;
		double [] result = new double [n];
		for(int i = 0;i<Y;i++)
		{
			if(Y==0)
			{
				for(int j=0;j<investment.length;j++)
				{
					double amount = Double.parseDouble(array[i][investment[j]]);
					result[i] = M + M * (amount/100);				
				}
			}
			else
			{
				double [] after = new double[(int) Math.pow(n, Y)];
				for(int j=0;j<after.length;j++)
				{
					double fee = Double.parseDouble(array[33][investment[Y]]);
					//M + M * (amount/100) - M * fee
					after[j] = result[i] - result[i] * fee;
				}
				
			}
			//DP(result[i],Y,n,investment);
		}
		
	}
	
	
}
