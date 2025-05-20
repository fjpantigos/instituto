package com.instituto.unidad01.infraestructure.adapters.student;

import com.instituto.unidad01.domain.model.Student;
import com.instituto.unidad01.domain.model.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class StudentAdapter implements StudentRepository
{
    private final StudentDataRepository studentDataRepository;

    @Override
    public List<Student> findAll() {
        return studentDataRepository.findAll()
                .stream()
                .map(StudentMapper.MAPPER::toModel)
                .toList();
    }

    @Override
    public Student findById(String uid) {
        return null;
    }
}
