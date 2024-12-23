package com.easy.erp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "languages")
public class Language {

    @Id
    @Column(name = "lang_id")
    private long id;

    @Column(name = "lang_code")
    private String langCode;

    @Column(name = "lang_name")
    private String langName;

    @Column(name = "active_status")
    private boolean activeStatus;
    @Override
    public String toString() {
        return "Language [id=" + id + ", langCode=" + langCode + ", langName=" + langName + "]";
    }

    public String showMe() {
        return  langName ;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((langCode == null) ? 0 : langCode.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Language other = (Language) obj;
        if (id != other.id)
            return false;
        if (langCode == null) {
            return other.langCode == null;
        } else return langCode.equals(other.langCode);
    }

}
