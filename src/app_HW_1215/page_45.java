package app_HW_1215;

public class page_45 {
	public static void main(String[] args) {
		Car car1=new Car("1號車");
		car1.start();
		Car car2=new Car("2號車");
		car2.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("正在進行main()的處理工作");
		}
	}

}
