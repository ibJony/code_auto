import java.util.*;

public class RandList
{
	public static void main(String args[])
	{
		Random r = new Random();
		int 	i, j;

		boolean	used[] = new boolean[150];

		for (i = 0; i < 150; i++)
			used[i] = false;

		for (i = 0; i < 200; i++)
		{
			j = r.nextInt() % 150;
			if (j < 0)
				j = j * -1;

			if (!used[j])
			{
				used[j] = true;
				j= j + 100;
				System.out.println(j);
			}
		}
	}
}

