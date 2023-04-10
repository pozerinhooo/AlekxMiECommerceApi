package com.example.alekxmiecommerceapi.entity.shipping;

import com.example.alekxmiecommerceapi.entity.abstraction.BaseEntityWithId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "country")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CountryEntity extends BaseEntityWithId {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "removed")
    private boolean removed;
}
