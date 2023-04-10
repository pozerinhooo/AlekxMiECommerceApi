package com.example.alekxmiecommerceapi.entity.account;

import com.example.alekxmiecommerceapi.entity.abstraction.BaseEntityWithId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "authority")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AuthorityEntity extends BaseEntityWithId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "permission")
    private String permission;

    @Column(name = "removed")
    private boolean removed;

    @ManyToMany(mappedBy = "authorities")
    private Set<RoleEntity> roles = new HashSet<>();
}
