
public class bubbleSort  {
	public static synchronized void sort(int[] arr){
		Thread thread = new Thread(new Runnable() {	
			@Override
			public void run() {
				// TODO Auto-generated method stub
				int n = arr.length;
			    for (int i = 0; i < n-1; i++) {
			        for (int j = 0; j < n-i-1; j++) {
			            if (arr[j] > arr[j+1]) {
			            	try {
			        			Thread.sleep(50);
			        		} catch (InterruptedException e) {
			        			// TODO Auto-generated catch block
			        			e.printStackTrace();
			        		}
			              
			                int temp = arr[j];
			                arr[j] = arr[j+1];
			                arr[j+1] = temp;
			                
			            }
			        }
			    }
			}
		});
		thread.start();
		
		
	}

	
}
