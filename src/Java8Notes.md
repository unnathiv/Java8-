Lambda Expression - 
    1. Lambda is equivalent to a function without a name. 
       It has 
         -> Method Parameters
         -> Method Body
         -> Method Type
   
    2. It can be assigned to a variable and passed around.

        Lambda Expression -
          () -> {} 
          () -- Lambda Input parameters
          -> -- Arrow
          {} -- Lambda Body
       ()-> Single statement/expression // Curly braces are not needed
       ()-> {Multiple statements}; // Curly braces are needed for multiple statements

       Usages - 
       1. It is used to implement Functional Interface

   Comparator Interface using Lambda -
   Comparator<Integer>  compare = (a,b) -> a.compareTo(b)

#### Consumer Functional Interface
______________________________

    Consumer Interface - 
        1. It is a predefined functional interface
        2. This interface represents an operation that accepts a single input parameter and doesn't return anything
        3. It contains only one method named accept()
    
    BiConsumer Interface - 
        1. It is also a similar consumer interface but it accepts two input parametrs and doesn't return anything.
    
#### Predicate Functional Interface
______________________________

OR, AND, Negate functions 
  Predicate - it is for one parameter. 
  BiPredicate - It is for two parameters 


#### Function Interface
_______________________
1. It will do same functionality as a regular method, but here we will save the output of a method to a variable.
    
   Types of methods - 
   1. Compose
   
#### Supplier Interface
----------------------
1. It is exactly oppsite to consumer interface
2. It doesn't take input but it gives output. 

 
####Method Reference
____________________
1. It is used to simply the implementation of Functional Interface.
2. Shortcut for writing Lambda expressions.

      Syntax of Method Reference -
    1. ClassName::Instance-methodName
    2. ClassName::Static-MethodName
    3. Instance::methodName
    
Using Lambda - 
Function<String, String> toUpperCaseLambda = (s) -> s.toUpperCase();
Using Method reference -
Function<String,String> toUpperCaseMethodRerence = String::toUpperCase;


####Constructor reference
__________________________
ClassName::new 


#####Local Variables in Lambda Expression
------------------------------------
Labda has Restrictions using local variables- 
1. We can't use same local varoable name as lambda paramertes or inside the lambda body
2. Not allowed reassign a value to a local variable.

Advantage - 
1 . There is no restrictions on instance variables.(we can change the variable value)

#####Effectively final
___________________

1.  Lambda's are allowed to use local variables but not allowed to modify it even though they are not declared final. This concept is 
    called Effectively Final
    
    Pros - 
    1. Easy to perform concurrenct operations
    2. Promoted Functional programming and demotes the imperative style programming. 
    
####Streams
------------
1. Purpose of STream - Main purpose is to perform some operation on collections
2. Even parallel operations are easy in multiple threads

* Stream is a sequence of elements which can be cretaed out of a collections such as List or Arrays or any kind of 
  I/O resources


#####Methods 
___________
Map() - Convert one type to another. 
flatMap() - Convert one type to another like map method. 
       Used in context of stream where each element in the stream represents multiple elements. 
       
 Ex- Each and every element represent stream of multiple elements
Distinct() - Return s stream with unique elements
Count() - Returns a long with the total number of elements in the stream
Sorted() - Sort the elements in the stream
Filter() -  filter the elements in the stream
reduce() - This is a terminal operation used to reduce the contents of a stream to a single value.




     
 
