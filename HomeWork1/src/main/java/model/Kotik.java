package model;

public class Kotik {
    private int prettiness;
    private String name;
    private int weight;
    private String meow;
    private int satiety;
    private static int objectCounter = 0;

    public Kotik() {
        this.satiety = 8;
        objectCounter++;
    }

    public Kotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        this.satiety = 8;
        objectCounter++;
    }

    public void setKotik (int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public void setPrettiness() {
        this.prettiness = prettiness;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public String getMeow() {
        return meow;
    }

    public void setMeow() {
        this.meow = meow;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety() {
        this.satiety = satiety;
    }

    public static int getObjectCounter() {
        return Kotik.objectCounter;
    }

    private boolean catPlays() {
        if (this.satiety > 0) {
            this.meow = "I like to play!";
            System.out.println(meow + "Cat is playing");
            return true;
        } else {
            this.meow = "I want to eat!!!";
            return false;
        }
    }

    private boolean catSleeps() {
        if (this.satiety > 0) {
            this.meow = "I like to sleep!";
            System.out.println(meow + "Cat is sleeping!");
            return true;
        } else {
            this.meow = "I want to eat!!!";
            return false;
        }
    }
    private boolean eat(int satiety) {
        this.satiety += satiety;
        System.out.println("Nyam-Nyam!" + this.satiety);
        return true;
    }
    private boolean eat(int satiety, String food) {
        this.satiety = this.satiety + satiety*satiety;
        System.out.println("Nyam-Nyam!" + this.satiety);
        return true;
    }
    private boolean eat() {
        return eat(1, "Food");
    }
    private boolean catCatchesMice() {
        if (this.satiety > 0) {
            this.meow = "I'm the greatest hunter!";
            System.out.println(meow + "Rrrrrrrrr!Gotcha!");
            return true;
        } else {
            this.meow = "I want to eat!!!";
            return false;
        }
    }

    private boolean catPurrs() {
        if (this.satiety > 0) {
            this.meow = "Murrr-Murrr";
            System.out.println(meow + "Murrr-Murrr");
            return true;
        } else {
            this.meow = "I want to eat!!!";
            return false;
        }
    }

    public void liveAnotherDay() {
        for (int i = 0; i < 24; i++) {
            int func = ((int) (Math.random() * 5) )+ 1;
            switch (func) {
                case 1: {
                    if (this.catPlays() != true)
                        this.eat(2);
                }
                break;
                case 2: {
                    if (this.catSleeps() != true)
                        this.eat(2);
                }
                break;
                case 3: {
                    this.eat(2);
                }
                break;
                case 4: {
                    if (this.catCatchesMice() != true)
                        this.eat(2);
                }
                break;
                case 5: {
                    if (this.catPurrs() != true)
                        this.eat(2);
                }
                break;
            }
            this.satiety--;
        }
    }
}