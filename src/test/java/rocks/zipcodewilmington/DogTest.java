package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    //new dog tests
    @Test
    public void test1dogConstructor() {
        //given
        String givenName = "Cujo";
        Date givenBirthDate = new Date(2016/8/19);
        Integer givenId = 3;
        //when (constructor and pulling retrieved vars)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        String retrievedName = dog.getName();
        Date retrievedDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();
        //then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    //check speak method
    @Test
    public void test1speakAndBeHeardDog() {
        //given
        Dog dog = new Dog("Winston", new Date(2015/3/15), 2);
        String expectedSound = "bark!";
        //when
        String actualSound = dog.speak();
        //then
        Assert.assertEquals(expectedSound, actualSound);
    }
    //set new birthday
    @Test
    public void test1setBirthdate() {
        //given
        Dog dog = new Dog("Charlie", new Date(), 19);
        Date updatedBirthdate = new Date(2023/12/28);
        //when
        dog.setBirthDate(updatedBirthdate);
        //then
        Assert.assertEquals(updatedBirthdate, dog.getBirthDate());
    }

    @Test
    public void test2setBirthdate() {
        //given
        Dog dog = new Dog("Randy", new Date(2019/9/24), 3);
        Date updatedBirthdate = new Date(2019/9/23);
        //when
        dog.setBirthDate(updatedBirthdate);
        //then
        Assert.assertEquals(updatedBirthdate, dog.getBirthDate());
    }
    //check eat method
    @Test
    public void test1canTheDogEat() {
        //given
        Dog dog = new Dog("", new Date(), 2);
        Food dryFood = new Food("Dry food");
        Food treats = new Food("Treats");
        //when
        dog.eat(dryFood);
        dog.eat(treats);
        //then
        Assert.assertTrue(2 == dog.getNumberOfMealsEaten());
    }

    @Test
    public void test2canTheDogEat() {
        Dog dog = new Dog("", new Date(), 2);
        Food dryFood = new Food("Dry food");
        Food treats = new Food("Treats");
        //when
        dog.eat(dryFood);
        dog.eat(dryFood);
        dog.eat(treats);
        //then
        Assert.assertTrue(3 == dog.getNumberOfMealsEaten());
    }
    //check Integer getId()
    @Test
    public void test1getDogID() {
        //given
        Dog dog = new Dog("", new Date(), 43);
        //when
        Integer retrievedIdNum = dog.getId();
        //then
        Assert.assertTrue(43 == retrievedIdNum);
    }

    @Test
    public void test2getDogID() {
        Dog dog = new Dog("", new Date(), 3);
        Integer retrievedIdNum = dog.getId();
        Assert.assertTrue(3 == retrievedIdNum);
    }
    //check animal inheritance, will need to import class
    @Test
    public void dogCheckAnimalInheritance(){
        Dog dog = new Dog("Brennan", new Date(2022/4/27), 3);
        Assert.assertTrue(dog instanceof Animal);
    }
    //check mammal inheritance, will need to import class
    @Test
    public void dogCheckMammalInheritance() {
        Dog dog = new Dog("Marty", new Date(2024/9/14), 4);
        Assert.assertTrue(dog instanceof Mammal);
    }
}
