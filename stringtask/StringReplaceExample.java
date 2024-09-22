// class StringConcatenation {
//     public static void main(String[] args) {
//         String str1 = "Hello, ";
//         String str2 = "world!";
        
//         // Concatenate using the concat() method
//         String result = str1.concat(str2);
        
//         System.out.println(result); 
//     }
// }

// class Apple{

//     public static void main(String args[]){
//         String name = "My name is mukilan";
//         System.out.println(name.length());
//     }
// }


class Mango{
    public static void main(String[] args) {
        String name = "My name is mukilan";
        System.out.println(name.toLowerCase());
    }
}

// class grapes{
//     public static void main(String[] args) {
//         String name = "My name is mukilan";
//         System.out.println(name.toUpperCase());
//     }
// }



public class StringReplaceExample {
    public static void main(String[] args) {
        String originalString = "java programming";

        // Replace 'a' with 'o'
        String replacedString = originalString.replace('a', 'o');

        // Replace 'programming' with 'language'
        String replacedString2 = originalString.replace("programming", "language");

        // Print the results
        System.out.println("Original String: " + originalString);
        System.out.println("After replacing 'a' with 'o': " + replacedString);
        System.out.println("After replacing 'programming' with 'language': " + replacedString2);
    }
}

////1.add characters to the string:
// public class StringAddExample {
//     public static void main(String[] args) {
//         String a = "my name is mukilan";
//         String b = "and";
//         String c = a + " " + b;
//         System.out.println(c);
        
// //         StringBuilder sb = new StringBuilder("Java");

// //         // Add characters to the StringBuilder
// //         sb.append(' ');
// //         sb.append("Programming");
        
// //         // Convert StringBuilder back to String
// //         String result = sb.toString();

//         // Print the result
//         // System.out.println("Modified String: " + result);
//     }
// }



// import java.util.Scanner;

// public class StringEqualityCheck {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input two strings
//         System.out.print("Enter the first string: ");
//         String str1 = scanner.nextLine();

//         System.out.print("Enter the second string: ");
//         String str2 = scanner.nextLine();

//         // Check if the two strings are equal
//         if (str1.equals(str2)) {
//             System.out.println("The strings are equal.");
//         } else {
//             System.out.println("The strings are not equal.");
//         }

//         // Close the scanner
//         scanner.close();
//     }
}


