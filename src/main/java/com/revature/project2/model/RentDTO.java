package com.revature.project2.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class RentDTO {
    private int managerId;
    private int renterId;
    private List<Integer> bookIds;
}
