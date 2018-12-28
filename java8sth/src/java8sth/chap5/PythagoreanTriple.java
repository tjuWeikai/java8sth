  
package java8sth.chap5;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/** 
 * ClassName:PythagoreanTriple  
 * Description: TODO ADD DESCRIPTION.  
 * Reason:   TODO ADD REASON. 
 * Date:     2018年12月28日 上午1:20:15 
 * @author   zhangweikai 
 * @version   
 * 
 * @since    JDK 1.8 
 * @see       
 */
public class PythagoreanTriple {

	public static void main(String[] args) {
//		int[] res =getPythagoreanTripleAsWanted(0);
//		System.out.println(res);
		
//		IntStream.iterate(0, new IntUnaryOperator() {
//			
//			private int prev = 1;
//			@Override
//			public int applyAsInt(int operand) {
//				int temp = operand + prev;
//				if (operand == 0) {
//					prev = 0;
//				}
//				else {
//					prev =operand;
//				}
//				
//				return temp;
//			}
//		})
//				 .limit(10)
//				 .forEach(System.out::println);
		
		getFibonacciTuple(20);
	}
	
	public static int[] getPythagoreanTripleAsWanted(int pos) {
		Stream<int[]> pythagoreanTriples =
				IntStream.iterate(1, n->{
					System.out.println("n="+(n+1));
					return n+1;
				})
//				 		 .limit(pos)
				 		 .boxed()
				 		 .flatMap(a -> {
				 			return IntStream.iterate(a, m -> {
				 				System.out.println("m="+(m+1));
				 				return m+1;
				 			})
		 		 			 .limit(25)
		 		 			 .filter(b -> Math.sqrt(a*a+b*b)%1==0)
		 		 			 .boxed()
		 		 			 .map(b -> new int[] {a,b,(int) Math.sqrt(a*a+b*b)});
				 		 }
				 				 );
		return pythagoreanTriples.skip(pos).findFirst().orElse(new int[] {1});
	}
	
	
	public static void getFibonacciTuple(int pos) {
		
		Stream.iterate(new int[] {0, 1},t -> new int[] {t[1],t[0]+t[1]})
					 .limit(pos)
					 .forEach(t -> System.out.println("("+t[0]+","+t[1]+")"));
				
	}
}
  