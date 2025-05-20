package com.instituto.unidad01.domain.model;

import java.util.List;

public interface StudentRepository {

    List<Student> findAll();

    Student findById(String uid);

}
