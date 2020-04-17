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
			if(me.equals("����") && man.equals("��"))
			{
				return 1;
			}
			else if(me.equals("����") && man.equals("����"))
			{
				return -1;
			}
			
			if(me.equals("����") && man.equals("����"))
			{
				return 1;
			}
			else if(me.equals("����") && man.equals("��"))
			{
				return -1;
			}
			
			if(me.equals("��") && man.equals("����"))
			{
				return 1;
			}
			else if(me.equals("��") && man.equals("����"))
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
			System.out.println(String.format("����� = %s, %s = %s, ����� ��!", me, manName, man));
			
		}
		else if(result == 0)
		{
			System.out.println(String.format("����� = %s, %s = %s, �����!", me, manName, man));
			
		}
		else if(result == -1)
		{
			System.out.println(String.format("����� = %s, %s = %s, ����� ��!", me, manName, man));
			
		}
		else
		{
			System.out.print("[-]Error �߻�!");
		}
	}
	
	public static void main(String[] args)
	{
		String rockScissorsPaper;
		Human man = new Human("����ȯ");
		Scanner scan = new Scanner(System.in);
		
		System.out.println(String.format("%s��(��) ���� ���� �� ������ �մϴ�.", man.GetHumanName()));
		while(true)
		{
			System.out.print("���� ���� �� >>");
			rockScissorsPaper = scan.next();
			
			if(rockScissorsPaper.equals("stop"))
			{
				break;
			}
			else if(rockScissorsPaper.equals("����") || rockScissorsPaper.equals("����") || rockScissorsPaper.equals("��"))
			{
				String manRockScissorsPaper = man.GetRockScissorsPaper();
				int result = GetResult(rockScissorsPaper, manRockScissorsPaper);
				GetState(result, rockScissorsPaper, manRockScissorsPaper, man.GetHumanName());
			}
			else
			{
				System.out.println("[-] �߸��� �Է°��� �Է��Ͽ����ϴ�. �ٽ� �õ��� �ּ���");
			}
			
		}
		System.out.printf("%s: �̰ſ�༮ ���� ������������ �����ٴ�...", man.GetHumanName());
	}
}
