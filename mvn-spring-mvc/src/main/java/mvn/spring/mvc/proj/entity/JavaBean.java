/**
 * 
 */
package mvn.spring.mvc.proj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Somnath.Upadhyay
 *
 */

@Entity
@Table(name="JAVA_BEAN")
public class JavaBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="BEAN_ID")
	private int id;
	
	@Column(name="BEAN_VALUE")
	private String value;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "JavaBean [id=" + id + ", value=" + value + "]";
	}
	
}
