package org.example.utils;

public interface Serialization<T> {
    String serialize(T obj);
    T deserialize(String data);
}
