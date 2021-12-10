package com.cocktailexample.cocktailexample;

import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@SpringBootApplication
@RestController
@RequestMapping("/cocktails")
public class CocktailexampleApplication {

	@Autowired
	private ingredientrepository ingredientrepository;
	@Autowired
	private glassrepository glassrepository;
	@Autowired
	private garnishrepository garnishrepository;
	@Autowired
	private equipmentrepository equipmentrepository;
	@Autowired
	private instructionrepository instructionrepository;
	@Autowired
	private cocktailinstructionsrepository cocktailinstructionsrepository;
	@Autowired
	private cocktailrepository cocktailrepository;

	public static void main(String[] args) {
		SpringApplication.run(CocktailexampleApplication.class, args);
	}






	///ingredients///
	@GetMapping("/ingredients")
	public @ResponseBody Iterable<ingredient>getAllingredients(){return ingredientrepository.findAll();}

	@PostMapping("/addingredient")
	public @ResponseBody String addAningredient
			(
					@RequestParam String name,
					@RequestParam String type,
					@RequestParam int ABV,
					@RequestParam String storage,
					@RequestParam String description
					){
		ingredient savedingredient = new ingredient(name,type,ABV,storage,description);
		ingredientrepository.save(savedingredient);
		return "Saved";}

	/*@DeleteMapping("/deleteingredient")
	public String deleteingredient
			(
					@RequestParam int ingredientid
			)
	{
		Optional<ingredient> deletedingredient = ingredientrepository.findById(ingredientid);
		if (deletedingredient.isEmpty()) {
			return "no ingredient";
		}
		ingredientrepository.delete(deletedingredient.get());
		return "deleted";






	}*/
///glasses///
@GetMapping("/glasses")
public @ResponseBody Iterable<glass>getAllglasses(){return glassrepository.findAll();}

	@PostMapping("/addglass")
	public @ResponseBody String addAglass
			(
					@RequestParam String type,
					@RequestParam int volume
			){
		glass savedglass = new glass(type,volume);
		glassrepository.save(savedglass);
		return "Saved";
	}
	/*@DeleteMapping("/deleteglass")
	public String deleteglass
			(
					@RequestParam int id
			)
	{
		Optional<glass> deletedglass = glassrepository.findById(id);
		if (deletedglass.isEmpty()) {
			return "no glass";
		}
		glassrepository.delete(deletedglass.get());
		return "deleted";
	}*/







	///garnish///
	@GetMapping("/garnishes")
	public @ResponseBody Iterable<garnish>getAllgarnishs(){return garnishrepository.findAll();}

	@PostMapping("/addgarnish")
	public @ResponseBody String addAgarnish
			(
					@RequestParam int id,
					@RequestParam String name,
					@RequestParam String type

			){
		garnish savedgarnish = new garnish(id,name,type);
		garnishrepository.save(savedgarnish);
		return "Saved";
	}
	/*@DeleteMapping("/deletegarnish")
	public String deletegarnish
			(
					@RequestParam int id
			)
	{
		Optional<garnish> deletedgarnish = garnishrepository.findById(id);
		if (deletedgarnish.isEmpty()) {
			return "no garnish";
		}
		garnishrepository.delete(deletedgarnish.get());
		return "deleted";
	}*/





	///equipment///
	@GetMapping("/equipment")
	public @ResponseBody Iterable<equipment>getAllequipment(){return equipmentrepository.findAll();}

	@PostMapping("/addequipment")
	public @ResponseBody String addequipment
			(
					@RequestParam String name,
					@RequestParam String type

			){
		equipment savedequipment = new equipment(name,type);
		equipmentrepository.save(savedequipment);
		return "Saved";
	}
	/*@DeleteMapping("/deleteequipment")
	public String deleteequipment
			(
					@RequestParam int id
			)
	{
		Optional<equipment> deletedequipment = equipmentrepository.findById(id);
		if (deletedequipment.isEmpty()) {
			return "no equipment";
		}
		equipmentrepository.delete(deletedequipment.get());
		return "deleted";
	}*/






	///instruction///
	@GetMapping("/instructions")
	public @ResponseBody Iterable<instruction>getAllinstructions(){return instructionrepository.findAll();}

	@PostMapping("/addinstruction")
	public @ResponseBody String addinstruction
			(
					@RequestParam int instructionid,
					@RequestParam String description,
					@RequestParam String glass_Type,
					@RequestParam String garnish_Name



			){
		instruction savedinstruction = new instruction(instructionid,description,glass_Type,garnish_Name);
		instructionrepository.save(savedinstruction);
		return "Saved";
	}
	/*@DeleteMapping("/deleteinstruction")
	public String deleteinstruction
			(
					@RequestParam int instructionid
			)
	{
		Optional<instruction> deletedinstruction = instructionrepository.findById(instructionid);
		if (deletedinstruction.isEmpty()) {
			return "no instruction";
		}
		instructionrepository.delete(deletedinstruction.get());
		return "deleted";
	}*/






	///cocktail instructions///
	@GetMapping("/cocktailinstructions")
	public @ResponseBody Iterable<cocktailinstructions>getAllcocktailinstructions(){return cocktailinstructionsrepository.findAll();}

	@PostMapping("/addcocktailinstruction")
	public @ResponseBody String addcocktailinstruction
			(
					@RequestParam int cocktailinstructionid,
					@RequestParam int stepnumber,
					@RequestParam int instructionid,
					@RequestParam String cocktail_Name


			){
		cocktailinstructions savedcocktailinstruction = new cocktailinstructions(cocktailinstructionid,stepnumber,instructionid,cocktail_Name);
		cocktailinstructionsrepository.save(savedcocktailinstruction);
		return "Saved";
	}
	/*@DeleteMapping("/deletecocktailinstruction")
	public String deletecocktailinstruction
			(
					@RequestParam int cocktailinstructionsid
			)
	{
		Optional<cocktailinstructions> deletedcocktailinstruction = cocktailinstructionsrepository.findById(cocktailinstructionsid);
		if (deletedcocktailinstruction.isEmpty()) {
			return "no cocktail instructions";
		}
		cocktailinstructionsrepository.delete(deletedcocktailinstruction.get());
		return "deleted";
	}*/






	///cocktail///
	@GetMapping("/cocktails")
	public @ResponseBody Iterable<cocktail>getAllcocktails(){return cocktailrepository.findAll();}

	@PostMapping("/addcocktail")
	public @ResponseBody String addcocktail
			(
					@RequestParam String name,
					@RequestParam String type

			){
		cocktail savedcocktail = new cocktail(name,type);
		cocktailrepository.save(savedcocktail);
		return "Saved";
	}
	/*@DeleteMapping("/deletecocktail")
	public String deletecocktail
			(
					@RequestParam int id
			) {
		Optional<cocktail> deletedcocktail = cocktailrepository.findById(id);
		if (deletedcocktail.isEmpty()) {
			return "no cocktail";
		}
		cocktailrepository.delete(deletedcocktail.get());
		return "deleted";
	}*/
}
	/*@CrossOrigin("http://localhost:8080")
	@GetMapping("/customRoute")
	public String myresponse() {
		cocktail longisland = new cocktail("Long Island", "alcoholic");
		return longisland.toString();
	}*/