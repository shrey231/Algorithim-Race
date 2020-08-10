
public class quickSort {
	
	 public static synchronized int partition(int arr[], int low, int high)  { 
	     int pivot = arr[high];  
	     int i = (low-1);
	     for (int j=low; j<high; j++)  { 
	      
	         if (arr[j] < pivot)  { 
	             i++; 
	             try {
	        		Thread.sleep(50);
	        	   } catch (InterruptedException e) {
	        			// TODO Auto-generated catch block
	        		    e.printStackTrace();
	        	   }
	             int temp = arr[i]; 
	             arr[i] = arr[j]; 
	             arr[j] = temp; 
	         } 
	     } 
	
	    
	     int temp = arr[i+1]; 
	     arr[i+1] = arr[high]; 
	     arr[high] = temp; 
	
	     return i+1; 
	 } 
	
	public static synchronized void sort(int arr[], int low, int high) { 
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				  if (low < high) { 
					  
				         int pi = partition(arr, low, high); 
				
				         sort(arr, low, pi-1); 
				         sort(arr, pi+1, high); 
				     } 
			}
			
		});
		thread.start();
	   
	 }
}
