package utils;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.app.core.Emp;

import fruits.Fruit;

public interface GenericUtils {
	static void printAnyArray(Object[] arr) {
		for (Object t : arr) {
			System.out.println(t);
		}
		arr[0] = "abcd";///RE:ArraysStoreException covariant nature leasd to this problem
	}//Array co-variance -obj can be replaced by its subtype(Narrowing)
	

	static <T> void printAnyArray2(T[] arr) {//AMGUITY ,Erasure 
		for (T t : arr) {
			System.out.println(t);
		}
//		 arr[0]="abcd";
		 //javac error!!!!
	}

	// print contents of ANY Set - incorrect - Collections are invariant
	static void printAnySet(Set<Object> objects) { //HS of obj
		for (Object o : objects)
			System.out.println(o);
	}

	// un bounded flexibility via wild card
	//NOT a Generic method/class as it doesnt have T para.
	static void printAnySet2(Set<?> objects) {
		for (Object o : objects)
			System.out.println(o);
	}
//Generic Method
	//BOTH above and Below methods are Equivalent
	//BUT preffered to use  ABOVE as its in method ARGS
	//BUT only T can be used as REturn typr and NOT ?
	static <T> void printAnySet3(Set<T> objects) {
		for (T o : objects)
			System.out.println(o);
	}
	//Ambguity ,it will get replace dby obj 
	/*
	 * Write a static method to print taste of ANY fruit added in ANY List.	 
	 * ? - unbounded wild card
	 * extends - upper bound
	 * ? extends Fruit - Fruit or it's subtype 
	 *  -supports s co - variance 
	 *  ? extends T => T or it's sub type   
	 */
	//Non Generic--->preffered
	static void printFruitTaste(List<? extends Fruit> fruits)
	{
		for(Fruit f : fruits)
			f.taste();
	}
//	OR
	//Generic
	static <T extends Fruit> void printFruitTaste1(List< T> fruits)
	{
		for(T f : fruits)
			f.taste(); 
	}
	//producer -accseess read only upperbound
	//After erasure-->Fruite
	/*
	 * Given Emp hierarchy - computeSalary
	 * Write a static method to return sum of salaries(double) of
	 * Test cases - HashSet<Mgr> , LinkedList<SalesMgr> , ArrayList<TempWorker>
	 */
	//Non Generic
	static double getSumOfSalaries(Collection<? extends Emp> collection)
	{
//		double sum=0;
//		for(Emp e : collection)
//			sum += e.computeSalary();
		double sum= collection.stream()
		.mapToDouble(e -> e.computeSalary())
		.sum();
		/*
		 * can you add any   mgr | worker |  sales mgr to such a collection ?
		 */
//		collection.add(new Mgr(1000));
//		collection.add(new SalesMgr(2000));
//		collection.add(new TempWorker(3000));
//		collection.add(new Object());
//		collection.add(null);
		
		return sum;
	}
	

	//Q1 method to access taste of Any fruit and return first fruit in list
	
//	static <T extends Fruit> T firstFruitAndTaste(List<T> fruits)
//	{
//		for(Fruit f : fruits)
//			f.taste();
//	fruits.stream()
//				.forEach(f->f.taste());
//	Optional<T> fr
//				.findFirst();
////			return fruits.get(0);	//producer cant add anything
////			fruits.add(new Fruit());//cant add anything
//			
//	}
	//Q2 Max number from a given list
	static <T extends Fruit> double maxNumber(List<? extends Number> numbers)
	{
		 
		double maxVal=0.0;
		for(Number n:numbers) {
			if(n.doubleValue()>maxVal)
			maxVal=
			
					Double.max(maxVal,n.doubleValue());
			
			return maxVal;
	}
	
			
	}
	
//	static  double sumOfNumbers(List<? extends Number> number) {
//	
//	double sum=0.0;
//		for(Number n:number) {
//			sum+=n.doubleValue();}
//			return sum;
//	}
	static <T extends Number &  Comparable<T>> T sumOfNumbers(List<T> number) {
	 
		
		T max=number.get(0);
		
		for(int i=0;i<number.size();i++) {
			if(number.get(i).compareTo(max)>0) {
				max=number.get(i);
			}
		}
		return max;
		}
	
static <T extends  Comparable<T>> T sumOfNumbers1(List<T> number) {
	 
		
		T max=number.get(0);
		
		for(int i=0;i<number.size();i++) {
			if(number.get(i).compareTo(max)>0) {
				max=number.get(i);
			}
		}
		return max;
		}
	
	
	
}
