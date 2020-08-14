
public class shellSort {
	public static synchronized void sort(int[] arr) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				int n = arr.length; 
		        for (int gap = n/2; gap > 0; gap /= 2) { 
		            for (int i = gap; i < n; i += 1) { 
		                int temp = arr[i]; 
		                int j; 
		                try {
		        			Thread.sleep(25);
		        		} catch (InterruptedException e) {
		        			// TODO Auto-generated catch block
		        			e.printStackTrace();
		        		}
		                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
		                	 try {
		 	        			Thread.sleep(25);
		 	        		} catch (InterruptedException e) {
		 	        			// TODO Auto-generated catch block
		 	        			e.printStackTrace();
		 	        		}
		                    arr[j] = arr[j - gap]; 
		                }
		                arr[j] = temp; 
		            } 
		        } 
			}
			
		});
		thread.start();
	}
}
