package org.example.shenanigans.repos;

import org.example.shenanigans.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Long> {
}
