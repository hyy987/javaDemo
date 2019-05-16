package com.bjsct.chainOfResp;
/**
 * 抽象类
 * @author admin
 *
 */
public abstract class Leader {

	protected String name;
	protected Leader nextLeader;//责任链上的后继对象
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Leader getNextLeader() {
		return nextLeader;
	}

	//设置责任链后继对象
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}

	public Leader(String name) {
		super();
		this.name = name;
	}
	
	/**
	 * 处理请求的核心方法
	 * @param request
	 */
	public abstract void handleRequest(LeaveRequest request);
}
