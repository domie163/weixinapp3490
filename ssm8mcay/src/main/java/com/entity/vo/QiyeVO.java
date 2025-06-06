package com.entity.vo;

import com.entity.QiyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 企业
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-10-09 11:54:35
 */
public class QiyeVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 企业性质
	 */
	
	private String qiyexingzhi;
		
	/**
	 * 经营内容
	 */
	
	private String jingyingneirong;
		
	/**
	 * 公司电话
	 */
	
	private String gongsidianhua;
		
	/**
	 * 联系人
	 */
	
	private String lianxiren;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 企业邮箱
	 */
	
	private String qiyeyouxiang;
		
	/**
	 * 企业地址
	 */
	
	private String qiyedizhi;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：企业性质
	 */
	 
	public void setQiyexingzhi(String qiyexingzhi) {
		this.qiyexingzhi = qiyexingzhi;
	}
	
	/**
	 * 获取：企业性质
	 */
	public String getQiyexingzhi() {
		return qiyexingzhi;
	}
				
	
	/**
	 * 设置：经营内容
	 */
	 
	public void setJingyingneirong(String jingyingneirong) {
		this.jingyingneirong = jingyingneirong;
	}
	
	/**
	 * 获取：经营内容
	 */
	public String getJingyingneirong() {
		return jingyingneirong;
	}
				
	
	/**
	 * 设置：公司电话
	 */
	 
	public void setGongsidianhua(String gongsidianhua) {
		this.gongsidianhua = gongsidianhua;
	}
	
	/**
	 * 获取：公司电话
	 */
	public String getGongsidianhua() {
		return gongsidianhua;
	}
				
	
	/**
	 * 设置：联系人
	 */
	 
	public void setLianxiren(String lianxiren) {
		this.lianxiren = lianxiren;
	}
	
	/**
	 * 获取：联系人
	 */
	public String getLianxiren() {
		return lianxiren;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：企业邮箱
	 */
	 
	public void setQiyeyouxiang(String qiyeyouxiang) {
		this.qiyeyouxiang = qiyeyouxiang;
	}
	
	/**
	 * 获取：企业邮箱
	 */
	public String getQiyeyouxiang() {
		return qiyeyouxiang;
	}
				
	
	/**
	 * 设置：企业地址
	 */
	 
	public void setQiyedizhi(String qiyedizhi) {
		this.qiyedizhi = qiyedizhi;
	}
	
	/**
	 * 获取：企业地址
	 */
	public String getQiyedizhi() {
		return qiyedizhi;
	}
			
}
