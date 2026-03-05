import java.io.*;
public class PracticeProblem {

	public static void main(String args[]) {
		
	}

	public static String getName (int Line, String name) {
		BufferedReader br = null;
		if (Line <= 0) {
			return "";
		}
		try {
			br = new BufferedReader(new FileReader(name));
			for (int i = 0; i < Line - 1; i++) {
				br.readLine();
			}
			String[] sus = br.readLine().split(" ");
			return sus[0] + " " + sus[1];
		} catch (IOException e) {
			return "";
		} catch (NullPointerException e) {
			return "";
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				System.out.println("u stupid");
			}
		}
	}
	public static int getAge (int Line, String name) {
		BufferedReader br = null;
		if (Line <= 0) {
			return -1;
		}
		try {
			br = new BufferedReader(new FileReader(name));
			for (int i = 0; i < Line - 1; i++) {
				br.readLine();
			}
			String[] sus = br.readLine().split(" ");
			return Integer.parseInt(sus[2]);
		} catch (IOException e) {
			return -1;
		} catch (NullPointerException e) {
			return -1;
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				System.out.println("u stupid");
			}
		}
	}
	public static int getNumber (int Line, String name) {
		BufferedReader br = null;
		if (Line <= 0) {
			return -1;
		}
		try {
			br = new BufferedReader(new FileReader(name));
			for (int i = 0; i < Line - 1; i++) {
				br.readLine();
			}
			String[] sus = br.readLine().split(" ");
			return Integer.parseInt(sus[3]);
		} catch (IOException e) {
			return -1;
		} catch (NullPointerException e) {
			return -1;
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				System.out.println("u stupid");
			}
		}
	}

	public static void fileAppend (String output, String filename) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(filename, true));
			bw.write(output);
		} catch (IOException e) {
			System.out.println("stupid");
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				System.out.println("u stoopid");
			}
		}
	}
}
