package org.example.backend.dto.graph;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GraphDto {
    private UUID id;

    private int step;
    private int xMax;
    private int yMax;
    private int xMin;
    private int yMin;

}
