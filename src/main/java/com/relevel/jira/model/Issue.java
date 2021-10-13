package com.relevel.jira.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Issue {

    @Id
    private long issue_id;
}
