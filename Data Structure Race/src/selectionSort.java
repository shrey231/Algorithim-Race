
public class selectionSort {
	public static synchronized void sort(int[] arr) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				int n = arr.length; 
		        for (int i = 0; i < n-1; i++)  { 
		         
		            int min_idx = i; 
		            for (int j = i+1; j < n; j++) { 
		                if (arr[j] < arr[min_idx]) 
		                    min_idx = j; 
		            }
		            try {
	        			Thread.sleep(50);
	        		} catch (InterruptedException e) {
	        			// TODO Auto-generated catch block
	        			e.printStackTrace();
	        		}
		            int temp = arr[min_idx]; 
		            arr[min_idx] = arr[i]; 
		            arr[i] = temp; 
		        } 
			}
			
		});
		thread.start();
	}
}
