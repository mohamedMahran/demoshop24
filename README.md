# demoshop24

This execrice automate 3 scenarios 
1. add to cart 
2. login 
3. search for mac 

I used fluent interface (DSL- > Domain-Specific Language 

Intent
   A fluent interface provides an easy-readable, flowing interface, that often mimics a 
   domain-specific language. Using this pattern results in code that can be read nearly as human language.

Implementation
------------------------------
A fluent interface can be implemented using any of

Method Chaining: calling a method returns some object on which further methods can be called.

Static Factory Methods and Imports

Named parameters - can be simulated in Java using static factory methods.

**Project Hirerachy**
-----------------------------
![image](https://user-images.githubusercontent.com/20645322/118985331-a595ae00-b97e-11eb-90cd-e4d344163411.png)

**Locators and URL and user credentials**
------------------------------------------

i would like to clear for you that i've used properties file to store all the user crendetials and URL, plus i added all the selectors in this file as same as below figure, As you can see each page has defined the own selectors and if you want to maintain the selectors in the future releases you can update in this file

![image](https://user-images.githubusercontent.com/20645322/119003056-b699eb80-b98d-11eb-869f-bacc613d7b50.png)

** How we can read the selectors and define them **
-------------------------------------------------------
we can read our selectors from the data.propertis file using fileInput stream functions,  
![image](https://user-images.githubusercontent.com/20645322/119003564-1c867300-b98e-11eb-94ac-38977e17760d.png)
This functions are already exist in helper class
![image](https://user-images.githubusercontent.com/20645322/119004000-77b86580-b98e-11eb-8cb4-3324a8c21a8c.png)



