package com.github.solairerove.leprosorium.old.file.helpFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Help {
	String helpFile;

	Help(String name) {
		this.helpFile = name;
	}

	String getHelpFile() {
		return this.helpFile;
	}

	void setHelpFile(String name) {
		this.helpFile = name;
	}

	boolean helpOn(String what) {
		int ch;
		String topic, info;

		try (BufferedReader helpReader = new BufferedReader(new FileReader(helpFile))) {
			do {
				ch = helpReader.read();

				if (ch == '#') {
					topic = helpReader.readLine();
					if (what.compareTo(topic) == 0) {
						do {
							info = helpReader.readLine();
							if (info != null)
								System.out.println(info);
						} while ((info != null) && (info.compareTo("") != 0));
						return true;
					}
				}
			} while (ch != -1);
		} catch (IOException e) {
			System.out.println("Mothertrucker: " + e);
			return false;
		}
		return false;
	}

	String getSelection() {
		String topic = "";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter topic: ");
		try {
			topic = br.readLine();
		} catch (IOException e) {
			System.out.println("Error reading console.");
		}
		return topic;
	}
}