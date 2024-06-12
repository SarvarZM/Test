package oop.abstraction.phones;

public class Samsung extends Phone{
    @Override
    public String call() {
        return "SamSung is calling";
    }

    @Override
    public String text() {
        return "Samsung is texting";
    }

    @Override
    public String takePhoto() {
        return "Samsung is uploading";
    }

    @Override
    public String upLoad() {
        return "Samsung is uploading to memory";
    }
}
