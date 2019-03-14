package com.example;

public class TagCount {

    private String name;
    private Integer count;

    public TagCount(String name, Integer count) {
        this.name = name;
        this.count = count;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.count;
    }

    @Override
    public boolean equals(Object obj) {
        
        return (this.name == ((TagCount)obj).getName() ? true: false);
    }
}