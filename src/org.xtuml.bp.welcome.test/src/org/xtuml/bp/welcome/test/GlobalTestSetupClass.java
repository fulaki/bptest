package org.xtuml.bp.welcome.test;

import org.eclipse.core.runtime.CoreException;
import org.junit.Test;
import org.xtuml.bp.core.Ooaofooa;
import org.xtuml.bp.core.util.WorkspaceUtil;

public class GlobalTestSetupClass {

	public GlobalTestSetupClass() {

	}

	@Test
	public void setUpGlobalSetting() throws CoreException {
		Ooaofooa.setInUnitTest(true);
		// turn off autobuild to stop MC-3020 builders from running
		WorkspaceUtil.setAutobuilding(false);   // throws CoreException
	}
}
