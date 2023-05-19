package com.cej.abase.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "ac01")
public class Ac01 implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     * */
    @Id
    @GeneratedValue
    private String id;
    /**
     * 姓名
     * */
    private String aac003;

    public String getId() { return id; }

    public Ac01 setId(String id) { this.id = id;return this; }

    public String getAac003() { return aac003; }

    public Ac01 setAac003(String aac003) { this.aac003 = aac003;return this; }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
