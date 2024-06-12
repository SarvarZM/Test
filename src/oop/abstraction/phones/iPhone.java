package oop.abstraction.phones;

public class iPhone extends Phone{
    @Override
    public String call() {
        return "iPhone is calling";
    }

    @Override
    public String text() {
        return "iPhone is texting";
    }

    @Override
    public String takePhoto() {
        return "iPhone is taking photo";
    }

    @Override
    public String upLoad() {
        return "iphone is uploading to memory";
    }
}
