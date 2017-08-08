package net.bqc.annotation;

public class FileNode extends Node {

    @JciaIgnore
    public String field4 = "1";

    public String field5 = "1";

    @Override
    public String toString() {
        return "FileNode{" +
                "field4='" + field4 + '\'' +
                ", field5='" + field5 + '\'' +
                ", field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
                '}';
    }
}
