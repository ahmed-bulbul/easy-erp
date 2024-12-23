package com.easy.erp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "organizations")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OrderBy
    @Column(name = "org_ref", nullable = false, unique = true)
    private String reference;

    @Column(name = "org_code", nullable = false, unique = true)
    private String orgCode;

    @Column(name = "org_type", nullable = false)
    private String organizationType;

    @Column(name = "org_name", nullable = false)
    private String name;

    @Column(name = "contact_name")
    private String contactName;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "is_active", columnDefinition = "boolean default true", nullable = false)
    private Boolean isActive = true;

    @Column(name = "IS_ADMIN_CONSOLE")
    private Boolean adminConsole;

    @Column(name = "ORG_CATEGORY")
    private String orgCategory;

    @Column(name = "licence_key")
    private String licenceKey;

    @Column(name = "secret_key")
    private String secretKey;

    @Column(name = "is_root", columnDefinition = "boolean default false", nullable = false)
    private boolean isRoot;

    @Column(name = "is_child", columnDefinition = "boolean default false", nullable = false)
    private boolean isChild;

    // Self-referencing many-to-one relationship for parent organization
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_organization_id")
    private Organization parentOrganization;

    // Self-referencing one-to-many relationship for sub-organizations
    @OneToMany(mappedBy = "parentOrganization", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Organization> subOrganizations;

}