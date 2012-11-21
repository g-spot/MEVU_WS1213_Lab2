package at.ac.tuwien.big.me12.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import at.ac.tuwien.big.me12.services.GSMLDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGSMLDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'%'", "'point(s)'", "'course'", "'{'", "'}'", "'semester'", "'grading scheme'", "'('", "')'", "':'", "';'", "'@all'", "'min'", "'-'"
    };
    public static final int RULE_ID=5;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalGSMLDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGSMLDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGSMLDslParser.tokenNames; }
    public String getGrammarFileName() { return "../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g"; }


     
     	private GSMLDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(GSMLDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleGradingSystem"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:60:1: entryRuleGradingSystem : ruleGradingSystem EOF ;
    public final void entryRuleGradingSystem() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:61:1: ( ruleGradingSystem EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:62:1: ruleGradingSystem EOF
            {
             before(grammarAccess.getGradingSystemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGradingSystem_in_entryRuleGradingSystem61);
            ruleGradingSystem();

            state._fsp--;

             after(grammarAccess.getGradingSystemRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGradingSystem68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGradingSystem"


    // $ANTLR start "ruleGradingSystem"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:69:1: ruleGradingSystem : ( ( rule__GradingSystem__CoursesAssignment )* ) ;
    public final void ruleGradingSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:73:2: ( ( ( rule__GradingSystem__CoursesAssignment )* ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:74:1: ( ( rule__GradingSystem__CoursesAssignment )* )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:74:1: ( ( rule__GradingSystem__CoursesAssignment )* )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:75:1: ( rule__GradingSystem__CoursesAssignment )*
            {
             before(grammarAccess.getGradingSystemAccess().getCoursesAssignment()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:76:1: ( rule__GradingSystem__CoursesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:76:2: rule__GradingSystem__CoursesAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__GradingSystem__CoursesAssignment_in_ruleGradingSystem94);
            	    rule__GradingSystem__CoursesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getGradingSystemAccess().getCoursesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGradingSystem"


    // $ANTLR start "entryRuleCourse"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:88:1: entryRuleCourse : ruleCourse EOF ;
    public final void entryRuleCourse() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:89:1: ( ruleCourse EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:90:1: ruleCourse EOF
            {
             before(grammarAccess.getCourseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourse_in_entryRuleCourse122);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getCourseRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCourse129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCourse"


    // $ANTLR start "ruleCourse"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:97:1: ruleCourse : ( ( rule__Course__Group__0 ) ) ;
    public final void ruleCourse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:101:2: ( ( ( rule__Course__Group__0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:102:1: ( ( rule__Course__Group__0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:102:1: ( ( rule__Course__Group__0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:103:1: ( rule__Course__Group__0 )
            {
             before(grammarAccess.getCourseAccess().getGroup()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:104:1: ( rule__Course__Group__0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:104:2: rule__Course__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__0_in_ruleCourse155);
            rule__Course__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCourse"


    // $ANTLR start "entryRuleGrading"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:116:1: entryRuleGrading : ruleGrading EOF ;
    public final void entryRuleGrading() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:117:1: ( ruleGrading EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:118:1: ruleGrading EOF
            {
             before(grammarAccess.getGradingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrading_in_entryRuleGrading182);
            ruleGrading();

            state._fsp--;

             after(grammarAccess.getGradingRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGrading189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrading"


    // $ANTLR start "ruleGrading"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:125:1: ruleGrading : ( ( rule__Grading__Group__0 ) ) ;
    public final void ruleGrading() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:129:2: ( ( ( rule__Grading__Group__0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:130:1: ( ( rule__Grading__Group__0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:130:1: ( ( rule__Grading__Group__0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:131:1: ( rule__Grading__Group__0 )
            {
             before(grammarAccess.getGradingAccess().getGroup()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:132:1: ( rule__Grading__Group__0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:132:2: rule__Grading__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__0_in_ruleGrading215);
            rule__Grading__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGradingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrading"


    // $ANTLR start "entryRuleGradingScheme"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:144:1: entryRuleGradingScheme : ruleGradingScheme EOF ;
    public final void entryRuleGradingScheme() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:145:1: ( ruleGradingScheme EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:146:1: ruleGradingScheme EOF
            {
             before(grammarAccess.getGradingSchemeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGradingScheme_in_entryRuleGradingScheme242);
            ruleGradingScheme();

            state._fsp--;

             after(grammarAccess.getGradingSchemeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGradingScheme249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGradingScheme"


    // $ANTLR start "ruleGradingScheme"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:153:1: ruleGradingScheme : ( ( rule__GradingScheme__Group__0 ) ) ;
    public final void ruleGradingScheme() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:157:2: ( ( ( rule__GradingScheme__Group__0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:158:1: ( ( rule__GradingScheme__Group__0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:158:1: ( ( rule__GradingScheme__Group__0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:159:1: ( rule__GradingScheme__Group__0 )
            {
             before(grammarAccess.getGradingSchemeAccess().getGroup()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:160:1: ( rule__GradingScheme__Group__0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:160:2: rule__GradingScheme__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__0_in_ruleGradingScheme275);
            rule__GradingScheme__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGradingSchemeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGradingScheme"


    // $ANTLR start "entryRuleGrade"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:172:1: entryRuleGrade : ruleGrade EOF ;
    public final void entryRuleGrade() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:173:1: ( ruleGrade EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:174:1: ruleGrade EOF
            {
             before(grammarAccess.getGradeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrade_in_entryRuleGrade302);
            ruleGrade();

            state._fsp--;

             after(grammarAccess.getGradeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGrade309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrade"


    // $ANTLR start "ruleGrade"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:181:1: ruleGrade : ( ( rule__Grade__Group__0 ) ) ;
    public final void ruleGrade() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:185:2: ( ( ( rule__Grade__Group__0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:186:1: ( ( rule__Grade__Group__0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:186:1: ( ( rule__Grade__Group__0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:187:1: ( rule__Grade__Group__0 )
            {
             before(grammarAccess.getGradeAccess().getGroup()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:188:1: ( rule__Grade__Group__0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:188:2: rule__Grade__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__0_in_ruleGrade335);
            rule__Grade__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGradeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrade"


    // $ANTLR start "entryRuleTask"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:200:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:201:1: ( ruleTask EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:202:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTask_in_entryRuleTask362);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTask369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:209:1: ruleTask : ( ( rule__Task__Alternatives ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:213:2: ( ( ( rule__Task__Alternatives ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:214:1: ( ( rule__Task__Alternatives ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:214:1: ( ( rule__Task__Alternatives ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:215:1: ( rule__Task__Alternatives )
            {
             before(grammarAccess.getTaskAccess().getAlternatives()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:216:1: ( rule__Task__Alternatives )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:216:2: rule__Task__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Task__Alternatives_in_ruleTask395);
            rule__Task__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleConcreteTask"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:228:1: entryRuleConcreteTask : ruleConcreteTask EOF ;
    public final void entryRuleConcreteTask() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:229:1: ( ruleConcreteTask EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:230:1: ruleConcreteTask EOF
            {
             before(grammarAccess.getConcreteTaskRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConcreteTask_in_entryRuleConcreteTask422);
            ruleConcreteTask();

            state._fsp--;

             after(grammarAccess.getConcreteTaskRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConcreteTask429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConcreteTask"


    // $ANTLR start "ruleConcreteTask"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:237:1: ruleConcreteTask : ( ( rule__ConcreteTask__Group__0 ) ) ;
    public final void ruleConcreteTask() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:241:2: ( ( ( rule__ConcreteTask__Group__0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:242:1: ( ( rule__ConcreteTask__Group__0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:242:1: ( ( rule__ConcreteTask__Group__0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:243:1: ( rule__ConcreteTask__Group__0 )
            {
             before(grammarAccess.getConcreteTaskAccess().getGroup()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:244:1: ( rule__ConcreteTask__Group__0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:244:2: rule__ConcreteTask__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__0_in_ruleConcreteTask455);
            rule__ConcreteTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConcreteTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConcreteTask"


    // $ANTLR start "entryRuleTaskGroup"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:256:1: entryRuleTaskGroup : ruleTaskGroup EOF ;
    public final void entryRuleTaskGroup() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:257:1: ( ruleTaskGroup EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:258:1: ruleTaskGroup EOF
            {
             before(grammarAccess.getTaskGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTaskGroup_in_entryRuleTaskGroup482);
            ruleTaskGroup();

            state._fsp--;

             after(grammarAccess.getTaskGroupRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTaskGroup489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTaskGroup"


    // $ANTLR start "ruleTaskGroup"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:265:1: ruleTaskGroup : ( ( rule__TaskGroup__Group__0 ) ) ;
    public final void ruleTaskGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:269:2: ( ( ( rule__TaskGroup__Group__0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:270:1: ( ( rule__TaskGroup__Group__0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:270:1: ( ( rule__TaskGroup__Group__0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:271:1: ( rule__TaskGroup__Group__0 )
            {
             before(grammarAccess.getTaskGroupAccess().getGroup()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:272:1: ( rule__TaskGroup__Group__0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:272:2: rule__TaskGroup__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__0_in_ruleTaskGroup515);
            rule__TaskGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskGroup"


    // $ANTLR start "entryRuleMinRequirement"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:284:1: entryRuleMinRequirement : ruleMinRequirement EOF ;
    public final void entryRuleMinRequirement() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:285:1: ( ruleMinRequirement EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:286:1: ruleMinRequirement EOF
            {
             before(grammarAccess.getMinRequirementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMinRequirement_in_entryRuleMinRequirement542);
            ruleMinRequirement();

            state._fsp--;

             after(grammarAccess.getMinRequirementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMinRequirement549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMinRequirement"


    // $ANTLR start "ruleMinRequirement"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:293:1: ruleMinRequirement : ( ( rule__MinRequirement__Group__0 ) ) ;
    public final void ruleMinRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:297:2: ( ( ( rule__MinRequirement__Group__0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:298:1: ( ( rule__MinRequirement__Group__0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:298:1: ( ( rule__MinRequirement__Group__0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:299:1: ( rule__MinRequirement__Group__0 )
            {
             before(grammarAccess.getMinRequirementAccess().getGroup()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:300:1: ( rule__MinRequirement__Group__0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:300:2: rule__MinRequirement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__Group__0_in_ruleMinRequirement575);
            rule__MinRequirement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinRequirementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMinRequirement"


    // $ANTLR start "entryRuleEString"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:312:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:313:1: ( ruleEString EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:314:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString602);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:321:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:325:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:326:1: ( ( rule__EString__Alternatives ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:326:1: ( ( rule__EString__Alternatives ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:327:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:328:1: ( rule__EString__Alternatives )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:328:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString635);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:340:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:341:1: ( ruleEInt EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:342:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt662);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:349:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:353:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:354:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:354:1: ( ( rule__EInt__Group__0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:355:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:356:1: ( rule__EInt__Group__0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:356:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt695);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleMinRequirementsType"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:369:1: ruleMinRequirementsType : ( ( rule__MinRequirementsType__Alternatives ) ) ;
    public final void ruleMinRequirementsType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:373:1: ( ( ( rule__MinRequirementsType__Alternatives ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:374:1: ( ( rule__MinRequirementsType__Alternatives ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:374:1: ( ( rule__MinRequirementsType__Alternatives ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:375:1: ( rule__MinRequirementsType__Alternatives )
            {
             before(grammarAccess.getMinRequirementsTypeAccess().getAlternatives()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:376:1: ( rule__MinRequirementsType__Alternatives )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:376:2: rule__MinRequirementsType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__MinRequirementsType__Alternatives_in_ruleMinRequirementsType732);
            rule__MinRequirementsType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMinRequirementsTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMinRequirementsType"


    // $ANTLR start "rule__Task__Alternatives"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:387:1: rule__Task__Alternatives : ( ( ruleConcreteTask ) | ( ruleTaskGroup ) );
    public final void rule__Task__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:391:1: ( ( ruleConcreteTask ) | ( ruleTaskGroup ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==14) ) {
                    alt2=2;
                }
                else if ( (LA2_1==18) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_ID) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==18) ) {
                    alt2=1;
                }
                else if ( (LA2_2==14) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:392:1: ( ruleConcreteTask )
                    {
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:392:1: ( ruleConcreteTask )
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:393:1: ruleConcreteTask
                    {
                     before(grammarAccess.getTaskAccess().getConcreteTaskParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleConcreteTask_in_rule__Task__Alternatives767);
                    ruleConcreteTask();

                    state._fsp--;

                     after(grammarAccess.getTaskAccess().getConcreteTaskParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:398:6: ( ruleTaskGroup )
                    {
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:398:6: ( ruleTaskGroup )
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:399:1: ruleTaskGroup
                    {
                     before(grammarAccess.getTaskAccess().getTaskGroupParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTaskGroup_in_rule__Task__Alternatives784);
                    ruleTaskGroup();

                    state._fsp--;

                     after(grammarAccess.getTaskAccess().getTaskGroupParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:409:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:413:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:414:1: ( RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:414:1: ( RULE_STRING )
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:415:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives816); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:420:6: ( RULE_ID )
                    {
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:420:6: ( RULE_ID )
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:421:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives833); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__MinRequirementsType__Alternatives"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:431:1: rule__MinRequirementsType__Alternatives : ( ( ( '%' ) ) | ( ( 'point(s)' ) ) );
    public final void rule__MinRequirementsType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:435:1: ( ( ( '%' ) ) | ( ( 'point(s)' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:436:1: ( ( '%' ) )
                    {
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:436:1: ( ( '%' ) )
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:437:1: ( '%' )
                    {
                     before(grammarAccess.getMinRequirementsTypeAccess().getPercentageEnumLiteralDeclaration_0()); 
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:438:1: ( '%' )
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:438:3: '%'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__MinRequirementsType__Alternatives866); 

                    }

                     after(grammarAccess.getMinRequirementsTypeAccess().getPercentageEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:443:6: ( ( 'point(s)' ) )
                    {
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:443:6: ( ( 'point(s)' ) )
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:444:1: ( 'point(s)' )
                    {
                     before(grammarAccess.getMinRequirementsTypeAccess().getAbsoluteEnumLiteralDeclaration_1()); 
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:445:1: ( 'point(s)' )
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:445:3: 'point(s)'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__MinRequirementsType__Alternatives887); 

                    }

                     after(grammarAccess.getMinRequirementsTypeAccess().getAbsoluteEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinRequirementsType__Alternatives"


    // $ANTLR start "rule__Course__Group__0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:457:1: rule__Course__Group__0 : rule__Course__Group__0__Impl rule__Course__Group__1 ;
    public final void rule__Course__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:461:1: ( rule__Course__Group__0__Impl rule__Course__Group__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:462:2: rule__Course__Group__0__Impl rule__Course__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__0__Impl_in_rule__Course__Group__0920);
            rule__Course__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__1_in_rule__Course__Group__0923);
            rule__Course__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__0"


    // $ANTLR start "rule__Course__Group__0__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:469:1: rule__Course__Group__0__Impl : ( 'course' ) ;
    public final void rule__Course__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:473:1: ( ( 'course' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:474:1: ( 'course' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:474:1: ( 'course' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:475:1: 'course'
            {
             before(grammarAccess.getCourseAccess().getCourseKeyword_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Course__Group__0__Impl951); 
             after(grammarAccess.getCourseAccess().getCourseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__0__Impl"


    // $ANTLR start "rule__Course__Group__1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:488:1: rule__Course__Group__1 : rule__Course__Group__1__Impl rule__Course__Group__2 ;
    public final void rule__Course__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:492:1: ( rule__Course__Group__1__Impl rule__Course__Group__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:493:2: rule__Course__Group__1__Impl rule__Course__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__1__Impl_in_rule__Course__Group__1982);
            rule__Course__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__2_in_rule__Course__Group__1985);
            rule__Course__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__1"


    // $ANTLR start "rule__Course__Group__1__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:500:1: rule__Course__Group__1__Impl : ( ( rule__Course__NameAssignment_1 ) ) ;
    public final void rule__Course__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:504:1: ( ( ( rule__Course__NameAssignment_1 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:505:1: ( ( rule__Course__NameAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:505:1: ( ( rule__Course__NameAssignment_1 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:506:1: ( rule__Course__NameAssignment_1 )
            {
             before(grammarAccess.getCourseAccess().getNameAssignment_1()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:507:1: ( rule__Course__NameAssignment_1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:507:2: rule__Course__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__NameAssignment_1_in_rule__Course__Group__1__Impl1012);
            rule__Course__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__1__Impl"


    // $ANTLR start "rule__Course__Group__2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:517:1: rule__Course__Group__2 : rule__Course__Group__2__Impl rule__Course__Group__3 ;
    public final void rule__Course__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:521:1: ( rule__Course__Group__2__Impl rule__Course__Group__3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:522:2: rule__Course__Group__2__Impl rule__Course__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__2__Impl_in_rule__Course__Group__21042);
            rule__Course__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__3_in_rule__Course__Group__21045);
            rule__Course__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__2"


    // $ANTLR start "rule__Course__Group__2__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:529:1: rule__Course__Group__2__Impl : ( '{' ) ;
    public final void rule__Course__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:533:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:534:1: ( '{' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:534:1: ( '{' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:535:1: '{'
            {
             before(grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Course__Group__2__Impl1073); 
             after(grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__2__Impl"


    // $ANTLR start "rule__Course__Group__3"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:548:1: rule__Course__Group__3 : rule__Course__Group__3__Impl rule__Course__Group__4 ;
    public final void rule__Course__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:552:1: ( rule__Course__Group__3__Impl rule__Course__Group__4 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:553:2: rule__Course__Group__3__Impl rule__Course__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__3__Impl_in_rule__Course__Group__31104);
            rule__Course__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__4_in_rule__Course__Group__31107);
            rule__Course__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__3"


    // $ANTLR start "rule__Course__Group__3__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:560:1: rule__Course__Group__3__Impl : ( ( rule__Course__GradingsAssignment_3 )* ) ;
    public final void rule__Course__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:564:1: ( ( ( rule__Course__GradingsAssignment_3 )* ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:565:1: ( ( rule__Course__GradingsAssignment_3 )* )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:565:1: ( ( rule__Course__GradingsAssignment_3 )* )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:566:1: ( rule__Course__GradingsAssignment_3 )*
            {
             before(grammarAccess.getCourseAccess().getGradingsAssignment_3()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:567:1: ( rule__Course__GradingsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:567:2: rule__Course__GradingsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Course__GradingsAssignment_3_in_rule__Course__Group__3__Impl1134);
            	    rule__Course__GradingsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getCourseAccess().getGradingsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__3__Impl"


    // $ANTLR start "rule__Course__Group__4"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:577:1: rule__Course__Group__4 : rule__Course__Group__4__Impl ;
    public final void rule__Course__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:581:1: ( rule__Course__Group__4__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:582:2: rule__Course__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__4__Impl_in_rule__Course__Group__41165);
            rule__Course__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__4"


    // $ANTLR start "rule__Course__Group__4__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:588:1: rule__Course__Group__4__Impl : ( '}' ) ;
    public final void rule__Course__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:592:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:593:1: ( '}' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:593:1: ( '}' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:594:1: '}'
            {
             before(grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Course__Group__4__Impl1193); 
             after(grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__4__Impl"


    // $ANTLR start "rule__Grading__Group__0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:617:1: rule__Grading__Group__0 : rule__Grading__Group__0__Impl rule__Grading__Group__1 ;
    public final void rule__Grading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:621:1: ( rule__Grading__Group__0__Impl rule__Grading__Group__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:622:2: rule__Grading__Group__0__Impl rule__Grading__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__0__Impl_in_rule__Grading__Group__01234);
            rule__Grading__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__1_in_rule__Grading__Group__01237);
            rule__Grading__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__0"


    // $ANTLR start "rule__Grading__Group__0__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:629:1: rule__Grading__Group__0__Impl : ( 'semester' ) ;
    public final void rule__Grading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:633:1: ( ( 'semester' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:634:1: ( 'semester' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:634:1: ( 'semester' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:635:1: 'semester'
            {
             before(grammarAccess.getGradingAccess().getSemesterKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Grading__Group__0__Impl1265); 
             after(grammarAccess.getGradingAccess().getSemesterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__0__Impl"


    // $ANTLR start "rule__Grading__Group__1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:648:1: rule__Grading__Group__1 : rule__Grading__Group__1__Impl rule__Grading__Group__2 ;
    public final void rule__Grading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:652:1: ( rule__Grading__Group__1__Impl rule__Grading__Group__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:653:2: rule__Grading__Group__1__Impl rule__Grading__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__1__Impl_in_rule__Grading__Group__11296);
            rule__Grading__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__2_in_rule__Grading__Group__11299);
            rule__Grading__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__1"


    // $ANTLR start "rule__Grading__Group__1__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:660:1: rule__Grading__Group__1__Impl : ( ( rule__Grading__SemesterAssignment_1 ) ) ;
    public final void rule__Grading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:664:1: ( ( ( rule__Grading__SemesterAssignment_1 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:665:1: ( ( rule__Grading__SemesterAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:665:1: ( ( rule__Grading__SemesterAssignment_1 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:666:1: ( rule__Grading__SemesterAssignment_1 )
            {
             before(grammarAccess.getGradingAccess().getSemesterAssignment_1()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:667:1: ( rule__Grading__SemesterAssignment_1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:667:2: rule__Grading__SemesterAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__SemesterAssignment_1_in_rule__Grading__Group__1__Impl1326);
            rule__Grading__SemesterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGradingAccess().getSemesterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__1__Impl"


    // $ANTLR start "rule__Grading__Group__2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:677:1: rule__Grading__Group__2 : rule__Grading__Group__2__Impl rule__Grading__Group__3 ;
    public final void rule__Grading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:681:1: ( rule__Grading__Group__2__Impl rule__Grading__Group__3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:682:2: rule__Grading__Group__2__Impl rule__Grading__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__2__Impl_in_rule__Grading__Group__21356);
            rule__Grading__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__3_in_rule__Grading__Group__21359);
            rule__Grading__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__2"


    // $ANTLR start "rule__Grading__Group__2__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:689:1: rule__Grading__Group__2__Impl : ( '{' ) ;
    public final void rule__Grading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:693:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:694:1: ( '{' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:694:1: ( '{' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:695:1: '{'
            {
             before(grammarAccess.getGradingAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Grading__Group__2__Impl1387); 
             after(grammarAccess.getGradingAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__2__Impl"


    // $ANTLR start "rule__Grading__Group__3"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:708:1: rule__Grading__Group__3 : rule__Grading__Group__3__Impl rule__Grading__Group__4 ;
    public final void rule__Grading__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:712:1: ( rule__Grading__Group__3__Impl rule__Grading__Group__4 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:713:2: rule__Grading__Group__3__Impl rule__Grading__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__3__Impl_in_rule__Grading__Group__31418);
            rule__Grading__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__4_in_rule__Grading__Group__31421);
            rule__Grading__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__3"


    // $ANTLR start "rule__Grading__Group__3__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:720:1: rule__Grading__Group__3__Impl : ( ( rule__Grading__GradingSchemeAssignment_3 ) ) ;
    public final void rule__Grading__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:724:1: ( ( ( rule__Grading__GradingSchemeAssignment_3 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:725:1: ( ( rule__Grading__GradingSchemeAssignment_3 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:725:1: ( ( rule__Grading__GradingSchemeAssignment_3 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:726:1: ( rule__Grading__GradingSchemeAssignment_3 )
            {
             before(grammarAccess.getGradingAccess().getGradingSchemeAssignment_3()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:727:1: ( rule__Grading__GradingSchemeAssignment_3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:727:2: rule__Grading__GradingSchemeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__GradingSchemeAssignment_3_in_rule__Grading__Group__3__Impl1448);
            rule__Grading__GradingSchemeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGradingAccess().getGradingSchemeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__3__Impl"


    // $ANTLR start "rule__Grading__Group__4"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:737:1: rule__Grading__Group__4 : rule__Grading__Group__4__Impl rule__Grading__Group__5 ;
    public final void rule__Grading__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:741:1: ( rule__Grading__Group__4__Impl rule__Grading__Group__5 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:742:2: rule__Grading__Group__4__Impl rule__Grading__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__4__Impl_in_rule__Grading__Group__41478);
            rule__Grading__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__5_in_rule__Grading__Group__41481);
            rule__Grading__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__4"


    // $ANTLR start "rule__Grading__Group__4__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:749:1: rule__Grading__Group__4__Impl : ( ( rule__Grading__TasksAssignment_4 ) ) ;
    public final void rule__Grading__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:753:1: ( ( ( rule__Grading__TasksAssignment_4 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:754:1: ( ( rule__Grading__TasksAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:754:1: ( ( rule__Grading__TasksAssignment_4 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:755:1: ( rule__Grading__TasksAssignment_4 )
            {
             before(grammarAccess.getGradingAccess().getTasksAssignment_4()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:756:1: ( rule__Grading__TasksAssignment_4 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:756:2: rule__Grading__TasksAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__TasksAssignment_4_in_rule__Grading__Group__4__Impl1508);
            rule__Grading__TasksAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGradingAccess().getTasksAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__4__Impl"


    // $ANTLR start "rule__Grading__Group__5"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:766:1: rule__Grading__Group__5 : rule__Grading__Group__5__Impl ;
    public final void rule__Grading__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:770:1: ( rule__Grading__Group__5__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:771:2: rule__Grading__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grading__Group__5__Impl_in_rule__Grading__Group__51538);
            rule__Grading__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__5"


    // $ANTLR start "rule__Grading__Group__5__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:777:1: rule__Grading__Group__5__Impl : ( '}' ) ;
    public final void rule__Grading__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:781:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:782:1: ( '}' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:782:1: ( '}' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:783:1: '}'
            {
             before(grammarAccess.getGradingAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Grading__Group__5__Impl1566); 
             after(grammarAccess.getGradingAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__Group__5__Impl"


    // $ANTLR start "rule__GradingScheme__Group__0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:808:1: rule__GradingScheme__Group__0 : rule__GradingScheme__Group__0__Impl rule__GradingScheme__Group__1 ;
    public final void rule__GradingScheme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:812:1: ( rule__GradingScheme__Group__0__Impl rule__GradingScheme__Group__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:813:2: rule__GradingScheme__Group__0__Impl rule__GradingScheme__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__0__Impl_in_rule__GradingScheme__Group__01609);
            rule__GradingScheme__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__1_in_rule__GradingScheme__Group__01612);
            rule__GradingScheme__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__0"


    // $ANTLR start "rule__GradingScheme__Group__0__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:820:1: rule__GradingScheme__Group__0__Impl : ( 'grading scheme' ) ;
    public final void rule__GradingScheme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:824:1: ( ( 'grading scheme' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:825:1: ( 'grading scheme' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:825:1: ( 'grading scheme' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:826:1: 'grading scheme'
            {
             before(grammarAccess.getGradingSchemeAccess().getGradingSchemeKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__GradingScheme__Group__0__Impl1640); 
             after(grammarAccess.getGradingSchemeAccess().getGradingSchemeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__0__Impl"


    // $ANTLR start "rule__GradingScheme__Group__1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:839:1: rule__GradingScheme__Group__1 : rule__GradingScheme__Group__1__Impl rule__GradingScheme__Group__2 ;
    public final void rule__GradingScheme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:843:1: ( rule__GradingScheme__Group__1__Impl rule__GradingScheme__Group__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:844:2: rule__GradingScheme__Group__1__Impl rule__GradingScheme__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__1__Impl_in_rule__GradingScheme__Group__11671);
            rule__GradingScheme__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__2_in_rule__GradingScheme__Group__11674);
            rule__GradingScheme__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__1"


    // $ANTLR start "rule__GradingScheme__Group__1__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:851:1: rule__GradingScheme__Group__1__Impl : ( '(' ) ;
    public final void rule__GradingScheme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:855:1: ( ( '(' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:856:1: ( '(' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:856:1: ( '(' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:857:1: '('
            {
             before(grammarAccess.getGradingSchemeAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__GradingScheme__Group__1__Impl1702); 
             after(grammarAccess.getGradingSchemeAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__1__Impl"


    // $ANTLR start "rule__GradingScheme__Group__2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:870:1: rule__GradingScheme__Group__2 : rule__GradingScheme__Group__2__Impl rule__GradingScheme__Group__3 ;
    public final void rule__GradingScheme__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:874:1: ( rule__GradingScheme__Group__2__Impl rule__GradingScheme__Group__3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:875:2: rule__GradingScheme__Group__2__Impl rule__GradingScheme__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__2__Impl_in_rule__GradingScheme__Group__21733);
            rule__GradingScheme__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__3_in_rule__GradingScheme__Group__21736);
            rule__GradingScheme__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__2"


    // $ANTLR start "rule__GradingScheme__Group__2__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:882:1: rule__GradingScheme__Group__2__Impl : ( ( rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2 ) ) ;
    public final void rule__GradingScheme__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:886:1: ( ( ( rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:887:1: ( ( rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:887:1: ( ( rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:888:1: ( rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2 )
            {
             before(grammarAccess.getGradingSchemeAccess().getMinRequirementNotFulfilledGradeAssignment_2()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:889:1: ( rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:889:2: rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2_in_rule__GradingScheme__Group__2__Impl1763);
            rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGradingSchemeAccess().getMinRequirementNotFulfilledGradeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__2__Impl"


    // $ANTLR start "rule__GradingScheme__Group__3"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:899:1: rule__GradingScheme__Group__3 : rule__GradingScheme__Group__3__Impl rule__GradingScheme__Group__4 ;
    public final void rule__GradingScheme__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:903:1: ( rule__GradingScheme__Group__3__Impl rule__GradingScheme__Group__4 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:904:2: rule__GradingScheme__Group__3__Impl rule__GradingScheme__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__3__Impl_in_rule__GradingScheme__Group__31793);
            rule__GradingScheme__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__4_in_rule__GradingScheme__Group__31796);
            rule__GradingScheme__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__3"


    // $ANTLR start "rule__GradingScheme__Group__3__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:911:1: rule__GradingScheme__Group__3__Impl : ( ')' ) ;
    public final void rule__GradingScheme__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:915:1: ( ( ')' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:916:1: ( ')' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:916:1: ( ')' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:917:1: ')'
            {
             before(grammarAccess.getGradingSchemeAccess().getRightParenthesisKeyword_3()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__GradingScheme__Group__3__Impl1824); 
             after(grammarAccess.getGradingSchemeAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__3__Impl"


    // $ANTLR start "rule__GradingScheme__Group__4"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:930:1: rule__GradingScheme__Group__4 : rule__GradingScheme__Group__4__Impl rule__GradingScheme__Group__5 ;
    public final void rule__GradingScheme__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:934:1: ( rule__GradingScheme__Group__4__Impl rule__GradingScheme__Group__5 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:935:2: rule__GradingScheme__Group__4__Impl rule__GradingScheme__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__4__Impl_in_rule__GradingScheme__Group__41855);
            rule__GradingScheme__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__5_in_rule__GradingScheme__Group__41858);
            rule__GradingScheme__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__4"


    // $ANTLR start "rule__GradingScheme__Group__4__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:942:1: rule__GradingScheme__Group__4__Impl : ( '{' ) ;
    public final void rule__GradingScheme__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:946:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:947:1: ( '{' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:947:1: ( '{' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:948:1: '{'
            {
             before(grammarAccess.getGradingSchemeAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__GradingScheme__Group__4__Impl1886); 
             after(grammarAccess.getGradingSchemeAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__4__Impl"


    // $ANTLR start "rule__GradingScheme__Group__5"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:961:1: rule__GradingScheme__Group__5 : rule__GradingScheme__Group__5__Impl rule__GradingScheme__Group__6 ;
    public final void rule__GradingScheme__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:965:1: ( rule__GradingScheme__Group__5__Impl rule__GradingScheme__Group__6 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:966:2: rule__GradingScheme__Group__5__Impl rule__GradingScheme__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__5__Impl_in_rule__GradingScheme__Group__51917);
            rule__GradingScheme__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__6_in_rule__GradingScheme__Group__51920);
            rule__GradingScheme__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__5"


    // $ANTLR start "rule__GradingScheme__Group__5__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:973:1: rule__GradingScheme__Group__5__Impl : ( ( rule__GradingScheme__GradesAssignment_5 )* ) ;
    public final void rule__GradingScheme__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:977:1: ( ( ( rule__GradingScheme__GradesAssignment_5 )* ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:978:1: ( ( rule__GradingScheme__GradesAssignment_5 )* )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:978:1: ( ( rule__GradingScheme__GradesAssignment_5 )* )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:979:1: ( rule__GradingScheme__GradesAssignment_5 )*
            {
             before(grammarAccess.getGradingSchemeAccess().getGradesAssignment_5()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:980:1: ( rule__GradingScheme__GradesAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:980:2: rule__GradingScheme__GradesAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__GradesAssignment_5_in_rule__GradingScheme__Group__5__Impl1947);
            	    rule__GradingScheme__GradesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getGradingSchemeAccess().getGradesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__5__Impl"


    // $ANTLR start "rule__GradingScheme__Group__6"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:990:1: rule__GradingScheme__Group__6 : rule__GradingScheme__Group__6__Impl ;
    public final void rule__GradingScheme__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:994:1: ( rule__GradingScheme__Group__6__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:995:2: rule__GradingScheme__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GradingScheme__Group__6__Impl_in_rule__GradingScheme__Group__61978);
            rule__GradingScheme__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__6"


    // $ANTLR start "rule__GradingScheme__Group__6__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1001:1: rule__GradingScheme__Group__6__Impl : ( '}' ) ;
    public final void rule__GradingScheme__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1005:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1006:1: ( '}' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1006:1: ( '}' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1007:1: '}'
            {
             before(grammarAccess.getGradingSchemeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__GradingScheme__Group__6__Impl2006); 
             after(grammarAccess.getGradingSchemeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__Group__6__Impl"


    // $ANTLR start "rule__Grade__Group__0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1034:1: rule__Grade__Group__0 : rule__Grade__Group__0__Impl rule__Grade__Group__1 ;
    public final void rule__Grade__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1038:1: ( rule__Grade__Group__0__Impl rule__Grade__Group__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1039:2: rule__Grade__Group__0__Impl rule__Grade__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__0__Impl_in_rule__Grade__Group__02051);
            rule__Grade__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__1_in_rule__Grade__Group__02054);
            rule__Grade__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grade__Group__0"


    // $ANTLR start "rule__Grade__Group__0__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1046:1: rule__Grade__Group__0__Impl : ( ( rule__Grade__NameAssignment_0 ) ) ;
    public final void rule__Grade__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1050:1: ( ( ( rule__Grade__NameAssignment_0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1051:1: ( ( rule__Grade__NameAssignment_0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1051:1: ( ( rule__Grade__NameAssignment_0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1052:1: ( rule__Grade__NameAssignment_0 )
            {
             before(grammarAccess.getGradeAccess().getNameAssignment_0()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1053:1: ( rule__Grade__NameAssignment_0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1053:2: rule__Grade__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grade__NameAssignment_0_in_rule__Grade__Group__0__Impl2081);
            rule__Grade__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGradeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grade__Group__0__Impl"


    // $ANTLR start "rule__Grade__Group__1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1063:1: rule__Grade__Group__1 : rule__Grade__Group__1__Impl rule__Grade__Group__2 ;
    public final void rule__Grade__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1067:1: ( rule__Grade__Group__1__Impl rule__Grade__Group__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1068:2: rule__Grade__Group__1__Impl rule__Grade__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__1__Impl_in_rule__Grade__Group__12111);
            rule__Grade__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__2_in_rule__Grade__Group__12114);
            rule__Grade__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grade__Group__1"


    // $ANTLR start "rule__Grade__Group__1__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1075:1: rule__Grade__Group__1__Impl : ( ':' ) ;
    public final void rule__Grade__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1079:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1080:1: ( ':' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1080:1: ( ':' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1081:1: ':'
            {
             before(grammarAccess.getGradeAccess().getColonKeyword_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Grade__Group__1__Impl2142); 
             after(grammarAccess.getGradeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grade__Group__1__Impl"


    // $ANTLR start "rule__Grade__Group__2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1094:1: rule__Grade__Group__2 : rule__Grade__Group__2__Impl rule__Grade__Group__3 ;
    public final void rule__Grade__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1098:1: ( rule__Grade__Group__2__Impl rule__Grade__Group__3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1099:2: rule__Grade__Group__2__Impl rule__Grade__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__2__Impl_in_rule__Grade__Group__22173);
            rule__Grade__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__3_in_rule__Grade__Group__22176);
            rule__Grade__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grade__Group__2"


    // $ANTLR start "rule__Grade__Group__2__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1106:1: rule__Grade__Group__2__Impl : ( ( rule__Grade__RequiredPointsAssignment_2 ) ) ;
    public final void rule__Grade__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1110:1: ( ( ( rule__Grade__RequiredPointsAssignment_2 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1111:1: ( ( rule__Grade__RequiredPointsAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1111:1: ( ( rule__Grade__RequiredPointsAssignment_2 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1112:1: ( rule__Grade__RequiredPointsAssignment_2 )
            {
             before(grammarAccess.getGradeAccess().getRequiredPointsAssignment_2()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1113:1: ( rule__Grade__RequiredPointsAssignment_2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1113:2: rule__Grade__RequiredPointsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grade__RequiredPointsAssignment_2_in_rule__Grade__Group__2__Impl2203);
            rule__Grade__RequiredPointsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGradeAccess().getRequiredPointsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grade__Group__2__Impl"


    // $ANTLR start "rule__Grade__Group__3"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1123:1: rule__Grade__Group__3 : rule__Grade__Group__3__Impl ;
    public final void rule__Grade__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1127:1: ( rule__Grade__Group__3__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1128:2: rule__Grade__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Grade__Group__3__Impl_in_rule__Grade__Group__32233);
            rule__Grade__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grade__Group__3"


    // $ANTLR start "rule__Grade__Group__3__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1134:1: rule__Grade__Group__3__Impl : ( ';' ) ;
    public final void rule__Grade__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1138:1: ( ( ';' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1139:1: ( ';' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1139:1: ( ';' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1140:1: ';'
            {
             before(grammarAccess.getGradeAccess().getSemicolonKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Grade__Group__3__Impl2261); 
             after(grammarAccess.getGradeAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grade__Group__3__Impl"


    // $ANTLR start "rule__ConcreteTask__Group__0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1161:1: rule__ConcreteTask__Group__0 : rule__ConcreteTask__Group__0__Impl rule__ConcreteTask__Group__1 ;
    public final void rule__ConcreteTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1165:1: ( rule__ConcreteTask__Group__0__Impl rule__ConcreteTask__Group__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1166:2: rule__ConcreteTask__Group__0__Impl rule__ConcreteTask__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__0__Impl_in_rule__ConcreteTask__Group__02300);
            rule__ConcreteTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__1_in_rule__ConcreteTask__Group__02303);
            rule__ConcreteTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__0"


    // $ANTLR start "rule__ConcreteTask__Group__0__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1173:1: rule__ConcreteTask__Group__0__Impl : ( ( rule__ConcreteTask__NameAssignment_0 ) ) ;
    public final void rule__ConcreteTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1177:1: ( ( ( rule__ConcreteTask__NameAssignment_0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1178:1: ( ( rule__ConcreteTask__NameAssignment_0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1178:1: ( ( rule__ConcreteTask__NameAssignment_0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1179:1: ( rule__ConcreteTask__NameAssignment_0 )
            {
             before(grammarAccess.getConcreteTaskAccess().getNameAssignment_0()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1180:1: ( rule__ConcreteTask__NameAssignment_0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1180:2: rule__ConcreteTask__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__NameAssignment_0_in_rule__ConcreteTask__Group__0__Impl2330);
            rule__ConcreteTask__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConcreteTaskAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__0__Impl"


    // $ANTLR start "rule__ConcreteTask__Group__1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1190:1: rule__ConcreteTask__Group__1 : rule__ConcreteTask__Group__1__Impl rule__ConcreteTask__Group__2 ;
    public final void rule__ConcreteTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1194:1: ( rule__ConcreteTask__Group__1__Impl rule__ConcreteTask__Group__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1195:2: rule__ConcreteTask__Group__1__Impl rule__ConcreteTask__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__1__Impl_in_rule__ConcreteTask__Group__12360);
            rule__ConcreteTask__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__2_in_rule__ConcreteTask__Group__12363);
            rule__ConcreteTask__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__1"


    // $ANTLR start "rule__ConcreteTask__Group__1__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1202:1: rule__ConcreteTask__Group__1__Impl : ( '(' ) ;
    public final void rule__ConcreteTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1206:1: ( ( '(' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1207:1: ( '(' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1207:1: ( '(' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1208:1: '('
            {
             before(grammarAccess.getConcreteTaskAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__ConcreteTask__Group__1__Impl2391); 
             after(grammarAccess.getConcreteTaskAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__1__Impl"


    // $ANTLR start "rule__ConcreteTask__Group__2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1221:1: rule__ConcreteTask__Group__2 : rule__ConcreteTask__Group__2__Impl rule__ConcreteTask__Group__3 ;
    public final void rule__ConcreteTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1225:1: ( rule__ConcreteTask__Group__2__Impl rule__ConcreteTask__Group__3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1226:2: rule__ConcreteTask__Group__2__Impl rule__ConcreteTask__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__2__Impl_in_rule__ConcreteTask__Group__22422);
            rule__ConcreteTask__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__3_in_rule__ConcreteTask__Group__22425);
            rule__ConcreteTask__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__2"


    // $ANTLR start "rule__ConcreteTask__Group__2__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1233:1: rule__ConcreteTask__Group__2__Impl : ( ( rule__ConcreteTask__MaxPointsAssignment_2 ) ) ;
    public final void rule__ConcreteTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1237:1: ( ( ( rule__ConcreteTask__MaxPointsAssignment_2 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1238:1: ( ( rule__ConcreteTask__MaxPointsAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1238:1: ( ( rule__ConcreteTask__MaxPointsAssignment_2 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1239:1: ( rule__ConcreteTask__MaxPointsAssignment_2 )
            {
             before(grammarAccess.getConcreteTaskAccess().getMaxPointsAssignment_2()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1240:1: ( rule__ConcreteTask__MaxPointsAssignment_2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1240:2: rule__ConcreteTask__MaxPointsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__MaxPointsAssignment_2_in_rule__ConcreteTask__Group__2__Impl2452);
            rule__ConcreteTask__MaxPointsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConcreteTaskAccess().getMaxPointsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__2__Impl"


    // $ANTLR start "rule__ConcreteTask__Group__3"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1250:1: rule__ConcreteTask__Group__3 : rule__ConcreteTask__Group__3__Impl rule__ConcreteTask__Group__4 ;
    public final void rule__ConcreteTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1254:1: ( rule__ConcreteTask__Group__3__Impl rule__ConcreteTask__Group__4 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1255:2: rule__ConcreteTask__Group__3__Impl rule__ConcreteTask__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__3__Impl_in_rule__ConcreteTask__Group__32482);
            rule__ConcreteTask__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__4_in_rule__ConcreteTask__Group__32485);
            rule__ConcreteTask__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__3"


    // $ANTLR start "rule__ConcreteTask__Group__3__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1262:1: rule__ConcreteTask__Group__3__Impl : ( ')' ) ;
    public final void rule__ConcreteTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1266:1: ( ( ')' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1267:1: ( ')' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1267:1: ( ')' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1268:1: ')'
            {
             before(grammarAccess.getConcreteTaskAccess().getRightParenthesisKeyword_3()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__ConcreteTask__Group__3__Impl2513); 
             after(grammarAccess.getConcreteTaskAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__3__Impl"


    // $ANTLR start "rule__ConcreteTask__Group__4"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1281:1: rule__ConcreteTask__Group__4 : rule__ConcreteTask__Group__4__Impl rule__ConcreteTask__Group__5 ;
    public final void rule__ConcreteTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1285:1: ( rule__ConcreteTask__Group__4__Impl rule__ConcreteTask__Group__5 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1286:2: rule__ConcreteTask__Group__4__Impl rule__ConcreteTask__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__4__Impl_in_rule__ConcreteTask__Group__42544);
            rule__ConcreteTask__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__5_in_rule__ConcreteTask__Group__42547);
            rule__ConcreteTask__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__4"


    // $ANTLR start "rule__ConcreteTask__Group__4__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1293:1: rule__ConcreteTask__Group__4__Impl : ( ':' ) ;
    public final void rule__ConcreteTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1297:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1298:1: ( ':' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1298:1: ( ':' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1299:1: ':'
            {
             before(grammarAccess.getConcreteTaskAccess().getColonKeyword_4()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__ConcreteTask__Group__4__Impl2575); 
             after(grammarAccess.getConcreteTaskAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__4__Impl"


    // $ANTLR start "rule__ConcreteTask__Group__5"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1312:1: rule__ConcreteTask__Group__5 : rule__ConcreteTask__Group__5__Impl ;
    public final void rule__ConcreteTask__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1316:1: ( rule__ConcreteTask__Group__5__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1317:2: rule__ConcreteTask__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__Group__5__Impl_in_rule__ConcreteTask__Group__52606);
            rule__ConcreteTask__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__5"


    // $ANTLR start "rule__ConcreteTask__Group__5__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1323:1: rule__ConcreteTask__Group__5__Impl : ( ( rule__ConcreteTask__MinRequirementAssignment_5 ) ) ;
    public final void rule__ConcreteTask__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1327:1: ( ( ( rule__ConcreteTask__MinRequirementAssignment_5 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1328:1: ( ( rule__ConcreteTask__MinRequirementAssignment_5 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1328:1: ( ( rule__ConcreteTask__MinRequirementAssignment_5 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1329:1: ( rule__ConcreteTask__MinRequirementAssignment_5 )
            {
             before(grammarAccess.getConcreteTaskAccess().getMinRequirementAssignment_5()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1330:1: ( rule__ConcreteTask__MinRequirementAssignment_5 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1330:2: rule__ConcreteTask__MinRequirementAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteTask__MinRequirementAssignment_5_in_rule__ConcreteTask__Group__5__Impl2633);
            rule__ConcreteTask__MinRequirementAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConcreteTaskAccess().getMinRequirementAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__Group__5__Impl"


    // $ANTLR start "rule__TaskGroup__Group__0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1352:1: rule__TaskGroup__Group__0 : rule__TaskGroup__Group__0__Impl rule__TaskGroup__Group__1 ;
    public final void rule__TaskGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1356:1: ( rule__TaskGroup__Group__0__Impl rule__TaskGroup__Group__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1357:2: rule__TaskGroup__Group__0__Impl rule__TaskGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__0__Impl_in_rule__TaskGroup__Group__02675);
            rule__TaskGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__1_in_rule__TaskGroup__Group__02678);
            rule__TaskGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group__0"


    // $ANTLR start "rule__TaskGroup__Group__0__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1364:1: rule__TaskGroup__Group__0__Impl : ( ( rule__TaskGroup__NameAssignment_0 ) ) ;
    public final void rule__TaskGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1368:1: ( ( ( rule__TaskGroup__NameAssignment_0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1369:1: ( ( rule__TaskGroup__NameAssignment_0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1369:1: ( ( rule__TaskGroup__NameAssignment_0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1370:1: ( rule__TaskGroup__NameAssignment_0 )
            {
             before(grammarAccess.getTaskGroupAccess().getNameAssignment_0()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1371:1: ( rule__TaskGroup__NameAssignment_0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1371:2: rule__TaskGroup__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__NameAssignment_0_in_rule__TaskGroup__Group__0__Impl2705);
            rule__TaskGroup__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTaskGroupAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group__0__Impl"


    // $ANTLR start "rule__TaskGroup__Group__1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1381:1: rule__TaskGroup__Group__1 : rule__TaskGroup__Group__1__Impl rule__TaskGroup__Group__2 ;
    public final void rule__TaskGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1385:1: ( rule__TaskGroup__Group__1__Impl rule__TaskGroup__Group__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1386:2: rule__TaskGroup__Group__1__Impl rule__TaskGroup__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__1__Impl_in_rule__TaskGroup__Group__12735);
            rule__TaskGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__2_in_rule__TaskGroup__Group__12738);
            rule__TaskGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group__1"


    // $ANTLR start "rule__TaskGroup__Group__1__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1393:1: rule__TaskGroup__Group__1__Impl : ( '{' ) ;
    public final void rule__TaskGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1397:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1398:1: ( '{' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1398:1: ( '{' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1399:1: '{'
            {
             before(grammarAccess.getTaskGroupAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__TaskGroup__Group__1__Impl2766); 
             after(grammarAccess.getTaskGroupAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group__1__Impl"


    // $ANTLR start "rule__TaskGroup__Group__2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1412:1: rule__TaskGroup__Group__2 : rule__TaskGroup__Group__2__Impl rule__TaskGroup__Group__3 ;
    public final void rule__TaskGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1416:1: ( rule__TaskGroup__Group__2__Impl rule__TaskGroup__Group__3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1417:2: rule__TaskGroup__Group__2__Impl rule__TaskGroup__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__2__Impl_in_rule__TaskGroup__Group__22797);
            rule__TaskGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__3_in_rule__TaskGroup__Group__22800);
            rule__TaskGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group__2"


    // $ANTLR start "rule__TaskGroup__Group__2__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1424:1: rule__TaskGroup__Group__2__Impl : ( ( rule__TaskGroup__ContainsAssignment_2 ) ) ;
    public final void rule__TaskGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1428:1: ( ( ( rule__TaskGroup__ContainsAssignment_2 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1429:1: ( ( rule__TaskGroup__ContainsAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1429:1: ( ( rule__TaskGroup__ContainsAssignment_2 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1430:1: ( rule__TaskGroup__ContainsAssignment_2 )
            {
             before(grammarAccess.getTaskGroupAccess().getContainsAssignment_2()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1431:1: ( rule__TaskGroup__ContainsAssignment_2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1431:2: rule__TaskGroup__ContainsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__ContainsAssignment_2_in_rule__TaskGroup__Group__2__Impl2827);
            rule__TaskGroup__ContainsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskGroupAccess().getContainsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group__2__Impl"


    // $ANTLR start "rule__TaskGroup__Group__3"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1441:1: rule__TaskGroup__Group__3 : rule__TaskGroup__Group__3__Impl rule__TaskGroup__Group__4 ;
    public final void rule__TaskGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1445:1: ( rule__TaskGroup__Group__3__Impl rule__TaskGroup__Group__4 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1446:2: rule__TaskGroup__Group__3__Impl rule__TaskGroup__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__3__Impl_in_rule__TaskGroup__Group__32857);
            rule__TaskGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__4_in_rule__TaskGroup__Group__32860);
            rule__TaskGroup__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group__3"


    // $ANTLR start "rule__TaskGroup__Group__3__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1453:1: rule__TaskGroup__Group__3__Impl : ( ( rule__TaskGroup__Group_3__0 ) ) ;
    public final void rule__TaskGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1457:1: ( ( ( rule__TaskGroup__Group_3__0 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1458:1: ( ( rule__TaskGroup__Group_3__0 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1458:1: ( ( rule__TaskGroup__Group_3__0 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1459:1: ( rule__TaskGroup__Group_3__0 )
            {
             before(grammarAccess.getTaskGroupAccess().getGroup_3()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1460:1: ( rule__TaskGroup__Group_3__0 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1460:2: rule__TaskGroup__Group_3__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group_3__0_in_rule__TaskGroup__Group__3__Impl2887);
            rule__TaskGroup__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskGroupAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group__3__Impl"


    // $ANTLR start "rule__TaskGroup__Group__4"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1470:1: rule__TaskGroup__Group__4 : rule__TaskGroup__Group__4__Impl ;
    public final void rule__TaskGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1474:1: ( rule__TaskGroup__Group__4__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1475:2: rule__TaskGroup__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group__4__Impl_in_rule__TaskGroup__Group__42917);
            rule__TaskGroup__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group__4"


    // $ANTLR start "rule__TaskGroup__Group__4__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1481:1: rule__TaskGroup__Group__4__Impl : ( '}' ) ;
    public final void rule__TaskGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1485:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1486:1: ( '}' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1486:1: ( '}' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1487:1: '}'
            {
             before(grammarAccess.getTaskGroupAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TaskGroup__Group__4__Impl2945); 
             after(grammarAccess.getTaskGroupAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group__4__Impl"


    // $ANTLR start "rule__TaskGroup__Group_3__0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1510:1: rule__TaskGroup__Group_3__0 : rule__TaskGroup__Group_3__0__Impl rule__TaskGroup__Group_3__1 ;
    public final void rule__TaskGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1514:1: ( rule__TaskGroup__Group_3__0__Impl rule__TaskGroup__Group_3__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1515:2: rule__TaskGroup__Group_3__0__Impl rule__TaskGroup__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group_3__0__Impl_in_rule__TaskGroup__Group_3__02986);
            rule__TaskGroup__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group_3__1_in_rule__TaskGroup__Group_3__02989);
            rule__TaskGroup__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group_3__0"


    // $ANTLR start "rule__TaskGroup__Group_3__0__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1522:1: rule__TaskGroup__Group_3__0__Impl : ( '@all' ) ;
    public final void rule__TaskGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1526:1: ( ( '@all' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1527:1: ( '@all' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1527:1: ( '@all' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1528:1: '@all'
            {
             before(grammarAccess.getTaskGroupAccess().getAllKeyword_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TaskGroup__Group_3__0__Impl3017); 
             after(grammarAccess.getTaskGroupAccess().getAllKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group_3__0__Impl"


    // $ANTLR start "rule__TaskGroup__Group_3__1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1541:1: rule__TaskGroup__Group_3__1 : rule__TaskGroup__Group_3__1__Impl rule__TaskGroup__Group_3__2 ;
    public final void rule__TaskGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1545:1: ( rule__TaskGroup__Group_3__1__Impl rule__TaskGroup__Group_3__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1546:2: rule__TaskGroup__Group_3__1__Impl rule__TaskGroup__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group_3__1__Impl_in_rule__TaskGroup__Group_3__13048);
            rule__TaskGroup__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group_3__2_in_rule__TaskGroup__Group_3__13051);
            rule__TaskGroup__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group_3__1"


    // $ANTLR start "rule__TaskGroup__Group_3__1__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1553:1: rule__TaskGroup__Group_3__1__Impl : ( ':' ) ;
    public final void rule__TaskGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1557:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1558:1: ( ':' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1558:1: ( ':' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1559:1: ':'
            {
             before(grammarAccess.getTaskGroupAccess().getColonKeyword_3_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__TaskGroup__Group_3__1__Impl3079); 
             after(grammarAccess.getTaskGroupAccess().getColonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group_3__1__Impl"


    // $ANTLR start "rule__TaskGroup__Group_3__2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1572:1: rule__TaskGroup__Group_3__2 : rule__TaskGroup__Group_3__2__Impl ;
    public final void rule__TaskGroup__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1576:1: ( rule__TaskGroup__Group_3__2__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1577:2: rule__TaskGroup__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__Group_3__2__Impl_in_rule__TaskGroup__Group_3__23110);
            rule__TaskGroup__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group_3__2"


    // $ANTLR start "rule__TaskGroup__Group_3__2__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1583:1: rule__TaskGroup__Group_3__2__Impl : ( ( rule__TaskGroup__MinRequirementAssignment_3_2 ) ) ;
    public final void rule__TaskGroup__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1587:1: ( ( ( rule__TaskGroup__MinRequirementAssignment_3_2 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1588:1: ( ( rule__TaskGroup__MinRequirementAssignment_3_2 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1588:1: ( ( rule__TaskGroup__MinRequirementAssignment_3_2 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1589:1: ( rule__TaskGroup__MinRequirementAssignment_3_2 )
            {
             before(grammarAccess.getTaskGroupAccess().getMinRequirementAssignment_3_2()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1590:1: ( rule__TaskGroup__MinRequirementAssignment_3_2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1590:2: rule__TaskGroup__MinRequirementAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskGroup__MinRequirementAssignment_3_2_in_rule__TaskGroup__Group_3__2__Impl3137);
            rule__TaskGroup__MinRequirementAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskGroupAccess().getMinRequirementAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__Group_3__2__Impl"


    // $ANTLR start "rule__MinRequirement__Group__0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1606:1: rule__MinRequirement__Group__0 : rule__MinRequirement__Group__0__Impl rule__MinRequirement__Group__1 ;
    public final void rule__MinRequirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1610:1: ( rule__MinRequirement__Group__0__Impl rule__MinRequirement__Group__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1611:2: rule__MinRequirement__Group__0__Impl rule__MinRequirement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__Group__0__Impl_in_rule__MinRequirement__Group__03173);
            rule__MinRequirement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__Group__1_in_rule__MinRequirement__Group__03176);
            rule__MinRequirement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinRequirement__Group__0"


    // $ANTLR start "rule__MinRequirement__Group__0__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1618:1: rule__MinRequirement__Group__0__Impl : ( 'min' ) ;
    public final void rule__MinRequirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1622:1: ( ( 'min' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1623:1: ( 'min' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1623:1: ( 'min' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1624:1: 'min'
            {
             before(grammarAccess.getMinRequirementAccess().getMinKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MinRequirement__Group__0__Impl3204); 
             after(grammarAccess.getMinRequirementAccess().getMinKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinRequirement__Group__0__Impl"


    // $ANTLR start "rule__MinRequirement__Group__1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1637:1: rule__MinRequirement__Group__1 : rule__MinRequirement__Group__1__Impl rule__MinRequirement__Group__2 ;
    public final void rule__MinRequirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1641:1: ( rule__MinRequirement__Group__1__Impl rule__MinRequirement__Group__2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1642:2: rule__MinRequirement__Group__1__Impl rule__MinRequirement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__Group__1__Impl_in_rule__MinRequirement__Group__13235);
            rule__MinRequirement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__Group__2_in_rule__MinRequirement__Group__13238);
            rule__MinRequirement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinRequirement__Group__1"


    // $ANTLR start "rule__MinRequirement__Group__1__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1649:1: rule__MinRequirement__Group__1__Impl : ( ( rule__MinRequirement__ValueAssignment_1 ) ) ;
    public final void rule__MinRequirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1653:1: ( ( ( rule__MinRequirement__ValueAssignment_1 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1654:1: ( ( rule__MinRequirement__ValueAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1654:1: ( ( rule__MinRequirement__ValueAssignment_1 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1655:1: ( rule__MinRequirement__ValueAssignment_1 )
            {
             before(grammarAccess.getMinRequirementAccess().getValueAssignment_1()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1656:1: ( rule__MinRequirement__ValueAssignment_1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1656:2: rule__MinRequirement__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__ValueAssignment_1_in_rule__MinRequirement__Group__1__Impl3265);
            rule__MinRequirement__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMinRequirementAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinRequirement__Group__1__Impl"


    // $ANTLR start "rule__MinRequirement__Group__2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1666:1: rule__MinRequirement__Group__2 : rule__MinRequirement__Group__2__Impl rule__MinRequirement__Group__3 ;
    public final void rule__MinRequirement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1670:1: ( rule__MinRequirement__Group__2__Impl rule__MinRequirement__Group__3 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1671:2: rule__MinRequirement__Group__2__Impl rule__MinRequirement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__Group__2__Impl_in_rule__MinRequirement__Group__23295);
            rule__MinRequirement__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__Group__3_in_rule__MinRequirement__Group__23298);
            rule__MinRequirement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinRequirement__Group__2"


    // $ANTLR start "rule__MinRequirement__Group__2__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1678:1: rule__MinRequirement__Group__2__Impl : ( ( rule__MinRequirement__TypeAssignment_2 ) ) ;
    public final void rule__MinRequirement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1682:1: ( ( ( rule__MinRequirement__TypeAssignment_2 ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1683:1: ( ( rule__MinRequirement__TypeAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1683:1: ( ( rule__MinRequirement__TypeAssignment_2 ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1684:1: ( rule__MinRequirement__TypeAssignment_2 )
            {
             before(grammarAccess.getMinRequirementAccess().getTypeAssignment_2()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1685:1: ( rule__MinRequirement__TypeAssignment_2 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1685:2: rule__MinRequirement__TypeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__TypeAssignment_2_in_rule__MinRequirement__Group__2__Impl3325);
            rule__MinRequirement__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMinRequirementAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinRequirement__Group__2__Impl"


    // $ANTLR start "rule__MinRequirement__Group__3"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1695:1: rule__MinRequirement__Group__3 : rule__MinRequirement__Group__3__Impl ;
    public final void rule__MinRequirement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1699:1: ( rule__MinRequirement__Group__3__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1700:2: rule__MinRequirement__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MinRequirement__Group__3__Impl_in_rule__MinRequirement__Group__33355);
            rule__MinRequirement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinRequirement__Group__3"


    // $ANTLR start "rule__MinRequirement__Group__3__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1706:1: rule__MinRequirement__Group__3__Impl : ( ';' ) ;
    public final void rule__MinRequirement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1710:1: ( ( ';' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1711:1: ( ';' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1711:1: ( ';' )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1712:1: ';'
            {
             before(grammarAccess.getMinRequirementAccess().getSemicolonKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__MinRequirement__Group__3__Impl3383); 
             after(grammarAccess.getMinRequirementAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinRequirement__Group__3__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1733:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1737:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1738:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03422);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03425);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1745:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1749:1: ( ( ( '-' )? ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1750:1: ( ( '-' )? )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1750:1: ( ( '-' )? )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1751:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1752:1: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1753:2: '-'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__EInt__Group__0__Impl3454); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1764:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1768:1: ( rule__EInt__Group__1__Impl )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1769:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13487);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1775:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1779:1: ( ( RULE_INT ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1780:1: ( RULE_INT )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1780:1: ( RULE_INT )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1781:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3514); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__GradingSystem__CoursesAssignment"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1797:1: rule__GradingSystem__CoursesAssignment : ( ruleCourse ) ;
    public final void rule__GradingSystem__CoursesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1801:1: ( ( ruleCourse ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1802:1: ( ruleCourse )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1802:1: ( ruleCourse )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1803:1: ruleCourse
            {
             before(grammarAccess.getGradingSystemAccess().getCoursesCourseParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourse_in_rule__GradingSystem__CoursesAssignment3552);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getGradingSystemAccess().getCoursesCourseParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingSystem__CoursesAssignment"


    // $ANTLR start "rule__Course__NameAssignment_1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1812:1: rule__Course__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Course__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1816:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1817:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1817:1: ( RULE_ID )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1818:1: RULE_ID
            {
             before(grammarAccess.getCourseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Course__NameAssignment_13583); 
             after(grammarAccess.getCourseAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__NameAssignment_1"


    // $ANTLR start "rule__Course__GradingsAssignment_3"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1827:1: rule__Course__GradingsAssignment_3 : ( ruleGrading ) ;
    public final void rule__Course__GradingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1831:1: ( ( ruleGrading ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1832:1: ( ruleGrading )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1832:1: ( ruleGrading )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1833:1: ruleGrading
            {
             before(grammarAccess.getCourseAccess().getGradingsGradingParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrading_in_rule__Course__GradingsAssignment_33614);
            ruleGrading();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getGradingsGradingParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__GradingsAssignment_3"


    // $ANTLR start "rule__Grading__SemesterAssignment_1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1842:1: rule__Grading__SemesterAssignment_1 : ( ruleEString ) ;
    public final void rule__Grading__SemesterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1846:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1847:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1847:1: ( ruleEString )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1848:1: ruleEString
            {
             before(grammarAccess.getGradingAccess().getSemesterEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Grading__SemesterAssignment_13645);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGradingAccess().getSemesterEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__SemesterAssignment_1"


    // $ANTLR start "rule__Grading__GradingSchemeAssignment_3"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1857:1: rule__Grading__GradingSchemeAssignment_3 : ( ruleGradingScheme ) ;
    public final void rule__Grading__GradingSchemeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1861:1: ( ( ruleGradingScheme ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1862:1: ( ruleGradingScheme )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1862:1: ( ruleGradingScheme )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1863:1: ruleGradingScheme
            {
             before(grammarAccess.getGradingAccess().getGradingSchemeGradingSchemeParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGradingScheme_in_rule__Grading__GradingSchemeAssignment_33676);
            ruleGradingScheme();

            state._fsp--;

             after(grammarAccess.getGradingAccess().getGradingSchemeGradingSchemeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__GradingSchemeAssignment_3"


    // $ANTLR start "rule__Grading__TasksAssignment_4"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1872:1: rule__Grading__TasksAssignment_4 : ( ruleTask ) ;
    public final void rule__Grading__TasksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1876:1: ( ( ruleTask ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1877:1: ( ruleTask )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1877:1: ( ruleTask )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1878:1: ruleTask
            {
             before(grammarAccess.getGradingAccess().getTasksTaskParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTask_in_rule__Grading__TasksAssignment_43707);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getGradingAccess().getTasksTaskParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grading__TasksAssignment_4"


    // $ANTLR start "rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1887:1: rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1891:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1892:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1892:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1893:1: ( RULE_ID )
            {
             before(grammarAccess.getGradingSchemeAccess().getMinRequirementNotFulfilledGradeGradeCrossReference_2_0()); 
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1894:1: ( RULE_ID )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1895:1: RULE_ID
            {
             before(grammarAccess.getGradingSchemeAccess().getMinRequirementNotFulfilledGradeGradeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_23742); 
             after(grammarAccess.getGradingSchemeAccess().getMinRequirementNotFulfilledGradeGradeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getGradingSchemeAccess().getMinRequirementNotFulfilledGradeGradeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2"


    // $ANTLR start "rule__GradingScheme__GradesAssignment_5"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1906:1: rule__GradingScheme__GradesAssignment_5 : ( ruleGrade ) ;
    public final void rule__GradingScheme__GradesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1910:1: ( ( ruleGrade ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1911:1: ( ruleGrade )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1911:1: ( ruleGrade )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1912:1: ruleGrade
            {
             before(grammarAccess.getGradingSchemeAccess().getGradesGradeParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrade_in_rule__GradingScheme__GradesAssignment_53777);
            ruleGrade();

            state._fsp--;

             after(grammarAccess.getGradingSchemeAccess().getGradesGradeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradingScheme__GradesAssignment_5"


    // $ANTLR start "rule__Grade__NameAssignment_0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1921:1: rule__Grade__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Grade__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1925:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1926:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1926:1: ( ruleEString )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1927:1: ruleEString
            {
             before(grammarAccess.getGradeAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Grade__NameAssignment_03808);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGradeAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grade__NameAssignment_0"


    // $ANTLR start "rule__Grade__RequiredPointsAssignment_2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1936:1: rule__Grade__RequiredPointsAssignment_2 : ( ruleEInt ) ;
    public final void rule__Grade__RequiredPointsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1940:1: ( ( ruleEInt ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1941:1: ( ruleEInt )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1941:1: ( ruleEInt )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1942:1: ruleEInt
            {
             before(grammarAccess.getGradeAccess().getRequiredPointsEIntParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Grade__RequiredPointsAssignment_23839);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getGradeAccess().getRequiredPointsEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grade__RequiredPointsAssignment_2"


    // $ANTLR start "rule__ConcreteTask__NameAssignment_0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1951:1: rule__ConcreteTask__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ConcreteTask__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1955:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1956:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1956:1: ( ruleEString )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1957:1: ruleEString
            {
             before(grammarAccess.getConcreteTaskAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConcreteTask__NameAssignment_03870);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConcreteTaskAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__NameAssignment_0"


    // $ANTLR start "rule__ConcreteTask__MaxPointsAssignment_2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1966:1: rule__ConcreteTask__MaxPointsAssignment_2 : ( ruleEInt ) ;
    public final void rule__ConcreteTask__MaxPointsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1970:1: ( ( ruleEInt ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1971:1: ( ruleEInt )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1971:1: ( ruleEInt )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1972:1: ruleEInt
            {
             before(grammarAccess.getConcreteTaskAccess().getMaxPointsEIntParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__ConcreteTask__MaxPointsAssignment_23901);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getConcreteTaskAccess().getMaxPointsEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__MaxPointsAssignment_2"


    // $ANTLR start "rule__ConcreteTask__MinRequirementAssignment_5"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1981:1: rule__ConcreteTask__MinRequirementAssignment_5 : ( ruleMinRequirement ) ;
    public final void rule__ConcreteTask__MinRequirementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1985:1: ( ( ruleMinRequirement ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1986:1: ( ruleMinRequirement )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1986:1: ( ruleMinRequirement )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1987:1: ruleMinRequirement
            {
             before(grammarAccess.getConcreteTaskAccess().getMinRequirementMinRequirementParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMinRequirement_in_rule__ConcreteTask__MinRequirementAssignment_53932);
            ruleMinRequirement();

            state._fsp--;

             after(grammarAccess.getConcreteTaskAccess().getMinRequirementMinRequirementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteTask__MinRequirementAssignment_5"


    // $ANTLR start "rule__TaskGroup__NameAssignment_0"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:1996:1: rule__TaskGroup__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__TaskGroup__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2000:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2001:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2001:1: ( ruleEString )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2002:1: ruleEString
            {
             before(grammarAccess.getTaskGroupAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TaskGroup__NameAssignment_03963);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTaskGroupAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__NameAssignment_0"


    // $ANTLR start "rule__TaskGroup__ContainsAssignment_2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2011:1: rule__TaskGroup__ContainsAssignment_2 : ( ruleTask ) ;
    public final void rule__TaskGroup__ContainsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2015:1: ( ( ruleTask ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2016:1: ( ruleTask )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2016:1: ( ruleTask )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2017:1: ruleTask
            {
             before(grammarAccess.getTaskGroupAccess().getContainsTaskParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTask_in_rule__TaskGroup__ContainsAssignment_23994);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskGroupAccess().getContainsTaskParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__ContainsAssignment_2"


    // $ANTLR start "rule__TaskGroup__MinRequirementAssignment_3_2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2026:1: rule__TaskGroup__MinRequirementAssignment_3_2 : ( ruleMinRequirement ) ;
    public final void rule__TaskGroup__MinRequirementAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2030:1: ( ( ruleMinRequirement ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2031:1: ( ruleMinRequirement )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2031:1: ( ruleMinRequirement )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2032:1: ruleMinRequirement
            {
             before(grammarAccess.getTaskGroupAccess().getMinRequirementMinRequirementParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMinRequirement_in_rule__TaskGroup__MinRequirementAssignment_3_24025);
            ruleMinRequirement();

            state._fsp--;

             after(grammarAccess.getTaskGroupAccess().getMinRequirementMinRequirementParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskGroup__MinRequirementAssignment_3_2"


    // $ANTLR start "rule__MinRequirement__ValueAssignment_1"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2041:1: rule__MinRequirement__ValueAssignment_1 : ( ruleEInt ) ;
    public final void rule__MinRequirement__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2045:1: ( ( ruleEInt ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2046:1: ( ruleEInt )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2046:1: ( ruleEInt )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2047:1: ruleEInt
            {
             before(grammarAccess.getMinRequirementAccess().getValueEIntParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__MinRequirement__ValueAssignment_14056);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMinRequirementAccess().getValueEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinRequirement__ValueAssignment_1"


    // $ANTLR start "rule__MinRequirement__TypeAssignment_2"
    // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2056:1: rule__MinRequirement__TypeAssignment_2 : ( ruleMinRequirementsType ) ;
    public final void rule__MinRequirement__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2060:1: ( ( ruleMinRequirementsType ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2061:1: ( ruleMinRequirementsType )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2061:1: ( ruleMinRequirementsType )
            // ../at.ac.tuwien.big.me12.GSMLDsl.ui/src-gen/at/ac/tuwien/big/me12/ui/contentassist/antlr/internal/InternalGSMLDsl.g:2062:1: ruleMinRequirementsType
            {
             before(grammarAccess.getMinRequirementAccess().getTypeMinRequirementsTypeEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMinRequirementsType_in_rule__MinRequirement__TypeAssignment_24087);
            ruleMinRequirementsType();

            state._fsp--;

             after(grammarAccess.getMinRequirementAccess().getTypeMinRequirementsTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinRequirement__TypeAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleGradingSystem_in_entryRuleGradingSystem61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGradingSystem68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingSystem__CoursesAssignment_in_ruleGradingSystem94 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleCourse_in_entryRuleCourse122 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCourse129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__0_in_ruleCourse155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrading_in_entryRuleGrading182 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGrading189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__Group__0_in_ruleGrading215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGradingScheme_in_entryRuleGradingScheme242 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGradingScheme249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__0_in_ruleGradingScheme275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrade_in_entryRuleGrade302 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGrade309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grade__Group__0_in_ruleGrade335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTask_in_entryRuleTask362 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTask369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Task__Alternatives_in_ruleTask395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteTask_in_entryRuleConcreteTask422 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConcreteTask429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__0_in_ruleConcreteTask455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskGroup_in_entryRuleTaskGroup482 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTaskGroup489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__0_in_ruleTaskGroup515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMinRequirement_in_entryRuleMinRequirement542 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMinRequirement549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MinRequirement__Group__0_in_ruleMinRequirement575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString602 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt662 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MinRequirementsType__Alternatives_in_ruleMinRequirementsType732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteTask_in_rule__Task__Alternatives767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskGroup_in_rule__Task__Alternatives784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__MinRequirementsType__Alternatives866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MinRequirementsType__Alternatives887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__0__Impl_in_rule__Course__Group__0920 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Course__Group__1_in_rule__Course__Group__0923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Course__Group__0__Impl951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__1__Impl_in_rule__Course__Group__1982 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Course__Group__2_in_rule__Course__Group__1985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__NameAssignment_1_in_rule__Course__Group__1__Impl1012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__2__Impl_in_rule__Course__Group__21042 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__Course__Group__3_in_rule__Course__Group__21045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Course__Group__2__Impl1073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__3__Impl_in_rule__Course__Group__31104 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__Course__Group__4_in_rule__Course__Group__31107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__GradingsAssignment_3_in_rule__Course__Group__3__Impl1134 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Course__Group__4__Impl_in_rule__Course__Group__41165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Course__Group__4__Impl1193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__Group__0__Impl_in_rule__Grading__Group__01234 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Grading__Group__1_in_rule__Grading__Group__01237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Grading__Group__0__Impl1265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__Group__1__Impl_in_rule__Grading__Group__11296 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Grading__Group__2_in_rule__Grading__Group__11299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__SemesterAssignment_1_in_rule__Grading__Group__1__Impl1326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__Group__2__Impl_in_rule__Grading__Group__21356 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Grading__Group__3_in_rule__Grading__Group__21359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Grading__Group__2__Impl1387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__Group__3__Impl_in_rule__Grading__Group__31418 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Grading__Group__4_in_rule__Grading__Group__31421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__GradingSchemeAssignment_3_in_rule__Grading__Group__3__Impl1448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__Group__4__Impl_in_rule__Grading__Group__41478 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Grading__Group__5_in_rule__Grading__Group__41481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__TasksAssignment_4_in_rule__Grading__Group__4__Impl1508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grading__Group__5__Impl_in_rule__Grading__Group__51538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Grading__Group__5__Impl1566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__0__Impl_in_rule__GradingScheme__Group__01609 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__1_in_rule__GradingScheme__Group__01612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__GradingScheme__Group__0__Impl1640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__1__Impl_in_rule__GradingScheme__Group__11671 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__2_in_rule__GradingScheme__Group__11674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__GradingScheme__Group__1__Impl1702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__2__Impl_in_rule__GradingScheme__Group__21733 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__3_in_rule__GradingScheme__Group__21736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_2_in_rule__GradingScheme__Group__2__Impl1763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__3__Impl_in_rule__GradingScheme__Group__31793 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__4_in_rule__GradingScheme__Group__31796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__GradingScheme__Group__3__Impl1824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__4__Impl_in_rule__GradingScheme__Group__41855 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__5_in_rule__GradingScheme__Group__41858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__GradingScheme__Group__4__Impl1886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__5__Impl_in_rule__GradingScheme__Group__51917 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__6_in_rule__GradingScheme__Group__51920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GradingScheme__GradesAssignment_5_in_rule__GradingScheme__Group__5__Impl1947 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__GradingScheme__Group__6__Impl_in_rule__GradingScheme__Group__61978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__GradingScheme__Group__6__Impl2006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grade__Group__0__Impl_in_rule__Grade__Group__02051 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Grade__Group__1_in_rule__Grade__Group__02054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grade__NameAssignment_0_in_rule__Grade__Group__0__Impl2081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grade__Group__1__Impl_in_rule__Grade__Group__12111 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_rule__Grade__Group__2_in_rule__Grade__Group__12114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Grade__Group__1__Impl2142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grade__Group__2__Impl_in_rule__Grade__Group__22173 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Grade__Group__3_in_rule__Grade__Group__22176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grade__RequiredPointsAssignment_2_in_rule__Grade__Group__2__Impl2203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Grade__Group__3__Impl_in_rule__Grade__Group__32233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Grade__Group__3__Impl2261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__0__Impl_in_rule__ConcreteTask__Group__02300 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__1_in_rule__ConcreteTask__Group__02303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__NameAssignment_0_in_rule__ConcreteTask__Group__0__Impl2330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__1__Impl_in_rule__ConcreteTask__Group__12360 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__2_in_rule__ConcreteTask__Group__12363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ConcreteTask__Group__1__Impl2391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__2__Impl_in_rule__ConcreteTask__Group__22422 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__3_in_rule__ConcreteTask__Group__22425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__MaxPointsAssignment_2_in_rule__ConcreteTask__Group__2__Impl2452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__3__Impl_in_rule__ConcreteTask__Group__32482 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__4_in_rule__ConcreteTask__Group__32485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ConcreteTask__Group__3__Impl2513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__4__Impl_in_rule__ConcreteTask__Group__42544 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__5_in_rule__ConcreteTask__Group__42547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ConcreteTask__Group__4__Impl2575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__Group__5__Impl_in_rule__ConcreteTask__Group__52606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteTask__MinRequirementAssignment_5_in_rule__ConcreteTask__Group__5__Impl2633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__0__Impl_in_rule__TaskGroup__Group__02675 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__1_in_rule__TaskGroup__Group__02678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__NameAssignment_0_in_rule__TaskGroup__Group__0__Impl2705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__1__Impl_in_rule__TaskGroup__Group__12735 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__2_in_rule__TaskGroup__Group__12738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TaskGroup__Group__1__Impl2766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__2__Impl_in_rule__TaskGroup__Group__22797 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__3_in_rule__TaskGroup__Group__22800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__ContainsAssignment_2_in_rule__TaskGroup__Group__2__Impl2827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__3__Impl_in_rule__TaskGroup__Group__32857 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__4_in_rule__TaskGroup__Group__32860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group_3__0_in_rule__TaskGroup__Group__3__Impl2887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group__4__Impl_in_rule__TaskGroup__Group__42917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TaskGroup__Group__4__Impl2945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group_3__0__Impl_in_rule__TaskGroup__Group_3__02986 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group_3__1_in_rule__TaskGroup__Group_3__02989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TaskGroup__Group_3__0__Impl3017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group_3__1__Impl_in_rule__TaskGroup__Group_3__13048 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group_3__2_in_rule__TaskGroup__Group_3__13051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__TaskGroup__Group_3__1__Impl3079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__Group_3__2__Impl_in_rule__TaskGroup__Group_3__23110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskGroup__MinRequirementAssignment_3_2_in_rule__TaskGroup__Group_3__2__Impl3137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MinRequirement__Group__0__Impl_in_rule__MinRequirement__Group__03173 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_rule__MinRequirement__Group__1_in_rule__MinRequirement__Group__03176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MinRequirement__Group__0__Impl3204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MinRequirement__Group__1__Impl_in_rule__MinRequirement__Group__13235 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__MinRequirement__Group__2_in_rule__MinRequirement__Group__13238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MinRequirement__ValueAssignment_1_in_rule__MinRequirement__Group__1__Impl3265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MinRequirement__Group__2__Impl_in_rule__MinRequirement__Group__23295 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__MinRequirement__Group__3_in_rule__MinRequirement__Group__23298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MinRequirement__TypeAssignment_2_in_rule__MinRequirement__Group__2__Impl3325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MinRequirement__Group__3__Impl_in_rule__MinRequirement__Group__33355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MinRequirement__Group__3__Impl3383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03422 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__EInt__Group__0__Impl3454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourse_in_rule__GradingSystem__CoursesAssignment3552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Course__NameAssignment_13583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrading_in_rule__Course__GradingsAssignment_33614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Grading__SemesterAssignment_13645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGradingScheme_in_rule__Grading__GradingSchemeAssignment_33676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTask_in_rule__Grading__TasksAssignment_43707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__GradingScheme__MinRequirementNotFulfilledGradeAssignment_23742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrade_in_rule__GradingScheme__GradesAssignment_53777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Grade__NameAssignment_03808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Grade__RequiredPointsAssignment_23839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConcreteTask__NameAssignment_03870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__ConcreteTask__MaxPointsAssignment_23901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMinRequirement_in_rule__ConcreteTask__MinRequirementAssignment_53932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TaskGroup__NameAssignment_03963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTask_in_rule__TaskGroup__ContainsAssignment_23994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMinRequirement_in_rule__TaskGroup__MinRequirementAssignment_3_24025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__MinRequirement__ValueAssignment_14056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMinRequirementsType_in_rule__MinRequirement__TypeAssignment_24087 = new BitSet(new long[]{0x0000000000000002L});
    }


}