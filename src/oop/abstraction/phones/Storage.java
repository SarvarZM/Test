package oop.abstraction.phones;

public interface Storage extends CloudStorage {

    int PHONEMEMORY=256;

    String upLoad();

    static String share(){
        return "Memory is sharing...";
    }
    default String delete(){
        return "Memory is being deleted..";
    }
}
