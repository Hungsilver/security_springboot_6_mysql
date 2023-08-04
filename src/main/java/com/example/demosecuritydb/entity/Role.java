package com.example.demosecuritydb.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "role")
public class Role implements Serializable {
    @Id
    private String id;

    private String name;

    @JsonIgnore
    @ToString.Exclude
    @ManyToMany(mappedBy = "roles")
    private List<Employee> employees = new ArrayList<>();
}
