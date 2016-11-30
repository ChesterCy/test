package com.standrad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hshbic.enabling.messageNg.MessageNgException;
import com.hshbic.enabling.messageNg.MessageNgService;
import com.hshbic.enabling.messageNg.dto.MessageNgDto;
import com.hshbic.enabling.messageNg.dto.MessageParams;
import com.standrad.entity.QueryOnlineEntity;
import com.standrad.mapper.QueryOnlineMapper;
@Service("messageService")
public class MessageNgServiceImpl implements MessageNgService {

	@Autowired
	QueryOnlineMapper queryOnlineMapper;
	@Override
	public MessageNgDto findMessageById(MessageParams params)
			throws MessageNgException {
		
		QueryOnlineEntity resString =queryOnlineMapper.selectByPrimaryKey(1L);
		System.out.println(resString.toString());
		MessageNgDto dto = new MessageNgDto();
		dto.setUserId("params");
		return dto;
	}

}
