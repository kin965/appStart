import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class AppStr {

	public static void main(String[] args) throws InterruptedException, AWTException {
		ProcessBuilder pb = new ProcessBuilder(
				"�p�X");
		ProcessBuilder pb2 = new ProcessBuilder(
				"�p�X");

		try {
			pb.start();

			Thread.sleep(3000);

			Robot robot = new Robot();

			robot.keyPress(KeyEvent.VK_ENTER);

			String password = "�p�X���[�h";
			Thread.sleep(3000);
			for (char c : password.toCharArray()) {

				int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

				boolean upp = Character.isUpperCase(c);
				if (KeyEvent.CHAR_UNDEFINED == keyCode) {
					throw new RuntimeException("kkkkkkk");
				}
				if (upp) {
					robot.keyPress(KeyEvent.VK_SHIFT);
				}
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
				if (upp) {
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}
			}
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(7000);

			pb2.start();
			Thread.sleep(3000);
			String userName = "	dev�A�J�E���g";
			for (char c : userName.toCharArray()) {

				int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

				boolean upp = Character.isUpperCase(c);
				if (KeyEvent.CHAR_UNDEFINED == keyCode) {
					throw new RuntimeException("kkkkkkk");
				}
				if (upp) {
					robot.keyPress(KeyEvent.VK_SHIFT);
				}
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
				if (upp) {
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}
			}
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyPress(KeyEvent.VK_ENTER);


		} catch (IOException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}

	}

}
