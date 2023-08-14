package forloop;

public class Main {
	public static void main(String[] args)
	{
		System.out.println("For loop");
//To print 1 to 25 nos
		for(int i=1;i<=25;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
//To print 25 to 1 nos
		for(int i=25;i>=1;i--) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		
//To print 1 to 100 Odd nos
		for(int i=1;i<100;i++) {
			if(i%2 !=0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
//To print 1 to 100 even nos
		for(int i=1;i<100;i++) {
			if(i%2 ==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
//To print sum of 1 to 50 Odd nos
		int a = 0;
		for(int i=1;i<50;i++) {
			if(i%2 !=0) {
				a =a+i;
			}
		}
		System.out.println("sum of 1 to 50 Odd nos " + a);
		
//To print sum of 1 to 50 EVEN nos
		int b = 0;
		for(int i=1;i<50;i++) {
			if(i%2 ==0) {
				b =b+i;
			}
		}
		System.out.println("sum of 1 to 50 Odd nos " + b);
		
//To print -45 to +45 nos
		for(int i=-45;i<=45;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
//To print 50 to 100 nos
		for(int i=50;i<=100;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
//To print sum of odd and even no
		int odd = 0;
		int even = 0;
		for(int i=1;i<50;i++) {
			if(i%2 !=0) {
				 odd++;
			}
			else if(i%2==0) {
				 even++;
			}
		}
		System.out.println("Sum of odd : "+odd+" and even : "+ even);
		
//To print even and odd No
		for(int i=1;i<100;i++) {
			if(i%2 ==0) {
				System.out.print("Even "+ i+" ");
			}
			else {
				System.out.print("Odd "+ i+" ");
			}
		}
		System.out.println();
		
//To print 1 to 100 no
		for(int i=1;i<=100;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
//To print 100 to 1 no
		for(int i=100;i>=1;i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
//To print 30 to 50 no
		for(int i=30;i<=50;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
// To print count of even No 1 to 25 no
		int d =0;
		for(int i=1;i<=25;i++) {
			if(i%2==0) {
				d=d+1;
			}
		}
		System.out.println("count of even No 1 to 25 no " + d);
		
//To print count of odd No 1 to 25 no
		int e =0;
		for(int i=1;i<=25;i++) {
			if(i%2!=0) {
				e=e+1;
			}
		}
		System.out.println("count of odd No 1 to 25 no " + e);
		
//Series
		
//2 4 6 8 10 12 14 16 18 20
		for(int i=2;i<=20;i+=2) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		
//9 18 27 36 45 54 63 72 81 90
		for(int i=9;i<=90;i+=9) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		
//1 -2 3 -4 5 -6 7 -8 9 -10
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
			else {
				System.out.print((i*-1)+" ");
				
			}
		}
		System.out.println();
		
//5 10 15 20 25 30 35 40 45 50
		for(int i=1;i<=50;i++) {
			if(i%5==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
//1 10 100 1000
		for(int i=1;i<=1000;i*=10) {
			System.out.print(i + " ");
				
			}
		System.out.println();
		
//1  3  6  10  15  21  28  36  45
		int diff = 0;
		for(int i=1;i<=10;i++) {
			System.out.print(diff + " ");
			diff=i+diff;

		}
		System.out.println();
		
//8 16 24 32 40 48 56 64 72 80
		for(int i=8;i<=80;i++) {
			if(i%8==0) {
			System.out.print(i + " ");	
			}
			}
		System.out.println();
		
//0 1 1 2 3 5 8 13 21
		int start =0;
		int end =1;
		for(int i=1;i<=10;i++) {
			System.out.print(start + " ");
			int add = start+end;
			start=end;
			end=add;
		}
		System.out.println();
		
//1 4 9 16 25 36 49 64 81 100
		
		for(int i=1;i<=10;i++) {
			System.out.print(i*i + " ");
		}
		System.out.println();
		
// 3 6 9 12 15 18 21 24 27 30
		for(int i=1;i<=10;i++) {
			System.out.print(i*3 + " ");
		}
		System.out.println();
		
//7 14 21 28 35 42 49 56 63 70
		for(int i=1;i<=10;i++) {
			System.out.print(i*7 + " ");
		}
		System.out.println();
		
//4 8 12 16 20 24 28 32 36 40
		for(int i=1;i<=10;i++) {
			System.out.print(i*4 + " ");
		}
		System.out.println();
		
//10 20 30 40 50 60 70 80 90 100
		for(int i=1;i<=10;i++) {
			System.out.print(i*10 + " ");
		}
		System.out.println();
		
//1 2 3 4 5 4 3 2 1
		int first = 1;
		int second = 5;
		for(int i=1;i<9;i++) {
			if(first<5) {
				System.out.print(first+" ");
				first++;
			}
			if(first>=5) {
				System.out.print(second+" ");
				second--;
			}
		}
		System.out.println();

//6 12 18 24 30 36 42 48 54 60.
		for(int i=1;i<=10;i++) {
			System.out.print(i*6 + " ");
		}
	}
}
