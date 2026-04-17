// An exception is an unexpected event during program execution that disrupts normal flow.
/*Normal flow = everything works fine
Exception = something went wrong, Java creates an "exception object" and throws it
If nobody catches it → program crashes*/
  
// Real-world: ATM withdrawal
public class ATM {
    public void withdraw(double balance, double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds! Balance: " + balance);
        }
        System.out.println("Dispensing: ₹" + amount);
    }
}

/* 
Throwable  (root of all)
│
├── Error               → JVM-level, serious, DON'T catch
│     ├── OutOfMemoryError
│     └── StackOverflowError
│
└── Exception           → Application-level, handle these
      │
      ├── Checked Exception     → MUST handle (compiler forces you)
      │     ├── IOException
      │     ├── SQLException
      │     └── FileNotFoundException
      │
      └── Unchecked (RuntimeException)  → optional to handle
            ├── NullPointerException
            ├── ArrayIndexOutOfBoundsException
            ├── IllegalArgumentException
            └── NumberFormatException
  */
/*
try block → contains code that might throw an exception
catch block → handles the exception if it occurs
Multiple catch blocks → handle different exception types differently
Code after the problematic line in try is skipped when exception occurs

try {
    // risky code
    line 1  ✅ runs
    line 2  💥 exception thrown here
    line 3  ❌ SKIPPED
} catch (ExceptionType e) {
    // runs only when exception matches
}
// continues here after handling
*/

/*
multiple catch exceptions
  */
import java.io.*;

public class DataImporter {

    public void importData(String filePath, String divisorInput) {

        try {
            // Risk 1: File might not exist
            FileReader reader = new FileReader(filePath);

            // Risk 2: divisor might not be a number
            int divisor = Integer.parseInt(divisorInput);

            // Risk 3: divisor might be zero
            int result = 100 / divisor;

            System.out.println("✅ Import successful. Result: " + result);
            reader.close();

        } catch (FileNotFoundException e) {
            // Specific: File doesn't exist
            System.out.println("❌ File not found: " + filePath);
            System.out.println("   Please check the file path and try again.");

        } catch (NumberFormatException e) {
            // Specific: Bad number input
            System.out.println("❌ Invalid divisor: '" + divisorInput + "' is not a number.");

        } catch (ArithmeticException e) {
            // Specific: Division by zero
            System.out.println("❌ Cannot divide by zero! Check your input.");

        } catch (IOException e) {
            // General IO fallback
            System.out.println("❌ File reading error: " + e.getMessage());
        }

        System.out.println("--- Import process ended ---\n");
    }

    public static void main(String[] args) {
        DataImporter importer = new DataImporter();

        importer.importData("data.csv", "5");        // ❌ file not found
        importer.importData("data.csv", "abc");      // ❌ bad number
        importer.importData("data.csv", "0");        // ❌ divide by zero
    }
}


/*
The finally block always executes — whether an exception occurred or not, whether it was caught or not. It runs even if there's a return statement in try or catch.
  
  try {
    // risky code
} catch (Exception e) {
    // handle
} finally {
    // ALWAYS runs - cleanup here
    // close connections, files, etc.
}
*/
  public void getUserData(String sql) {
        Connection conn = null;

        try {
            conn = new Connection("UserDB");
            conn.executeQuery(sql);           // might throw exception
            System.out.println("✅ Query successful!");

        } catch (IllegalArgumentException e) {
            System.out.println("❌ Query error: " + e.getMessage());

        } finally {
            // This ALWAYS runs - connection is ALWAYS closed
            if (conn != null && conn.isOpen) {
                conn.close();
            }
            System.out.println("--- Operation complete ---\n");
        }

/*
Introduced in Java 7, this is the modern and preferred way to handle resources (files, DB connections, streams). Any class implementing AutoCloseable can be used here. The resource is automatically closed at the end of the try block — no finally needed!

    
  try (ResourceType res = new ResourceType()) {
    // use res
} catch (Exception e) {
    // handle
}
// res.close() is automatically called here!

    */
  /*
    Java's built-in exceptions are generic. In real applications, you need domain-specific exceptions that clearly describe what went wrong in your business logic.

    Real World Example — Food Delivery App:

Zomato/Swiggy style app where orders can fail for many business reasons — restaurant closed, item unavailable, payment failed.
  */
/*
  concept:
Multi-catch — handle multiple different exceptions the same way using | operator. Saves duplication.
Exception Chaining — when catching one exception and throwing another, preserve the original cause using initCause() or constructor parameter.
Real World Example — Payment Gateway:

A payment gateway catches low-level network/DB errors and wraps them in a high-level PaymentProcessingException — hiding internal details from the caller.
*/

  /*
    Concept:
KeywordPurposeWhere usedthrowActually throws an exception objectInside method bodythrowsDeclares that a method might throw an exceptionMethod signature
      */
      // throws = declaring in signature
public void readFile(String path) throws IOException {
    // throw = actually throwing it
    if (path == null) throw new IllegalArgumentException("Path is null!");
    // ... read file ...
}
/*
  ******
  Exception Handling Flow:
────────────────────────
try {
    statement 1    ✅ runs
    statement 2    💥 throws exception
    statement 3    ❌ skipped
}
catch (SpecificEx e) { handles if type matches }
catch (GeneralEx e)  { handles if above didn't match }
finally              { ALWAYS runs - cleanup }

Key Rules:
──────────
✅ Specific catch before general catch
✅ finally always executes
✅ try-with-resources = automatic close
✅ throw = throw an object
✅ throws = declare in signature
✅ Custom exceptions for business logic clarity
✅ Exception chaining preserves root cause
  *****
  */
      
