/**
 * @author yufeng1900
 * @create 2021-01-23 14:31
 */
public class Plural_7 {
    private int real;
    private int virtual;

    private Plural_7(){

    }

    public Plural_7(int real, int virtual) {
        this.real = real;
        this.virtual = virtual;
    }

    public Plural_7 plus(Plural_7 b){// c = a + b
        Plural_7 c = new Plural_7();
        c.real = this.real + b.real;
        c.virtual = this.virtual + b.virtual;
        return c;
    }

    public Plural_7 minus(Plural_7 b){//c = a - b
        Plural_7 c = new Plural_7();
        c.real = this.real - b.real;
        c.virtual = this.virtual - b.virtual;
        return c;
    }

    public Plural_7 ride(Plural_7 b){//c = a * b
        Plural_7 c = new Plural_7();
        c.real = this.real * b.real - this.virtual * b.virtual;
        c.virtual = this.virtual*b.real + b.virtual*this.real;
        return c;
    }

    @Override
    public String toString(){
        return real + "+" + virtual + "i";
    }
}
