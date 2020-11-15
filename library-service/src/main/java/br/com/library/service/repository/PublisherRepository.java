package br.com.library.service.repository;


import br.com.library.service.entitys.Publisher;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends MongoRepository<Publisher, String> {

}