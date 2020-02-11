package feb.assessment.ui.response;

import java.util.Random;

public class RandomNumberResponse {
    int randomNumber;

    public RandomNumberResponse(){
        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 999999
        randomNumber = rand.nextInt(1000000);

    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }


}
