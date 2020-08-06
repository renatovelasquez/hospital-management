package io.renato.hospital.patient.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tbl_hospital")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
public class Hospital extends EntityBase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "The field name is necessary")
    private String name;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "patient_id", referencedColumnName = "id")
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//    private Patient patient;

}