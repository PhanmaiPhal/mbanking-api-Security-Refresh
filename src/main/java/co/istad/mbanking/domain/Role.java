package co.istad.mbanking.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Authority> authorities;


    @Override
    public String getAuthority() {
        return "ROLE_"+name;
    }
}
