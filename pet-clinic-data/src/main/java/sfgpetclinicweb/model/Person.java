package sfgpetclinicweb.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4970993978492606017L;

	public Person(Long id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

}
