package com.cocktailexample.cocktailexampletests;


import com.cocktailexample.cocktailexample.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;


import static org.mockito.Mockito.verify;
import static org.testng.AssertJUnit.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MockitoTest {

    @InjectMocks
    private CocktailexampleApplication cocktailexampleApplication;
    @Mock
    ingredientrepository ingredientrepository;
    @Mock
    glassrepository glassrepository;
    @Mock
    garnishrepository garnishrepository;
    @Mock
    equipmentrepository equipmentrepository;
    @Mock
    instructionrepository instructionrepository;
    @Mock
    cocktailinstructionsrepository cocktailinstructionsrepository;
    @Mock
    cocktailrepository cocktailrepository;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        cocktailexampleApplication = new CocktailexampleApplication(ingredientrepository, glassrepository, garnishrepository, equipmentrepository, instructionrepository, cocktailinstructionsrepository, cocktailrepository);
    }
      @Test
    public void testgetAllingreients()
{
    cocktailexampleApplication.getAllingredients();
    verify(ingredientrepository).findAll();
}
   @Test
    public void testaddingredient(){
        ingredient savedingredient = new ingredient();
        savedingredient.setName("vodka");
        savedingredient.setType("alcohol");
        savedingredient.setABV(40);
        savedingredient.setStorage("fridge");
        savedingredient.setDescription("it vodka");


        String expected = "Saved";

        String actual = cocktailexampleApplication.addAningredient(savedingredient.getName(),savedingredient.getType(),savedingredient.getABV(),savedingredient.getStorage(),savedingredient.getDescription());

        ArgumentCaptor<ingredient> ingredientArgumentCaptor = ArgumentCaptor.forClass(ingredient.class);

        verify(ingredientrepository).save(ingredientArgumentCaptor.capture());

        ingredient capturedingredient = ingredientArgumentCaptor.getValue();

        assertEquals("wrong name",savedingredient.getName(),capturedingredient.getName());
        assertEquals("wrong type",savedingredient.getType(),capturedingredient.getType());
        assertEquals("wrong ABV",savedingredient.getABV(),capturedingredient.getABV());
        assertEquals("wrong storage",savedingredient.getStorage(),capturedingredient.getStorage());
        assertEquals("wrong description",savedingredient.getDescription(),capturedingredient.getDescription());

        assertEquals("wrong message",expected,actual);

    }

//    @Test
//    public void testdeleteingredient(){
//
//        String expected = "deleted";
//
//        String actual = cocktailexampleApplication.deleteingredient(ingredient.)
//    }



    @Test
    public void testgetAllglasses()
    {
        cocktailexampleApplication.getAllglasses();
        verify(glassrepository).findAll();
    }


    @Test
    public void testaddglass(){
        glass savedglass = new glass();
        savedglass.setType("shot");
        savedglass.setVolume(44);

        String expected = "Saved";

        String actual = cocktailexampleApplication.addAglass(savedglass.getType(),savedglass.getVolume());

        ArgumentCaptor<glass> glassArgumentCaptor = ArgumentCaptor.forClass(glass.class);

        verify(glassrepository).save(glassArgumentCaptor.capture());

        glass capturedglass = glassArgumentCaptor.getValue();

        assertEquals("wrong type",savedglass.getType(),capturedglass.getType());
        assertEquals("wrong volume",savedglass.getVolume(),capturedglass.getVolume());

        assertEquals("wrong message",expected,actual);

    }

    @Test
    public void testgetAllgarnish()
    {
        cocktailexampleApplication.getAllgarnishs();
        verify(garnishrepository).findAll();
    }
    @Test
    public void testaddgarnish(){
        garnish savedgarnish = new garnish();
        savedgarnish.setId(1);
        savedgarnish.setName("lemon slice");
        savedgarnish.setType("fruit");




        String expected = "Saved";

        String actual = cocktailexampleApplication.addAgarnish(savedgarnish.getId(),savedgarnish.getName(),savedgarnish.getType());

        ArgumentCaptor<garnish> garnishArgumentCaptor = ArgumentCaptor.forClass(garnish.class);

        verify(garnishrepository).save(garnishArgumentCaptor.capture());

        garnish capturedgarnish = garnishArgumentCaptor.getValue();

        assertEquals("wrong Id",savedgarnish.getId(),capturedgarnish.getId());
        assertEquals("wrong name",savedgarnish.getName(),capturedgarnish.getName());
        assertEquals("wrong type",savedgarnish.getType(),capturedgarnish.getType());

        assertEquals("wrong message",expected,actual);

    }
    @Test
    public void testgetAllequipment()
    {
        cocktailexampleApplication.getAllequipment();
        verify(equipmentrepository).findAll();
    }
    @Test
    public void testaddequipment(){
        equipment savedequipment = new equipment();
        savedequipment.setName("shaker");
        savedequipment.setType("hand");




        String expected = "Saved";

        String actual = cocktailexampleApplication.addequipment(savedequipment.getName(),savedequipment.getType());

        ArgumentCaptor<equipment> equipmentArgumentCaptor = ArgumentCaptor.forClass(equipment.class);

        verify(equipmentrepository).save(equipmentArgumentCaptor.capture());

        equipment capturedequipment = equipmentArgumentCaptor.getValue();

        assertEquals("wrong name",savedequipment.getName(),capturedequipment.getName());
        assertEquals("wrong type",savedequipment.getType(),capturedequipment.getType());

        assertEquals("wrong message",expected,actual);

    }
    @Test
    public void testgetAllinstructions()
    {
        cocktailexampleApplication.getAllinstructions();
        verify(instructionrepository).findAll();
    }
    @Test
    public void testaddinstruction(){
        instruction savedinstruction = new instruction();
        savedinstruction.setInstructionid(1);
        savedinstruction.setDescription("description");
        savedinstruction.setGlass_Type("shot");
        savedinstruction.setGarnish_Name("lemon slice");

        String expected = "Saved";

        String actual = cocktailexampleApplication.addinstruction(savedinstruction.getInstructionid(),savedinstruction.getDescription(),savedinstruction.getGlass_Type(),savedinstruction.getGarnish_Name());

        ArgumentCaptor<instruction> instructionArgumentCaptor = ArgumentCaptor.forClass(instruction.class);

        verify(instructionrepository).save(instructionArgumentCaptor.capture());

        instruction capturedinstruction = instructionArgumentCaptor.getValue();

        assertEquals("wrong name",savedinstruction.getInstructionid(),capturedinstruction.getInstructionid());
        assertEquals("wrong type",savedinstruction.getDescription(),capturedinstruction.getDescription());
        assertEquals("wrong glass type",savedinstruction.getGlass_Type(),capturedinstruction.getGlass_Type());
        assertEquals("wrong garnish name",savedinstruction.getGarnish_Name(),capturedinstruction.getGarnish_Name());

        assertEquals("wrong message",expected,actual);

    }

    @Test
    public void testgetAllcocktailinstructions()
    {
        cocktailexampleApplication.getAllcocktailinstructions();
        verify(cocktailinstructionsrepository).findAll();
    }
    @Test
    public void testaddcocktailinstruction(){
        cocktailinstructions savedcocktailinstructions = new cocktailinstructions();
        savedcocktailinstructions.setCocktailinstructionsid(1);
        savedcocktailinstructions.setStepnumber(2);
        savedcocktailinstructions.setInstructionid(3);
        savedcocktailinstructions.setCocktail_Name("Long Island");

        String expected = "Saved";

        String actual = cocktailexampleApplication.addcocktailinstruction(savedcocktailinstructions.getCocktailinstructionsid(),savedcocktailinstructions.getStepnumber(),savedcocktailinstructions.getInstructionid(),savedcocktailinstructions.getCocktail_Name());

        ArgumentCaptor<cocktailinstructions> cocktailinstructionsArgumentCaptor = ArgumentCaptor.forClass(cocktailinstructions.class);

        verify(cocktailinstructionsrepository).save(cocktailinstructionsArgumentCaptor.capture());

        cocktailinstructions capturedcocktailinstructions = cocktailinstructionsArgumentCaptor.getValue();

        assertEquals("wrong cocktail instruction id",savedcocktailinstructions.getCocktailinstructionsid(),capturedcocktailinstructions.getCocktailinstructionsid());
        assertEquals("wrong stepnumbber",savedcocktailinstructions.getStepnumber(),capturedcocktailinstructions.getStepnumber());
        assertEquals("wrong instruction id",savedcocktailinstructions.getInstructionid(),capturedcocktailinstructions.getInstructionid());
        assertEquals("wrong cocktail name",savedcocktailinstructions.getCocktail_Name(),capturedcocktailinstructions.getCocktail_Name());

        assertEquals("wrong message",expected,actual);

    }
    @Test
    public void testgetAllcocktails()
    {
        cocktailexampleApplication.getAllcocktails();
        verify(cocktailrepository).findAll();
    }
    @Test
    public void testaddcocktail(){
        cocktail savedcocktail = new cocktail();
        savedcocktail.setName("Long Island");
        savedcocktail.setType("Alcoholic");

        String expected = "Saved";

        String actual = cocktailexampleApplication.addcocktail(savedcocktail.getName(),savedcocktail.getType());

        ArgumentCaptor<cocktail> cocktailArgumentCaptor = ArgumentCaptor.forClass(cocktail.class);

        verify(cocktailrepository).save(cocktailArgumentCaptor.capture());

        cocktail capturedcocktail = cocktailArgumentCaptor.getValue();

        assertEquals("wrong name",savedcocktail.getName(),capturedcocktail.getName());
        assertEquals("wrong type",savedcocktail.getType(),capturedcocktail.getType());

        assertEquals("wrong message",expected,actual);

    }

}