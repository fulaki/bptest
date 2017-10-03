//=====================================================================
//
// NOTE: This file was generated, but is maintained by hand.
// Generated by: UnitTestGenerator.pl
// Version:      1.15
// Matrix:       oal_autocomplete_matrix.txt
//
//=====================================================================

package org.xtuml.bp.als.oal.test.completion;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.BadPositionCategoryException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.ui.IEditorPart;
import org.junit.After;
import org.junit.Before;
import org.xtuml.bp.als.oal.ParseRunnable;
import org.xtuml.bp.core.Action_c;
import org.xtuml.bp.core.Body_c;
import org.xtuml.bp.core.BridgeBody_c;
import org.xtuml.bp.core.Bridge_c;
import org.xtuml.bp.core.Component_c;
import org.xtuml.bp.core.DerivedAttributeBody_c;
import org.xtuml.bp.core.DerivedBaseAttribute_c;
import org.xtuml.bp.core.FunctionBody_c;
import org.xtuml.bp.core.Function_c;
import org.xtuml.bp.core.Ooaofooa;
import org.xtuml.bp.core.OperationBody_c;
import org.xtuml.bp.core.Operation_c;
import org.xtuml.bp.core.Package_c;
import org.xtuml.bp.core.ProposalList_c;
import org.xtuml.bp.core.Proposal_c;
import org.xtuml.bp.core.ProvidedOperationBody_c;
import org.xtuml.bp.core.ProvidedOperation_c;
import org.xtuml.bp.core.ProvidedSignalBody_c;
import org.xtuml.bp.core.ProvidedSignal_c;
import org.xtuml.bp.core.RequiredOperationBody_c;
import org.xtuml.bp.core.RequiredOperation_c;
import org.xtuml.bp.core.RequiredSignalBody_c;
import org.xtuml.bp.core.RequiredSignal_c;
import org.xtuml.bp.core.StateActionBody_c;
import org.xtuml.bp.core.TransitionActionBody_c;
import org.xtuml.bp.core.common.ClassQueryInterface_c;
import org.xtuml.bp.core.common.NonRootModelElement;
import org.xtuml.bp.core.ui.Selection;
import org.xtuml.bp.core.util.ActionLanguageDescriptionUtil;
import org.xtuml.bp.ui.canvas.test.CanvasTest;
import org.xtuml.bp.ui.text.activity.ParseAllActivitiesAction;

public class OalAutoComplete extends CanvasTest {
    public static boolean generateResults = false;
    public static boolean useDrawResults = false;
    String[] results = null;

    String test_id = "";

    protected String getResultName() {
        return getClass().getSimpleName() + "_" + test_id;
    }

    protected IEditorPart fActiveEditor;

    protected IEditorPart getActiveEditor() {
        return fActiveEditor;
    }

    public OalAutoComplete(String subTypeClassName, String subTypeArg0) {
        super(null, subTypeArg0);
    }

    protected String getTestId(String src, String dest, String count) {
        return "test_" + count;
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void initialSetup() throws Exception {
    	loadProject("oal_autocomplete");
    	modelRoot = Ooaofooa.getInstance("/oal_autocomplete/models/oal_autocomplete/Container/Container.xtuml");
    	// create the initial OAL instances
    	Package_c container = Package_c.getOneEP_PKGOnR1401(m_sys, new ClassQueryInterface_c() {
			
			@Override
			public boolean evaluate(Object candidate) {
				return ((Package_c) candidate).getName().equals("Container");
			}
		});
    	Selection.getInstance().clear(); Selection.getInstance().addToSelection(container);
    	ParseAllActivitiesAction action = new ParseAllActivitiesAction();
    	action.run(null);
    };

    @After
    public void tearDown() throws Exception {
        // do not tear down yet, not required as the supertype requires UI while these tests
    	// do not
    }

    /**
     * "LPAH" is one of the degrees of freedom as specified in this issues
     * test matrix.
     * This routine gets the "LPAH" instance from the given name.
     * 
     * @param element The degree of freedom instance to retrieve
     * @return A model element used in the test as specified by the test matrix
     */
    NonRootModelElement selectLPAH(String element) {
        return selectLPAH(element, null);
    }

    /**
     * "LPAH" is one of the degrees of freedom as specified in this issues
     * test matrix.
     * This routine gets the "LPAH" instance from the given name.
     * 
     * @param element The degree of freedom instance to retrieve
     * @param extraData Extra data needed for selection
     * @return A model element used in the test as specified by the test matrix
     */
    NonRootModelElement selectLPAH(String element, Object extraData) {
    	return findElementForDof(element);
    }

	private int getLineNumber(String element) {
		if(element.contains("S2")) {
			return 28;
		} else if(element.contains("S3")) {
			return 39;
		}
		return 26;
	}

	private String getLocationText() {
		if(getName().contains("L2")) {
			return "l2_var.";
		} else if(getName().contains("L3")) {
			return "::";
		} else if(getName().contains("L4")) {
			return "send";
		} else if(getName().contains("L5")) {
			return "send Port1::";
		} else if(getName().contains("L6")) {
			return "Port1::operation(parameter: 1) to";
		} else if(getName().contains("L7")) {
			return "select one l7_var_one";
		} else if(getName().contains("L8")) {
			return "select one l8_var_one related by l8_var_two->";
		} else if(getName().contains("L9")) {
			return "select one l9_var from instances of ";
		} else if(getName().contains("L10")) {
			return "generate";
		} else if(getName().contains("L11")) {
			return "generate L11Class1:event to";
		} else if(getName().contains("L12")) {
			return "p12_var =";
		} else if(getName().contains("L13")) {
			return "for each l13_var in";
		} else if(getName().contains("L14")) {
			return "return";
		} else if(getName().contains("L15")) {
			return "relate";
		} else if(getName().contains("L16")) {
			return "relate l16_var to";
		} else if(getName().contains("L17")) {
			return "relate l17_var to l17_var_2 across";
		} else if(getName().contains("L18")) {
			return "relate l18_var to l18_var_2 across R1.";
		} else if(getName().contains("L19")) {
			return "relate l19_var to l19_var_other across R2 using";
		} else if(getName().contains("L20")) {
			return "unrelate l20_var from";
		} else if(getName().contains("L21")) {
			return "unrelate l21_var from l21_var_2 across";
		} else if(getName().contains("L22")) {
			return "unrelate l22_var from l22_var_2 across R1.";
		} else if(getName().contains("L23")) {
			return "unrelate l23_var from l23_other across R2 using";
		} else if(getName().contains("L24")) {
			return "self.";
		} else if(getName().contains("L25")) {
			return "";
		} else if(getName().contains("L26")) {
			return "cardinality";
		} else if(getName().contains("L27")) {
			return "param.";
		} else if(getName().contains("L28")) {
			return "create object instance l28_var of";
		} else if(getName().contains("L29")) {
			return "delete object instance";
		} else if(getName().contains("L30")) {
			return "if(";
		} else if(getName().contains("L31")) {
			return "crete event instance l31_var of";
		} else if(getName().contains("L32")) {
			return "create event instance l32_var of L11Class1 to";
		} else if(getName().contains("L33")) {
			return "L33::";
		}
		return "";
	}
	
	private String getPossibility(String element) {
		if(element.contains("P1")) {
			return "control stop";
		} else if (element.contains("P2")) {
			return "create event instance";
		} else if (element.contains("P3")) {
			return "create object instance";
		} else if (element.contains("P4")) {
			return "delete object instance";
		} else if (element.contains("P5")) {
			return "for each";
		} else if (element.contains("P6")) {
			return "generate";
		} else if (element.contains("P7")) {
			return "if";
		} else if (element.contains("P8")) {
			return "param";
		}
		return "";
	}

	private String[] populateAutoComplete(String element) throws BadLocationException {
		if(getName().contains("AH11")) return new String[0];
		NonRootModelElement rootElement = (NonRootModelElement) getRootElementForBody(testBody)[0];
		int lineNumber = getLineNumber(element);
		String locationText = getLocationText();
		String action = ActionLanguageDescriptionUtil.getActionLanguageAttributeValue(rootElement);
		Document doc = new Document(action);
		IRegion region = doc.getLineInformation(lineNumber);
		doc.replace(region.getOffset(), locationText.length(), locationText);
		int col = positionToCol(region.getOffset(), doc);
        ParseRunnable parseRunner = new ParseRunnable(rootElement, doc.get(),
                lineNumber - 1, col);
        parseRunner.run();
		Proposal_c[] proposals = Proposal_c.getManyP_PsOnR1601(ProposalList_c.getManyP_PLsOnR1603(testBody));
		String[] results = new String[proposals.length];
		for(int i = 0; i < results.length; i++) {
			results[i] = proposals[i].getDisplay_text();
		}
		return results;
	}

	private int positionToCol(int position, IDocument document) {
		for (int i = 0, count = 0; i < document.getNumberOfLines(); i++) {
			try {
				if (position - count <= document.getLineLength(i))
					return position - count + 1;
				count += document.getLineLength(i);
			} catch (BadLocationException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	public static Object[] getRootElementForBody(NonRootModelElement columnInstance) {
		NonRootModelElement element = Bridge_c.getOneS_BRGOnR697(BridgeBody_c.getManyACT_BRBsOnR698((Body_c) columnInstance));
		if (element == null) {
			element = Operation_c.getOneO_TFROnR696((OperationBody_c.getManyACT_OPBsOnR698((Body_c) columnInstance)));
		}
		if(element == null) {
			element = Action_c.getOneSM_ACTOnR691(StateActionBody_c.getManyACT_SABsOnR698((Body_c) columnInstance));
		} 
		if(element == null) {
			element = Function_c.getOneS_SYNCOnR695(FunctionBody_c.getManyACT_FNBsOnR698((Body_c) columnInstance));
		} 
		if(element == null) {
			element = DerivedBaseAttribute_c.getOneO_DBATTROnR693(DerivedAttributeBody_c.getManyACT_DABsOnR698((Body_c) columnInstance));
		} 
		if(element == null) {
			element = ProvidedOperation_c.getOneSPR_POOnR687(ProvidedOperationBody_c.getManyACT_POBsOnR698((Body_c) columnInstance));
		} 
		if (element == null) {
			element = ProvidedSignal_c.getOneSPR_PSOnR686(ProvidedSignalBody_c.getManyACT_PSBsOnR698((Body_c) columnInstance));
		} 
		if (element == null) {
			element = RequiredOperation_c.getOneSPR_ROOnR685(RequiredOperationBody_c.getManyACT_ROBsOnR698((Body_c) columnInstance));
		} 
		if (element == null) {
			element = RequiredSignal_c.getOneSPR_RSOnR684(RequiredSignalBody_c.getManyACT_RSBsOnR698((Body_c) columnInstance));
		} 
		if (element == null) {
			element = Action_c.getOneSM_ACTOnR688(TransitionActionBody_c.getManyACT_TABsOnR698((Body_c) columnInstance));
		}
		String action = ActionLanguageDescriptionUtil.getActionLanguageAttributeValue(element);
		return new Object[] { element, action };
	}

	Body_c testBody = null;
	private String[] actualProposals;
	NonRootModelElement findElementForDof(String element) {
		ClassQueryInterface_c classQuery = new ClassQueryInterface_c() {

			@Override
			public boolean evaluate(Object candidate) {
				// ignore empty bodies
				Object[] detail = getBodyDetail((Body_c) candidate);
				NonRootModelElement pkg = (Package_c) detail[0];
				String action = (String) detail[1];
				if(action.length() == 0) {
					return false;
				}
				int index = getName().indexOf("AH");
				int length = getName().length();
				CharSequence testSequence = getName().subSequence(index, length);
				index = pkg.getName().indexOf("AH");
				if(index != -1) {
					length = pkg.getName().length();
					CharSequence pkgSequence = pkg.getName().subSequence(index, length);			
					return testSequence.equals(pkgSequence);
				}
				return false;
			}
		};
		testBody = Body_c.BodyInstance(modelRoot, classQuery);
		return testBody;
	}
    protected Object[] getBodyDetail(Body_c body) {
    	Object[] bodyDetail = getRootElementForBody(body);
		NonRootModelElement root = (NonRootModelElement) bodyDetail[0];
		Package_c parentPackage = root.getFirstParentPackage();
		if(parentPackage == null) {
			Component_c parentComponent = root.getFirstParentComponent();
			if(parentComponent != null) {
				parentPackage = parentComponent.getFirstParentPackage();
			}
		}
		bodyDetail[0] = parentPackage;
		return bodyDetail;
	}

	/**
     * "SV" is one of the degrees of freedom as specified in this issues
     * test matrix.
     * This routine gets the "SV" instance from the given name.
     * 
     * @param element The degree of freedom instance to retrieve
     * @return A model element used in the test as specified by the test matrix
     */
    NonRootModelElement selectSV(String element) {
        return selectSV(element, null);
    }

    /**
     * "SV" is one of the degrees of freedom as specified in this issues
     * test matrix.
     * This routine gets the "SV" instance from the given name.
     * 
     * @param element The degree of freedom instance to retrieve
     * @param extraData Extra data needed for selection
     * @return A model element used in the test as specified by the test matrix
     */
    NonRootModelElement selectSV(String element, Object extraData) {
    	// everything will be selected in the PAH selection, and test run
        return null;
    }

    /**
     * This routine performs the action associated with a matrix cell.
     * The parameters represent model instances aquired based on the specifed
     * column instance and row instance.
     * 
     * @param columnInstance Model instance from the column
     * @param rowInstance Model instance from the row
     * @throws BadPositionCategoryException 
     * @throws BadLocationException 
     * @throws InvocationTargetException 
     * @throws IllegalArgumentException 
     * @throws IllegalAccessException 
     * @throws SecurityException 
     * @throws NoSuchMethodException 
     */
    void SV_LPAH_Action(NonRootModelElement columnInstance, NonRootModelElement rowInstance) throws BadLocationException, BadPositionCategoryException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        actualProposals = populateAutoComplete(getName());
    }

    /**
    * This function verifies an expected result.
    *
    * @param source A model element instance aquired through a action taken
    *               on a column of the matrix.
    * @param destination A model element instance aquired through a action taken
    *                    taken on a row of the matrix.
    * @return true if the test succeeds, false if it fails
    */
    boolean checkResult_non(NonRootModelElement source, NonRootModelElement destination) {
    	for(String actual : actualProposals) {
        	if(actual.equals(getPossibility(getName()))) {
        		return false;
        	}
        }
        return true;
    }


    /**
    * This function verifies an expected result.
    *
    * @param source A model element instance aquired through a action taken
    *               on a column of the matrix.
    * @param destination A model element instance aquired through a action taken
    *                    taken on a row of the matrix.
    * @return true if the test succeeds, false if it fails
    */
    boolean checkResult_exists(NonRootModelElement source, NonRootModelElement destination) {
        for(String actual : actualProposals) {
        	if(actual.equals(getPossibility(getName()))) {
        		return true;
        	}
        }
        return false;
    }


}
