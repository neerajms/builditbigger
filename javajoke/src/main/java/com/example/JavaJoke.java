package com.example;

import java.util.ArrayList;
import java.util.Random;

public class JavaJoke {
    public String getJoke() {
        return "I'd like to buy a new boomerang please. Also, can you tell me how to throw the old one away?";
    }

    public String getPaidJoke() {
        ArrayList<String> arrayList = new ArrayList<String>(6);
        arrayList.add(0, "Doctor: \"I'm sorry but you suffer from a terminal illness and have only 10 to live.\"\n" +
                "\n" + "Patient: \"What do you mean, 10? 10 what? Months? Weeks?!\"\n" + "\n" + "Doctor: \"Nine.\"\n");
        arrayList.add(1, "I'd like to buy a new boomerang please. Also, can you tell me how to throw the old one away?");
        arrayList.add(2, "When my wife starts to sing I always go out and do some garden work so our neighbors can see there's no domestic violence going on.\n");
        arrayList.add(3, "My girlfriend told me I was one in a million. When I looked through her text messages, I had to admit she was right.\n");
        arrayList.add(4, "After many years of studying at a university, I’ve finally become a PhD… or Pizza Hut Deliveryman as people call it.\n");
        arrayList.add(5, "There is nothing worse than child polio. No wait, there's women's soccer.\n");
        Random random = new Random();
        int randomNumber = random.nextInt(arrayList.size());
        return arrayList.get(randomNumber);
    }
}
