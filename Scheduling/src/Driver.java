import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Driver {
	
	/*
	 * General References:
	 * 
	 * Attribution Guide is from Stack Overflow website
	 * Link: https://stackoverflow.blog/2009/06/25/attribution-required/
	 * Author: Jeff Atwood
	 * Author's Profile Link:
	 * https://stackoverflow.blog/author/jeff-atwood/
	 * License: https://creativecommons.org/licenses/by-sa/3.0/
	 * [No changes were made]
	 * 
	 * prompt - https://www.merriam-webster.com/dictionary/prompt?msclkid=8efc4486a3ad11ec8eaf831c982d5644
	 * Absolute path - https://www.computerhope.com/jargon/a/absopath.htm?msclkid=9ef0fa13a3ab11ecb42078c04a2e99ff
	 * Java File Paths - Relative Path vs. Absolute Path - Input and Ouput Files - APPFICIAL - https://www.youtube.com/watch?v=xP6ML79RQRk
	 * Java String Methods - https://www.w3schools.com/java/java_ref_string.asp
	 * Java - Import CSV File Into An Array - https://www.youtube.com/watch?v=QeaXXpxNtq0
	 * Java - Calcualting the Rows and Columns In A CSV File - https://www.youtube.com/watch?v=ItV_qrRbImU
	 * 2D Arrays in Java - https://www.educba.com/2d-arrays-in-java/
	 * Which Java Package Is Automatically Imported Into Every Java Program? - https://glyphseeker.com/which-java-package-is-automatically-imported-into-every-java-program/
	 * Java Fields and Methods - https://javapointers.com/java/java-core/fields-and-methods/
	 * Operators in Java - https://www.javatpoint.com/operators-in-java#:~:text=Operators%20in%20Java.%20Operator%20in%20Java%20is%20a,Operator%20and%20%3B%20Assignment%20Operator.%20Java%20Operator%20Precedence
	 * Java Operators - https://www.w3schools.com/java/java_operators.asp
	 * How to solve a �java.lang.LinkageError: � between two JAR files? - https://ma.juii.net/blog/java-lang-linkageerror-between-two-jar-files
	 * 
	 * Error Guide is from Stack Overflow
	 * Link: https://stackoverflow.com/questions/10382929/how-to-fix-java-lang-unsupportedclassversionerror-unsupported-major-minor-versi
	 * Authors: Juha Palom�ki, Mark Rotteveel
	 * Authors' Profile Link (respectively):
	 * https://stackoverflow.com/users/350615/juha-palom%c3%a4ki
	 * https://stackoverflow.com/users/466862/mark-rotteveel
	 * License: https://creativecommons.org/licenses/by-sa/4.0/
	 * [No changes were made]
	 * 
	 * Version Guide is from Stack Overflow
	 * Link: https://stackoverflow.com/questions/10858193/java-jdk-sdk-se
	 * Authors: Simone Gianni, wgj
	 * Authors' Profile Link (respectively):
	 * https://stackoverflow.com/users/500916/simone-gianni
	 * https://stackoverflow.com/users/2529592/wgj
	 * License: https://creativecommons.org/licenses/by-sa/4.0/
	 * [No changes were made]
	 * 
	 * Check if a String Is an Integer in Java - https://www.delftstack.com/howto/java/how-to-check-if-a-string-is-an-integer-in-java/
	 * One Dimensional Array In Java � Tutorial & Example - https://javatutoring.com/java-one-dimensional-array/#:~:text=One-dimensional%20array%20in%20Java%20programming%20is%20an%20array,you%20want%20to%20be%20in%20the%20specified%20array.
	 * Guide to the Java ArrayList - https://www.baeldung.com/java-arraylist#:~:text=%20Guide%20to%20the%20Java%20ArrayList%20%201,There%20are%20two%20types%20of%20iterators...%20More%20?msclkid=dd259c32cee311ec82382666519ec7c2
	 * Java ArrayList - https://www.w3schools.com/java/java_arraylist.asp?msclkid=dd2629d8cee311eca99d7969fadc2034
	 * Arraylist java: Explanation to declare, initialize and print it with code example - https://www.arrowhitech.com/arraylist-java-explanation-to-declare-initialize-and-print-it-with-code-example/#:~:text=2d%20Arraylist%20Java%20uses%20arrays%20to%20store%20elements.,Java%20is%20that%20Arraylist%20Java%20is%20not%20synchronized.?msclkid=51a90cf6cef611ec9f42e5e6ff327978  
	 * Java Program to Convert Int to Double - https://www.tutorialgateway.org/java-program-to-convert-int-to-double/#:~:text=In%20Java%2C%20we%20can%20use%20the%20assignment%20operator,the%20integer%20to%20double%2C%20also%20called%20implicit%20typecasting.
	 * 2D ArrayList in Java - https://www.educba.com/2d-arraylist-in-java/?msclkid=51a993cfcef611ecb44ec2efff1ff1bc
	 * Sorting in Java - https://www.geeksforgeeks.org/sorting-in-java/
	 * Class Integer - https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html [License: https://download.oracle.com/otndocs/jcp/java_se-7-mrel-spec/license.html]
	 * 
	 */
	
	public int tq = 0;
	public int inputTable[][];
	public int id[];
	public int arrival[];
	public int burst[];
	public int priorityNo[];
	public int counter = 0;
	public int rows = 0;
	public int columns = 0;
	public int currentRow = 0;
	public int valid = 1;
	
	
	public Driver() {
		
	}
	
	//returns 1 if an element is found in an array; returns 0 otherwise
	public int arrayPresent(int[] arr, int element) {
		int present = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				present = 1;
			}
		}
		
		return present;
	}
	
	//returns 1 if an element is found in an array list, returns 0 otherwise
	public int arrayListPresent(ArrayList<Integer> list, int element) {
		int present = 0;
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == element) {
				present = 1;
			}
		}
		
		return present;
	}
	
	
	/*
	 * Class Character - https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html [License: https://download.oracle.com/otndocs/jcp/java_se-7-mrel-spec/license.html]
	 * Java String charAt() Method - https://www.w3schools.com/java/ref_string_charat.asp
	 * 
	 */
	public int isValidInput(String input) {
		int validity = 1;
		
		if (input.charAt(0) == '-') {
			validity = 0;
		}
		for (int i = 0; i < input.length(); i++) {
			if (Character.digit(input.charAt(i), 10) < 0) {
				validity = 0;
			}
		}
		
		return validity;
	}
	
	public void printIntArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}
	
	public void printIntArrayList(ArrayList<Integer> a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + ", ");
		}
		System.out.println();
	}
	
	public void printIntData(ArrayList<ArrayList<Integer>> a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + ", ");
		}
		System.out.println();
	}
	
	public int smallest(ArrayList<Integer> a) {
		int smallest = 100000;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) < smallest) {
				smallest = a.get(i);
			}
		}
		return smallest;
	}
	
	
	
	
	/*
	 * File Handling in Java | Reading and Writing File in Java | Java Training | Edureka - https://www.youtube.com/watch?v=SslMi6ptwH8
	 * How to determine file type - https://docs.groupdocs.com/viewer/java/how-to-determine-file-type/#:~:text=Determine%20file-type%20by%20the%20file%20extension%20To%20determine,extension%20%2B%20%22%3B%20File%20type%3A%20%22%20%2B%20fileType%29%3B
	 * Enum FileType - https://apireference.groupdocs.com/viewer/java/com.groupdocs.viewer/FileType
	 * Determining a File Type In Java - https://dzone.com/articles/determining-file-type-in-java#:~:text=Determining%20a%20File%20Type%20In%20Java%201%20Files.probeContentType,MimetypesFileTypeMap.getContentType%20%28String%29%203%20URLConnection.getContentType%20%28%29%204%20Apache%20Tika
	 * Why is Scanner skipping nextLine() after use of other next functions? - https://www.geeksforgeeks.org/why-is-scanner-skipping-nextline-after-use-of-other-next-functions/
	 * 
	 */
	
	public void start() {
		
		Scanner inScanner = new Scanner(System.in);
		
		System.out.println("Please input the absolute file path of the csv file:");
		String filePath = inScanner.nextLine();
		String fileExtension = "";
		System.out.println();
		/*
		 * How to Get the File Extension of a File in Java - https://www.baeldung.com/java-file-extension
		 * Java String contains() Method - https://www.w3schools.com/java/ref_string_contains.asp
		 * Java String lastIndexOf() Method - https://www.w3schools.com/java/ref_string_lastindexof.asp
		 * Java String substring() - https://www.javatpoint.com/java-string-substring#:~:text=Java%20String%20substring%20%28%29%20The%20java%20string%20substring,are%20two%20types%20of%20substring%20methods%20in%20
		 * Java String equals() Method - https://www.w3schools.com/java/ref_string_equals.asp
		 * split() Function in Java - https://www.educba.com/split-function-in-java/
		 * Java Double parseDouble() Method - https://www.javatpoint.com/java-double-parsedouble-method#:~:text=Java%20Double%20parseDouble%20%28%29%20Method%20The%20parseDouble%20method,same%20as%20valueOf%20%28%29%20method%20of%20Float%20class.
		 * Class Double - https://docs.oracle.com/javase/7/docs/api/java/lang/Double.html [License: https://download.oracle.com/otndocs/jcp/java_se-7-mrel-spec/license.html]
		 * Java Integer parseInt() Method - https://www.javatpoint.com/java-integer-parseint-method
		 * Java Escape Characters - https://www.javatpoint.com/java-escape-characters#:~:text=What%20are%20escape%20characters%3F%20In%20Java%2C%20if%20a,to%20the%20compiler.%20List%20of%20Java%20Escape%20Characters
		 * Class Collections - https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html [License: https://download.oracle.com/otndocs/jcp/java_se-7-mrel-spec/license.html]
		 *
		 */
		if (filePath.contains(".") == true) {
			fileExtension = filePath.substring(filePath.lastIndexOf(".") + 1);
			if (fileExtension.equals("csv")) {
				try {
					File f = new File(filePath);
					Scanner fileReader = new Scanner(f);
					while(fileReader.hasNextLine()) {
						String output = fileReader.nextLine();
						counter++;
						if (counter > 3) {
							String[] tmpArray = output.split(",");
							rows++;
							columns = tmpArray.length;
						}
					}
					inputTable = new int[rows][columns];
					fileReader.close();
					
					counter = 0;
					Scanner fileReader2 = new Scanner(f);
					while(fileReader2.hasNextLine()) {
						String output = fileReader2.nextLine();
						counter++;
						if ((counter == 2) && (valid == 1)) {
							if (isValidInput(output) == 1) {
								tq = Integer.parseInt(output);
							} else if (isValidInput(output) == 0) {
								valid = 0;
								System.out.println("Error found in the inputs, please fix your inputs and try again");
							}
						}
						if ((counter > 3) && (valid == 1)) {
							String[] tmpArray2 = output.split(",");
							for (int i = 0; i < tmpArray2.length; i++) {
								if (isValidInput(tmpArray2[i]) == 1) {
									inputTable[currentRow][i] = Integer.parseInt(tmpArray2[i]);
								} else if (isValidInput(tmpArray2[i]) == 0) {
									valid = 0;
									System.out.println("Error found in the inputs, please fix your inputs and try again");
								}
								
							}
							currentRow++;
						}
					}
					fileReader2.close();
					
					if (valid == 1) {
						
						id = new int[inputTable.length];
						arrival = new int[inputTable.length];
						burst = new int[inputTable.length];
						priorityNo = new int[inputTable.length];
						
						for (int i = 0; i < 4; i++) {
							for (int j = 0; j < inputTable.length; j++) {
								if (i == 0) {
									id[j] = inputTable[j][i];
								}
								if (i == 1) {
									arrival[j] = inputTable[j][i];
								}
								if (i == 2) {
									burst[j] = inputTable[j][i];
								}
								if (i == 3) {
									priorityNo[j] = inputTable[j][i];
								}
							}
						}
						
						int question = 0;
						int choice = -1;
						String choiceString = "";
						Scanner input = new Scanner(System.in);
						while (choice != 7) {
							while ((choice < 0) || (choice > 7) || (question == 0) || (isValidInput(choiceString) == 0)) {
								System.out.println("Please select a CPU Scheduling algorithm (or enter 7 to exit): \n"
													+ "1. First-Come, First-Served \n"
													+ "2. Shortest-Job-First \n"
													+ "3. Shortest-Remaining-Time-First \n"
													+ "4. Priority Preemptive \n"
													+ "5. Priority Non-Preemptive \n"
													+ "6. Round-Robin \n"
													+ "7. Exit \n");
								choiceString = input.nextLine();
								if (isValidInput(choiceString) == 1) {
									choice = Integer.parseInt(choiceString);
								}
								question = 1;
							}
							
							if (choice == 1) { //First-Come, First-Served
								ArrayList<Integer> doneId = new ArrayList<Integer>();
								ArrayList<Integer> times = new ArrayList<Integer>();
								ArrayList<Integer> tmpId = new ArrayList<Integer>();
								times.add(0);
								int currentTime = 0;
								int minimum = 100000;
								int pastMinimum = -1;
								int added = 0;
								
								while (added < id.length) {
									int minimumFound = 0;
									int blank = 0;
									while(minimumFound == 0) {
										for (int i = 0; i < arrival.length; i++) {
											if (arrival[i] <= currentTime) {
												if ((arrival[i] < minimum) && (arrival[i] > pastMinimum)) {
													minimum = arrival[i];
													minimumFound = 1;
												}
											}
										}
										if (minimumFound == 0) {
											blank = 1;
											currentTime = currentTime + 1;
										}
									}
									
									if(blank == 1) {
										doneId.add(-1);
										times.add(currentTime);
									}
									
									for (int i = 0; i < arrival.length; i++) {
										if (arrival[i] == minimum) {
											int addedId = arrayListPresent(tmpId, id[i]);
											if (addedId == 0) {
												tmpId.add(id[i]);
											}
										}
									}
									
									Collections.sort(tmpId);
									
									for (int i = 0; i < tmpId.size(); i++) {
										for (int j = 0; j < id.length; j++) {
											if (tmpId.get(i) == id[j]) {
												int addedId = arrayListPresent(doneId, id[j]);
												
												if (addedId == 0) {
													doneId.add(id[j]);
													currentTime = currentTime + burst[j];
													times.add(currentTime);
													added++;
												}
											}
										}
										
									}
									
									
									
									pastMinimum = minimum;
									minimum = 100000;
									tmpId.clear();
								}																
								
								ArrayList<Integer> CompTime = new ArrayList<Integer>();
								for (int i = 0; i < id.length; i++) {
									for (int j = 0; j < doneId.size(); j++) {
										if (doneId.get(j) == id[i]) {
											CompTime.add(times.get(j + 1));
										}
									}
								}
								
								System.out.println("Completion Time: ");
								for (int i = 0; i < id.length; i++) {	
									System.out.println("P" + id[i] + " - " + CompTime.get(i));	
								}
								
								ArrayList<Integer> FirstTime = new ArrayList<Integer>();
								for (int i = 0; i < id.length; i++) {
									for (int j = 0; j < doneId.size(); j++) {
										if (doneId.get(j) == id[i]) {
											FirstTime.add(times.get(j));
										}
									}
								}
								
								System.out.println("\nResponse Time: ");
								int totalResponse = 0;
								for (int i = 0; i < id.length; i++) {	
									int response = FirstTime.get(i) - arrival[i];
									System.out.println("P" + id[i] + " - " + response);	
									totalResponse = totalResponse + response;
								}
								double totalResponseD = totalResponse;
								double avgResponse = totalResponseD/id.length;
								System.out.println("Average Response Time: " + avgResponse);
								
								//response is the same as waiting in First-Come, First-Served
								System.out.println("\nWaiting Time: ");
								int totalWaiting = 0;
								for (int i = 0; i < id.length; i++) {	
									int waiting = FirstTime.get(i) - arrival[i];
									System.out.println("P" + id[i] + " - " + waiting);	
									totalWaiting = totalWaiting + waiting;
								}
								double totalWaitingD = totalWaiting;
								double avgWaiting = totalWaitingD/id.length;
								System.out.println("Average Waiting Time: " + avgWaiting);
								
								System.out.println("\nTurnaround Time: ");
								int totalTurnaround = 0;
								for (int i = 0; i < id.length; i++) {	
									int turnaround = CompTime.get(i) - arrival[i];
									System.out.println("P" + id[i] + " - " + turnaround);	
									totalTurnaround = totalTurnaround + turnaround;
								}
								double totalTurnaroundD = totalTurnaround;
								double avgTurnaround = totalTurnaroundD/id.length;
								System.out.println("Average Turnaround Time: " + avgTurnaround);
								
								System.out.println("\nGantt Chart:");
								for (int i = 0; i < doneId.size(); i++) {
									System.out.print(times.get(i) + "--");
									if (doneId.get(i) == -1) {
										System.out.print("WAIT--");
									} else {
										System.out.print("P" + doneId.get(i) + "--");
									}
								}
								System.out.println(times.get(doneId.size()));
								System.out.println();
							}
							else if (choice == 2) { //Shortest-Job-First
								ArrayList<Integer> doneId = new ArrayList<Integer>();
								ArrayList<Integer> times = new ArrayList<Integer>();
								ArrayList<ArrayList<Integer>> addedData = new ArrayList<ArrayList<Integer>>();
								times.add(0);
								int currentTime = 0;
								int minimum = 100000;
								int pastMinimum = -1;
								int added = 0;
								
								while (added < id.length) {
									int minimumFound = 0;
									int blank = 0;
									while(minimumFound == 0) {
										for (int i = 0; i < burst.length; i++) {
											if (arrival[i] <= currentTime) {
												if ((burst[i] < minimum) && (arrayListPresent(doneId, id[i]) == 0)) {
													minimum = burst[i];
													minimumFound = 1;
												}
											}
										}
										if (minimumFound == 0) {
											blank = 1;
											currentTime = currentTime + 1;
										}
									}
									
									if(blank == 1) {
										doneId.add(-1);
										times.add(currentTime);
									}
									
									for (int i = 0; i < burst.length; i++) {
										if (arrival[i] <= currentTime) {
											if ((burst[i] == minimum) && (arrayListPresent(doneId, id[i]) == 0)) {
												addedData.add(new ArrayList<Integer>());
												addedData.get(addedData.size() - 1).add(id[i]);
												addedData.get(addedData.size() - 1).add(arrival[i]);
												addedData.get(addedData.size() - 1).add(burst[i]);
											}
										}
										
									}
									//sort addedData by arrival time, then id number
									for (int i = 0; i < addedData.size(); i++) {				
										for (int i2 = i + 1; i2 < addedData.size(); i2++) {
											if(addedData.get(i).get(1) > addedData.get(i2).get(1)) {
												ArrayList<Integer> tmpal = addedData.get(i);
												addedData.set(i, addedData.get(i2));
												addedData.set(i2, tmpal);
											} 
											else if (addedData.get(i).get(1) == addedData.get(i2).get(1)) {
												if (addedData.get(i).get(0) > addedData.get(i2).get(0)) {
													ArrayList<Integer> tmpal = addedData.get(i);
													addedData.set(i, addedData.get(i2));
													addedData.set(i2, tmpal);
												}
											}
										}
									}
									
									for (int i = 0; i < addedData.size(); i++) {
											doneId.add(addedData.get(i).get(0));
											currentTime = currentTime + addedData.get(i).get(2);
											times.add(currentTime);
											added++;
									}
									addedData.clear();
									pastMinimum = minimum;
									minimum = 100000;
								}																
								
								ArrayList<Integer> CompTime = new ArrayList<Integer>();
								for (int i = 0; i < id.length; i++) {
									for (int j = 0; j < doneId.size(); j++) {
										if (doneId.get(j) == id[i]) {
											CompTime.add(times.get(j + 1));
										}
									}
								}
								
								System.out.println("Completion Time: ");
								for (int i = 0; i < id.length; i++) {	
									System.out.println("P" + id[i] + " - " + CompTime.get(i));	
								}
								
								ArrayList<Integer> FirstTime = new ArrayList<Integer>();
								for (int i = 0; i < id.length; i++) {
									for (int j = 0; j < doneId.size(); j++) {
										if (doneId.get(j) == id[i]) {
											FirstTime.add(times.get(j));
										}
									}
								}
								
								System.out.println("\nResponse Time: ");
								int totalResponse = 0;
								for (int i = 0; i < id.length; i++) {	
									int response = FirstTime.get(i) - arrival[i];
									System.out.println("P" + id[i] + " - " + response);	
									totalResponse = totalResponse + response;
								}
								double totalResponseD = totalResponse;
								double avgResponse = totalResponseD/id.length;
								System.out.println("Average Response Time: " + avgResponse);
								
								//response is the same as waiting in Shortest-Job-First
								System.out.println("\nWaiting Time: ");
								int totalWaiting = 0;
								for (int i = 0; i < id.length; i++) {	
									int waiting = FirstTime.get(i) - arrival[i];
									System.out.println("P" + id[i] + " - " + waiting);	
									totalWaiting = totalWaiting + waiting;
								}
								double totalWaitingD = totalWaiting;
								double avgWaiting = totalWaitingD/id.length;
								System.out.println("Average Waiting Time: " + avgWaiting);
								
								System.out.println("\nTurnaround Time: ");
								int totalTurnaround = 0;
								for (int i = 0; i < id.length; i++) {	
									int turnaround = CompTime.get(i) - arrival[i];
									System.out.println("P" + id[i] + " - " + turnaround);	
									totalTurnaround = totalTurnaround + turnaround;
								}
								double totalTurnaroundD = totalTurnaround;
								double avgTurnaround = totalTurnaroundD/id.length;
								System.out.println("Average Turnaround Time: " + avgTurnaround);
								
								System.out.println("\nGantt Chart:");
								for (int i = 0; i < doneId.size(); i++) {
									System.out.print(times.get(i) + "--");
									if (doneId.get(i) == -1) {
										System.out.print("WAIT--");
									} else {
										System.out.print("P" + doneId.get(i) + "--");
									}
								}
								System.out.println(times.get(doneId.size()));
								System.out.println();
								
								
							}
							else if (choice == 3) { //Shortest-Remaining-Time-First
								ArrayList<Integer> GanttId = new ArrayList<Integer>();
								ArrayList<Integer> times = new ArrayList<Integer>();
								ArrayList<ArrayList<Integer>> addedData = new ArrayList<ArrayList<Integer>>();
								int currentTime = 0;
								int added = 0;
								
								for (int i = 0; i < burst.length; i++) {
									
									addedData.add(new ArrayList<Integer>());
									addedData.get(addedData.size() - 1).add(id[i]);
									addedData.get(addedData.size() - 1).add(arrival[i]);
									addedData.get(addedData.size() - 1).add(burst[i]);	
									addedData.get(addedData.size() - 1).add(0);
									
								}
							
								
								int pastId = -1;
								
								while (added < id.length) {
									//sort addedData by burst time, then arrival time, then id number
									for (int i = 0; i < addedData.size(); i++) {				
										for (int i2 = i + 1; i2 < addedData.size(); i2++) {
											if(addedData.get(i).get(2) > addedData.get(i2).get(2)) {
												ArrayList<Integer> tmpal = addedData.get(i);
												addedData.set(i, addedData.get(i2));
												addedData.set(i2, tmpal);
											} 
											else if (addedData.get(i).get(2) == addedData.get(i2).get(2)) {
												if (addedData.get(i).get(1) > addedData.get(i2).get(1)) {
													ArrayList<Integer> tmpal = addedData.get(i);
													addedData.set(i, addedData.get(i2));
													addedData.set(i2, tmpal);
												}
												else if (addedData.get(i).get(1) == addedData.get(i2).get(1)) {
													if (addedData.get(i).get(0) > addedData.get(i2).get(0)) {
														ArrayList<Integer> tmpal = addedData.get(i);
														addedData.set(i, addedData.get(i2));
														addedData.set(i2, tmpal);
													}
												}
											}
										}
									}
									
									int found = 0;
									
									for (int i = 0; i < addedData.size(); i++) {
										if (addedData.get(i).get(1) <= currentTime) {
											if (found == 0) {
												if (pastId != addedData.get(i).get(0)) {
													GanttId.add(addedData.get(i).get(0));
													times.add(currentTime);
												}
												pastId = addedData.get(i).get(0);
												currentTime = currentTime + 1;
												found = 1;
												int newBurst = addedData.get(i).get(2) - 1;
												addedData.get(i).set(2, newBurst);
												if (addedData.get(i).get(2) == 0) {
													addedData.remove(i);
													added++;
													if (addedData.size() == 0) {
														times.add(currentTime);
													}
												}
											}
										}	
									}
									
									if (found == 0) {
										if ((pastId != -1) || (GanttId.size() == 0)) {
											GanttId.add(-1);
											times.add(currentTime);
											pastId = -1;
										}
										
										currentTime = currentTime + 1;
									}					
									
								}
								
								ArrayList<Integer> CompTime = new ArrayList<Integer>();
								for (int i = 0; i < id.length; i++) {
									int present = 0;
									for (int j = 0; j < GanttId.size(); j++) {
										if (GanttId.get(j) == id[i]) {
											if (present == 0) {
												CompTime.add(times.get(j + 1));
												present = 1;
											}
											else if (present == 1) {
												CompTime.set(CompTime.size() - 1, times.get(j + 1));
											}
											
										}
									}
								}
								
								System.out.println("Completion Time: ");
								for (int i = 0; i < id.length; i++) {	
									System.out.println("P" + id[i] + " - " + CompTime.get(i));	
								}
								
								ArrayList<Integer> FirstTime = new ArrayList<Integer>();
								for (int i = 0; i < id.length; i++) {
									int present = 0;
									for (int j = 0; j < GanttId.size(); j++) {
										if (GanttId.get(j) == id[i]) {
											if (present == 0) {
												FirstTime.add(times.get(j));
												present = 1;
											}
										}
									}
								}
								
								ArrayList<Integer> ResponseTime = new ArrayList<Integer>();
								System.out.println("\nResponse Time: ");
								int totalResponse = 0;
								for (int i = 0; i < id.length; i++) {	
									int response = FirstTime.get(i) - arrival[i];
									System.out.println("P" + id[i] + " - " + response);	
									ResponseTime.add(response);
									totalResponse = totalResponse + response;
								}
								double totalResponseD = totalResponse;
								double avgResponse = totalResponseD/id.length;
								System.out.println("Average Response Time: " + avgResponse);
								
								System.out.println("\nWaiting Time: ");
								int totalWaiting = 0;
								for (int i = 0; i < id.length; i++) {
									int preemptedTime = 0;
									int pastTime = -1;
									for (int j = 0; j < GanttId.size(); j++) {
										if (GanttId.get(j) == id[i]) {
											if (pastTime != -1) {
												preemptedTime = preemptedTime + times.get(j) - pastTime;
											} 
											pastTime = times.get(j + 1);
										}
									}
									
									int waiting = ResponseTime.get(i) + preemptedTime;
									System.out.println("P" + id[i] + " - " + waiting);	
									totalWaiting = totalWaiting + waiting;
								}
								double totalWaitingD = totalWaiting;
								double avgWaiting = totalWaitingD/id.length;
								System.out.println("Average Waiting Time: " + avgWaiting);
								
								System.out.println("\nTurnaround Time: ");
								int totalTurnaround = 0;
								for (int i = 0; i < id.length; i++) {	
									int turnaround = CompTime.get(i) - arrival[i];
									System.out.println("P" + id[i] + " - " + turnaround);	
									totalTurnaround = totalTurnaround + turnaround;
								}
								double totalTurnaroundD = totalTurnaround;
								double avgTurnaround = totalTurnaroundD/id.length;
								System.out.println("Average Turnaround Time: " + avgTurnaround);
								
								System.out.println("\nGantt Chart:");
								for (int i = 0; i < GanttId.size(); i++) {
									System.out.print(times.get(i) + "--");
									if (GanttId.get(i) == -1) {
										System.out.print("WAIT--");
									} else {
										System.out.print("P" + GanttId.get(i) + "--");
									}
								}
								System.out.println(times.get(GanttId.size()));
								System.out.println();								
								
							}
							else if (choice == 4) {  //Priority Preemptive
								
								ArrayList<Integer> GanttId = new ArrayList<Integer>();
								ArrayList<Integer> times = new ArrayList<Integer>();
								ArrayList<ArrayList<Integer>> addedData = new ArrayList<ArrayList<Integer>>();
								int currentTime = 0;
								int added = 0;
								
								for (int i = 0; i < priorityNo.length; i++) {
									
									addedData.add(new ArrayList<Integer>());
									addedData.get(addedData.size() - 1).add(id[i]);
									addedData.get(addedData.size() - 1).add(arrival[i]);
									addedData.get(addedData.size() - 1).add(burst[i]);	
									addedData.get(addedData.size() - 1).add(priorityNo[i]);
									
								}
							
								
								int pastId = -1;
								
								while (added < id.length) {
									//sort addedData by priority number, then arrival time, then id number
									for (int i = 0; i < addedData.size(); i++) {				
										for (int i2 = i + 1; i2 < addedData.size(); i2++) {
											if(addedData.get(i).get(3) > addedData.get(i2).get(3)) {
												ArrayList<Integer> tmpal = addedData.get(i);
												addedData.set(i, addedData.get(i2));
												addedData.set(i2, tmpal);
											} 
											else if (addedData.get(i).get(3) == addedData.get(i2).get(3)) {
												if (addedData.get(i).get(1) > addedData.get(i2).get(1)) {
													ArrayList<Integer> tmpal = addedData.get(i);
													addedData.set(i, addedData.get(i2));
													addedData.set(i2, tmpal);
												}
												else if (addedData.get(i).get(1) == addedData.get(i2).get(1)) {
													if (addedData.get(i).get(0) > addedData.get(i2).get(0)) {
														ArrayList<Integer> tmpal = addedData.get(i);
														addedData.set(i, addedData.get(i2));
														addedData.set(i2, tmpal);
													}
												}
											}
										}
									}
									
									int found = 0;
									
									for (int i = 0; i < addedData.size(); i++) {
										if (addedData.get(i).get(1) <= currentTime) {
											if (found == 0) {
												if (pastId != addedData.get(i).get(0)) {
													GanttId.add(addedData.get(i).get(0));
													times.add(currentTime);
												}
												pastId = addedData.get(i).get(0);
												currentTime = currentTime + 1;
												found = 1;
												int newBurst = addedData.get(i).get(2) - 1;
												addedData.get(i).set(2, newBurst);
												if (addedData.get(i).get(2) == 0) {
													addedData.remove(i);
													added++;
													if (addedData.size() == 0) {
														times.add(currentTime);
													}
												}
											}
										}	
									}
									
									if (found == 0) {
										if ((pastId != -1) || (GanttId.size() == 0)) {
											GanttId.add(-1);
											times.add(currentTime);
											pastId = -1;
										}
										
										currentTime = currentTime + 1;
									}					
									
								}
								
								ArrayList<Integer> CompTime = new ArrayList<Integer>();
								for (int i = 0; i < id.length; i++) {
									int present = 0;
									for (int j = 0; j < GanttId.size(); j++) {
										if (GanttId.get(j) == id[i]) {
											if (present == 0) {
												CompTime.add(times.get(j + 1));
												present = 1;
											}
											else if (present == 1) {
												CompTime.set(CompTime.size() - 1, times.get(j + 1));
											}
											
										}
									}
								}
								
								System.out.println("Completion Time: ");
								for (int i = 0; i < id.length; i++) {	
									System.out.println("P" + id[i] + " - " + CompTime.get(i));	
								}
								
								ArrayList<Integer> FirstTime = new ArrayList<Integer>();
								for (int i = 0; i < id.length; i++) {
									int present = 0;
									for (int j = 0; j < GanttId.size(); j++) {
										if (GanttId.get(j) == id[i]) {
											if (present == 0) {
												FirstTime.add(times.get(j));
												present = 1;
											}
										}
									}
								}
								
								ArrayList<Integer> ResponseTime = new ArrayList<Integer>();
								System.out.println("\nResponse Time: ");
								int totalResponse = 0;
								for (int i = 0; i < id.length; i++) {	
									int response = FirstTime.get(i) - arrival[i];
									System.out.println("P" + id[i] + " - " + response);	
									ResponseTime.add(response);
									totalResponse = totalResponse + response;
								}
								double totalResponseD = totalResponse;
								double avgResponse = totalResponseD/id.length;
								System.out.println("Average Response Time: " + avgResponse);
								
								System.out.println("\nWaiting Time: ");
								int totalWaiting = 0;
								for (int i = 0; i < id.length; i++) {
									int preemptedTime = 0;
									int pastTime = -1;
									for (int j = 0; j < GanttId.size(); j++) {
										if (GanttId.get(j) == id[i]) {
											if (pastTime != -1) {
												preemptedTime = preemptedTime + times.get(j) - pastTime;
											} 
											pastTime = times.get(j + 1);
										}
									}
									
									int waiting = ResponseTime.get(i) + preemptedTime;
									System.out.println("P" + id[i] + " - " + waiting);	
									totalWaiting = totalWaiting + waiting;
								}
								double totalWaitingD = totalWaiting;
								double avgWaiting = totalWaitingD/id.length;
								System.out.println("Average Waiting Time: " + avgWaiting);
								
								System.out.println("\nTurnaround Time: ");
								int totalTurnaround = 0;
								for (int i = 0; i < id.length; i++) {	
									int turnaround = CompTime.get(i) - arrival[i];
									System.out.println("P" + id[i] + " - " + turnaround);	
									totalTurnaround = totalTurnaround + turnaround;
								}
								double totalTurnaroundD = totalTurnaround;
								double avgTurnaround = totalTurnaroundD/id.length;
								System.out.println("Average Turnaround Time: " + avgTurnaround);
								
								System.out.println("\nGantt Chart:");
								for (int i = 0; i < GanttId.size(); i++) {
									System.out.print(times.get(i) + "--");
									if (GanttId.get(i) == -1) {
										System.out.print("WAIT--");
									} else {
										System.out.print("P" + GanttId.get(i) + "--");
									}
								}
								System.out.println(times.get(GanttId.size()));
								System.out.println();		
								
							}
							else if (choice == 5) {  //Priority Non-Preemptive
								
								ArrayList<Integer> doneId = new ArrayList<Integer>();
								ArrayList<Integer> times = new ArrayList<Integer>();
								ArrayList<ArrayList<Integer>> addedData = new ArrayList<ArrayList<Integer>>();
								times.add(0);
								int currentTime = 0;
								int minimum = 100000;
								int added = 0;
								
								while (added < id.length) {
									int minimumFound = 0;
									int blank = 0;
									while(minimumFound == 0) {
										for (int i = 0; i < priorityNo.length; i++) {
											if (arrival[i] <= currentTime) {
												if ((priorityNo[i] < minimum) && (arrayListPresent(doneId, id[i]) == 0)) {
													minimum = priorityNo[i];
													minimumFound = 1;
												}
											}
										}
										if (minimumFound == 0) {
											blank = 1;
											currentTime = currentTime + 1;
										}
									}
									
									if(blank == 1) {
										doneId.add(-1);
										times.add(currentTime);
									}
									
									for (int i = 0; i < burst.length; i++) {
										if (arrival[i] <= currentTime) {
											if ((priorityNo[i] == minimum) && (arrayListPresent(doneId, id[i]) == 0)) {
												addedData.add(new ArrayList<Integer>());
												addedData.get(addedData.size() - 1).add(id[i]);
												addedData.get(addedData.size() - 1).add(arrival[i]);
												addedData.get(addedData.size() - 1).add(burst[i]);
												addedData.get(addedData.size() - 1).add(priorityNo[i]);
											}
										}
										
										
									}
									//sort addedData by priority number, then arrival time, then id number
									for (int i = 0; i < addedData.size(); i++) {				
										for (int i2 = i + 1; i2 < addedData.size(); i2++) {
											if(addedData.get(i).get(3) > addedData.get(i2).get(3)) {
												ArrayList<Integer> tmpal = addedData.get(i);
												addedData.set(i, addedData.get(i2));
												addedData.set(i2, tmpal);
											} 
											else if (addedData.get(i).get(3) == addedData.get(i2).get(3)) {
												if (addedData.get(i).get(1) > addedData.get(i2).get(1)) {
													ArrayList<Integer> tmpal = addedData.get(i);
													addedData.set(i, addedData.get(i2));
													addedData.set(i2, tmpal);
												}
												else if (addedData.get(i).get(1) == addedData.get(i2).get(1)) {
													if (addedData.get(i).get(0) > addedData.get(i2).get(0)) {
														ArrayList<Integer> tmpal = addedData.get(i);
														addedData.set(i, addedData.get(i2));
														addedData.set(i2, tmpal);
													}
												}
											}
										}
									}
									
									for (int i = 0; i < addedData.size(); i++) {
											doneId.add(addedData.get(i).get(0));
											currentTime = currentTime + addedData.get(i).get(2);
											times.add(currentTime);
											added++;
									}
									
									addedData.clear();
									minimum = 100000;
								}																
								
								ArrayList<Integer> CompTime = new ArrayList<Integer>();
								for (int i = 0; i < id.length; i++) {
									for (int j = 0; j < doneId.size(); j++) {
										if (doneId.get(j) == id[i]) {
											CompTime.add(times.get(j + 1));
										}
									}
								}
								
								System.out.println("Completion Time: ");
								for (int i = 0; i < id.length; i++) {	
									System.out.println("P" + id[i] + " - " + CompTime.get(i));	
								}
								
								ArrayList<Integer> FirstTime = new ArrayList<Integer>();
								for (int i = 0; i < id.length; i++) {
									for (int j = 0; j < doneId.size(); j++) {
										if (doneId.get(j) == id[i]) {
											FirstTime.add(times.get(j));
										}
									}
								}
								
								System.out.println("\nResponse Time: ");
								int totalResponse = 0;
								for (int i = 0; i < id.length; i++) {	
									int response = FirstTime.get(i) - arrival[i];
									System.out.println("P" + id[i] + " - " + response);	
									totalResponse = totalResponse + response;
								}
								double totalResponseD = totalResponse;
								double avgResponse = totalResponseD/id.length;
								System.out.println("Average Response Time: " + avgResponse);
								
								//response is the same as waiting in Priority Non-Preemptive
								System.out.println("\nWaiting Time: ");
								int totalWaiting = 0;
								for (int i = 0; i < id.length; i++) {	
									int waiting = FirstTime.get(i) - arrival[i];
									System.out.println("P" + id[i] + " - " + waiting);	
									totalWaiting = totalWaiting + waiting;
								}
								double totalWaitingD = totalWaiting;
								double avgWaiting = totalWaitingD/id.length;
								System.out.println("Average Waiting Time: " + avgWaiting);
								
								System.out.println("\nTurnaround Time: ");
								int totalTurnaround = 0;
								for (int i = 0; i < id.length; i++) {	
									int turnaround = CompTime.get(i) - arrival[i];
									System.out.println("P" + id[i] + " - " + turnaround);	
									totalTurnaround = totalTurnaround + turnaround;
								}
								double totalTurnaroundD = totalTurnaround;
								double avgTurnaround = totalTurnaroundD/id.length;
								System.out.println("Average Turnaround Time: " + avgTurnaround);
								
								System.out.println("\nGantt Chart:");
								for (int i = 0; i < doneId.size(); i++) {
									System.out.print(times.get(i) + "--");
									if (doneId.get(i) == -1) {
										System.out.print("WAIT--");
									} else {
										System.out.print("P" + doneId.get(i) + "--");
									}
								}
								System.out.println(times.get(doneId.size()));
								System.out.println();
								
							}
							else if (choice == 6) { //Round-Robin
								ArrayList<Integer> GanttId = new ArrayList<Integer>();
								ArrayList<Integer> times = new ArrayList<Integer>();
								ArrayList<Integer> rrQueue = new ArrayList<Integer>();
								ArrayList<ArrayList<Integer>> addedData = new ArrayList<ArrayList<Integer>>();
								times.add(0);
								int currentTime = 0;
								int added = 0;
								
								for (int i = 0; i < burst.length; i++) {
									
									addedData.add(new ArrayList<Integer>());
									addedData.get(addedData.size() - 1).add(id[i]);
									addedData.get(addedData.size() - 1).add(arrival[i]);
									addedData.get(addedData.size() - 1).add(burst[i]);
									addedData.get(addedData.size() - 1).add(0);
								
								}
	
								while (added < id.length) {
									//sort addedData by arrival time, then id number
									for (int i = 0; i < addedData.size(); i++) {				
										for (int i2 = i + 1; i2 < addedData.size(); i2++) {
											if(addedData.get(i).get(1) > addedData.get(i2).get(1)) {
												ArrayList<Integer> tmpal = addedData.get(i);
												addedData.set(i, addedData.get(i2));
												addedData.set(i2, tmpal);
											} 
											else if (addedData.get(i).get(1) == addedData.get(i2).get(1)) {
												if (addedData.get(i).get(0) > addedData.get(i2).get(0)) {
													ArrayList<Integer> tmpal = addedData.get(i);
													addedData.set(i, addedData.get(i2));
													addedData.set(i2, tmpal);
												}
											}
										}
									}
									
									for (int j = 0; j < addedData.size(); j++) {
										if (addedData.get(j).get(1) <= currentTime) {
											if (arrayListPresent(rrQueue, addedData.get(j).get(0)) == 0) {
												rrQueue.add(addedData.get(j).get(0));
											}
										}
									}
									int found = 0;
									while (rrQueue.size() > 0) {
										for (int j = 0; j < addedData.size(); j++) {
											if (rrQueue.size() > 0) {
												if (rrQueue.get(0) == addedData.get(j).get(0)) {
													if (addedData.get(j).get(2) > tq) {
														addedData.get(j).set(2, addedData.get(j).get(2) - tq);
														for (int ct = currentTime + 1; ct < currentTime + 1 + tq; ct++) {
															for (int j2 = 0; j2 < addedData.size(); j2++) {
																if (addedData.get(j2).get(1) <= ct) {
																	if (arrayListPresent(rrQueue, addedData.get(j2).get(0)) == 0) {
																		rrQueue.add(addedData.get(j2).get(0));
																	}
																}
															}
														}
														currentTime = currentTime + tq;
														rrQueue.remove(0);
														rrQueue.add(addedData.get(j).get(0));
														GanttId.add(addedData.get(j).get(0));
														times.add(currentTime);
											
													} else {
														int burst = addedData.get(j).get(2);
														for (int ct = currentTime + 1; ct < currentTime + 1 + burst; ct++) {
															for (int j2 = 0; j2 < addedData.size(); j2++) {
																if (addedData.get(j2).get(1) <= currentTime) {
																	if (arrayListPresent(rrQueue, addedData.get(j2).get(0)) == 0) {
																		rrQueue.add(addedData.get(j2).get(0));
																	}
																}
															}
														}
														currentTime = currentTime + burst;
														added++;
														GanttId.add(addedData.get(j).get(0));
														times.add(currentTime);
														rrQueue.remove(0);
														addedData.remove(j);
														found = 1;
													}
												
												}
											}
										}
								
									}
									while (found == 0) {
										currentTime = currentTime + 1;
										for (int i = 0; i < addedData.size(); i++) {
											if (addedData.get(i).get(1) <= currentTime) {
												found = 1;
												GanttId.add(-1);
												times.add(currentTime);
											}
										}
										
									}
								}	
								
								ArrayList<Integer> CompTime = new ArrayList<Integer>();
								for (int i = 0; i < id.length; i++) {
									int present = 0;
									for (int j = 0; j < GanttId.size(); j++) {
										if (GanttId.get(j) == id[i]) {
											if (present == 0) {
												CompTime.add(times.get(j + 1));
												present = 1;
											}
											else if (present == 1) {
												CompTime.set(CompTime.size() - 1, times.get(j + 1));
											}
											
										}
									}
								}
								
								System.out.println("Completion Time: ");
								for (int i = 0; i < id.length; i++) {	
									System.out.println("P" + id[i] + " - " + CompTime.get(i));	
								}
								
								ArrayList<Integer> FirstTime = new ArrayList<Integer>();
								for (int i = 0; i < id.length; i++) {
									int present = 0;
									for (int j = 0; j < GanttId.size(); j++) {
										if (GanttId.get(j) == id[i]) {
											if (present == 0) {
												FirstTime.add(times.get(j));
												present = 1;
											}
										}
									}
								}
								
								ArrayList<Integer> ResponseTime = new ArrayList<Integer>();
								System.out.println("\nResponse Time: ");
								int totalResponse = 0;
								for (int i = 0; i < id.length; i++) {	
									int response = FirstTime.get(i) - arrival[i];
									System.out.println("P" + id[i] + " - " + response);	
									ResponseTime.add(response);
									totalResponse = totalResponse + response;
								}
								double totalResponseD = totalResponse;
								double avgResponse = totalResponseD/id.length;
								System.out.println("Average Response Time: " + avgResponse);
								
								System.out.println("\nWaiting Time: ");
								int totalWaiting = 0;
								for (int i = 0; i < id.length; i++) {
									int preemptedTime = 0;
									int pastTime = -1;
									for (int j = 0; j < GanttId.size(); j++) {
										if (GanttId.get(j) == id[i]) {
											if (pastTime != -1) {
												preemptedTime = preemptedTime + times.get(j) - pastTime;
											} 
											pastTime = times.get(j + 1);
										}
									}
									
									int waiting = ResponseTime.get(i) + preemptedTime;
									System.out.println("P" + id[i] + " - " + waiting);	
									totalWaiting = totalWaiting + waiting;
								}
								double totalWaitingD = totalWaiting;
								double avgWaiting = totalWaitingD/id.length;
								System.out.println("Average Waiting Time: " + avgWaiting);
								
								System.out.println("\nTurnaround Time: ");
								int totalTurnaround = 0;
								for (int i = 0; i < id.length; i++) {	
									int turnaround = CompTime.get(i) - arrival[i];
									System.out.println("P" + id[i] + " - " + turnaround);	
									totalTurnaround = totalTurnaround + turnaround;
								}
								double totalTurnaroundD = totalTurnaround;
								double avgTurnaround = totalTurnaroundD/id.length;
								System.out.println("Average Turnaround Time: " + avgTurnaround);
								
								System.out.println("\nGantt Chart:");
								for (int i = 0; i < GanttId.size(); i++) {
									System.out.print(times.get(i) + "--");
									if (GanttId.get(i) == -1) {
										System.out.print("WAIT--");
									} else {
										System.out.print("P" + GanttId.get(i) + "--");
									}
								}
								System.out.println(times.get(GanttId.size()));
								System.out.println();	
							}
							else if (choice == 7) {
								System.out.println("Thank you for using the program.");
							}
							
							question = 0;
						}
						
						
						input.close();
					}
					
					
				} catch (FileNotFoundException e) {
					System.out.println("File was not found. Please try again");
				}
				
				inScanner.close();
			} else {
				System.out.println("File is not a csv file. Please try again.");
			}
		} else {
			System.out.println("Invalid absolute file path. Please try again.");
		}
		
	}


	public static void main (String [] args ) {
		Driver d = new Driver();
		d.start();
		
		
	}
	
}

/*
 * Sample Input (for my Computer) : C:\Users\Kyle\Documents\Scheduling\input.csv
 */




