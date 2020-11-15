package br.com.library.service.entitys;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "book")
public class Book {

    private Long id;

    private String name;

    private String author;

    private LocalDate publication;
}
