package com.hc360.mmt.hfbucenter.model;

public class GetOutComeFlowRequest extends BasicRequest{
	private String createTime;// ����ʱ��
	private Integer pageSize;// ÿҳ��¼��
	private Integer pageNumber;// ҳ��

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
