package com.isoftechtraining;

import java.util.Objects;

/**
 * Created by Rajesh on 6/26/2016.
 */
public class Person {

    private String firstName;
    private String lastName;
    private long ssn;

    public Person(String firstName, String lastName, long ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }
public Person()
{}



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }


    @Override
    public boolean equals(Object o) {

        if (this == o) return true;  //same memory location

        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return (ssn == person.ssn);
    }


    @Override
    public int hashCode() {
        return Objects.hash(ssn);
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn=" + ssn +
                '}';
    }



}
