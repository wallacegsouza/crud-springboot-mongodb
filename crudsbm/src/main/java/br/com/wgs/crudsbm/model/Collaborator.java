package br.com.wgs.crudsbm.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("collaborators")
public class Collaborator {
    @Id
    private String id;
    private String name;
    private Role role;
}
