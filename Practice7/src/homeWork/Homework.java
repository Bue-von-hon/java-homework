/*
package homeWork;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Homework {
	
	public static int SearchStringElementInArrayList(ArrayList<String> arrayList, String element)
	{
		if(arrayList.size() == 0)
		{
			return -1;
		}
		else
		{
			for(int index = 0; index < arrayList.size(); index++)
			{
				if(arrayList.get(index).equals(element))
				{
					return index;
				}
			}
			
			return -1;
		}
	}
	
	public static String[] GetUserNames() throws IOException
	{
		Document doc = (Document) Jsoup.connect("https://family.disney.com/articles/1000-most-popular-boy-names").get();
		Elements elements = doc.select("li");
		
		ArrayList<String> userNames = new ArrayList<>();
		for(Element element : elements)
		{
			if(!element.hasAttr("id") && !element.hasAttr("href") && !element.hasAttr("class"))
			{
				userNames.add(element.text());
			}
			
		}
		
		String[] results = new String[userNames.size()];
		for(int index = 0; index < userNames.size(); index++)
		{
			results[index] = userNames.get(index);
		}
		
		return results;
	}
	
	public static String[] GetSportsCarName() throws IOException
	{
		Document doc = (Document) Jsoup.connect("https://www.car.com/sports-cars").get();
		Elements elements = doc.select("small.sub");
		
		String[] sportsCarNames = new String[elements.size() / 2];
		
		int sportsCarNamesIndex = 0;
		for(Element element : elements)
		{
			if(!element.text().equals("starting at"))
			{
				sportsCarNames[sportsCarNamesIndex] = element.text();
				sportsCarNamesIndex = sportsCarNamesIndex + 1;
			}
		}
		
		ArrayList<String> filteredSportsCarNames = new ArrayList<>();
		
		for(String car : sportsCarNames)
		{
			
			int result = SearchStringElementInArrayList(filteredSportsCarNames, car);
			
			if(result == -1)
			{
				filteredSportsCarNames.add(car);
			}
		}
		
		String[] results = new String[filteredSportsCarNames.size()];
		
		for(int index = 0; index < results.length; index++)
		{
			results[index] = filteredSportsCarNames.get(index);
		}
		
		return results;
	}
	
	public static int SearchIntValueInArrayList(ArrayList<Integer> arrayList, int number)
	{
		for(int index = 0; index < arrayList.size(); index++)
		{
			if(number == arrayList.get(index))
			{
				return index;
			}
		}
		return -1;
	}
	
	public static int[] GetRandomNumbers(String[] strs, int number)
	{
		ArrayList<Integer> randomNumbers = new ArrayList<>();
		
		int index = 0;
		while(true)
		{
			if(index == number)
			{
				break;
			}
			else
			{
				int randomNumber = (int)(Math.random() * strs.length);
				
				
				
				int INDEX_OF_RANDOMNUMBER_IN_RANDOMNUMBERS = SearchIntValueInArrayList(randomNumbers, number);
				
				if(INDEX_OF_RANDOMNUMBER_IN_RANDOMNUMBERS == -1)
				{
					randomNumbers.add(randomNumber);
					
					index++;
				}
			}
		}
		
		int[] results = new int[number];
		for(int indexOfRandomNumbers = 0; indexOfRandomNumbers < randomNumbers.size(); indexOfRandomNumbers++)
		{
			results[indexOfRandomNumbers] = randomNumbers.get(indexOfRandomNumbers);
		}
		
		return results;
	}
	
	public static SportsCar[] GetSportsCars(int sizeOfSportsCars) throws IOException
	{
		
		String[] sportsCarNames = GetSportsCarName();
		String[] userNames = GetUserNames();
		
		int[] resultOne = GetRandomNumbers(sportsCarNames, sizeOfSportsCars);
		int[] resultTwo = GetRandomNumbers(userNames, sizeOfSportsCars); 
		
		
		
		SportsCar[] sportsCars = new SportsCar[sizeOfSportsCars];
		
		for(int index = 0; index < sizeOfSportsCars; index++)
		{
			int randomSpeed = (int)(Math.random() * 240);
			sportsCars[index] = new SportsCar(randomSpeed, sportsCarNames[resultOne[index]], userNames[resultTwo[index]]);
		}
		
		return sportsCars;
	}
	
	public static void GetCarList(SportsCar[] sportsCars, int sizeOfSportsCars)
	{
		System.out.println(String.format("%20s", "** 차량 리스트 **"));
		System.out.println(String.format("%s %15s %45s", "속도", "차종", "차주"));
		for(int index = 0; index < sizeOfSportsCars; index++)
		{
			sportsCars[index].Print();
		}
	}
	
	public static void PrintMaxSpeed(SportsCar[] sportsCars)
	{
		int max = sportsCars[0].GetCarSpeed();
		int maxIndex = 0;
		for(int index = 0; index < sportsCars.length; index++)
		{
			if(max < sportsCars[index].GetCarSpeed())
			{
				max = sportsCars[index].GetCarSpeed();
				maxIndex = index;
			}
		}
		
		System.out.println(String.format("속도가 가장 빠른 차주: %s", sportsCars[maxIndex].GetCarOwnerName()));
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("차량 수 입력 --> ");
		int sizeOfSportsCars = scan.nextInt();
		
		try
		{
			if(sizeOfSportsCars > GetSportsCarName().length || sizeOfSportsCars > GetUserNames().length)
			{
				System.out.println("[-]이미 범위를 넘었습니다. 다시 한번 시도해주세요");
			}
			else
			{
				SportsCar[] sportsCars = GetSportsCars(sizeOfSportsCars);
				GetCarList(sportsCars, sizeOfSportsCars);
				PrintMaxSpeed(sportsCars);
			}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
}
*/