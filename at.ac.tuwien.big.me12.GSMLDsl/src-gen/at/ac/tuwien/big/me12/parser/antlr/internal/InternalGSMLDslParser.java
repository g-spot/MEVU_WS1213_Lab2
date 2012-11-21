package at.ac.tuwien.big.me12.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.tuwien.big.me12.services.GSMLDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGSMLDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'course'", "'{'", "'}'", "'semester'", "'grading scheme'", "'('", "')'", "':'", "';'", "'@all'", "'min'", "'-'", "'%'", "'point(s)'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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
    public String getGrammarFileName() { return "../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g"; }



     	private GSMLDslGrammarAccess grammarAccess;
     	
        public InternalGSMLDslParser(TokenStream input, GSMLDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "GradingSystem";	
       	}
       	
       	@Override
       	protected GSMLDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleGradingSystem"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:68:1: entryRuleGradingSystem returns [EObject current=null] : iv_ruleGradingSystem= ruleGradingSystem EOF ;
    public final EObject entryRuleGradingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGradingSystem = null;


        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:69:2: (iv_ruleGradingSystem= ruleGradingSystem EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:70:2: iv_ruleGradingSystem= ruleGradingSystem EOF
            {
             newCompositeNode(grammarAccess.getGradingSystemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGradingSystem_in_entryRuleGradingSystem75);
            iv_ruleGradingSystem=ruleGradingSystem();

            state._fsp--;

             current =iv_ruleGradingSystem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGradingSystem85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGradingSystem"


    // $ANTLR start "ruleGradingSystem"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:77:1: ruleGradingSystem returns [EObject current=null] : ( (lv_courses_0_0= ruleCourse ) )* ;
    public final EObject ruleGradingSystem() throws RecognitionException {
        EObject current = null;

        EObject lv_courses_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:80:28: ( ( (lv_courses_0_0= ruleCourse ) )* )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:81:1: ( (lv_courses_0_0= ruleCourse ) )*
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:81:1: ( (lv_courses_0_0= ruleCourse ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:82:1: (lv_courses_0_0= ruleCourse )
            	    {
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:82:1: (lv_courses_0_0= ruleCourse )
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:83:3: lv_courses_0_0= ruleCourse
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGradingSystemAccess().getCoursesCourseParserRuleCall_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCourse_in_ruleGradingSystem130);
            	    lv_courses_0_0=ruleCourse();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGradingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"courses",
            	            		lv_courses_0_0, 
            	            		"Course");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGradingSystem"


    // $ANTLR start "entryRuleCourse"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:107:1: entryRuleCourse returns [EObject current=null] : iv_ruleCourse= ruleCourse EOF ;
    public final EObject entryRuleCourse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCourse = null;


        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:108:2: (iv_ruleCourse= ruleCourse EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:109:2: iv_ruleCourse= ruleCourse EOF
            {
             newCompositeNode(grammarAccess.getCourseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourse_in_entryRuleCourse166);
            iv_ruleCourse=ruleCourse();

            state._fsp--;

             current =iv_ruleCourse; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCourse176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCourse"


    // $ANTLR start "ruleCourse"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:116:1: ruleCourse returns [EObject current=null] : (otherlv_0= 'course' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_gradings_3_0= ruleGrading ) )* otherlv_4= '}' ) ;
    public final EObject ruleCourse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_gradings_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:119:28: ( (otherlv_0= 'course' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_gradings_3_0= ruleGrading ) )* otherlv_4= '}' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:120:1: (otherlv_0= 'course' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_gradings_3_0= ruleGrading ) )* otherlv_4= '}' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:120:1: (otherlv_0= 'course' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_gradings_3_0= ruleGrading ) )* otherlv_4= '}' )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:120:3: otherlv_0= 'course' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_gradings_3_0= ruleGrading ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCourse213); 

                	newLeafNode(otherlv_0, grammarAccess.getCourseAccess().getCourseKeyword_0());
                
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:124:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:125:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:125:1: (lv_name_1_0= RULE_ID )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:126:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCourse230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCourseAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCourseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCourse247); 

                	newLeafNode(otherlv_2, grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:146:1: ( (lv_gradings_3_0= ruleGrading ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:147:1: (lv_gradings_3_0= ruleGrading )
            	    {
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:147:1: (lv_gradings_3_0= ruleGrading )
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:148:3: lv_gradings_3_0= ruleGrading
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCourseAccess().getGradingsGradingParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleGrading_in_ruleCourse268);
            	    lv_gradings_3_0=ruleGrading();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCourseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"gradings",
            	            		lv_gradings_3_0, 
            	            		"Grading");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCourse281); 

                	newLeafNode(otherlv_4, grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCourse"


    // $ANTLR start "entryRuleGrading"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:176:1: entryRuleGrading returns [EObject current=null] : iv_ruleGrading= ruleGrading EOF ;
    public final EObject entryRuleGrading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrading = null;


        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:177:2: (iv_ruleGrading= ruleGrading EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:178:2: iv_ruleGrading= ruleGrading EOF
            {
             newCompositeNode(grammarAccess.getGradingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrading_in_entryRuleGrading317);
            iv_ruleGrading=ruleGrading();

            state._fsp--;

             current =iv_ruleGrading; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGrading327); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrading"


    // $ANTLR start "ruleGrading"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:185:1: ruleGrading returns [EObject current=null] : (otherlv_0= 'semester' ( (lv_semester_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_gradingScheme_3_0= ruleGradingScheme ) ) ( (lv_tasks_4_0= ruleTask ) ) otherlv_5= '}' ) ;
    public final EObject ruleGrading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_semester_1_0 = null;

        EObject lv_gradingScheme_3_0 = null;

        EObject lv_tasks_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:188:28: ( (otherlv_0= 'semester' ( (lv_semester_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_gradingScheme_3_0= ruleGradingScheme ) ) ( (lv_tasks_4_0= ruleTask ) ) otherlv_5= '}' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:189:1: (otherlv_0= 'semester' ( (lv_semester_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_gradingScheme_3_0= ruleGradingScheme ) ) ( (lv_tasks_4_0= ruleTask ) ) otherlv_5= '}' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:189:1: (otherlv_0= 'semester' ( (lv_semester_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_gradingScheme_3_0= ruleGradingScheme ) ) ( (lv_tasks_4_0= ruleTask ) ) otherlv_5= '}' )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:189:3: otherlv_0= 'semester' ( (lv_semester_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_gradingScheme_3_0= ruleGradingScheme ) ) ( (lv_tasks_4_0= ruleTask ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGrading364); 

                	newLeafNode(otherlv_0, grammarAccess.getGradingAccess().getSemesterKeyword_0());
                
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:193:1: ( (lv_semester_1_0= ruleEString ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:194:1: (lv_semester_1_0= ruleEString )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:194:1: (lv_semester_1_0= ruleEString )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:195:3: lv_semester_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGradingAccess().getSemesterEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGrading385);
            lv_semester_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGradingRule());
            	        }
                   		set(
                   			current, 
                   			"semester",
                    		lv_semester_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGrading397); 

                	newLeafNode(otherlv_2, grammarAccess.getGradingAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:215:1: ( (lv_gradingScheme_3_0= ruleGradingScheme ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:216:1: (lv_gradingScheme_3_0= ruleGradingScheme )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:216:1: (lv_gradingScheme_3_0= ruleGradingScheme )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:217:3: lv_gradingScheme_3_0= ruleGradingScheme
            {
             
            	        newCompositeNode(grammarAccess.getGradingAccess().getGradingSchemeGradingSchemeParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleGradingScheme_in_ruleGrading418);
            lv_gradingScheme_3_0=ruleGradingScheme();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGradingRule());
            	        }
                   		set(
                   			current, 
                   			"gradingScheme",
                    		lv_gradingScheme_3_0, 
                    		"GradingScheme");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:233:2: ( (lv_tasks_4_0= ruleTask ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:234:1: (lv_tasks_4_0= ruleTask )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:234:1: (lv_tasks_4_0= ruleTask )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:235:3: lv_tasks_4_0= ruleTask
            {
             
            	        newCompositeNode(grammarAccess.getGradingAccess().getTasksTaskParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTask_in_ruleGrading439);
            lv_tasks_4_0=ruleTask();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGradingRule());
            	        }
                   		add(
                   			current, 
                   			"tasks",
                    		lv_tasks_4_0, 
                    		"Task");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGrading451); 

                	newLeafNode(otherlv_5, grammarAccess.getGradingAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrading"


    // $ANTLR start "entryRuleGradingScheme"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:263:1: entryRuleGradingScheme returns [EObject current=null] : iv_ruleGradingScheme= ruleGradingScheme EOF ;
    public final EObject entryRuleGradingScheme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGradingScheme = null;


        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:264:2: (iv_ruleGradingScheme= ruleGradingScheme EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:265:2: iv_ruleGradingScheme= ruleGradingScheme EOF
            {
             newCompositeNode(grammarAccess.getGradingSchemeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGradingScheme_in_entryRuleGradingScheme487);
            iv_ruleGradingScheme=ruleGradingScheme();

            state._fsp--;

             current =iv_ruleGradingScheme; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGradingScheme497); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGradingScheme"


    // $ANTLR start "ruleGradingScheme"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:272:1: ruleGradingScheme returns [EObject current=null] : (otherlv_0= 'grading scheme' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_grades_5_0= ruleGrade ) )* otherlv_6= '}' ) ;
    public final EObject ruleGradingScheme() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_grades_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:275:28: ( (otherlv_0= 'grading scheme' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_grades_5_0= ruleGrade ) )* otherlv_6= '}' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:276:1: (otherlv_0= 'grading scheme' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_grades_5_0= ruleGrade ) )* otherlv_6= '}' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:276:1: (otherlv_0= 'grading scheme' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_grades_5_0= ruleGrade ) )* otherlv_6= '}' )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:276:3: otherlv_0= 'grading scheme' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_grades_5_0= ruleGrade ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGradingScheme534); 

                	newLeafNode(otherlv_0, grammarAccess.getGradingSchemeAccess().getGradingSchemeKeyword_0());
                
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGradingScheme546); 

                	newLeafNode(otherlv_1, grammarAccess.getGradingSchemeAccess().getLeftParenthesisKeyword_1());
                
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:284:1: ( (otherlv_2= RULE_ID ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:285:1: (otherlv_2= RULE_ID )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:285:1: (otherlv_2= RULE_ID )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:286:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGradingSchemeRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGradingScheme566); 

            		newLeafNode(otherlv_2, grammarAccess.getGradingSchemeAccess().getMinRequirementNotFulfilledGradeGradeCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGradingScheme578); 

                	newLeafNode(otherlv_3, grammarAccess.getGradingSchemeAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGradingScheme590); 

                	newLeafNode(otherlv_4, grammarAccess.getGradingSchemeAccess().getLeftCurlyBracketKeyword_4());
                
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:305:1: ( (lv_grades_5_0= ruleGrade ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_STRING)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:306:1: (lv_grades_5_0= ruleGrade )
            	    {
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:306:1: (lv_grades_5_0= ruleGrade )
            	    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:307:3: lv_grades_5_0= ruleGrade
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGradingSchemeAccess().getGradesGradeParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleGrade_in_ruleGradingScheme611);
            	    lv_grades_5_0=ruleGrade();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGradingSchemeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"grades",
            	            		lv_grades_5_0, 
            	            		"Grade");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGradingScheme624); 

                	newLeafNode(otherlv_6, grammarAccess.getGradingSchemeAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGradingScheme"


    // $ANTLR start "entryRuleGrade"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:335:1: entryRuleGrade returns [EObject current=null] : iv_ruleGrade= ruleGrade EOF ;
    public final EObject entryRuleGrade() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrade = null;


        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:336:2: (iv_ruleGrade= ruleGrade EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:337:2: iv_ruleGrade= ruleGrade EOF
            {
             newCompositeNode(grammarAccess.getGradeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrade_in_entryRuleGrade660);
            iv_ruleGrade=ruleGrade();

            state._fsp--;

             current =iv_ruleGrade; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGrade670); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrade"


    // $ANTLR start "ruleGrade"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:344:1: ruleGrade returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_requiredPoints_2_0= ruleEInt ) ) otherlv_3= ';' ) ;
    public final EObject ruleGrade() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_requiredPoints_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:347:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_requiredPoints_2_0= ruleEInt ) ) otherlv_3= ';' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:348:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_requiredPoints_2_0= ruleEInt ) ) otherlv_3= ';' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:348:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_requiredPoints_2_0= ruleEInt ) ) otherlv_3= ';' )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:348:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_requiredPoints_2_0= ruleEInt ) ) otherlv_3= ';'
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:348:2: ( (lv_name_0_0= ruleEString ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:349:1: (lv_name_0_0= ruleEString )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:349:1: (lv_name_0_0= ruleEString )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:350:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGradeAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGrade716);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGradeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGrade728); 

                	newLeafNode(otherlv_1, grammarAccess.getGradeAccess().getColonKeyword_1());
                
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:370:1: ( (lv_requiredPoints_2_0= ruleEInt ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:371:1: (lv_requiredPoints_2_0= ruleEInt )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:371:1: (lv_requiredPoints_2_0= ruleEInt )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:372:3: lv_requiredPoints_2_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getGradeAccess().getRequiredPointsEIntParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleGrade749);
            lv_requiredPoints_2_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGradeRule());
            	        }
                   		set(
                   			current, 
                   			"requiredPoints",
                    		lv_requiredPoints_2_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGrade761); 

                	newLeafNode(otherlv_3, grammarAccess.getGradeAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrade"


    // $ANTLR start "entryRuleTask"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:400:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:401:2: (iv_ruleTask= ruleTask EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:402:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTask_in_entryRuleTask797);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTask807); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:409:1: ruleTask returns [EObject current=null] : (this_ConcreteTask_0= ruleConcreteTask | this_TaskGroup_1= ruleTaskGroup ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        EObject this_ConcreteTask_0 = null;

        EObject this_TaskGroup_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:412:28: ( (this_ConcreteTask_0= ruleConcreteTask | this_TaskGroup_1= ruleTaskGroup ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:413:1: (this_ConcreteTask_0= ruleConcreteTask | this_TaskGroup_1= ruleTaskGroup )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:413:1: (this_ConcreteTask_0= ruleConcreteTask | this_TaskGroup_1= ruleTaskGroup )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==12) ) {
                    alt4=2;
                }
                else if ( (LA4_1==16) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_ID) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==16) ) {
                    alt4=1;
                }
                else if ( (LA4_2==12) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:414:5: this_ConcreteTask_0= ruleConcreteTask
                    {
                     
                            newCompositeNode(grammarAccess.getTaskAccess().getConcreteTaskParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConcreteTask_in_ruleTask854);
                    this_ConcreteTask_0=ruleConcreteTask();

                    state._fsp--;

                     
                            current = this_ConcreteTask_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:424:5: this_TaskGroup_1= ruleTaskGroup
                    {
                     
                            newCompositeNode(grammarAccess.getTaskAccess().getTaskGroupParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTaskGroup_in_ruleTask881);
                    this_TaskGroup_1=ruleTaskGroup();

                    state._fsp--;

                     
                            current = this_TaskGroup_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleConcreteTask"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:440:1: entryRuleConcreteTask returns [EObject current=null] : iv_ruleConcreteTask= ruleConcreteTask EOF ;
    public final EObject entryRuleConcreteTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteTask = null;


        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:441:2: (iv_ruleConcreteTask= ruleConcreteTask EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:442:2: iv_ruleConcreteTask= ruleConcreteTask EOF
            {
             newCompositeNode(grammarAccess.getConcreteTaskRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConcreteTask_in_entryRuleConcreteTask916);
            iv_ruleConcreteTask=ruleConcreteTask();

            state._fsp--;

             current =iv_ruleConcreteTask; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConcreteTask926); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcreteTask"


    // $ANTLR start "ruleConcreteTask"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:449:1: ruleConcreteTask returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_maxPoints_2_0= ruleEInt ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) ) ) ;
    public final EObject ruleConcreteTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_maxPoints_2_0 = null;

        EObject lv_minRequirement_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:452:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_maxPoints_2_0= ruleEInt ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:453:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_maxPoints_2_0= ruleEInt ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:453:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_maxPoints_2_0= ruleEInt ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:453:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_maxPoints_2_0= ruleEInt ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:453:2: ( (lv_name_0_0= ruleEString ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:454:1: (lv_name_0_0= ruleEString )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:454:1: (lv_name_0_0= ruleEString )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:455:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConcreteTaskAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConcreteTask972);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConcreteTaskRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConcreteTask984); 

                	newLeafNode(otherlv_1, grammarAccess.getConcreteTaskAccess().getLeftParenthesisKeyword_1());
                
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:475:1: ( (lv_maxPoints_2_0= ruleEInt ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:476:1: (lv_maxPoints_2_0= ruleEInt )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:476:1: (lv_maxPoints_2_0= ruleEInt )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:477:3: lv_maxPoints_2_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getConcreteTaskAccess().getMaxPointsEIntParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleConcreteTask1005);
            lv_maxPoints_2_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConcreteTaskRule());
            	        }
                   		set(
                   			current, 
                   			"maxPoints",
                    		lv_maxPoints_2_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConcreteTask1017); 

                	newLeafNode(otherlv_3, grammarAccess.getConcreteTaskAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConcreteTask1029); 

                	newLeafNode(otherlv_4, grammarAccess.getConcreteTaskAccess().getColonKeyword_4());
                
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:501:1: ( (lv_minRequirement_5_0= ruleMinRequirement ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:502:1: (lv_minRequirement_5_0= ruleMinRequirement )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:502:1: (lv_minRequirement_5_0= ruleMinRequirement )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:503:3: lv_minRequirement_5_0= ruleMinRequirement
            {
             
            	        newCompositeNode(grammarAccess.getConcreteTaskAccess().getMinRequirementMinRequirementParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMinRequirement_in_ruleConcreteTask1050);
            lv_minRequirement_5_0=ruleMinRequirement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConcreteTaskRule());
            	        }
                   		set(
                   			current, 
                   			"minRequirement",
                    		lv_minRequirement_5_0, 
                    		"MinRequirement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcreteTask"


    // $ANTLR start "entryRuleTaskGroup"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:527:1: entryRuleTaskGroup returns [EObject current=null] : iv_ruleTaskGroup= ruleTaskGroup EOF ;
    public final EObject entryRuleTaskGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskGroup = null;


        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:528:2: (iv_ruleTaskGroup= ruleTaskGroup EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:529:2: iv_ruleTaskGroup= ruleTaskGroup EOF
            {
             newCompositeNode(grammarAccess.getTaskGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTaskGroup_in_entryRuleTaskGroup1086);
            iv_ruleTaskGroup=ruleTaskGroup();

            state._fsp--;

             current =iv_ruleTaskGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTaskGroup1096); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskGroup"


    // $ANTLR start "ruleTaskGroup"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:536:1: ruleTaskGroup returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_contains_2_0= ruleTask ) ) (otherlv_3= '@all' otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) ) ) otherlv_6= '}' ) ;
    public final EObject ruleTaskGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_contains_2_0 = null;

        EObject lv_minRequirement_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:539:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_contains_2_0= ruleTask ) ) (otherlv_3= '@all' otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) ) ) otherlv_6= '}' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:540:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_contains_2_0= ruleTask ) ) (otherlv_3= '@all' otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) ) ) otherlv_6= '}' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:540:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_contains_2_0= ruleTask ) ) (otherlv_3= '@all' otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) ) ) otherlv_6= '}' )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:540:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_contains_2_0= ruleTask ) ) (otherlv_3= '@all' otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) ) ) otherlv_6= '}'
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:540:2: ( (lv_name_0_0= ruleEString ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:541:1: (lv_name_0_0= ruleEString )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:541:1: (lv_name_0_0= ruleEString )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:542:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTaskGroupAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTaskGroup1142);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTaskGroupRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTaskGroup1154); 

                	newLeafNode(otherlv_1, grammarAccess.getTaskGroupAccess().getLeftCurlyBracketKeyword_1());
                
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:562:1: ( (lv_contains_2_0= ruleTask ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:563:1: (lv_contains_2_0= ruleTask )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:563:1: (lv_contains_2_0= ruleTask )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:564:3: lv_contains_2_0= ruleTask
            {
             
            	        newCompositeNode(grammarAccess.getTaskGroupAccess().getContainsTaskParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTask_in_ruleTaskGroup1175);
            lv_contains_2_0=ruleTask();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTaskGroupRule());
            	        }
                   		add(
                   			current, 
                   			"contains",
                    		lv_contains_2_0, 
                    		"Task");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:580:2: (otherlv_3= '@all' otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:580:4: otherlv_3= '@all' otherlv_4= ':' ( (lv_minRequirement_5_0= ruleMinRequirement ) )
            {
            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTaskGroup1188); 

                	newLeafNode(otherlv_3, grammarAccess.getTaskGroupAccess().getAllKeyword_3_0());
                
            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTaskGroup1200); 

                	newLeafNode(otherlv_4, grammarAccess.getTaskGroupAccess().getColonKeyword_3_1());
                
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:588:1: ( (lv_minRequirement_5_0= ruleMinRequirement ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:589:1: (lv_minRequirement_5_0= ruleMinRequirement )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:589:1: (lv_minRequirement_5_0= ruleMinRequirement )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:590:3: lv_minRequirement_5_0= ruleMinRequirement
            {
             
            	        newCompositeNode(grammarAccess.getTaskGroupAccess().getMinRequirementMinRequirementParserRuleCall_3_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMinRequirement_in_ruleTaskGroup1221);
            lv_minRequirement_5_0=ruleMinRequirement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTaskGroupRule());
            	        }
                   		set(
                   			current, 
                   			"minRequirement",
                    		lv_minRequirement_5_0, 
                    		"MinRequirement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTaskGroup1234); 

                	newLeafNode(otherlv_6, grammarAccess.getTaskGroupAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskGroup"


    // $ANTLR start "entryRuleMinRequirement"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:618:1: entryRuleMinRequirement returns [EObject current=null] : iv_ruleMinRequirement= ruleMinRequirement EOF ;
    public final EObject entryRuleMinRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinRequirement = null;


        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:619:2: (iv_ruleMinRequirement= ruleMinRequirement EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:620:2: iv_ruleMinRequirement= ruleMinRequirement EOF
            {
             newCompositeNode(grammarAccess.getMinRequirementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMinRequirement_in_entryRuleMinRequirement1270);
            iv_ruleMinRequirement=ruleMinRequirement();

            state._fsp--;

             current =iv_ruleMinRequirement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMinRequirement1280); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinRequirement"


    // $ANTLR start "ruleMinRequirement"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:627:1: ruleMinRequirement returns [EObject current=null] : (otherlv_0= 'min' ( (lv_value_1_0= ruleEInt ) ) ( (lv_type_2_0= ruleMinRequirementsType ) ) otherlv_3= ';' ) ;
    public final EObject ruleMinRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        Enumerator lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:630:28: ( (otherlv_0= 'min' ( (lv_value_1_0= ruleEInt ) ) ( (lv_type_2_0= ruleMinRequirementsType ) ) otherlv_3= ';' ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:631:1: (otherlv_0= 'min' ( (lv_value_1_0= ruleEInt ) ) ( (lv_type_2_0= ruleMinRequirementsType ) ) otherlv_3= ';' )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:631:1: (otherlv_0= 'min' ( (lv_value_1_0= ruleEInt ) ) ( (lv_type_2_0= ruleMinRequirementsType ) ) otherlv_3= ';' )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:631:3: otherlv_0= 'min' ( (lv_value_1_0= ruleEInt ) ) ( (lv_type_2_0= ruleMinRequirementsType ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMinRequirement1317); 

                	newLeafNode(otherlv_0, grammarAccess.getMinRequirementAccess().getMinKeyword_0());
                
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:635:1: ( (lv_value_1_0= ruleEInt ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:636:1: (lv_value_1_0= ruleEInt )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:636:1: (lv_value_1_0= ruleEInt )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:637:3: lv_value_1_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getMinRequirementAccess().getValueEIntParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMinRequirement1338);
            lv_value_1_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMinRequirementRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:653:2: ( (lv_type_2_0= ruleMinRequirementsType ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:654:1: (lv_type_2_0= ruleMinRequirementsType )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:654:1: (lv_type_2_0= ruleMinRequirementsType )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:655:3: lv_type_2_0= ruleMinRequirementsType
            {
             
            	        newCompositeNode(grammarAccess.getMinRequirementAccess().getTypeMinRequirementsTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMinRequirementsType_in_ruleMinRequirement1359);
            lv_type_2_0=ruleMinRequirementsType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMinRequirementRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"MinRequirementsType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMinRequirement1371); 

                	newLeafNode(otherlv_3, grammarAccess.getMinRequirementAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinRequirement"


    // $ANTLR start "entryRuleEString"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:683:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:684:2: (iv_ruleEString= ruleEString EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:685:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1408);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1419); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:692:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:695:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:696:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:696:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:696:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1459); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:704:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1485); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:719:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:720:2: (iv_ruleEInt= ruleEInt EOF )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:721:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1531);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1542); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:728:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:731:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:732:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:732:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:732:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:732:2: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:733:2: kw= '-'
                    {
                    kw=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEInt1581); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1598); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleMinRequirementsType"
    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:753:1: ruleMinRequirementsType returns [Enumerator current=null] : ( (enumLiteral_0= '%' ) | (enumLiteral_1= 'point(s)' ) ) ;
    public final Enumerator ruleMinRequirementsType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:755:28: ( ( (enumLiteral_0= '%' ) | (enumLiteral_1= 'point(s)' ) ) )
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:756:1: ( (enumLiteral_0= '%' ) | (enumLiteral_1= 'point(s)' ) )
            {
            // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:756:1: ( (enumLiteral_0= '%' ) | (enumLiteral_1= 'point(s)' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            else if ( (LA7_0==24) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:756:2: (enumLiteral_0= '%' )
                    {
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:756:2: (enumLiteral_0= '%' )
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:756:4: enumLiteral_0= '%'
                    {
                    enumLiteral_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMinRequirementsType1657); 

                            current = grammarAccess.getMinRequirementsTypeAccess().getPercentageEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMinRequirementsTypeAccess().getPercentageEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:762:6: (enumLiteral_1= 'point(s)' )
                    {
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:762:6: (enumLiteral_1= 'point(s)' )
                    // ../at.ac.tuwien.big.me12.GSMLDsl/src-gen/at/ac/tuwien/big/me12/parser/antlr/internal/InternalGSMLDsl.g:762:8: enumLiteral_1= 'point(s)'
                    {
                    enumLiteral_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMinRequirementsType1674); 

                            current = grammarAccess.getMinRequirementsTypeAccess().getAbsoluteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMinRequirementsTypeAccess().getAbsoluteEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinRequirementsType"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleGradingSystem_in_entryRuleGradingSystem75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGradingSystem85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourse_in_ruleGradingSystem130 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_ruleCourse_in_entryRuleCourse166 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCourse176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleCourse213 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCourse230 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCourse247 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_ruleGrading_in_ruleCourse268 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleCourse281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrading_in_entryRuleGrading317 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGrading327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleGrading364 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGrading385 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGrading397 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleGradingScheme_in_ruleGrading418 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTask_in_ruleGrading439 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGrading451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGradingScheme_in_entryRuleGradingScheme487 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGradingScheme497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleGradingScheme534 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleGradingScheme546 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGradingScheme566 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleGradingScheme578 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGradingScheme590 = new BitSet(new long[]{0x0000000000002030L});
        public static final BitSet FOLLOW_ruleGrade_in_ruleGradingScheme611 = new BitSet(new long[]{0x0000000000002030L});
        public static final BitSet FOLLOW_13_in_ruleGradingScheme624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrade_in_entryRuleGrade660 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGrade670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGrade716 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleGrade728 = new BitSet(new long[]{0x0000000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleGrade749 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleGrade761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTask_in_entryRuleTask797 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTask807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteTask_in_ruleTask854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskGroup_in_ruleTask881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteTask_in_entryRuleConcreteTask916 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConcreteTask926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConcreteTask972 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleConcreteTask984 = new BitSet(new long[]{0x0000000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleConcreteTask1005 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleConcreteTask1017 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleConcreteTask1029 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleMinRequirement_in_ruleConcreteTask1050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskGroup_in_entryRuleTaskGroup1086 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTaskGroup1096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTaskGroup1142 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTaskGroup1154 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTask_in_ruleTaskGroup1175 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleTaskGroup1188 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTaskGroup1200 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleMinRequirement_in_ruleTaskGroup1221 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTaskGroup1234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMinRequirement_in_entryRuleMinRequirement1270 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMinRequirement1280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleMinRequirement1317 = new BitSet(new long[]{0x0000000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMinRequirement1338 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_ruleMinRequirementsType_in_ruleMinRequirement1359 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMinRequirement1371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1408 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1531 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleEInt1581 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleMinRequirementsType1657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleMinRequirementsType1674 = new BitSet(new long[]{0x0000000000000002L});
    }


}