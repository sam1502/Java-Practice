/**
 * You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items.
 * We want to create the text that should be displayed next to such an item.
 *
 * Implement a function likes :: [String] -> String, which must take in input array, containing the names of people who like an item.
 * It must return the display text as shown in the examples:
 */


package codewars;

public class WhoLikesIt {

    public static String whoLikesIt(String... names) {

        switch (names.length) {
            case 0: return "no one likes this";
            case 1: return names[0] + " likes this";
            case 2: return names[0] +" and "+ names[1] + " likes this";
            case 3: return names[0] +", " + names[1] + " and" + names[2] + " likes this";
            case 4: return names[0] +", "+ names[1] +" and " + (names.length -2)+ " likes this";
            default:
                return "no one";
        }
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Peter"));
        System.out.println(whoLikesIt("Jacob", "Alex"));
        System.out.println(whoLikesIt("Max", "John", "Mark"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}
