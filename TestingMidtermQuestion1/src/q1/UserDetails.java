package q1;
import java.util.Scanner;

public class UserDetails {
	static Scanner scanner = new Scanner(System.in);
	
	/*public static void main(String[] args) {
		String user = GetUsername();
		System.out.print(user);
		String password = GetPassword();
		System.out.print(password);
		GetProfilePhoto();
	}*/
	
	public String GetUsername() {
		System.out.print("Enter your username: ");
		String username = scanner.nextLine();
		if(username.length() > 10 || username == null) {
			throw new IllegalArgumentException("Username shall not exceed 10 characters or can't be empty.");
		}
		return username;
	}
	
	public String GetPassword() {
		System.out.print("Enter your password: ");
		String password = scanner.nextLine();
		if(password.length() <= 5 || password.length() >= 10) {
	        throw new IllegalArgumentException("Password length is required to be between 5 and 10 characters.");
		}
		return password;
	}
	
	int size;
	String resolution, format;
	
	public void GetProfilePhoto() {
		System.out.print("Enter the size of your photo in KB's: ");
		size = scanner.nextInt();
		
		if(size >= 20 || size <= 0) {
			throw new IllegalArgumentException("Profile photo size is required to be less than 20kb and can't be negative number.");
		}
		else {
			System.out.println("Size is okay.");
		}
		
		System.out.print("Enter photo resolution (eg:1280X720): ");
		resolution = scanner.next().toLowerCase();
		String reso[] = resolution.split("x");
		int x = Integer.parseInt(reso[0]);
		int y = Integer.parseInt(reso[1]);
		
		if((x <= 0 || x >= 500) || (y <= 0 || y >= 500)) {
			throw new IllegalArgumentException("Resolution can't be negative or higher than 500x500");
		}
		else {
			System.out.println("Resolution is okay.");
		}
		
		System.out.println("Enter photo format: ");
		format = scanner.next();
		
		if(format.equals(".jpg") || format.equals(".jpeg")) {
			System.out.print("Format is okay.");
		}
		else {
			throw new IllegalArgumentException("Format should be .jpg or .jpeg");
		}
		
	}
	
	

}
