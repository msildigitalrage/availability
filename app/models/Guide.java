package models;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import play.db.jpa.Model;
import javax.persistence.*;
/**
 * Created by Paradox on 25/4/2016.
 */
@Entity
public class Guide extends Model{

    public String lastName;

    public String firstName;

    public String code;

    @ManyToOne
    public Agent agent;

    public Guide (Agent agent, String lastName, String firstName, String code) {
        this.agent = agent;
        this.lastName = lastName;
        this.firstName = firstName;
        this.code = code;
    }

}
