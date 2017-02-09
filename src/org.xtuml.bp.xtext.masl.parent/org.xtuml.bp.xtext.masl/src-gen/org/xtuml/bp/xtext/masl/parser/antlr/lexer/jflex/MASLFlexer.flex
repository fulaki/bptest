/*
 * generated by Xtext 2.9.1
 */
package org.xtuml.bp.xtext.masl.parser.antlr.lexer.jflex;

import java.io.Reader;
import java.io.IOException;

import org.antlr.runtime.Token;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.TokenSource;

import static org.xtuml.bp.xtext.masl.parser.antlr.internal.InternalMASLParser.*;

@SuppressWarnings({"all"})
%%

%{
	public final static TokenSource createTokenSource(Reader reader) {
		return new MASLFlexer(reader);
	}

	private int offset = 0;
	
	public void reset(Reader reader) {
		yyreset(reader);
		offset = 0;
	}

	@Override
	public Token nextToken() {
		try {
			int type = advance();
			if (type == Token.EOF) {
				return Token.EOF_TOKEN;
			}
			int length = yylength();
			final String tokenText = yytext();
			CommonToken result = new CommonTokenWithText(tokenText, type, Token.DEFAULT_CHANNEL, offset);
			offset += length;
			return result;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String getSourceName() {
		return "FlexTokenSource";
	}

	public static class CommonTokenWithText extends CommonToken {

		private static final long serialVersionUID = 1L;

		public CommonTokenWithText(String tokenText, int type, int defaultChannel, int offset) {
			super(null, type, defaultChannel, offset, offset + tokenText.length() - 1);
			this.text = tokenText;
		}
	}

%}

%unicode
%implements org.antlr.runtime.TokenSource
%class MASLFlexer
%function advance
%public
%int
%eofval{
return Token.EOF;
%eofval}

/*
 * A custom lexer based on JFlex that is needed because of Antlr's deficiencies 
 * with regards to floating point literals
 */
 
WS = [\ \n\r\t]+
ANY_OTHER = . 
SL_COMMENT = "//"[^\r\n]*(\r?\n)?

REAL = {DIGIT}+ "." {DIGIT}+ (("e"|"E") ("+"|"-")? {DIGIT}+)?
 	 | {DIGIT}* "." {DIGIT}+ (("e"|"E") ("+"|"-")? {DIGIT}+)?
	 | {DIGIT}+              (("e"|"E") ("+"|"-")? {DIGIT}+)  
	 | {DIGIT}+ "#" {DIGIT36}+ "." {DIGIT36}+ ("#" ("+"|"-")? {DIGIT}+)?
	 | {DIGIT}+ "#" {DIGIT36}* "." {DIGIT36}+ ("#" ("+"|"-")? {DIGIT}+)?
	 | {DIGIT}+ "#" {DIGIT36}+                ("#" ("+"|"-")? {DIGIT}+)

DEC_INT = {DIGIT}+
INT = {DEC_INT} ("#" {DIGIT36}+)?

DIGIT8  = [0-7]
DIGIT   = [0-9]
DIGIT16 = [0-9A-Fa-f]
DIGIT36 = [0-9A-Za-z]

DURATION  = @ [Pp] [^@]* @?
TIMESTAMP = @      [^@]* @?
	
ID = [A-Za-z_] ([A-Za-z_0-9])* 

STRING = \" ([^\\\"] | {ESCAPE_SEQUENCE})* \"?
CHAR =  "'" ([^\\\'] | {ESCAPE_SEQUENCE})  "'"
	
ESCAPE_SEQUENCE = "\\" ([^0-9u] | {DIGIT8}{DIGIT8}{DIGIT8} | "u" {DIGIT16}+)


%%

<YYINITIAL> "reverse_ordered_by" { return Reverse_ordered_by; }
<YYINITIAL> "unconditionally" { return Unconditionally; }
<YYINITIAL> "Cannot_Happen" { return Cannot_Happen; }
<YYINITIAL> "Current_State" { return Current_State; }
<YYINITIAL> "cannot_happen" { return Cannot_happen; }
<YYINITIAL> "conditionally" { return Conditionally; }
<YYINITIAL> "Non_Existant" { return Non_Existant; }
<YYINITIAL> "Non_Existent" { return Non_Existent; }
<YYINITIAL> "intersection" { return Intersection; }
<YYINITIAL> "non_existant" { return Non_existant; }
<YYINITIAL> "non_existent" { return Non_existent; }
<YYINITIAL> "relationship" { return Relationship; }
<YYINITIAL> "referential" { return Referential; }
<YYINITIAL> "dictionary" { return Dictionary; }
<YYINITIAL> "identifier" { return Identifier; }
<YYINITIAL> "ordered_by" { return Ordered_by; }
<YYINITIAL> "terminator" { return Terminator; }
<YYINITIAL> "transition" { return Transition; }
<YYINITIAL> "anonymous" { return Anonymous; }
<YYINITIAL> "exception" { return Exception; }
<YYINITIAL> "find_only" { return Find_only; }
<YYINITIAL> "preferred" { return Preferred; }
<YYINITIAL> "structure" { return Structure; }
<YYINITIAL> "assigner" { return Assigner; }
<YYINITIAL> "creation" { return Creation; }
<YYINITIAL> "deferred" { return Deferred; }
<YYINITIAL> "disunion" { return Disunion; }
<YYINITIAL> "find_all" { return Find_all; }
<YYINITIAL> "find_one" { return Find_one; }
<YYINITIAL> "function" { return Function; }
<YYINITIAL> "generate" { return Generate; }
<YYINITIAL> "instance" { return Instance; }
<YYINITIAL> "readonly" { return Readonly; }
<YYINITIAL> "schedule" { return Schedule; }
<YYINITIAL> "sequence" { return Sequence; }
<YYINITIAL> "terminal" { return Terminal; }
<YYINITIAL> "builtin" { return Builtin; }
<YYINITIAL> "console" { return Console; }
<YYINITIAL> "declare" { return Declare; }
<YYINITIAL> "private" { return Private; }
<YYINITIAL> "project" { return Project; }
<YYINITIAL> "reverse" { return Reverse; }
<YYINITIAL> "service" { return Service; }
<YYINITIAL> "subtype" { return Subtype; }
<YYINITIAL> "#FILE#" { return FILE; }
<YYINITIAL> "#LINE#" { return LINE; }
<YYINITIAL> "Ignore" { return Ignore; }
<YYINITIAL> "cancel" { return Cancel; }
<YYINITIAL> "create" { return Create; }
<YYINITIAL> "delete" { return Delete; }
<YYINITIAL> "digits" { return Digits; }
<YYINITIAL> "domain" { return Domain; }
<YYINITIAL> "not_in" { return Not_in; }
<YYINITIAL> "object" { return Object; }
<YYINITIAL> "others" { return Others; }
<YYINITIAL> "pragma" { return Pragma; }
<YYINITIAL> "public" { return Public; }
<YYINITIAL> "return" { return Return; }
<YYINITIAL> "unique" { return Unique; }
<YYINITIAL> "unlink" { return Unlink; }
<YYINITIAL> "array" { return Array; }
<YYINITIAL> "begin" { return Begin; }
<YYINITIAL> "delay" { return Delay; }
<YYINITIAL> "delta" { return Delta; }
<YYINITIAL> "elsif" { return Elsif; }
<YYINITIAL> "erase" { return Erase; }
<YYINITIAL> "event" { return Event; }
<YYINITIAL> "false" { return False; }
<YYINITIAL> "flush" { return Flush; }
<YYINITIAL> "raise" { return Raise; }
<YYINITIAL> "range" { return Range; }
<YYINITIAL> "start" { return Start; }
<YYINITIAL> "state" { return State; }
<YYINITIAL> "union" { return Union; }
<YYINITIAL> "using" { return Using; }
<YYINITIAL> "while" { return While; }
<YYINITIAL> "case" { return Case; }
<YYINITIAL> "else" { return Else; }
<YYINITIAL> "endl" { return Endl; }
<YYINITIAL> "enum" { return Enum; }
<YYINITIAL> "exit" { return Exit; }
<YYINITIAL> "find" { return Find; }
<YYINITIAL> "is_a" { return Is_a; }
<YYINITIAL> "link" { return Link; }
<YYINITIAL> "loop" { return Loop; }
<YYINITIAL> "many" { return Many; }
<YYINITIAL> "null" { return Null; }
<YYINITIAL> "then" { return Then; }
<YYINITIAL> "this" { return This; }
<YYINITIAL> "true" { return True; }
<YYINITIAL> "type" { return Type; }
<YYINITIAL> "when" { return When; }
<YYINITIAL> "with" { return With; }
<YYINITIAL> "<<<" { return LessThanSignLessThanSignLessThanSign; }
<YYINITIAL> ">>>" { return GreaterThanSignGreaterThanSignGreaterThanSign; }
<YYINITIAL> "abs" { return Abs; }
<YYINITIAL> "and" { return And; }
<YYINITIAL> "bag" { return Bag; }
<YYINITIAL> "end" { return End; }
<YYINITIAL> "for" { return For; }
<YYINITIAL> "mod" { return Mod; }
<YYINITIAL> "not" { return Not; }
<YYINITIAL> "one" { return One; }
<YYINITIAL> "out" { return Out; }
<YYINITIAL> "rem" { return Rem; }
<YYINITIAL> "set" { return Set; }
<YYINITIAL> "xor" { return Xor; }
<YYINITIAL> "**" { return AsteriskAsterisk; }
<YYINITIAL> "->" { return HyphenMinusGreaterThanSign; }
<YYINITIAL> ".." { return FullStopFullStop; }
<YYINITIAL> "/=" { return SolidusEqualsSign; }
<YYINITIAL> "::" { return ColonColon; }
<YYINITIAL> ":=" { return ColonEqualsSign; }
<YYINITIAL> "<<" { return LessThanSignLessThanSign; }
<YYINITIAL> "<=" { return LessThanSignEqualsSign; }
<YYINITIAL> "<>" { return LessThanSignGreaterThanSign; }
<YYINITIAL> "=>" { return EqualsSignGreaterThanSign; }
<YYINITIAL> ">=" { return GreaterThanSignEqualsSign; }
<YYINITIAL> ">>" { return GreaterThanSignGreaterThanSign; }
<YYINITIAL> "at" { return At; }
<YYINITIAL> "if" { return If; }
<YYINITIAL> "in" { return In; }
<YYINITIAL> "is" { return Is; }
<YYINITIAL> "of" { return Of; }
<YYINITIAL> "or" { return Or; }
<YYINITIAL> "to" { return To; }
<YYINITIAL> "~>" { return TildeGreaterThanSign; }
<YYINITIAL> "&" { return Ampersand; }
<YYINITIAL> "'" { return Apostrophe; }
<YYINITIAL> "(" { return LeftParenthesis; }
<YYINITIAL> ")" { return RightParenthesis; }
<YYINITIAL> "*" { return Asterisk; }
<YYINITIAL> "+" { return PlusSign; }
<YYINITIAL> "," { return Comma; }
<YYINITIAL> "-" { return HyphenMinus; }
<YYINITIAL> "." { return FullStop; }
<YYINITIAL> "/" { return Solidus; }
<YYINITIAL> ":" { return Colon; }
<YYINITIAL> ";" { return Semicolon; }
<YYINITIAL> "<" { return LessThanSign; }
<YYINITIAL> "=" { return EqualsSign; }
<YYINITIAL> ">" { return GreaterThanSign; }
<YYINITIAL> "[" { return LeftSquareBracket; }
<YYINITIAL> "]" { return RightSquareBracket; }
<YYINITIAL> "|" { return VerticalLine; }



<YYINITIAL> {ID} { return RULE_ID; }
<YYINITIAL> {REAL} { return RULE_REAL; }
<YYINITIAL> {INT} { return RULE_INT; }
<YYINITIAL> {STRING} { return RULE_STRING; }
<YYINITIAL> {CHAR} { return RULE_CHAR; }
<YYINITIAL> {DURATION} { return RULE_DURATION; }
<YYINITIAL> {TIMESTAMP} { return RULE_TIMESTAMP; }
<YYINITIAL> {SL_COMMENT} { return RULE_SL_COMMENT; }
<YYINITIAL> {WS} { return RULE_WS; }
<YYINITIAL> {ANY_OTHER} { return RULE_ANY_OTHER; }
