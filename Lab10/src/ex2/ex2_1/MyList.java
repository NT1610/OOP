package ex2.ex2_1;

public interface MyList {
    void add(Object o, int index);
    void add(Object o);
    void remove(int index);
    int size();
    Object get(int index);
}
