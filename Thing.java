abstract class Thing {
    public abstract void getDescription();
}

class Video extends Thing {

    public void getDescription() {
        System.out.println("test");
    }
}

class Audio extends Thing {
    public void getDescription() {
        System.out.println("test");
    }
}

class Book extends Thing {
    public void getDescription() {
        System.out.println("test");
    }
}
