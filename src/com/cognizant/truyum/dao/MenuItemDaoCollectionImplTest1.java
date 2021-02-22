package com.cognizant.truyum.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImplTest1 {

	private MenuItemDao menuItemDao;

	@Before
	public void setup() {
		menuItemDao = new MenuItemDaoCollectionImpl();
	}

	@Test
	public void testGetMenuItemListAdmin1() {
		assertNotNull(menuItemDao.getMenuItemListAdmin());
	}

	@Test
	public void testGetMenuItemListCustomer1() {
		assertNotNull (menuItemDao.getMenuItemListCustomer());
	}

	@Test
	public void testModifyMenuItem1() {
		MenuItem menuitem = new MenuItem(2, "Omlet", 60.00f, true, DateUtil.convertToDate("22/07/2015"),
				"Main Course", true);
		menuItemDao.modifyMenuItem(menuitem);
		assertEquals(menuitem, menuItemDao.getMenuItem(2));
	}

	@Test
	public void testGetMenuItem1() {
		assertNotNull(menuItemDao.getMenuItem(1));
	}
}
