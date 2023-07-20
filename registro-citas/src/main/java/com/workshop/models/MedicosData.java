package com.workshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicosData {
    private String FIRST_NAME;
    private String LAST_NAME;
    private String user_id;
}
