package com.bjsxt.composite;
/**
 * 抽象组件
 * @author admin
 *
 */
public interface Component {

	void operation();
}

/**
 * 叶子组件
 * @author admin
 *
 */
interface Leaf extends Component{
	@Override
	default void operation() {
		
	}
}

/**
 * 容器组件
 * @author admin
 *
 */
interface Composite extends Component{
	void add();
	void remove();
	Component getChild();
	@Override
	default void operation() {
		
	}
}