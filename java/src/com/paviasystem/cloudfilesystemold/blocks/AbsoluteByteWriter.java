package com.paviasystem.cloudfilesystemold.blocks;

public interface AbsoluteByteWriter extends AutoCloseable {
	void write(byte[] buffer, int bufferOffset, int numBytesToWrite, long fileOffset);

	void setLength(long newLength);
}
