package com.tmdt.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tmdt.domain.Topic;
import com.tmdt.service.TopicService;
@Service
public class TopicServiceImpl implements TopicService {
    private MockData mockdata = new MockData();
	@Override
	public List<Topic> getAllTopic() {
		// TODO Auto-generated method stub
		return mockdata.getAll();
	}

	@Override
	public Topic findId(String id) {
		// TODO Auto-generated method stub
		return mockdata.getById(id);
	}

	@Override
	public boolean deleteTopicById(String id) {
		// TODO Auto-generated method stub
		return mockdata.delete(id);
	}

	@Override
	public Topic editTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
		return mockdata.eidit(id, topic);
	}

	@Override
	public String create(Topic topic) {
		// TODO Auto-generated method stub
		return mockdata.add(topic);
	}

}
