/*
 * This file is generated by jOOQ.
*/
package net.cloudopt.next.example.orm.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Todo implements Serializable {

    private static final long serialVersionUID = 1917156442;

    private Integer   id;
    private String    text;
    private Integer   state;
    private Timestamp time;

    public Todo() {}

    public Todo(Todo value) {
        this.id = value.id;
        this.text = value.text;
        this.state = value.state;
        this.time = value.time;
    }

    public Todo(
        Integer   id,
        String    text,
        Integer   state,
        Timestamp time
    ) {
        this.id = id;
        this.text = text;
        this.state = state;
        this.time = time;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getState() {
        return this.state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Timestamp getTime() {
        return this.time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Todo (");

        sb.append(id);
        sb.append(", ").append(text);
        sb.append(", ").append(state);
        sb.append(", ").append(time);

        sb.append(")");
        return sb.toString();
    }
}
