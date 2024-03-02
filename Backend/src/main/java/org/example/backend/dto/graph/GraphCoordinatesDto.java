package org.example.backend.dto.graph;

import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GraphCoordinatesDto {
    private ArrayList<Float> xCoords;
    private ArrayList<Float> yCoords;
}
