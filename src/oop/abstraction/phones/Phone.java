package oop.abstraction.phones;

public abstract class Phone implements Storage,Camera{
    public abstract String call();

    public abstract String text();
}
