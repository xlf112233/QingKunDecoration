package com.software.domain;
/**
 * ����
 * @author 123
 *
 */
public class Announcement {
	private String  notice_content;//��������
	private String  notice_publish_time;//���淢��ʱ��
	private String  notice_title;//�������
	private int  notice_id;//����id
	public String getNotice_content() {
		return notice_content;
	}
	public void setNotice_content(String notice_content) {
		this.notice_content = notice_content;
	}
	public String getNotice_publish_time() {
		return notice_publish_time;
	}
	public void setNotice_publish_time(String notice_publish_time) {
		this.notice_publish_time = notice_publish_time;
	}
	public String getNotice_title() {
		return notice_title;
	}
	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}
	public int getNotice_id() {
		return notice_id;
	}
	public void setNotice_id(int notice_id) {
		this.notice_id = notice_id;
	}
	
	
	

}
