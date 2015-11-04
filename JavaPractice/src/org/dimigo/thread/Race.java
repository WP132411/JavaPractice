/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 *  org.dimigo.thread
 * 		|_ Race
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 11. 4.
 * </pre>
 *
 *  @author		: 박승진
 *  @version		: 1.0
 */
public class Race {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("main thread start");
		
		Thread r1 = new Runner("정욱재");
		Thread r2 = new Runner("이어진");
		
		// MAX_PRIORITY(10), NORM_PRIORIITY(5), MIN_PRIORITY(1)
		// 우선 순위가 높은 스레드가 실행 기회를 더 많이 가진다.
		r1.setPriority(Thread.MAX_PRIORITY);
		r2.setPriority(Thread.MIN_PRIORITY);
		
		//multi thread로 실행하려면 start() 호출하기
		
		r1.start();
		r2.start();
		
		System.out.println("main thread end");


	}

}
