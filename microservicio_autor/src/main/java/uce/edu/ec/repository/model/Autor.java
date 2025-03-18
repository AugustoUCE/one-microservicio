package uce.edu.ec.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "autor")
public class Autor {

    @Id
    @GeneratedValue(generator = "autor_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "autor_seq", sequenceName = "autor_seq", allocationSize = 1)
    @Column(name = "autor_id")
    private Integer id;
    @Column(name = "autor_nombre")
    private String nombre;
    @Column(name = "autor_universidad")
    private String universidad;

}
