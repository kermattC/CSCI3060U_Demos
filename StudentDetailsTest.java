import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;


public class StudentDetailsTest {

    StudentDetails student1;
    String name = "Matt";
    String pet = "Dog";

    // since we're developing a JUnit test for another class, using the @BeforeEach annotation will prevent a new instance from being created at every test
    @BeforeEach
    void setUp() {
        student1 = new StudentDetails(name, pet);
    }
    
    // some pre set variables for the test cases
    String wrongSentence = "lorem ipsum is a simple dummy text";
    String correctPetSentence = "The pet is a Dog";

    // simple test that just asserts the value in the parameter is true
    // the @Test annotation pretty much tells the compiler that this is a test method
    @Test
    void demoTestMethod() {
        System.out.println("Assert true test");
        assertTrue(true);
    }

    // the next two methods demonstrates the use of assertEquals
    // this test will fail due to different values in the first and second parameter. The third parameter gives a message if the test fails
    @Test
    public void checkPetting() {
        System.out.println("Testing the number of pets the pet is getting");
        Assertions.assertEquals(student1.petThePet(5), wrongSentence, "Expected name did not match");
    }

    // case where the assertEquals test passes
    @Test
    public void checkPetSentence() {
        System.out.println("Testing the pet sentence");
        Assertions.assertEquals(student1.getPet(), correctPetSentence, "Expected sentence did not match");
    }

    @Test
    public void checkPet() {
        System.out.println("Testing petChecker method");
        Assertions.assertEquals(student1.petChecker(pet), student1.petChecker("Dog"), "This student should have a dog");
    }

    // you can have multiple tests in a single method as well
    @Test
    public void checkPettingFewTimes(){
        System.out.println("Runing multiple tests for the pet sentence");
        Assertions.assertEquals(student1.getPet(), "The pet is a Dog", "The pet should be a dog");
        Assertions.assertEquals(student1.getPet(), "The"+" pet is a Dog", "The pet should be a dog");
        Assertions.assertEquals(student1.getPet(), "asdf", "The pet should be a dog");
        Assertions.assertEquals(student1.getPet(), "The test won't reach this because the previous test failed", "The pet should be a dog");
    }
}