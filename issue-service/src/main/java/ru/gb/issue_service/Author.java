package ru.gb.issue_service;
import lombok.Data;

import java.util.UUID;

@Data
public class Author {
    private UUID id;
    private String firstName;
    private String lastName;
}
