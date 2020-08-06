package io.renato.hospital.entity;
import lombok.*;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tbl_patient")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
public class Patient extends EntityBase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message= "The field name is necessary")
    private String name;
    @NotBlank(message= "The field last name is necessary")
    @Column(name = "last_name")
    private String lastName;
    @NotBlank(message= "The field birth date is necessary")
    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @NotBlank(message= "The field address is necessary")
    private String address;
    private String photo;
//    @OneToMany(targetEntity = MedicalRecord.class, cascade = CascadeType.ALL, mappedBy = "patient")
//    private List<MedicalRecord> medicalRecords;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public Date getBirthDate() {
//        return birthDate;
//    }
//
//    public void setBirthDate(Date birthDate) {
//        this.birthDate = birthDate;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getPhoto() {
//        return photo;
//    }
//
//    public void setPhoto(String photo) {
//        this.photo = photo;
//    }

//    public List<MedicalRecord> getMedicalRecords() {
//        return medicalRecords;
//    }
//
//    public void setMedicalRecords(List<MedicalRecord> medicalRecords) {
//        this.medicalRecords = medicalRecords;
//    }
}