# Electricity Bill Calculator

A Java-based electricity management system that calculates customer electricity bills based on energy usage, customer type, service fees, discounts, and taxes. The program uses object-oriented programming concepts and allows users to create and store multiple electricity bills.

---

# Features

* **Electricity Bill Calculation:** Calculates energy costs using tiered electricity rates based on kWh usage.
* **Multiple Customer Types:** Supports different billing rules for:

  * **Residential:** Standard pricing with a $5 service fee.
  * **Business:** 10% higher energy cost with a $20 service fee.
  * **Industrial:** 20% higher energy cost with a $50 service fee.
* **Pricing System:** Uses different rates depending on electricity consumption:

  * First 100 kWh → $0.12/kWh
  * 101–300 kWh → $0.15/kWh
  * 301–500 kWh → $0.20/kWh
  * Above 500 kWh → $0.25/kWh
* **Discount System:** Applies a 5% discount for customers using less than 150 kWh.
* **Tax Calculation:** Adds a 7% tax after discounts are applied.
* **Bill Storage:** Uses an `ArrayList` to store multiple electricity bills.
* **Menu System:** Allows users to:
  * Create new bills
  * View the number of generated bills
  * Display all stored bills
  * Exit the program
* **Object-Oriented Programming:** Uses classes, objects, encapsulation, and enums to organize the system.

---

# Run
```bash
javac ElecBillCalc.java
java ElecBillCalc
```

Example Run:

```text
Electricity Management System
-----------------------------
1. Create New Bill
2. View Number of Bills
3. View All Bills
4. Exit

Choose option: 1

Customer name: John Smith

Choose customer type:
1. Residential
2. Business
3. Industrial

Choice: 2

Electricity usage (kWh): 350


========== ELECTRICITY BILL ==========
Customer: John Smith
Type: BUSINESS
Usage: 350.0 kWh
Energy Cost: $68.20
Discount: $0.00
Service Fee: $20.00
Tax: $4.77
TOTAL BILL: $92.97
======================================
```