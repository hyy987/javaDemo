package com.bjsct.chainOfResp;

/**
 * 主任
 * @author admin
 *
 */
public class Director extends Leader{

	public Director(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<3) {
			System.out.println(request.getEmpName()+"请假:"+request.getLeaveDays()+"理由:"+request.getReason());
			System.out.println(this.name+"审批通过！");
		}else {
			if(this.nextLeader!=null) {
				System.out.println(this.name+"交给了"+this.nextLeader.getName()+"审批");
				this.nextLeader.handleRequest(request);
			}
		}
	}
}
