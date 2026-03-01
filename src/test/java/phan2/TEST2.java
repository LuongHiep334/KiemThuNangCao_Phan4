package phan2;

import org.junit.*;

public class TEST2 {
	MonAn monan = new MonAn();
	MonAnService serviceMA ;
	@Before
	public void setup() {
		serviceMA = new MonAnService();
		serviceMA.setUp();
	}
	@Test
	 public void ham1_Them_Mon_Ma_Moi() {
		 monan = new MonAn("004","Sữa chua","tráng miệng",10,12000);
		Assert.assertTrue(serviceMA.themMonAn(monan));
	}
	@Test
	 public void ham2_Them_Mon_Chung_Ma() {
		 monan = new MonAn("001","Sữa chua","tráng miệng",10,12000);
		Assert.assertFalse(serviceMA.themMonAn(monan));
	}
	@Test
	 public void ham3_Sua_Mon_Thanh_Cong() {
		 monan = new MonAn("","Sữa chua","tráng miệng",10,12000);
		Assert.assertTrue(serviceMA.suaMonAn("002",monan));
	}
	@Test
	 public void ham4_Sua_Mon_Sai() {
		 monan = new MonAn("","Sữa chua","tráng miệng",10,12000);
		Assert.assertFalse(serviceMA.suaMonAn("",monan));
	}
	@Test
	 public void ham5_Sua_Mon_Sai() {
		 monan = new MonAn("","Sữa chua","tráng miệng",10,12000);
		Assert.assertFalse(serviceMA.suaMonAn("999",monan));
	}
	@Test
	 public void ham6_Sua_Mon_Sai() {
		 monan = new MonAn("","Sữa chua","tráng miệng",10,12000);
		Assert.assertFalse(serviceMA.suaMonAn("@1 ",monan));
	}
	@Test
	 public void ham7_Sua_Mon_Sai() {
		 monan = new MonAn("","Sữa chua","tráng miệng",10,12000);
		Assert.assertFalse(serviceMA.suaMonAn(null,monan));
	}
}
