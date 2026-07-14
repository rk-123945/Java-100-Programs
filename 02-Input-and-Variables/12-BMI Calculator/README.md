# BMI Calculator

A Java program that calculates a user's Body Mass Index (BMI) using their age, weight, and height. The program validates user input and classifies BMI using different categories for adults and seniors.

---

# Features

* **BMI Calculation:** Calculates BMI using the formula `weight (kg) / height² (m²)`.
* **Age-Based Categories:** Uses standard BMI categories for adults and adjusted BMI categories for seniors (65+).
* **Input Validation:** Ensures age, weight, and height are valid positive numbers.
* **Formatted Results:** Displays the user's age, weight, height, BMI (to two decimal places), and BMI category.

---

# Run

```bash
javac BMICalc.java
java BMICalc
```

Example Run:

```text
BMI Calculator:
Enter age: 25
Enter weight (kg): 70
Enter height (meters): 1.75

BMI Results
Age: 25 years
Weight: 70.00 kg
Height: 1.75 m
BMI: 22.86
Category: Normal Weight
Not a medical diagnosis. Consult a healthcare professional for personalized advice.
```