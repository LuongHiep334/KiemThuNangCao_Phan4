package phan1;


public class LocSoTu100den200 {
	public boolean LocSo(int n) {
		if (n >= 100 && n<=200 && n % 5 !=0) {
			return true;
		}
	return false;
	}
	public void tu100den200() {
		for(int i = 100; i <=200; i++) {
			if (LocSo(i)) {
				System.out.println(i);
			}
		}
	}
}
