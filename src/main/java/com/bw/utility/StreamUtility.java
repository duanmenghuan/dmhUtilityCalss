package com.bw.utility;

import java.io.Closeable;
import java.io.IOException;

public class StreamUtility {
	/**
	 * 						   
	 * @Title: closeStream
	 * @Description: TODO(�ر����е���)
	 * @param streams
	 * @throws IOException
	 */
public static void closeStream(Closeable ... streams) throws IOException {
							//�ɱ���� ���������������Ҫ���������
		for (int i = 0; i < streams.length; i++) {
			streams[i].close();
		}
		
	}
}
