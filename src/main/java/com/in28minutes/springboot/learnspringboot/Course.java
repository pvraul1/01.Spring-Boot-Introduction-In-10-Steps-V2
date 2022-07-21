package com.in28minutes.springboot.learnspringboot;

/**
 * The course class.
 *
 * @author architecture - pvraul1
 * @since 1.17
 * @version Jul 21, 2022 - 10:59:19 AM
 *
 */
public class Course {
    private long id;
    private String name;
    private String author;

    /**
     * Create a new instance of the class.
     *
     * @param id
     * @param name
     * @param author
     */
    public Course(long id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
    }

}
