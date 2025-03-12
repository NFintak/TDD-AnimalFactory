package rocks.zipcodewilmington;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import java.util.Date;


/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    //void add(Cat cat)
    @Test
    public void test1addCat() {
        //given
        String name = "Steph";
        Date birthDate = new Date(2017/5/13);
        Cat cat = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        //when
        CatHouse.add(cat);
        //then
        CatHouse.getNumberOfCats();
    }
    //void remove(Integer id)
    @Test
    public void test1removeCatById() {
        //given
        Cat cat1 = new Cat("Homer", new Date(1999/2/24), 0);
        Cat cat2 = new Cat("Achilles", new Date(2014/5/19), 1);
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        //when
        CatHouse.remove(1);
        //then
        Assert.assertTrue(CatHouse.getCatById(0) != null);
        Assert.assertTrue(CatHouse.getCatById(1) == null);
        Assert.assertTrue(1 == CatHouse.getNumberOfCats());
    }
    //void remove(Cat cat)
    @Test
    public void test1removeCat() {
        //given
        Cat cat1 = new Cat("Orpheus", new Date(2016/11/14), 0);
        Cat cat2 = new Cat("Eurydice", new Date(2017/10/29), 1);
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        //when
        /// DON'T FORGET TO ADD THE CATS TO THE CATHOUSE BEFORE TRYING TO REMOVE/TEST FOR THEM
        CatHouse.remove(cat2);
        //then
        Assert.assertTrue(CatHouse.getCatById(0) != null);
        Assert.assertTrue(CatHouse.getCatById(1) == null);
        Assert.assertTrue(1 == CatHouse.getNumberOfCats());
    }
    //return Cat for getCatById(Integer id)
    @Test
    public void test1getCatById() {
        //given
        Cat cat = new Cat("Tally", new Date(2022/2/18), 1);
        CatHouse.add(cat);
        //then
        Assert.assertTrue(cat == CatHouse.getCatById(1));
    }

    //return Integer for getNumberOfCats()

}
