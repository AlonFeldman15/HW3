public abstract class AnimalFactory {
    public abstract Animal createAnimal();
        }

        class UnicornFactory extends AnimalFactory {
    @Override
    public Animal createAnimal(){
        int sumOfUnicorn = 0;
        sumOfUnicorn++;
        return new Unicorn();
    }
}
    class ZebraFactory extends AnimalFactory {
        @Override
        public Animal createAnimal(){
            int sumOfZebra = 0;
            sumOfZebra++;
            return new Zebra();
        }
    }

    class MonkeyFactory extends AnimalFactory {
        @Override
        public Animal createAnimal(){
            int sumOfMonkey = 0;
            sumOfMonkey++;
            return new Monkey();
        }
    }

