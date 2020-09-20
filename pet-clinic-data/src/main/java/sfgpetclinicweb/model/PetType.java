package sfgpetclinicweb.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

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

}
