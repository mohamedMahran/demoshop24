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

Also, i used the xpath and CSS locators strategy to define our selectors. Mainly i used the relative xpath to define most locators to show you how could you catch the locators using xpath and CSS as well  

** How we can read the selectors and define them **
-------------------------------------------------------
we can read our selectors from the data.propertis file using fileInput stream functions,  
![image](https://user-images.githubusercontent.com/20645322/119003564-1c867300-b98e-11eb-94ac-38977e17760d.png)


This functions are already exist in helper class
![image](https://user-images.githubusercontent.com/20645322/119004000-77b86580-b98e-11eb-8cb4-3324a8c21a8c.png)

**How to run the automation project** 
----------------------------------------

from the TestNG file, you can run the Tests.Java, Just right click and run the testNG. 
I've added the 3 scenarios as a test methods in one file for easy reading and easy tracking with the same name of the requested scenarios as same as following figure

![image](https://user-images.githubusercontent.com/20645322/119004929-4724fb80-b98f-11eb-8969-b19446bd0ad6.png)

Also you can change the browser from the testng.xml if you want to run on different browsers  

