package coachProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component("FFRService")
public class FileFortuneRandomService implements FortuneService {

	@Override
	public String getDailyFortune() {
		// Taking input from a file 
		String output = "";
		File file = new File("C:\\Users\\Anirudh\\Desktop\\Anirudh\\Spring and Hybernate\\FortuneFile.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			//adding input to an array string 
			ArrayList<String> fortuneArray = new ArrayList<String>();
			String temp;
			int fileLength = 0;
			while((temp = br.readLine()) != null)
			{
				fortuneArray.add(temp);
				fileLength++;
			}
			
			//generating random numbers
			Random rand = new Random();
			int outputIndex = rand.nextInt(fileLength);
			output = fortuneArray.get(outputIndex);
			br.close();
		} catch (Exception e) {
			System.out.println("File loading error");
			e.printStackTrace();
		}
		
		return output;
	}

}
