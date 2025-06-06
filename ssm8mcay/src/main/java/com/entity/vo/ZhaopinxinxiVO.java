package com.entity.vo;

import com.entity.ZhaopinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 招聘信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-10-09 11:54:35
 */
public class ZhaopinxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 工作环境
	 */
	
	private String gongzuohuanjing;
		
	/**
	 * 岗位要求
	 */
	
	private String gangweiyaoqiu;
		
	/**
	 * 岗位薪酬
	 */
	
	private String gangweixinchou;
		
	/**
	 * 福利待遇
	 */
	
	private String fulidaiyu;
		
	/**
	 * 工作时间
	 */
	
	private String gongzuoshijian;
		
	/**
	 * 工作地点
	 */
	
	private String gongzuodidian;
		
	/**
	 * 工作内容
	 */
	
	private String gongzuoneirong;
		
	/**
	 * 企业名称
	 */
	
	private String qiyemingcheng;
		
	/**
	 * 公司电话
	 */
	
	private String gongsidianhua;
		
	/**
	 * 联系人
	 */
	
	private String lianxiren;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：工作环境
	 */
	 
	public void setGongzuohuanjing(String gongzuohuanjing) {
		this.gongzuohuanjing = gongzuohuanjing;
	}
	
	/**
	 * 获取：工作环境
	 */
	public String getGongzuohuanjing() {
		return gongzuohuanjing;
	}
				
	
	/**
	 * 设置：岗位要求
	 */
	 
	public void setGangweiyaoqiu(String gangweiyaoqiu) {
		this.gangweiyaoqiu = gangweiyaoqiu;
	}
	
	/**
	 * 获取：岗位要求
	 */
	public String getGangweiyaoqiu() {
		return gangweiyaoqiu;
	}
				
	
	/**
	 * 设置：岗位薪酬
	 */
	 
	public void setGangweixinchou(String gangweixinchou) {
		this.gangweixinchou = gangweixinchou;
	}
	
	/**
	 * 获取：岗位薪酬
	 */
	public String getGangweixinchou() {
		return gangweixinchou;
	}
				
	
	/**
	 * 设置：福利待遇
	 */
	 
	public void setFulidaiyu(String fulidaiyu) {
		this.fulidaiyu = fulidaiyu;
	}
	
	/**
	 * 获取：福利待遇
	 */
	public String getFulidaiyu() {
		return fulidaiyu;
	}
				
	
	/**
	 * 设置：工作时间
	 */
	 
	public void setGongzuoshijian(String gongzuoshijian) {
		this.gongzuoshijian = gongzuoshijian;
	}
	
	/**
	 * 获取：工作时间
	 */
	public String getGongzuoshijian() {
		return gongzuoshijian;
	}
				
	
	/**
	 * 设置：工作地点
	 */
	 
	public void setGongzuodidian(String gongzuodidian) {
		this.gongzuodidian = gongzuodidian;
	}
	
	/**
	 * 获取：工作地点
	 */
	public String getGongzuodidian() {
		return gongzuodidian;
	}
				
	
	/**
	 * 设置：工作内容
	 */
	 
	public void setGongzuoneirong(String gongzuoneirong) {
		this.gongzuoneirong = gongzuoneirong;
	}
	
	/**
	 * 获取：工作内容
	 */
	public String getGongzuoneirong() {
		return gongzuoneirong;
	}
				
	
	/**
	 * 设置：企业名称
	 */
	 
	public void setQiyemingcheng(String qiyemingcheng) {
		this.qiyemingcheng = qiyemingcheng;
	}
	
	/**
	 * 获取：企业名称
	 */
	public String getQiyemingcheng() {
		return qiyemingcheng;
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
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
