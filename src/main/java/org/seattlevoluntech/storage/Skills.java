package org.seattlevoluntech.storage;

import javax.persistence.*;

@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "skill_name")
    private String skillname;

    @Column(name = "description")
    private String description;

    protected Skills() {}

    public Skills(String skillname, String description) {
        this.skillname = skillname;
        this.description = description;
    }

    public String getName (){
        return this.skillname;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format(
                "Skill[id=%d, skill name='%s', description='%s']",
                id, skillname, description);
    }
}
