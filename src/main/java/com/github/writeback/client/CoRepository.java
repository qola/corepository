package com.github.writeback.client;

import java.util.List;

/**
 * CoRepository, core domain object, is responsible for receiving update and
 * select requests from client instead of original repository such as database
 * and sometimes write-backing to original repository. For this reason,
 * CoRepository should able to rapidly process requests from client. You can
 * read more at https://github.com/MinCha/write-back/wiki
 * 
 * @see LocalMemoryCoRepository
 * @author Min Cha
 * 
 */
public interface CoRepository {
	WriteBackItem select(String key);

	void update(WriteBackItem item);

	void insert(WriteBackItem item);

	void increase(String key);

	void decrease(String key);

	boolean exists(String key);

	List<WriteBackItem> selectAll();
}