package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;


//@NamedNativeQuery(name = "Book.findQuery1", query = "somequery",resultClass = Book.class)
@Entity
public class Book {

    @Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", isbn=" + isbn + "]";
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    
    private String title;
	
    @Column(unique = true)
	private String isbn;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	

    public Book() {
    }

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    // getters and setters removed for brevity
}