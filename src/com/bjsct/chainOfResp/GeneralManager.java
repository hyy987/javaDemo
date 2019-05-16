package com.bjsct.chainOfResp;

public class GeneralManager extends Leader{

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<30) {
			System.out.println(request.getEmpName()+"请假:"+request.getLeaveDays()+"理由:"+request.getReason());
			System.out.println(this.name+"审批通过！");
		}else {
			System.out.println(request.getEmpName()+"请假"+request.getLeaveDays()+",怕不是想辞职！");
		}
	}
}
