package uk.ac.kcl.inf.group19.easySql.parser.antlr.internal;

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
import uk.ac.kcl.inf.group19.easySql.services.EasySqlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEasySqlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Table'", "'var'", "'='", "','", "'-'", "'.Insert('", "')'", "'.Update('", "'.Condition('", "'.Delete('", "'.Search('", "'.RemoveDuplication()'", "'.'", "'('", "'.Joinsearch('", "'.On('", "'.Subsearch('", "'.When('", "'.In('", "'>'", "'<'", "'>='", "'<='", "'!='", "'left_join'", "'right_join'", "'full_join'", "'inner_join'", "'ascending'", "'descending'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEasySqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEasySqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEasySqlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEasySql.g"; }



     	private EasySqlGrammarAccess grammarAccess;

        public InternalEasySqlParser(TokenStream input, EasySqlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SqlProgram";
       	}

       	@Override
       	protected EasySqlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSqlProgram"
    // InternalEasySql.g:65:1: entryRuleSqlProgram returns [EObject current=null] : iv_ruleSqlProgram= ruleSqlProgram EOF ;
    public final EObject entryRuleSqlProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqlProgram = null;


        try {
            // InternalEasySql.g:65:51: (iv_ruleSqlProgram= ruleSqlProgram EOF )
            // InternalEasySql.g:66:2: iv_ruleSqlProgram= ruleSqlProgram EOF
            {
             newCompositeNode(grammarAccess.getSqlProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSqlProgram=ruleSqlProgram();

            state._fsp--;

             current =iv_ruleSqlProgram; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSqlProgram"


    // $ANTLR start "ruleSqlProgram"
    // InternalEasySql.g:72:1: ruleSqlProgram returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleSqlProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalEasySql.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalEasySql.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalEasySql.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEasySql.g:80:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalEasySql.g:80:3: (lv_statements_0_0= ruleStatement )
            	    // InternalEasySql.g:81:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getSqlProgramAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getSqlProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"uk.ac.kcl.inf.group19.easySql.EasySql.Statement");
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
    // $ANTLR end "ruleSqlProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalEasySql.g:101:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalEasySql.g:101:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalEasySql.g:102:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalEasySql.g:108:1: ruleStatement returns [EObject current=null] : (this_QueryStatement_0= ruleQueryStatement | this_ManipulateStatement_1= ruleManipulateStatement | this_TableDeclaration_2= ruleTableDeclaration | this_SingleSelectDeclaration_3= ruleSingleSelectDeclaration ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_QueryStatement_0 = null;

        EObject this_ManipulateStatement_1 = null;

        EObject this_TableDeclaration_2 = null;

        EObject this_SingleSelectDeclaration_3 = null;



        	enterRule();

        try {
            // InternalEasySql.g:114:2: ( (this_QueryStatement_0= ruleQueryStatement | this_ManipulateStatement_1= ruleManipulateStatement | this_TableDeclaration_2= ruleTableDeclaration | this_SingleSelectDeclaration_3= ruleSingleSelectDeclaration ) )
            // InternalEasySql.g:115:2: (this_QueryStatement_0= ruleQueryStatement | this_ManipulateStatement_1= ruleManipulateStatement | this_TableDeclaration_2= ruleTableDeclaration | this_SingleSelectDeclaration_3= ruleSingleSelectDeclaration )
            {
            // InternalEasySql.g:115:2: (this_QueryStatement_0= ruleQueryStatement | this_ManipulateStatement_1= ruleManipulateStatement | this_TableDeclaration_2= ruleTableDeclaration | this_SingleSelectDeclaration_3= ruleSingleSelectDeclaration )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==16||LA2_1==18||LA2_1==20) ) {
                    alt2=2;
                }
                else if ( (LA2_1==21||LA2_1==25||LA2_1==27) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 11:
                {
                alt2=3;
                }
                break;
            case 12:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEasySql.g:116:3: this_QueryStatement_0= ruleQueryStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getQueryStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_QueryStatement_0=ruleQueryStatement();

                    state._fsp--;


                    			current = this_QueryStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEasySql.g:125:3: this_ManipulateStatement_1= ruleManipulateStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getManipulateStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ManipulateStatement_1=ruleManipulateStatement();

                    state._fsp--;


                    			current = this_ManipulateStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEasySql.g:134:3: this_TableDeclaration_2= ruleTableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTableDeclarationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TableDeclaration_2=ruleTableDeclaration();

                    state._fsp--;


                    			current = this_TableDeclaration_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalEasySql.g:143:3: this_SingleSelectDeclaration_3= ruleSingleSelectDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSingleSelectDeclarationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleSelectDeclaration_3=ruleSingleSelectDeclaration();

                    state._fsp--;


                    			current = this_SingleSelectDeclaration_3;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleQueryStatement"
    // InternalEasySql.g:155:1: entryRuleQueryStatement returns [EObject current=null] : iv_ruleQueryStatement= ruleQueryStatement EOF ;
    public final EObject entryRuleQueryStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryStatement = null;


        try {
            // InternalEasySql.g:155:55: (iv_ruleQueryStatement= ruleQueryStatement EOF )
            // InternalEasySql.g:156:2: iv_ruleQueryStatement= ruleQueryStatement EOF
            {
             newCompositeNode(grammarAccess.getQueryStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueryStatement=ruleQueryStatement();

            state._fsp--;

             current =iv_ruleQueryStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQueryStatement"


    // $ANTLR start "ruleQueryStatement"
    // InternalEasySql.g:162:1: ruleQueryStatement returns [EObject current=null] : (this_SimpleSelectQuery_0= ruleSimpleSelectQuery | this_JoinQuery_1= ruleJoinQuery | this_NestedQuery_2= ruleNestedQuery ) ;
    public final EObject ruleQueryStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleSelectQuery_0 = null;

        EObject this_JoinQuery_1 = null;

        EObject this_NestedQuery_2 = null;



        	enterRule();

        try {
            // InternalEasySql.g:168:2: ( (this_SimpleSelectQuery_0= ruleSimpleSelectQuery | this_JoinQuery_1= ruleJoinQuery | this_NestedQuery_2= ruleNestedQuery ) )
            // InternalEasySql.g:169:2: (this_SimpleSelectQuery_0= ruleSimpleSelectQuery | this_JoinQuery_1= ruleJoinQuery | this_NestedQuery_2= ruleNestedQuery )
            {
            // InternalEasySql.g:169:2: (this_SimpleSelectQuery_0= ruleSimpleSelectQuery | this_JoinQuery_1= ruleJoinQuery | this_NestedQuery_2= ruleNestedQuery )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    alt3=3;
                    }
                    break;
                case 21:
                    {
                    alt3=1;
                    }
                    break;
                case 25:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEasySql.g:170:3: this_SimpleSelectQuery_0= ruleSimpleSelectQuery
                    {

                    			newCompositeNode(grammarAccess.getQueryStatementAccess().getSimpleSelectQueryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleSelectQuery_0=ruleSimpleSelectQuery();

                    state._fsp--;


                    			current = this_SimpleSelectQuery_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEasySql.g:179:3: this_JoinQuery_1= ruleJoinQuery
                    {

                    			newCompositeNode(grammarAccess.getQueryStatementAccess().getJoinQueryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_JoinQuery_1=ruleJoinQuery();

                    state._fsp--;


                    			current = this_JoinQuery_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEasySql.g:188:3: this_NestedQuery_2= ruleNestedQuery
                    {

                    			newCompositeNode(grammarAccess.getQueryStatementAccess().getNestedQueryParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NestedQuery_2=ruleNestedQuery();

                    state._fsp--;


                    			current = this_NestedQuery_2;
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
    // $ANTLR end "ruleQueryStatement"


    // $ANTLR start "entryRuleManipulateStatement"
    // InternalEasySql.g:200:1: entryRuleManipulateStatement returns [EObject current=null] : iv_ruleManipulateStatement= ruleManipulateStatement EOF ;
    public final EObject entryRuleManipulateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManipulateStatement = null;


        try {
            // InternalEasySql.g:200:60: (iv_ruleManipulateStatement= ruleManipulateStatement EOF )
            // InternalEasySql.g:201:2: iv_ruleManipulateStatement= ruleManipulateStatement EOF
            {
             newCompositeNode(grammarAccess.getManipulateStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManipulateStatement=ruleManipulateStatement();

            state._fsp--;

             current =iv_ruleManipulateStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleManipulateStatement"


    // $ANTLR start "ruleManipulateStatement"
    // InternalEasySql.g:207:1: ruleManipulateStatement returns [EObject current=null] : (this_Insert_0= ruleInsert | this_Update_1= ruleUpdate | this_Delete_2= ruleDelete ) ;
    public final EObject ruleManipulateStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Insert_0 = null;

        EObject this_Update_1 = null;

        EObject this_Delete_2 = null;



        	enterRule();

        try {
            // InternalEasySql.g:213:2: ( (this_Insert_0= ruleInsert | this_Update_1= ruleUpdate | this_Delete_2= ruleDelete ) )
            // InternalEasySql.g:214:2: (this_Insert_0= ruleInsert | this_Update_1= ruleUpdate | this_Delete_2= ruleDelete )
            {
            // InternalEasySql.g:214:2: (this_Insert_0= ruleInsert | this_Update_1= ruleUpdate | this_Delete_2= ruleDelete )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt4=2;
                    }
                    break;
                case 16:
                    {
                    alt4=1;
                    }
                    break;
                case 20:
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

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
                    // InternalEasySql.g:215:3: this_Insert_0= ruleInsert
                    {

                    			newCompositeNode(grammarAccess.getManipulateStatementAccess().getInsertParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Insert_0=ruleInsert();

                    state._fsp--;


                    			current = this_Insert_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEasySql.g:224:3: this_Update_1= ruleUpdate
                    {

                    			newCompositeNode(grammarAccess.getManipulateStatementAccess().getUpdateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Update_1=ruleUpdate();

                    state._fsp--;


                    			current = this_Update_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEasySql.g:233:3: this_Delete_2= ruleDelete
                    {

                    			newCompositeNode(grammarAccess.getManipulateStatementAccess().getDeleteParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Delete_2=ruleDelete();

                    state._fsp--;


                    			current = this_Delete_2;
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
    // $ANTLR end "ruleManipulateStatement"


    // $ANTLR start "entryRuleMultiType"
    // InternalEasySql.g:245:1: entryRuleMultiType returns [EObject current=null] : iv_ruleMultiType= ruleMultiType EOF ;
    public final EObject entryRuleMultiType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiType = null;


        try {
            // InternalEasySql.g:245:50: (iv_ruleMultiType= ruleMultiType EOF )
            // InternalEasySql.g:246:2: iv_ruleMultiType= ruleMultiType EOF
            {
             newCompositeNode(grammarAccess.getMultiTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiType=ruleMultiType();

            state._fsp--;

             current =iv_ruleMultiType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiType"


    // $ANTLR start "ruleMultiType"
    // InternalEasySql.g:252:1: ruleMultiType returns [EObject current=null] : (this_StrLiteral_0= ruleStrLiteral | this_RinLiteral_1= ruleRinLiteral | this_NumLiteral_2= ruleNumLiteral ) ;
    public final EObject ruleMultiType() throws RecognitionException {
        EObject current = null;

        EObject this_StrLiteral_0 = null;

        EObject this_RinLiteral_1 = null;

        EObject this_NumLiteral_2 = null;



        	enterRule();

        try {
            // InternalEasySql.g:258:2: ( (this_StrLiteral_0= ruleStrLiteral | this_RinLiteral_1= ruleRinLiteral | this_NumLiteral_2= ruleNumLiteral ) )
            // InternalEasySql.g:259:2: (this_StrLiteral_0= ruleStrLiteral | this_RinLiteral_1= ruleRinLiteral | this_NumLiteral_2= ruleNumLiteral )
            {
            // InternalEasySql.g:259:2: (this_StrLiteral_0= ruleStrLiteral | this_RinLiteral_1= ruleRinLiteral | this_NumLiteral_2= ruleNumLiteral )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case RULE_STRING:
                {
                alt5=2;
                }
                break;
            case RULE_INT:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalEasySql.g:260:3: this_StrLiteral_0= ruleStrLiteral
                    {

                    			newCompositeNode(grammarAccess.getMultiTypeAccess().getStrLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StrLiteral_0=ruleStrLiteral();

                    state._fsp--;


                    			current = this_StrLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEasySql.g:269:3: this_RinLiteral_1= ruleRinLiteral
                    {

                    			newCompositeNode(grammarAccess.getMultiTypeAccess().getRinLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RinLiteral_1=ruleRinLiteral();

                    state._fsp--;


                    			current = this_RinLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEasySql.g:278:3: this_NumLiteral_2= ruleNumLiteral
                    {

                    			newCompositeNode(grammarAccess.getMultiTypeAccess().getNumLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumLiteral_2=ruleNumLiteral();

                    state._fsp--;


                    			current = this_NumLiteral_2;
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
    // $ANTLR end "ruleMultiType"


    // $ANTLR start "entryRuleNumLiteral"
    // InternalEasySql.g:290:1: entryRuleNumLiteral returns [EObject current=null] : iv_ruleNumLiteral= ruleNumLiteral EOF ;
    public final EObject entryRuleNumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumLiteral = null;


        try {
            // InternalEasySql.g:290:51: (iv_ruleNumLiteral= ruleNumLiteral EOF )
            // InternalEasySql.g:291:2: iv_ruleNumLiteral= ruleNumLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumLiteral=ruleNumLiteral();

            state._fsp--;

             current =iv_ruleNumLiteral; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumLiteral"


    // $ANTLR start "ruleNumLiteral"
    // InternalEasySql.g:297:1: ruleNumLiteral returns [EObject current=null] : ( (lv_var_0_0= RULE_INT ) ) ;
    public final EObject ruleNumLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;


        	enterRule();

        try {
            // InternalEasySql.g:303:2: ( ( (lv_var_0_0= RULE_INT ) ) )
            // InternalEasySql.g:304:2: ( (lv_var_0_0= RULE_INT ) )
            {
            // InternalEasySql.g:304:2: ( (lv_var_0_0= RULE_INT ) )
            // InternalEasySql.g:305:3: (lv_var_0_0= RULE_INT )
            {
            // InternalEasySql.g:305:3: (lv_var_0_0= RULE_INT )
            // InternalEasySql.g:306:4: lv_var_0_0= RULE_INT
            {
            lv_var_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_var_0_0, grammarAccess.getNumLiteralAccess().getVarINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"var",
            					lv_var_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleNumLiteral"


    // $ANTLR start "entryRuleStrLiteral"
    // InternalEasySql.g:325:1: entryRuleStrLiteral returns [EObject current=null] : iv_ruleStrLiteral= ruleStrLiteral EOF ;
    public final EObject entryRuleStrLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrLiteral = null;


        try {
            // InternalEasySql.g:325:51: (iv_ruleStrLiteral= ruleStrLiteral EOF )
            // InternalEasySql.g:326:2: iv_ruleStrLiteral= ruleStrLiteral EOF
            {
             newCompositeNode(grammarAccess.getStrLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrLiteral=ruleStrLiteral();

            state._fsp--;

             current =iv_ruleStrLiteral; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStrLiteral"


    // $ANTLR start "ruleStrLiteral"
    // InternalEasySql.g:332:1: ruleStrLiteral returns [EObject current=null] : ( (lv_var_0_0= RULE_ID ) ) ;
    public final EObject ruleStrLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;


        	enterRule();

        try {
            // InternalEasySql.g:338:2: ( ( (lv_var_0_0= RULE_ID ) ) )
            // InternalEasySql.g:339:2: ( (lv_var_0_0= RULE_ID ) )
            {
            // InternalEasySql.g:339:2: ( (lv_var_0_0= RULE_ID ) )
            // InternalEasySql.g:340:3: (lv_var_0_0= RULE_ID )
            {
            // InternalEasySql.g:340:3: (lv_var_0_0= RULE_ID )
            // InternalEasySql.g:341:4: lv_var_0_0= RULE_ID
            {
            lv_var_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_var_0_0, grammarAccess.getStrLiteralAccess().getVarIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStrLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"var",
            					lv_var_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleStrLiteral"


    // $ANTLR start "entryRuleRinLiteral"
    // InternalEasySql.g:360:1: entryRuleRinLiteral returns [EObject current=null] : iv_ruleRinLiteral= ruleRinLiteral EOF ;
    public final EObject entryRuleRinLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRinLiteral = null;


        try {
            // InternalEasySql.g:360:51: (iv_ruleRinLiteral= ruleRinLiteral EOF )
            // InternalEasySql.g:361:2: iv_ruleRinLiteral= ruleRinLiteral EOF
            {
             newCompositeNode(grammarAccess.getRinLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRinLiteral=ruleRinLiteral();

            state._fsp--;

             current =iv_ruleRinLiteral; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRinLiteral"


    // $ANTLR start "ruleRinLiteral"
    // InternalEasySql.g:367:1: ruleRinLiteral returns [EObject current=null] : ( (lv_var_0_0= RULE_STRING ) ) ;
    public final EObject ruleRinLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;


        	enterRule();

        try {
            // InternalEasySql.g:373:2: ( ( (lv_var_0_0= RULE_STRING ) ) )
            // InternalEasySql.g:374:2: ( (lv_var_0_0= RULE_STRING ) )
            {
            // InternalEasySql.g:374:2: ( (lv_var_0_0= RULE_STRING ) )
            // InternalEasySql.g:375:3: (lv_var_0_0= RULE_STRING )
            {
            // InternalEasySql.g:375:3: (lv_var_0_0= RULE_STRING )
            // InternalEasySql.g:376:4: lv_var_0_0= RULE_STRING
            {
            lv_var_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_var_0_0, grammarAccess.getRinLiteralAccess().getVarSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRinLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"var",
            					lv_var_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleRinLiteral"


    // $ANTLR start "entryRuleTableDeclaration"
    // InternalEasySql.g:395:1: entryRuleTableDeclaration returns [EObject current=null] : iv_ruleTableDeclaration= ruleTableDeclaration EOF ;
    public final EObject entryRuleTableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableDeclaration = null;


        try {
            // InternalEasySql.g:395:57: (iv_ruleTableDeclaration= ruleTableDeclaration EOF )
            // InternalEasySql.g:396:2: iv_ruleTableDeclaration= ruleTableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getTableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableDeclaration=ruleTableDeclaration();

            state._fsp--;

             current =iv_ruleTableDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTableDeclaration"


    // $ANTLR start "ruleTableDeclaration"
    // InternalEasySql.g:402:1: ruleTableDeclaration returns [EObject current=null] : (otherlv_0= 'Table' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalEasySql.g:408:2: ( (otherlv_0= 'Table' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalEasySql.g:409:2: (otherlv_0= 'Table' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalEasySql.g:409:2: (otherlv_0= 'Table' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalEasySql.g:410:3: otherlv_0= 'Table' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTableDeclarationAccess().getTableKeyword_0());
            		
            // InternalEasySql.g:414:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEasySql.g:415:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEasySql.g:415:4: (lv_name_1_0= RULE_ID )
            // InternalEasySql.g:416:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleTableDeclaration"


    // $ANTLR start "entryRuleSingleSelectDeclaration"
    // InternalEasySql.g:436:1: entryRuleSingleSelectDeclaration returns [EObject current=null] : iv_ruleSingleSelectDeclaration= ruleSingleSelectDeclaration EOF ;
    public final EObject entryRuleSingleSelectDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSelectDeclaration = null;


        try {
            // InternalEasySql.g:436:64: (iv_ruleSingleSelectDeclaration= ruleSingleSelectDeclaration EOF )
            // InternalEasySql.g:437:2: iv_ruleSingleSelectDeclaration= ruleSingleSelectDeclaration EOF
            {
             newCompositeNode(grammarAccess.getSingleSelectDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleSelectDeclaration=ruleSingleSelectDeclaration();

            state._fsp--;

             current =iv_ruleSingleSelectDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSingleSelectDeclaration"


    // $ANTLR start "ruleSingleSelectDeclaration"
    // InternalEasySql.g:443:1: ruleSingleSelectDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_singleSelect_3_0= ruleSimpleSelectQuery ) ) ) ;
    public final EObject ruleSingleSelectDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_singleSelect_3_0 = null;



        	enterRule();

        try {
            // InternalEasySql.g:449:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_singleSelect_3_0= ruleSimpleSelectQuery ) ) ) )
            // InternalEasySql.g:450:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_singleSelect_3_0= ruleSimpleSelectQuery ) ) )
            {
            // InternalEasySql.g:450:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_singleSelect_3_0= ruleSimpleSelectQuery ) ) )
            // InternalEasySql.g:451:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_singleSelect_3_0= ruleSimpleSelectQuery ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSingleSelectDeclarationAccess().getVarKeyword_0());
            		
            // InternalEasySql.g:455:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEasySql.g:456:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEasySql.g:456:4: (lv_name_1_0= RULE_ID )
            // InternalEasySql.g:457:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSingleSelectDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleSelectDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSingleSelectDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalEasySql.g:477:3: ( (lv_singleSelect_3_0= ruleSimpleSelectQuery ) )
            // InternalEasySql.g:478:4: (lv_singleSelect_3_0= ruleSimpleSelectQuery )
            {
            // InternalEasySql.g:478:4: (lv_singleSelect_3_0= ruleSimpleSelectQuery )
            // InternalEasySql.g:479:5: lv_singleSelect_3_0= ruleSimpleSelectQuery
            {

            					newCompositeNode(grammarAccess.getSingleSelectDeclarationAccess().getSingleSelectSimpleSelectQueryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_singleSelect_3_0=ruleSimpleSelectQuery();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleSelectDeclarationRule());
            					}
            					set(
            						current,
            						"singleSelect",
            						lv_singleSelect_3_0,
            						"uk.ac.kcl.inf.group19.easySql.EasySql.SimpleSelectQuery");
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
    // $ANTLR end "ruleSingleSelectDeclaration"


    // $ANTLR start "entryRuleValue"
    // InternalEasySql.g:500:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalEasySql.g:500:46: (iv_ruleValue= ruleValue EOF )
            // InternalEasySql.g:501:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalEasySql.g:507:1: ruleValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleMultiType ) ) ( (lv_separation_1_0= ',' ) )* ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_separation_1_0=null;
        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalEasySql.g:513:2: ( ( ( (lv_value_0_0= ruleMultiType ) ) ( (lv_separation_1_0= ',' ) )* ) )
            // InternalEasySql.g:514:2: ( ( (lv_value_0_0= ruleMultiType ) ) ( (lv_separation_1_0= ',' ) )* )
            {
            // InternalEasySql.g:514:2: ( ( (lv_value_0_0= ruleMultiType ) ) ( (lv_separation_1_0= ',' ) )* )
            // InternalEasySql.g:515:3: ( (lv_value_0_0= ruleMultiType ) ) ( (lv_separation_1_0= ',' ) )*
            {
            // InternalEasySql.g:515:3: ( (lv_value_0_0= ruleMultiType ) )
            // InternalEasySql.g:516:4: (lv_value_0_0= ruleMultiType )
            {
            // InternalEasySql.g:516:4: (lv_value_0_0= ruleMultiType )
            // InternalEasySql.g:517:5: lv_value_0_0= ruleMultiType
            {

            					newCompositeNode(grammarAccess.getValueAccess().getValueMultiTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_value_0_0=ruleMultiType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_0_0,
            						"uk.ac.kcl.inf.group19.easySql.EasySql.MultiType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEasySql.g:534:3: ( (lv_separation_1_0= ',' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEasySql.g:535:4: (lv_separation_1_0= ',' )
            	    {
            	    // InternalEasySql.g:535:4: (lv_separation_1_0= ',' )
            	    // InternalEasySql.g:536:5: lv_separation_1_0= ','
            	    {
            	    lv_separation_1_0=(Token)match(input,14,FOLLOW_6); 

            	    					newLeafNode(lv_separation_1_0, grammarAccess.getValueAccess().getSeparationCommaKeyword_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getValueRule());
            	    					}
            	    					addWithLastConsumed(current, "separation", lv_separation_1_0, ",");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleEquation"
    // InternalEasySql.g:552:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // InternalEasySql.g:552:49: (iv_ruleEquation= ruleEquation EOF )
            // InternalEasySql.g:553:2: iv_ruleEquation= ruleEquation EOF
            {
             newCompositeNode(grammarAccess.getEquationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquation=ruleEquation();

            state._fsp--;

             current =iv_ruleEquation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEquation"


    // $ANTLR start "ruleEquation"
    // InternalEasySql.g:559:1: ruleEquation returns [EObject current=null] : ( ( (lv_attribute_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleMultiType ) ) ( (lv_separation_3_0= ',' ) )* ) ;
    public final EObject ruleEquation() throws RecognitionException {
        EObject current = null;

        Token lv_attribute_0_0=null;
        Token lv_separation_3_0=null;
        Enumerator lv_operator_1_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEasySql.g:565:2: ( ( ( (lv_attribute_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleMultiType ) ) ( (lv_separation_3_0= ',' ) )* ) )
            // InternalEasySql.g:566:2: ( ( (lv_attribute_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleMultiType ) ) ( (lv_separation_3_0= ',' ) )* )
            {
            // InternalEasySql.g:566:2: ( ( (lv_attribute_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleMultiType ) ) ( (lv_separation_3_0= ',' ) )* )
            // InternalEasySql.g:567:3: ( (lv_attribute_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleMultiType ) ) ( (lv_separation_3_0= ',' ) )*
            {
            // InternalEasySql.g:567:3: ( (lv_attribute_0_0= RULE_ID ) )
            // InternalEasySql.g:568:4: (lv_attribute_0_0= RULE_ID )
            {
            // InternalEasySql.g:568:4: (lv_attribute_0_0= RULE_ID )
            // InternalEasySql.g:569:5: lv_attribute_0_0= RULE_ID
            {
            lv_attribute_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_attribute_0_0, grammarAccess.getEquationAccess().getAttributeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEquationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attribute",
            						lv_attribute_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEasySql.g:585:3: ( (lv_operator_1_0= ruleOperator ) )
            // InternalEasySql.g:586:4: (lv_operator_1_0= ruleOperator )
            {
            // InternalEasySql.g:586:4: (lv_operator_1_0= ruleOperator )
            // InternalEasySql.g:587:5: lv_operator_1_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getEquationAccess().getOperatorOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_operator_1_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEquationRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"uk.ac.kcl.inf.group19.easySql.EasySql.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEasySql.g:604:3: ( (lv_value_2_0= ruleMultiType ) )
            // InternalEasySql.g:605:4: (lv_value_2_0= ruleMultiType )
            {
            // InternalEasySql.g:605:4: (lv_value_2_0= ruleMultiType )
            // InternalEasySql.g:606:5: lv_value_2_0= ruleMultiType
            {

            					newCompositeNode(grammarAccess.getEquationAccess().getValueMultiTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_value_2_0=ruleMultiType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEquationRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"uk.ac.kcl.inf.group19.easySql.EasySql.MultiType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEasySql.g:623:3: ( (lv_separation_3_0= ',' ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEasySql.g:624:4: (lv_separation_3_0= ',' )
            	    {
            	    // InternalEasySql.g:624:4: (lv_separation_3_0= ',' )
            	    // InternalEasySql.g:625:5: lv_separation_3_0= ','
            	    {
            	    lv_separation_3_0=(Token)match(input,14,FOLLOW_6); 

            	    					newLeafNode(lv_separation_3_0, grammarAccess.getEquationAccess().getSeparationCommaKeyword_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getEquationRule());
            	    					}
            	    					addWithLastConsumed(current, "separation", lv_separation_3_0, ",");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // $ANTLR end "ruleEquation"


    // $ANTLR start "entryRuleVvalue"
    // InternalEasySql.g:641:1: entryRuleVvalue returns [EObject current=null] : iv_ruleVvalue= ruleVvalue EOF ;
    public final EObject entryRuleVvalue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVvalue = null;


        try {
            // InternalEasySql.g:641:47: (iv_ruleVvalue= ruleVvalue EOF )
            // InternalEasySql.g:642:2: iv_ruleVvalue= ruleVvalue EOF
            {
             newCompositeNode(grammarAccess.getVvalueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVvalue=ruleVvalue();

            state._fsp--;

             current =iv_ruleVvalue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVvalue"


    // $ANTLR start "ruleVvalue"
    // InternalEasySql.g:648:1: ruleVvalue returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-' ( (lv_attribute_2_0= ruleMultiType ) ) ( (lv_separation_3_0= ',' ) )* ) ;
    public final EObject ruleVvalue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_separation_3_0=null;
        EObject lv_attribute_2_0 = null;



        	enterRule();

        try {
            // InternalEasySql.g:654:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-' ( (lv_attribute_2_0= ruleMultiType ) ) ( (lv_separation_3_0= ',' ) )* ) )
            // InternalEasySql.g:655:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-' ( (lv_attribute_2_0= ruleMultiType ) ) ( (lv_separation_3_0= ',' ) )* )
            {
            // InternalEasySql.g:655:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-' ( (lv_attribute_2_0= ruleMultiType ) ) ( (lv_separation_3_0= ',' ) )* )
            // InternalEasySql.g:656:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '-' ( (lv_attribute_2_0= ruleMultiType ) ) ( (lv_separation_3_0= ',' ) )*
            {
            // InternalEasySql.g:656:3: ( (otherlv_0= RULE_ID ) )
            // InternalEasySql.g:657:4: (otherlv_0= RULE_ID )
            {
            // InternalEasySql.g:657:4: (otherlv_0= RULE_ID )
            // InternalEasySql.g:658:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVvalueRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getVvalueAccess().getTableTableDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getVvalueAccess().getHyphenMinusKeyword_1());
            		
            // InternalEasySql.g:673:3: ( (lv_attribute_2_0= ruleMultiType ) )
            // InternalEasySql.g:674:4: (lv_attribute_2_0= ruleMultiType )
            {
            // InternalEasySql.g:674:4: (lv_attribute_2_0= ruleMultiType )
            // InternalEasySql.g:675:5: lv_attribute_2_0= ruleMultiType
            {

            					newCompositeNode(grammarAccess.getVvalueAccess().getAttributeMultiTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_attribute_2_0=ruleMultiType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVvalueRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_2_0,
            						"uk.ac.kcl.inf.group19.easySql.EasySql.MultiType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEasySql.g:692:3: ( (lv_separation_3_0= ',' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEasySql.g:693:4: (lv_separation_3_0= ',' )
            	    {
            	    // InternalEasySql.g:693:4: (lv_separation_3_0= ',' )
            	    // InternalEasySql.g:694:5: lv_separation_3_0= ','
            	    {
            	    lv_separation_3_0=(Token)match(input,14,FOLLOW_6); 

            	    					newLeafNode(lv_separation_3_0, grammarAccess.getVvalueAccess().getSeparationCommaKeyword_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getVvalueRule());
            	    					}
            	    					addWithLastConsumed(current, "separation", lv_separation_3_0, ",");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "ruleVvalue"


    // $ANTLR start "entryRuleMultiEquation"
    // InternalEasySql.g:710:1: entryRuleMultiEquation returns [EObject current=null] : iv_ruleMultiEquation= ruleMultiEquation EOF ;
    public final EObject entryRuleMultiEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiEquation = null;


        try {
            // InternalEasySql.g:710:54: (iv_ruleMultiEquation= ruleMultiEquation EOF )
            // InternalEasySql.g:711:2: iv_ruleMultiEquation= ruleMultiEquation EOF
            {
             newCompositeNode(grammarAccess.getMultiEquationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiEquation=ruleMultiEquation();

            state._fsp--;

             current =iv_ruleMultiEquation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiEquation"


    // $ANTLR start "ruleMultiEquation"
    // InternalEasySql.g:717:1: ruleMultiEquation returns [EObject current=null] : ( ( (lv_EquationLeft_0_0= ruleVvalue ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_EquationRight_2_0= ruleVvalue ) ) ) ;
    public final EObject ruleMultiEquation() throws RecognitionException {
        EObject current = null;

        EObject lv_EquationLeft_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_EquationRight_2_0 = null;



        	enterRule();

        try {
            // InternalEasySql.g:723:2: ( ( ( (lv_EquationLeft_0_0= ruleVvalue ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_EquationRight_2_0= ruleVvalue ) ) ) )
            // InternalEasySql.g:724:2: ( ( (lv_EquationLeft_0_0= ruleVvalue ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_EquationRight_2_0= ruleVvalue ) ) )
            {
            // InternalEasySql.g:724:2: ( ( (lv_EquationLeft_0_0= ruleVvalue ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_EquationRight_2_0= ruleVvalue ) ) )
            // InternalEasySql.g:725:3: ( (lv_EquationLeft_0_0= ruleVvalue ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_EquationRight_2_0= ruleVvalue ) )
            {
            // InternalEasySql.g:725:3: ( (lv_EquationLeft_0_0= ruleVvalue ) )
            // InternalEasySql.g:726:4: (lv_EquationLeft_0_0= ruleVvalue )
            {
            // InternalEasySql.g:726:4: (lv_EquationLeft_0_0= ruleVvalue )
            // InternalEasySql.g:727:5: lv_EquationLeft_0_0= ruleVvalue
            {

            					newCompositeNode(grammarAccess.getMultiEquationAccess().getEquationLeftVvalueParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_EquationLeft_0_0=ruleVvalue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiEquationRule());
            					}
            					set(
            						current,
            						"EquationLeft",
            						lv_EquationLeft_0_0,
            						"uk.ac.kcl.inf.group19.easySql.EasySql.Vvalue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEasySql.g:744:3: ( (lv_operator_1_0= ruleOperator ) )
            // InternalEasySql.g:745:4: (lv_operator_1_0= ruleOperator )
            {
            // InternalEasySql.g:745:4: (lv_operator_1_0= ruleOperator )
            // InternalEasySql.g:746:5: lv_operator_1_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getMultiEquationAccess().getOperatorOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_operator_1_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiEquationRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"uk.ac.kcl.inf.group19.easySql.EasySql.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEasySql.g:763:3: ( (lv_EquationRight_2_0= ruleVvalue ) )
            // InternalEasySql.g:764:4: (lv_EquationRight_2_0= ruleVvalue )
            {
            // InternalEasySql.g:764:4: (lv_EquationRight_2_0= ruleVvalue )
            // InternalEasySql.g:765:5: lv_EquationRight_2_0= ruleVvalue
            {

            					newCompositeNode(grammarAccess.getMultiEquationAccess().getEquationRightVvalueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_EquationRight_2_0=ruleVvalue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiEquationRule());
            					}
            					set(
            						current,
            						"EquationRight",
            						lv_EquationRight_2_0,
            						"uk.ac.kcl.inf.group19.easySql.EasySql.Vvalue");
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
    // $ANTLR end "ruleMultiEquation"


    // $ANTLR start "entryRuleInsert"
    // InternalEasySql.g:786:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalEasySql.g:786:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalEasySql.g:787:2: iv_ruleInsert= ruleInsert EOF
            {
             newCompositeNode(grammarAccess.getInsertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsert=ruleInsert();

            state._fsp--;

             current =iv_ruleInsert; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalEasySql.g:793:1: ruleInsert returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Insert(' ( (lv_insert_data_2_0= ruleValue ) )* otherlv_3= ')' ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_insert_data_2_0 = null;



        	enterRule();

        try {
            // InternalEasySql.g:799:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Insert(' ( (lv_insert_data_2_0= ruleValue ) )* otherlv_3= ')' ) )
            // InternalEasySql.g:800:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Insert(' ( (lv_insert_data_2_0= ruleValue ) )* otherlv_3= ')' )
            {
            // InternalEasySql.g:800:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Insert(' ( (lv_insert_data_2_0= ruleValue ) )* otherlv_3= ')' )
            // InternalEasySql.g:801:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Insert(' ( (lv_insert_data_2_0= ruleValue ) )* otherlv_3= ')'
            {
            // InternalEasySql.g:801:3: ( (otherlv_0= RULE_ID ) )
            // InternalEasySql.g:802:4: (otherlv_0= RULE_ID )
            {
            // InternalEasySql.g:802:4: (otherlv_0= RULE_ID )
            // InternalEasySql.g:803:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getTableTableDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getInsertAccess().getInsertKeyword_1());
            		
            // InternalEasySql.g:818:3: ( (lv_insert_data_2_0= ruleValue ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_STRING)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEasySql.g:819:4: (lv_insert_data_2_0= ruleValue )
            	    {
            	    // InternalEasySql.g:819:4: (lv_insert_data_2_0= ruleValue )
            	    // InternalEasySql.g:820:5: lv_insert_data_2_0= ruleValue
            	    {

            	    					newCompositeNode(grammarAccess.getInsertAccess().getInsert_dataValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_insert_data_2_0=ruleValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInsertRule());
            	    					}
            	    					add(
            	    						current,
            	    						"insert_data",
            	    						lv_insert_data_2_0,
            	    						"uk.ac.kcl.inf.group19.easySql.EasySql.Value");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getInsertAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRuleUpdate"
    // InternalEasySql.g:845:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


        try {
            // InternalEasySql.g:845:47: (iv_ruleUpdate= ruleUpdate EOF )
            // InternalEasySql.g:846:2: iv_ruleUpdate= ruleUpdate EOF
            {
             newCompositeNode(grammarAccess.getUpdateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdate=ruleUpdate();

            state._fsp--;

             current =iv_ruleUpdate; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUpdate"


    // $ANTLR start "ruleUpdate"
    // InternalEasySql.g:852:1: ruleUpdate returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Update(' ( (lv_modification_2_0= ruleEquation ) )* otherlv_3= ')' otherlv_4= '.Condition(' ( (lv_updatecondition_5_0= ruleEquation ) )* otherlv_6= ')' ) ;
    public final EObject ruleUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_modification_2_0 = null;

        EObject lv_updatecondition_5_0 = null;



        	enterRule();

        try {
            // InternalEasySql.g:858:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Update(' ( (lv_modification_2_0= ruleEquation ) )* otherlv_3= ')' otherlv_4= '.Condition(' ( (lv_updatecondition_5_0= ruleEquation ) )* otherlv_6= ')' ) )
            // InternalEasySql.g:859:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Update(' ( (lv_modification_2_0= ruleEquation ) )* otherlv_3= ')' otherlv_4= '.Condition(' ( (lv_updatecondition_5_0= ruleEquation ) )* otherlv_6= ')' )
            {
            // InternalEasySql.g:859:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Update(' ( (lv_modification_2_0= ruleEquation ) )* otherlv_3= ')' otherlv_4= '.Condition(' ( (lv_updatecondition_5_0= ruleEquation ) )* otherlv_6= ')' )
            // InternalEasySql.g:860:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Update(' ( (lv_modification_2_0= ruleEquation ) )* otherlv_3= ')' otherlv_4= '.Condition(' ( (lv_updatecondition_5_0= ruleEquation ) )* otherlv_6= ')'
            {
            // InternalEasySql.g:860:3: ( (otherlv_0= RULE_ID ) )
            // InternalEasySql.g:861:4: (otherlv_0= RULE_ID )
            {
            // InternalEasySql.g:861:4: (otherlv_0= RULE_ID )
            // InternalEasySql.g:862:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpdateRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_0, grammarAccess.getUpdateAccess().getTableTableDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateAccess().getUpdateKeyword_1());
            		
            // InternalEasySql.g:877:3: ( (lv_modification_2_0= ruleEquation ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEasySql.g:878:4: (lv_modification_2_0= ruleEquation )
            	    {
            	    // InternalEasySql.g:878:4: (lv_modification_2_0= ruleEquation )
            	    // InternalEasySql.g:879:5: lv_modification_2_0= ruleEquation
            	    {

            	    					newCompositeNode(grammarAccess.getUpdateAccess().getModificationEquationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_modification_2_0=ruleEquation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUpdateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modification",
            	    						lv_modification_2_0,
            	    						"uk.ac.kcl.inf.group19.easySql.EasySql.Equation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getUpdateAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getUpdateAccess().getConditionKeyword_4());
            		
            // InternalEasySql.g:904:3: ( (lv_updatecondition_5_0= ruleEquation ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEasySql.g:905:4: (lv_updatecondition_5_0= ruleEquation )
            	    {
            	    // InternalEasySql.g:905:4: (lv_updatecondition_5_0= ruleEquation )
            	    // InternalEasySql.g:906:5: lv_updatecondition_5_0= ruleEquation
            	    {

            	    					newCompositeNode(grammarAccess.getUpdateAccess().getUpdateconditionEquationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_updatecondition_5_0=ruleEquation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUpdateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"updatecondition",
            	    						lv_updatecondition_5_0,
            	    						"uk.ac.kcl.inf.group19.easySql.EasySql.Equation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getUpdateAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleUpdate"


    // $ANTLR start "entryRuleDelete"
    // InternalEasySql.g:931:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // InternalEasySql.g:931:47: (iv_ruleDelete= ruleDelete EOF )
            // InternalEasySql.g:932:2: iv_ruleDelete= ruleDelete EOF
            {
             newCompositeNode(grammarAccess.getDeleteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelete=ruleDelete();

            state._fsp--;

             current =iv_ruleDelete; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // InternalEasySql.g:938:1: ruleDelete returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Delete(' ( (lv_deletecondition_2_0= ruleEquation ) )* otherlv_3= ')' ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_deletecondition_2_0 = null;



        	enterRule();

        try {
            // InternalEasySql.g:944:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Delete(' ( (lv_deletecondition_2_0= ruleEquation ) )* otherlv_3= ')' ) )
            // InternalEasySql.g:945:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Delete(' ( (lv_deletecondition_2_0= ruleEquation ) )* otherlv_3= ')' )
            {
            // InternalEasySql.g:945:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Delete(' ( (lv_deletecondition_2_0= ruleEquation ) )* otherlv_3= ')' )
            // InternalEasySql.g:946:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Delete(' ( (lv_deletecondition_2_0= ruleEquation ) )* otherlv_3= ')'
            {
            // InternalEasySql.g:946:3: ( (otherlv_0= RULE_ID ) )
            // InternalEasySql.g:947:4: (otherlv_0= RULE_ID )
            {
            // InternalEasySql.g:947:4: (otherlv_0= RULE_ID )
            // InternalEasySql.g:948:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeleteRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getDeleteAccess().getTableTableDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getDeleteKeyword_1());
            		
            // InternalEasySql.g:963:3: ( (lv_deletecondition_2_0= ruleEquation ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEasySql.g:964:4: (lv_deletecondition_2_0= ruleEquation )
            	    {
            	    // InternalEasySql.g:964:4: (lv_deletecondition_2_0= ruleEquation )
            	    // InternalEasySql.g:965:5: lv_deletecondition_2_0= ruleEquation
            	    {

            	    					newCompositeNode(grammarAccess.getDeleteAccess().getDeleteconditionEquationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_deletecondition_2_0=ruleEquation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeleteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"deletecondition",
            	    						lv_deletecondition_2_0,
            	    						"uk.ac.kcl.inf.group19.easySql.EasySql.Equation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDeleteAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleDelete"


    // $ANTLR start "entryRuleSimpleSelectQuery"
    // InternalEasySql.g:990:1: entryRuleSimpleSelectQuery returns [EObject current=null] : iv_ruleSimpleSelectQuery= ruleSimpleSelectQuery EOF ;
    public final EObject entryRuleSimpleSelectQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSelectQuery = null;


        try {
            // InternalEasySql.g:990:58: (iv_ruleSimpleSelectQuery= ruleSimpleSelectQuery EOF )
            // InternalEasySql.g:991:2: iv_ruleSimpleSelectQuery= ruleSimpleSelectQuery EOF
            {
             newCompositeNode(grammarAccess.getSimpleSelectQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleSelectQuery=ruleSimpleSelectQuery();

            state._fsp--;

             current =iv_ruleSimpleSelectQuery; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSimpleSelectQuery"


    // $ANTLR start "ruleSimpleSelectQuery"
    // InternalEasySql.g:997:1: ruleSimpleSelectQuery returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Search(' ( (lv_Sattributes_2_0= ruleValue ) )* otherlv_3= ')' otherlv_4= '.Condition(' ( (lv_simplecondition_5_0= ruleEquation ) )* otherlv_6= ')' ( (lv_removeDup_7_0= '.RemoveDuplication()' ) )? (otherlv_8= '.' ( (lv_ordertype_9_0= ruleOrder ) ) otherlv_10= '(' ( (lv_SCattributes_11_0= ruleValue ) )* otherlv_12= ')' )? ) ;
    public final EObject ruleSimpleSelectQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_removeDup_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_Sattributes_2_0 = null;

        EObject lv_simplecondition_5_0 = null;

        Enumerator lv_ordertype_9_0 = null;

        EObject lv_SCattributes_11_0 = null;



        	enterRule();

        try {
            // InternalEasySql.g:1003:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Search(' ( (lv_Sattributes_2_0= ruleValue ) )* otherlv_3= ')' otherlv_4= '.Condition(' ( (lv_simplecondition_5_0= ruleEquation ) )* otherlv_6= ')' ( (lv_removeDup_7_0= '.RemoveDuplication()' ) )? (otherlv_8= '.' ( (lv_ordertype_9_0= ruleOrder ) ) otherlv_10= '(' ( (lv_SCattributes_11_0= ruleValue ) )* otherlv_12= ')' )? ) )
            // InternalEasySql.g:1004:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Search(' ( (lv_Sattributes_2_0= ruleValue ) )* otherlv_3= ')' otherlv_4= '.Condition(' ( (lv_simplecondition_5_0= ruleEquation ) )* otherlv_6= ')' ( (lv_removeDup_7_0= '.RemoveDuplication()' ) )? (otherlv_8= '.' ( (lv_ordertype_9_0= ruleOrder ) ) otherlv_10= '(' ( (lv_SCattributes_11_0= ruleValue ) )* otherlv_12= ')' )? )
            {
            // InternalEasySql.g:1004:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Search(' ( (lv_Sattributes_2_0= ruleValue ) )* otherlv_3= ')' otherlv_4= '.Condition(' ( (lv_simplecondition_5_0= ruleEquation ) )* otherlv_6= ')' ( (lv_removeDup_7_0= '.RemoveDuplication()' ) )? (otherlv_8= '.' ( (lv_ordertype_9_0= ruleOrder ) ) otherlv_10= '(' ( (lv_SCattributes_11_0= ruleValue ) )* otherlv_12= ')' )? )
            // InternalEasySql.g:1005:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Search(' ( (lv_Sattributes_2_0= ruleValue ) )* otherlv_3= ')' otherlv_4= '.Condition(' ( (lv_simplecondition_5_0= ruleEquation ) )* otherlv_6= ')' ( (lv_removeDup_7_0= '.RemoveDuplication()' ) )? (otherlv_8= '.' ( (lv_ordertype_9_0= ruleOrder ) ) otherlv_10= '(' ( (lv_SCattributes_11_0= ruleValue ) )* otherlv_12= ')' )?
            {
            // InternalEasySql.g:1005:3: ( (otherlv_0= RULE_ID ) )
            // InternalEasySql.g:1006:4: (otherlv_0= RULE_ID )
            {
            // InternalEasySql.g:1006:4: (otherlv_0= RULE_ID )
            // InternalEasySql.g:1007:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleSelectQueryRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_0, grammarAccess.getSimpleSelectQueryAccess().getStableTableDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleSelectQueryAccess().getSearchKeyword_1());
            		
            // InternalEasySql.g:1022:3: ( (lv_Sattributes_2_0= ruleValue ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_INT && LA13_0<=RULE_STRING)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEasySql.g:1023:4: (lv_Sattributes_2_0= ruleValue )
            	    {
            	    // InternalEasySql.g:1023:4: (lv_Sattributes_2_0= ruleValue )
            	    // InternalEasySql.g:1024:5: lv_Sattributes_2_0= ruleValue
            	    {

            	    					newCompositeNode(grammarAccess.getSimpleSelectQueryAccess().getSattributesValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_Sattributes_2_0=ruleValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSimpleSelectQueryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Sattributes",
            	    						lv_Sattributes_2_0,
            	    						"uk.ac.kcl.inf.group19.easySql.EasySql.Value");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleSelectQueryAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getSimpleSelectQueryAccess().getConditionKeyword_4());
            		
            // InternalEasySql.g:1049:3: ( (lv_simplecondition_5_0= ruleEquation ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEasySql.g:1050:4: (lv_simplecondition_5_0= ruleEquation )
            	    {
            	    // InternalEasySql.g:1050:4: (lv_simplecondition_5_0= ruleEquation )
            	    // InternalEasySql.g:1051:5: lv_simplecondition_5_0= ruleEquation
            	    {

            	    					newCompositeNode(grammarAccess.getSimpleSelectQueryAccess().getSimpleconditionEquationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_simplecondition_5_0=ruleEquation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSimpleSelectQueryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"simplecondition",
            	    						lv_simplecondition_5_0,
            	    						"uk.ac.kcl.inf.group19.easySql.EasySql.Equation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getSimpleSelectQueryAccess().getRightParenthesisKeyword_6());
            		
            // InternalEasySql.g:1072:3: ( (lv_removeDup_7_0= '.RemoveDuplication()' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEasySql.g:1073:4: (lv_removeDup_7_0= '.RemoveDuplication()' )
                    {
                    // InternalEasySql.g:1073:4: (lv_removeDup_7_0= '.RemoveDuplication()' )
                    // InternalEasySql.g:1074:5: lv_removeDup_7_0= '.RemoveDuplication()'
                    {
                    lv_removeDup_7_0=(Token)match(input,22,FOLLOW_18); 

                    					newLeafNode(lv_removeDup_7_0, grammarAccess.getSimpleSelectQueryAccess().getRemoveDupRemoveDuplicationKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleSelectQueryRule());
                    					}
                    					addWithLastConsumed(current, "removeDup", lv_removeDup_7_0, ".RemoveDuplication()");
                    				

                    }


                    }
                    break;

            }

            // InternalEasySql.g:1086:3: (otherlv_8= '.' ( (lv_ordertype_9_0= ruleOrder ) ) otherlv_10= '(' ( (lv_SCattributes_11_0= ruleValue ) )* otherlv_12= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEasySql.g:1087:4: otherlv_8= '.' ( (lv_ordertype_9_0= ruleOrder ) ) otherlv_10= '(' ( (lv_SCattributes_11_0= ruleValue ) )* otherlv_12= ')'
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getSimpleSelectQueryAccess().getFullStopKeyword_8_0());
                    			
                    // InternalEasySql.g:1091:4: ( (lv_ordertype_9_0= ruleOrder ) )
                    // InternalEasySql.g:1092:5: (lv_ordertype_9_0= ruleOrder )
                    {
                    // InternalEasySql.g:1092:5: (lv_ordertype_9_0= ruleOrder )
                    // InternalEasySql.g:1093:6: lv_ordertype_9_0= ruleOrder
                    {

                    						newCompositeNode(grammarAccess.getSimpleSelectQueryAccess().getOrdertypeOrderEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_ordertype_9_0=ruleOrder();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleSelectQueryRule());
                    						}
                    						set(
                    							current,
                    							"ordertype",
                    							lv_ordertype_9_0,
                    							"uk.ac.kcl.inf.group19.easySql.EasySql.Order");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,24,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getSimpleSelectQueryAccess().getLeftParenthesisKeyword_8_2());
                    			
                    // InternalEasySql.g:1114:4: ( (lv_SCattributes_11_0= ruleValue ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=RULE_INT && LA16_0<=RULE_STRING)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalEasySql.g:1115:5: (lv_SCattributes_11_0= ruleValue )
                    	    {
                    	    // InternalEasySql.g:1115:5: (lv_SCattributes_11_0= ruleValue )
                    	    // InternalEasySql.g:1116:6: lv_SCattributes_11_0= ruleValue
                    	    {

                    	    						newCompositeNode(grammarAccess.getSimpleSelectQueryAccess().getSCattributesValueParserRuleCall_8_3_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_SCattributes_11_0=ruleValue();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSimpleSelectQueryRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"SCattributes",
                    	    							lv_SCattributes_11_0,
                    	    							"uk.ac.kcl.inf.group19.easySql.EasySql.Value");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getSimpleSelectQueryAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleSimpleSelectQuery"


    // $ANTLR start "entryRuleJoinQuery"
    // InternalEasySql.g:1142:1: entryRuleJoinQuery returns [EObject current=null] : iv_ruleJoinQuery= ruleJoinQuery EOF ;
    public final EObject entryRuleJoinQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinQuery = null;


        try {
            // InternalEasySql.g:1142:50: (iv_ruleJoinQuery= ruleJoinQuery EOF )
            // InternalEasySql.g:1143:2: iv_ruleJoinQuery= ruleJoinQuery EOF
            {
             newCompositeNode(grammarAccess.getJoinQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoinQuery=ruleJoinQuery();

            state._fsp--;

             current =iv_ruleJoinQuery; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJoinQuery"


    // $ANTLR start "ruleJoinQuery"
    // InternalEasySql.g:1149:1: ruleJoinQuery returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Joinsearch(' ( (lv_Jattributes_2_0= ruleVvalue ) )* otherlv_3= ')' otherlv_4= '.' ( (lv_jointype_5_0= ruleJoin ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' otherlv_9= '.On(' ( (lv_joincondition_10_0= ruleMultiEquation ) )* otherlv_11= ')' ) ;
    public final EObject ruleJoinQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_Jattributes_2_0 = null;

        Enumerator lv_jointype_5_0 = null;

        EObject lv_joincondition_10_0 = null;



        	enterRule();

        try {
            // InternalEasySql.g:1155:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Joinsearch(' ( (lv_Jattributes_2_0= ruleVvalue ) )* otherlv_3= ')' otherlv_4= '.' ( (lv_jointype_5_0= ruleJoin ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' otherlv_9= '.On(' ( (lv_joincondition_10_0= ruleMultiEquation ) )* otherlv_11= ')' ) )
            // InternalEasySql.g:1156:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Joinsearch(' ( (lv_Jattributes_2_0= ruleVvalue ) )* otherlv_3= ')' otherlv_4= '.' ( (lv_jointype_5_0= ruleJoin ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' otherlv_9= '.On(' ( (lv_joincondition_10_0= ruleMultiEquation ) )* otherlv_11= ')' )
            {
            // InternalEasySql.g:1156:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Joinsearch(' ( (lv_Jattributes_2_0= ruleVvalue ) )* otherlv_3= ')' otherlv_4= '.' ( (lv_jointype_5_0= ruleJoin ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' otherlv_9= '.On(' ( (lv_joincondition_10_0= ruleMultiEquation ) )* otherlv_11= ')' )
            // InternalEasySql.g:1157:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Joinsearch(' ( (lv_Jattributes_2_0= ruleVvalue ) )* otherlv_3= ')' otherlv_4= '.' ( (lv_jointype_5_0= ruleJoin ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' otherlv_9= '.On(' ( (lv_joincondition_10_0= ruleMultiEquation ) )* otherlv_11= ')'
            {
            // InternalEasySql.g:1157:3: ( (otherlv_0= RULE_ID ) )
            // InternalEasySql.g:1158:4: (otherlv_0= RULE_ID )
            {
            // InternalEasySql.g:1158:4: (otherlv_0= RULE_ID )
            // InternalEasySql.g:1159:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoinQueryRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_0, grammarAccess.getJoinQueryAccess().getJtable1TableDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getJoinQueryAccess().getJoinsearchKeyword_1());
            		
            // InternalEasySql.g:1174:3: ( (lv_Jattributes_2_0= ruleVvalue ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalEasySql.g:1175:4: (lv_Jattributes_2_0= ruleVvalue )
            	    {
            	    // InternalEasySql.g:1175:4: (lv_Jattributes_2_0= ruleVvalue )
            	    // InternalEasySql.g:1176:5: lv_Jattributes_2_0= ruleVvalue
            	    {

            	    					newCompositeNode(grammarAccess.getJoinQueryAccess().getJattributesVvalueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_Jattributes_2_0=ruleVvalue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJoinQueryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Jattributes",
            	    						lv_Jattributes_2_0,
            	    						"uk.ac.kcl.inf.group19.easySql.EasySql.Vvalue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getJoinQueryAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getJoinQueryAccess().getFullStopKeyword_4());
            		
            // InternalEasySql.g:1201:3: ( (lv_jointype_5_0= ruleJoin ) )
            // InternalEasySql.g:1202:4: (lv_jointype_5_0= ruleJoin )
            {
            // InternalEasySql.g:1202:4: (lv_jointype_5_0= ruleJoin )
            // InternalEasySql.g:1203:5: lv_jointype_5_0= ruleJoin
            {

            					newCompositeNode(grammarAccess.getJoinQueryAccess().getJointypeJoinEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_20);
            lv_jointype_5_0=ruleJoin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJoinQueryRule());
            					}
            					set(
            						current,
            						"jointype",
            						lv_jointype_5_0,
            						"uk.ac.kcl.inf.group19.easySql.EasySql.Join");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getJoinQueryAccess().getLeftParenthesisKeyword_6());
            		
            // InternalEasySql.g:1224:3: ( (otherlv_7= RULE_ID ) )
            // InternalEasySql.g:1225:4: (otherlv_7= RULE_ID )
            {
            // InternalEasySql.g:1225:4: (otherlv_7= RULE_ID )
            // InternalEasySql.g:1226:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoinQueryRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_7, grammarAccess.getJoinQueryAccess().getJtable2TableDeclarationCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_25); 

            			newLeafNode(otherlv_8, grammarAccess.getJoinQueryAccess().getRightParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getJoinQueryAccess().getOnKeyword_9());
            		
            // InternalEasySql.g:1245:3: ( (lv_joincondition_10_0= ruleMultiEquation ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalEasySql.g:1246:4: (lv_joincondition_10_0= ruleMultiEquation )
            	    {
            	    // InternalEasySql.g:1246:4: (lv_joincondition_10_0= ruleMultiEquation )
            	    // InternalEasySql.g:1247:5: lv_joincondition_10_0= ruleMultiEquation
            	    {

            	    					newCompositeNode(grammarAccess.getJoinQueryAccess().getJoinconditionMultiEquationParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_joincondition_10_0=ruleMultiEquation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJoinQueryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"joincondition",
            	    						lv_joincondition_10_0,
            	    						"uk.ac.kcl.inf.group19.easySql.EasySql.MultiEquation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getJoinQueryAccess().getRightParenthesisKeyword_11());
            		

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
    // $ANTLR end "ruleJoinQuery"


    // $ANTLR start "entryRuleNestedQuery"
    // InternalEasySql.g:1272:1: entryRuleNestedQuery returns [EObject current=null] : iv_ruleNestedQuery= ruleNestedQuery EOF ;
    public final EObject entryRuleNestedQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedQuery = null;


        try {
            // InternalEasySql.g:1272:52: (iv_ruleNestedQuery= ruleNestedQuery EOF )
            // InternalEasySql.g:1273:2: iv_ruleNestedQuery= ruleNestedQuery EOF
            {
             newCompositeNode(grammarAccess.getNestedQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNestedQuery=ruleNestedQuery();

            state._fsp--;

             current =iv_ruleNestedQuery; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNestedQuery"


    // $ANTLR start "ruleNestedQuery"
    // InternalEasySql.g:1279:1: ruleNestedQuery returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Subsearch(' ( (lv_Nattributes_2_0= ruleValue ) )* otherlv_3= ')' otherlv_4= '.When(' ( (lv_Nattributes1_5_0= ruleValue ) )* otherlv_6= ')' otherlv_7= '.In(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) ;
    public final EObject ruleNestedQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_Nattributes_2_0 = null;

        EObject lv_Nattributes1_5_0 = null;



        	enterRule();

        try {
            // InternalEasySql.g:1285:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Subsearch(' ( (lv_Nattributes_2_0= ruleValue ) )* otherlv_3= ')' otherlv_4= '.When(' ( (lv_Nattributes1_5_0= ruleValue ) )* otherlv_6= ')' otherlv_7= '.In(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) )
            // InternalEasySql.g:1286:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Subsearch(' ( (lv_Nattributes_2_0= ruleValue ) )* otherlv_3= ')' otherlv_4= '.When(' ( (lv_Nattributes1_5_0= ruleValue ) )* otherlv_6= ')' otherlv_7= '.In(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
            {
            // InternalEasySql.g:1286:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Subsearch(' ( (lv_Nattributes_2_0= ruleValue ) )* otherlv_3= ')' otherlv_4= '.When(' ( (lv_Nattributes1_5_0= ruleValue ) )* otherlv_6= ')' otherlv_7= '.In(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
            // InternalEasySql.g:1287:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.Subsearch(' ( (lv_Nattributes_2_0= ruleValue ) )* otherlv_3= ')' otherlv_4= '.When(' ( (lv_Nattributes1_5_0= ruleValue ) )* otherlv_6= ')' otherlv_7= '.In(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')'
            {
            // InternalEasySql.g:1287:3: ( (otherlv_0= RULE_ID ) )
            // InternalEasySql.g:1288:4: (otherlv_0= RULE_ID )
            {
            // InternalEasySql.g:1288:4: (otherlv_0= RULE_ID )
            // InternalEasySql.g:1289:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNestedQueryRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_0, grammarAccess.getNestedQueryAccess().getNtableTableDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getNestedQueryAccess().getSubsearchKeyword_1());
            		
            // InternalEasySql.g:1304:3: ( (lv_Nattributes_2_0= ruleValue ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_INT && LA20_0<=RULE_STRING)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalEasySql.g:1305:4: (lv_Nattributes_2_0= ruleValue )
            	    {
            	    // InternalEasySql.g:1305:4: (lv_Nattributes_2_0= ruleValue )
            	    // InternalEasySql.g:1306:5: lv_Nattributes_2_0= ruleValue
            	    {

            	    					newCompositeNode(grammarAccess.getNestedQueryAccess().getNattributesValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_Nattributes_2_0=ruleValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNestedQueryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Nattributes",
            	    						lv_Nattributes_2_0,
            	    						"uk.ac.kcl.inf.group19.easySql.EasySql.Value");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getNestedQueryAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getNestedQueryAccess().getWhenKeyword_4());
            		
            // InternalEasySql.g:1331:3: ( (lv_Nattributes1_5_0= ruleValue ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_INT && LA21_0<=RULE_STRING)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalEasySql.g:1332:4: (lv_Nattributes1_5_0= ruleValue )
            	    {
            	    // InternalEasySql.g:1332:4: (lv_Nattributes1_5_0= ruleValue )
            	    // InternalEasySql.g:1333:5: lv_Nattributes1_5_0= ruleValue
            	    {

            	    					newCompositeNode(grammarAccess.getNestedQueryAccess().getNattributes1ValueParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_Nattributes1_5_0=ruleValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNestedQueryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Nattributes1",
            	    						lv_Nattributes1_5_0,
            	    						"uk.ac.kcl.inf.group19.easySql.EasySql.Value");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_28); 

            			newLeafNode(otherlv_6, grammarAccess.getNestedQueryAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getNestedQueryAccess().getInKeyword_7());
            		
            // InternalEasySql.g:1358:3: ( (otherlv_8= RULE_ID ) )
            // InternalEasySql.g:1359:4: (otherlv_8= RULE_ID )
            {
            // InternalEasySql.g:1359:4: (otherlv_8= RULE_ID )
            // InternalEasySql.g:1360:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNestedQueryRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_8, grammarAccess.getNestedQueryAccess().getSubselectquerySingleSelectDeclarationCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getNestedQueryAccess().getRightParenthesisKeyword_9());
            		

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
    // $ANTLR end "ruleNestedQuery"


    // $ANTLR start "ruleOperator"
    // InternalEasySql.g:1379:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '!=' ) | (enumLiteral_5= '=' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalEasySql.g:1385:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '!=' ) | (enumLiteral_5= '=' ) ) )
            // InternalEasySql.g:1386:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '!=' ) | (enumLiteral_5= '=' ) )
            {
            // InternalEasySql.g:1386:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '!=' ) | (enumLiteral_5= '=' ) )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt22=1;
                }
                break;
            case 31:
                {
                alt22=2;
                }
                break;
            case 32:
                {
                alt22=3;
                }
                break;
            case 33:
                {
                alt22=4;
                }
                break;
            case 34:
                {
                alt22=5;
                }
                break;
            case 13:
                {
                alt22=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalEasySql.g:1387:3: (enumLiteral_0= '>' )
                    {
                    // InternalEasySql.g:1387:3: (enumLiteral_0= '>' )
                    // InternalEasySql.g:1388:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getVaEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getVaEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEasySql.g:1395:3: (enumLiteral_1= '<' )
                    {
                    // InternalEasySql.g:1395:3: (enumLiteral_1= '<' )
                    // InternalEasySql.g:1396:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getVbEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getVbEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEasySql.g:1403:3: (enumLiteral_2= '>=' )
                    {
                    // InternalEasySql.g:1403:3: (enumLiteral_2= '>=' )
                    // InternalEasySql.g:1404:4: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getVcEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getVcEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEasySql.g:1411:3: (enumLiteral_3= '<=' )
                    {
                    // InternalEasySql.g:1411:3: (enumLiteral_3= '<=' )
                    // InternalEasySql.g:1412:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getVdEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getVdEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEasySql.g:1419:3: (enumLiteral_4= '!=' )
                    {
                    // InternalEasySql.g:1419:3: (enumLiteral_4= '!=' )
                    // InternalEasySql.g:1420:4: enumLiteral_4= '!='
                    {
                    enumLiteral_4=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getVeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getVeEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalEasySql.g:1427:3: (enumLiteral_5= '=' )
                    {
                    // InternalEasySql.g:1427:3: (enumLiteral_5= '=' )
                    // InternalEasySql.g:1428:4: enumLiteral_5= '='
                    {
                    enumLiteral_5=(Token)match(input,13,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getVfEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOperatorAccess().getVfEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleJoin"
    // InternalEasySql.g:1438:1: ruleJoin returns [Enumerator current=null] : ( (enumLiteral_0= 'left_join' ) | (enumLiteral_1= 'right_join' ) | (enumLiteral_2= 'full_join' ) | (enumLiteral_3= 'inner_join' ) ) ;
    public final Enumerator ruleJoin() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalEasySql.g:1444:2: ( ( (enumLiteral_0= 'left_join' ) | (enumLiteral_1= 'right_join' ) | (enumLiteral_2= 'full_join' ) | (enumLiteral_3= 'inner_join' ) ) )
            // InternalEasySql.g:1445:2: ( (enumLiteral_0= 'left_join' ) | (enumLiteral_1= 'right_join' ) | (enumLiteral_2= 'full_join' ) | (enumLiteral_3= 'inner_join' ) )
            {
            // InternalEasySql.g:1445:2: ( (enumLiteral_0= 'left_join' ) | (enumLiteral_1= 'right_join' ) | (enumLiteral_2= 'full_join' ) | (enumLiteral_3= 'inner_join' ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt23=1;
                }
                break;
            case 36:
                {
                alt23=2;
                }
                break;
            case 37:
                {
                alt23=3;
                }
                break;
            case 38:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalEasySql.g:1446:3: (enumLiteral_0= 'left_join' )
                    {
                    // InternalEasySql.g:1446:3: (enumLiteral_0= 'left_join' )
                    // InternalEasySql.g:1447:4: enumLiteral_0= 'left_join'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getJoinAccess().getLeft_joinEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJoinAccess().getLeft_joinEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEasySql.g:1454:3: (enumLiteral_1= 'right_join' )
                    {
                    // InternalEasySql.g:1454:3: (enumLiteral_1= 'right_join' )
                    // InternalEasySql.g:1455:4: enumLiteral_1= 'right_join'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getJoinAccess().getRight_joinEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJoinAccess().getRight_joinEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEasySql.g:1462:3: (enumLiteral_2= 'full_join' )
                    {
                    // InternalEasySql.g:1462:3: (enumLiteral_2= 'full_join' )
                    // InternalEasySql.g:1463:4: enumLiteral_2= 'full_join'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getJoinAccess().getFull_joinEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJoinAccess().getFull_joinEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEasySql.g:1470:3: (enumLiteral_3= 'inner_join' )
                    {
                    // InternalEasySql.g:1470:3: (enumLiteral_3= 'inner_join' )
                    // InternalEasySql.g:1471:4: enumLiteral_3= 'inner_join'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getJoinAccess().getInner_joinEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getJoinAccess().getInner_joinEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleJoin"


    // $ANTLR start "ruleOrder"
    // InternalEasySql.g:1481:1: ruleOrder returns [Enumerator current=null] : ( (enumLiteral_0= 'ascending' ) | (enumLiteral_1= 'descending' ) ) ;
    public final Enumerator ruleOrder() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEasySql.g:1487:2: ( ( (enumLiteral_0= 'ascending' ) | (enumLiteral_1= 'descending' ) ) )
            // InternalEasySql.g:1488:2: ( (enumLiteral_0= 'ascending' ) | (enumLiteral_1= 'descending' ) )
            {
            // InternalEasySql.g:1488:2: ( (enumLiteral_0= 'ascending' ) | (enumLiteral_1= 'descending' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            else if ( (LA24_0==40) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalEasySql.g:1489:3: (enumLiteral_0= 'ascending' )
                    {
                    // InternalEasySql.g:1489:3: (enumLiteral_0= 'ascending' )
                    // InternalEasySql.g:1490:4: enumLiteral_0= 'ascending'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getOrderAccess().getAscendingEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOrderAccess().getAscendingEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEasySql.g:1497:3: (enumLiteral_1= 'descending' )
                    {
                    // InternalEasySql.g:1497:3: (enumLiteral_1= 'descending' )
                    // InternalEasySql.g:1498:4: enumLiteral_1= 'descending'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getOrderAccess().getDescendingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOrderAccess().getDescendingEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleOrder"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001822L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000007C0002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000007800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});

}