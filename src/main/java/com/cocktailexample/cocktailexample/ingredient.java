package com.cocktailexample.cocktailexample;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ingredient {

    @Id
    @GeneratedValue(strategy=GenerationType.TABLE)

    ///attributes///
    private int ingredientid;
    private String name;
    private String type;
    private int ABV;
    private String storage;
    private String description;
    ///constructors///
    public ingredient(String name,String type,int ABV,String storage,String description)
    {
        this.name=name;
        this.type=type;
        this.ABV=ABV;
        this.storage=storage;
        this.description=description;
    }

    ///methods///

    public ingredient(){}

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public String getType(){return type;}
    public void setType(String type){this.type=type;}

    public int getABV(){return ABV;}
    public void setABV(int ABV){this.ABV=ABV;}

    public String getStorage(){return storage;}
    public void setStorage(String storage){this.storage=storage;}

    public String getDescription(){return description;}
    public void setDescription(String description){this.description=description;}

   /* public String toString() {
        return "ingredientid="+ ingredientid+
                "name="+ name+
                "type="+type+
                "ABV="+ABV+
                "storage="+storage+
                "description="+description;
    }*/
}
