/**
 * Problem Set 1.
 * 
 * It's time to put your skills to the t. this problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 * 
 * the specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.lang.Math; 

public class ProblemSet1 {
    
    public static void main(String[] args) {
        
        /*
         * Exercise 1.
         * 
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */
        double heightin = 8.5;
		int widthin = 11;
		double heightms = heightin *25.4;
		double widthms = widthin *25.4;
		double area = heightms * widthms;
		double rounded = Math.round(area*100.0)/100.0;
		System.out.println(rounded + " square millimeters.");
        
        
        /*
         * Exercise 2.
         * 
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */
        double heighti = 8.5;
		int widthi = 11;
		double heightcm = heightin *2.54;
		double widthcm = widthin *2.54;
		double perimeter = heightcm * 2 + widthcm * 2;
		double ronded = Math.round(perimeter *100.0)/100.0;
		System.out.println(ronded + " centimeters.");
        
        
        /*
         * Exercise 3.
         * 
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */
		double a = 8.5;
		int b = 11;
		double c = b * b + a * a ; 
		double diagonal = Math.sqrt(c);
		double diagonalend = Math.round(diagonal *100.0)/100.0;
		System.out.println(diagonalend + "0 inches.");
        

        /*
         * Exercise 4.
         * 
         * Given the grading policy and the hw, q, and t grades I received,
         * what marking period grade will I get?
		 * HW 15%
		 * qzes 35%
		 *ts 50%
         */
        double HW = .15;
		double Q = .35;
		double T = .50;
		
	
        int hw1 = 88;
        int hw2 = 91;
        int hw3 = 0;
        int q1 = 84;
        int q2 = 89;
        int q3 = 93;
        int t1 = 74;
        int t2 = 87;
        int t3 = 82;
		
        double hwadd = ((hw1 * HW+hw2*HW+hw3*HW)/3);
        double qadd = (((q1 * Q)+(q2*Q)+(q3*Q))/3);
		double tadd = (((t1 * T)+(t2*T)+(t3*T))/3);
		double grade = hwadd + qadd + tadd;
		double gradeend = Math.round(grade *100.00)/100.0;
		System.out.println(gradeend + "%.");
		
        /*
         * Exercise 5.
         * 
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
		 Monday, 7.5 hours
		 Tuesday, 8 hours
		 Wednesday, 10.5 hours
		 Thursday, 9.5 hours
		 Friday, 6 hours
		 Saturday, 11.5 hours
		 Sunday, 0 hours
         */
		 double pay = 12.5;
		 double Mo = pay * 7.5;
		 double Tu = pay * 8;
		 double We = pay * 10.5;
		 double Th = pay * 9.5;
		 double Fr = pay * 6;
		 double Sa = pay * 11.5;
		 double Su = pay * 0;
		 double totalpay = Mo + Tu + We + Th + Fr + Sa + Su;
		 double payend = Math.round(totalpay *100.00)/100.0;
		 System.out.println("$" + payend + "0.");
		
		
		
		
        
        /*
         * Exercise 6.
         * 
         * What is my take-home pay each check?
         */
		double fit = .24;
		double sit = .0637;
		double ct = .07;
        double check = 117000 / 24;
		double tax = ((check -(check* fit))-(((check -(check* fit))* sit)))-(((check -(check* fit))-(((check -(check* fit))* sit)))*ct);
		double homepay = Math.round(tax *100.00)/100.0;
		System.out.println("$"+homepay);
		
        
        
        /*
         * Exercise 7.
         * 
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */
        int std = 273;
		int tch = 28;
		int bc = 54;
		
		int peep = std + tch;
		double rp = peep % bc;
		double ap = peep - rp;
		double bus = ap / bc + 1;
		System.out.println( bus+" buses are needed, with " + rp +" passengers on the last bus.");
        
        
        /*
         * Exercise 8.
         * 
         * What is the surface area of a standard Cornhole board?
         */
        
        
        
        /*
         * Exercise 9.
         * 
         * Are the years 2020, 2100, and 2400 leap years?
         */
        
        
        
        /*
         * Exercise 10.
         * 
         * What is the wind chill?
         */
        
        
        
    }
}