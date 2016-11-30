package com.standrad.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;

/****
 * 自动扫描 必须添加Table属性和Column属性 并且数据类型全部采用包装类型 springboot 默认采用MM_SS 方式读取数据字段
 * 如果数据库是驼峰命名 则需要添加column属性，如果要避免出现这种问题最好全部添加column属性
 * 
 * @author hexb
 * 
 */
@Table(name = "message_batchsendmessage_log")
public class QueryOnlineEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 全部使用包装类型，避免出错 **/
	
	private Long id;
	@Column(name = "createDate")
	private Date createDate;
	@Column(name = "messageId")
	private Long messageId;
	private String response;
	private Integer status;
	@Column(name = "userId")
	private String userId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Long getMessageId() {
		return messageId;
	}

	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "QueryOnlineEntity [id=" + id + ", createDate=" + createDate + ", messageId=" + messageId + ", response=" + response + ", status=" + status + ", userId=" + userId + "]";
	}

}
