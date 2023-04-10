package com.example.alekxmiecommerceapi.entity.account;

import com.example.alekxmiecommerceapi.entity.abstraction.BaseEntityWithId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "user_account")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UserAccountEntity extends BaseEntityWithId {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;

    @Column(name = "enabled")
    private boolean enabled;

    @Column(name = "removed")
    private boolean removed;

    @ManyToMany(cascade = ALL)
    @JoinTable(name = "user_account_role",
            joinColumns = {
                    @JoinColumn(name = "user_account_id", referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "role_id", referencedColumnName = "id")
            }
    )
    private Set<RoleEntity> roles = new HashSet<>();

    public Set<AuthorityEntity> getAuthorities() {
        return roles
                .stream()
                .map(RoleEntity::getAuthorities)
                .flatMap(Set::stream)
                .collect(Collectors.toSet());
    }
}
