package com.java.core;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Function<Integer,Integer> sqaureIt=a->a*a;
   System.out.println(sqaureIt.apply(45));
 //find sqare root 
   Function<Integer,Double> sqaurer=a->Math.sqrt(a);
   System.out.println(sqaurer.apply(45));
	
	
	Function<String,Integer> sw=s->s.length();
	 System.out.println(sw.apply("swati"));
	
//void accept(T t),consumer only consumes
// Consumer<T>-generic interface T-type of input 
//To consume the input and perform actio without returning any result SAM
//accept a string and print it 

//Consumer<String> s=sw -> System.out.println(sw);
//s.accept("Happy Dasara");
Consumer<String> s = sm -> System.out.println(sm); 
s.accept("Happy Dasara");//we are calling this by ourselve (we use higher order function)
//Supplier<T> 
//it returns type of thr result
//T get()
Supplier<List<Integer>> integerListSupplier=()->List.of(76,54,87);
System.out.println(integerListSupplier.get());
//
Supplier<LocalDate> d=()->LocalDate.now();
System.out.println(d.get());

//Predicate
//SAM boolean test(T arg)
//if given string is empty and print result
Predicate<String> checkforempty=se->se.isEmpty();
System.out.println(checkforempty.test("er"));
//Exsisting Higher order function-the method that accept the behaviour
//functional interface
//accept  FI as para & returns FI 
//internal for each(default method) -perform the given action for each e,=lem of 

//expectation are gone ,not need to tell every internal feeling to everyone ,keep your potential and use it for your interb=nal growth 
//You have all the things ,streamline it
//Completely move on ,past is waste
//
//
List<Integer> list=List.of(20,89,76,65);
list.forEach(i->System.out.println(i));

//print set of string
Set<String> set=Set.of("one","two","three");
set.forEach(p->System.out.println(p));

}}
