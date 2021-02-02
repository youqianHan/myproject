package com.hyj.yjmall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 采购信息
 * 
 * @author hanyouqian
 * @email 15998451842@163.com
 * @date 2021-01-05 18:42:29
 */
@Data
@TableName("wms_purchase")
public class PurchaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 采购单id
	 */
	@TableId
	private Long id;
	/**
	 * 采购人id
	 */
	private Long assigneeId;
	/**
	 * 采购人名
	 */
	private String assigneeName;
	/**
	 * 联系方式
	 */
	private String phone;
	/**
	 * 优先级
	 */
	private Integer priority;
	/**
	 * 状态
	 */
	private Integer status;
	/**
	 * 仓库id
	 */
	private Long wareId;
	/**
	 * 总金额
	 */
	private BigDecimal amount;
	/**
	 * 创建日期
	 */
	private Date createTime;
	/**
	 * 更新日期
	 */
	private Date updateTime;

}
