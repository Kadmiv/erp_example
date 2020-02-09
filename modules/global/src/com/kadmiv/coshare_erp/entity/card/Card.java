package com.kadmiv.coshare_erp.entity.card;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "COSHAREERP_CARD")
@Entity(name = "coshareerp_Card")
public class Card extends StandardEntity {
    private static final long serialVersionUID = -4332967643501149835L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "CODE")
    protected String code;

    @Column(name = "CATEGORY")
    protected String category;

    @Column(name = "BONUS_PERCENT")
    protected Double bonusPercent;

    @Column(name = "RATING")
    protected Double rating;

    @Column(name = "FOLLOWERS_COUNT")
    protected Integer followersCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getBonusPercent() {
        return bonusPercent;
    }

    public void setBonusPercent(Double bonusPercent) {
        this.bonusPercent = bonusPercent;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }
}