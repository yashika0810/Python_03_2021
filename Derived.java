package first;
class Base {

    private void foo() {}

}

class Test extends Base {

    void foo() {}

}

public class Derived {

    public static void main(String args[]) {

        Test d = new Test();

        d.foo();

    }

}