
public class insertionSort {
	public static synchronized void sort(int[] arr) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				int n = arr.length; 
		        for (int i = 1; i < n; ++i) { 
		            int key = arr[i]; 
		            int j = i - 1; 
		            try {
	        			Thread.sleep(50);
	        		} catch (InterruptedException e) {
	        			// TODO Auto-generated catch block
	        			e.printStackTrace();
	        		}
		            while (j >= 0 && arr[j] > key) { 
		                arr[j + 1] = arr[j]; 
		                j = j - 1; 
		            } 
		            arr[j + 1] = key; 
		        } 
			}
			
		});
		thread.start();
	}
}
