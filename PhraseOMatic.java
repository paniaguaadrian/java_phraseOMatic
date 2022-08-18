/**
 * PhraseOMatic
 */
public class PhraseOMatic {
  public static void main(String[] args) {
    // Create three sets of random words
    String[] wordListOne = { "agnostic", "opinionated", "voice activated", "extensible", "AI enabled", "agent based" };
    String[] wordListTwo = { "six sigma", "pub-sub", "distributed ledger", "service oriented", "cloud native",
        "event driven" };
    String[] wordListThree = { "framework", "design", "perspective", "architecture", "rest api", "library" };

    // Find out how many words are in each list
    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;

    // Generate three random numbers
    // nextInt() method returns a random number between 0
    // and the one specified on the params
    java.util.Random randomGenerator = new java.util.Random();
    int rand1 = randomGenerator.nextInt(oneLength);
    int rand2 = randomGenerator.nextInt(twoLength);
    int rand3 = randomGenerator.nextInt(threeLength);

    // Build a phrase
    // Here we are selecting a random word from each of the list with [rand1] which
    // is a random number between 0 and the lenght of the list
    String phrase = wordListOne[rand1] + ", " + wordListTwo[rand2] + " and " + wordListThree[rand3] + ".";

    // Print the output
    System.out.println(phrase);
  }

}