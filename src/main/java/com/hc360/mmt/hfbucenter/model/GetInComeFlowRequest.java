package com.hc360.mmt.hfbucenter.model;

public class GetInComeFlowRequest extends BasicRequest{
	private String partner;// ������ID
	private String createTime;// ����ʱ��
	private Integer pageSize;// ÿҳ��¼��
	private Integer pageNumber;// ҳ��

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

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
