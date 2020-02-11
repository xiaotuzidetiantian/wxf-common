package com.wuxufang.util;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;

public class CollectionUtilTest {

	@Test
	public void testIsEmpty() {
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("a");
//		boolean b = CollectionUtil.isEmpty(list);
//		System.out.println(b);
		
		LinkedList<String> list = new LinkedList<String>();
		boolean b = CollectionUtil.isEmpty(list);
		System.out.println(b);
	}

}
