package com.company.Homework11.Problem1;

public class Command {

        private DrinkType drinkType;
        private int sugarCount;

        public Command(DrinkType drinkType, int sugarCount) {
            this.drinkType = drinkType;
            this.sugarCount = sugarCount;
        }

        public DrinkType getDrinkType() {
            return drinkType;
        }

        public void setDrinkType(DrinkType drinkType) {
            this.drinkType = drinkType;
        }

        public int getSugarCount() {
            return sugarCount;
        }

        public void setSugarCount(int sugarCount) {
            this.sugarCount = sugarCount;
        }
    }

