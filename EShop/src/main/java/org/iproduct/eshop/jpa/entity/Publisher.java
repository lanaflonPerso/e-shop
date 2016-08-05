package org.iproduct.eshop.jpa.entity;

//
// This file was generated by the JPA Modeler
//

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;
import javax.validation.constraints.NotNull;

@Entity
public class Publisher implements Serializable {
    
    @TableGenerator(name = "publisher_gen",
            table = "id_gen",
            pkColumnName = "GEN_KEY",
            valueColumnName = "GEN_VALUE",
            pkColumnValue = "publisher_id",
            allocationSize = 1
    )
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "publisher_gen")
    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    private Long id;


    @OneToMany(targetEntity = Book.class, mappedBy = "publisher")
    private List<Book> books;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private String name;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private String url;

    public Publisher() {
    }
    
    public Publisher(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Publisher{" + "id=" + id + ", name=" + name +  ", books=" + books + ", url=" + url + '}';
    }
    
}
