package com.nv.resumebuilder.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class FirstMockitoTest {

	@Test
	public void test_1() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);

		assertEquals(2, listMock.size());
	}

	@Test
	public void test_2() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);

		assertEquals(2, listMock.size());
		assertEquals(3, listMock.size());
//		assertThat(null, is(null));
	}

	@Test
	public void test_3() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("vijay").thenReturn("yadav");

		assertEquals("vijay", listMock.get(0));
		assertEquals("yadav", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}

	@Test
	public void test_4() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenReturn("vijay");

		assertEquals("vijay", listMock.get(0));
//		assertEquals(null, listMock.get(1));
	}

	@Test(expected = RuntimeException.class)
	public void test_5() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something went wrong"));

		listMock.get(0);
	}

}
