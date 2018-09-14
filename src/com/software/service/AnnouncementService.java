package com.software.service;

import java.util.List;

import com.software.dao.AnnouncementDao;
import com.software.domain.Announcement;


public class AnnouncementService {
private static AnnouncementDao announcementDao = new AnnouncementDao();
	
	/**
	 * ��ѯ��������
	 * @throws Exception 
	 */
	public static List<Announcement> ShowAllAnnouncement() throws Exception{
		return announcementDao.ShowAllAnnouncement();
	}
	
	/**
	 * ������������
	 * @throws Exception 
	 */
	public static List<Announcement> search_title(String title) throws Exception{
		return announcementDao.search_title(title);
	}

	/**
	 * ������������
	 * @throws Exception 
	 */
	public static List<Announcement> search_content(String content) throws Exception{
		return announcementDao.search_content(content);
	}
	/**
	 * ��ӹ���
	 * @throws Exception 
	 */
	public static boolean add_ads(String title,String content) throws Exception{
		return announcementDao.add_ads(title,content);
	}
	
	/**
	 * �޸Ĺ���
	 * @throws Exception 
	 */
	public static boolean update_ads(String new_title,String new_content,int id) throws Exception{
		return announcementDao.update_ads(new_title,new_content,id);
	}
	/**
	 * ɾ������
	 * @throws Exception 
	 */
	public static boolean delete_ads(int id) throws Exception{
		return announcementDao.delete_ads(id);
	}
	/**
	 * ����ɾ������
	 * @throws Exception 
	 */
	public static void delete_ads1(String buildArray) throws Exception{
		 announcementDao.delete_ads1(buildArray);
	}
	
}
