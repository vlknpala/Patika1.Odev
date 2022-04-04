import java.util.Scanner;

public class AverageCalculation {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Matmatik Notunuzu Giriniz:");
		int maths = scanner.nextInt();
		System.out.print("Türkçe Notunuzu Giriniz:");
		int turkish = scanner.nextInt();
		System.out.print("Fizik Notunuzu Giriniz:");
		int physics = scanner.nextInt();
		System.out.print("Kimya Notunuzu Giriniz:");
		int chemistry = scanner.nextInt();
		System.out.print("Tarih Notunuzu Giriniz:");
		int history = scanner.nextInt();
		System.out.print("Müzik Notunuzu Giriniz:");
		int music = scanner.nextInt();
		int average = (maths + turkish + physics + chemistry + history + music)/6 ;
		System.out.println("Not Ortalamanız: " + average);
		for (int i = 60; i <= average; i++) {
			System.out.println("Geçti.");
			break;
		}
		for (int i = 60; i >= average; i++) {
			System.out.println("Kaldı.");
			break;
		}
	}
}
