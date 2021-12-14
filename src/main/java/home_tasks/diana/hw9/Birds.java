package home_tasks.diana.hw9;

abstract class Birds implements livingRegion {

    public abstract void sing();

    public abstract void fly();

    public void eat() {
        System.out.println("I've found some food");
    }

}

class Pigeons extends Birds {

    @Override
    public void sing() {

    }

    @Override
    public void fly() {
        System.out.println("Pigeons fly everywhere");
    }

    @Override
    public String getLivingReqion() {
        return "Europe";
    }
}

class Penguins extends Birds {

    @Override
    public void sing() {

    }

    @Override
    public void fly() {
        System.out.println("Penguins can't fly");
    }

    @Override
    public String getLivingReqion() {
        return "Antarctica";
    }
}

class Kiwi extends Birds {

    @Override
    public void sing() {

    }

    @Override
    public void fly() {
        System.out.println("Kiwi can't fly");
    }

    @Override
    public void eat() {
        System.out.println("I eat some special food");
    }

    @Override
    public String getLivingReqion() {
        return "New Zealand";
    }
}
