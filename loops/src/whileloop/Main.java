package whileloop;

public class Main {
    public static void main(String[] args) {
        
    
		System.out.println("While Loop");

	
//Write a Program To print 1 to 25 nos.	
        int i = 0;
        while (i <= 25) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

//Write a Program To print 25 to 1 nos.
	
        i = 25;
        while (i > 0) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();

//Write a Program To print 1 to 100 Odd nos.
		
        i = 0;
        while (i <= 100) {
            if (i % 2 != 0)
                System.out.print(i + " ");
            i++;
        }
        System.out.println();

//Write a Program To print 1 to 100 even nos.

        i = 0;
        while (i <= 100) {
            if (i % 2 == 0)
                System.out.print(i + " ");
            i++;
        }
        System.out.println();

//Write a Program To print sum of 1 to 50 Odd nos.
		
        i = 0;
        int sum = 0;
        while (i <= 50) {
            if (i % 2 != 0) {
                sum++;
            }
            i++;
        }
        System.out.print("1-50 odd sum : " +sum);
        System.out.println();

//Write a Program To print sum of 1 to 50 EVEN nos.
		
        i = 0;
        sum = 0;
        while (i <= 50) {
            if (i % 2 == 0) {
                sum++;
            }
            i++;
        }
        System.out.print("1-50 even sum : "+sum);
        System.out.println();

//Write a Program To print -45 to +45 nos.
		
        i = -45;
        while (i <= 45) {

            System.out.print(i + " ");
            i++;
        }
        System.out.println();

//Write a Program To print 50 to 100 nos.
		
        i = 50;
        while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

//Write a Program To print sum of odd and even no.
		
        i = 0;
        int odd = 0, even = 0;
        while (i <= 100) {
            if (i % 2 != 0)
                odd++;
            else even++;
            i++;
        }
        System.out.print("Odd Sum : "+odd + " Even Sum : " + even);
        System.out.println();

//Write a Program To print even and odd No
		
        i = 0;
        while (i <= 100) {
           if(i%2==0) {
        	   System.out.print(i+" Even ");
           }else {
        	   System.out.print(i+" Odd ");
           }
           i++;

        }
        System.out.println();

//Write a Program To print 1 to 100 no.
		

        i = 1;
        while (i <= 100) {

            System.out.print(i + " ");
            i++;
        }
        System.out.println();

//Write a Program To print 100 to 1 no.
		
        i=100;
        while (i>=1){

            System.out.print(i+" ");
            i--;
        }
        System.out.println();

//Write a Program To print 30 to 50 no.
		
        i=30;
        while (i<=50){

            System.out.print(i+" ");
            i++;
        }
        System.out.println();

//Write a Program To print count of even No 1 to 25 no.
		
        i=1;
        while (i<=25){
            if(i%2==0)
            System.out.print(i+" ");
            i++;
        }
        System.out.println();


//Write a Program To print count of odd No 1 to 25 no.
		
        i=1;
        while (i<=25){
            if(i%2!=0)
                System.out.print(i+" ");
            i++;
        }
        System.out.println();
        System.out.println();
        System.out.println();



		
//2 4 6 8 10 12 14 16 18 20
		
        i=1;
        while (i<=20){
            if(i%2==0)
                System.out.print(i+" ");
            i++;
        }
        System.out.println();

//9 18 27 36 45 54 63 72 81 90
		
		
        i=1;
        while (i<=20){
            if(i%3==0)
                System.out.print(i+" ");
            i++;
        }
        System.out.println();

//1 -2 3 -4 5 -6 7 -8 9 -10
		
		
        i=1;
        while (i<=20){
            if(i%2==0)
                System.out.print(-i+" ");
            else System.out.print(i+" ");
            i++;
        }
        System.out.println();

//5 10 15 20 25 30 35 40 45 50
		
		

        i=1;
        while (i<=20){
            if(i%5==0)
                System.out.print(i+" ");
            i++;
        }
        System.out.println();

//1 10 100 1000
		
		
        i=1;
        while (i<=1000){
            i=i*10;
            System.out.print(i+" ");
        }
        System.out.println();

//1  3  6  10  15  21  28  36  45
		
		
        i=1;
        sum=0;
        while (i<10){
            sum=sum+i;
            System.out.print(sum+" ");
            i++;
        }
        System.out.println();

//8 16 24 32 40 48 56 64 72 80
		
		

        i=1;
        while (i<=80){
            if(i%8==0)
                System.out.print(i+" ");
            i++;
        }
        System.out.println();

//0 1 1 2 3 5 8 13 21
		
		
        i=2;
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+ n2 +" ");
        while (i<9){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
            i++;
        }
        System.out.println();

//1 4 9 16 25 36 49 64 81 100
		
		
        i=1;
        while (i<=10){
            int d=i*i;
                System.out.print(d+" ");
            i++;
        }
        System.out.println();

//3 6 9 12 15 18 21 24 27 30
		
		
        i=1;
        while (i<=30){
            if(i%3==0)
                System.out.print(i+" ");
            i++;
        }
        System.out.println();

//7 14 21 28 35 42 49 56 63 70
		
		
        i=1;
        while (i<=70){
            if(i%7==0)
                System.out.print(i+" ");
            i++;
        }
        System.out.println();

//4 8 12 16 20 24 28 32 36 40
		
		
        i=1;
        i=1;
        while (i<=40){
            if(i%4==0)
                System.out.print(i+" ");
            i++;
        }
        System.out.println();

//10 20 30 40 50 60 70 80 90 100
		
		
        i=1;
        while (i<=100){
            if(i%10==0)
                System.out.print(i+" ");
            i++;
        }
        System.out.println();

//1 2 3 4 5 4 3 2 1 
		
		
        i=1;
        while (i<5){

            System.out.print(i+" ");
            i++;
        }

        while (i>0){
         System.out.print(i+" ");
         i--;
        
        }

         System.out.println();
//6 12 18 24 30 36 42 48 54 60
		
		
        i=1;
        while (i<=60){
            if(i%6==0){
                System.out.print(i+" ");
            }
            i++;
        }
        
    }
		
}