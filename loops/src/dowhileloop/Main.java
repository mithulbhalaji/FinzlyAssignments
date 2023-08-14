package dowhileloop;

public class Main {
	

	public static void main(String[] args) {
		System.out.println("Do while loop");
		
        System.out.println("Program To print 1 to 25 nos");
		int i = 1;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=25);
		System.out.println();
		
		System.out.println("Program To print 1 to 25 nos");
		i = 25;
		do {
			System.out.print(i+" ");
			i--;
		}while(i>0);
		System.out.println();
		
		
		System.out.println("Program To print 1 to 100 Odd nos");
		i = 1;
		do {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
			i++;
		}while(i<100);
		System.out.println();
		
		System.out.println("Program To print 1 to 100 even nos");
		i = 2;
		do {
			if(i%2==0) {
			System.out.print(i+" ");
			}
			i++;
		}while(i<=100);
		System.out.println();
		
		System.out.println("Program To print 1 to 50 odd nos");
		i = 1;
		do {
			if(i%2!=0) {
			System.out.print(i+" ");
			}
			i++;
		}while(i<=50);
		System.out.println();
		
		System.out.println("Program To print 1 to 50 even nos");
		i = 2;
		do {
			if(i%2==0) {
			System.out.print(i+" ");
			}
			i++;
		}while(i<=50);
		System.out.println();
		
		System.out.println("To print -45 to +45 nos");
		i = -45;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<= 45);
		System.out.println();
		
		
		System.out.println("To print 50 to 100 nos");
		i = 50;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<= 100);
		System.out.println();
		
		
		System.out.println("To print sum of odd and even no");
		i = 0;
		int oddSum = 0;
		int evenSum = 0;
		do {
			if(i%2==0) {
				evenSum +=1;
			}else {
				oddSum +=1;
			}
			i++;
		}while(i< 100);
		System.out.println("Odd Sum : "+oddSum+" Even Sum : "+ evenSum);
		
		System.out.println("To print even and odd No");
		i = 0;
		do {
			if(i%2==0) {
				System.out.print(i+ " even ");
			}else {
				System.out.print(i + " odd ");
			}
			i++;
		}while(i<=100);
		System.out.println();
		
		System.out.println("To	 print 1 to 100 no");
		i = 1;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=100);
		System.out.println();
		
		System.out.println("To print 100 to 1 no");
		i = 100;
		do {
			System.out.print(i+" ");
			i--;
		}while(i>0);
		System.out.println();

		System.out.println("To print 30 to 50 no");
		i =  30;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=50);
		System.out.println();
	
		System.out.println("To print count of even No 1 to 25 no");
		i = 1;
		int evenSumSec = 0;
		do {
			if(i%2==0) {
				evenSumSec +=1;
			}
			i++;
		}while(i<=25);
		System.out.println("Even Sum : "+ evenSumSec);
		
		System.out.println("To print count of odd No 1 to 25 no");
		i = 1;
		int oddSumSec = 0;
		do {
			if(i%2!=0) {
				oddSumSec +=1;
			}
			i++;
		}while(i<=25);
		System.out.println("Odd Sum : "+oddSumSec);
		
		
// 2 4 6 8 10 12 14 16 18 20
		i = 2;
		do {
			System.out.print(i+" ");
			i+=2;
		}while(i<=20);
		
		
		System.out.println();

//9 18 27 36 45 54 63 72 81 90
		i  = 9;
		do {
			System.out.print(i+" ");
			i+=9;
		}while(i<=90);
		System.out.println();
		
//1 -2 3 -4 5 -6 7 -8 9 -10
		i= 1;
		int temp = 0;
		do {
			if(i%2 == 0) {
				temp = i;
				temp = i *-1;
				System.out.print(temp+" ");
			}else{
				System.out.print(i+" ");
			}
			i++;
		}while(i<=10);
		System.out.println();
		
//5 10 15 20 25 30 35 40 45 50
		i = 5;
		do {
			System.out.print(i+" ");
			i+=5;
		}while(i<=50);
		System.out.println();
		
//1 10 100 1000
		i = 1;
		do {
			System.out.print(i+" ");
			i = i*10;
		}while(i<=1000);
		System.out.println();
		
//1  3  6  10  15  21  28  36  45
		i = 1;
		int tem = 1;
		do {
			System.out.print(i+" ");
			tem++;
			i += tem;
		}while(i <=45);
		System.out.println();
		
//8 16 24 32 40 48 56 64 72 80
		i = 8;
		do {
			System.out.print(i+" ");
			i+=8;
		}while(i<=80);
		System.out.println();
		
//0 1 1 2 3 5 8 13 21
		int count = 0;
		int firstTerm = 0;
		int secTerm = 1;
		int nextTerm = 0;
		 	
		do {
			System.out.print(firstTerm+" ");
			nextTerm = firstTerm + secTerm;
			firstTerm = secTerm;
			secTerm = nextTerm;
			count++;
		
		}while(count<9);
		System.out.println();
		
//1 4 9 16 25 36 49 64 81 100
		i = 1;
		do {
			System.out.print(i*i+" ");
			i++;
		}while(i<=10);
		System.out.println();
		
//3 6 9 12 15 18 21 24 27 30
		i = 3;
		do {
			System.out.print(i+" ");
			i+=3;
		}while(i<=30);
		System.out.println();
		
//7 14 21 28 35 42 49 56 63 70
		i = 7;
		do {
			System.out.print(i+" ");
			i+=7;
		}while(i<=70);
		System.out.println();
		
//4 8 12 16 20 24 28 32 36 40
		i = 4;
		do {
			System.out.print(i+" ");
			i+=4;
		}while(i<=40);
		System.out.println();
// 10 20 30 40 50 60 70 80 90 100
		i = 1;
		do {
			System.out.print(i*10+" ");
			i++;
		}while(i<=10);
		System.out.println();
		
//1 2 3 4 5 4 3 2 1
		i = 1;
		int te = 4;
		do {
			if(i <= 5) {
				System.out.print(i+" ");
			}
			if(i>5) {
				System.out.print(te+" ");
				te--;
			}
			i++;
		}while(i<10);
		System.out.println();
	
//6 12 18 24 30 36 42 48 54 60
		i = 6;
		do {
			System.out.print(i+" ");
			i+=6;
		}while(i<=60);
		
	}
}
