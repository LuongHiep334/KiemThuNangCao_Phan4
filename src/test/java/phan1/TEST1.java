package phan1;


import org.junit.*;



public class TEST1 {
	LocSoTu100den200 i;
	@Test
	public void ham1() {
		Assert.assertFalse(i.LocSo(99));
	}
	@Test
	public void ham2() {
		Assert.assertEquals(true, i.LocSo(101));
	}
	@Test
	public void ham3() {
		Assert.assertEquals(false, i.LocSo(201));
	}
	@Test
	public void ham4() {
		Assert.assertEquals(true, i.LocSo(199));
	}
	@Test
	public void ham5() {
		Assert.assertEquals(false, i.LocSo(150));
	}
	public static void main(String[] args) {
		LocSoTu100den200 j = new LocSoTu100den200();
		j.tu100den200();
	}
}
