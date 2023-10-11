package com.scaler.SampleDemo;

public class Person {
    String name;
    String message;

    public Person(String name, String message) {
        this.name = name;
        this.message = message;
    }

    // have to add the getters and setters for postman
    // else below error will happen
    //    {
    //        "timestamp": "2023-10-11T11:35:34.301+00:00",
    //            "status": 406,
    //            "error": "Not Acceptable",
    //            "path": "/hello"
    //    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
