package rocks.zipcodewilmington;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Assert;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    //is any set-up needed?
    @BeforeEach


    @Test
    public void test1CreateDog() {
        //given
        String givenName = "Cujo";
        Date givenBirthDate = new Date(2018/10/31);
        Dog dog = AnimalFactory.createDog(givenName, givenBirthDate);
        //when
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedID = dog.getId();
        //then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertTrue(retrievedID != null);
    }

    @Test
    public void test1CreateCat() {
        //given
        String givenName = "Lydia";
        Date givenBirthDate = new Date(2024/7/11);
        Cat cat = AnimalFactory.createCat(givenName, givenBirthDate);
        //when
        String retrievedName = cat.getName();
        Date retrievedDate = cat.getBirthDate();
        Integer retrievedID = cat.getId();
        //then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedDate);
        Assert.assertTrue(retrievedID != null);

    }
}
