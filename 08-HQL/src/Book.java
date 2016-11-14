import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
/*@NamedQueries({
@NamedQuery(name = "allbooks", query = "from Book"),
@NamedQuery(name="bookbytitle" , query="select title from Book"),
@NamedQuery(name="bookbyId" , query="from Book where id>:idvalue")
})

@NamedNativeQuery(name = "join", query = "SELECT * FROM book  b JOIN bookcategory bc ON b.bc_id=bc.id")*/
public class Book 
{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String author;
	
	@ManyToOne
	private BookCategory bc;
	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author+ "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public BookCategory getBc() {
		return bc;
	}
	public void setBc(BookCategory bc) {
		this.bc = bc;
	}
	
}
