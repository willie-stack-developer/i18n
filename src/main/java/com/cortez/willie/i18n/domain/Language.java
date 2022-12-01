package com.cortez.willie.i18n.domain;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "languages")
public class Language implements Serializable {

    private static final long serialVersionUID = -318002536516995089L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "locale")
    private String locale;

    @Column(name = "key")
    private String key;

    @Column(name = "content")
    private String content;

}