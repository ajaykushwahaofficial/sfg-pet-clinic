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
@Table(name = "specialties")
public class Speciality extends BaseEntity {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3521450207260286347L;
	@Column(name = "description")
    private String description;

}
