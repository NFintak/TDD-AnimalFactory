package rocks.zipcodewilmington;

import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import org.junit.Assert;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`


    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
    //void .add(Dog dog)
    @Test
    public void test1addDog() {
        DogHouse.clear();
        Dog dog1 = new Dog("Stevie", new Date(2016/3/19), 1);
        DogHouse.add(dog1);
        Assert.assertTrue(1 == DogHouse.getNumberOfDogs());
    }

    @Test
    public void test2addDog() {
        DogHouse.clear();
        Dog dog1 = AnimalFactory.createDog("Ollie", new Date(2023/2/16));
        Dog dog2 = new Dog("Bean", new Date(2024/9/20), 3);
        DogHouse.add(dog1);
        DogHouse.add(dog2);
        Assert.assertTrue(2 == DogHouse.getNumberOfDogs());
    }
    //void .remove(Integer id)
    @Test
    public void test1removeDogByID() {
        DogHouse.clear();
        Dog dog1 = AnimalFactory.createDog("Georgie", new Date(2014/5/19));
        Dog dog2 = AnimalFactory.createDog("Mel", new Date(2015/8/23));
        DogHouse.add(dog1);
        DogHouse.add(dog2);
        Assert.assertTrue(2 == DogHouse.getNumberOfDogs());
        DogHouse.remove(dog1.getId());
        Assert.assertTrue(1 == DogHouse.getNumberOfDogs());
    }

    @Test
    public void test2removeDogByID() {
        DogHouse.clear();
        Dog dog1 = new Dog("Charlie", new Date(2022/4/1), 0);
        Dog dog2 = new Dog("Nikki", new Date(2023/7/14), 1);
        Dog dog3 = new Dog("Shiloh", new Date(2017/8/19), 2);
        DogHouse.add(dog1);
        DogHouse.add(dog2);
        DogHouse.add(dog3);
        Assert.assertTrue(3 == DogHouse.getNumberOfDogs());
        DogHouse.remove(1);
        Assert.assertTrue(2 == DogHouse.getNumberOfDogs());
        Assert.assertEquals(dog1, DogHouse.getDogById(0));
        Assert.assertTrue(DogHouse.getDogById(1) == null);
        Assert.assertEquals(dog3, DogHouse.getDogById(2));
    }
    //void .remove(Dog dog)
    @Test
    public void test1removeDog() {
        DogHouse.clear();
        Dog dog1 = new Dog("Clementine", new Date(2019/4/28), 0);
        Dog dog2 = new Dog("Ziggy", new Date(2022/9/13), 1);
        DogHouse.add(dog1);
        DogHouse.add(dog2);
        Assert.assertTrue(2 == DogHouse.getNumberOfDogs());
        DogHouse.remove(dog1);
        Assert.assertTrue(1 == DogHouse.getNumberOfDogs());
        Assert.assertTrue(DogHouse.getDogById(0) == null);
        Assert.assertEquals(dog2, DogHouse.getDogById(1));
    }

    @Test
    public void test2removeDog() {
        DogHouse.clear();
        Dog dog1 = new Dog("Izzy", new Date(2014/9/7), 0);
        DogHouse.add(dog1);
        Assert.assertTrue(1 == DogHouse.getNumberOfDogs());
        DogHouse.remove(dog1);
        Assert.assertTrue(0 == DogHouse.getNumberOfDogs());
        Assert.assertTrue(DogHouse.getDogById(0) == null);
    }
    //void .getDogById(Integer id)
    @Test
    public void test1getDogByID() {
        DogHouse.clear();
        Dog dog1 = AnimalFactory.createDog("Ronnie", new Date(2009/5/23));
        DogHouse.add(dog1);
        Assert.assertEquals(dog1, DogHouse.getDogById(dog1.getId()));
    }

    @Test
    public void test2getDogByID() {
        DogHouse.clear();
        Dog dog1 = new Dog("Harley", new Date(2011/3/28), 0);
        DogHouse.add(dog1);
        Assert.assertEquals(dog1, DogHouse.getDogById(0));
    }
    //void .getNumberOfDogs
    @Test
    public void test1getNumberOfDogs() {
        DogHouse.clear();
        Dog dog1 = new Dog("Charlie", new Date(2023/4/11), 0);
        Dog dog2 = new Dog("Nikki", new Date(2020/7/14), 1);
        Dog dog3 = new Dog("Shiloh", new Date(2013/8/19), 2);
        Dog dog4 = new Dog("Georgie", new Date(2019/5/19), 3);
        DogHouse.add(dog1);
        DogHouse.add(dog2);
        DogHouse.add(dog3);
        DogHouse.add(dog4);
        Assert.assertTrue(4 == DogHouse.getNumberOfDogs());
    }
}
