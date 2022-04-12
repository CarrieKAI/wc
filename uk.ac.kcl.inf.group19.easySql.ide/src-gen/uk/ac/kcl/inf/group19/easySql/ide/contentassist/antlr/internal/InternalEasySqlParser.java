package uk.ac.kcl.inf.group19.easySql.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.inf.group19.easySql.services.EasySqlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEasySqlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'>'", "'<'", "'>='", "'<='", "'!='", "'='", "'left_join'", "'right_join'", "'full_join'", "'inner_join'", "'ascending'", "'descending'", "'Table'", "'var'", "'-'", "'.Insert('", "')'", "'.Update('", "'.Condition('", "'.Delete('", "'.Search('", "'.'", "'('", "'.Joinsearch('", "'.On('", "'.Subsearch('", "'.When('", "'.In('", "','", "'.RemoveDuplication()'"
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

    	public void setGrammarAccess(EasySqlGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSqlProgram"
    // InternalEasySql.g:53:1: entryRuleSqlProgram : ruleSqlProgram EOF ;
    public final void entryRuleSqlProgram() throws RecognitionException {
        try {
            // InternalEasySql.g:54:1: ( ruleSqlProgram EOF )
            // InternalEasySql.g:55:1: ruleSqlProgram EOF
            {
             before(grammarAccess.getSqlProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleSqlProgram();

            state._fsp--;

             after(grammarAccess.getSqlProgramRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSqlProgram"


    // $ANTLR start "ruleSqlProgram"
    // InternalEasySql.g:62:1: ruleSqlProgram : ( ( rule__SqlProgram__StatementsAssignment )* ) ;
    public final void ruleSqlProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:66:2: ( ( ( rule__SqlProgram__StatementsAssignment )* ) )
            // InternalEasySql.g:67:2: ( ( rule__SqlProgram__StatementsAssignment )* )
            {
            // InternalEasySql.g:67:2: ( ( rule__SqlProgram__StatementsAssignment )* )
            // InternalEasySql.g:68:3: ( rule__SqlProgram__StatementsAssignment )*
            {
             before(grammarAccess.getSqlProgramAccess().getStatementsAssignment()); 
            // InternalEasySql.g:69:3: ( rule__SqlProgram__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=23 && LA1_0<=24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEasySql.g:69:4: rule__SqlProgram__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__SqlProgram__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSqlProgramAccess().getStatementsAssignment()); 

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
    // $ANTLR end "ruleSqlProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalEasySql.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalEasySql.g:79:1: ( ruleStatement EOF )
            // InternalEasySql.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalEasySql.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalEasySql.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalEasySql.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalEasySql.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalEasySql.g:94:3: ( rule__Statement__Alternatives )
            // InternalEasySql.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleQueryStatement"
    // InternalEasySql.g:103:1: entryRuleQueryStatement : ruleQueryStatement EOF ;
    public final void entryRuleQueryStatement() throws RecognitionException {
        try {
            // InternalEasySql.g:104:1: ( ruleQueryStatement EOF )
            // InternalEasySql.g:105:1: ruleQueryStatement EOF
            {
             before(grammarAccess.getQueryStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryStatement();

            state._fsp--;

             after(grammarAccess.getQueryStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQueryStatement"


    // $ANTLR start "ruleQueryStatement"
    // InternalEasySql.g:112:1: ruleQueryStatement : ( ( rule__QueryStatement__Alternatives ) ) ;
    public final void ruleQueryStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:116:2: ( ( ( rule__QueryStatement__Alternatives ) ) )
            // InternalEasySql.g:117:2: ( ( rule__QueryStatement__Alternatives ) )
            {
            // InternalEasySql.g:117:2: ( ( rule__QueryStatement__Alternatives ) )
            // InternalEasySql.g:118:3: ( rule__QueryStatement__Alternatives )
            {
             before(grammarAccess.getQueryStatementAccess().getAlternatives()); 
            // InternalEasySql.g:119:3: ( rule__QueryStatement__Alternatives )
            // InternalEasySql.g:119:4: rule__QueryStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__QueryStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQueryStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleQueryStatement"


    // $ANTLR start "entryRuleManipulateStatement"
    // InternalEasySql.g:128:1: entryRuleManipulateStatement : ruleManipulateStatement EOF ;
    public final void entryRuleManipulateStatement() throws RecognitionException {
        try {
            // InternalEasySql.g:129:1: ( ruleManipulateStatement EOF )
            // InternalEasySql.g:130:1: ruleManipulateStatement EOF
            {
             before(grammarAccess.getManipulateStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleManipulateStatement();

            state._fsp--;

             after(grammarAccess.getManipulateStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleManipulateStatement"


    // $ANTLR start "ruleManipulateStatement"
    // InternalEasySql.g:137:1: ruleManipulateStatement : ( ( rule__ManipulateStatement__Alternatives ) ) ;
    public final void ruleManipulateStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:141:2: ( ( ( rule__ManipulateStatement__Alternatives ) ) )
            // InternalEasySql.g:142:2: ( ( rule__ManipulateStatement__Alternatives ) )
            {
            // InternalEasySql.g:142:2: ( ( rule__ManipulateStatement__Alternatives ) )
            // InternalEasySql.g:143:3: ( rule__ManipulateStatement__Alternatives )
            {
             before(grammarAccess.getManipulateStatementAccess().getAlternatives()); 
            // InternalEasySql.g:144:3: ( rule__ManipulateStatement__Alternatives )
            // InternalEasySql.g:144:4: rule__ManipulateStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ManipulateStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getManipulateStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleManipulateStatement"


    // $ANTLR start "entryRuleMultiType"
    // InternalEasySql.g:153:1: entryRuleMultiType : ruleMultiType EOF ;
    public final void entryRuleMultiType() throws RecognitionException {
        try {
            // InternalEasySql.g:154:1: ( ruleMultiType EOF )
            // InternalEasySql.g:155:1: ruleMultiType EOF
            {
             before(grammarAccess.getMultiTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiType();

            state._fsp--;

             after(grammarAccess.getMultiTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiType"


    // $ANTLR start "ruleMultiType"
    // InternalEasySql.g:162:1: ruleMultiType : ( ( rule__MultiType__Alternatives ) ) ;
    public final void ruleMultiType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:166:2: ( ( ( rule__MultiType__Alternatives ) ) )
            // InternalEasySql.g:167:2: ( ( rule__MultiType__Alternatives ) )
            {
            // InternalEasySql.g:167:2: ( ( rule__MultiType__Alternatives ) )
            // InternalEasySql.g:168:3: ( rule__MultiType__Alternatives )
            {
             before(grammarAccess.getMultiTypeAccess().getAlternatives()); 
            // InternalEasySql.g:169:3: ( rule__MultiType__Alternatives )
            // InternalEasySql.g:169:4: rule__MultiType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MultiType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMultiType"


    // $ANTLR start "entryRuleNumLiteral"
    // InternalEasySql.g:178:1: entryRuleNumLiteral : ruleNumLiteral EOF ;
    public final void entryRuleNumLiteral() throws RecognitionException {
        try {
            // InternalEasySql.g:179:1: ( ruleNumLiteral EOF )
            // InternalEasySql.g:180:1: ruleNumLiteral EOF
            {
             before(grammarAccess.getNumLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleNumLiteral();

            state._fsp--;

             after(grammarAccess.getNumLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumLiteral"


    // $ANTLR start "ruleNumLiteral"
    // InternalEasySql.g:187:1: ruleNumLiteral : ( ( rule__NumLiteral__VarAssignment ) ) ;
    public final void ruleNumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:191:2: ( ( ( rule__NumLiteral__VarAssignment ) ) )
            // InternalEasySql.g:192:2: ( ( rule__NumLiteral__VarAssignment ) )
            {
            // InternalEasySql.g:192:2: ( ( rule__NumLiteral__VarAssignment ) )
            // InternalEasySql.g:193:3: ( rule__NumLiteral__VarAssignment )
            {
             before(grammarAccess.getNumLiteralAccess().getVarAssignment()); 
            // InternalEasySql.g:194:3: ( rule__NumLiteral__VarAssignment )
            // InternalEasySql.g:194:4: rule__NumLiteral__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumLiteral__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumLiteralAccess().getVarAssignment()); 

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
    // $ANTLR end "ruleNumLiteral"


    // $ANTLR start "entryRuleStrLiteral"
    // InternalEasySql.g:203:1: entryRuleStrLiteral : ruleStrLiteral EOF ;
    public final void entryRuleStrLiteral() throws RecognitionException {
        try {
            // InternalEasySql.g:204:1: ( ruleStrLiteral EOF )
            // InternalEasySql.g:205:1: ruleStrLiteral EOF
            {
             before(grammarAccess.getStrLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStrLiteral();

            state._fsp--;

             after(grammarAccess.getStrLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStrLiteral"


    // $ANTLR start "ruleStrLiteral"
    // InternalEasySql.g:212:1: ruleStrLiteral : ( ( rule__StrLiteral__VarAssignment ) ) ;
    public final void ruleStrLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:216:2: ( ( ( rule__StrLiteral__VarAssignment ) ) )
            // InternalEasySql.g:217:2: ( ( rule__StrLiteral__VarAssignment ) )
            {
            // InternalEasySql.g:217:2: ( ( rule__StrLiteral__VarAssignment ) )
            // InternalEasySql.g:218:3: ( rule__StrLiteral__VarAssignment )
            {
             before(grammarAccess.getStrLiteralAccess().getVarAssignment()); 
            // InternalEasySql.g:219:3: ( rule__StrLiteral__VarAssignment )
            // InternalEasySql.g:219:4: rule__StrLiteral__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StrLiteral__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStrLiteralAccess().getVarAssignment()); 

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
    // $ANTLR end "ruleStrLiteral"


    // $ANTLR start "entryRuleRinLiteral"
    // InternalEasySql.g:228:1: entryRuleRinLiteral : ruleRinLiteral EOF ;
    public final void entryRuleRinLiteral() throws RecognitionException {
        try {
            // InternalEasySql.g:229:1: ( ruleRinLiteral EOF )
            // InternalEasySql.g:230:1: ruleRinLiteral EOF
            {
             before(grammarAccess.getRinLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleRinLiteral();

            state._fsp--;

             after(grammarAccess.getRinLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRinLiteral"


    // $ANTLR start "ruleRinLiteral"
    // InternalEasySql.g:237:1: ruleRinLiteral : ( ( rule__RinLiteral__VarAssignment ) ) ;
    public final void ruleRinLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:241:2: ( ( ( rule__RinLiteral__VarAssignment ) ) )
            // InternalEasySql.g:242:2: ( ( rule__RinLiteral__VarAssignment ) )
            {
            // InternalEasySql.g:242:2: ( ( rule__RinLiteral__VarAssignment ) )
            // InternalEasySql.g:243:3: ( rule__RinLiteral__VarAssignment )
            {
             before(grammarAccess.getRinLiteralAccess().getVarAssignment()); 
            // InternalEasySql.g:244:3: ( rule__RinLiteral__VarAssignment )
            // InternalEasySql.g:244:4: rule__RinLiteral__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RinLiteral__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRinLiteralAccess().getVarAssignment()); 

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
    // $ANTLR end "ruleRinLiteral"


    // $ANTLR start "entryRuleTableDeclaration"
    // InternalEasySql.g:253:1: entryRuleTableDeclaration : ruleTableDeclaration EOF ;
    public final void entryRuleTableDeclaration() throws RecognitionException {
        try {
            // InternalEasySql.g:254:1: ( ruleTableDeclaration EOF )
            // InternalEasySql.g:255:1: ruleTableDeclaration EOF
            {
             before(grammarAccess.getTableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleTableDeclaration();

            state._fsp--;

             after(grammarAccess.getTableDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTableDeclaration"


    // $ANTLR start "ruleTableDeclaration"
    // InternalEasySql.g:262:1: ruleTableDeclaration : ( ( rule__TableDeclaration__Group__0 ) ) ;
    public final void ruleTableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:266:2: ( ( ( rule__TableDeclaration__Group__0 ) ) )
            // InternalEasySql.g:267:2: ( ( rule__TableDeclaration__Group__0 ) )
            {
            // InternalEasySql.g:267:2: ( ( rule__TableDeclaration__Group__0 ) )
            // InternalEasySql.g:268:3: ( rule__TableDeclaration__Group__0 )
            {
             before(grammarAccess.getTableDeclarationAccess().getGroup()); 
            // InternalEasySql.g:269:3: ( rule__TableDeclaration__Group__0 )
            // InternalEasySql.g:269:4: rule__TableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleTableDeclaration"


    // $ANTLR start "entryRuleSingleSelectDeclaration"
    // InternalEasySql.g:278:1: entryRuleSingleSelectDeclaration : ruleSingleSelectDeclaration EOF ;
    public final void entryRuleSingleSelectDeclaration() throws RecognitionException {
        try {
            // InternalEasySql.g:279:1: ( ruleSingleSelectDeclaration EOF )
            // InternalEasySql.g:280:1: ruleSingleSelectDeclaration EOF
            {
             before(grammarAccess.getSingleSelectDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleSelectDeclaration();

            state._fsp--;

             after(grammarAccess.getSingleSelectDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSingleSelectDeclaration"


    // $ANTLR start "ruleSingleSelectDeclaration"
    // InternalEasySql.g:287:1: ruleSingleSelectDeclaration : ( ( rule__SingleSelectDeclaration__Group__0 ) ) ;
    public final void ruleSingleSelectDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:291:2: ( ( ( rule__SingleSelectDeclaration__Group__0 ) ) )
            // InternalEasySql.g:292:2: ( ( rule__SingleSelectDeclaration__Group__0 ) )
            {
            // InternalEasySql.g:292:2: ( ( rule__SingleSelectDeclaration__Group__0 ) )
            // InternalEasySql.g:293:3: ( rule__SingleSelectDeclaration__Group__0 )
            {
             before(grammarAccess.getSingleSelectDeclarationAccess().getGroup()); 
            // InternalEasySql.g:294:3: ( rule__SingleSelectDeclaration__Group__0 )
            // InternalEasySql.g:294:4: rule__SingleSelectDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleSelectDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleSelectDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleSingleSelectDeclaration"


    // $ANTLR start "entryRuleValue"
    // InternalEasySql.g:303:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalEasySql.g:304:1: ( ruleValue EOF )
            // InternalEasySql.g:305:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalEasySql.g:312:1: ruleValue : ( ( rule__Value__Group__0 ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:316:2: ( ( ( rule__Value__Group__0 ) ) )
            // InternalEasySql.g:317:2: ( ( rule__Value__Group__0 ) )
            {
            // InternalEasySql.g:317:2: ( ( rule__Value__Group__0 ) )
            // InternalEasySql.g:318:3: ( rule__Value__Group__0 )
            {
             before(grammarAccess.getValueAccess().getGroup()); 
            // InternalEasySql.g:319:3: ( rule__Value__Group__0 )
            // InternalEasySql.g:319:4: rule__Value__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getGroup()); 

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleEquation"
    // InternalEasySql.g:328:1: entryRuleEquation : ruleEquation EOF ;
    public final void entryRuleEquation() throws RecognitionException {
        try {
            // InternalEasySql.g:329:1: ( ruleEquation EOF )
            // InternalEasySql.g:330:1: ruleEquation EOF
            {
             before(grammarAccess.getEquationRule()); 
            pushFollow(FOLLOW_1);
            ruleEquation();

            state._fsp--;

             after(grammarAccess.getEquationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEquation"


    // $ANTLR start "ruleEquation"
    // InternalEasySql.g:337:1: ruleEquation : ( ( rule__Equation__Group__0 ) ) ;
    public final void ruleEquation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:341:2: ( ( ( rule__Equation__Group__0 ) ) )
            // InternalEasySql.g:342:2: ( ( rule__Equation__Group__0 ) )
            {
            // InternalEasySql.g:342:2: ( ( rule__Equation__Group__0 ) )
            // InternalEasySql.g:343:3: ( rule__Equation__Group__0 )
            {
             before(grammarAccess.getEquationAccess().getGroup()); 
            // InternalEasySql.g:344:3: ( rule__Equation__Group__0 )
            // InternalEasySql.g:344:4: rule__Equation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEquationAccess().getGroup()); 

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
    // $ANTLR end "ruleEquation"


    // $ANTLR start "entryRuleVvalue"
    // InternalEasySql.g:353:1: entryRuleVvalue : ruleVvalue EOF ;
    public final void entryRuleVvalue() throws RecognitionException {
        try {
            // InternalEasySql.g:354:1: ( ruleVvalue EOF )
            // InternalEasySql.g:355:1: ruleVvalue EOF
            {
             before(grammarAccess.getVvalueRule()); 
            pushFollow(FOLLOW_1);
            ruleVvalue();

            state._fsp--;

             after(grammarAccess.getVvalueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVvalue"


    // $ANTLR start "ruleVvalue"
    // InternalEasySql.g:362:1: ruleVvalue : ( ( rule__Vvalue__Group__0 ) ) ;
    public final void ruleVvalue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:366:2: ( ( ( rule__Vvalue__Group__0 ) ) )
            // InternalEasySql.g:367:2: ( ( rule__Vvalue__Group__0 ) )
            {
            // InternalEasySql.g:367:2: ( ( rule__Vvalue__Group__0 ) )
            // InternalEasySql.g:368:3: ( rule__Vvalue__Group__0 )
            {
             before(grammarAccess.getVvalueAccess().getGroup()); 
            // InternalEasySql.g:369:3: ( rule__Vvalue__Group__0 )
            // InternalEasySql.g:369:4: rule__Vvalue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Vvalue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVvalueAccess().getGroup()); 

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
    // $ANTLR end "ruleVvalue"


    // $ANTLR start "entryRuleMultiEquation"
    // InternalEasySql.g:378:1: entryRuleMultiEquation : ruleMultiEquation EOF ;
    public final void entryRuleMultiEquation() throws RecognitionException {
        try {
            // InternalEasySql.g:379:1: ( ruleMultiEquation EOF )
            // InternalEasySql.g:380:1: ruleMultiEquation EOF
            {
             before(grammarAccess.getMultiEquationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiEquation();

            state._fsp--;

             after(grammarAccess.getMultiEquationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiEquation"


    // $ANTLR start "ruleMultiEquation"
    // InternalEasySql.g:387:1: ruleMultiEquation : ( ( rule__MultiEquation__Group__0 ) ) ;
    public final void ruleMultiEquation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:391:2: ( ( ( rule__MultiEquation__Group__0 ) ) )
            // InternalEasySql.g:392:2: ( ( rule__MultiEquation__Group__0 ) )
            {
            // InternalEasySql.g:392:2: ( ( rule__MultiEquation__Group__0 ) )
            // InternalEasySql.g:393:3: ( rule__MultiEquation__Group__0 )
            {
             before(grammarAccess.getMultiEquationAccess().getGroup()); 
            // InternalEasySql.g:394:3: ( rule__MultiEquation__Group__0 )
            // InternalEasySql.g:394:4: rule__MultiEquation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiEquation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiEquationAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiEquation"


    // $ANTLR start "entryRuleInsert"
    // InternalEasySql.g:403:1: entryRuleInsert : ruleInsert EOF ;
    public final void entryRuleInsert() throws RecognitionException {
        try {
            // InternalEasySql.g:404:1: ( ruleInsert EOF )
            // InternalEasySql.g:405:1: ruleInsert EOF
            {
             before(grammarAccess.getInsertRule()); 
            pushFollow(FOLLOW_1);
            ruleInsert();

            state._fsp--;

             after(grammarAccess.getInsertRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalEasySql.g:412:1: ruleInsert : ( ( rule__Insert__Group__0 ) ) ;
    public final void ruleInsert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:416:2: ( ( ( rule__Insert__Group__0 ) ) )
            // InternalEasySql.g:417:2: ( ( rule__Insert__Group__0 ) )
            {
            // InternalEasySql.g:417:2: ( ( rule__Insert__Group__0 ) )
            // InternalEasySql.g:418:3: ( rule__Insert__Group__0 )
            {
             before(grammarAccess.getInsertAccess().getGroup()); 
            // InternalEasySql.g:419:3: ( rule__Insert__Group__0 )
            // InternalEasySql.g:419:4: rule__Insert__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getGroup()); 

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
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRuleUpdate"
    // InternalEasySql.g:428:1: entryRuleUpdate : ruleUpdate EOF ;
    public final void entryRuleUpdate() throws RecognitionException {
        try {
            // InternalEasySql.g:429:1: ( ruleUpdate EOF )
            // InternalEasySql.g:430:1: ruleUpdate EOF
            {
             before(grammarAccess.getUpdateRule()); 
            pushFollow(FOLLOW_1);
            ruleUpdate();

            state._fsp--;

             after(grammarAccess.getUpdateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUpdate"


    // $ANTLR start "ruleUpdate"
    // InternalEasySql.g:437:1: ruleUpdate : ( ( rule__Update__Group__0 ) ) ;
    public final void ruleUpdate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:441:2: ( ( ( rule__Update__Group__0 ) ) )
            // InternalEasySql.g:442:2: ( ( rule__Update__Group__0 ) )
            {
            // InternalEasySql.g:442:2: ( ( rule__Update__Group__0 ) )
            // InternalEasySql.g:443:3: ( rule__Update__Group__0 )
            {
             before(grammarAccess.getUpdateAccess().getGroup()); 
            // InternalEasySql.g:444:3: ( rule__Update__Group__0 )
            // InternalEasySql.g:444:4: rule__Update__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Update__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getGroup()); 

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
    // $ANTLR end "ruleUpdate"


    // $ANTLR start "entryRuleDelete"
    // InternalEasySql.g:453:1: entryRuleDelete : ruleDelete EOF ;
    public final void entryRuleDelete() throws RecognitionException {
        try {
            // InternalEasySql.g:454:1: ( ruleDelete EOF )
            // InternalEasySql.g:455:1: ruleDelete EOF
            {
             before(grammarAccess.getDeleteRule()); 
            pushFollow(FOLLOW_1);
            ruleDelete();

            state._fsp--;

             after(grammarAccess.getDeleteRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // InternalEasySql.g:462:1: ruleDelete : ( ( rule__Delete__Group__0 ) ) ;
    public final void ruleDelete() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:466:2: ( ( ( rule__Delete__Group__0 ) ) )
            // InternalEasySql.g:467:2: ( ( rule__Delete__Group__0 ) )
            {
            // InternalEasySql.g:467:2: ( ( rule__Delete__Group__0 ) )
            // InternalEasySql.g:468:3: ( rule__Delete__Group__0 )
            {
             before(grammarAccess.getDeleteAccess().getGroup()); 
            // InternalEasySql.g:469:3: ( rule__Delete__Group__0 )
            // InternalEasySql.g:469:4: rule__Delete__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getGroup()); 

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
    // $ANTLR end "ruleDelete"


    // $ANTLR start "entryRuleSimpleSelectQuery"
    // InternalEasySql.g:478:1: entryRuleSimpleSelectQuery : ruleSimpleSelectQuery EOF ;
    public final void entryRuleSimpleSelectQuery() throws RecognitionException {
        try {
            // InternalEasySql.g:479:1: ( ruleSimpleSelectQuery EOF )
            // InternalEasySql.g:480:1: ruleSimpleSelectQuery EOF
            {
             before(grammarAccess.getSimpleSelectQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleSelectQuery();

            state._fsp--;

             after(grammarAccess.getSimpleSelectQueryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSimpleSelectQuery"


    // $ANTLR start "ruleSimpleSelectQuery"
    // InternalEasySql.g:487:1: ruleSimpleSelectQuery : ( ( rule__SimpleSelectQuery__Group__0 ) ) ;
    public final void ruleSimpleSelectQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:491:2: ( ( ( rule__SimpleSelectQuery__Group__0 ) ) )
            // InternalEasySql.g:492:2: ( ( rule__SimpleSelectQuery__Group__0 ) )
            {
            // InternalEasySql.g:492:2: ( ( rule__SimpleSelectQuery__Group__0 ) )
            // InternalEasySql.g:493:3: ( rule__SimpleSelectQuery__Group__0 )
            {
             before(grammarAccess.getSimpleSelectQueryAccess().getGroup()); 
            // InternalEasySql.g:494:3: ( rule__SimpleSelectQuery__Group__0 )
            // InternalEasySql.g:494:4: rule__SimpleSelectQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleSelectQuery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleSelectQueryAccess().getGroup()); 

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
    // $ANTLR end "ruleSimpleSelectQuery"


    // $ANTLR start "entryRuleJoinQuery"
    // InternalEasySql.g:503:1: entryRuleJoinQuery : ruleJoinQuery EOF ;
    public final void entryRuleJoinQuery() throws RecognitionException {
        try {
            // InternalEasySql.g:504:1: ( ruleJoinQuery EOF )
            // InternalEasySql.g:505:1: ruleJoinQuery EOF
            {
             before(grammarAccess.getJoinQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleJoinQuery();

            state._fsp--;

             after(grammarAccess.getJoinQueryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJoinQuery"


    // $ANTLR start "ruleJoinQuery"
    // InternalEasySql.g:512:1: ruleJoinQuery : ( ( rule__JoinQuery__Group__0 ) ) ;
    public final void ruleJoinQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:516:2: ( ( ( rule__JoinQuery__Group__0 ) ) )
            // InternalEasySql.g:517:2: ( ( rule__JoinQuery__Group__0 ) )
            {
            // InternalEasySql.g:517:2: ( ( rule__JoinQuery__Group__0 ) )
            // InternalEasySql.g:518:3: ( rule__JoinQuery__Group__0 )
            {
             before(grammarAccess.getJoinQueryAccess().getGroup()); 
            // InternalEasySql.g:519:3: ( rule__JoinQuery__Group__0 )
            // InternalEasySql.g:519:4: rule__JoinQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JoinQuery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJoinQueryAccess().getGroup()); 

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
    // $ANTLR end "ruleJoinQuery"


    // $ANTLR start "entryRuleNestedQuery"
    // InternalEasySql.g:528:1: entryRuleNestedQuery : ruleNestedQuery EOF ;
    public final void entryRuleNestedQuery() throws RecognitionException {
        try {
            // InternalEasySql.g:529:1: ( ruleNestedQuery EOF )
            // InternalEasySql.g:530:1: ruleNestedQuery EOF
            {
             before(grammarAccess.getNestedQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleNestedQuery();

            state._fsp--;

             after(grammarAccess.getNestedQueryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNestedQuery"


    // $ANTLR start "ruleNestedQuery"
    // InternalEasySql.g:537:1: ruleNestedQuery : ( ( rule__NestedQuery__Group__0 ) ) ;
    public final void ruleNestedQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:541:2: ( ( ( rule__NestedQuery__Group__0 ) ) )
            // InternalEasySql.g:542:2: ( ( rule__NestedQuery__Group__0 ) )
            {
            // InternalEasySql.g:542:2: ( ( rule__NestedQuery__Group__0 ) )
            // InternalEasySql.g:543:3: ( rule__NestedQuery__Group__0 )
            {
             before(grammarAccess.getNestedQueryAccess().getGroup()); 
            // InternalEasySql.g:544:3: ( rule__NestedQuery__Group__0 )
            // InternalEasySql.g:544:4: rule__NestedQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NestedQuery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNestedQueryAccess().getGroup()); 

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
    // $ANTLR end "ruleNestedQuery"


    // $ANTLR start "ruleOperator"
    // InternalEasySql.g:553:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:557:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalEasySql.g:558:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalEasySql.g:558:2: ( ( rule__Operator__Alternatives ) )
            // InternalEasySql.g:559:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalEasySql.g:560:3: ( rule__Operator__Alternatives )
            // InternalEasySql.g:560:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleJoin"
    // InternalEasySql.g:569:1: ruleJoin : ( ( rule__Join__Alternatives ) ) ;
    public final void ruleJoin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:573:1: ( ( ( rule__Join__Alternatives ) ) )
            // InternalEasySql.g:574:2: ( ( rule__Join__Alternatives ) )
            {
            // InternalEasySql.g:574:2: ( ( rule__Join__Alternatives ) )
            // InternalEasySql.g:575:3: ( rule__Join__Alternatives )
            {
             before(grammarAccess.getJoinAccess().getAlternatives()); 
            // InternalEasySql.g:576:3: ( rule__Join__Alternatives )
            // InternalEasySql.g:576:4: rule__Join__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Join__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getAlternatives()); 

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
    // $ANTLR end "ruleJoin"


    // $ANTLR start "ruleOrder"
    // InternalEasySql.g:585:1: ruleOrder : ( ( rule__Order__Alternatives ) ) ;
    public final void ruleOrder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:589:1: ( ( ( rule__Order__Alternatives ) ) )
            // InternalEasySql.g:590:2: ( ( rule__Order__Alternatives ) )
            {
            // InternalEasySql.g:590:2: ( ( rule__Order__Alternatives ) )
            // InternalEasySql.g:591:3: ( rule__Order__Alternatives )
            {
             before(grammarAccess.getOrderAccess().getAlternatives()); 
            // InternalEasySql.g:592:3: ( rule__Order__Alternatives )
            // InternalEasySql.g:592:4: rule__Order__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Order__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOrder"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalEasySql.g:600:1: rule__Statement__Alternatives : ( ( ruleQueryStatement ) | ( ruleManipulateStatement ) | ( ruleTableDeclaration ) | ( ruleSingleSelectDeclaration ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:604:1: ( ( ruleQueryStatement ) | ( ruleManipulateStatement ) | ( ruleTableDeclaration ) | ( ruleSingleSelectDeclaration ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==31||LA2_1==34||LA2_1==36) ) {
                    alt2=1;
                }
                else if ( (LA2_1==26||LA2_1==28||LA2_1==30) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            case 24:
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
                    // InternalEasySql.g:605:2: ( ruleQueryStatement )
                    {
                    // InternalEasySql.g:605:2: ( ruleQueryStatement )
                    // InternalEasySql.g:606:3: ruleQueryStatement
                    {
                     before(grammarAccess.getStatementAccess().getQueryStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleQueryStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getQueryStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEasySql.g:611:2: ( ruleManipulateStatement )
                    {
                    // InternalEasySql.g:611:2: ( ruleManipulateStatement )
                    // InternalEasySql.g:612:3: ruleManipulateStatement
                    {
                     before(grammarAccess.getStatementAccess().getManipulateStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleManipulateStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getManipulateStatementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEasySql.g:617:2: ( ruleTableDeclaration )
                    {
                    // InternalEasySql.g:617:2: ( ruleTableDeclaration )
                    // InternalEasySql.g:618:3: ruleTableDeclaration
                    {
                     before(grammarAccess.getStatementAccess().getTableDeclarationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTableDeclarationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEasySql.g:623:2: ( ruleSingleSelectDeclaration )
                    {
                    // InternalEasySql.g:623:2: ( ruleSingleSelectDeclaration )
                    // InternalEasySql.g:624:3: ruleSingleSelectDeclaration
                    {
                     before(grammarAccess.getStatementAccess().getSingleSelectDeclarationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSingleSelectDeclaration();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSingleSelectDeclarationParserRuleCall_3()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__QueryStatement__Alternatives"
    // InternalEasySql.g:633:1: rule__QueryStatement__Alternatives : ( ( ruleSimpleSelectQuery ) | ( ruleJoinQuery ) | ( ruleNestedQuery ) );
    public final void rule__QueryStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:637:1: ( ( ruleSimpleSelectQuery ) | ( ruleJoinQuery ) | ( ruleNestedQuery ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 36:
                    {
                    alt3=3;
                    }
                    break;
                case 31:
                    {
                    alt3=1;
                    }
                    break;
                case 34:
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
                    // InternalEasySql.g:638:2: ( ruleSimpleSelectQuery )
                    {
                    // InternalEasySql.g:638:2: ( ruleSimpleSelectQuery )
                    // InternalEasySql.g:639:3: ruleSimpleSelectQuery
                    {
                     before(grammarAccess.getQueryStatementAccess().getSimpleSelectQueryParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleSelectQuery();

                    state._fsp--;

                     after(grammarAccess.getQueryStatementAccess().getSimpleSelectQueryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEasySql.g:644:2: ( ruleJoinQuery )
                    {
                    // InternalEasySql.g:644:2: ( ruleJoinQuery )
                    // InternalEasySql.g:645:3: ruleJoinQuery
                    {
                     before(grammarAccess.getQueryStatementAccess().getJoinQueryParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleJoinQuery();

                    state._fsp--;

                     after(grammarAccess.getQueryStatementAccess().getJoinQueryParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEasySql.g:650:2: ( ruleNestedQuery )
                    {
                    // InternalEasySql.g:650:2: ( ruleNestedQuery )
                    // InternalEasySql.g:651:3: ruleNestedQuery
                    {
                     before(grammarAccess.getQueryStatementAccess().getNestedQueryParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNestedQuery();

                    state._fsp--;

                     after(grammarAccess.getQueryStatementAccess().getNestedQueryParserRuleCall_2()); 

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
    // $ANTLR end "rule__QueryStatement__Alternatives"


    // $ANTLR start "rule__ManipulateStatement__Alternatives"
    // InternalEasySql.g:660:1: rule__ManipulateStatement__Alternatives : ( ( ruleInsert ) | ( ruleUpdate ) | ( ruleDelete ) );
    public final void rule__ManipulateStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:664:1: ( ( ruleInsert ) | ( ruleUpdate ) | ( ruleDelete ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 30:
                    {
                    alt4=3;
                    }
                    break;
                case 28:
                    {
                    alt4=2;
                    }
                    break;
                case 26:
                    {
                    alt4=1;
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
                    // InternalEasySql.g:665:2: ( ruleInsert )
                    {
                    // InternalEasySql.g:665:2: ( ruleInsert )
                    // InternalEasySql.g:666:3: ruleInsert
                    {
                     before(grammarAccess.getManipulateStatementAccess().getInsertParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInsert();

                    state._fsp--;

                     after(grammarAccess.getManipulateStatementAccess().getInsertParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEasySql.g:671:2: ( ruleUpdate )
                    {
                    // InternalEasySql.g:671:2: ( ruleUpdate )
                    // InternalEasySql.g:672:3: ruleUpdate
                    {
                     before(grammarAccess.getManipulateStatementAccess().getUpdateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUpdate();

                    state._fsp--;

                     after(grammarAccess.getManipulateStatementAccess().getUpdateParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEasySql.g:677:2: ( ruleDelete )
                    {
                    // InternalEasySql.g:677:2: ( ruleDelete )
                    // InternalEasySql.g:678:3: ruleDelete
                    {
                     before(grammarAccess.getManipulateStatementAccess().getDeleteParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDelete();

                    state._fsp--;

                     after(grammarAccess.getManipulateStatementAccess().getDeleteParserRuleCall_2()); 

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
    // $ANTLR end "rule__ManipulateStatement__Alternatives"


    // $ANTLR start "rule__MultiType__Alternatives"
    // InternalEasySql.g:687:1: rule__MultiType__Alternatives : ( ( ruleStrLiteral ) | ( ruleRinLiteral ) | ( ruleNumLiteral ) );
    public final void rule__MultiType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:691:1: ( ( ruleStrLiteral ) | ( ruleRinLiteral ) | ( ruleNumLiteral ) )
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
                    // InternalEasySql.g:692:2: ( ruleStrLiteral )
                    {
                    // InternalEasySql.g:692:2: ( ruleStrLiteral )
                    // InternalEasySql.g:693:3: ruleStrLiteral
                    {
                     before(grammarAccess.getMultiTypeAccess().getStrLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStrLiteral();

                    state._fsp--;

                     after(grammarAccess.getMultiTypeAccess().getStrLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEasySql.g:698:2: ( ruleRinLiteral )
                    {
                    // InternalEasySql.g:698:2: ( ruleRinLiteral )
                    // InternalEasySql.g:699:3: ruleRinLiteral
                    {
                     before(grammarAccess.getMultiTypeAccess().getRinLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRinLiteral();

                    state._fsp--;

                     after(grammarAccess.getMultiTypeAccess().getRinLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEasySql.g:704:2: ( ruleNumLiteral )
                    {
                    // InternalEasySql.g:704:2: ( ruleNumLiteral )
                    // InternalEasySql.g:705:3: ruleNumLiteral
                    {
                     before(grammarAccess.getMultiTypeAccess().getNumLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNumLiteral();

                    state._fsp--;

                     after(grammarAccess.getMultiTypeAccess().getNumLiteralParserRuleCall_2()); 

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
    // $ANTLR end "rule__MultiType__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalEasySql.g:714:1: rule__Operator__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '!=' ) ) | ( ( '=' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:718:1: ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '!=' ) ) | ( ( '=' ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
                }
                break;
            case 15:
                {
                alt6=5;
                }
                break;
            case 16:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalEasySql.g:719:2: ( ( '>' ) )
                    {
                    // InternalEasySql.g:719:2: ( ( '>' ) )
                    // InternalEasySql.g:720:3: ( '>' )
                    {
                     before(grammarAccess.getOperatorAccess().getVaEnumLiteralDeclaration_0()); 
                    // InternalEasySql.g:721:3: ( '>' )
                    // InternalEasySql.g:721:4: '>'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getVaEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEasySql.g:725:2: ( ( '<' ) )
                    {
                    // InternalEasySql.g:725:2: ( ( '<' ) )
                    // InternalEasySql.g:726:3: ( '<' )
                    {
                     before(grammarAccess.getOperatorAccess().getVbEnumLiteralDeclaration_1()); 
                    // InternalEasySql.g:727:3: ( '<' )
                    // InternalEasySql.g:727:4: '<'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getVbEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEasySql.g:731:2: ( ( '>=' ) )
                    {
                    // InternalEasySql.g:731:2: ( ( '>=' ) )
                    // InternalEasySql.g:732:3: ( '>=' )
                    {
                     before(grammarAccess.getOperatorAccess().getVcEnumLiteralDeclaration_2()); 
                    // InternalEasySql.g:733:3: ( '>=' )
                    // InternalEasySql.g:733:4: '>='
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getVcEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEasySql.g:737:2: ( ( '<=' ) )
                    {
                    // InternalEasySql.g:737:2: ( ( '<=' ) )
                    // InternalEasySql.g:738:3: ( '<=' )
                    {
                     before(grammarAccess.getOperatorAccess().getVdEnumLiteralDeclaration_3()); 
                    // InternalEasySql.g:739:3: ( '<=' )
                    // InternalEasySql.g:739:4: '<='
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getVdEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEasySql.g:743:2: ( ( '!=' ) )
                    {
                    // InternalEasySql.g:743:2: ( ( '!=' ) )
                    // InternalEasySql.g:744:3: ( '!=' )
                    {
                     before(grammarAccess.getOperatorAccess().getVeEnumLiteralDeclaration_4()); 
                    // InternalEasySql.g:745:3: ( '!=' )
                    // InternalEasySql.g:745:4: '!='
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getVeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEasySql.g:749:2: ( ( '=' ) )
                    {
                    // InternalEasySql.g:749:2: ( ( '=' ) )
                    // InternalEasySql.g:750:3: ( '=' )
                    {
                     before(grammarAccess.getOperatorAccess().getVfEnumLiteralDeclaration_5()); 
                    // InternalEasySql.g:751:3: ( '=' )
                    // InternalEasySql.g:751:4: '='
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getVfEnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Join__Alternatives"
    // InternalEasySql.g:759:1: rule__Join__Alternatives : ( ( ( 'left_join' ) ) | ( ( 'right_join' ) ) | ( ( 'full_join' ) ) | ( ( 'inner_join' ) ) );
    public final void rule__Join__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:763:1: ( ( ( 'left_join' ) ) | ( ( 'right_join' ) ) | ( ( 'full_join' ) ) | ( ( 'inner_join' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalEasySql.g:764:2: ( ( 'left_join' ) )
                    {
                    // InternalEasySql.g:764:2: ( ( 'left_join' ) )
                    // InternalEasySql.g:765:3: ( 'left_join' )
                    {
                     before(grammarAccess.getJoinAccess().getLeft_joinEnumLiteralDeclaration_0()); 
                    // InternalEasySql.g:766:3: ( 'left_join' )
                    // InternalEasySql.g:766:4: 'left_join'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinAccess().getLeft_joinEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEasySql.g:770:2: ( ( 'right_join' ) )
                    {
                    // InternalEasySql.g:770:2: ( ( 'right_join' ) )
                    // InternalEasySql.g:771:3: ( 'right_join' )
                    {
                     before(grammarAccess.getJoinAccess().getRight_joinEnumLiteralDeclaration_1()); 
                    // InternalEasySql.g:772:3: ( 'right_join' )
                    // InternalEasySql.g:772:4: 'right_join'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinAccess().getRight_joinEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEasySql.g:776:2: ( ( 'full_join' ) )
                    {
                    // InternalEasySql.g:776:2: ( ( 'full_join' ) )
                    // InternalEasySql.g:777:3: ( 'full_join' )
                    {
                     before(grammarAccess.getJoinAccess().getFull_joinEnumLiteralDeclaration_2()); 
                    // InternalEasySql.g:778:3: ( 'full_join' )
                    // InternalEasySql.g:778:4: 'full_join'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinAccess().getFull_joinEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEasySql.g:782:2: ( ( 'inner_join' ) )
                    {
                    // InternalEasySql.g:782:2: ( ( 'inner_join' ) )
                    // InternalEasySql.g:783:3: ( 'inner_join' )
                    {
                     before(grammarAccess.getJoinAccess().getInner_joinEnumLiteralDeclaration_3()); 
                    // InternalEasySql.g:784:3: ( 'inner_join' )
                    // InternalEasySql.g:784:4: 'inner_join'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinAccess().getInner_joinEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Join__Alternatives"


    // $ANTLR start "rule__Order__Alternatives"
    // InternalEasySql.g:792:1: rule__Order__Alternatives : ( ( ( 'ascending' ) ) | ( ( 'descending' ) ) );
    public final void rule__Order__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:796:1: ( ( ( 'ascending' ) ) | ( ( 'descending' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalEasySql.g:797:2: ( ( 'ascending' ) )
                    {
                    // InternalEasySql.g:797:2: ( ( 'ascending' ) )
                    // InternalEasySql.g:798:3: ( 'ascending' )
                    {
                     before(grammarAccess.getOrderAccess().getAscendingEnumLiteralDeclaration_0()); 
                    // InternalEasySql.g:799:3: ( 'ascending' )
                    // InternalEasySql.g:799:4: 'ascending'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrderAccess().getAscendingEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEasySql.g:803:2: ( ( 'descending' ) )
                    {
                    // InternalEasySql.g:803:2: ( ( 'descending' ) )
                    // InternalEasySql.g:804:3: ( 'descending' )
                    {
                     before(grammarAccess.getOrderAccess().getDescendingEnumLiteralDeclaration_1()); 
                    // InternalEasySql.g:805:3: ( 'descending' )
                    // InternalEasySql.g:805:4: 'descending'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrderAccess().getDescendingEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Order__Alternatives"


    // $ANTLR start "rule__TableDeclaration__Group__0"
    // InternalEasySql.g:813:1: rule__TableDeclaration__Group__0 : rule__TableDeclaration__Group__0__Impl rule__TableDeclaration__Group__1 ;
    public final void rule__TableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:817:1: ( rule__TableDeclaration__Group__0__Impl rule__TableDeclaration__Group__1 )
            // InternalEasySql.g:818:2: rule__TableDeclaration__Group__0__Impl rule__TableDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableDeclaration__Group__1();

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
    // $ANTLR end "rule__TableDeclaration__Group__0"


    // $ANTLR start "rule__TableDeclaration__Group__0__Impl"
    // InternalEasySql.g:825:1: rule__TableDeclaration__Group__0__Impl : ( 'Table' ) ;
    public final void rule__TableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:829:1: ( ( 'Table' ) )
            // InternalEasySql.g:830:1: ( 'Table' )
            {
            // InternalEasySql.g:830:1: ( 'Table' )
            // InternalEasySql.g:831:2: 'Table'
            {
             before(grammarAccess.getTableDeclarationAccess().getTableKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTableDeclarationAccess().getTableKeyword_0()); 

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
    // $ANTLR end "rule__TableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__TableDeclaration__Group__1"
    // InternalEasySql.g:840:1: rule__TableDeclaration__Group__1 : rule__TableDeclaration__Group__1__Impl ;
    public final void rule__TableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:844:1: ( rule__TableDeclaration__Group__1__Impl )
            // InternalEasySql.g:845:2: rule__TableDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableDeclaration__Group__1__Impl();

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
    // $ANTLR end "rule__TableDeclaration__Group__1"


    // $ANTLR start "rule__TableDeclaration__Group__1__Impl"
    // InternalEasySql.g:851:1: rule__TableDeclaration__Group__1__Impl : ( ( rule__TableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__TableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:855:1: ( ( ( rule__TableDeclaration__NameAssignment_1 ) ) )
            // InternalEasySql.g:856:1: ( ( rule__TableDeclaration__NameAssignment_1 ) )
            {
            // InternalEasySql.g:856:1: ( ( rule__TableDeclaration__NameAssignment_1 ) )
            // InternalEasySql.g:857:2: ( rule__TableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getTableDeclarationAccess().getNameAssignment_1()); 
            // InternalEasySql.g:858:2: ( rule__TableDeclaration__NameAssignment_1 )
            // InternalEasySql.g:858:3: rule__TableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TableDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__TableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__SingleSelectDeclaration__Group__0"
    // InternalEasySql.g:867:1: rule__SingleSelectDeclaration__Group__0 : rule__SingleSelectDeclaration__Group__0__Impl rule__SingleSelectDeclaration__Group__1 ;
    public final void rule__SingleSelectDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:871:1: ( rule__SingleSelectDeclaration__Group__0__Impl rule__SingleSelectDeclaration__Group__1 )
            // InternalEasySql.g:872:2: rule__SingleSelectDeclaration__Group__0__Impl rule__SingleSelectDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SingleSelectDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleSelectDeclaration__Group__1();

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
    // $ANTLR end "rule__SingleSelectDeclaration__Group__0"


    // $ANTLR start "rule__SingleSelectDeclaration__Group__0__Impl"
    // InternalEasySql.g:879:1: rule__SingleSelectDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__SingleSelectDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:883:1: ( ( 'var' ) )
            // InternalEasySql.g:884:1: ( 'var' )
            {
            // InternalEasySql.g:884:1: ( 'var' )
            // InternalEasySql.g:885:2: 'var'
            {
             before(grammarAccess.getSingleSelectDeclarationAccess().getVarKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSingleSelectDeclarationAccess().getVarKeyword_0()); 

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
    // $ANTLR end "rule__SingleSelectDeclaration__Group__0__Impl"


    // $ANTLR start "rule__SingleSelectDeclaration__Group__1"
    // InternalEasySql.g:894:1: rule__SingleSelectDeclaration__Group__1 : rule__SingleSelectDeclaration__Group__1__Impl rule__SingleSelectDeclaration__Group__2 ;
    public final void rule__SingleSelectDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:898:1: ( rule__SingleSelectDeclaration__Group__1__Impl rule__SingleSelectDeclaration__Group__2 )
            // InternalEasySql.g:899:2: rule__SingleSelectDeclaration__Group__1__Impl rule__SingleSelectDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SingleSelectDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleSelectDeclaration__Group__2();

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
    // $ANTLR end "rule__SingleSelectDeclaration__Group__1"


    // $ANTLR start "rule__SingleSelectDeclaration__Group__1__Impl"
    // InternalEasySql.g:906:1: rule__SingleSelectDeclaration__Group__1__Impl : ( ( rule__SingleSelectDeclaration__NameAssignment_1 ) ) ;
    public final void rule__SingleSelectDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:910:1: ( ( ( rule__SingleSelectDeclaration__NameAssignment_1 ) ) )
            // InternalEasySql.g:911:1: ( ( rule__SingleSelectDeclaration__NameAssignment_1 ) )
            {
            // InternalEasySql.g:911:1: ( ( rule__SingleSelectDeclaration__NameAssignment_1 ) )
            // InternalEasySql.g:912:2: ( rule__SingleSelectDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getSingleSelectDeclarationAccess().getNameAssignment_1()); 
            // InternalEasySql.g:913:2: ( rule__SingleSelectDeclaration__NameAssignment_1 )
            // InternalEasySql.g:913:3: rule__SingleSelectDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleSelectDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleSelectDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SingleSelectDeclaration__Group__1__Impl"


    // $ANTLR start "rule__SingleSelectDeclaration__Group__2"
    // InternalEasySql.g:921:1: rule__SingleSelectDeclaration__Group__2 : rule__SingleSelectDeclaration__Group__2__Impl rule__SingleSelectDeclaration__Group__3 ;
    public final void rule__SingleSelectDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:925:1: ( rule__SingleSelectDeclaration__Group__2__Impl rule__SingleSelectDeclaration__Group__3 )
            // InternalEasySql.g:926:2: rule__SingleSelectDeclaration__Group__2__Impl rule__SingleSelectDeclaration__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SingleSelectDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleSelectDeclaration__Group__3();

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
    // $ANTLR end "rule__SingleSelectDeclaration__Group__2"


    // $ANTLR start "rule__SingleSelectDeclaration__Group__2__Impl"
    // InternalEasySql.g:933:1: rule__SingleSelectDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__SingleSelectDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:937:1: ( ( '=' ) )
            // InternalEasySql.g:938:1: ( '=' )
            {
            // InternalEasySql.g:938:1: ( '=' )
            // InternalEasySql.g:939:2: '='
            {
             before(grammarAccess.getSingleSelectDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSingleSelectDeclarationAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__SingleSelectDeclaration__Group__2__Impl"


    // $ANTLR start "rule__SingleSelectDeclaration__Group__3"
    // InternalEasySql.g:948:1: rule__SingleSelectDeclaration__Group__3 : rule__SingleSelectDeclaration__Group__3__Impl ;
    public final void rule__SingleSelectDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:952:1: ( rule__SingleSelectDeclaration__Group__3__Impl )
            // InternalEasySql.g:953:2: rule__SingleSelectDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleSelectDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__SingleSelectDeclaration__Group__3"


    // $ANTLR start "rule__SingleSelectDeclaration__Group__3__Impl"
    // InternalEasySql.g:959:1: rule__SingleSelectDeclaration__Group__3__Impl : ( ( rule__SingleSelectDeclaration__SingleSelectAssignment_3 ) ) ;
    public final void rule__SingleSelectDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:963:1: ( ( ( rule__SingleSelectDeclaration__SingleSelectAssignment_3 ) ) )
            // InternalEasySql.g:964:1: ( ( rule__SingleSelectDeclaration__SingleSelectAssignment_3 ) )
            {
            // InternalEasySql.g:964:1: ( ( rule__SingleSelectDeclaration__SingleSelectAssignment_3 ) )
            // InternalEasySql.g:965:2: ( rule__SingleSelectDeclaration__SingleSelectAssignment_3 )
            {
             before(grammarAccess.getSingleSelectDeclarationAccess().getSingleSelectAssignment_3()); 
            // InternalEasySql.g:966:2: ( rule__SingleSelectDeclaration__SingleSelectAssignment_3 )
            // InternalEasySql.g:966:3: rule__SingleSelectDeclaration__SingleSelectAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SingleSelectDeclaration__SingleSelectAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSingleSelectDeclarationAccess().getSingleSelectAssignment_3()); 

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
    // $ANTLR end "rule__SingleSelectDeclaration__Group__3__Impl"


    // $ANTLR start "rule__Value__Group__0"
    // InternalEasySql.g:975:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:979:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalEasySql.g:980:2: rule__Value__Group__0__Impl rule__Value__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__1();

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
    // $ANTLR end "rule__Value__Group__0"


    // $ANTLR start "rule__Value__Group__0__Impl"
    // InternalEasySql.g:987:1: rule__Value__Group__0__Impl : ( ( rule__Value__ValueAssignment_0 ) ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:991:1: ( ( ( rule__Value__ValueAssignment_0 ) ) )
            // InternalEasySql.g:992:1: ( ( rule__Value__ValueAssignment_0 ) )
            {
            // InternalEasySql.g:992:1: ( ( rule__Value__ValueAssignment_0 ) )
            // InternalEasySql.g:993:2: ( rule__Value__ValueAssignment_0 )
            {
             before(grammarAccess.getValueAccess().getValueAssignment_0()); 
            // InternalEasySql.g:994:2: ( rule__Value__ValueAssignment_0 )
            // InternalEasySql.g:994:3: rule__Value__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Value__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getValueAssignment_0()); 

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
    // $ANTLR end "rule__Value__Group__0__Impl"


    // $ANTLR start "rule__Value__Group__1"
    // InternalEasySql.g:1002:1: rule__Value__Group__1 : rule__Value__Group__1__Impl ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1006:1: ( rule__Value__Group__1__Impl )
            // InternalEasySql.g:1007:2: rule__Value__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group__1__Impl();

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
    // $ANTLR end "rule__Value__Group__1"


    // $ANTLR start "rule__Value__Group__1__Impl"
    // InternalEasySql.g:1013:1: rule__Value__Group__1__Impl : ( ( rule__Value__SeparationAssignment_1 )* ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1017:1: ( ( ( rule__Value__SeparationAssignment_1 )* ) )
            // InternalEasySql.g:1018:1: ( ( rule__Value__SeparationAssignment_1 )* )
            {
            // InternalEasySql.g:1018:1: ( ( rule__Value__SeparationAssignment_1 )* )
            // InternalEasySql.g:1019:2: ( rule__Value__SeparationAssignment_1 )*
            {
             before(grammarAccess.getValueAccess().getSeparationAssignment_1()); 
            // InternalEasySql.g:1020:2: ( rule__Value__SeparationAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==39) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEasySql.g:1020:3: rule__Value__SeparationAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Value__SeparationAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getValueAccess().getSeparationAssignment_1()); 

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
    // $ANTLR end "rule__Value__Group__1__Impl"


    // $ANTLR start "rule__Equation__Group__0"
    // InternalEasySql.g:1029:1: rule__Equation__Group__0 : rule__Equation__Group__0__Impl rule__Equation__Group__1 ;
    public final void rule__Equation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1033:1: ( rule__Equation__Group__0__Impl rule__Equation__Group__1 )
            // InternalEasySql.g:1034:2: rule__Equation__Group__0__Impl rule__Equation__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Equation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equation__Group__1();

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
    // $ANTLR end "rule__Equation__Group__0"


    // $ANTLR start "rule__Equation__Group__0__Impl"
    // InternalEasySql.g:1041:1: rule__Equation__Group__0__Impl : ( ( rule__Equation__AttributeAssignment_0 ) ) ;
    public final void rule__Equation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1045:1: ( ( ( rule__Equation__AttributeAssignment_0 ) ) )
            // InternalEasySql.g:1046:1: ( ( rule__Equation__AttributeAssignment_0 ) )
            {
            // InternalEasySql.g:1046:1: ( ( rule__Equation__AttributeAssignment_0 ) )
            // InternalEasySql.g:1047:2: ( rule__Equation__AttributeAssignment_0 )
            {
             before(grammarAccess.getEquationAccess().getAttributeAssignment_0()); 
            // InternalEasySql.g:1048:2: ( rule__Equation__AttributeAssignment_0 )
            // InternalEasySql.g:1048:3: rule__Equation__AttributeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Equation__AttributeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEquationAccess().getAttributeAssignment_0()); 

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
    // $ANTLR end "rule__Equation__Group__0__Impl"


    // $ANTLR start "rule__Equation__Group__1"
    // InternalEasySql.g:1056:1: rule__Equation__Group__1 : rule__Equation__Group__1__Impl rule__Equation__Group__2 ;
    public final void rule__Equation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1060:1: ( rule__Equation__Group__1__Impl rule__Equation__Group__2 )
            // InternalEasySql.g:1061:2: rule__Equation__Group__1__Impl rule__Equation__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Equation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equation__Group__2();

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
    // $ANTLR end "rule__Equation__Group__1"


    // $ANTLR start "rule__Equation__Group__1__Impl"
    // InternalEasySql.g:1068:1: rule__Equation__Group__1__Impl : ( ( rule__Equation__OperatorAssignment_1 ) ) ;
    public final void rule__Equation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1072:1: ( ( ( rule__Equation__OperatorAssignment_1 ) ) )
            // InternalEasySql.g:1073:1: ( ( rule__Equation__OperatorAssignment_1 ) )
            {
            // InternalEasySql.g:1073:1: ( ( rule__Equation__OperatorAssignment_1 ) )
            // InternalEasySql.g:1074:2: ( rule__Equation__OperatorAssignment_1 )
            {
             before(grammarAccess.getEquationAccess().getOperatorAssignment_1()); 
            // InternalEasySql.g:1075:2: ( rule__Equation__OperatorAssignment_1 )
            // InternalEasySql.g:1075:3: rule__Equation__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Equation__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEquationAccess().getOperatorAssignment_1()); 

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
    // $ANTLR end "rule__Equation__Group__1__Impl"


    // $ANTLR start "rule__Equation__Group__2"
    // InternalEasySql.g:1083:1: rule__Equation__Group__2 : rule__Equation__Group__2__Impl rule__Equation__Group__3 ;
    public final void rule__Equation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1087:1: ( rule__Equation__Group__2__Impl rule__Equation__Group__3 )
            // InternalEasySql.g:1088:2: rule__Equation__Group__2__Impl rule__Equation__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Equation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equation__Group__3();

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
    // $ANTLR end "rule__Equation__Group__2"


    // $ANTLR start "rule__Equation__Group__2__Impl"
    // InternalEasySql.g:1095:1: rule__Equation__Group__2__Impl : ( ( rule__Equation__ValueAssignment_2 ) ) ;
    public final void rule__Equation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1099:1: ( ( ( rule__Equation__ValueAssignment_2 ) ) )
            // InternalEasySql.g:1100:1: ( ( rule__Equation__ValueAssignment_2 ) )
            {
            // InternalEasySql.g:1100:1: ( ( rule__Equation__ValueAssignment_2 ) )
            // InternalEasySql.g:1101:2: ( rule__Equation__ValueAssignment_2 )
            {
             before(grammarAccess.getEquationAccess().getValueAssignment_2()); 
            // InternalEasySql.g:1102:2: ( rule__Equation__ValueAssignment_2 )
            // InternalEasySql.g:1102:3: rule__Equation__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Equation__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEquationAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__Equation__Group__2__Impl"


    // $ANTLR start "rule__Equation__Group__3"
    // InternalEasySql.g:1110:1: rule__Equation__Group__3 : rule__Equation__Group__3__Impl ;
    public final void rule__Equation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1114:1: ( rule__Equation__Group__3__Impl )
            // InternalEasySql.g:1115:2: rule__Equation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equation__Group__3__Impl();

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
    // $ANTLR end "rule__Equation__Group__3"


    // $ANTLR start "rule__Equation__Group__3__Impl"
    // InternalEasySql.g:1121:1: rule__Equation__Group__3__Impl : ( ( rule__Equation__SeparationAssignment_3 )* ) ;
    public final void rule__Equation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1125:1: ( ( ( rule__Equation__SeparationAssignment_3 )* ) )
            // InternalEasySql.g:1126:1: ( ( rule__Equation__SeparationAssignment_3 )* )
            {
            // InternalEasySql.g:1126:1: ( ( rule__Equation__SeparationAssignment_3 )* )
            // InternalEasySql.g:1127:2: ( rule__Equation__SeparationAssignment_3 )*
            {
             before(grammarAccess.getEquationAccess().getSeparationAssignment_3()); 
            // InternalEasySql.g:1128:2: ( rule__Equation__SeparationAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==39) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEasySql.g:1128:3: rule__Equation__SeparationAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Equation__SeparationAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getEquationAccess().getSeparationAssignment_3()); 

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
    // $ANTLR end "rule__Equation__Group__3__Impl"


    // $ANTLR start "rule__Vvalue__Group__0"
    // InternalEasySql.g:1137:1: rule__Vvalue__Group__0 : rule__Vvalue__Group__0__Impl rule__Vvalue__Group__1 ;
    public final void rule__Vvalue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1141:1: ( rule__Vvalue__Group__0__Impl rule__Vvalue__Group__1 )
            // InternalEasySql.g:1142:2: rule__Vvalue__Group__0__Impl rule__Vvalue__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Vvalue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vvalue__Group__1();

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
    // $ANTLR end "rule__Vvalue__Group__0"


    // $ANTLR start "rule__Vvalue__Group__0__Impl"
    // InternalEasySql.g:1149:1: rule__Vvalue__Group__0__Impl : ( ( rule__Vvalue__TableAssignment_0 ) ) ;
    public final void rule__Vvalue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1153:1: ( ( ( rule__Vvalue__TableAssignment_0 ) ) )
            // InternalEasySql.g:1154:1: ( ( rule__Vvalue__TableAssignment_0 ) )
            {
            // InternalEasySql.g:1154:1: ( ( rule__Vvalue__TableAssignment_0 ) )
            // InternalEasySql.g:1155:2: ( rule__Vvalue__TableAssignment_0 )
            {
             before(grammarAccess.getVvalueAccess().getTableAssignment_0()); 
            // InternalEasySql.g:1156:2: ( rule__Vvalue__TableAssignment_0 )
            // InternalEasySql.g:1156:3: rule__Vvalue__TableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Vvalue__TableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVvalueAccess().getTableAssignment_0()); 

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
    // $ANTLR end "rule__Vvalue__Group__0__Impl"


    // $ANTLR start "rule__Vvalue__Group__1"
    // InternalEasySql.g:1164:1: rule__Vvalue__Group__1 : rule__Vvalue__Group__1__Impl rule__Vvalue__Group__2 ;
    public final void rule__Vvalue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1168:1: ( rule__Vvalue__Group__1__Impl rule__Vvalue__Group__2 )
            // InternalEasySql.g:1169:2: rule__Vvalue__Group__1__Impl rule__Vvalue__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Vvalue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vvalue__Group__2();

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
    // $ANTLR end "rule__Vvalue__Group__1"


    // $ANTLR start "rule__Vvalue__Group__1__Impl"
    // InternalEasySql.g:1176:1: rule__Vvalue__Group__1__Impl : ( '-' ) ;
    public final void rule__Vvalue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1180:1: ( ( '-' ) )
            // InternalEasySql.g:1181:1: ( '-' )
            {
            // InternalEasySql.g:1181:1: ( '-' )
            // InternalEasySql.g:1182:2: '-'
            {
             before(grammarAccess.getVvalueAccess().getHyphenMinusKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVvalueAccess().getHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__Vvalue__Group__1__Impl"


    // $ANTLR start "rule__Vvalue__Group__2"
    // InternalEasySql.g:1191:1: rule__Vvalue__Group__2 : rule__Vvalue__Group__2__Impl rule__Vvalue__Group__3 ;
    public final void rule__Vvalue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1195:1: ( rule__Vvalue__Group__2__Impl rule__Vvalue__Group__3 )
            // InternalEasySql.g:1196:2: rule__Vvalue__Group__2__Impl rule__Vvalue__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Vvalue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vvalue__Group__3();

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
    // $ANTLR end "rule__Vvalue__Group__2"


    // $ANTLR start "rule__Vvalue__Group__2__Impl"
    // InternalEasySql.g:1203:1: rule__Vvalue__Group__2__Impl : ( ( rule__Vvalue__AttributeAssignment_2 ) ) ;
    public final void rule__Vvalue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1207:1: ( ( ( rule__Vvalue__AttributeAssignment_2 ) ) )
            // InternalEasySql.g:1208:1: ( ( rule__Vvalue__AttributeAssignment_2 ) )
            {
            // InternalEasySql.g:1208:1: ( ( rule__Vvalue__AttributeAssignment_2 ) )
            // InternalEasySql.g:1209:2: ( rule__Vvalue__AttributeAssignment_2 )
            {
             before(grammarAccess.getVvalueAccess().getAttributeAssignment_2()); 
            // InternalEasySql.g:1210:2: ( rule__Vvalue__AttributeAssignment_2 )
            // InternalEasySql.g:1210:3: rule__Vvalue__AttributeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Vvalue__AttributeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVvalueAccess().getAttributeAssignment_2()); 

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
    // $ANTLR end "rule__Vvalue__Group__2__Impl"


    // $ANTLR start "rule__Vvalue__Group__3"
    // InternalEasySql.g:1218:1: rule__Vvalue__Group__3 : rule__Vvalue__Group__3__Impl ;
    public final void rule__Vvalue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1222:1: ( rule__Vvalue__Group__3__Impl )
            // InternalEasySql.g:1223:2: rule__Vvalue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vvalue__Group__3__Impl();

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
    // $ANTLR end "rule__Vvalue__Group__3"


    // $ANTLR start "rule__Vvalue__Group__3__Impl"
    // InternalEasySql.g:1229:1: rule__Vvalue__Group__3__Impl : ( ( rule__Vvalue__SeparationAssignment_3 )* ) ;
    public final void rule__Vvalue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1233:1: ( ( ( rule__Vvalue__SeparationAssignment_3 )* ) )
            // InternalEasySql.g:1234:1: ( ( rule__Vvalue__SeparationAssignment_3 )* )
            {
            // InternalEasySql.g:1234:1: ( ( rule__Vvalue__SeparationAssignment_3 )* )
            // InternalEasySql.g:1235:2: ( rule__Vvalue__SeparationAssignment_3 )*
            {
             before(grammarAccess.getVvalueAccess().getSeparationAssignment_3()); 
            // InternalEasySql.g:1236:2: ( rule__Vvalue__SeparationAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==39) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEasySql.g:1236:3: rule__Vvalue__SeparationAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Vvalue__SeparationAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getVvalueAccess().getSeparationAssignment_3()); 

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
    // $ANTLR end "rule__Vvalue__Group__3__Impl"


    // $ANTLR start "rule__MultiEquation__Group__0"
    // InternalEasySql.g:1245:1: rule__MultiEquation__Group__0 : rule__MultiEquation__Group__0__Impl rule__MultiEquation__Group__1 ;
    public final void rule__MultiEquation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1249:1: ( rule__MultiEquation__Group__0__Impl rule__MultiEquation__Group__1 )
            // InternalEasySql.g:1250:2: rule__MultiEquation__Group__0__Impl rule__MultiEquation__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__MultiEquation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiEquation__Group__1();

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
    // $ANTLR end "rule__MultiEquation__Group__0"


    // $ANTLR start "rule__MultiEquation__Group__0__Impl"
    // InternalEasySql.g:1257:1: rule__MultiEquation__Group__0__Impl : ( ( rule__MultiEquation__EquationLeftAssignment_0 ) ) ;
    public final void rule__MultiEquation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1261:1: ( ( ( rule__MultiEquation__EquationLeftAssignment_0 ) ) )
            // InternalEasySql.g:1262:1: ( ( rule__MultiEquation__EquationLeftAssignment_0 ) )
            {
            // InternalEasySql.g:1262:1: ( ( rule__MultiEquation__EquationLeftAssignment_0 ) )
            // InternalEasySql.g:1263:2: ( rule__MultiEquation__EquationLeftAssignment_0 )
            {
             before(grammarAccess.getMultiEquationAccess().getEquationLeftAssignment_0()); 
            // InternalEasySql.g:1264:2: ( rule__MultiEquation__EquationLeftAssignment_0 )
            // InternalEasySql.g:1264:3: rule__MultiEquation__EquationLeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiEquation__EquationLeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiEquationAccess().getEquationLeftAssignment_0()); 

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
    // $ANTLR end "rule__MultiEquation__Group__0__Impl"


    // $ANTLR start "rule__MultiEquation__Group__1"
    // InternalEasySql.g:1272:1: rule__MultiEquation__Group__1 : rule__MultiEquation__Group__1__Impl rule__MultiEquation__Group__2 ;
    public final void rule__MultiEquation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1276:1: ( rule__MultiEquation__Group__1__Impl rule__MultiEquation__Group__2 )
            // InternalEasySql.g:1277:2: rule__MultiEquation__Group__1__Impl rule__MultiEquation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MultiEquation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiEquation__Group__2();

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
    // $ANTLR end "rule__MultiEquation__Group__1"


    // $ANTLR start "rule__MultiEquation__Group__1__Impl"
    // InternalEasySql.g:1284:1: rule__MultiEquation__Group__1__Impl : ( ( rule__MultiEquation__OperatorAssignment_1 ) ) ;
    public final void rule__MultiEquation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1288:1: ( ( ( rule__MultiEquation__OperatorAssignment_1 ) ) )
            // InternalEasySql.g:1289:1: ( ( rule__MultiEquation__OperatorAssignment_1 ) )
            {
            // InternalEasySql.g:1289:1: ( ( rule__MultiEquation__OperatorAssignment_1 ) )
            // InternalEasySql.g:1290:2: ( rule__MultiEquation__OperatorAssignment_1 )
            {
             before(grammarAccess.getMultiEquationAccess().getOperatorAssignment_1()); 
            // InternalEasySql.g:1291:2: ( rule__MultiEquation__OperatorAssignment_1 )
            // InternalEasySql.g:1291:3: rule__MultiEquation__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiEquation__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiEquationAccess().getOperatorAssignment_1()); 

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
    // $ANTLR end "rule__MultiEquation__Group__1__Impl"


    // $ANTLR start "rule__MultiEquation__Group__2"
    // InternalEasySql.g:1299:1: rule__MultiEquation__Group__2 : rule__MultiEquation__Group__2__Impl ;
    public final void rule__MultiEquation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1303:1: ( rule__MultiEquation__Group__2__Impl )
            // InternalEasySql.g:1304:2: rule__MultiEquation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiEquation__Group__2__Impl();

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
    // $ANTLR end "rule__MultiEquation__Group__2"


    // $ANTLR start "rule__MultiEquation__Group__2__Impl"
    // InternalEasySql.g:1310:1: rule__MultiEquation__Group__2__Impl : ( ( rule__MultiEquation__EquationRightAssignment_2 ) ) ;
    public final void rule__MultiEquation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1314:1: ( ( ( rule__MultiEquation__EquationRightAssignment_2 ) ) )
            // InternalEasySql.g:1315:1: ( ( rule__MultiEquation__EquationRightAssignment_2 ) )
            {
            // InternalEasySql.g:1315:1: ( ( rule__MultiEquation__EquationRightAssignment_2 ) )
            // InternalEasySql.g:1316:2: ( rule__MultiEquation__EquationRightAssignment_2 )
            {
             before(grammarAccess.getMultiEquationAccess().getEquationRightAssignment_2()); 
            // InternalEasySql.g:1317:2: ( rule__MultiEquation__EquationRightAssignment_2 )
            // InternalEasySql.g:1317:3: rule__MultiEquation__EquationRightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiEquation__EquationRightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiEquationAccess().getEquationRightAssignment_2()); 

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
    // $ANTLR end "rule__MultiEquation__Group__2__Impl"


    // $ANTLR start "rule__Insert__Group__0"
    // InternalEasySql.g:1326:1: rule__Insert__Group__0 : rule__Insert__Group__0__Impl rule__Insert__Group__1 ;
    public final void rule__Insert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1330:1: ( rule__Insert__Group__0__Impl rule__Insert__Group__1 )
            // InternalEasySql.g:1331:2: rule__Insert__Group__0__Impl rule__Insert__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Insert__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__1();

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
    // $ANTLR end "rule__Insert__Group__0"


    // $ANTLR start "rule__Insert__Group__0__Impl"
    // InternalEasySql.g:1338:1: rule__Insert__Group__0__Impl : ( ( rule__Insert__TableAssignment_0 ) ) ;
    public final void rule__Insert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1342:1: ( ( ( rule__Insert__TableAssignment_0 ) ) )
            // InternalEasySql.g:1343:1: ( ( rule__Insert__TableAssignment_0 ) )
            {
            // InternalEasySql.g:1343:1: ( ( rule__Insert__TableAssignment_0 ) )
            // InternalEasySql.g:1344:2: ( rule__Insert__TableAssignment_0 )
            {
             before(grammarAccess.getInsertAccess().getTableAssignment_0()); 
            // InternalEasySql.g:1345:2: ( rule__Insert__TableAssignment_0 )
            // InternalEasySql.g:1345:3: rule__Insert__TableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Insert__TableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getTableAssignment_0()); 

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
    // $ANTLR end "rule__Insert__Group__0__Impl"


    // $ANTLR start "rule__Insert__Group__1"
    // InternalEasySql.g:1353:1: rule__Insert__Group__1 : rule__Insert__Group__1__Impl rule__Insert__Group__2 ;
    public final void rule__Insert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1357:1: ( rule__Insert__Group__1__Impl rule__Insert__Group__2 )
            // InternalEasySql.g:1358:2: rule__Insert__Group__1__Impl rule__Insert__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Insert__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__2();

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
    // $ANTLR end "rule__Insert__Group__1"


    // $ANTLR start "rule__Insert__Group__1__Impl"
    // InternalEasySql.g:1365:1: rule__Insert__Group__1__Impl : ( '.Insert(' ) ;
    public final void rule__Insert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1369:1: ( ( '.Insert(' ) )
            // InternalEasySql.g:1370:1: ( '.Insert(' )
            {
            // InternalEasySql.g:1370:1: ( '.Insert(' )
            // InternalEasySql.g:1371:2: '.Insert('
            {
             before(grammarAccess.getInsertAccess().getInsertKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getInsertKeyword_1()); 

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
    // $ANTLR end "rule__Insert__Group__1__Impl"


    // $ANTLR start "rule__Insert__Group__2"
    // InternalEasySql.g:1380:1: rule__Insert__Group__2 : rule__Insert__Group__2__Impl rule__Insert__Group__3 ;
    public final void rule__Insert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1384:1: ( rule__Insert__Group__2__Impl rule__Insert__Group__3 )
            // InternalEasySql.g:1385:2: rule__Insert__Group__2__Impl rule__Insert__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Insert__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__3();

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
    // $ANTLR end "rule__Insert__Group__2"


    // $ANTLR start "rule__Insert__Group__2__Impl"
    // InternalEasySql.g:1392:1: rule__Insert__Group__2__Impl : ( ( rule__Insert__Insert_dataAssignment_2 )* ) ;
    public final void rule__Insert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1396:1: ( ( ( rule__Insert__Insert_dataAssignment_2 )* ) )
            // InternalEasySql.g:1397:1: ( ( rule__Insert__Insert_dataAssignment_2 )* )
            {
            // InternalEasySql.g:1397:1: ( ( rule__Insert__Insert_dataAssignment_2 )* )
            // InternalEasySql.g:1398:2: ( rule__Insert__Insert_dataAssignment_2 )*
            {
             before(grammarAccess.getInsertAccess().getInsert_dataAssignment_2()); 
            // InternalEasySql.g:1399:2: ( rule__Insert__Insert_dataAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_INT && LA12_0<=RULE_STRING)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEasySql.g:1399:3: rule__Insert__Insert_dataAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Insert__Insert_dataAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getInsertAccess().getInsert_dataAssignment_2()); 

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
    // $ANTLR end "rule__Insert__Group__2__Impl"


    // $ANTLR start "rule__Insert__Group__3"
    // InternalEasySql.g:1407:1: rule__Insert__Group__3 : rule__Insert__Group__3__Impl ;
    public final void rule__Insert__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1411:1: ( rule__Insert__Group__3__Impl )
            // InternalEasySql.g:1412:2: rule__Insert__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group__3__Impl();

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
    // $ANTLR end "rule__Insert__Group__3"


    // $ANTLR start "rule__Insert__Group__3__Impl"
    // InternalEasySql.g:1418:1: rule__Insert__Group__3__Impl : ( ')' ) ;
    public final void rule__Insert__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1422:1: ( ( ')' ) )
            // InternalEasySql.g:1423:1: ( ')' )
            {
            // InternalEasySql.g:1423:1: ( ')' )
            // InternalEasySql.g:1424:2: ')'
            {
             before(grammarAccess.getInsertAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Insert__Group__3__Impl"


    // $ANTLR start "rule__Update__Group__0"
    // InternalEasySql.g:1434:1: rule__Update__Group__0 : rule__Update__Group__0__Impl rule__Update__Group__1 ;
    public final void rule__Update__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1438:1: ( rule__Update__Group__0__Impl rule__Update__Group__1 )
            // InternalEasySql.g:1439:2: rule__Update__Group__0__Impl rule__Update__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Update__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__1();

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
    // $ANTLR end "rule__Update__Group__0"


    // $ANTLR start "rule__Update__Group__0__Impl"
    // InternalEasySql.g:1446:1: rule__Update__Group__0__Impl : ( ( rule__Update__TableAssignment_0 ) ) ;
    public final void rule__Update__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1450:1: ( ( ( rule__Update__TableAssignment_0 ) ) )
            // InternalEasySql.g:1451:1: ( ( rule__Update__TableAssignment_0 ) )
            {
            // InternalEasySql.g:1451:1: ( ( rule__Update__TableAssignment_0 ) )
            // InternalEasySql.g:1452:2: ( rule__Update__TableAssignment_0 )
            {
             before(grammarAccess.getUpdateAccess().getTableAssignment_0()); 
            // InternalEasySql.g:1453:2: ( rule__Update__TableAssignment_0 )
            // InternalEasySql.g:1453:3: rule__Update__TableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Update__TableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getTableAssignment_0()); 

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
    // $ANTLR end "rule__Update__Group__0__Impl"


    // $ANTLR start "rule__Update__Group__1"
    // InternalEasySql.g:1461:1: rule__Update__Group__1 : rule__Update__Group__1__Impl rule__Update__Group__2 ;
    public final void rule__Update__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1465:1: ( rule__Update__Group__1__Impl rule__Update__Group__2 )
            // InternalEasySql.g:1466:2: rule__Update__Group__1__Impl rule__Update__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Update__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__2();

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
    // $ANTLR end "rule__Update__Group__1"


    // $ANTLR start "rule__Update__Group__1__Impl"
    // InternalEasySql.g:1473:1: rule__Update__Group__1__Impl : ( '.Update(' ) ;
    public final void rule__Update__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1477:1: ( ( '.Update(' ) )
            // InternalEasySql.g:1478:1: ( '.Update(' )
            {
            // InternalEasySql.g:1478:1: ( '.Update(' )
            // InternalEasySql.g:1479:2: '.Update('
            {
             before(grammarAccess.getUpdateAccess().getUpdateKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getUpdateKeyword_1()); 

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
    // $ANTLR end "rule__Update__Group__1__Impl"


    // $ANTLR start "rule__Update__Group__2"
    // InternalEasySql.g:1488:1: rule__Update__Group__2 : rule__Update__Group__2__Impl rule__Update__Group__3 ;
    public final void rule__Update__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1492:1: ( rule__Update__Group__2__Impl rule__Update__Group__3 )
            // InternalEasySql.g:1493:2: rule__Update__Group__2__Impl rule__Update__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Update__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__3();

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
    // $ANTLR end "rule__Update__Group__2"


    // $ANTLR start "rule__Update__Group__2__Impl"
    // InternalEasySql.g:1500:1: rule__Update__Group__2__Impl : ( ( rule__Update__ModificationAssignment_2 )* ) ;
    public final void rule__Update__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1504:1: ( ( ( rule__Update__ModificationAssignment_2 )* ) )
            // InternalEasySql.g:1505:1: ( ( rule__Update__ModificationAssignment_2 )* )
            {
            // InternalEasySql.g:1505:1: ( ( rule__Update__ModificationAssignment_2 )* )
            // InternalEasySql.g:1506:2: ( rule__Update__ModificationAssignment_2 )*
            {
             before(grammarAccess.getUpdateAccess().getModificationAssignment_2()); 
            // InternalEasySql.g:1507:2: ( rule__Update__ModificationAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEasySql.g:1507:3: rule__Update__ModificationAssignment_2
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Update__ModificationAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getUpdateAccess().getModificationAssignment_2()); 

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
    // $ANTLR end "rule__Update__Group__2__Impl"


    // $ANTLR start "rule__Update__Group__3"
    // InternalEasySql.g:1515:1: rule__Update__Group__3 : rule__Update__Group__3__Impl rule__Update__Group__4 ;
    public final void rule__Update__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1519:1: ( rule__Update__Group__3__Impl rule__Update__Group__4 )
            // InternalEasySql.g:1520:2: rule__Update__Group__3__Impl rule__Update__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Update__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__4();

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
    // $ANTLR end "rule__Update__Group__3"


    // $ANTLR start "rule__Update__Group__3__Impl"
    // InternalEasySql.g:1527:1: rule__Update__Group__3__Impl : ( ')' ) ;
    public final void rule__Update__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1531:1: ( ( ')' ) )
            // InternalEasySql.g:1532:1: ( ')' )
            {
            // InternalEasySql.g:1532:1: ( ')' )
            // InternalEasySql.g:1533:2: ')'
            {
             before(grammarAccess.getUpdateAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Update__Group__3__Impl"


    // $ANTLR start "rule__Update__Group__4"
    // InternalEasySql.g:1542:1: rule__Update__Group__4 : rule__Update__Group__4__Impl rule__Update__Group__5 ;
    public final void rule__Update__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1546:1: ( rule__Update__Group__4__Impl rule__Update__Group__5 )
            // InternalEasySql.g:1547:2: rule__Update__Group__4__Impl rule__Update__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Update__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__5();

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
    // $ANTLR end "rule__Update__Group__4"


    // $ANTLR start "rule__Update__Group__4__Impl"
    // InternalEasySql.g:1554:1: rule__Update__Group__4__Impl : ( '.Condition(' ) ;
    public final void rule__Update__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1558:1: ( ( '.Condition(' ) )
            // InternalEasySql.g:1559:1: ( '.Condition(' )
            {
            // InternalEasySql.g:1559:1: ( '.Condition(' )
            // InternalEasySql.g:1560:2: '.Condition('
            {
             before(grammarAccess.getUpdateAccess().getConditionKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getConditionKeyword_4()); 

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
    // $ANTLR end "rule__Update__Group__4__Impl"


    // $ANTLR start "rule__Update__Group__5"
    // InternalEasySql.g:1569:1: rule__Update__Group__5 : rule__Update__Group__5__Impl rule__Update__Group__6 ;
    public final void rule__Update__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1573:1: ( rule__Update__Group__5__Impl rule__Update__Group__6 )
            // InternalEasySql.g:1574:2: rule__Update__Group__5__Impl rule__Update__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Update__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__6();

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
    // $ANTLR end "rule__Update__Group__5"


    // $ANTLR start "rule__Update__Group__5__Impl"
    // InternalEasySql.g:1581:1: rule__Update__Group__5__Impl : ( ( rule__Update__UpdateconditionAssignment_5 )* ) ;
    public final void rule__Update__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1585:1: ( ( ( rule__Update__UpdateconditionAssignment_5 )* ) )
            // InternalEasySql.g:1586:1: ( ( rule__Update__UpdateconditionAssignment_5 )* )
            {
            // InternalEasySql.g:1586:1: ( ( rule__Update__UpdateconditionAssignment_5 )* )
            // InternalEasySql.g:1587:2: ( rule__Update__UpdateconditionAssignment_5 )*
            {
             before(grammarAccess.getUpdateAccess().getUpdateconditionAssignment_5()); 
            // InternalEasySql.g:1588:2: ( rule__Update__UpdateconditionAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEasySql.g:1588:3: rule__Update__UpdateconditionAssignment_5
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Update__UpdateconditionAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getUpdateAccess().getUpdateconditionAssignment_5()); 

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
    // $ANTLR end "rule__Update__Group__5__Impl"


    // $ANTLR start "rule__Update__Group__6"
    // InternalEasySql.g:1596:1: rule__Update__Group__6 : rule__Update__Group__6__Impl ;
    public final void rule__Update__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1600:1: ( rule__Update__Group__6__Impl )
            // InternalEasySql.g:1601:2: rule__Update__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Update__Group__6__Impl();

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
    // $ANTLR end "rule__Update__Group__6"


    // $ANTLR start "rule__Update__Group__6__Impl"
    // InternalEasySql.g:1607:1: rule__Update__Group__6__Impl : ( ')' ) ;
    public final void rule__Update__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1611:1: ( ( ')' ) )
            // InternalEasySql.g:1612:1: ( ')' )
            {
            // InternalEasySql.g:1612:1: ( ')' )
            // InternalEasySql.g:1613:2: ')'
            {
             before(grammarAccess.getUpdateAccess().getRightParenthesisKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Update__Group__6__Impl"


    // $ANTLR start "rule__Delete__Group__0"
    // InternalEasySql.g:1623:1: rule__Delete__Group__0 : rule__Delete__Group__0__Impl rule__Delete__Group__1 ;
    public final void rule__Delete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1627:1: ( rule__Delete__Group__0__Impl rule__Delete__Group__1 )
            // InternalEasySql.g:1628:2: rule__Delete__Group__0__Impl rule__Delete__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Delete__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group__1();

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
    // $ANTLR end "rule__Delete__Group__0"


    // $ANTLR start "rule__Delete__Group__0__Impl"
    // InternalEasySql.g:1635:1: rule__Delete__Group__0__Impl : ( ( rule__Delete__TableAssignment_0 ) ) ;
    public final void rule__Delete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1639:1: ( ( ( rule__Delete__TableAssignment_0 ) ) )
            // InternalEasySql.g:1640:1: ( ( rule__Delete__TableAssignment_0 ) )
            {
            // InternalEasySql.g:1640:1: ( ( rule__Delete__TableAssignment_0 ) )
            // InternalEasySql.g:1641:2: ( rule__Delete__TableAssignment_0 )
            {
             before(grammarAccess.getDeleteAccess().getTableAssignment_0()); 
            // InternalEasySql.g:1642:2: ( rule__Delete__TableAssignment_0 )
            // InternalEasySql.g:1642:3: rule__Delete__TableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Delete__TableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getTableAssignment_0()); 

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
    // $ANTLR end "rule__Delete__Group__0__Impl"


    // $ANTLR start "rule__Delete__Group__1"
    // InternalEasySql.g:1650:1: rule__Delete__Group__1 : rule__Delete__Group__1__Impl rule__Delete__Group__2 ;
    public final void rule__Delete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1654:1: ( rule__Delete__Group__1__Impl rule__Delete__Group__2 )
            // InternalEasySql.g:1655:2: rule__Delete__Group__1__Impl rule__Delete__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Delete__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group__2();

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
    // $ANTLR end "rule__Delete__Group__1"


    // $ANTLR start "rule__Delete__Group__1__Impl"
    // InternalEasySql.g:1662:1: rule__Delete__Group__1__Impl : ( '.Delete(' ) ;
    public final void rule__Delete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1666:1: ( ( '.Delete(' ) )
            // InternalEasySql.g:1667:1: ( '.Delete(' )
            {
            // InternalEasySql.g:1667:1: ( '.Delete(' )
            // InternalEasySql.g:1668:2: '.Delete('
            {
             before(grammarAccess.getDeleteAccess().getDeleteKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getDeleteKeyword_1()); 

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
    // $ANTLR end "rule__Delete__Group__1__Impl"


    // $ANTLR start "rule__Delete__Group__2"
    // InternalEasySql.g:1677:1: rule__Delete__Group__2 : rule__Delete__Group__2__Impl rule__Delete__Group__3 ;
    public final void rule__Delete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1681:1: ( rule__Delete__Group__2__Impl rule__Delete__Group__3 )
            // InternalEasySql.g:1682:2: rule__Delete__Group__2__Impl rule__Delete__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Delete__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group__3();

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
    // $ANTLR end "rule__Delete__Group__2"


    // $ANTLR start "rule__Delete__Group__2__Impl"
    // InternalEasySql.g:1689:1: rule__Delete__Group__2__Impl : ( ( rule__Delete__DeleteconditionAssignment_2 )* ) ;
    public final void rule__Delete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1693:1: ( ( ( rule__Delete__DeleteconditionAssignment_2 )* ) )
            // InternalEasySql.g:1694:1: ( ( rule__Delete__DeleteconditionAssignment_2 )* )
            {
            // InternalEasySql.g:1694:1: ( ( rule__Delete__DeleteconditionAssignment_2 )* )
            // InternalEasySql.g:1695:2: ( rule__Delete__DeleteconditionAssignment_2 )*
            {
             before(grammarAccess.getDeleteAccess().getDeleteconditionAssignment_2()); 
            // InternalEasySql.g:1696:2: ( rule__Delete__DeleteconditionAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalEasySql.g:1696:3: rule__Delete__DeleteconditionAssignment_2
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Delete__DeleteconditionAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getDeleteAccess().getDeleteconditionAssignment_2()); 

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
    // $ANTLR end "rule__Delete__Group__2__Impl"


    // $ANTLR start "rule__Delete__Group__3"
    // InternalEasySql.g:1704:1: rule__Delete__Group__3 : rule__Delete__Group__3__Impl ;
    public final void rule__Delete__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1708:1: ( rule__Delete__Group__3__Impl )
            // InternalEasySql.g:1709:2: rule__Delete__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group__3__Impl();

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
    // $ANTLR end "rule__Delete__Group__3"


    // $ANTLR start "rule__Delete__Group__3__Impl"
    // InternalEasySql.g:1715:1: rule__Delete__Group__3__Impl : ( ')' ) ;
    public final void rule__Delete__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1719:1: ( ( ')' ) )
            // InternalEasySql.g:1720:1: ( ')' )
            {
            // InternalEasySql.g:1720:1: ( ')' )
            // InternalEasySql.g:1721:2: ')'
            {
             before(grammarAccess.getDeleteAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Delete__Group__3__Impl"


    // $ANTLR start "rule__SimpleSelectQuery__Group__0"
    // InternalEasySql.g:1731:1: rule__SimpleSelectQuery__Group__0 : rule__SimpleSelectQuery__Group__0__Impl rule__SimpleSelectQuery__Group__1 ;
    public final void rule__SimpleSelectQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1735:1: ( rule__SimpleSelectQuery__Group__0__Impl rule__SimpleSelectQuery__Group__1 )
            // InternalEasySql.g:1736:2: rule__SimpleSelectQuery__Group__0__Impl rule__SimpleSelectQuery__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__SimpleSelectQuery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleSelectQuery__Group__1();

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
    // $ANTLR end "rule__SimpleSelectQuery__Group__0"


    // $ANTLR start "rule__SimpleSelectQuery__Group__0__Impl"
    // InternalEasySql.g:1743:1: rule__SimpleSelectQuery__Group__0__Impl : ( ( rule__SimpleSelectQuery__StableAssignment_0 ) ) ;
    public final void rule__SimpleSelectQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1747:1: ( ( ( rule__SimpleSelectQuery__StableAssignment_0 ) ) )
            // InternalEasySql.g:1748:1: ( ( rule__SimpleSelectQuery__StableAssignment_0 ) )
            {
            // InternalEasySql.g:1748:1: ( ( rule__SimpleSelectQuery__StableAssignment_0 ) )
            // InternalEasySql.g:1749:2: ( rule__SimpleSelectQuery__StableAssignment_0 )
            {
             before(grammarAccess.getSimpleSelectQueryAccess().getStableAssignment_0()); 
            // InternalEasySql.g:1750:2: ( rule__SimpleSelectQuery__StableAssignment_0 )
            // InternalEasySql.g:1750:3: rule__SimpleSelectQuery__StableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleSelectQuery__StableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleSelectQueryAccess().getStableAssignment_0()); 

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
    // $ANTLR end "rule__SimpleSelectQuery__Group__0__Impl"


    // $ANTLR start "rule__SimpleSelectQuery__Group__1"
    // InternalEasySql.g:1758:1: rule__SimpleSelectQuery__Group__1 : rule__SimpleSelectQuery__Group__1__Impl rule__SimpleSelectQuery__Group__2 ;
    public final void rule__SimpleSelectQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1762:1: ( rule__SimpleSelectQuery__Group__1__Impl rule__SimpleSelectQuery__Group__2 )
            // InternalEasySql.g:1763:2: rule__SimpleSelectQuery__Group__1__Impl rule__SimpleSelectQuery__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__SimpleSelectQuery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleSelectQuery__Group__2();

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
    // $ANTLR end "rule__SimpleSelectQuery__Group__1"


    // $ANTLR start "rule__SimpleSelectQuery__Group__1__Impl"
    // InternalEasySql.g:1770:1: rule__SimpleSelectQuery__Group__1__Impl : ( '.Search(' ) ;
    public final void rule__SimpleSelectQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1774:1: ( ( '.Search(' ) )
            // InternalEasySql.g:1775:1: ( '.Search(' )
            {
            // InternalEasySql.g:1775:1: ( '.Search(' )
            // InternalEasySql.g:1776:2: '.Search('
            {
             before(grammarAccess.getSimpleSelectQueryAccess().getSearchKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSimpleSelectQueryAccess().getSearchKeyword_1()); 

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
    // $ANTLR end "rule__SimpleSelectQuery__Group__1__Impl"


    // $ANTLR start "rule__SimpleSelectQuery__Group__2"
    // InternalEasySql.g:1785:1: rule__SimpleSelectQuery__Group__2 : rule__SimpleSelectQuery__Group__2__Impl rule__SimpleSelectQuery__Group__3 ;
    public final void rule__SimpleSelectQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1789:1: ( rule__SimpleSelectQuery__Group__2__Impl rule__SimpleSelectQuery__Group__3 )
            // InternalEasySql.g:1790:2: rule__SimpleSelectQuery__Group__2__Impl rule__SimpleSelectQuery__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__SimpleSelectQuery__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleSelectQuery__Group__3();

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
    // $ANTLR end "rule__SimpleSelectQuery__Group__2"


    // $ANTLR start "rule__SimpleSelectQuery__Group__2__Impl"
    // InternalEasySql.g:1797:1: rule__SimpleSelectQuery__Group__2__Impl : ( ( rule__SimpleSelectQuery__SattributesAssignment_2 )* ) ;
    public final void rule__SimpleSelectQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1801:1: ( ( ( rule__SimpleSelectQuery__SattributesAssignment_2 )* ) )
            // InternalEasySql.g:1802:1: ( ( rule__SimpleSelectQuery__SattributesAssignment_2 )* )
            {
            // InternalEasySql.g:1802:1: ( ( rule__SimpleSelectQuery__SattributesAssignment_2 )* )
            // InternalEasySql.g:1803:2: ( rule__SimpleSelectQuery__SattributesAssignment_2 )*
            {
             before(grammarAccess.getSimpleSelectQueryAccess().getSattributesAssignment_2()); 
            // InternalEasySql.g:1804:2: ( rule__SimpleSelectQuery__SattributesAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_INT && LA16_0<=RULE_STRING)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalEasySql.g:1804:3: rule__SimpleSelectQuery__SattributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SimpleSelectQuery__SattributesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSimpleSelectQueryAccess().getSattributesAssignment_2()); 

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
    // $ANTLR end "rule__SimpleSelectQuery__Group__2__Impl"


    // $ANTLR start "rule__SimpleSelectQuery__Group__3"
    // InternalEasySql.g:1812:1: rule__SimpleSelectQuery__Group__3 : rule__SimpleSelectQuery__Group__3__Impl rule__SimpleSelectQuery__Group__4 ;
    public final void rule__SimpleSelectQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1816:1: ( rule__SimpleSelectQuery__Group__3__Impl rule__SimpleSelectQuery__Group__4 )
            // InternalEasySql.g:1817:2: rule__SimpleSelectQuery__Group__3__Impl rule__SimpleSelectQuery__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__SimpleSelectQuery__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleSelectQuery__Group__4();

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
    // $ANTLR end "rule__SimpleSelectQuery__Group__3"


    // $ANTLR start "rule__SimpleSelectQuery__Group__3__Impl"
    // InternalEasySql.g:1824:1: rule__SimpleSelectQuery__Group__3__Impl : ( ')' ) ;
    public final void rule__SimpleSelectQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1828:1: ( ( ')' ) )
            // InternalEasySql.g:1829:1: ( ')' )
            {
            // InternalEasySql.g:1829:1: ( ')' )
            // InternalEasySql.g:1830:2: ')'
            {
             before(grammarAccess.getSimpleSelectQueryAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSimpleSelectQueryAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__SimpleSelectQuery__Group__3__Impl"


    // $ANTLR start "rule__SimpleSelectQuery__Group__4"
    // InternalEasySql.g:1839:1: rule__SimpleSelectQuery__Group__4 : rule__SimpleSelectQuery__Group__4__Impl rule__SimpleSelectQuery__Group__5 ;
    public final void rule__SimpleSelectQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1843:1: ( rule__SimpleSelectQuery__Group__4__Impl rule__SimpleSelectQuery__Group__5 )
            // InternalEasySql.g:1844:2: rule__SimpleSelectQuery__Group__4__Impl rule__SimpleSelectQuery__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__SimpleSelectQuery__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleSelectQuery__Group__5();

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
    // $ANTLR end "rule__SimpleSelectQuery__Group__4"


    // $ANTLR start "rule__SimpleSelectQuery__Group__4__Impl"
    // InternalEasySql.g:1851:1: rule__SimpleSelectQuery__Group__4__Impl : ( '.Condition(' ) ;
    public final void rule__SimpleSelectQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1855:1: ( ( '.Condition(' ) )
            // InternalEasySql.g:1856:1: ( '.Condition(' )
            {
            // InternalEasySql.g:1856:1: ( '.Condition(' )
            // InternalEasySql.g:1857:2: '.Condition('
            {
             before(grammarAccess.getSimpleSelectQueryAccess().getConditionKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSimpleSelectQueryAccess().getConditionKeyword_4()); 

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
    // $ANTLR end "rule__SimpleSelectQuery__Group__4__Impl"


    // $ANTLR start "rule__SimpleSelectQuery__Group__5"
    // InternalEasySql.g:1866:1: rule__SimpleSelectQuery__Group__5 : rule__SimpleSelectQuery__Group__5__Impl rule__SimpleSelectQuery__Group__6 ;
    public final void rule__SimpleSelectQuery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1870:1: ( rule__SimpleSelectQuery__Group__5__Impl rule__SimpleSelectQuery__Group__6 )
            // InternalEasySql.g:1871:2: rule__SimpleSelectQuery__Group__5__Impl rule__SimpleSelectQuery__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__SimpleSelectQuery__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleSelectQuery__Group__6();

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
    // $ANTLR end "rule__SimpleSelectQuery__Group__5"


    // $ANTLR start "rule__SimpleSelectQuery__Group__5__Impl"
    // InternalEasySql.g:1878:1: rule__SimpleSelectQuery__Group__5__Impl : ( ( rule__SimpleSelectQuery__SimpleconditionAssignment_5 )* ) ;
    public final void rule__SimpleSelectQuery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1882:1: ( ( ( rule__SimpleSelectQuery__SimpleconditionAssignment_5 )* ) )
            // InternalEasySql.g:1883:1: ( ( rule__SimpleSelectQuery__SimpleconditionAssignment_5 )* )
            {
            // InternalEasySql.g:1883:1: ( ( rule__SimpleSelectQuery__SimpleconditionAssignment_5 )* )
            // InternalEasySql.g:1884:2: ( rule__SimpleSelectQuery__SimpleconditionAssignment_5 )*
            {
             before(grammarAccess.getSimpleSelectQueryAccess().getSimpleconditionAssignment_5()); 
            // InternalEasySql.g:1885:2: ( rule__SimpleSelectQuery__SimpleconditionAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalEasySql.g:1885:3: rule__SimpleSelectQuery__SimpleconditionAssignment_5
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__SimpleSelectQuery__SimpleconditionAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSimpleSelectQueryAccess().getSimpleconditionAssignment_5()); 

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
    // $ANTLR end "rule__SimpleSelectQuery__Group__5__Impl"


    // $ANTLR start "rule__SimpleSelectQuery__Group__6"
    // InternalEasySql.g:1893:1: rule__SimpleSelectQuery__Group__6 : rule__SimpleSelectQuery__Group__6__Impl rule__SimpleSelectQuery__Group__7 ;
    public final void rule__SimpleSelectQuery__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1897:1: ( rule__SimpleSelectQuery__Group__6__Impl rule__SimpleSelectQuery__Group__7 )
            // InternalEasySql.g:1898:2: rule__SimpleSelectQuery__Group__6__Impl rule__SimpleSelectQuery__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__SimpleSelectQuery__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleSelectQuery__Group__7();

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
    // $ANTLR end "rule__SimpleSelectQuery__Group__6"


    // $ANTLR start "rule__SimpleSelectQuery__Group__6__Impl"
    // InternalEasySql.g:1905:1: rule__SimpleSelectQuery__Group__6__Impl : ( ')' ) ;
    public final void rule__SimpleSelectQuery__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1909:1: ( ( ')' ) )
            // InternalEasySql.g:1910:1: ( ')' )
            {
            // InternalEasySql.g:1910:1: ( ')' )
            // InternalEasySql.g:1911:2: ')'
            {
             before(grammarAccess.getSimpleSelectQueryAccess().getRightParenthesisKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSimpleSelectQueryAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__SimpleSelectQuery__Group__6__Impl"


    // $ANTLR start "rule__SimpleSelectQuery__Group__7"
    // InternalEasySql.g:1920:1: rule__SimpleSelectQuery__Group__7 : rule__SimpleSelectQuery__Group__7__Impl rule__SimpleSelectQuery__Group__8 ;
    public final void rule__SimpleSelectQuery__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1924:1: ( rule__SimpleSelectQuery__Group__7__Impl rule__SimpleSelectQuery__Group__8 )
            // InternalEasySql.g:1925:2: rule__SimpleSelectQuery__Group__7__Impl rule__SimpleSelectQuery__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__SimpleSelectQuery__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleSelectQuery__Group__8();

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
    // $ANTLR end "rule__SimpleSelectQuery__Group__7"


    // $ANTLR start "rule__SimpleSelectQuery__Group__7__Impl"
    // InternalEasySql.g:1932:1: rule__SimpleSelectQuery__Group__7__Impl : ( ( rule__SimpleSelectQuery__RemoveDupAssignment_7 )? ) ;
    public final void rule__SimpleSelectQuery__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1936:1: ( ( ( rule__SimpleSelectQuery__RemoveDupAssignment_7 )? ) )
            // InternalEasySql.g:1937:1: ( ( rule__SimpleSelectQuery__RemoveDupAssignment_7 )? )
            {
            // InternalEasySql.g:1937:1: ( ( rule__SimpleSelectQuery__RemoveDupAssignment_7 )? )
            // InternalEasySql.g:1938:2: ( rule__SimpleSelectQuery__RemoveDupAssignment_7 )?
            {
             before(grammarAccess.getSimpleSelectQueryAccess().getRemoveDupAssignment_7()); 
            // InternalEasySql.g:1939:2: ( rule__SimpleSelectQuery__RemoveDupAssignment_7 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==40) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEasySql.g:1939:3: rule__SimpleSelectQuery__RemoveDupAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleSelectQuery__RemoveDupAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleSelectQueryAccess().getRemoveDupAssignment_7()); 

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
    // $ANTLR end "rule__SimpleSelectQuery__Group__7__Impl"


    // $ANTLR start "rule__SimpleSelectQuery__Group__8"
    // InternalEasySql.g:1947:1: rule__SimpleSelectQuery__Group__8 : rule__SimpleSelectQuery__Group__8__Impl ;
    public final void rule__SimpleSelectQuery__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1951:1: ( rule__SimpleSelectQuery__Group__8__Impl )
            // InternalEasySql.g:1952:2: rule__SimpleSelectQuery__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleSelectQuery__Group__8__Impl();

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
    // $ANTLR end "rule__SimpleSelectQuery__Group__8"


    // $ANTLR start "rule__SimpleSelectQuery__Group__8__Impl"
    // InternalEasySql.g:1958:1: rule__SimpleSelectQuery__Group__8__Impl : ( ( rule__SimpleSelectQuery__Group_8__0 )? ) ;
    public final void rule__SimpleSelectQuery__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1962:1: ( ( ( rule__SimpleSelectQuery__Group_8__0 )? ) )
            // InternalEasySql.g:1963:1: ( ( rule__SimpleSelectQuery__Group_8__0 )? )
            {
            // InternalEasySql.g:1963:1: ( ( rule__SimpleSelectQuery__Group_8__0 )? )
            // InternalEasySql.g:1964:2: ( rule__SimpleSelectQuery__Group_8__0 )?
            {
             before(grammarAccess.getSimpleSelectQueryAccess().getGroup_8()); 
            // InternalEasySql.g:1965:2: ( rule__SimpleSelectQuery__Group_8__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEasySql.g:1965:3: rule__SimpleSelectQuery__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleSelectQuery__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleSelectQueryAccess().getGroup_8()); 

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
    // $ANTLR end "rule__SimpleSelectQuery__Group__8__Impl"


    // $ANTLR start "rule__SimpleSelectQuery__Group_8__0"
    // InternalEasySql.g:1974:1: rule__SimpleSelectQuery__Group_8__0 : rule__SimpleSelectQuery__Group_8__0__Impl rule__SimpleSelectQuery__Group_8__1 ;
    public final void rule__SimpleSelectQuery__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1978:1: ( rule__SimpleSelectQuery__Group_8__0__Impl rule__SimpleSelectQuery__Group_8__1 )
            // InternalEasySql.g:1979:2: rule__SimpleSelectQuery__Group_8__0__Impl rule__SimpleSelectQuery__Group_8__1
            {
            pushFollow(FOLLOW_21);
            rule__SimpleSelectQuery__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleSelectQuery__Group_8__1();

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
    // $ANTLR end "rule__SimpleSelectQuery__Group_8__0"


    // $ANTLR start "rule__SimpleSelectQuery__Group_8__0__Impl"
    // InternalEasySql.g:1986:1: rule__SimpleSelectQuery__Group_8__0__Impl : ( '.' ) ;
    public final void rule__SimpleSelectQuery__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:1990:1: ( ( '.' ) )
            // InternalEasySql.g:1991:1: ( '.' )
            {
            // InternalEasySql.g:1991:1: ( '.' )
            // InternalEasySql.g:1992:2: '.'
            {
             before(grammarAccess.getSimpleSelectQueryAccess().getFullStopKeyword_8_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSimpleSelectQueryAccess().getFullStopKeyword_8_0()); 

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
    // $ANTLR end "rule__SimpleSelectQuery__Group_8__0__Impl"


    // $ANTLR start "rule__SimpleSelectQuery__Group_8__1"
    // InternalEasySql.g:2001:1: rule__SimpleSelectQuery__Group_8__1 : rule__SimpleSelectQuery__Group_8__1__Impl rule__SimpleSelectQuery__Group_8__2 ;
    public final void rule__SimpleSelectQuery__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2005:1: ( rule__SimpleSelectQuery__Group_8__1__Impl rule__SimpleSelectQuery__Group_8__2 )
            // InternalEasySql.g:2006:2: rule__SimpleSelectQuery__Group_8__1__Impl rule__SimpleSelectQuery__Group_8__2
            {
            pushFollow(FOLLOW_22);
            rule__SimpleSelectQuery__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleSelectQuery__Group_8__2();

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
    // $ANTLR end "rule__SimpleSelectQuery__Group_8__1"


    // $ANTLR start "rule__SimpleSelectQuery__Group_8__1__Impl"
    // InternalEasySql.g:2013:1: rule__SimpleSelectQuery__Group_8__1__Impl : ( ( rule__SimpleSelectQuery__OrdertypeAssignment_8_1 ) ) ;
    public final void rule__SimpleSelectQuery__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2017:1: ( ( ( rule__SimpleSelectQuery__OrdertypeAssignment_8_1 ) ) )
            // InternalEasySql.g:2018:1: ( ( rule__SimpleSelectQuery__OrdertypeAssignment_8_1 ) )
            {
            // InternalEasySql.g:2018:1: ( ( rule__SimpleSelectQuery__OrdertypeAssignment_8_1 ) )
            // InternalEasySql.g:2019:2: ( rule__SimpleSelectQuery__OrdertypeAssignment_8_1 )
            {
             before(grammarAccess.getSimpleSelectQueryAccess().getOrdertypeAssignment_8_1()); 
            // InternalEasySql.g:2020:2: ( rule__SimpleSelectQuery__OrdertypeAssignment_8_1 )
            // InternalEasySql.g:2020:3: rule__SimpleSelectQuery__OrdertypeAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleSelectQuery__OrdertypeAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleSelectQueryAccess().getOrdertypeAssignment_8_1()); 

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
    // $ANTLR end "rule__SimpleSelectQuery__Group_8__1__Impl"


    // $ANTLR start "rule__SimpleSelectQuery__Group_8__2"
    // InternalEasySql.g:2028:1: rule__SimpleSelectQuery__Group_8__2 : rule__SimpleSelectQuery__Group_8__2__Impl rule__SimpleSelectQuery__Group_8__3 ;
    public final void rule__SimpleSelectQuery__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2032:1: ( rule__SimpleSelectQuery__Group_8__2__Impl rule__SimpleSelectQuery__Group_8__3 )
            // InternalEasySql.g:2033:2: rule__SimpleSelectQuery__Group_8__2__Impl rule__SimpleSelectQuery__Group_8__3
            {
            pushFollow(FOLLOW_12);
            rule__SimpleSelectQuery__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleSelectQuery__Group_8__3();

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
    // $ANTLR end "rule__SimpleSelectQuery__Group_8__2"


    // $ANTLR start "rule__SimpleSelectQuery__Group_8__2__Impl"
    // InternalEasySql.g:2040:1: rule__SimpleSelectQuery__Group_8__2__Impl : ( '(' ) ;
    public final void rule__SimpleSelectQuery__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2044:1: ( ( '(' ) )
            // InternalEasySql.g:2045:1: ( '(' )
            {
            // InternalEasySql.g:2045:1: ( '(' )
            // InternalEasySql.g:2046:2: '('
            {
             before(grammarAccess.getSimpleSelectQueryAccess().getLeftParenthesisKeyword_8_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSimpleSelectQueryAccess().getLeftParenthesisKeyword_8_2()); 

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
    // $ANTLR end "rule__SimpleSelectQuery__Group_8__2__Impl"


    // $ANTLR start "rule__SimpleSelectQuery__Group_8__3"
    // InternalEasySql.g:2055:1: rule__SimpleSelectQuery__Group_8__3 : rule__SimpleSelectQuery__Group_8__3__Impl rule__SimpleSelectQuery__Group_8__4 ;
    public final void rule__SimpleSelectQuery__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2059:1: ( rule__SimpleSelectQuery__Group_8__3__Impl rule__SimpleSelectQuery__Group_8__4 )
            // InternalEasySql.g:2060:2: rule__SimpleSelectQuery__Group_8__3__Impl rule__SimpleSelectQuery__Group_8__4
            {
            pushFollow(FOLLOW_12);
            rule__SimpleSelectQuery__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleSelectQuery__Group_8__4();

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
    // $ANTLR end "rule__SimpleSelectQuery__Group_8__3"


    // $ANTLR start "rule__SimpleSelectQuery__Group_8__3__Impl"
    // InternalEasySql.g:2067:1: rule__SimpleSelectQuery__Group_8__3__Impl : ( ( rule__SimpleSelectQuery__SCattributesAssignment_8_3 )* ) ;
    public final void rule__SimpleSelectQuery__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2071:1: ( ( ( rule__SimpleSelectQuery__SCattributesAssignment_8_3 )* ) )
            // InternalEasySql.g:2072:1: ( ( rule__SimpleSelectQuery__SCattributesAssignment_8_3 )* )
            {
            // InternalEasySql.g:2072:1: ( ( rule__SimpleSelectQuery__SCattributesAssignment_8_3 )* )
            // InternalEasySql.g:2073:2: ( rule__SimpleSelectQuery__SCattributesAssignment_8_3 )*
            {
             before(grammarAccess.getSimpleSelectQueryAccess().getSCattributesAssignment_8_3()); 
            // InternalEasySql.g:2074:2: ( rule__SimpleSelectQuery__SCattributesAssignment_8_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_INT && LA20_0<=RULE_STRING)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalEasySql.g:2074:3: rule__SimpleSelectQuery__SCattributesAssignment_8_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SimpleSelectQuery__SCattributesAssignment_8_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getSimpleSelectQueryAccess().getSCattributesAssignment_8_3()); 

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
    // $ANTLR end "rule__SimpleSelectQuery__Group_8__3__Impl"


    // $ANTLR start "rule__SimpleSelectQuery__Group_8__4"
    // InternalEasySql.g:2082:1: rule__SimpleSelectQuery__Group_8__4 : rule__SimpleSelectQuery__Group_8__4__Impl ;
    public final void rule__SimpleSelectQuery__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2086:1: ( rule__SimpleSelectQuery__Group_8__4__Impl )
            // InternalEasySql.g:2087:2: rule__SimpleSelectQuery__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleSelectQuery__Group_8__4__Impl();

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
    // $ANTLR end "rule__SimpleSelectQuery__Group_8__4"


    // $ANTLR start "rule__SimpleSelectQuery__Group_8__4__Impl"
    // InternalEasySql.g:2093:1: rule__SimpleSelectQuery__Group_8__4__Impl : ( ')' ) ;
    public final void rule__SimpleSelectQuery__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2097:1: ( ( ')' ) )
            // InternalEasySql.g:2098:1: ( ')' )
            {
            // InternalEasySql.g:2098:1: ( ')' )
            // InternalEasySql.g:2099:2: ')'
            {
             before(grammarAccess.getSimpleSelectQueryAccess().getRightParenthesisKeyword_8_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSimpleSelectQueryAccess().getRightParenthesisKeyword_8_4()); 

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
    // $ANTLR end "rule__SimpleSelectQuery__Group_8__4__Impl"


    // $ANTLR start "rule__JoinQuery__Group__0"
    // InternalEasySql.g:2109:1: rule__JoinQuery__Group__0 : rule__JoinQuery__Group__0__Impl rule__JoinQuery__Group__1 ;
    public final void rule__JoinQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2113:1: ( rule__JoinQuery__Group__0__Impl rule__JoinQuery__Group__1 )
            // InternalEasySql.g:2114:2: rule__JoinQuery__Group__0__Impl rule__JoinQuery__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__JoinQuery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinQuery__Group__1();

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
    // $ANTLR end "rule__JoinQuery__Group__0"


    // $ANTLR start "rule__JoinQuery__Group__0__Impl"
    // InternalEasySql.g:2121:1: rule__JoinQuery__Group__0__Impl : ( ( rule__JoinQuery__Jtable1Assignment_0 ) ) ;
    public final void rule__JoinQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2125:1: ( ( ( rule__JoinQuery__Jtable1Assignment_0 ) ) )
            // InternalEasySql.g:2126:1: ( ( rule__JoinQuery__Jtable1Assignment_0 ) )
            {
            // InternalEasySql.g:2126:1: ( ( rule__JoinQuery__Jtable1Assignment_0 ) )
            // InternalEasySql.g:2127:2: ( rule__JoinQuery__Jtable1Assignment_0 )
            {
             before(grammarAccess.getJoinQueryAccess().getJtable1Assignment_0()); 
            // InternalEasySql.g:2128:2: ( rule__JoinQuery__Jtable1Assignment_0 )
            // InternalEasySql.g:2128:3: rule__JoinQuery__Jtable1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__JoinQuery__Jtable1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getJoinQueryAccess().getJtable1Assignment_0()); 

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
    // $ANTLR end "rule__JoinQuery__Group__0__Impl"


    // $ANTLR start "rule__JoinQuery__Group__1"
    // InternalEasySql.g:2136:1: rule__JoinQuery__Group__1 : rule__JoinQuery__Group__1__Impl rule__JoinQuery__Group__2 ;
    public final void rule__JoinQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2140:1: ( rule__JoinQuery__Group__1__Impl rule__JoinQuery__Group__2 )
            // InternalEasySql.g:2141:2: rule__JoinQuery__Group__1__Impl rule__JoinQuery__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__JoinQuery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinQuery__Group__2();

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
    // $ANTLR end "rule__JoinQuery__Group__1"


    // $ANTLR start "rule__JoinQuery__Group__1__Impl"
    // InternalEasySql.g:2148:1: rule__JoinQuery__Group__1__Impl : ( '.Joinsearch(' ) ;
    public final void rule__JoinQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2152:1: ( ( '.Joinsearch(' ) )
            // InternalEasySql.g:2153:1: ( '.Joinsearch(' )
            {
            // InternalEasySql.g:2153:1: ( '.Joinsearch(' )
            // InternalEasySql.g:2154:2: '.Joinsearch('
            {
             before(grammarAccess.getJoinQueryAccess().getJoinsearchKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getJoinQueryAccess().getJoinsearchKeyword_1()); 

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
    // $ANTLR end "rule__JoinQuery__Group__1__Impl"


    // $ANTLR start "rule__JoinQuery__Group__2"
    // InternalEasySql.g:2163:1: rule__JoinQuery__Group__2 : rule__JoinQuery__Group__2__Impl rule__JoinQuery__Group__3 ;
    public final void rule__JoinQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2167:1: ( rule__JoinQuery__Group__2__Impl rule__JoinQuery__Group__3 )
            // InternalEasySql.g:2168:2: rule__JoinQuery__Group__2__Impl rule__JoinQuery__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__JoinQuery__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinQuery__Group__3();

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
    // $ANTLR end "rule__JoinQuery__Group__2"


    // $ANTLR start "rule__JoinQuery__Group__2__Impl"
    // InternalEasySql.g:2175:1: rule__JoinQuery__Group__2__Impl : ( ( rule__JoinQuery__JattributesAssignment_2 )* ) ;
    public final void rule__JoinQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2179:1: ( ( ( rule__JoinQuery__JattributesAssignment_2 )* ) )
            // InternalEasySql.g:2180:1: ( ( rule__JoinQuery__JattributesAssignment_2 )* )
            {
            // InternalEasySql.g:2180:1: ( ( rule__JoinQuery__JattributesAssignment_2 )* )
            // InternalEasySql.g:2181:2: ( rule__JoinQuery__JattributesAssignment_2 )*
            {
             before(grammarAccess.getJoinQueryAccess().getJattributesAssignment_2()); 
            // InternalEasySql.g:2182:2: ( rule__JoinQuery__JattributesAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalEasySql.g:2182:3: rule__JoinQuery__JattributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__JoinQuery__JattributesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getJoinQueryAccess().getJattributesAssignment_2()); 

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
    // $ANTLR end "rule__JoinQuery__Group__2__Impl"


    // $ANTLR start "rule__JoinQuery__Group__3"
    // InternalEasySql.g:2190:1: rule__JoinQuery__Group__3 : rule__JoinQuery__Group__3__Impl rule__JoinQuery__Group__4 ;
    public final void rule__JoinQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2194:1: ( rule__JoinQuery__Group__3__Impl rule__JoinQuery__Group__4 )
            // InternalEasySql.g:2195:2: rule__JoinQuery__Group__3__Impl rule__JoinQuery__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__JoinQuery__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinQuery__Group__4();

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
    // $ANTLR end "rule__JoinQuery__Group__3"


    // $ANTLR start "rule__JoinQuery__Group__3__Impl"
    // InternalEasySql.g:2202:1: rule__JoinQuery__Group__3__Impl : ( ')' ) ;
    public final void rule__JoinQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2206:1: ( ( ')' ) )
            // InternalEasySql.g:2207:1: ( ')' )
            {
            // InternalEasySql.g:2207:1: ( ')' )
            // InternalEasySql.g:2208:2: ')'
            {
             before(grammarAccess.getJoinQueryAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getJoinQueryAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__JoinQuery__Group__3__Impl"


    // $ANTLR start "rule__JoinQuery__Group__4"
    // InternalEasySql.g:2217:1: rule__JoinQuery__Group__4 : rule__JoinQuery__Group__4__Impl rule__JoinQuery__Group__5 ;
    public final void rule__JoinQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2221:1: ( rule__JoinQuery__Group__4__Impl rule__JoinQuery__Group__5 )
            // InternalEasySql.g:2222:2: rule__JoinQuery__Group__4__Impl rule__JoinQuery__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__JoinQuery__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinQuery__Group__5();

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
    // $ANTLR end "rule__JoinQuery__Group__4"


    // $ANTLR start "rule__JoinQuery__Group__4__Impl"
    // InternalEasySql.g:2229:1: rule__JoinQuery__Group__4__Impl : ( '.' ) ;
    public final void rule__JoinQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2233:1: ( ( '.' ) )
            // InternalEasySql.g:2234:1: ( '.' )
            {
            // InternalEasySql.g:2234:1: ( '.' )
            // InternalEasySql.g:2235:2: '.'
            {
             before(grammarAccess.getJoinQueryAccess().getFullStopKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getJoinQueryAccess().getFullStopKeyword_4()); 

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
    // $ANTLR end "rule__JoinQuery__Group__4__Impl"


    // $ANTLR start "rule__JoinQuery__Group__5"
    // InternalEasySql.g:2244:1: rule__JoinQuery__Group__5 : rule__JoinQuery__Group__5__Impl rule__JoinQuery__Group__6 ;
    public final void rule__JoinQuery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2248:1: ( rule__JoinQuery__Group__5__Impl rule__JoinQuery__Group__6 )
            // InternalEasySql.g:2249:2: rule__JoinQuery__Group__5__Impl rule__JoinQuery__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__JoinQuery__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinQuery__Group__6();

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
    // $ANTLR end "rule__JoinQuery__Group__5"


    // $ANTLR start "rule__JoinQuery__Group__5__Impl"
    // InternalEasySql.g:2256:1: rule__JoinQuery__Group__5__Impl : ( ( rule__JoinQuery__JointypeAssignment_5 ) ) ;
    public final void rule__JoinQuery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2260:1: ( ( ( rule__JoinQuery__JointypeAssignment_5 ) ) )
            // InternalEasySql.g:2261:1: ( ( rule__JoinQuery__JointypeAssignment_5 ) )
            {
            // InternalEasySql.g:2261:1: ( ( rule__JoinQuery__JointypeAssignment_5 ) )
            // InternalEasySql.g:2262:2: ( rule__JoinQuery__JointypeAssignment_5 )
            {
             before(grammarAccess.getJoinQueryAccess().getJointypeAssignment_5()); 
            // InternalEasySql.g:2263:2: ( rule__JoinQuery__JointypeAssignment_5 )
            // InternalEasySql.g:2263:3: rule__JoinQuery__JointypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__JoinQuery__JointypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getJoinQueryAccess().getJointypeAssignment_5()); 

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
    // $ANTLR end "rule__JoinQuery__Group__5__Impl"


    // $ANTLR start "rule__JoinQuery__Group__6"
    // InternalEasySql.g:2271:1: rule__JoinQuery__Group__6 : rule__JoinQuery__Group__6__Impl rule__JoinQuery__Group__7 ;
    public final void rule__JoinQuery__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2275:1: ( rule__JoinQuery__Group__6__Impl rule__JoinQuery__Group__7 )
            // InternalEasySql.g:2276:2: rule__JoinQuery__Group__6__Impl rule__JoinQuery__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__JoinQuery__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinQuery__Group__7();

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
    // $ANTLR end "rule__JoinQuery__Group__6"


    // $ANTLR start "rule__JoinQuery__Group__6__Impl"
    // InternalEasySql.g:2283:1: rule__JoinQuery__Group__6__Impl : ( '(' ) ;
    public final void rule__JoinQuery__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2287:1: ( ( '(' ) )
            // InternalEasySql.g:2288:1: ( '(' )
            {
            // InternalEasySql.g:2288:1: ( '(' )
            // InternalEasySql.g:2289:2: '('
            {
             before(grammarAccess.getJoinQueryAccess().getLeftParenthesisKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getJoinQueryAccess().getLeftParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__JoinQuery__Group__6__Impl"


    // $ANTLR start "rule__JoinQuery__Group__7"
    // InternalEasySql.g:2298:1: rule__JoinQuery__Group__7 : rule__JoinQuery__Group__7__Impl rule__JoinQuery__Group__8 ;
    public final void rule__JoinQuery__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2302:1: ( rule__JoinQuery__Group__7__Impl rule__JoinQuery__Group__8 )
            // InternalEasySql.g:2303:2: rule__JoinQuery__Group__7__Impl rule__JoinQuery__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__JoinQuery__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinQuery__Group__8();

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
    // $ANTLR end "rule__JoinQuery__Group__7"


    // $ANTLR start "rule__JoinQuery__Group__7__Impl"
    // InternalEasySql.g:2310:1: rule__JoinQuery__Group__7__Impl : ( ( rule__JoinQuery__Jtable2Assignment_7 ) ) ;
    public final void rule__JoinQuery__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2314:1: ( ( ( rule__JoinQuery__Jtable2Assignment_7 ) ) )
            // InternalEasySql.g:2315:1: ( ( rule__JoinQuery__Jtable2Assignment_7 ) )
            {
            // InternalEasySql.g:2315:1: ( ( rule__JoinQuery__Jtable2Assignment_7 ) )
            // InternalEasySql.g:2316:2: ( rule__JoinQuery__Jtable2Assignment_7 )
            {
             before(grammarAccess.getJoinQueryAccess().getJtable2Assignment_7()); 
            // InternalEasySql.g:2317:2: ( rule__JoinQuery__Jtable2Assignment_7 )
            // InternalEasySql.g:2317:3: rule__JoinQuery__Jtable2Assignment_7
            {
            pushFollow(FOLLOW_2);
            rule__JoinQuery__Jtable2Assignment_7();

            state._fsp--;


            }

             after(grammarAccess.getJoinQueryAccess().getJtable2Assignment_7()); 

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
    // $ANTLR end "rule__JoinQuery__Group__7__Impl"


    // $ANTLR start "rule__JoinQuery__Group__8"
    // InternalEasySql.g:2325:1: rule__JoinQuery__Group__8 : rule__JoinQuery__Group__8__Impl rule__JoinQuery__Group__9 ;
    public final void rule__JoinQuery__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2329:1: ( rule__JoinQuery__Group__8__Impl rule__JoinQuery__Group__9 )
            // InternalEasySql.g:2330:2: rule__JoinQuery__Group__8__Impl rule__JoinQuery__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__JoinQuery__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinQuery__Group__9();

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
    // $ANTLR end "rule__JoinQuery__Group__8"


    // $ANTLR start "rule__JoinQuery__Group__8__Impl"
    // InternalEasySql.g:2337:1: rule__JoinQuery__Group__8__Impl : ( ')' ) ;
    public final void rule__JoinQuery__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2341:1: ( ( ')' ) )
            // InternalEasySql.g:2342:1: ( ')' )
            {
            // InternalEasySql.g:2342:1: ( ')' )
            // InternalEasySql.g:2343:2: ')'
            {
             before(grammarAccess.getJoinQueryAccess().getRightParenthesisKeyword_8()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getJoinQueryAccess().getRightParenthesisKeyword_8()); 

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
    // $ANTLR end "rule__JoinQuery__Group__8__Impl"


    // $ANTLR start "rule__JoinQuery__Group__9"
    // InternalEasySql.g:2352:1: rule__JoinQuery__Group__9 : rule__JoinQuery__Group__9__Impl rule__JoinQuery__Group__10 ;
    public final void rule__JoinQuery__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2356:1: ( rule__JoinQuery__Group__9__Impl rule__JoinQuery__Group__10 )
            // InternalEasySql.g:2357:2: rule__JoinQuery__Group__9__Impl rule__JoinQuery__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__JoinQuery__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinQuery__Group__10();

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
    // $ANTLR end "rule__JoinQuery__Group__9"


    // $ANTLR start "rule__JoinQuery__Group__9__Impl"
    // InternalEasySql.g:2364:1: rule__JoinQuery__Group__9__Impl : ( '.On(' ) ;
    public final void rule__JoinQuery__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2368:1: ( ( '.On(' ) )
            // InternalEasySql.g:2369:1: ( '.On(' )
            {
            // InternalEasySql.g:2369:1: ( '.On(' )
            // InternalEasySql.g:2370:2: '.On('
            {
             before(grammarAccess.getJoinQueryAccess().getOnKeyword_9()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getJoinQueryAccess().getOnKeyword_9()); 

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
    // $ANTLR end "rule__JoinQuery__Group__9__Impl"


    // $ANTLR start "rule__JoinQuery__Group__10"
    // InternalEasySql.g:2379:1: rule__JoinQuery__Group__10 : rule__JoinQuery__Group__10__Impl rule__JoinQuery__Group__11 ;
    public final void rule__JoinQuery__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2383:1: ( rule__JoinQuery__Group__10__Impl rule__JoinQuery__Group__11 )
            // InternalEasySql.g:2384:2: rule__JoinQuery__Group__10__Impl rule__JoinQuery__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__JoinQuery__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinQuery__Group__11();

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
    // $ANTLR end "rule__JoinQuery__Group__10"


    // $ANTLR start "rule__JoinQuery__Group__10__Impl"
    // InternalEasySql.g:2391:1: rule__JoinQuery__Group__10__Impl : ( ( rule__JoinQuery__JoinconditionAssignment_10 )* ) ;
    public final void rule__JoinQuery__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2395:1: ( ( ( rule__JoinQuery__JoinconditionAssignment_10 )* ) )
            // InternalEasySql.g:2396:1: ( ( rule__JoinQuery__JoinconditionAssignment_10 )* )
            {
            // InternalEasySql.g:2396:1: ( ( rule__JoinQuery__JoinconditionAssignment_10 )* )
            // InternalEasySql.g:2397:2: ( rule__JoinQuery__JoinconditionAssignment_10 )*
            {
             before(grammarAccess.getJoinQueryAccess().getJoinconditionAssignment_10()); 
            // InternalEasySql.g:2398:2: ( rule__JoinQuery__JoinconditionAssignment_10 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalEasySql.g:2398:3: rule__JoinQuery__JoinconditionAssignment_10
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__JoinQuery__JoinconditionAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getJoinQueryAccess().getJoinconditionAssignment_10()); 

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
    // $ANTLR end "rule__JoinQuery__Group__10__Impl"


    // $ANTLR start "rule__JoinQuery__Group__11"
    // InternalEasySql.g:2406:1: rule__JoinQuery__Group__11 : rule__JoinQuery__Group__11__Impl ;
    public final void rule__JoinQuery__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2410:1: ( rule__JoinQuery__Group__11__Impl )
            // InternalEasySql.g:2411:2: rule__JoinQuery__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JoinQuery__Group__11__Impl();

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
    // $ANTLR end "rule__JoinQuery__Group__11"


    // $ANTLR start "rule__JoinQuery__Group__11__Impl"
    // InternalEasySql.g:2417:1: rule__JoinQuery__Group__11__Impl : ( ')' ) ;
    public final void rule__JoinQuery__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2421:1: ( ( ')' ) )
            // InternalEasySql.g:2422:1: ( ')' )
            {
            // InternalEasySql.g:2422:1: ( ')' )
            // InternalEasySql.g:2423:2: ')'
            {
             before(grammarAccess.getJoinQueryAccess().getRightParenthesisKeyword_11()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getJoinQueryAccess().getRightParenthesisKeyword_11()); 

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
    // $ANTLR end "rule__JoinQuery__Group__11__Impl"


    // $ANTLR start "rule__NestedQuery__Group__0"
    // InternalEasySql.g:2433:1: rule__NestedQuery__Group__0 : rule__NestedQuery__Group__0__Impl rule__NestedQuery__Group__1 ;
    public final void rule__NestedQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2437:1: ( rule__NestedQuery__Group__0__Impl rule__NestedQuery__Group__1 )
            // InternalEasySql.g:2438:2: rule__NestedQuery__Group__0__Impl rule__NestedQuery__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__NestedQuery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedQuery__Group__1();

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
    // $ANTLR end "rule__NestedQuery__Group__0"


    // $ANTLR start "rule__NestedQuery__Group__0__Impl"
    // InternalEasySql.g:2445:1: rule__NestedQuery__Group__0__Impl : ( ( rule__NestedQuery__NtableAssignment_0 ) ) ;
    public final void rule__NestedQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2449:1: ( ( ( rule__NestedQuery__NtableAssignment_0 ) ) )
            // InternalEasySql.g:2450:1: ( ( rule__NestedQuery__NtableAssignment_0 ) )
            {
            // InternalEasySql.g:2450:1: ( ( rule__NestedQuery__NtableAssignment_0 ) )
            // InternalEasySql.g:2451:2: ( rule__NestedQuery__NtableAssignment_0 )
            {
             before(grammarAccess.getNestedQueryAccess().getNtableAssignment_0()); 
            // InternalEasySql.g:2452:2: ( rule__NestedQuery__NtableAssignment_0 )
            // InternalEasySql.g:2452:3: rule__NestedQuery__NtableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NestedQuery__NtableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNestedQueryAccess().getNtableAssignment_0()); 

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
    // $ANTLR end "rule__NestedQuery__Group__0__Impl"


    // $ANTLR start "rule__NestedQuery__Group__1"
    // InternalEasySql.g:2460:1: rule__NestedQuery__Group__1 : rule__NestedQuery__Group__1__Impl rule__NestedQuery__Group__2 ;
    public final void rule__NestedQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2464:1: ( rule__NestedQuery__Group__1__Impl rule__NestedQuery__Group__2 )
            // InternalEasySql.g:2465:2: rule__NestedQuery__Group__1__Impl rule__NestedQuery__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__NestedQuery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedQuery__Group__2();

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
    // $ANTLR end "rule__NestedQuery__Group__1"


    // $ANTLR start "rule__NestedQuery__Group__1__Impl"
    // InternalEasySql.g:2472:1: rule__NestedQuery__Group__1__Impl : ( '.Subsearch(' ) ;
    public final void rule__NestedQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2476:1: ( ( '.Subsearch(' ) )
            // InternalEasySql.g:2477:1: ( '.Subsearch(' )
            {
            // InternalEasySql.g:2477:1: ( '.Subsearch(' )
            // InternalEasySql.g:2478:2: '.Subsearch('
            {
             before(grammarAccess.getNestedQueryAccess().getSubsearchKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNestedQueryAccess().getSubsearchKeyword_1()); 

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
    // $ANTLR end "rule__NestedQuery__Group__1__Impl"


    // $ANTLR start "rule__NestedQuery__Group__2"
    // InternalEasySql.g:2487:1: rule__NestedQuery__Group__2 : rule__NestedQuery__Group__2__Impl rule__NestedQuery__Group__3 ;
    public final void rule__NestedQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2491:1: ( rule__NestedQuery__Group__2__Impl rule__NestedQuery__Group__3 )
            // InternalEasySql.g:2492:2: rule__NestedQuery__Group__2__Impl rule__NestedQuery__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__NestedQuery__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedQuery__Group__3();

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
    // $ANTLR end "rule__NestedQuery__Group__2"


    // $ANTLR start "rule__NestedQuery__Group__2__Impl"
    // InternalEasySql.g:2499:1: rule__NestedQuery__Group__2__Impl : ( ( rule__NestedQuery__NattributesAssignment_2 )* ) ;
    public final void rule__NestedQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2503:1: ( ( ( rule__NestedQuery__NattributesAssignment_2 )* ) )
            // InternalEasySql.g:2504:1: ( ( rule__NestedQuery__NattributesAssignment_2 )* )
            {
            // InternalEasySql.g:2504:1: ( ( rule__NestedQuery__NattributesAssignment_2 )* )
            // InternalEasySql.g:2505:2: ( rule__NestedQuery__NattributesAssignment_2 )*
            {
             before(grammarAccess.getNestedQueryAccess().getNattributesAssignment_2()); 
            // InternalEasySql.g:2506:2: ( rule__NestedQuery__NattributesAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_INT && LA23_0<=RULE_STRING)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalEasySql.g:2506:3: rule__NestedQuery__NattributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__NestedQuery__NattributesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getNestedQueryAccess().getNattributesAssignment_2()); 

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
    // $ANTLR end "rule__NestedQuery__Group__2__Impl"


    // $ANTLR start "rule__NestedQuery__Group__3"
    // InternalEasySql.g:2514:1: rule__NestedQuery__Group__3 : rule__NestedQuery__Group__3__Impl rule__NestedQuery__Group__4 ;
    public final void rule__NestedQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2518:1: ( rule__NestedQuery__Group__3__Impl rule__NestedQuery__Group__4 )
            // InternalEasySql.g:2519:2: rule__NestedQuery__Group__3__Impl rule__NestedQuery__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__NestedQuery__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedQuery__Group__4();

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
    // $ANTLR end "rule__NestedQuery__Group__3"


    // $ANTLR start "rule__NestedQuery__Group__3__Impl"
    // InternalEasySql.g:2526:1: rule__NestedQuery__Group__3__Impl : ( ')' ) ;
    public final void rule__NestedQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2530:1: ( ( ')' ) )
            // InternalEasySql.g:2531:1: ( ')' )
            {
            // InternalEasySql.g:2531:1: ( ')' )
            // InternalEasySql.g:2532:2: ')'
            {
             before(grammarAccess.getNestedQueryAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNestedQueryAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__NestedQuery__Group__3__Impl"


    // $ANTLR start "rule__NestedQuery__Group__4"
    // InternalEasySql.g:2541:1: rule__NestedQuery__Group__4 : rule__NestedQuery__Group__4__Impl rule__NestedQuery__Group__5 ;
    public final void rule__NestedQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2545:1: ( rule__NestedQuery__Group__4__Impl rule__NestedQuery__Group__5 )
            // InternalEasySql.g:2546:2: rule__NestedQuery__Group__4__Impl rule__NestedQuery__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__NestedQuery__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedQuery__Group__5();

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
    // $ANTLR end "rule__NestedQuery__Group__4"


    // $ANTLR start "rule__NestedQuery__Group__4__Impl"
    // InternalEasySql.g:2553:1: rule__NestedQuery__Group__4__Impl : ( '.When(' ) ;
    public final void rule__NestedQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2557:1: ( ( '.When(' ) )
            // InternalEasySql.g:2558:1: ( '.When(' )
            {
            // InternalEasySql.g:2558:1: ( '.When(' )
            // InternalEasySql.g:2559:2: '.When('
            {
             before(grammarAccess.getNestedQueryAccess().getWhenKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNestedQueryAccess().getWhenKeyword_4()); 

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
    // $ANTLR end "rule__NestedQuery__Group__4__Impl"


    // $ANTLR start "rule__NestedQuery__Group__5"
    // InternalEasySql.g:2568:1: rule__NestedQuery__Group__5 : rule__NestedQuery__Group__5__Impl rule__NestedQuery__Group__6 ;
    public final void rule__NestedQuery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2572:1: ( rule__NestedQuery__Group__5__Impl rule__NestedQuery__Group__6 )
            // InternalEasySql.g:2573:2: rule__NestedQuery__Group__5__Impl rule__NestedQuery__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__NestedQuery__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedQuery__Group__6();

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
    // $ANTLR end "rule__NestedQuery__Group__5"


    // $ANTLR start "rule__NestedQuery__Group__5__Impl"
    // InternalEasySql.g:2580:1: rule__NestedQuery__Group__5__Impl : ( ( rule__NestedQuery__Nattributes1Assignment_5 )* ) ;
    public final void rule__NestedQuery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2584:1: ( ( ( rule__NestedQuery__Nattributes1Assignment_5 )* ) )
            // InternalEasySql.g:2585:1: ( ( rule__NestedQuery__Nattributes1Assignment_5 )* )
            {
            // InternalEasySql.g:2585:1: ( ( rule__NestedQuery__Nattributes1Assignment_5 )* )
            // InternalEasySql.g:2586:2: ( rule__NestedQuery__Nattributes1Assignment_5 )*
            {
             before(grammarAccess.getNestedQueryAccess().getNattributes1Assignment_5()); 
            // InternalEasySql.g:2587:2: ( rule__NestedQuery__Nattributes1Assignment_5 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_INT && LA24_0<=RULE_STRING)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalEasySql.g:2587:3: rule__NestedQuery__Nattributes1Assignment_5
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__NestedQuery__Nattributes1Assignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getNestedQueryAccess().getNattributes1Assignment_5()); 

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
    // $ANTLR end "rule__NestedQuery__Group__5__Impl"


    // $ANTLR start "rule__NestedQuery__Group__6"
    // InternalEasySql.g:2595:1: rule__NestedQuery__Group__6 : rule__NestedQuery__Group__6__Impl rule__NestedQuery__Group__7 ;
    public final void rule__NestedQuery__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2599:1: ( rule__NestedQuery__Group__6__Impl rule__NestedQuery__Group__7 )
            // InternalEasySql.g:2600:2: rule__NestedQuery__Group__6__Impl rule__NestedQuery__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__NestedQuery__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedQuery__Group__7();

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
    // $ANTLR end "rule__NestedQuery__Group__6"


    // $ANTLR start "rule__NestedQuery__Group__6__Impl"
    // InternalEasySql.g:2607:1: rule__NestedQuery__Group__6__Impl : ( ')' ) ;
    public final void rule__NestedQuery__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2611:1: ( ( ')' ) )
            // InternalEasySql.g:2612:1: ( ')' )
            {
            // InternalEasySql.g:2612:1: ( ')' )
            // InternalEasySql.g:2613:2: ')'
            {
             before(grammarAccess.getNestedQueryAccess().getRightParenthesisKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNestedQueryAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__NestedQuery__Group__6__Impl"


    // $ANTLR start "rule__NestedQuery__Group__7"
    // InternalEasySql.g:2622:1: rule__NestedQuery__Group__7 : rule__NestedQuery__Group__7__Impl rule__NestedQuery__Group__8 ;
    public final void rule__NestedQuery__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2626:1: ( rule__NestedQuery__Group__7__Impl rule__NestedQuery__Group__8 )
            // InternalEasySql.g:2627:2: rule__NestedQuery__Group__7__Impl rule__NestedQuery__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__NestedQuery__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedQuery__Group__8();

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
    // $ANTLR end "rule__NestedQuery__Group__7"


    // $ANTLR start "rule__NestedQuery__Group__7__Impl"
    // InternalEasySql.g:2634:1: rule__NestedQuery__Group__7__Impl : ( '.In(' ) ;
    public final void rule__NestedQuery__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2638:1: ( ( '.In(' ) )
            // InternalEasySql.g:2639:1: ( '.In(' )
            {
            // InternalEasySql.g:2639:1: ( '.In(' )
            // InternalEasySql.g:2640:2: '.In('
            {
             before(grammarAccess.getNestedQueryAccess().getInKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNestedQueryAccess().getInKeyword_7()); 

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
    // $ANTLR end "rule__NestedQuery__Group__7__Impl"


    // $ANTLR start "rule__NestedQuery__Group__8"
    // InternalEasySql.g:2649:1: rule__NestedQuery__Group__8 : rule__NestedQuery__Group__8__Impl rule__NestedQuery__Group__9 ;
    public final void rule__NestedQuery__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2653:1: ( rule__NestedQuery__Group__8__Impl rule__NestedQuery__Group__9 )
            // InternalEasySql.g:2654:2: rule__NestedQuery__Group__8__Impl rule__NestedQuery__Group__9
            {
            pushFollow(FOLLOW_26);
            rule__NestedQuery__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedQuery__Group__9();

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
    // $ANTLR end "rule__NestedQuery__Group__8"


    // $ANTLR start "rule__NestedQuery__Group__8__Impl"
    // InternalEasySql.g:2661:1: rule__NestedQuery__Group__8__Impl : ( ( rule__NestedQuery__SubselectqueryAssignment_8 ) ) ;
    public final void rule__NestedQuery__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2665:1: ( ( ( rule__NestedQuery__SubselectqueryAssignment_8 ) ) )
            // InternalEasySql.g:2666:1: ( ( rule__NestedQuery__SubselectqueryAssignment_8 ) )
            {
            // InternalEasySql.g:2666:1: ( ( rule__NestedQuery__SubselectqueryAssignment_8 ) )
            // InternalEasySql.g:2667:2: ( rule__NestedQuery__SubselectqueryAssignment_8 )
            {
             before(grammarAccess.getNestedQueryAccess().getSubselectqueryAssignment_8()); 
            // InternalEasySql.g:2668:2: ( rule__NestedQuery__SubselectqueryAssignment_8 )
            // InternalEasySql.g:2668:3: rule__NestedQuery__SubselectqueryAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__NestedQuery__SubselectqueryAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getNestedQueryAccess().getSubselectqueryAssignment_8()); 

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
    // $ANTLR end "rule__NestedQuery__Group__8__Impl"


    // $ANTLR start "rule__NestedQuery__Group__9"
    // InternalEasySql.g:2676:1: rule__NestedQuery__Group__9 : rule__NestedQuery__Group__9__Impl ;
    public final void rule__NestedQuery__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2680:1: ( rule__NestedQuery__Group__9__Impl )
            // InternalEasySql.g:2681:2: rule__NestedQuery__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NestedQuery__Group__9__Impl();

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
    // $ANTLR end "rule__NestedQuery__Group__9"


    // $ANTLR start "rule__NestedQuery__Group__9__Impl"
    // InternalEasySql.g:2687:1: rule__NestedQuery__Group__9__Impl : ( ')' ) ;
    public final void rule__NestedQuery__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2691:1: ( ( ')' ) )
            // InternalEasySql.g:2692:1: ( ')' )
            {
            // InternalEasySql.g:2692:1: ( ')' )
            // InternalEasySql.g:2693:2: ')'
            {
             before(grammarAccess.getNestedQueryAccess().getRightParenthesisKeyword_9()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNestedQueryAccess().getRightParenthesisKeyword_9()); 

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
    // $ANTLR end "rule__NestedQuery__Group__9__Impl"


    // $ANTLR start "rule__SqlProgram__StatementsAssignment"
    // InternalEasySql.g:2703:1: rule__SqlProgram__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__SqlProgram__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2707:1: ( ( ruleStatement ) )
            // InternalEasySql.g:2708:2: ( ruleStatement )
            {
            // InternalEasySql.g:2708:2: ( ruleStatement )
            // InternalEasySql.g:2709:3: ruleStatement
            {
             before(grammarAccess.getSqlProgramAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getSqlProgramAccess().getStatementsStatementParserRuleCall_0()); 

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
    // $ANTLR end "rule__SqlProgram__StatementsAssignment"


    // $ANTLR start "rule__NumLiteral__VarAssignment"
    // InternalEasySql.g:2718:1: rule__NumLiteral__VarAssignment : ( RULE_INT ) ;
    public final void rule__NumLiteral__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2722:1: ( ( RULE_INT ) )
            // InternalEasySql.g:2723:2: ( RULE_INT )
            {
            // InternalEasySql.g:2723:2: ( RULE_INT )
            // InternalEasySql.g:2724:3: RULE_INT
            {
             before(grammarAccess.getNumLiteralAccess().getVarINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumLiteralAccess().getVarINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__NumLiteral__VarAssignment"


    // $ANTLR start "rule__StrLiteral__VarAssignment"
    // InternalEasySql.g:2733:1: rule__StrLiteral__VarAssignment : ( RULE_ID ) ;
    public final void rule__StrLiteral__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2737:1: ( ( RULE_ID ) )
            // InternalEasySql.g:2738:2: ( RULE_ID )
            {
            // InternalEasySql.g:2738:2: ( RULE_ID )
            // InternalEasySql.g:2739:3: RULE_ID
            {
             before(grammarAccess.getStrLiteralAccess().getVarIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStrLiteralAccess().getVarIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StrLiteral__VarAssignment"


    // $ANTLR start "rule__RinLiteral__VarAssignment"
    // InternalEasySql.g:2748:1: rule__RinLiteral__VarAssignment : ( RULE_STRING ) ;
    public final void rule__RinLiteral__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2752:1: ( ( RULE_STRING ) )
            // InternalEasySql.g:2753:2: ( RULE_STRING )
            {
            // InternalEasySql.g:2753:2: ( RULE_STRING )
            // InternalEasySql.g:2754:3: RULE_STRING
            {
             before(grammarAccess.getRinLiteralAccess().getVarSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRinLiteralAccess().getVarSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__RinLiteral__VarAssignment"


    // $ANTLR start "rule__TableDeclaration__NameAssignment_1"
    // InternalEasySql.g:2763:1: rule__TableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2767:1: ( ( RULE_ID ) )
            // InternalEasySql.g:2768:2: ( RULE_ID )
            {
            // InternalEasySql.g:2768:2: ( RULE_ID )
            // InternalEasySql.g:2769:3: RULE_ID
            {
             before(grammarAccess.getTableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__SingleSelectDeclaration__NameAssignment_1"
    // InternalEasySql.g:2778:1: rule__SingleSelectDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SingleSelectDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2782:1: ( ( RULE_ID ) )
            // InternalEasySql.g:2783:2: ( RULE_ID )
            {
            // InternalEasySql.g:2783:2: ( RULE_ID )
            // InternalEasySql.g:2784:3: RULE_ID
            {
             before(grammarAccess.getSingleSelectDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSingleSelectDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SingleSelectDeclaration__NameAssignment_1"


    // $ANTLR start "rule__SingleSelectDeclaration__SingleSelectAssignment_3"
    // InternalEasySql.g:2793:1: rule__SingleSelectDeclaration__SingleSelectAssignment_3 : ( ruleSimpleSelectQuery ) ;
    public final void rule__SingleSelectDeclaration__SingleSelectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2797:1: ( ( ruleSimpleSelectQuery ) )
            // InternalEasySql.g:2798:2: ( ruleSimpleSelectQuery )
            {
            // InternalEasySql.g:2798:2: ( ruleSimpleSelectQuery )
            // InternalEasySql.g:2799:3: ruleSimpleSelectQuery
            {
             before(grammarAccess.getSingleSelectDeclarationAccess().getSingleSelectSimpleSelectQueryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleSelectQuery();

            state._fsp--;

             after(grammarAccess.getSingleSelectDeclarationAccess().getSingleSelectSimpleSelectQueryParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SingleSelectDeclaration__SingleSelectAssignment_3"


    // $ANTLR start "rule__Value__ValueAssignment_0"
    // InternalEasySql.g:2808:1: rule__Value__ValueAssignment_0 : ( ruleMultiType ) ;
    public final void rule__Value__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2812:1: ( ( ruleMultiType ) )
            // InternalEasySql.g:2813:2: ( ruleMultiType )
            {
            // InternalEasySql.g:2813:2: ( ruleMultiType )
            // InternalEasySql.g:2814:3: ruleMultiType
            {
             before(grammarAccess.getValueAccess().getValueMultiTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiType();

            state._fsp--;

             after(grammarAccess.getValueAccess().getValueMultiTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Value__ValueAssignment_0"


    // $ANTLR start "rule__Value__SeparationAssignment_1"
    // InternalEasySql.g:2823:1: rule__Value__SeparationAssignment_1 : ( ( ',' ) ) ;
    public final void rule__Value__SeparationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2827:1: ( ( ( ',' ) ) )
            // InternalEasySql.g:2828:2: ( ( ',' ) )
            {
            // InternalEasySql.g:2828:2: ( ( ',' ) )
            // InternalEasySql.g:2829:3: ( ',' )
            {
             before(grammarAccess.getValueAccess().getSeparationCommaKeyword_1_0()); 
            // InternalEasySql.g:2830:3: ( ',' )
            // InternalEasySql.g:2831:4: ','
            {
             before(grammarAccess.getValueAccess().getSeparationCommaKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getSeparationCommaKeyword_1_0()); 

            }

             after(grammarAccess.getValueAccess().getSeparationCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Value__SeparationAssignment_1"


    // $ANTLR start "rule__Equation__AttributeAssignment_0"
    // InternalEasySql.g:2842:1: rule__Equation__AttributeAssignment_0 : ( RULE_ID ) ;
    public final void rule__Equation__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2846:1: ( ( RULE_ID ) )
            // InternalEasySql.g:2847:2: ( RULE_ID )
            {
            // InternalEasySql.g:2847:2: ( RULE_ID )
            // InternalEasySql.g:2848:3: RULE_ID
            {
             before(grammarAccess.getEquationAccess().getAttributeIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEquationAccess().getAttributeIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Equation__AttributeAssignment_0"


    // $ANTLR start "rule__Equation__OperatorAssignment_1"
    // InternalEasySql.g:2857:1: rule__Equation__OperatorAssignment_1 : ( ruleOperator ) ;
    public final void rule__Equation__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2861:1: ( ( ruleOperator ) )
            // InternalEasySql.g:2862:2: ( ruleOperator )
            {
            // InternalEasySql.g:2862:2: ( ruleOperator )
            // InternalEasySql.g:2863:3: ruleOperator
            {
             before(grammarAccess.getEquationAccess().getOperatorOperatorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getEquationAccess().getOperatorOperatorEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Equation__OperatorAssignment_1"


    // $ANTLR start "rule__Equation__ValueAssignment_2"
    // InternalEasySql.g:2872:1: rule__Equation__ValueAssignment_2 : ( ruleMultiType ) ;
    public final void rule__Equation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2876:1: ( ( ruleMultiType ) )
            // InternalEasySql.g:2877:2: ( ruleMultiType )
            {
            // InternalEasySql.g:2877:2: ( ruleMultiType )
            // InternalEasySql.g:2878:3: ruleMultiType
            {
             before(grammarAccess.getEquationAccess().getValueMultiTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiType();

            state._fsp--;

             after(grammarAccess.getEquationAccess().getValueMultiTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Equation__ValueAssignment_2"


    // $ANTLR start "rule__Equation__SeparationAssignment_3"
    // InternalEasySql.g:2887:1: rule__Equation__SeparationAssignment_3 : ( ( ',' ) ) ;
    public final void rule__Equation__SeparationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2891:1: ( ( ( ',' ) ) )
            // InternalEasySql.g:2892:2: ( ( ',' ) )
            {
            // InternalEasySql.g:2892:2: ( ( ',' ) )
            // InternalEasySql.g:2893:3: ( ',' )
            {
             before(grammarAccess.getEquationAccess().getSeparationCommaKeyword_3_0()); 
            // InternalEasySql.g:2894:3: ( ',' )
            // InternalEasySql.g:2895:4: ','
            {
             before(grammarAccess.getEquationAccess().getSeparationCommaKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEquationAccess().getSeparationCommaKeyword_3_0()); 

            }

             after(grammarAccess.getEquationAccess().getSeparationCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__Equation__SeparationAssignment_3"


    // $ANTLR start "rule__Vvalue__TableAssignment_0"
    // InternalEasySql.g:2906:1: rule__Vvalue__TableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Vvalue__TableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2910:1: ( ( ( RULE_ID ) ) )
            // InternalEasySql.g:2911:2: ( ( RULE_ID ) )
            {
            // InternalEasySql.g:2911:2: ( ( RULE_ID ) )
            // InternalEasySql.g:2912:3: ( RULE_ID )
            {
             before(grammarAccess.getVvalueAccess().getTableTableDeclarationCrossReference_0_0()); 
            // InternalEasySql.g:2913:3: ( RULE_ID )
            // InternalEasySql.g:2914:4: RULE_ID
            {
             before(grammarAccess.getVvalueAccess().getTableTableDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVvalueAccess().getTableTableDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getVvalueAccess().getTableTableDeclarationCrossReference_0_0()); 

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
    // $ANTLR end "rule__Vvalue__TableAssignment_0"


    // $ANTLR start "rule__Vvalue__AttributeAssignment_2"
    // InternalEasySql.g:2925:1: rule__Vvalue__AttributeAssignment_2 : ( ruleMultiType ) ;
    public final void rule__Vvalue__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2929:1: ( ( ruleMultiType ) )
            // InternalEasySql.g:2930:2: ( ruleMultiType )
            {
            // InternalEasySql.g:2930:2: ( ruleMultiType )
            // InternalEasySql.g:2931:3: ruleMultiType
            {
             before(grammarAccess.getVvalueAccess().getAttributeMultiTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiType();

            state._fsp--;

             after(grammarAccess.getVvalueAccess().getAttributeMultiTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Vvalue__AttributeAssignment_2"


    // $ANTLR start "rule__Vvalue__SeparationAssignment_3"
    // InternalEasySql.g:2940:1: rule__Vvalue__SeparationAssignment_3 : ( ( ',' ) ) ;
    public final void rule__Vvalue__SeparationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2944:1: ( ( ( ',' ) ) )
            // InternalEasySql.g:2945:2: ( ( ',' ) )
            {
            // InternalEasySql.g:2945:2: ( ( ',' ) )
            // InternalEasySql.g:2946:3: ( ',' )
            {
             before(grammarAccess.getVvalueAccess().getSeparationCommaKeyword_3_0()); 
            // InternalEasySql.g:2947:3: ( ',' )
            // InternalEasySql.g:2948:4: ','
            {
             before(grammarAccess.getVvalueAccess().getSeparationCommaKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVvalueAccess().getSeparationCommaKeyword_3_0()); 

            }

             after(grammarAccess.getVvalueAccess().getSeparationCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__Vvalue__SeparationAssignment_3"


    // $ANTLR start "rule__MultiEquation__EquationLeftAssignment_0"
    // InternalEasySql.g:2959:1: rule__MultiEquation__EquationLeftAssignment_0 : ( ruleVvalue ) ;
    public final void rule__MultiEquation__EquationLeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2963:1: ( ( ruleVvalue ) )
            // InternalEasySql.g:2964:2: ( ruleVvalue )
            {
            // InternalEasySql.g:2964:2: ( ruleVvalue )
            // InternalEasySql.g:2965:3: ruleVvalue
            {
             before(grammarAccess.getMultiEquationAccess().getEquationLeftVvalueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVvalue();

            state._fsp--;

             after(grammarAccess.getMultiEquationAccess().getEquationLeftVvalueParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__MultiEquation__EquationLeftAssignment_0"


    // $ANTLR start "rule__MultiEquation__OperatorAssignment_1"
    // InternalEasySql.g:2974:1: rule__MultiEquation__OperatorAssignment_1 : ( ruleOperator ) ;
    public final void rule__MultiEquation__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2978:1: ( ( ruleOperator ) )
            // InternalEasySql.g:2979:2: ( ruleOperator )
            {
            // InternalEasySql.g:2979:2: ( ruleOperator )
            // InternalEasySql.g:2980:3: ruleOperator
            {
             before(grammarAccess.getMultiEquationAccess().getOperatorOperatorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getMultiEquationAccess().getOperatorOperatorEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__MultiEquation__OperatorAssignment_1"


    // $ANTLR start "rule__MultiEquation__EquationRightAssignment_2"
    // InternalEasySql.g:2989:1: rule__MultiEquation__EquationRightAssignment_2 : ( ruleVvalue ) ;
    public final void rule__MultiEquation__EquationRightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:2993:1: ( ( ruleVvalue ) )
            // InternalEasySql.g:2994:2: ( ruleVvalue )
            {
            // InternalEasySql.g:2994:2: ( ruleVvalue )
            // InternalEasySql.g:2995:3: ruleVvalue
            {
             before(grammarAccess.getMultiEquationAccess().getEquationRightVvalueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVvalue();

            state._fsp--;

             after(grammarAccess.getMultiEquationAccess().getEquationRightVvalueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MultiEquation__EquationRightAssignment_2"


    // $ANTLR start "rule__Insert__TableAssignment_0"
    // InternalEasySql.g:3004:1: rule__Insert__TableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Insert__TableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:3008:1: ( ( ( RULE_ID ) ) )
            // InternalEasySql.g:3009:2: ( ( RULE_ID ) )
            {
            // InternalEasySql.g:3009:2: ( ( RULE_ID ) )
            // InternalEasySql.g:3010:3: ( RULE_ID )
            {
             before(grammarAccess.getInsertAccess().getTableTableDeclarationCrossReference_0_0()); 
            // InternalEasySql.g:3011:3: ( RULE_ID )
            // InternalEasySql.g:3012:4: RULE_ID
            {
             before(grammarAccess.getInsertAccess().getTableTableDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getTableTableDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getInsertAccess().getTableTableDeclarationCrossReference_0_0()); 

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
    // $ANTLR end "rule__Insert__TableAssignment_0"


    // $ANTLR start "rule__Insert__Insert_dataAssignment_2"
    // InternalEasySql.g:3023:1: rule__Insert__Insert_dataAssignment_2 : ( ruleValue ) ;
    public final void rule__Insert__Insert_dataAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:3027:1: ( ( ruleValue ) )
            // InternalEasySql.g:3028:2: ( ruleValue )
            {
            // InternalEasySql.g:3028:2: ( ruleValue )
            // InternalEasySql.g:3029:3: ruleValue
            {
             before(grammarAccess.getInsertAccess().getInsert_dataValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getInsertAccess().getInsert_dataValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Insert__Insert_dataAssignment_2"


    // $ANTLR start "rule__Update__TableAssignment_0"
    // InternalEasySql.g:3038:1: rule__Update__TableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Update__TableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:3042:1: ( ( ( RULE_ID ) ) )
            // InternalEasySql.g:3043:2: ( ( RULE_ID ) )
            {
            // InternalEasySql.g:3043:2: ( ( RULE_ID ) )
            // InternalEasySql.g:3044:3: ( RULE_ID )
            {
             before(grammarAccess.getUpdateAccess().getTableTableDeclarationCrossReference_0_0()); 
            // InternalEasySql.g:3045:3: ( RULE_ID )
            // InternalEasySql.g:3046:4: RULE_ID
            {
             before(grammarAccess.getUpdateAccess().getTableTableDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getTableTableDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getUpdateAccess().getTableTableDeclarationCrossReference_0_0()); 

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
    // $ANTLR end "rule__Update__TableAssignment_0"


    // $ANTLR start "rule__Update__ModificationAssignment_2"
    // InternalEasySql.g:3057:1: rule__Update__ModificationAssignment_2 : ( ruleEquation ) ;
    public final void rule__Update__ModificationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:3061:1: ( ( ruleEquation ) )
            // InternalEasySql.g:3062:2: ( ruleEquation )
            {
            // InternalEasySql.g:3062:2: ( ruleEquation )
            // InternalEasySql.g:3063:3: ruleEquation
            {
             before(grammarAccess.getUpdateAccess().getModificationEquationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEquation();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getModificationEquationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Update__ModificationAssignment_2"


    // $ANTLR start "rule__Update__UpdateconditionAssignment_5"
    // InternalEasySql.g:3072:1: rule__Update__UpdateconditionAssignment_5 : ( ruleEquation ) ;
    public final void rule__Update__UpdateconditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:3076:1: ( ( ruleEquation ) )
            // InternalEasySql.g:3077:2: ( ruleEquation )
            {
            // InternalEasySql.g:3077:2: ( ruleEquation )
            // InternalEasySql.g:3078:3: ruleEquation
            {
             before(grammarAccess.getUpdateAccess().getUpdateconditionEquationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEquation();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getUpdateconditionEquationParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Update__UpdateconditionAssignment_5"


    // $ANTLR start "rule__Delete__TableAssignment_0"
    // InternalEasySql.g:3087:1: rule__Delete__TableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Delete__TableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:3091:1: ( ( ( RULE_ID ) ) )
            // InternalEasySql.g:3092:2: ( ( RULE_ID ) )
            {
            // InternalEasySql.g:3092:2: ( ( RULE_ID ) )
            // InternalEasySql.g:3093:3: ( RULE_ID )
            {
             before(grammarAccess.getDeleteAccess().getTableTableDeclarationCrossReference_0_0()); 
            // InternalEasySql.g:3094:3: ( RULE_ID )
            // InternalEasySql.g:3095:4: RULE_ID
            {
             before(grammarAccess.getDeleteAccess().getTableTableDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getTableTableDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDeleteAccess().getTableTableDeclarationCrossReference_0_0()); 

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
    // $ANTLR end "rule__Delete__TableAssignment_0"


    // $ANTLR start "rule__Delete__DeleteconditionAssignment_2"
    // InternalEasySql.g:3106:1: rule__Delete__DeleteconditionAssignment_2 : ( ruleEquation ) ;
    public final void rule__Delete__DeleteconditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:3110:1: ( ( ruleEquation ) )
            // InternalEasySql.g:3111:2: ( ruleEquation )
            {
            // InternalEasySql.g:3111:2: ( ruleEquation )
            // InternalEasySql.g:3112:3: ruleEquation
            {
             before(grammarAccess.getDeleteAccess().getDeleteconditionEquationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEquation();

            state._fsp--;

             after(grammarAccess.getDeleteAccess().getDeleteconditionEquationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Delete__DeleteconditionAssignment_2"


    // $ANTLR start "rule__SimpleSelectQuery__StableAssignment_0"
    // InternalEasySql.g:3121:1: rule__SimpleSelectQuery__StableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SimpleSelectQuery__StableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:3125:1: ( ( ( RULE_ID ) ) )
            // InternalEasySql.g:3126:2: ( ( RULE_ID ) )
            {
            // InternalEasySql.g:3126:2: ( ( RULE_ID ) )
            // InternalEasySql.g:3127:3: ( RULE_ID )
            {
             before(grammarAccess.getSimpleSelectQueryAccess().getStableTableDeclarationCrossReference_0_0()); 
            // InternalEasySql.g:3128:3: ( RULE_ID )
            // InternalEasySql.g:3129:4: RULE_ID
            {
             before(grammarAccess.getSimpleSelectQueryAccess().getStableTableDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSimpleSelectQueryAccess().getStableTableDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSimpleSelectQueryAccess().getStableTableDeclarationCrossReference_0_0()); 

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
    // $ANTLR end "rule__SimpleSelectQuery__StableAssignment_0"


    // $ANTLR start "rule__SimpleSelectQuery__SattributesAssignment_2"
    // InternalEasySql.g:3140:1: rule__SimpleSelectQuery__SattributesAssignment_2 : ( ruleValue ) ;
    public final void rule__SimpleSelectQuery__SattributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:3144:1: ( ( ruleValue ) )
            // InternalEasySql.g:3145:2: ( ruleValue )
            {
            // InternalEasySql.g:3145:2: ( ruleValue )
            // InternalEasySql.g:3146:3: ruleValue
            {
             before(grammarAccess.getSimpleSelectQueryAccess().getSattributesValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getSimpleSelectQueryAccess().getSattributesValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SimpleSelectQuery__SattributesAssignment_2"


    // $ANTLR start "rule__SimpleSelectQuery__SimpleconditionAssignment_5"
    // InternalEasySql.g:3155:1: rule__SimpleSelectQuery__SimpleconditionAssignment_5 : ( ruleEquation ) ;
    public final void rule__SimpleSelectQuery__SimpleconditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:3159:1: ( ( ruleEquation ) )
            // InternalEasySql.g:3160:2: ( ruleEquation )
            {
            // InternalEasySql.g:3160:2: ( ruleEquation )
            // InternalEasySql.g:3161:3: ruleEquation
            {
             before(grammarAccess.getSimpleSelectQueryAccess().getSimpleconditionEquationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEquation();

            state._fsp--;

             after(grammarAccess.getSimpleSelectQueryAccess().getSimpleconditionEquationParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__SimpleSelectQuery__SimpleconditionAssignment_5"


    // $ANTLR start "rule__SimpleSelectQuery__RemoveDupAssignment_7"
    // InternalEasySql.g:3170:1: rule__SimpleSelectQuery__RemoveDupAssignment_7 : ( ( '.RemoveDuplication()' ) ) ;
    public final void rule__SimpleSelectQuery__RemoveDupAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:3174:1: ( ( ( '.RemoveDuplication()' ) ) )
            // InternalEasySql.g:3175:2: ( ( '.RemoveDuplication()' ) )
            {
            // InternalEasySql.g:3175:2: ( ( '.RemoveDuplication()' ) )
            // InternalEasySql.g:3176:3: ( '.RemoveDuplication()' )
            {
             before(grammarAccess.getSimpleSelectQueryAccess().getRemoveDupRemoveDuplicationKeyword_7_0()); 
            // InternalEasySql.g:3177:3: ( '.RemoveDuplication()' )
            // InternalEasySql.g:3178:4: '.RemoveDuplication()'
            {
             before(grammarAccess.getSimpleSelectQueryAccess().getRemoveDupRemoveDuplicationKeyword_7_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSimpleSelectQueryAccess().getRemoveDupRemoveDuplicationKeyword_7_0()); 

            }

             after(grammarAccess.getSimpleSelectQueryAccess().getRemoveDupRemoveDuplicationKeyword_7_0()); 

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
    // $ANTLR end "rule__SimpleSelectQuery__RemoveDupAssignment_7"


    // $ANTLR start "rule__SimpleSelectQuery__OrdertypeAssignment_8_1"
    // InternalEasySql.g:3189:1: rule__SimpleSelectQuery__OrdertypeAssignment_8_1 : ( ruleOrder ) ;
    public final void rule__SimpleSelectQuery__OrdertypeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:3193:1: ( ( ruleOrder ) )
            // InternalEasySql.g:3194:2: ( ruleOrder )
            {
            // InternalEasySql.g:3194:2: ( ruleOrder )
            // InternalEasySql.g:3195:3: ruleOrder
            {
             before(grammarAccess.getSimpleSelectQueryAccess().getOrdertypeOrderEnumRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrder();

            state._fsp--;

             after(grammarAccess.getSimpleSelectQueryAccess().getOrdertypeOrderEnumRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__SimpleSelectQuery__OrdertypeAssignment_8_1"


    // $ANTLR start "rule__SimpleSelectQuery__SCattributesAssignment_8_3"
    // InternalEasySql.g:3204:1: rule__SimpleSelectQuery__SCattributesAssignment_8_3 : ( ruleValue ) ;
    public final void rule__SimpleSelectQuery__SCattributesAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:3208:1: ( ( ruleValue ) )
            // InternalEasySql.g:3209:2: ( ruleValue )
            {
            // InternalEasySql.g:3209:2: ( ruleValue )
            // InternalEasySql.g:3210:3: ruleValue
            {
             before(grammarAccess.getSimpleSelectQueryAccess().getSCattributesValueParserRuleCall_8_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getSimpleSelectQueryAccess().getSCattributesValueParserRuleCall_8_3_0()); 

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
    // $ANTLR end "rule__SimpleSelectQuery__SCattributesAssignment_8_3"


    // $ANTLR start "rule__JoinQuery__Jtable1Assignment_0"
    // InternalEasySql.g:3219:1: rule__JoinQuery__Jtable1Assignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__JoinQuery__Jtable1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:3223:1: ( ( ( RULE_ID ) ) )
            // InternalEasySql.g:3224:2: ( ( RULE_ID ) )
            {
            // InternalEasySql.g:3224:2: ( ( RULE_ID ) )
            // InternalEasySql.g:3225:3: ( RULE_ID )
            {
             before(grammarAccess.getJoinQueryAccess().getJtable1TableDeclarationCrossReference_0_0()); 
            // InternalEasySql.g:3226:3: ( RULE_ID )
            // InternalEasySql.g:3227:4: RULE_ID
            {
             before(grammarAccess.getJoinQueryAccess().getJtable1TableDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJoinQueryAccess().getJtable1TableDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getJoinQueryAccess().getJtable1TableDeclarationCrossReference_0_0()); 

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
    // $ANTLR end "rule__JoinQuery__Jtable1Assignment_0"


    // $ANTLR start "rule__JoinQuery__JattributesAssignment_2"
    // InternalEasySql.g:3238:1: rule__JoinQuery__JattributesAssignment_2 : ( ruleVvalue ) ;
    public final void rule__JoinQuery__JattributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:3242:1: ( ( ruleVvalue ) )
            // InternalEasySql.g:3243:2: ( ruleVvalue )
            {
            // InternalEasySql.g:3243:2: ( ruleVvalue )
            // InternalEasySql.g:3244:3: ruleVvalue
            {
             before(grammarAccess.getJoinQueryAccess().getJattributesVvalueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVvalue();

            state._fsp--;

             after(grammarAccess.getJoinQueryAccess().getJattributesVvalueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__JoinQuery__JattributesAssignment_2"


    // $ANTLR start "rule__JoinQuery__JointypeAssignment_5"
    // InternalEasySql.g:3253:1: rule__JoinQuery__JointypeAssignment_5 : ( ruleJoin ) ;
    public final void rule__JoinQuery__JointypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:3257:1: ( ( ruleJoin ) )
            // InternalEasySql.g:3258:2: ( ruleJoin )
            {
            // InternalEasySql.g:3258:2: ( ruleJoin )
            // InternalEasySql.g:3259:3: ruleJoin
            {
             before(grammarAccess.getJoinQueryAccess().getJointypeJoinEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleJoin();

            state._fsp--;

             after(grammarAccess.getJoinQueryAccess().getJointypeJoinEnumRuleCall_5_0()); 

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
    // $ANTLR end "rule__JoinQuery__JointypeAssignment_5"


    // $ANTLR start "rule__JoinQuery__Jtable2Assignment_7"
    // InternalEasySql.g:3268:1: rule__JoinQuery__Jtable2Assignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__JoinQuery__Jtable2Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:3272:1: ( ( ( RULE_ID ) ) )
            // InternalEasySql.g:3273:2: ( ( RULE_ID ) )
            {
            // InternalEasySql.g:3273:2: ( ( RULE_ID ) )
            // InternalEasySql.g:3274:3: ( RULE_ID )
            {
             before(grammarAccess.getJoinQueryAccess().getJtable2TableDeclarationCrossReference_7_0()); 
            // InternalEasySql.g:3275:3: ( RULE_ID )
            // InternalEasySql.g:3276:4: RULE_ID
            {
             before(grammarAccess.getJoinQueryAccess().getJtable2TableDeclarationIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJoinQueryAccess().getJtable2TableDeclarationIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getJoinQueryAccess().getJtable2TableDeclarationCrossReference_7_0()); 

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
    // $ANTLR end "rule__JoinQuery__Jtable2Assignment_7"


    // $ANTLR start "rule__JoinQuery__JoinconditionAssignment_10"
    // InternalEasySql.g:3287:1: rule__JoinQuery__JoinconditionAssignment_10 : ( ruleMultiEquation ) ;
    public final void rule__JoinQuery__JoinconditionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:3291:1: ( ( ruleMultiEquation ) )
            // InternalEasySql.g:3292:2: ( ruleMultiEquation )
            {
            // InternalEasySql.g:3292:2: ( ruleMultiEquation )
            // InternalEasySql.g:3293:3: ruleMultiEquation
            {
             before(grammarAccess.getJoinQueryAccess().getJoinconditionMultiEquationParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiEquation();

            state._fsp--;

             after(grammarAccess.getJoinQueryAccess().getJoinconditionMultiEquationParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__JoinQuery__JoinconditionAssignment_10"


    // $ANTLR start "rule__NestedQuery__NtableAssignment_0"
    // InternalEasySql.g:3302:1: rule__NestedQuery__NtableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NestedQuery__NtableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:3306:1: ( ( ( RULE_ID ) ) )
            // InternalEasySql.g:3307:2: ( ( RULE_ID ) )
            {
            // InternalEasySql.g:3307:2: ( ( RULE_ID ) )
            // InternalEasySql.g:3308:3: ( RULE_ID )
            {
             before(grammarAccess.getNestedQueryAccess().getNtableTableDeclarationCrossReference_0_0()); 
            // InternalEasySql.g:3309:3: ( RULE_ID )
            // InternalEasySql.g:3310:4: RULE_ID
            {
             before(grammarAccess.getNestedQueryAccess().getNtableTableDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNestedQueryAccess().getNtableTableDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getNestedQueryAccess().getNtableTableDeclarationCrossReference_0_0()); 

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
    // $ANTLR end "rule__NestedQuery__NtableAssignment_0"


    // $ANTLR start "rule__NestedQuery__NattributesAssignment_2"
    // InternalEasySql.g:3321:1: rule__NestedQuery__NattributesAssignment_2 : ( ruleValue ) ;
    public final void rule__NestedQuery__NattributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:3325:1: ( ( ruleValue ) )
            // InternalEasySql.g:3326:2: ( ruleValue )
            {
            // InternalEasySql.g:3326:2: ( ruleValue )
            // InternalEasySql.g:3327:3: ruleValue
            {
             before(grammarAccess.getNestedQueryAccess().getNattributesValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getNestedQueryAccess().getNattributesValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__NestedQuery__NattributesAssignment_2"


    // $ANTLR start "rule__NestedQuery__Nattributes1Assignment_5"
    // InternalEasySql.g:3336:1: rule__NestedQuery__Nattributes1Assignment_5 : ( ruleValue ) ;
    public final void rule__NestedQuery__Nattributes1Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:3340:1: ( ( ruleValue ) )
            // InternalEasySql.g:3341:2: ( ruleValue )
            {
            // InternalEasySql.g:3341:2: ( ruleValue )
            // InternalEasySql.g:3342:3: ruleValue
            {
             before(grammarAccess.getNestedQueryAccess().getNattributes1ValueParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getNestedQueryAccess().getNattributes1ValueParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__NestedQuery__Nattributes1Assignment_5"


    // $ANTLR start "rule__NestedQuery__SubselectqueryAssignment_8"
    // InternalEasySql.g:3351:1: rule__NestedQuery__SubselectqueryAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__NestedQuery__SubselectqueryAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEasySql.g:3355:1: ( ( ( RULE_ID ) ) )
            // InternalEasySql.g:3356:2: ( ( RULE_ID ) )
            {
            // InternalEasySql.g:3356:2: ( ( RULE_ID ) )
            // InternalEasySql.g:3357:3: ( RULE_ID )
            {
             before(grammarAccess.getNestedQueryAccess().getSubselectquerySingleSelectDeclarationCrossReference_8_0()); 
            // InternalEasySql.g:3358:3: ( RULE_ID )
            // InternalEasySql.g:3359:4: RULE_ID
            {
             before(grammarAccess.getNestedQueryAccess().getSubselectquerySingleSelectDeclarationIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNestedQueryAccess().getSubselectquerySingleSelectDeclarationIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getNestedQueryAccess().getSubselectquerySingleSelectDeclarationCrossReference_8_0()); 

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
    // $ANTLR end "rule__NestedQuery__SubselectqueryAssignment_8"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001800022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000001F800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});

}