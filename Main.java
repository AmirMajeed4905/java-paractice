// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);  // ✅ Scanner object banaya
//         System.out.print("Enter your name: "); // ✅ User ko prompt dena achha hota hai
//         String name = sc.nextLine();           // ✅ Input lena
//         System.out.print("Enter your age: "); // ✅ User ko prompt dena achha hota hai
//         int age = sc.nextInt();                // ✅ Input lena
//         System.out.println("Hello, " + name + "! You are " + age + " years old."); // ✅ Output
//         sc.close(); // ✅ Scanner ko close karna best practice hai
//     }
// }


// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println("Sum: " + (a + b));
//         sc.close();
//     }
// }


// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         if (n % 2 == 0)
//             System.out.println("Even");
//         else
//             System.out.println("Odd");
//         sc.close();
//     }
// }




// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int fact = 1;
//         for (int i = 1; i <= n; i++) {
//             fact *= i;
//         System.out.println("Factorial: " + fact);

//         }
//         System.out.println("Factorial: " + fact);
//         sc.close();
//     }
// }



// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int rev = 0;
//         while (num != 0) {
//             rev = rev * 10 + num % 10;
//             num /= 10;
//         }
//         System.out.println("Reverse: " + rev);
//         sc.close();
//     }
// }





// public class Main {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 10;

//         int temp = a; // temp me a rakh lo
//         a = b;        // a me b rakh do
//         b = temp;     // b me temp (old a) rakh do

//         System.out.println("After swap: a = " + a + ", b = " + b);
//     }
// }


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(prime ? "Prime" : "Not Prime");
        sc.close();
    }
}
