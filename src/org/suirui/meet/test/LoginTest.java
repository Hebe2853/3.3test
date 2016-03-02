/**
 * 
 */
package org.suirui.meet.test;

import org.suirui.meet.ui.huijian.newui.LoginNewActivity;

import junit.framework.TestCase;
import android.content.Intent;
import android.test.InstrumentationTestCase;

/**
 * @author hebe
 *
 */
public class LoginTest extends InstrumentationTestCase {

	/**
	 * @param name
	 */
	private LoginNewActivity login=null;
//	public LoginTest(String name) {
//		super(name);
//	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() {
		try {
			super.setUp();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Intent intent = new Intent();
		intent.setClassName("org.suirui.meet.ui.huijian.newui", LoginNewActivity.class.getName());
		intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		login=(LoginNewActivity)getInstrumentation().startActivitySync(intent);
		
		
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
