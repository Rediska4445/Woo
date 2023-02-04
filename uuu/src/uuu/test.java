package uuu;

import java.io.IOException;

public class test {
	private static String FilePathImg1;
	private static String FilePathImg2;
	public static void main(String[] args) throws IOException, InterruptedException {
//		Runtime.getRuntime().exec();
	System.out.println("\" gg \"");
	for(int i = 0; true; i++) {
		Thread.sleep(5000);
		if(i % 2 == 0) {
			System.out.println("\" gg \"");
			Runtime.getRuntime().exec("reg add \"HKEY_CURRENT_USER\\Control Panel\\Desktop\" /v Wallpaper /t REG_SZ /d " + FilePathImg1 + " /f");
			for(int a = 0; a < 10; a++) {
				Thread.sleep(2000);
				Runtime.getRuntime().exec("RUNDLL32.EXE user32.dll,UpdatePerUserSystemParameters 1, True");
			}
		} else {
			System.out.println("\" gg \"");
			Runtime.getRuntime().exec("reg add \"HKEY_CURRENT_USER\\Control Panel\\Desktop\" /v Wallpaper /t REG_SZ /d " + FilePathImg2 + " /f");
			for(int a = 0; a < 10; a++) {
				Thread.sleep(2000);
				Runtime.getRuntime().exec("RUNDLL32.EXE user32.dll,UpdatePerUserSystemParameters 1, True");
				}
			}
		}
	}

}
