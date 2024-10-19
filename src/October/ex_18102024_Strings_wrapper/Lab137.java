package October.ex_18102024_Strings_wrapper;

public class Lab137 {
}

class Super {

    private int a;

    protected Super(int a) {
        this.a = a;
    }
    Super(){

    }
}

class Sub extends Super {

    public Sub(int a) {
        super(a);
    }

    public Sub() {
        super();
    }
}
