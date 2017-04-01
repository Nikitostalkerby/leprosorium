package os.registry.demo;

import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

public class RegistryDemo {
	public static final String PREF_KEY = "folder";

	public static void main(String[] args) throws BackingStoreException {
		/*
		 * Write Preferences information to HKCU (HKEY_CURRENT_USER),
		 * HKCUSoftwareJavaSoftPrefscom.javacoderanch
		 */
		Preferences userPref = Preferences.userRoot();
		userPref.put(PREF_KEY, "Value in HKEY_CURRENT_USER");

		/*
		 * Below we read back the value we've written in the code above.
		 */
		System.out.println("Preferences = " + userPref.get(PREF_KEY, PREF_KEY + " was not found."));

		/*
		 * Write Preferences information to HKLM (HKEY_LOCAL_MACHINE),
		 * HKLMSoftwareJavaSoftPrefscom.javacoderanch
		 */
		Preferences systemPref = Preferences.systemRoot();
		systemPref.put(PREF_KEY, "Value in HKEY_LOCAL_MACHINE");

		/*
		 * Read back the value we've written in the code above.
		 */
		System.out.println("Preferences = " + systemPref.get(PREF_KEY, PREF_KEY + " was not found."));
	}
}