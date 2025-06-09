package features.java_8;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;

public class FunctionalInterfacesExample {

	public static void main(String[] args) {

		// Consumer<T> - Represents an operation that accepts a single input argument
		// and performs an action without returning a result.
		Consumer<String> printConsumer = System.out::println;
		printConsumer.accept("Hello, World!");

		// Supplier<T> - Represents a supplier of results. It does not take any
		// arguments but returns a value.
		Supplier<Double> randomSupplier = Math::random;
		System.out.println(randomSupplier.get());

		// BiConsumer<T, U> - Represents an operation that accepts two input arguments
		// and performs an action without returning a result.
		BiConsumer<String, Integer> printNameAndAge = (name, age) -> System.out
				.println(name + " is " + age + " years old.");
		printNameAndAge.accept("Alice", 25);

		// UnaryOperator<T> - A specialization of Function where the input and output
		// types are the same.
		UnaryOperator<Integer> square = x -> x * x;
		System.out.println(square.apply(5));

		// BinaryOperator<T> - A specialization of BiFunction where both arguments and
		// the result are of the same type.
		BinaryOperator<Integer> add = (a, b) -> a + b;
		System.out.println(add.apply(10, 15));

		// IntConsumer - Represents an operation that accepts a single int argument and
		// performs an action without returning a result.
		IntConsumer printInt = System.out::println;
		printInt.accept(42);

		// BooleanSupplier - Represents a supplier of boolean-valued results. It does
		// not take any arguments but returns a boolean value.
		BooleanSupplier isEven = () -> 10 % 2 == 0;
		System.out.println(isEven.getAsBoolean());

		// DoubleUnaryOperator - A specialization of UnaryOperator for double values,
		// where both input and output are of type double.
		DoubleUnaryOperator half = x -> x / 2;
		System.out.println(half.applyAsDouble(10.0));

		// IntBinaryOperator - A specialization of BinaryOperator for int values.
		IntBinaryOperator multiply = (a, b) -> a * b;
		System.out.println(multiply.applyAsInt(4, 5));

		// LongConsumer - Represents an operation that accepts a single long argument
		// and performs an action without returning a result.
		LongConsumer printLong = System.out::println;
		printLong.accept(100L);

		// DoubleConsumer - Represents an operation that accepts a single double
		// argument and performs an action without returning a result.
		DoubleConsumer printDouble = System.out::println;
		printDouble.accept(3.14);

		// ObjIntConsumer<T> - Represents an operation that accepts an object and an int
		// argument and performs an action without returning a result.
		ObjIntConsumer<String> printNameAndScore = (name, score) -> System.out.println(name + " scored " + score);
		printNameAndScore.accept("Bob", 90);

		// ObjLongConsumer<T> - Represents an operation that accepts an object and a
		// long argument and performs an action without returning a result.
		ObjLongConsumer<String> printNameAndTime = (name, time) -> System.out
				.println(name + " took " + time + " seconds");
		printNameAndTime.accept("Charlie", 120L);

		// ObjDoubleConsumer<T> - Represents an operation that accepts an object and a
		// double argument and performs an action without returning a result.
		ObjDoubleConsumer<String> printNameAndDistance = (name, distance) -> System.out
				.println(name + " ran " + distance + " kilometers");
		printNameAndDistance.accept("David", 5.5);

		// IntFunction<R> - Represents a function that accepts an int argument and
		// produces a result.
		IntFunction<String> intToString = i -> "Number: " + i;
		System.out.println(intToString.apply(123));

		// LongFunction<R> - Represents a function that accepts a long argument and
		// produces a result.
		LongFunction<String> longToString = l -> "Long Number: " + l;
		System.out.println(longToString.apply(123L));

		// DoubleFunction<R> - Represents a function that accepts a double argument and
		// produces a result.
		DoubleFunction<String> doubleToString = d -> "Double Number: " + d;
		System.out.println(doubleToString.apply(123.45));

		// IntPredicate - Represents a boolean-valued function of one int argument.
		IntPredicate isPositive = i -> i > 0;
		System.out.println(isPositive.test(5));

		// LongPredicate - Represents a boolean-valued function of one long argument.
		LongPredicate isEvenLong = l -> l % 2 == 0;
		System.out.println(isEvenLong.test(10L));

		// DoublePredicate - Represents a boolean-valued function of one double
		// argument.
		DoublePredicate isPositiveDouble = d -> d > 0;
		System.out.println(isPositiveDouble.test(5.5));

		// IntSupplier - Represents a supplier of int-valued results.
		IntSupplier randomIntSupplier = () -> (int) (Math.random() * 100);
		System.out.println(randomIntSupplier.getAsInt());

		// LongSupplier - Represents a supplier of long-valued results.
		LongSupplier randomLongSupplier = () -> (long) (Math.random() * 1000);
		System.out.println(randomLongSupplier.getAsLong());

		// DoubleSupplier - Represents a supplier of double-valued results.
		DoubleSupplier randomDoubleSupplier = Math::random;
		System.out.println(randomDoubleSupplier.getAsDouble());

		// ToIntFunction<T> - Represents a function that accepts an argument and
		// produces an int-valued result.
		ToIntFunction<String> stringLengthToInt = String::length;
		System.out.println(stringLengthToInt.applyAsInt("Hello"));

		// ToLongFunction<T> - Represents a function that accepts an argument and
		// produces a long-valued result.
		ToLongFunction<String> stringLengthToLong = String::length;
		System.out.println(stringLengthToLong.applyAsLong("Hello"));

		// ToDoubleFunction<T> - Represents a function that accepts an argument and
		// produces a double-valued result.
		ToDoubleFunction<String> stringLengthToDouble = String::length;
		System.out.println(stringLengthToDouble.applyAsDouble("Hello"));

		// IntToDoubleFunction - Represents a function that accepts an int argument and
		// produces a double-valued result.
		IntToDoubleFunction intToDouble = i -> i * 1.0;
		System.out.println(intToDouble.applyAsDouble(10));

		// IntToLongFunction - Represents a function that accepts an int argument and
		// produces a long-valued result.
		IntToLongFunction intToLong = i -> i * 1L;
		System.out.println(intToLong.applyAsLong(10));

		// LongToDoubleFunction - Represents a function that accepts a long argument and
		// produces a double-valued result.
		LongToDoubleFunction longToDouble = l -> l * 1.0;
		System.out.println(longToDouble.applyAsDouble(10L));

		// LongToIntFunction - Represents a function that accepts a long argument and
		// produces an int-valued result.
		LongToIntFunction longToInt = l -> (int) l;
		System.out.println(longToInt.applyAsInt(10L));

		// LongUnaryOperator - A specialization of UnaryOperator for long values.
		LongUnaryOperator doubleLong = l -> l * 2;
		System.out.println(doubleLong.applyAsLong(5L));

		// DoubleToIntFunction - Represents a function that accepts a double argument
		// and produces an int-valued result.
		DoubleToIntFunction doubleToInt = d -> (int) d;
		System.out.println(doubleToInt.applyAsInt(5.5));

		// DoubleToLongFunction - Represents a function that accepts a double argument
		// and produces a long-valued result.
		DoubleToLongFunction doubleToLong = d -> (long) d;
		System.out.println(doubleToLong.applyAsLong(5.5));

		// ToIntBiFunction<T, U> - Represents a function that accepts two arguments and
		// produces an int-valued result.
		ToIntBiFunction<String, String> stringLengthSum = (s1, s2) -> s1.length() + s2.length();
		System.out.println(stringLengthSum.applyAsInt("Hello", "World"));

		// ToLongBiFunction<T, U> - Represents a function that accepts two arguments and
		// produces a long-valued result.
		ToLongBiFunction<String, String> stringLengthSumLong = (s1, s2) -> (long) s1.length() + s2.length();
		System.out.println(stringLengthSumLong.applyAsLong("Hello", "World"));

		// ToDoubleBiFunction<T, U> - Represents a function that accepts two arguments
		// and produces a double-valued result.
		ToDoubleBiFunction<String, String> stringLengthSumDouble = (s1, s2) -> (double) s1.length() + s2.length();
		System.out.println(stringLengthSumDouble.applyAsDouble("Hello", "World"));
	}
}
