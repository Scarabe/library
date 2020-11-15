package br.com.library.service.entitys;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "publisher")
public class Publisher {

    private Long id;

    private String name;

}
