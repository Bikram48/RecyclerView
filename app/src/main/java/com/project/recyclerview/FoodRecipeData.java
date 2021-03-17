package com.project.recyclerview;

import java.util.ArrayList;

public class FoodRecipeData {
    static ArrayList<Foods> foodList;
    static {
        foodList=new ArrayList<>();
        String name="Dulce de Leche Ice Cream";
        String description="Many dulce de leche recipes call for cooking a can of sweetened condensed milk in boiling water. Our oven method simplifies the process.";
        String ingredients="6–8 fresh cherry peppers (also called pimiento or pimento peppers), halved lengthwise and seeded\n" +
                "1/2 cup goat cheese\n" +
                "1/4 cup skim-milk ricotta cheese\n" +
                "kosher salt and freshly-ground black pepper, to taste1\n" +
                " (14-ounce) can fat-free sweetened condensed milk\n" +
                "\n" +
                "4 cups vanilla low-fat ice cream";
        String image="recipe1";
        String procedure="Step 1\n" +
                "Preheat oven to 400°.\n" +
                "\n" +
                "Step 2\n" +
                "Pour milk into a 9-inch pie plate; cover with foil. Place pie plate in a shallow roasting pan. Add hot water to pan to a depth of halfway up the sides of pie plate. Bake milk at 400° for 1 1/2 hours, adding additional water as needed. Remove pie plate from water. Uncover; stir milk with a whisk until smooth. Cool.\n" +
                "\n" +
                "Step 3\n" +
                "Place a large bowl in freezer. Let ice cream stand at room temperature 45 minutes or until softened.\n" +
                "\n" +
                "Step 4\n" +
                "With a rubber spatula or stand mixer, combine softened ice cream";
        foodList.add(new Foods(name,description,image,ingredients,procedure));
        name="Green Bean and Mushroom Medley";
        description="This is a great vegetable side dish. This is always \n" +
                " served at our family gatherings with no leftovers.";
        ingredients="½ pound fresh green beans, cut into 1-inch lengths\n" +
                "\n" +
                "2 carrots, cut into thick strips\n" +
                "\n" +
                "¼ cup butter\n" +
                "\n" +
                "1 onion, sliced\n" +
                "\n" +
                "½ pound fresh mushrooms, sliced\n" +
                "\n" +
                "1 teaspoon salt\n" +
                "\n" +
                "½ teaspoon seasoned salt\n" +
                "\n" +
                "¼ teaspoon garlic salt\n" +
                "\n" +
                "¼ teaspoon white pepper";
        image="recipe2";
        procedure="Step 1\n" +
                "Place green beans and carrots in 1 inch of boiling water. Cover, and cook until tender but still firm. Drain.\n" +
                "\n" +
                "Step 2\n" +
                "Melt butter in a large skillet over medium heat. Saute onions and mushrooms until almost tender. Reduce heat, cover, and simmer 3 minutes. " +
                "Stir in green beans, carrots, salt, seasoned salt, garlic salt, and white pepper. Cover, and cook for 5 minutes over medium heat.";
        foodList.add(new Foods(name,description,image,ingredients,procedure));

        name="Farmer's Stovetop Mix";
        description="Some days I love to cook a big meal, you know, meat, potatoes, vegetables and dessert. Other days, I just want to taste" +
                " the flavors of the fresh vegetables in at the farmer's market, fresh picked and each showing off their own personality of flavor: earthy, light," +
                " sweet and delicious. Today was one of those days.";
        ingredients="2 medium\n" +
                "red bell peppers, fresh\n" +
                "2 medium\n" +
                "yellow bell pepper, fresh\n" +
                "2 medium\n" +
                "orange bell pepper, fresh\n" +
                "1 large\n" +
                "walla-walla or vidalia onion\n" +
                "2 medium\n" +
                "tomatoes, roma, grape or other brand\n" +
                "4-6\n" +
                "button mushroom or any brand you like\n" +
                "2-3 Tbsp\n" +
                "sweet cream butter\n" +
                "1-2 clove\n" +
                "garlic\n" +
                "·\n" +
                "sea salt & pepper";
        image="recipe3";
        procedure="Rinse and dry all vegetables, except mushrooms. Clean them with a dry paper towel. Prepare by cleaning out seeds and stems, slice uniformly to about same size.\n" +
                "In a skillet, melt butter and add onion, garlic and then rest of vegetables. Season with sea salt & pepper. Saute' until tender. Tomatoes will give up their flavorful juice and disintegrate slightly.\n" +
                "Serve and eat your heart out!!";
        foodList.add(new Foods(name,description,image,ingredients,procedure));

        name="Stir-Fried Cherries with Chocolate Chip Cones";
        description="Serve a quick version of cherries jubilee by making a simply cherry sauce from cherry jelly, sweet cherries, and cherry brandy.";
        ingredients="2 tablespoons red currant or cherry jelly\n" +
                "\n" +
                "1 tablespoon butter\n" +
                "\n" +
                "1 12-ounce package frozen, dark, sweet cherries (or 2 cups pitted fresh cherries)\n" +
                "\n" +
                "2 tablespoons cherry brandy, optional\n" +
                "\n" +
                "1 ½ pints chocolate chip ice cream\n" +
                "\n" +
                "4 ice cream cones";
        image="recipe4";
        procedure="Step 1\n" +
                "Melt jelly and butter in a medium skillet over medium heat until it begins to bubble. Add cherries and cook, stirring 2 to 3 minutes, " +
                "until cherries are heated through and release their juices. Pour in brandy (if using), and simmer 1 minute longer. Place scoops of ice " +
                "cream in cones. Pour hot cherries into serving bowls and invert cones on top of warm cherries. Serve immediately.";
        foodList.add(new Foods(name,description,image,ingredients,procedure));

        name="PEACH MELBA (NON-ALCOHOLIC)";
        description="Many dulce de leche recipes call for cooking a can of sweetened condensed milk in boiling water. Our oven method simplifies the process.";
        ingredients="8\n" +
                "ounces peach nectar\n" +
                "2\n" +
                "scoops vanilla ice cream";
        image="recipe5";
        procedure="Combine all ingredients in blender on low speed.\n" +
                "Pour into highball glass and garnish with raspberries if desired.";
        foodList.add(new Foods(name,description,image,ingredients,procedure));

        name="German Chocolate Ice Cream Pie";
        description="Don’t you love a good shortcut recipe? Like this pie without all the hassle of rolling out and shaping dough and spending all that time making a filling. This only requires five ingredients and it starts with a simple coconut crust and it’s filled to the brim with a rich and luscious store bought chocolate ice cream filling.\n" +
                "\n";
        ingredients="1 (14 oz) bag sweetened shredded coconut, divided\n" +
                "3 Tbsp I Can't Believe It's Not Butter® Spread , melted\n" +
                "1 (1.5 qt) container Breyers® Chocolate Ice Cream\n" +
                "1/2 cup chopped toasted pecans\n" +
                "2 Tbsp Breyers® Caramel Flavored Ice Cream Sauce";
        image="recipe6";
        procedure="1. Preheat oven to 350 degrees. Spray a 9-inch deep dish pie plate with no-stick cooking spray, set aside.\n" +
                "2. Set aside 1/2 cup of the coconut, then combine remaining coconut with melted margarine or ICBINB in a medium mixing bowl. Toss until mixture is evenly moistened, then firmly press into bottom and sides of prepared pie dish. Bake 13 - 15 minutes then cover edges loosely with foil to prevent excessive browning, then bake 10 - 15 minutes longer until crust is golden. Cool completely on a wire rack.\n" +
                "3. Meanwhile, spread remaining 1/2 cup coconut on a microwave safe plate and microwave on HIGH power 1 minute. Stir then microwave in 30 second increments until golden, stirring after each increment, set aside (alternately you can just toast coconut in oven on a baking sheet since it is already preheated from baking crust).\n";
        foodList.add(new Foods(name,description,image,ingredients,procedure));

    }
}
