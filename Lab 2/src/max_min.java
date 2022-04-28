public class max_min {
    public int find_max_min(String choice, int [] array)
    {
        int temp,max,min;
        for(int i=0; i<(array.length)-1; i++)
        {
            if(array[i]>array[i+1])
            {
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
            else continue;
        }
        max = array[array.length-1];
        min = array[0];
        if (choice == "Max")
            return max;
        else
            return min;
    }
}
