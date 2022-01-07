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
      @org.junit.Test
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

        System.out.println(savedingredient.toString());
        System.out.println(capturedingredient);

        assertEquals("wrong name",savedingredient.getName(),capturedingredient.getName());
        assertEquals("wrong name",savedingredient.getType(),capturedingredient.getType());
        assertEquals("wrong name",savedingredient.getABV(),capturedingredient.getABV());
        assertEquals("wrong name",savedingredient.getStorage(),capturedingredient.getStorage());
        assertEquals("wrong name",savedingredient.getDescription(),capturedingredient.getDescription());


        assertEquals("wrong message",expected,actual);

    }
}
