package com.bjsct.chainOfResp;

public class Manager extends Leader{

	public Manager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		
		if(request.getLeaveDays()<10) {
			System.out.println(request.getEmpName()+"请假:"+request.getLeaveDays()+"理由:"+request.getReason());
			System.out.println(this.name+"审批通过！");
		}else {
			if(this.nextLeader!= null) {
				this.nextLeader.handleRequest(request);
			}
		}
	}
}
