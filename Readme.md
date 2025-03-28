# PseudocodeTranspiler

## The Ultimate CIE AS & A-Level Computer Science Pseudocode Compiler

**PseudocodeTranspiler** is the most comprehensive tool available for preparing for the **Cambridge International AS & A-Level Computer Science** exams. This project fully supports all grammar and syntax rules defined by **CIE's pseudocode specification**, ensuring that students can write, test, and practice pseudocode exactly as it appears in the exam.

## Key Features

✅ **Complete Grammar Coverage** – Supports all pseudocode syntax from the CIE syllabus, ensuring an authentic exam practice experience. 	
✅ **By Reference (BYREF) Parameters** – Fully implements **BYREF** parameters, enabling true reference passing.  	
✅ **Records** – Allows users to define and manipulate structured record types.  
✅ **Array Index-Free Sets** – Supports CIE-style array indexing, allowing for flexible data structure manipulation.  	
✅ **Time Handling** – Implements time-based operations as expected in CIE exams.  
✅ **All Built-in Functions** – Includes all built-in functions provided in **CIE’s 2024 Insert Paper** (e.g., `LENGTH`, `MID`, `ASC`, `CHR`, `RAND`, etc.).  
✅ **File Operations** – Supports **file reading and writing**, ensuring compatibility with practical file-handling exam scenarios(be careful using absolute path).  
✅ **100% CIE Pseudocode Compatible**

## How to Use

1. Clone this repository
2. Place your pseudocode in a file and copy the absolute path.
3. Run PseudocodeCompiler.java in src/main/java to execute your pseudocode exactly as in CIE exams.

## Example (Insertion Sort from 2021 Paper 3)

The provided example in `test.pseudo` demonstrates the **Insertion Sort** algorithm from 9618_s21_31:
```pseudocode
DECLARE Score : ARRAY[1:10] OF INTEGER
FOR i <- 1 TO 10
    Score[i] <- RAND(20)
NEXT i
DECLARE Temp1,Counter : INTEGER

FOR Student <- 2 TO 10
 Temp1 <- Score[Student]
 Counter <- Student
 WHILE (Counter > 1 AND Score[Counter - 1] < Temp1)
    Score[Counter] <- Score[Counter - 1]
    Counter <- Counter - 1
 ENDWHILE
 Score[Counter] <- Temp1
NEXT Student

FOR i <- 1 TO 10
    OUTPUT Score[i]
NEXT i
```
Simply run the program to see it in action!

## Why Use This?
- **Eliminate ambiguity**: No more guessing how pseudocode should behave—this transpiler follows **CIE’s exact specifications**.
- **Practice efficiently**: Copy-paste any past paper pseudocode and execute it instantly.
- **Prepare for exams with confidence**: Gain hands-on experience with CIE pseudocode **without needing a different programming language**.

## Issues
- **If any suggestions, bugs, or improvements on the newly updated syllabus or insert paper**
- **Please contact me**

## Disclaimer
This project is not officially affiliated with Cambridge International. It is an independent tool designed to help students prepare for the AS & A-Level Computer Science exam. While every effort has been made to ensure accuracy, we do not guarantee that this tool perfectly replicates the exam environment. Use at your own discretion.

## License
This project is licensed under the MIT License, allowing free use, modification, and distribution with attribution. See the LICENSE file for details.