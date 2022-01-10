package com.cocktailexample.cocktailexampletests;


import com.cocktailexample.cocktailexample.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;


import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;
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

    @Test
    public void testdeleteingredient(){
        ingredient savedingredient = new ingredient();
//        savedingredient.setName("vodka");
//        savedingredient.setType("alcohol");
//        savedingredient.setABV(40);
//        savedingredient.setStorage("fridge");
//        savedingredient.setDescription("it vodka");
//
//
//        cocktailexampleApplication.addAningredient(savedingredient.getName(),savedingredient.getType(),savedingredient.getABV(),savedingredient.getStorage(),savedingredient.getDescription());
//        System.out.println(savedingredient.getIngredientid());
        given(ingredientrepository.findById(savedingredient.getIngredientid())).willReturn(Optional.of(savedingredient));
        String expected = "deleted";

        String actual = cocktailexampleApplication.deleteingredient(savedingredient.getIngredientid());

//        ArgumentCaptor<ingredient> ingredientArgumentCaptor = ArgumentCaptor.forClass(ingredient.class);
//

//
//        ingredient capturedingredient = ingredientArgumentCaptor.getValue();
//
//        assertEquals("wrong name",null,capturedingredient.getName());
        Assertions.assertEquals(expected,actual);
        verify(ingredientrepository).deleteById(savedingredient.getIngredientid());
    }

    @Test
    public void testdeletenoingredient(){
        String expected = "no ingredient";
        String actual = cocktailexampleApplication.deleteingredient(anyInt());
        Assertions.assertEquals(expected,actual);
    }

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
    public void testdeleteglass(){
        glass savedglass = new glass();

        given(glassrepository.findById(savedglass.getId())).willReturn(Optional.of(savedglass));

        String expected = "deleted";
        String actual = cocktailexampleApplication.deleteglass(savedglass.getId());

        Assertions.assertEquals(expected,actual);
        verify(glassrepository).deleteById(savedglass.getId());
    }

    @Test
    public void testdeletenoglass(){
        String expected = "no glass";
        String actual = cocktailexampleApplication.deleteglass(anyInt());
        Assertions.assertEquals(expected,actual);}

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
    public void testdeletegarnish(){
        garnish savedgarnish = new garnish();

        given(garnishrepository.findById(savedgarnish.getId())).willReturn(Optional.of(savedgarnish));

        String expected = "deleted";
        String actual = cocktailexampleApplication.deletegarnish(savedgarnish.getId());

        Assertions.assertEquals(expected,actual);
        verify(garnishrepository).deleteById(savedgarnish.getId());
    }

    @Test
    public void testdeletenogarnish(){
        String expected = "no garnish";
        String actual = cocktailexampleApplication.deletegarnish(anyInt());
        Assertions.assertEquals(expected,actual);}

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
    public void testdeleteequipment(){
        equipment savedequip = new equipment();

        given(equipmentrepository.findById(savedequip.getId())).willReturn(Optional.of(savedequip));

        String expected = "deleted";
        String actual = cocktailexampleApplication.deleteequipment(savedequip.getId());

        Assertions.assertEquals(expected,actual);
        verify(equipmentrepository).deleteById(savedequip.getId());
    }

    @Test
    public void testdeletenoequipment(){
        String expected = "no equipment";
        String actual = cocktailexampleApplication.deleteequipment(anyInt());
        Assertions.assertEquals(expected,actual);}
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
    public void testdeleteinstruction(){
        instruction savedinst = new instruction();

        given(instructionrepository.findById(savedinst.getInstructionid())).willReturn(Optional.of(savedinst));

        String expected = "deleted";
        String actual = cocktailexampleApplication.deleteinstruction(savedinst.getInstructionid());

        Assertions.assertEquals(expected,actual);
        verify(instructionrepository).deleteById(savedinst.getInstructionid());
    }

    @Test
    public void testdeletenoinstruction(){
        String expected = "no instruction";
        String actual = cocktailexampleApplication.deleteinstruction(anyInt());
        Assertions.assertEquals(expected,actual);}

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
    public void testdeletecocktailinstruction(){
        cocktailinstructions savedci = new cocktailinstructions();

        given(cocktailinstructionsrepository.findById(savedci.getCocktailinstructionsid())).willReturn(Optional.of(savedci));

        String expected = "deleted";
        String actual = cocktailexampleApplication.deletecocktailinstruction(savedci.getCocktailinstructionsid());

        Assertions.assertEquals(expected,actual);
        verify(cocktailinstructionsrepository).deleteById(savedci.getCocktailinstructionsid());
    }

    @Test
    public void testdeletenococktailinstruction(){
        String expected = "no cocktail instructions";
        String actual = cocktailexampleApplication.deletecocktailinstruction(anyInt());
        Assertions.assertEquals(expected,actual);}
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
    @Test
    public void testdeletecocktail(){
        cocktail savedc = new cocktail();

        given(cocktailrepository.findById(savedc.getId())).willReturn(Optional.of(savedc));

        String expected = "deleted";
        String actual = cocktailexampleApplication.deletecocktail(savedc.getId());

        Assertions.assertEquals(expected,actual);
        verify(cocktailrepository).deleteById(savedc.getId());
    }

    @Test
    public void testdeletenococktail(){
        String expected = "no cocktail";
        String actual = cocktailexampleApplication.deletecocktail(anyInt());
        Assertions.assertEquals(expected,actual);}

}