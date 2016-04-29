package com.hc360.mmt.hfbucenter.model;

public class GetOutComeFlowRequest extends BasicRequest{
	private String createTime;// 操作时间
	private Integer pageSize;// 每页记录数
	private Integer pageNumber;// 页码

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}
}
