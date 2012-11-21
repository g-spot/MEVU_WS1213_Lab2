/*
* generated by Xtext
*/
package at.ac.tuwien.big.me12.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import at.ac.tuwien.big.me12.services.GSMLDslGrammarAccess;

public class GSMLDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private GSMLDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected at.ac.tuwien.big.me12.parser.antlr.internal.InternalGSMLDslParser createParser(XtextTokenStream stream) {
		return new at.ac.tuwien.big.me12.parser.antlr.internal.InternalGSMLDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "GradingSystem";
	}
	
	public GSMLDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(GSMLDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}