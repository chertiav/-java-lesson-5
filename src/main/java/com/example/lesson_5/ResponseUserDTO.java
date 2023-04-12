package com.example.lesson_5;

import lombok.Data;

import java.util.Objects;
import java.util.UUID;
@Data
public class ResponseUserDTO extends CreateUserDTO{
    private UUID id;

    public ResponseUserDTO(CreateUserDTO data, UUID id) {
        super(data.getName(), data.getAge(), data.getGender(), data.getCompany(), data.getEmail(), data.getPhone());
        this.id = id;
    }

    public ResponseUserDTO() {
        super();;
    }

}
