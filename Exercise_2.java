class Exercise_2 
{ 
    /* This function takes last element as pivot, 
       places the pivot element at its correct 
       position in sorted array, and places all 
       smaller (smaller than pivot) to left of 
       pivot and all greater elements to right 
       of pivot */
    void swap(int arr[],int i,int j){
        //Your code here   
    	int temp;
    	temp=arr[i];
    	arr[i]=arr[j];
    	arr[j]=temp;
    }
    
    int partition(int arr[], int low, int high) 
    { 
   	//Write code here for Partition and Swap 
    	int pivot=arr[low];
    	int i=low;
    	int j=high;
    	while(i<j)
    	{
    		while(arr[i]<=pivot &&i<high)
    		{
    			i++;
    		}
    		while(arr[j]>pivot&&j>low)
    		{
    			j--;
    		}
    		
    		if(i<j) swap(arr,i,j);
    		
    	}
    	swap(arr,low,j);
    
    	return j;
    } 
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    void sort(int arr[], int low, int high) 
    {  
            // Recursively sort elements before 
    	if(low<high)
    	{
    		int pindex=partition(arr,low,high);
    		sort(arr,low, pindex-1);
    		sort(arr,pindex+1,high);
    	}
            // partition and after partition 
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver program 
    public static void main(String args[]) 
    { 
        int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
        Exercise_2 ob = new Exercise_2(); 
        ob.sort(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
        printArray(arr); 
    } 
} 
//TC- O(nlogn)
//SC- O(n)