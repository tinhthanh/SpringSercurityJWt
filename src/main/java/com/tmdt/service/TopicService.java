package com.tmdt.service;

import java.util.List;

import com.tmdt.domain.Topic;

public interface TopicService {
	public List<Topic> getAllTopic();
	public Topic findId( String id);
	public boolean deleteTopicById( String id);
	public Topic editTopic(String id , Topic topic );
	public String create(Topic topic ) ;

}
