package com.paviasystem.cloudfilesystem.blocks;

public class ByteReaderUtils {
	public static boolean readExact(ByteReader reader, byte[] buffer, int offset, int exactNumBytesToRead) {
		int bytesToRead = exactNumBytesToRead;
		int destOff = offset;

		while (bytesToRead > 0) {
			int bytesRead = reader.read(buffer, destOff, bytesToRead);
			if (bytesRead < 0) {
				//End of stream, so we could not read everything as requested
				return false;
			} else {
				destOff += bytesRead;
				bytesToRead -= bytesRead;
			}
		}

		//OK, we read exactly "exactNumBytesToRead"
		return true;
	}
}