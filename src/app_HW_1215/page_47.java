package app_HW_1215;

public class page_47 {
	public static void main(String[] args) {
		Car car1 = new Car("1號車");
		car1.start();
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("正在進行main()的處理工作");
			}catch(InterruptedException e) {
			}
		}
	}
}


