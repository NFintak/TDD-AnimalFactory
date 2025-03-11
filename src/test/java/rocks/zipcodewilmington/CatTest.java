package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)` **done
    // TODO - Create tests for `speak` **done
    // TODO - Create tests for `setBirthDate(Date birthDate)` **done
    // TODO - Create tests for `void eat(Food food)` **done
    // TODO - Create tests for `Integer getId()` **done
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword` **double check formatting
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword` **double check formatting


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    //rename cat
    @Test
    public void test1setName() {
        //given
        String tempName = "Crab Rangoon";
        String newName = "Gwen";
        Date givenBirthdate = new Date();
        Integer givenId = 1;
        //when (new cat made)
        Cat cat = new Cat(tempName, givenBirthdate, givenId);
        //when (cat's name changed)
        cat.setName(newName);
        String retrievedName = cat.getName();
        //then
        Assert.assertEquals(newName, retrievedName);
    }

    @Test
    public void test2setName() {
        //given
        String tempName = "Robin";
        String newName = "Batgirl";
        Date givenBirthdate = new Date();
        Integer givenId = 1;
        //when (new cat)
        Cat cat = new Cat(tempName, givenBirthdate, givenId);
        //when (cat's name is changed)
        cat.setName(newName);
        String retrievedName = cat.getName();
        //then
        Assert.assertEquals(newName, retrievedName);
    }
    //check speak method
    @Test
    public void test1speakAndBeHeardCat() {
        //given
        String givenName = "Zuko";
        Date givenBirthDate = new Date();
        Integer givenId = 2;
        String expectedSound = "meow!";
        //when
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        String actualSound = cat.speak();
        //then
        Assert.assertEquals(expectedSound, actualSound);
    }
    //set new birthdate
    @Test
    public void test1setBirthdate() {
        //given
        String givenName = "Goomba";
        Date tempDate = new Date();
        Integer givenId = 1;
        Cat cat = new Cat(givenName, tempDate, givenId);
        //when
        cat.setBirthDate(new Date(2019/2/15));
        Date retrievedBirthDate = cat.getBirthDate();
        //then
        Assert.assertEquals(new Date(2019/2/15), retrievedBirthDate);

    }

    @Test
    public void test2setBirthdate() {
        //given
        String givenName = "Koopa";
        Date tempDate = new Date();
        Integer givenId = 42;
        Cat cat = new Cat(givenName, tempDate, givenId);
        //when
        cat.setBirthDate(new Date());
        Date retrievedDate = cat.getBirthDate();
        //then
        Assert.assertEquals(new Date(), retrievedDate);
    }
    //check eat method
    @Test
    public void test1canTheCatEat() {
        //given
        String givenName = "Shelly";
        Date givenBirthDate = new Date(2018/4/18);
        Integer givenId = 2;
        Cat cat = new Cat(givenName, givenBirthDate,givenId);
        //when
        Food dryFood = new Food("Dry food");
        cat.eat(dryFood);
        //then
        Assert.assertTrue(1 == cat.getNumberOfMealsEaten());

    }

    @Test
    public void test2canTheCatEat() {
        //given
        Cat cat = new Cat("", new Date(), 1);
        //when
        Food fish = new Food("Fish");
        Food dryFood = new Food("Dry food");
        cat.eat(fish);
        cat.eat(dryFood);
        cat.eat(dryFood);
        //then
        Assert.assertTrue(3 == cat.getNumberOfMealsEaten());
    }
    //check Integer getId()
    @Test
    public void test1getCatID() {
        //given
        Cat cat = new Cat("Tilda", new Date(), 73);
        //when
        Integer retrievedIdNum = cat.getId();
        //then
        Assert.assertTrue(73 == retrievedIdNum);
    }

    @Test
    public void test2getCatID() {
        //given
        Cat cat = new Cat("Zelda", new Date(), 42);
        //when
        Integer retrievedIdNum = cat.getId();
        //then
        Assert.assertTrue(42 == retrievedIdNum);
    }
    //check animal inheritance
    @Test
    public void catCheckAnimalInheritance() {
        Cat cat = new Cat("Link", new Date(), 38);
        Assert.assertTrue(cat instanceof Animal);
    }
    //check mammal inheritance
    @Test
    public void catCheckMammalInheritance() {
        Cat cat = new Cat("Peach", new Date(), 27);
        Assert.assertTrue(cat instanceof Mammal);
    }
}
