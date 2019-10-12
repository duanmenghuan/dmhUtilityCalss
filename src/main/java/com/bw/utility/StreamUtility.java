package com.bw.utility;

import java.io.Closeable;
import java.io.IOException;

public class StreamUtility {
	/**
	 * 						   
	 * @Title: closeStream
	 * @Description: TODO(关闭所有的流)
	 * @param streams
	 * @throws IOException
	 */
public static void closeStream(Closeable ... streams) throws IOException {
							//可变参数 如果有其他参数需要放置在最后
		for (int i = 0; i < streams.length; i++) {
			streams[i].close();
		}
		
	}
}
