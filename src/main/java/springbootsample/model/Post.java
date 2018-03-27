package springbootsample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "post")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column(name = "tittle")
	String tittle;
	@Column(name = "content")
	String content;
	@Column(name = "cat_id")
	int cat_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Post() {
		super();
	}

	public Post(String tittle, String content, int cat_id) {
		super();
		this.tittle = tittle;
		this.content = content;
		this.cat_id = cat_id;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", tittle=" + tittle + ", content=" + content + ", cat_id=" + cat_id + "]";
	}

}
