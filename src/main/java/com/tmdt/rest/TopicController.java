package com.tmdt.rest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;

import java.util.List;

import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiAuthToken;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiPathParam;
import org.jsondoc.core.annotation.ApiResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.tmdt.common.CustomErrorType;
import com.tmdt.domain.Topic;
import com.tmdt.model.User;
import com.tmdt.service.TopicService;

@Api(name = " Topic Service ", description = "Manager User by huynh tinh thanh")
@RestController
@RequestMapping( value = "/api", produces = MediaType.APPLICATION_JSON_VALUE )
public class TopicController {
	
	@Autowired
	TopicService topicservice;
	
	  @ApiAuthToken
	    @ApiMethod(
	            description = "Lấy tấc cả các topic",
	            produces = {MediaType.APPLICATION_JSON_VALUE})
	    @ApiResponseObject
	    @RequestMapping( method = GET, value = "/topic/all-topic" )
	    @PreAuthorize("hasRole('ADMIN')")
	    public  ResponseEntity<List<Topic>>  getAllTopic() {
		  if (this.topicservice.getAllTopic().isEmpty()) {
	            return new ResponseEntity(HttpStatus.NO_CONTENT);
	        }
	        return new ResponseEntity<List<Topic>>(this.topicservice.getAllTopic(), HttpStatus.OK);
	  }
	  @ApiAuthToken
	    @ApiMethod(
	            description = "lấy Topic thông qua ID",
	            produces = {MediaType.APPLICATION_JSON_VALUE})
	    @ApiResponseObject
	    @RequestMapping( method = GET, value = "/topic/{id}" )
	    @PreAuthorize("hasRole('ADMIN')")
	    public ResponseEntity<?> getTopicById( @ApiPathParam(name = "id", description = "Id của topic") @PathVariable String id ) {
	       Topic temp  = this.topicservice.findId(id);
		  if( temp == null ) {
			  return new ResponseEntity(new CustomErrorType("Không tìm thấy topic id " + id), HttpStatus.NOT_FOUND);
		   	}
		  return new ResponseEntity<Topic>(temp,HttpStatus.OK);
	    }
	  
	  @ApiAuthToken
	    @ApiMethod(
	            description = "Thêm 1 topic mới",
	            produces = {MediaType.APPLICATION_JSON_VALUE})
	    @ApiResponseObject
	    @RequestMapping( method = POST, value = "/topic/create" )
	    @PreAuthorize("hasRole('ADMIN')")
	    public ResponseEntity<?> createTopic( @RequestBody Topic topic ) {
		  String id ;
		  if ( ( this.topicservice.create(topic)) == null) {
	            return new ResponseEntity(new CustomErrorType("Erro insert data " + 
	            topic.getTopicID() + " already exist."),HttpStatus.CONFLICT);
		  }
	        return new ResponseEntity<Topic>(topic, HttpStatus.OK);
	      
	    }
	  @ApiAuthToken
	   @ApiMethod(
	            description = "Xoá một Topic ",
	            produces = {MediaType.APPLICATION_JSON_VALUE})
	    @ApiResponseObject
	    @PreAuthorize("hasRole('ADMIN')")
	  @RequestMapping( method = DELETE,value = "/topic/delete/{id}")
	    public ResponseEntity<?> deleteTopic(@ApiPathParam(name = "id", description = "Id của topic") @PathVariable String id) {
	        boolean b = this.topicservice.deleteTopicById(id);
	        if (b == false) {
	            return new ResponseEntity(new CustomErrorType("Không tìm thấy  " + id + " not found."),
	                    HttpStatus.NOT_FOUND);
	        }
	        return new ResponseEntity<Topic>(HttpStatus.NO_CONTENT); // return 204
	    }
	  @ApiAuthToken
	   @ApiMethod(
	            description = " Update Topic  ",
	            produces = {MediaType.APPLICATION_JSON_VALUE})
	    @ApiResponseObject
	  @RequestMapping( method = PUT,value = "/topic/update/{id}")
	   @PreAuthorize("hasRole('ADMIN')")
	    public ResponseEntity<?> updateTopic(@ApiPathParam(name = "id", description = "Id của topic") @PathVariable String id, @RequestBody Topic topic) {
		  Topic temp = this.topicservice.findId(id);
		  
	        if (temp == null) {
	            return new ResponseEntity(new CustomErrorType("Không tìm thấy " + id + " not found."),
	                    HttpStatus.NOT_FOUND);
	        }
	        temp.setTopicDescription(topic.getTopicDescription());
	        temp.setTopicName(topic.getTopicName());
	        temp.setTopicStatut(topic.getTopicStatut());
	        return new ResponseEntity<Topic>(temp, HttpStatus.OK);
	    }
	 
	  
	  
	  
}
