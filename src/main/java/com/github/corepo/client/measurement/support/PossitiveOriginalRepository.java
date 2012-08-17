package com.github.corepo.client.measurement.support;

import java.util.List;

import com.github.corepo.client.Item;
import com.github.corepo.client.OriginalRepository;

public class PossitiveOriginalRepository implements OriginalRepository {
	public Item read(String key) {
		return new Item(key, 0);
	}

	public void writeback(List<Item> item) {
	}
}
