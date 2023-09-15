package com.systechafrica.Part2.constructors;

public class Customer {
    private String id;
    private String hjl;

    public Customer(String id, String hjl) {
        this.id = id;
        this.hjl = hjl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHjl() {
        return hjl;
    }

    public void setHjl(String hjl) {
        this.hjl = hjl;
    }

}
