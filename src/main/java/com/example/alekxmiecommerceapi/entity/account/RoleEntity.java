package com.example.alekxmiecommerceapi.entity.account;

import com.example.alekxmiecommerceapi.entity.abstraction.BaseEntityWithId;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.CascadeType.*;

@Entity
@Data
@Table(name = "role")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoleEntity extends BaseEntityWithId {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "removed")
    private boolean removed;

    @ManyToMany(mappedBy = "roles", cascade = {
            DETACH, MERGE, PERSIST, REFRESH
    })
    private Set<UserAccountEntity> users = new HashSet<>();

    @ManyToMany(cascade = ALL)
    @JoinTable(name = "role_authority",
            joinColumns = {
                    @JoinColumn(name = "role_id", referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "authority_id", referencedColumnName = "id")
            }
    )
    private Set<AuthorityEntity> authorities = new HashSet<>();

}
