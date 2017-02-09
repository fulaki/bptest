/*
 * generated by Xtext 2.9.1
 */
package org.xtuml.bp.xtext.masl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtuml.bp.xtext.masl.parser.antlr.internal.InternalMASLParser;
import org.xtuml.bp.xtext.masl.services.MASLGrammarAccess;

public class MASLParser extends AbstractAntlrParser {

	@Inject
	private MASLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMASLParser createParser(XtextTokenStream stream) {
		return new InternalMASLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "MaslModel";
	}

	public MASLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MASLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
