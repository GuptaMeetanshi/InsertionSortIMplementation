public class InsertionSort {
    private int[] a;
    private int size;
    public InsertionSort(int max)
    {
        a=new int[max];
        size=0;
    }
    public void insert(int value)
    {
        a[size]=value;
        size++;
    }
    public void display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]);
            System.out.println();
        }
    }
    public void insertionSort()
    {
        int i,j;
        for(i=1;i<size;i++)
        {
            int temp=a[i];
            j=i;
            while(j>0 && a[j-1]>=temp)
            {
                a[j]=a[j-1];
                --j;

            }
            a[j]=temp;
        }
    }

}
 class Insertiomain{
     public static void main(String[] args) {
         int maxsize=100;
         InsertionSort obj=new InsertionSort(maxsize);


         obj.insert(77);
         obj.insert(99);
         obj.insert(44);
         obj.insert(55);
         obj.insert(22);
         obj.insert(88);
         obj.insert(11);
         obj.insert(00);
         obj.insert(66);
         obj.insert(33);
         obj.display();
         obj.insertionSort();
         obj.display();
     }
 }