package sfgpetclinicweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {

    /**
	 * 
	 */
	private static final long serialVersionUID = 602220093594486176L;
	@Column(name = "name")
    private String name;

	@Builder
    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }
}
