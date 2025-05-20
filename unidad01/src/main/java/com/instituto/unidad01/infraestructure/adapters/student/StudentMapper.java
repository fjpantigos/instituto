package com.instituto.unidad01.infraestructure.adapters.student;

import com.instituto.unidad01.domain.model.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentMapper MAPPER = Mappers.getMapper(StudentMapper.class);

    Student toDomain(StudentData entity);

    StudentData toEntity(Student domain);
}
