package org.example.backend.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.cache.annotation.Cacheable;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Entity
@Table(name = "graphs")
public class Graph {
    @Id @GeneratedValue private UUID id;

    @Column(nullable = false)
    private int xSize;
    private int ySize;
    private int Step;

}
