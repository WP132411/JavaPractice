package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * <pre>
 *  org.dimigo.io
 * 		|_ SaveImageFromUrl
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 10. 22.
 * </pre>
 *
 *  @author		: 박승진
 *  @version		: 1.0
 */
public class SaveImageFromUrl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String imageUrl = "http://blogfiles.naver.net/20141226_42/suzy7262_1419602996527K6WNN_PNG/1419429802105.png";
		
		try {
			URL url = new URL(imageUrl);
			
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream("files/hyuna.png");
			
			int result;
			
			byte[] buf = new byte[100];
			
				while((result = is.read(buf)) != -1) {
					os.write(buf, 0, result);
				}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
