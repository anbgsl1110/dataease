package io.dataease.controller.sys.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserGridRequest implements Serializable {
    private String name;
}