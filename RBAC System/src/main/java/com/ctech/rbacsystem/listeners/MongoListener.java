package com.ctech.rbacsystem.listeners;

import com.ctech.rbacsystem.entities.BaseModel;
import java.util.Date;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

@Component
public class MongoListener extends AbstractMongoEventListener<BaseModel> {

  @Override
  public void onBeforeConvert(BeforeConvertEvent<BaseModel> event) {
    super.onBeforeConvert(event);

    Date dateNow = new Date();
    event.getSource().setCreatedAt(dateNow);
    event.getSource().setUpdatedAt(dateNow);
  }

}
