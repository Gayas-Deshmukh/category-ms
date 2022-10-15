package com.weshopify.platform.features.categories.handlers;

import org.axonframework.eventsourcing.EventSourcingHandler;
import org.springframework.stereotype.Component;

import com.weshopify.platform.features.categories.event.CategoryDomainEvent;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CategoryDomainEventPublishHandler 
{
	//@EventSourcingHandler
	public void onCategoryupdate(CategoryDomainEvent updateCategoryEvent)
	{
		log.info("Updated Category is ready for publishing:\t");
	}
	
}
