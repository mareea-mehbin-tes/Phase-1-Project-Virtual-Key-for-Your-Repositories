package com.locked.me;

import java.util.Scanner;
import java.io.IOException;

public class LockerPvtLtd {

	public static void main(String[] args) throws IOException {
		
		int ch=0, choice=0;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("\t######################\n");
		System.out.println("\t WELCOME TO LOCKED ME! ");
		System.out.println("\t By Locker Pvt. Ltd. \n");
		System.out.println("\t######################\n");
		System.out.println(" Developer\t: Mareea Mehbin \n Company\t: Trivium eSolutions \n");
		
		while(true)
		{
			System.out.println("---------------------------------");
			System.out.println("Please select one of the options:");
			System.out.println("---------------------------------");
			System.out.println("1. List Current Files");
			System.out.println("2. Business Operations");
			System.out.println("3. Close Application");
			System.out.println("---------------------------------");
			
			try{    
				ch = sc.nextInt();
			}
			
			catch(Exception e)  
             {  
              System.out.println("Null Exception occurred");  
             }         
			
			switch(ch)
			{
			
			case 1: // to list all files in ascending order.
				BusinessOperations.listFiles();
				break;
			
			case 2:
					System.out.println("---------------------------------");
					System.out.println("Please select one of the options:");
					System.out.println("---------------------------------");
					System.out.println("1. Add a File");
					System.out.println("2. Delete a File");
					System.out.println("3. Search for a File");
					System.out.println("---------------------------------");
					try{    
						 choice = sc.nextInt();
					}
					catch(Exception e)  
	                  {  
	                   System.out.println("Null Exception occurred");  
	                  }          
					switch(choice)
					{
					
					case 1:
						// creating a new file
						System.out.println("Enter the name of a file to be created: ");
						String fileCreate = sc.next();
						
						// calling the function to create the file
						BusinessOperations.createFile(fileCreate);
						break;
						
					case 2:
						// deleting a file
						System.out.print("Enter the name of a file to be deleted: ");
						String fileDelete = sc.next();
						
						// calling the function to delete the file
						BusinessOperations.deleteFile(fileDelete);
						break;
					
					case 3:
						// searching up a file
						System.out.println("Enter the name of a file to be searched: ");
						String fileSearch = sc.next();
						
						// calling the function to search the file
						BusinessOperations.searchFile(fileSearch);
						break;
						
				default:
						// in case an invalid choice is made
						System.out.println("\n Uh-oh! Invalid Input, Try Again\n");
						break;
				}
			
					break;
			case 3:
				
				// exiting the application
				sc.close();
				System.out.println("\n Thank you for visiting! Have a wonderful day ahead.");
				System.exit(1);
				break;
			
			default:
				// in case an invalid choice is made
				System.out.println("\n\n Uh-oh! Invalid Input, choose within the range of 1-3\n");
				break;
			
			}
		}
		
	}

}
