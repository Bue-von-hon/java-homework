package homework;

import java.io.File;
import java.util.Scanner;

public class Homework {
	
	public static int GetResult(String me, String man)
	{
		// Defeat -1
		// Draw 0
		// Win 1
		if(me.equals(man))
		{
			return 0;
		}
		else
		{
			if(me.equals("가위") && man.equals("보"))
			{
				return 1;
			}
			else if(me.equals("가위") && man.equals("바위"))
			{
				return -1;
			}
			
			if(me.equals("바위") && man.equals("가위"))
			{
				return 1;
			}
			else if(me.equals("바위") && man.equals("보"))
			{
				return -1;
			}
			
			if(me.equals("보") && man.equals("바위"))
			{
				return 1;
			}
			else if(me.equals("보") && man.equals("가위"))
			{
				return -1;
			}
		}
		return -2;
	}
	
	public static void GetState(int result, String me, String man, String manName)
	{
		if(result == 1)
		{
			System.out.println(String.format("사용자 = %s, %s = %s, 사용자 승!", me, manName, man));
			
		}
		else if(result == 0)
		{
			System.out.println(String.format("사용자 = %s, %s = %s, 비겼음!", me, manName, man));
			
		}
		else if(result == -1)
		{
			System.out.println(String.format("사용자 = %s, %s = %s, 사용자 패!", me, manName, man));
			
		}
		else
		{
			System.out.print("[-]Error 발생!");
		}
	}
	
	public static void main(String[] args)
	{
		String rockScissorsPaper;
		Human man = new Human("이유환");
		Scanner scan = new Scanner(System.in);
		
		System.out.println(String.format("%s과(와) 가위 바위 보 게임을 합니다.", man.GetHumanName()));
		while(true)
		{
			System.out.print("가위 바위 보 >>");
			rockScissorsPaper = scan.next();
			
			if(rockScissorsPaper.equals("stop"))
			{
				break;
			}
			else if(rockScissorsPaper.equals("가위") || rockScissorsPaper.equals("바위") || rockScissorsPaper.equals("보"))
			{
				String manRockScissorsPaper = man.GetRockScissorsPaper();
				int result = GetResult(rockScissorsPaper, manRockScissorsPaper);
				GetState(result, rockScissorsPaper, manRockScissorsPaper, man.GetHumanName());
			}
			else
			{
				System.out.println("[-] 잘못됭 입력값을 입력하였습니다. 다시 시도해 주세요");
			}
			
		}
		System.out.printf("%s: 싱거운녀석 벌써 가위바위보를 끝내다니...", man.GetHumanName());
	}
}
