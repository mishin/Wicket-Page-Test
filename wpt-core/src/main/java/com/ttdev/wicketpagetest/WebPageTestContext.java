/**
 * Copyright (C) 2009 Kent Tong <freemant2000@yahoo.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * Free Software Foundation version 3.
 *
 * program is distributed in the hope that it will be useful,
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.ttdev.wicketpagetest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * To unit test your Wicket pages, you should include this class into your
 * TestNG test suite. This is a {@link WebPageTestBasicContext} that is designed
 * for TestNG.
 * 
 * @see WebPageTestBasicContext
 * 
 * @author Kent Tong
 * 
 */
public class WebPageTestContext extends WebPageTestBasicContext {

	@BeforeSuite
	public static void beforePageTests() throws Exception {
		WebPageTestBasicContext.beforePageTests();
	}

	@AfterSuite
	public static void afterPageTests() throws Exception {
		WebPageTestBasicContext.afterPageTests();
	}

}
