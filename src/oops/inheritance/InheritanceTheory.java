package oops.inheritance;

public class InheritanceTheory {
	/*
	 * 🌟 INHERITANCE IN JAVA - KEY POINTS AND DEFINITIONS 🌟
	 *
	 * 1. What is Inheritance?
	 * ------------------------
	 * Inheritance is an OOP concept where one class (subclass) inherits properties 
	 * and methods from another class (superclass).
	 * It helps with code reusability, organization, and supports polymorphism.
	 *
	 * Syntax:
	 *   class ChildClass extends ParentClass {
	 *       // new fields and methods
	 *   }
	 *
	 *
	 * 2. Superclass (Parent Class)
	 * -----------------------------
	 * A superclass is the class that provides methods and fields to be inherited.
	 *
	 * Example:
	 *   class Animal {
	 *       public void eat() {
	 *           System.out.println("Animal eats food.");
	 *       }
	 *   }
	 *
	 *
	 * 3. Subclass (Child Class)
	 * --------------------------
	 * A subclass inherits from the superclass and can have its own methods.
	 *
	 * Example:
	 *   class Dog extends Animal {
	 *       public void bark() {
	 *           System.out.println("Dog barks.");
	 *       }
	 *   }
	 *
	 *
	 * 4. Method Overriding
	 * ---------------------
	 * A subclass can override a method of the superclass to provide its own version.
	 *
	 * Example:
	 *   @Override
	 *   public void eat() {
	 *       System.out.println("Dog eats bones.");
	 *   }
	 *
	 *
	 * 5. Code Reusability
	 * --------------------
	 * You don't need to write the same code again — you inherit it from the parent class.
	 *
	 *
	 * 6. Types of Inheritance in Java
	 * --------------------------------
	 * ✔ Single Inheritance          → One child, one parent
	 * ✔ Multilevel Inheritance      → A → B → C
	 * ✔ Hierarchical Inheritance    → One parent, multiple children
	 * ✘ Multiple Inheritance (with classes) → Not supported directly (only via interfaces)
	 *
	 *
	 * 7. Access Modifiers and Inheritance
	 * ------------------------------------
	 * public      → Accessible everywhere
	 * protected   → Accessible in same package + subclasses
	 * default     → Accessible only within the same package
	 * private     → Not accessible in subclass
	 *
	 *
	 * 8. The `super` Keyword
	 * -----------------------
	 * Used to refer to parent class:
	 *   - super.method() → Call parent method
	 *   - super()        → Call parent constructor (must be first line in constructor)
	 *
	 *
	 * 9. Advantages of Inheritance
	 * -----------------------------
	 * ✅ Reuse existing code
	 * ✅ Improve readability and organization
	 * ✅ Allows method overriding
	 * ✅ Enables polymorphism
	 * ✅ Easier maintenance and upgrades
	 *
	 *
	 * 🔚 Summary:
	 * Inheritance is like a child getting traits from a parent.
	 * It keeps your code DRY (Don’t Repeat Yourself) and helps manage complexity.
	 */

}
