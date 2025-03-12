package rocks.zipcodewilmington;
import org.junit.jupiter.api.BeforeEach;
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

    @BeforeEach
    void setUp() {
        CatHouse.clear();
    }


    //void add(Cat cat)
    @Test
    public void test1addCat() {
        String name = "Steph";
        Date birthDate = new Date(2017/5/13);
        Cat cat = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(cat);
        CatHouse.getNumberOfCats();
    }
    //void remove(Integer id)
    @Test
    public void test1removeCatById() {
        Cat cat1 = new Cat("Homer", new Date(1999/2/24), 0);
        Cat cat2 = new Cat("Achilles", new Date(2014/5/19), 1);
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        CatHouse.remove(1);
        Assert.assertTrue(CatHouse.getCatById(0) != null);
        Assert.assertTrue(CatHouse.getCatById(1) == null);
        Assert.assertTrue(1 == CatHouse.getNumberOfCats());
    }
    //void remove(Cat cat)
    @Test
    public void test1removeCat() {
        Cat cat1 = new Cat("Orpheus", new Date(2016/11/14), 0);
        Cat cat2 = new Cat("Eurydice", new Date(2017/10/29), 1);
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        CatHouse.remove(cat2);
        Assert.assertTrue(CatHouse.getCatById(0) != null);
        Assert.assertTrue(CatHouse.getCatById(1) == null);
        Assert.assertTrue(1 == CatHouse.getNumberOfCats());
    }
    //return Cat for getCatById(Integer id)
    @Test
    public void test1getCatById() {
        Cat cat1 = new Cat("Tally", new Date(2022/2/18), 1);
        CatHouse.add(cat1);
        Assert.assertTrue(cat1 == CatHouse.getCatById(1));
    }
    //return Integer for getNumberOfCats()
    @Test
    public void test1getNumberOfCats() {
        Cat cat1 = new Cat("Dina", new Date(2022/3/15), 4);
        Cat cat2 = new Cat("Shelly", new Date(2023/6/12), 2);
        Cat cat3 = new Cat("Riley", new Date(2021/11/19), 1);
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        CatHouse.add(cat3);
        Assert.assertTrue(3 == CatHouse.getNumberOfCats());
    }

    @Test
    public void test2getNumberOfCats() {
        Cat cat1 = new Cat("Dina", new Date(2022/3/15), 4);
        Cat cat2 = new Cat("Shelly", new Date(2023/6/12), 2);
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        Assert.assertTrue(2 == CatHouse.getNumberOfCats());
    }
}
