public class selection_sort
{
	public static void main (String[] args)
	{
		int[] angka = {8,3,4,7,2,6,5,1,10,9};
		Selection_Sort(angka);
	}
	
	public static void Selection_Sort(int[] angka)
	{
		for (int i=0; i<angka.length-1; i++)
		{
			int terkecil = angka[i];
			for (int j=i+1; j<angka.length-1; j++)
			{
				if (angka[j] <= angka [i])
				{
					angka[i] = angka[j];
					angka[j]= terkecil;
					terkecil = angka[i];
				}
			}
		}
		System.out.println("\t\t SELECTION SORT");
		for (int k=0; k<angka.length-1; k++)
		{
			System.out.print(angka[k] + "	");
		}
		System.out.println();
	}
}