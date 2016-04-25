package models;

import org.joda.time.DateTime;
import play.db.jpa.Model;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Paradox on 25/4/2016.
 */
@Entity
public class Agent extends Model {

    public String code;

    public String description;

    @OneToMany(mappedBy="agent", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Guide> guides = new ArrayList();

    public Agent(String code, String description) {
        this.code = code;
        this.description = description;
    }

}
