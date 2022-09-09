package com.amigoscode.testing.customer;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Entity
/*
    allowGetters=true (Read-only property - disallow client to set value but allow to get value):
    [server send to client] when entity to json_string (serialization) -> payload include id with value
    [client send to server] when json_string to entity (deserialization) -> payload include id with null
    use case: customer_id

    allowSetters=true (disallow client to get value but allow to set value):
    [server send to client] when entity to json_string (serialization) -> payload not include id
    [client send to server] when json_string to entity (deserialization) -> payload include id with value
    use case: password
*/
//@JsonIgnoreProperties(value = {"id"}, allowGetters = true)
@JsonIgnoreProperties(allowGetters = true)
public class Customer {
    @Id
    private UUID ID;
    @NotBlank
    @Column(nullable = false)
    private String name;
    @NotBlank
    @Column(nullable = false, unique = true)
    private String phoneNumber;

    public Customer(UUID ID, String name, String phoneNumber) {
        this.ID = ID;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Customer() {
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
