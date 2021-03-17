package com.project.recyclerview;

public class Foods {
    private String name;
    private String description;
    private String image;
    private String ingredients;
    private String Procedure;

    public Foods(String name, String description, String image, String ingredients, String procedure) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.ingredients = ingredients;
        Procedure = procedure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getProcedure() {
        return Procedure;
    }

    public void setProcedure(String procedure) {
        Procedure = procedure;
    }
}
