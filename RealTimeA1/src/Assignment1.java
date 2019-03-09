import java.util.*;

//calculate software effort estimation

public class Assignment1 extends calculation {

	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		 try{
			 
			 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			 System.out.println("                       Software Effort Estimation Calculator                ");
			 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			
			 //calculate weighting Actors for complexity
			System.out.println("_______________________________________________________________________________");
			System.out.println("-------------------------Weighting Actors for Complexity-----------------------");
			System.out.println("_______________________________________________________________________________");
	            System.out.print("Simple        :  Defined API                                     : 1       : ");
	                int simple = input.nextInt();
	            System.out.print("Average       :  Interactive or Protocol driven interface        : 2       : ");
	                int avg = input.nextInt();
	            System.out.print("Complex       :  Graphical User Interface                        : 3       : ");
	                int cmplx = input.nextInt();
	                calculation wa = new calculation();
	                int weightingActor = wa.weightingActor(simple, avg, cmplx);
	            System.out.println("");
	            
	            System.out.println("________________________________________________________________________________");
	            System.out.println("Total Actor Points             :" + weightingActor);
	            System.out.println("________________________________________________________________________________");
	            System.out.println("");
	            
	            //calculate weighting use cases for complexity
				System.out.println("________________________________________________________________________________");
				System.out.println("-----------------------Weighting Use Cases for Complexity----------------------");
				System.out.println("________________________________________________________________________________");
		            System.out.print("Simple        :  3 or fewer transactions                      : 5        : ");
		                int simple1 = input.nextInt();
		            System.out.print("Average       :  4 to 7 transactions                          : 10       : ");
		                int avg1 = input.nextInt();
		            System.out.print("Complex       :  Greater than 7 transactions                  : 15       : ");
		                int cmplx1 = input.nextInt();
		                calculation uc = new calculation();
		                int weightingUC = uc.weightingUC(simple1, avg1, cmplx1);
		            System.out.println("");
		            
		            System.out.println("________________________________________________________________________________");
		            System.out.println("Total Actor Points             :" + weightingUC);
		            System.out.println("________________________________________________________________________________");
		            int uucp = (weightingActor+weightingUC);
		            System.out.println("________________________________________________________________________________");
		            System.out.println("Unadjusted Use Case Points     :" + uucp);
		            System.out.println("________________________________________________________________________________");
		            
		            //calculate Weighting Technical Factors
		            System.out.println("_______________________________________________________________________________");
					System.out.println("-------------------------Weighting Technical Factors-----------------------");
					System.out.println("_______________________________________________________________________________");
					System.out.println("Rate each factor from 0 to 5. [ 0 means irrelevant 5 means essential ]");
					System.out.println("");
			            System.out.print("T1       : Must have a distributed solution                     : 2       : ");
			                int t1 = input.nextInt();
			            System.out.print("T2       : Must responds to specific performance objectives     : 1       : ");
			                int t2 = input.nextInt();
			            System.out.print("T3       :  Must meet end-user specific efficiency desires      : 1       : ");
			                int t3 = input.nextInt();
			            System.out.print("T4       :  Complex internal processing                         : 1       : ");
			                int t4 = input.nextInt();
			            System.out.print("T5       :  Code must be reusable                               : 1       : ");
			                int t5 = input.nextInt();
			            System.out.print("T6       :  Must be easy to install                             : 0.5     : ");
			                int t6 = input.nextInt();
			            System.out.print("T7       :  Must be easy to use                                 : 0.5     : ");
			                int t7 = input.nextInt();
			            System.out.print("T8       :  Must be portable                                    : 2       : ");
			                int t8 = input.nextInt();
			            System.out.print("T9       :  Must be easy to change                              : 1       : ");
			                int t9 = input.nextInt();
			            System.out.print("T10      : Must allow concurrent users                          : 1       : ");
			                int t10 = input.nextInt();
			            System.out.print("T11      : Includes special security features                   : 1       : ");
			                int t11 = input.nextInt();
			            System.out.print("T12      : Provide direct access for third parties users        : 1       : ");
			                int t12 = input.nextInt();
			            System.out.print("T13      : Requires special user training facilities            : 1       : ");
			                int t13 = input.nextInt();
			                calculation tf = new calculation();
			                double weightingTF = tf.weightingTF(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13);
			            System.out.println("");
			            
			            System.out.println("________________________________________________________________________________");
			            System.out.println("Total TFactor               :" + weightingTF);
			            System.out.println("________________________________________________________________________________");
			            double tcf = ((0.01*weightingTF)+0.6);
			            System.out.println("Technical Complexity Factor :" +tcf);
			            System.out.println("________________________________________________________________________________");
			            double szuc = uucp*tcf;
			            System.out.println("Size of Software(use case)  :" +szuc);
			            System.out.println("________________________________________________________________________________");
			            System.out.println("");
			            
			          //calculate Weighting Experience Factors
			            System.out.println("_______________________________________________________________________________");
						System.out.println("-------------------------Weighting Experience Factors-----------------------");
						System.out.println("_______________________________________________________________________________");
						System.out.println("Rate each factor from 0 to 5. [ 0 means no experience, 3 means average, 5 means expert ]");
						System.out.println("");
				            System.out.print("E1       : Familiar with FPT software process                  : 1       : ");
				                int e1 = input.nextInt();
				            System.out.print("E2       : Application experience                              : 0.5     : ");
				                int e2 = input.nextInt();
				            System.out.print("E3       : Paradigm experience (OO)                            : 1       : ");
				                int e3 = input.nextInt();
				            System.out.print("E4       : Lead analyst capability                             : 0.5     : ");
				                int e4 = input.nextInt();
				            System.out.print("E5       : Motivation                                          : 0       : ");
				                int e5 = input.nextInt();
				            System.out.print("E6       : Stable Requirements                                 : 2       : ");
				                int e6 = input.nextInt();
				            System.out.print("E7       : Part-time workers                                   : -1      : ");
				                int e7 = input.nextInt();
				            System.out.print("E8       : Difficulty of programming language                  : -1      : ");
				                int e8 = input.nextInt();
				                calculation ef = new calculation();
				                double weightingEF = ef.weightingEF(e1, e2, e3, e4, e5, e6, e7, e8);
				            System.out.println("");
				            
				            System.out.println("________________________________________________________________________________");
				            System.out.println("Total EFactor               :" + weightingEF);
				            System.out.println("________________________________________________________________________________");
				            double ef1 = ((-0.03*weightingEF)+1.4);
				            System.out.println("Experience Factor(EF)       :" +ef1);
				            System.out.println("________________________________________________________________________________");
				            double ucp = szuc*ef1;
				            System.out.println("Use Case Points(UCP)        :" +ucp);
				            System.out.println("________________________________________________________________________________");
				            System.out.println("");
				          
				            //calculating Man-hours from ucp
				            
				            System.out.println("_______________________________________________________________________________");
				            System.out.println("---------Calculating man-hours by multiplying UCP by the Effort rate---------- ");
							System.out.println("_______________________________________________________________________________");
							System.out.print("Enter Effort rate(20/28):");
			                int er = input.nextInt();
				            double mh = er * ucp;
				            System.out.println("________________________________________________________________________________");
				            System.out.println("Total man-hours        : "+mh);
				            System.out.println("________________________________________________________________________________");
				            System.out.println("");
				            System.out.println("_______________________________________________________________________________");
				            System.out.println("-----------------------Calculating adjusted man-hours--------------------------");
							System.out.println("_______________________________________________________________________________");
							System.out.print("Enter a coefficient as a percentage:");
			                double cof = input.nextDouble();
				            double amh= (1.0+cof) * mh;
				            System.out.println("________________________________________________________________________________");
				            System.out.println("Total adjusted man-hours        : "+amh);
				            System.out.println("________________________________________________________________________________");
				            System.out.println("");
				            
				            //calculate weighting reports for complexity
							System.out.println("________________________________________________________________________________");
							System.out.println("-----------------------Weighting Reports for Complexity----------------------");
							System.out.println("________________________________________________________________________________");
					            System.out.print("Simple        :        : 12        : ");
					                int simple2 = input.nextInt();
					            System.out.print("Average       :        : 20        : ");
					                int avg2 = input.nextInt();
					            System.out.print("Complex       :        : 40        : ");
					                int cmplx2 = input.nextInt();
					                calculation r = new calculation();
					                int weightingR = r.weightingR(simple2, avg2, cmplx2);
					            System.out.println("");
					            
					            System.out.println("________________________________________________________________________________");
					            System.out.println("Total Report Man-hour Estimate            :" + weightingR);
					            System.out.println("________________________________________________________________________________");
					            double tamh = amh + weightingR;
					            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
					            System.out.println("Total Adjusted Man-hours Calculation For The Project            :" + tamh);
					            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		
		 }catch(InputMismatchException e){
	            System.out.println("Invalid Input [only numbers allowed]");
	         
	        }
	    }
	}
