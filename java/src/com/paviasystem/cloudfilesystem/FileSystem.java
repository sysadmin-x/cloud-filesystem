package com.paviasystem.cloudfilesystem;

import java.util.ArrayList;

public interface FileSystem {

	/**
	 * List files and directories
	 * 
	 * @param absolutePath
	 *            Absolute path of the directory whose children are desired
	 * @return Returns a list of file system entries
	 */
	ArrayList<FileSystemEntry> list(String absolutePath);

	FileSystemEntry getEntry(String absolutePath);

}
