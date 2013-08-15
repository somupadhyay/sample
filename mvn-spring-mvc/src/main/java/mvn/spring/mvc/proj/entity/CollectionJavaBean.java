/**
 * 
 */
package mvn.spring.mvc.proj.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

/**
 * @author Somnath.Upadhyay
 *
 */

@Entity
@Table(name="COLL_JAVA_BEAN")
public class CollectionJavaBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="COLL_BEAN_ID")
	private int id;
	
	
	@ElementCollection
	@MapKeyColumn(name="PROPERTY_KEY")
	@Column(name="PROPERTY_VALUE")
	@CollectionTable(name="COLL_JAVA_BEAN_PROPS")
	private Map<String, String> map;
	
	@ElementCollection
	@CollectionTable(name="BLOGS", joinColumns=@JoinColumn(name="COLL_BEAN_ID"))
	@Column(name="BLOG")
	private List<String> blogs;
	
	@ManyToOne
	@JoinColumn(name = "JAVA_BEAN", referencedColumnName = "BEAN_ID")
	private JavaBean javaBean;

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
	 * @return the map
	 */
	public Map<String, String> getMap() {
		return map;
	}

	/**
	 * @param map the map to set
	 */
	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	/**
	 * @return the blogs
	 */
	public List<String> getBlogs() {
		return blogs;
	}

	/**
	 * @param blogs the blogs to set
	 */
	public void setBlogs(List<String> blogs) {
		this.blogs = blogs;
	}

	/**
	 * @return the javaBean
	 */
	public JavaBean getJavaBean() {
		return javaBean;
	}

	/**
	 * @param javaBean the javaBean to set
	 */
	public void setJavaBean(JavaBean javaBean) {
		this.javaBean = javaBean;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CollectionJavaBean [id=" + id + ", map=" + map + ", blogs="
				+ blogs + ", javaBean=" + javaBean + "]";
	}

	
	
}
