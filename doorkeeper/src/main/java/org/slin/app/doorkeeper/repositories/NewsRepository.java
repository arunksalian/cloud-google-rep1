package org.slin.app.doorkeeper.repositories;

import org.slin.app.doorkeeper.service.bean.MessageBean;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NewsRepository extends MongoRepository<MessageBean, String> {

}
