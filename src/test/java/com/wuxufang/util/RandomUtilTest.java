package com.wuxufang.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		for (int i = 0; i < 5; i++) {
			RandomUtil.random(1, 3);
		}
	}

	@Test
	public void testSubRandom() {
		RandomUtil.subRandom(1, 10, 3);
	}

	@Test
	public void testRandomCharacter() {
		char s = RandomUtil.randomCharacter();
		System.out.println(s);
	}

	@Test
	public void testRandomString() {
		String string = RandomUtil.randomString(3);
		System.out.println(string);
	}

}
