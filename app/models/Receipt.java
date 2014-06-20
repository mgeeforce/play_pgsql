/**
 * 
 */
package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

/**
 * @author mike
 *
 */
@Entity
public class Receipt extends Model {
	
	private static final long serialVersionUID = 1L;

	@Id
	public Long id;
	
	@Required
	public String name;
	
	@Required
	public byte[] attachment;
	
	   /**
     * Generic query helper for entity ExpenseItem with id Long
     */
    public static Finder<Long,Receipt> find = new Finder<Long,Receipt>(Long.class, Receipt.class); 


}
