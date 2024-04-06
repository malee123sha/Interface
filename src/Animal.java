public interface Animal {
    abstract void getParts(int hands,int legs);
}
class Cat implements Animal {
    @Override
    public void getParts(int hands, int legs) {
        System.out.println("Hands :-"+hands+"   "+"Legs:-"+legs);
    }
}
class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.getParts(2,2);
    }
}
