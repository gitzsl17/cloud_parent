package com.mn.cloud_common.es.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@ToString
@Data
@Document(indexName = "dns_2019_04_12_monitoresmodel",type = "is0011")
public class MonitorResult implements Serializable{
	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 1L;

	/**
	 *id
	 */
	private String id;
	/**
	 *IDC/ISP经营者ID
	 */
	private String idcIspId;
	/**
	 *监测日志本地记录的ID
	 */
	private Long monitorLogId;
	/**
	 *监测指令ID
	 */
	private String commandId;
	/**
	 *机房编码
	 */
	private String houseCode;
	/**
	 *源IP
	 */
	private String srcIp;
	/**
	 *目的IP
	 */
	private String destIp;
	/**
	 *源端口
	 */
	private Long srcPort;
	/**
	 *目的端口
	 */
	private Long destPort;
	/**
	 *域名
	 */
	private String domain;
	/**
	 * 网站名称
	 */
	private String siteName;
	/**
	 *代理类型（字典数据）
	 */
	private String proxyType;
	/**
	 *代理IP
	 */
	private String proxyIp;
	/**
	 *代理端口
	 */
	private Long proxyPort;
	/**
	 *标题
	 */
	private String title;
	/**
	 *内容
	 */
	private String content;
	/**
	 *URL
	 */
	private String url;
	/**
	 *采集时间，采用yyyy-MM-dd HH:mm:ss的格式
	 */
	private Date collectTime;
	/**
	 *生成该监测日志的时间
	 */
	private Date createTime;
	/**
	 *查询起始时间
	 */
	private Date createTimeBefore;
	/**
	 *查询截止时间
	 */
	private Date createTimeAfter;
	/**
	 *查询起始时间
	 */
	private Date collectTimeBefore;
	/**
	 *查询截止时间
	 */
	private Date collectTimeAfter;
	/**
	 * 代理名称
	 */
	private String proxyName;
	/**
	 * 任务类型  1-待处理， 2-已处理
	 */
	private String taskType;
	/**
	 * 策略名称
	 */
	private String strategyName;
	/**
	 * 业务类型
	 */
	private Long businessType;
	
	/**
	 *管理指令文件ID
	 */
	private Long commandFileId;
	/**
	 * 机房名称
	 */
	private String houseName;
	/**
	 * 运营商名称
	 */
	private String idcIspName;
	
	/**
	 * 操作状态
	 */
	private String handleState;
	
	/**
	 * 索引名称
	 */
	private String indexName;
	/**
	 * es id
	 */
	private String esId;
	/**
	 * es id
	 */
	private Long esType;
	/**
	 *页面大小
	 */
	private Integer pageSize;
	/**
	 *当前页
	 */
	private Integer current;
	/**
	 *存活状态
	 */
	private Integer isAlive;
}
