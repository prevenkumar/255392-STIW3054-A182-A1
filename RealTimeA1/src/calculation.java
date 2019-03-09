public class calculation {

public static int weightingActor(int simple, int avg, int cmplx){
	return((simple * 1)+(avg * 2)+(cmplx * 3));}
	
public static int weightingUC(int simple1, int avg1, int cmplx1){
	return((simple1 * 5)+(avg1 * 10)+(cmplx1 * 15));}
	
public static double weightingTF(int t1, int t2, int t3, int t4, int t5, int t6, int t7, int t8, int t9, int t10, int t11, int t12, int t13 ){
	return((t1*2)+(t2)+(t3)+(t4)+(t5)+(t6*0.5)+(t7*0.5)+(t8*2)+(t9)+(t10)+(t11)+(t12)+(t13));}

public static double weightingEF(int e1, int e2, int e3, int e4, int e5, int e6, int e7, int e8 ){
	return((e1)+(e2*0.5)+(e3)+(e4*0.5)+(e5*0)+(e6*2)+(e7*-1)+(e8*-1));}

public static int weightingR(int simple2, int avg2, int cmplx2){
	return((simple2 * 12)+(avg2 * 20)+(cmplx2 * 40));}
}
