package phan3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGithubTest {

    public static void main(String[] args) throws InterruptedException {
        
        // Khởi tạo trình duyệt Chrome
        WebDriver driver = new ChromeDriver();
        
        // Phóng to cửa sổ
        driver.manage().window().maximize();

        System.out.println("Bắt đầu test Đăng Nhập...");
        driver.get("https://github.com/login"); // Vào thẳng trang login
        
        Thread.sleep(2000); // Tạm dừng 2s để chờ web tải xong
        
        // 1. Tìm ô nhập Username (ID của ô này trên Github là 'login_field') và điền chữ
        WebElement txtUsername = driver.findElement(By.id("login_field"));
        txtUsername.sendKeys("LuonghiepTest@gmail.com"); 
        
        // 2. Tìm ô nhập Password (ID là 'password') và điền mật khẩu
        WebElement txtPassword = driver.findElement(By.id("password"));
        txtPassword.sendKeys("MatKhauCuaEm123!");
        
        // 3. Tìm nút "Sign in" (Name là 'commit') và bấm click
        WebElement btnSignIn = driver.findElement(By.name("commit"));
        btnSignIn.click();
        
        Thread.sleep(3000); // Chờ xem kết quả

        // ==========================================
        // YÊU CẦU 1: ĐĂNG KÝ (Tới bước nhập thông tin)
        // ==========================================
        System.out.println("Bắt đầu test Đăng Ký...");
        // GitHub hiện tại dùng trang signup có giao diện animation khá phức tạp.
        // Ta sẽ điều hướng tới trang đăng ký
        driver.get("https://github.com/signup");
        
        Thread.sleep(5000); // Trang đăng ký của Github load animation khá lâu nên chờ 5s
        
        // Ô nhập email trên trang signup của Github hiện tại thường có id là 'email'
        try {
            WebElement txtEmailDangKy = driver.findElement(By.id("email"));
            txtEmailDangKy.sendKeys("luonghiepTest@gmail.com");
            WebElement txtPasswordDangKy = driver.findElement(By.id("password"));
            txtPasswordDangKy.sendKeys("MatKhauCuaEm123!");
            WebElement txtUsernameDangKy = driver.findElement(By.id("login"));
            txtUsernameDangKy.sendKeys("LuongHiepTestAuto");
            // Theo đề bài: Tới bước điền thông tin và bấm tiếp tục (nếu có) rồi dừng, không verify.
            // Bấm nút Continue (Do cấu trúc Github hay đổi, đây là ví dụ dùng CSS Selector)
            WebElement btnContinue = driver.findElement(By.xpath("//*[@id=\"signup-form\"]/form/div[2]/button"));
            btnContinue.click();
            
        } catch (Exception e) {
            System.out.println("Có lỗi khi tìm phần tử đăng ký do Github thay đổi giao diện: " + e.getMessage());
        }

        System.out.println("Hoàn thành script Automation!");
        
        // Tắt trình duyệt
         driver.quit(); 
    }
}