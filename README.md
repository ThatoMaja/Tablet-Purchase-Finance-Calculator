# Tablet Purchase Finance Calculator

An Android app that helps customers calculate monthly installment plans when purchasing a tablet on credit. Built for customer transparency and ease of use, this app ensures buyers can make informed decisions when selecting between three tablet options.

---

## Project Overview

**App Name**: Tablet Purchase Finance Calculator  
**Platform**: Android  
**Language**: Java (Logic), XML (UI)  
**Purpose**: Calculate monthly installment and total credit price after interest  
**Interest Rate**: 85.4% over 24 months  
**Pricing Options**:
- **Tablet S** – R 2,500
- **Tablet M** – R 3,500
- **Tablet L** – R 4,500

---

## Features

- Input fields for:
  - Customer name
  - Custom message
  - Tablet size choice: `S`, `M`, or `L`
- Button to calculate:
  - Monthly installment
  - Total credit price (after interest)
- Validates all user input
- Displays results in a friendly message format
- Option to quit the app with a button

---

## Calculation Logic

**Formula**:  
`Total Credit Price = Price + (Price × Interest Rate / 100)`  
`Monthly Installment = Total Credit Price / 24`

---

## App Workflow

1. Customer enters their **name**, **message**, and **tablet choice**.
2. The app checks if all fields are filled and validates the choice (`S`, `M`, `L`).
3. Calculates:
   - Total credit price including interest
   - Monthly repayment over 24 months
4. Displays a custom message including:
   - Customer's name
   - Message
   - Monthly installment
   - Total credit price

---

## UI Elements

- `EditText` fields: Name, Message, Tablet Choice
- `Button`: Calculate, Quit
- `TextView`: Display result

---

## Input Validation

- Displays error if fields are empty
- Accepts only valid tablet choices (`S`, `M`, `L`)
- Handles non-alphabetic inputs gracefully

---

## Use Case

This app was designed with **store customers** in mind — making it easier to understand their financial commitment before purchasing a tablet. It simplifies financial literacy and adds transparency to the purchasing process.

---

📌 *A simple finance tool for smarter tablet purchases.*
