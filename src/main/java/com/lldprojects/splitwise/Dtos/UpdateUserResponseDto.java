package com.lldprojects.splitwise.Dtos;

import com.lldprojects.splitwise.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateUserResponseDto {
    private User user;

    @Override
    public String toString() {
        return "UpdateUserResponseDto{" +
                "user=" + user +
                '}';
    }
}
