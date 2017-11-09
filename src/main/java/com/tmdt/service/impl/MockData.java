package com.tmdt.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.tmdt.domain.Course;
import com.tmdt.domain.Topic;

public class MockData {

	 public List<Topic> list ;
	 public MockData()
 {
  this.list = new ArrayList();
   this.list.add(new Topic("ID1", "angular "," Khoa hoc ", 1,
			null));
   this.list.add(new Topic("ID2", "react js"," khoa hoc ", 1,
			null));
   this.list.add(new Topic("ID3", "Vue js","mo ta", 1,
			null));
   this.list.add(new Topic("ID4", "node js","mo ta", 1,
			null));
   this.list.add(new Topic("ID5", "react native","mo ta", 1,
			null));
 
   
 }
	  public List<Topic> getAll(){
		   return this.list;
	   }
	  public String add( Topic topic ) {
		  Random rd = new Random();
		  try {
			  String id = "ID" +String.valueOf(rd.nextInt(50) );
			   topic.setTopicID(id);
			   list.add(topic);
			   return id;
		} catch (Exception e) {
			// TODO: handle exception
			return "";
		}
	  }
	  public Topic eidit(String id , Topic topic ) {
		   for( int i = 0 ; i< list.size(); i++) {
			   if(list.get(i).getTopicID().equals(id)) {
				   this.list.set(i, topic);
				   return topic;
			   }
		   }
		   return null;
	  }
	  public Topic getById( String id) {
		  for ( int i = 0 ;i< list.size() ; i++ ) {
			  if( list.get(i).getTopicID().equals(id)) {
				  return this.list.get(i);
			  }
		  }
		  return null;
	  }
	  public boolean delete( String id) {
		  for ( int i = 0 ;i< list.size() ; i++ ) {
			  if( list.get(i).getTopicID().equals(id)) {
				  this.list.remove(i);
			   return true;
			  }
		  }
		  return false;
	  }
	
 }
