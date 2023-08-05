package javaStudyDemo;

import java.util.UUID;

public class getUUIDdemo {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String Suuid = uuid.toString().replace("-","").toUpperCase();
        System.out.println("UUID:"+Suuid);
    }
}
