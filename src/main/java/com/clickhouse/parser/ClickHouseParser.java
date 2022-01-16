// Generated from ClickHouseParser.g4 by ANTLR 4.9.1
package com.clickhouse.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ClickHouseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, AFTER=2, ALIAS=3, ALL=4, ALTER=5, AND=6, ANTI=7, ANY=8, ARRAY=9, 
		AS=10, ASCENDING=11, ASOF=12, ASYNC=13, ATTACH=14, BETWEEN=15, BOTH=16, 
		BY=17, CASE=18, CAST=19, CHECK=20, CLEAR=21, CLUSTER=22, CODEC=23, COLLATE=24, 
		COLUMN=25, COMMENT=26, CONSTRAINT=27, CREATE=28, CROSS=29, CUBE=30, DATABASE=31, 
		DATABASES=32, DATE=33, DAY=34, DEDUPLICATE=35, DEFAULT=36, DELAY=37, DELETE=38, 
		DESC=39, DESCENDING=40, DESCRIBE=41, DETACH=42, DICTIONARIES=43, DICTIONARY=44, 
		DISK=45, DISTINCT=46, DISTRIBUTED=47, DROP=48, ELSE=49, END=50, ENGINE=51, 
		EVENTS=52, EXISTS=53, EXPLAIN=54, EXPRESSION=55, EXTRACT=56, FETCHES=57, 
		FINAL=58, FIRST=59, FLUSH=60, FOR=61, FORMAT=62, FREEZE=63, FROM=64, FULL=65, 
		FUNCTION=66, GLOBAL=67, GRANULARITY=68, GROUP=69, HAVING=70, HIERARCHICAL=71, 
		HOUR=72, ID=73, IF=74, ILIKE=75, IN=76, INDEX=77, INF=78, INJECTIVE=79, 
		INNER=80, INSERT=81, INTERVAL=82, INTO=83, IS=84, IS_OBJECT_ID=85, JOIN=86, 
		KEY=87, KILL=88, LAST=89, LAYOUT=90, LEADING=91, LEFT=92, LIFETIME=93, 
		LIKE=94, LIMIT=95, LIVE=96, LOCAL=97, LOGS=98, MATERIALIZED=99, MAX=100, 
		MERGES=101, MIN=102, MINUTE=103, MODIFY=104, MONTH=105, MOVE=106, MUTATION=107, 
		NAN_SQL=108, NO=109, NOT=110, NULL_SQL=111, NULLS=112, OFFSET=113, ON=114, 
		OPTIMIZE=115, OR=116, ORDER=117, OUTER=118, OUTFILE=119, PARTITION=120, 
		POPULATE=121, PREWHERE=122, PRIMARY=123, QUARTER=124, RANGE=125, RELOAD=126, 
		REMOVE=127, RENAME=128, REPLACE=129, REPLICA=130, REPLICATED=131, RIGHT=132, 
		ROLLUP=133, SAMPLE=134, SECOND=135, SELECT=136, SEMI=137, SENDS=138, SET=139, 
		SETTINGS=140, SHOW=141, SOURCE=142, START=143, STOP=144, SUBSTRING=145, 
		SYNC=146, SYNTAX=147, SYSTEM=148, TABLE=149, TABLES=150, TEMPORARY=151, 
		TEST=152, THEN=153, TIES=154, TIMEOUT=155, TIMESTAMP=156, TO=157, TOP=158, 
		TOTALS=159, TRAILING=160, TRIM=161, TRUNCATE=162, TTL=163, TYPE=164, UNION=165, 
		UPDATE=166, USE=167, USING=168, UUID=169, VALUES=170, VIEW=171, VOLUME=172, 
		WATCH=173, WEEK=174, WHEN=175, WHERE=176, WITH=177, YEAR=178, JSON_FALSE=179, 
		JSON_TRUE=180, IDENTIFIER=181, FLOATING_LITERAL=182, OCTAL_LITERAL=183, 
		DECIMAL_LITERAL=184, HEXADECIMAL_LITERAL=185, STRING_LITERAL=186, ARROW=187, 
		ASTERISK=188, BACKQUOTE=189, BACKSLASH=190, COLON=191, COMMA=192, CONCAT=193, 
		DASH=194, DOT=195, EQ_DOUBLE=196, EQ_SINGLE=197, GE=198, GT=199, LBRACE=200, 
		LBRACKET=201, LE=202, LPAREN=203, LT=204, NOT_EQ=205, PERCENT=206, PLUS=207, 
		QUERY=208, QUOTE_DOUBLE=209, QUOTE_SINGLE=210, RBRACE=211, RBRACKET=212, 
		RPAREN=213, SEMICOLON=214, SLASH=215, UNDERSCORE=216, MULTI_LINE_COMMENT=217, 
		SINGLE_LINE_COMMENT=218, WHITESPACE=219;
	public static final int
		RULE_queryStmt = 0, RULE_query = 1, RULE_alterStmt = 2, RULE_alterTableClause = 3, 
		RULE_assignmentExprList = 4, RULE_assignmentExpr = 5, RULE_tableColumnPropertyType = 6, 
		RULE_partitionClause = 7, RULE_attachStmt = 8, RULE_checkStmt = 9, RULE_createStmt = 10, 
		RULE_dictionarySchemaClause = 11, RULE_dictionaryAttrDfnt = 12, RULE_dictionaryEngineClause = 13, 
		RULE_dictionaryPrimaryKeyClause = 14, RULE_dictionaryArgExpr = 15, RULE_sourceClause = 16, 
		RULE_lifetimeClause = 17, RULE_layoutClause = 18, RULE_rangeClause = 19, 
		RULE_dictionarySettingsClause = 20, RULE_clusterClause = 21, RULE_uuidClause = 22, 
		RULE_destinationClause = 23, RULE_subqueryClause = 24, RULE_tableSchemaClause = 25, 
		RULE_engineClause = 26, RULE_partitionByClause = 27, RULE_primaryKeyClause = 28, 
		RULE_sampleByClause = 29, RULE_ttlClause = 30, RULE_engineExpr = 31, RULE_tableElementExpr = 32, 
		RULE_tableColumnDfnt = 33, RULE_tableColumnPropertyExpr = 34, RULE_tableIndexDfnt = 35, 
		RULE_codecExpr = 36, RULE_codecArgExpr = 37, RULE_ttlExpr = 38, RULE_describeStmt = 39, 
		RULE_dropStmt = 40, RULE_existsStmt = 41, RULE_explainStmt = 42, RULE_insertStmt = 43, 
		RULE_columnsClause = 44, RULE_dataClause = 45, RULE_killStmt = 46, RULE_optimizeStmt = 47, 
		RULE_renameStmt = 48, RULE_selectUnionStmt = 49, RULE_selectStmtWithParens = 50, 
		RULE_selectStmt = 51, RULE_withClause = 52, RULE_topClause = 53, RULE_fromClause = 54, 
		RULE_arrayJoinClause = 55, RULE_prewhereClause = 56, RULE_whereClause = 57, 
		RULE_groupByClause = 58, RULE_havingClause = 59, RULE_orderByClause = 60, 
		RULE_limitByClause = 61, RULE_limitClause = 62, RULE_settingsClause = 63, 
		RULE_joinExpr = 64, RULE_joinOp = 65, RULE_joinOpCross = 66, RULE_joinConstraintClause = 67, 
		RULE_sampleClause = 68, RULE_limitExpr = 69, RULE_orderExprList = 70, 
		RULE_orderExpr = 71, RULE_ratioExpr = 72, RULE_settingExprList = 73, RULE_settingExpr = 74, 
		RULE_setStmt = 75, RULE_showStmt = 76, RULE_systemStmt = 77, RULE_truncateStmt = 78, 
		RULE_useStmt = 79, RULE_watchStmt = 80, RULE_columnTypeExpr = 81, RULE_columnExprList = 82, 
		RULE_columnsExpr = 83, RULE_columnExpr = 84, RULE_columnArgList = 85, 
		RULE_columnArgExpr = 86, RULE_columnLambdaExpr = 87, RULE_columnIdentifier = 88, 
		RULE_nestedIdentifier = 89, RULE_tableExpr = 90, RULE_tableFunctionExpr = 91, 
		RULE_tableIdentifier = 92, RULE_tableArgList = 93, RULE_tableArgExpr = 94, 
		RULE_databaseIdentifier = 95, RULE_floatingLiteral = 96, RULE_numberLiteral = 97, 
		RULE_literal = 98, RULE_interval = 99, RULE_keyword = 100, RULE_keywordForAlias = 101, 
		RULE_alias = 102, RULE_identifier = 103, RULE_identifierOrNull = 104, 
		RULE_enumValue = 105;
	private static String[] makeRuleNames() {
		return new String[] {
			"queryStmt", "query", "alterStmt", "alterTableClause", "assignmentExprList", 
			"assignmentExpr", "tableColumnPropertyType", "partitionClause", "attachStmt", 
			"checkStmt", "createStmt", "dictionarySchemaClause", "dictionaryAttrDfnt", 
			"dictionaryEngineClause", "dictionaryPrimaryKeyClause", "dictionaryArgExpr", 
			"sourceClause", "lifetimeClause", "layoutClause", "rangeClause", "dictionarySettingsClause", 
			"clusterClause", "uuidClause", "destinationClause", "subqueryClause", 
			"tableSchemaClause", "engineClause", "partitionByClause", "primaryKeyClause", 
			"sampleByClause", "ttlClause", "engineExpr", "tableElementExpr", "tableColumnDfnt", 
			"tableColumnPropertyExpr", "tableIndexDfnt", "codecExpr", "codecArgExpr", 
			"ttlExpr", "describeStmt", "dropStmt", "existsStmt", "explainStmt", "insertStmt", 
			"columnsClause", "dataClause", "killStmt", "optimizeStmt", "renameStmt", 
			"selectUnionStmt", "selectStmtWithParens", "selectStmt", "withClause", 
			"topClause", "fromClause", "arrayJoinClause", "prewhereClause", "whereClause", 
			"groupByClause", "havingClause", "orderByClause", "limitByClause", "limitClause", 
			"settingsClause", "joinExpr", "joinOp", "joinOpCross", "joinConstraintClause", 
			"sampleClause", "limitExpr", "orderExprList", "orderExpr", "ratioExpr", 
			"settingExprList", "settingExpr", "setStmt", "showStmt", "systemStmt", 
			"truncateStmt", "useStmt", "watchStmt", "columnTypeExpr", "columnExprList", 
			"columnsExpr", "columnExpr", "columnArgList", "columnArgExpr", "columnLambdaExpr", 
			"columnIdentifier", "nestedIdentifier", "tableExpr", "tableFunctionExpr", 
			"tableIdentifier", "tableArgList", "tableArgExpr", "databaseIdentifier", 
			"floatingLiteral", "numberLiteral", "literal", "interval", "keyword", 
			"keywordForAlias", "alias", "identifier", "identifierOrNull", "enumValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'false'", 
			"'true'", null, null, null, null, null, null, "'->'", "'*'", "'`'", "'\\'", 
			"':'", "','", "'||'", "'-'", "'.'", "'=='", "'='", "'>='", "'>'", "'{'", 
			"'['", "'<='", "'('", "'<'", null, "'%'", "'+'", "'?'", "'\"'", "'''", 
			"'}'", "']'", "')'", "';'", "'/'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "AFTER", "ALIAS", "ALL", "ALTER", "AND", "ANTI", "ANY", 
			"ARRAY", "AS", "ASCENDING", "ASOF", "ASYNC", "ATTACH", "BETWEEN", "BOTH", 
			"BY", "CASE", "CAST", "CHECK", "CLEAR", "CLUSTER", "CODEC", "COLLATE", 
			"COLUMN", "COMMENT", "CONSTRAINT", "CREATE", "CROSS", "CUBE", "DATABASE", 
			"DATABASES", "DATE", "DAY", "DEDUPLICATE", "DEFAULT", "DELAY", "DELETE", 
			"DESC", "DESCENDING", "DESCRIBE", "DETACH", "DICTIONARIES", "DICTIONARY", 
			"DISK", "DISTINCT", "DISTRIBUTED", "DROP", "ELSE", "END", "ENGINE", "EVENTS", 
			"EXISTS", "EXPLAIN", "EXPRESSION", "EXTRACT", "FETCHES", "FINAL", "FIRST", 
			"FLUSH", "FOR", "FORMAT", "FREEZE", "FROM", "FULL", "FUNCTION", "GLOBAL", 
			"GRANULARITY", "GROUP", "HAVING", "HIERARCHICAL", "HOUR", "ID", "IF", 
			"ILIKE", "IN", "INDEX", "INF", "INJECTIVE", "INNER", "INSERT", "INTERVAL", 
			"INTO", "IS", "IS_OBJECT_ID", "JOIN", "KEY", "KILL", "LAST", "LAYOUT", 
			"LEADING", "LEFT", "LIFETIME", "LIKE", "LIMIT", "LIVE", "LOCAL", "LOGS", 
			"MATERIALIZED", "MAX", "MERGES", "MIN", "MINUTE", "MODIFY", "MONTH", 
			"MOVE", "MUTATION", "NAN_SQL", "NO", "NOT", "NULL_SQL", "NULLS", "OFFSET", 
			"ON", "OPTIMIZE", "OR", "ORDER", "OUTER", "OUTFILE", "PARTITION", "POPULATE", 
			"PREWHERE", "PRIMARY", "QUARTER", "RANGE", "RELOAD", "REMOVE", "RENAME", 
			"REPLACE", "REPLICA", "REPLICATED", "RIGHT", "ROLLUP", "SAMPLE", "SECOND", 
			"SELECT", "SEMI", "SENDS", "SET", "SETTINGS", "SHOW", "SOURCE", "START", 
			"STOP", "SUBSTRING", "SYNC", "SYNTAX", "SYSTEM", "TABLE", "TABLES", "TEMPORARY", 
			"TEST", "THEN", "TIES", "TIMEOUT", "TIMESTAMP", "TO", "TOP", "TOTALS", 
			"TRAILING", "TRIM", "TRUNCATE", "TTL", "TYPE", "UNION", "UPDATE", "USE", 
			"USING", "UUID", "VALUES", "VIEW", "VOLUME", "WATCH", "WEEK", "WHEN", 
			"WHERE", "WITH", "YEAR", "JSON_FALSE", "JSON_TRUE", "IDENTIFIER", "FLOATING_LITERAL", 
			"OCTAL_LITERAL", "DECIMAL_LITERAL", "HEXADECIMAL_LITERAL", "STRING_LITERAL", 
			"ARROW", "ASTERISK", "BACKQUOTE", "BACKSLASH", "COLON", "COMMA", "CONCAT", 
			"DASH", "DOT", "EQ_DOUBLE", "EQ_SINGLE", "GE", "GT", "LBRACE", "LBRACKET", 
			"LE", "LPAREN", "LT", "NOT_EQ", "PERCENT", "PLUS", "QUERY", "QUOTE_DOUBLE", 
			"QUOTE_SINGLE", "RBRACE", "RBRACKET", "RPAREN", "SEMICOLON", "SLASH", 
			"UNDERSCORE", "MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ClickHouseParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ClickHouseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class QueryStmtContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode INTO() { return getToken(ClickHouseParser.INTO, 0); }
		public TerminalNode OUTFILE() { return getToken(ClickHouseParser.OUTFILE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode FORMAT() { return getToken(ClickHouseParser.FORMAT, 0); }
		public IdentifierOrNullContext identifierOrNull() {
			return getRuleContext(IdentifierOrNullContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ClickHouseParser.SEMICOLON, 0); }
		public InsertStmtContext insertStmt() {
			return getRuleContext(InsertStmtContext.class,0);
		}
		public QueryStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitQueryStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryStmtContext queryStmt() throws RecognitionException {
		QueryStmtContext _localctx = new QueryStmtContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_queryStmt);
		int _la;
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALTER:
			case ATTACH:
			case CHECK:
			case CREATE:
			case DESC:
			case DESCRIBE:
			case DETACH:
			case DROP:
			case EXISTS:
			case EXPLAIN:
			case KILL:
			case OPTIMIZE:
			case RENAME:
			case SELECT:
			case SET:
			case SHOW:
			case SYSTEM:
			case TRUNCATE:
			case USE:
			case WATCH:
			case WITH:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				query();
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTO) {
					{
					setState(213);
					match(INTO);
					setState(214);
					match(OUTFILE);
					setState(215);
					match(STRING_LITERAL);
					}
				}

				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FORMAT) {
					{
					setState(218);
					match(FORMAT);
					setState(219);
					identifierOrNull();
					}
				}

				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(222);
					match(SEMICOLON);
					}
				}

				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				insertStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public AlterStmtContext alterStmt() {
			return getRuleContext(AlterStmtContext.class,0);
		}
		public AttachStmtContext attachStmt() {
			return getRuleContext(AttachStmtContext.class,0);
		}
		public CheckStmtContext checkStmt() {
			return getRuleContext(CheckStmtContext.class,0);
		}
		public CreateStmtContext createStmt() {
			return getRuleContext(CreateStmtContext.class,0);
		}
		public DescribeStmtContext describeStmt() {
			return getRuleContext(DescribeStmtContext.class,0);
		}
		public DropStmtContext dropStmt() {
			return getRuleContext(DropStmtContext.class,0);
		}
		public ExistsStmtContext existsStmt() {
			return getRuleContext(ExistsStmtContext.class,0);
		}
		public ExplainStmtContext explainStmt() {
			return getRuleContext(ExplainStmtContext.class,0);
		}
		public KillStmtContext killStmt() {
			return getRuleContext(KillStmtContext.class,0);
		}
		public OptimizeStmtContext optimizeStmt() {
			return getRuleContext(OptimizeStmtContext.class,0);
		}
		public RenameStmtContext renameStmt() {
			return getRuleContext(RenameStmtContext.class,0);
		}
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public SetStmtContext setStmt() {
			return getRuleContext(SetStmtContext.class,0);
		}
		public ShowStmtContext showStmt() {
			return getRuleContext(ShowStmtContext.class,0);
		}
		public SystemStmtContext systemStmt() {
			return getRuleContext(SystemStmtContext.class,0);
		}
		public TruncateStmtContext truncateStmt() {
			return getRuleContext(TruncateStmtContext.class,0);
		}
		public UseStmtContext useStmt() {
			return getRuleContext(UseStmtContext.class,0);
		}
		public WatchStmtContext watchStmt() {
			return getRuleContext(WatchStmtContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				alterStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				attachStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				checkStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				createStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				describeStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				dropStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(234);
				existsStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(235);
				explainStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(236);
				killStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(237);
				optimizeStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(238);
				renameStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(239);
				selectUnionStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(240);
				setStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(241);
				showStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(242);
				systemStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(243);
				truncateStmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(244);
				useStmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(245);
				watchStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStmtContext extends ParserRuleContext {
		public AlterStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStmt; }
	 
		public AlterStmtContext() { }
		public void copyFrom(AlterStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AlterTableStmtContext extends AlterStmtContext {
		public TerminalNode ALTER() { return getToken(ClickHouseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public List<AlterTableClauseContext> alterTableClause() {
			return getRuleContexts(AlterTableClauseContext.class);
		}
		public AlterTableClauseContext alterTableClause(int i) {
			return getRuleContext(AlterTableClauseContext.class,i);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public AlterTableStmtContext(AlterStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterStmtContext alterStmt() throws RecognitionException {
		AlterStmtContext _localctx = new AlterStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alterStmt);
		int _la;
		try {
			_localctx = new AlterTableStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(ALTER);
			setState(249);
			match(TABLE);
			setState(250);
			tableIdentifier();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(251);
				clusterClause();
				}
			}

			setState(254);
			alterTableClause();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(255);
				match(COMMA);
				setState(256);
				alterTableClause();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTableClauseContext extends ParserRuleContext {
		public AlterTableClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableClause; }
	 
		public AlterTableClauseContext() { }
		public void copyFrom(AlterTableClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AlterTableClauseReplaceContext extends AlterTableClauseContext {
		public TerminalNode REPLACE() { return getToken(ClickHouseParser.REPLACE, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public AlterTableClauseReplaceContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseReplace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseRenameContext extends AlterTableClauseContext {
		public TerminalNode RENAME() { return getToken(ClickHouseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public List<NestedIdentifierContext> nestedIdentifier() {
			return getRuleContexts(NestedIdentifierContext.class);
		}
		public NestedIdentifierContext nestedIdentifier(int i) {
			return getRuleContext(NestedIdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseRenameContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseRename(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseFreezePartitionContext extends AlterTableClauseContext {
		public TerminalNode FREEZE() { return getToken(ClickHouseParser.FREEZE, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseFreezePartitionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseFreezePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public TableColumnDfntContext tableColumnDfnt() {
			return getRuleContext(TableColumnDfntContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseModifyContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModify(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyOrderByContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode ORDER() { return getToken(ClickHouseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AlterTableClauseModifyOrderByContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModifyOrderBy(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseRemoveTTLContext extends AlterTableClauseContext {
		public TerminalNode REMOVE() { return getToken(ClickHouseParser.REMOVE, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public AlterTableClauseRemoveTTLContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseRemoveTTL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseUpdateContext extends AlterTableClauseContext {
		public TerminalNode UPDATE() { return getToken(ClickHouseParser.UPDATE, 0); }
		public AssignmentExprListContext assignmentExprList() {
			return getRuleContext(AssignmentExprListContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AlterTableClauseUpdateContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseUpdate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyRemoveContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode REMOVE() { return getToken(ClickHouseParser.REMOVE, 0); }
		public TableColumnPropertyTypeContext tableColumnPropertyType() {
			return getRuleContext(TableColumnPropertyTypeContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseModifyRemoveContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModifyRemove(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDeleteContext extends AlterTableClauseContext {
		public TerminalNode DELETE() { return getToken(ClickHouseParser.DELETE, 0); }
		public TerminalNode WHERE() { return getToken(ClickHouseParser.WHERE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AlterTableClauseDeleteContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseDelete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyCodecContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public CodecExprContext codecExpr() {
			return getRuleContext(CodecExprContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseModifyCodecContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModifyCodec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseCommentContext extends AlterTableClauseContext {
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseCommentContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseComment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseAttachContext extends AlterTableClauseContext {
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public AlterTableClauseAttachContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseAttach(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDropColumnContext extends AlterTableClauseContext {
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseDropColumnContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseDropColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseClearContext extends AlterTableClauseContext {
		public TerminalNode CLEAR() { return getToken(ClickHouseParser.CLEAR, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseClearContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseClear(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDetachContext extends AlterTableClauseContext {
		public TerminalNode DETACH() { return getToken(ClickHouseParser.DETACH, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseDetachContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseDetach(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDropIndexContext extends AlterTableClauseContext {
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseDropIndexContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseDropIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseAddIndexContext extends AlterTableClauseContext {
		public TerminalNode ADD() { return getToken(ClickHouseParser.ADD, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public TableIndexDfntContext tableIndexDfnt() {
			return getRuleContext(TableIndexDfntContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode AFTER() { return getToken(ClickHouseParser.AFTER, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public AlterTableClauseAddIndexContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseAddIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDropPartitionContext extends AlterTableClauseContext {
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseDropPartitionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseDropPartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyCommentContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseModifyCommentContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModifyComment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyTTLContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TtlClauseContext ttlClause() {
			return getRuleContext(TtlClauseContext.class,0);
		}
		public AlterTableClauseModifyTTLContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModifyTTL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseMovePartitionContext extends AlterTableClauseContext {
		public TerminalNode MOVE() { return getToken(ClickHouseParser.MOVE, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TerminalNode DISK() { return getToken(ClickHouseParser.DISK, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode VOLUME() { return getToken(ClickHouseParser.VOLUME, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public AlterTableClauseMovePartitionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseMovePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseAddColumnContext extends AlterTableClauseContext {
		public TerminalNode ADD() { return getToken(ClickHouseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public TableColumnDfntContext tableColumnDfnt() {
			return getRuleContext(TableColumnDfntContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode AFTER() { return getToken(ClickHouseParser.AFTER, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public AlterTableClauseAddColumnContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseAddColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableClauseContext alterTableClause() throws RecognitionException {
		AlterTableClauseContext _localctx = new AlterTableClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alterTableClause);
		int _la;
		try {
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new AlterTableClauseAddColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(ADD);
				setState(263);
				match(COLUMN);
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(264);
					match(IF);
					setState(265);
					match(NOT);
					setState(266);
					match(EXISTS);
					}
					break;
				}
				setState(269);
				tableColumnDfnt();
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER) {
					{
					setState(270);
					match(AFTER);
					setState(271);
					nestedIdentifier();
					}
				}

				}
				break;
			case 2:
				_localctx = new AlterTableClauseAddIndexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(ADD);
				setState(275);
				match(INDEX);
				setState(279);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(276);
					match(IF);
					setState(277);
					match(NOT);
					setState(278);
					match(EXISTS);
					}
					break;
				}
				setState(281);
				tableIndexDfnt();
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER) {
					{
					setState(282);
					match(AFTER);
					setState(283);
					nestedIdentifier();
					}
				}

				}
				break;
			case 3:
				_localctx = new AlterTableClauseAttachContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				match(ATTACH);
				setState(287);
				partitionClause();
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(288);
					match(FROM);
					setState(289);
					tableIdentifier();
					}
				}

				}
				break;
			case 4:
				_localctx = new AlterTableClauseClearContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				match(CLEAR);
				setState(293);
				match(COLUMN);
				setState(296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(294);
					match(IF);
					setState(295);
					match(EXISTS);
					}
					break;
				}
				setState(298);
				nestedIdentifier();
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(299);
					match(IN);
					setState(300);
					partitionClause();
					}
				}

				}
				break;
			case 5:
				_localctx = new AlterTableClauseCommentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(303);
				match(COMMENT);
				setState(304);
				match(COLUMN);
				setState(307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(305);
					match(IF);
					setState(306);
					match(EXISTS);
					}
					break;
				}
				setState(309);
				nestedIdentifier();
				setState(310);
				match(STRING_LITERAL);
				}
				break;
			case 6:
				_localctx = new AlterTableClauseDeleteContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(312);
				match(DELETE);
				setState(313);
				match(WHERE);
				setState(314);
				columnExpr(0);
				}
				break;
			case 7:
				_localctx = new AlterTableClauseDetachContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(315);
				match(DETACH);
				setState(316);
				partitionClause();
				}
				break;
			case 8:
				_localctx = new AlterTableClauseDropColumnContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(317);
				match(DROP);
				setState(318);
				match(COLUMN);
				setState(321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(319);
					match(IF);
					setState(320);
					match(EXISTS);
					}
					break;
				}
				setState(323);
				nestedIdentifier();
				}
				break;
			case 9:
				_localctx = new AlterTableClauseDropIndexContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(324);
				match(DROP);
				setState(325);
				match(INDEX);
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(326);
					match(IF);
					setState(327);
					match(EXISTS);
					}
					break;
				}
				setState(330);
				nestedIdentifier();
				}
				break;
			case 10:
				_localctx = new AlterTableClauseDropPartitionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(331);
				match(DROP);
				setState(332);
				partitionClause();
				}
				break;
			case 11:
				_localctx = new AlterTableClauseFreezePartitionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(333);
				match(FREEZE);
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(334);
					partitionClause();
					}
				}

				}
				break;
			case 12:
				_localctx = new AlterTableClauseModifyCodecContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(337);
				match(MODIFY);
				setState(338);
				match(COLUMN);
				setState(341);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(339);
					match(IF);
					setState(340);
					match(EXISTS);
					}
					break;
				}
				setState(343);
				nestedIdentifier();
				setState(344);
				codecExpr();
				}
				break;
			case 13:
				_localctx = new AlterTableClauseModifyCommentContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(346);
				match(MODIFY);
				setState(347);
				match(COLUMN);
				setState(350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(348);
					match(IF);
					setState(349);
					match(EXISTS);
					}
					break;
				}
				setState(352);
				nestedIdentifier();
				setState(353);
				match(COMMENT);
				setState(354);
				match(STRING_LITERAL);
				}
				break;
			case 14:
				_localctx = new AlterTableClauseModifyRemoveContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(356);
				match(MODIFY);
				setState(357);
				match(COLUMN);
				setState(360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(358);
					match(IF);
					setState(359);
					match(EXISTS);
					}
					break;
				}
				setState(362);
				nestedIdentifier();
				setState(363);
				match(REMOVE);
				setState(364);
				tableColumnPropertyType();
				}
				break;
			case 15:
				_localctx = new AlterTableClauseModifyContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(366);
				match(MODIFY);
				setState(367);
				match(COLUMN);
				setState(370);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(368);
					match(IF);
					setState(369);
					match(EXISTS);
					}
					break;
				}
				setState(372);
				tableColumnDfnt();
				}
				break;
			case 16:
				_localctx = new AlterTableClauseModifyOrderByContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(373);
				match(MODIFY);
				setState(374);
				match(ORDER);
				setState(375);
				match(BY);
				setState(376);
				columnExpr(0);
				}
				break;
			case 17:
				_localctx = new AlterTableClauseModifyTTLContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(377);
				match(MODIFY);
				setState(378);
				ttlClause();
				}
				break;
			case 18:
				_localctx = new AlterTableClauseMovePartitionContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(379);
				match(MOVE);
				setState(380);
				partitionClause();
				setState(390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(381);
					match(TO);
					setState(382);
					match(DISK);
					setState(383);
					match(STRING_LITERAL);
					}
					break;
				case 2:
					{
					setState(384);
					match(TO);
					setState(385);
					match(VOLUME);
					setState(386);
					match(STRING_LITERAL);
					}
					break;
				case 3:
					{
					setState(387);
					match(TO);
					setState(388);
					match(TABLE);
					setState(389);
					tableIdentifier();
					}
					break;
				}
				}
				break;
			case 19:
				_localctx = new AlterTableClauseRemoveTTLContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(392);
				match(REMOVE);
				setState(393);
				match(TTL);
				}
				break;
			case 20:
				_localctx = new AlterTableClauseRenameContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(394);
				match(RENAME);
				setState(395);
				match(COLUMN);
				setState(398);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(396);
					match(IF);
					setState(397);
					match(EXISTS);
					}
					break;
				}
				setState(400);
				nestedIdentifier();
				setState(401);
				match(TO);
				setState(402);
				nestedIdentifier();
				}
				break;
			case 21:
				_localctx = new AlterTableClauseReplaceContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(404);
				match(REPLACE);
				setState(405);
				partitionClause();
				setState(406);
				match(FROM);
				setState(407);
				tableIdentifier();
				}
				break;
			case 22:
				_localctx = new AlterTableClauseUpdateContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(409);
				match(UPDATE);
				setState(410);
				assignmentExprList();
				setState(411);
				whereClause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExprListContext extends ParserRuleContext {
		public List<AssignmentExprContext> assignmentExpr() {
			return getRuleContexts(AssignmentExprContext.class);
		}
		public AssignmentExprContext assignmentExpr(int i) {
			return getRuleContext(AssignmentExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public AssignmentExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAssignmentExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExprListContext assignmentExprList() throws RecognitionException {
		AssignmentExprListContext _localctx = new AssignmentExprListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignmentExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			assignmentExpr();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(416);
				match(COMMA);
				setState(417);
				assignmentExpr();
				}
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExprContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AssignmentExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAssignmentExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExprContext assignmentExpr() throws RecognitionException {
		AssignmentExprContext _localctx = new AssignmentExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignmentExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			nestedIdentifier();
			setState(424);
			match(EQ_SINGLE);
			setState(425);
			columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableColumnPropertyTypeContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(ClickHouseParser.ALIAS, 0); }
		public TerminalNode CODEC() { return getToken(ClickHouseParser.CODEC, 0); }
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode DEFAULT() { return getToken(ClickHouseParser.DEFAULT, 0); }
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseParser.MATERIALIZED, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public TableColumnPropertyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumnPropertyType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableColumnPropertyType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableColumnPropertyTypeContext tableColumnPropertyType() throws RecognitionException {
		TableColumnPropertyTypeContext _localctx = new TableColumnPropertyTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tableColumnPropertyType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << CODEC) | (1L << COMMENT) | (1L << DEFAULT))) != 0) || _la==MATERIALIZED || _la==TTL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(ClickHouseParser.PARTITION, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(ClickHouseParser.ID, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public PartitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitPartitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionClauseContext partitionClause() throws RecognitionException {
		PartitionClauseContext _localctx = new PartitionClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_partitionClause);
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(PARTITION);
				setState(430);
				columnExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(PARTITION);
				setState(432);
				match(ID);
				setState(433);
				match(STRING_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttachStmtContext extends ParserRuleContext {
		public AttachStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attachStmt; }
	 
		public AttachStmtContext() { }
		public void copyFrom(AttachStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttachDictionaryStmtContext extends AttachStmtContext {
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public AttachDictionaryStmtContext(AttachStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAttachDictionaryStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttachStmtContext attachStmt() throws RecognitionException {
		AttachStmtContext _localctx = new AttachStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attachStmt);
		int _la;
		try {
			_localctx = new AttachDictionaryStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(ATTACH);
			setState(437);
			match(DICTIONARY);
			setState(438);
			tableIdentifier();
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(439);
				clusterClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckStmtContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(ClickHouseParser.CHECK, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public CheckStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCheckStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckStmtContext checkStmt() throws RecognitionException {
		CheckStmtContext _localctx = new CheckStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_checkStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(CHECK);
			setState(443);
			match(TABLE);
			setState(444);
			tableIdentifier();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(445);
				partitionClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateStmtContext extends ParserRuleContext {
		public CreateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createStmt; }
	 
		public CreateStmtContext() { }
		public void copyFrom(CreateStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateViewStmtContext extends CreateStmtContext {
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(ClickHouseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(ClickHouseParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public CreateViewStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateViewStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateDictionaryStmtContext extends CreateStmtContext {
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public DictionarySchemaClauseContext dictionarySchemaClause() {
			return getRuleContext(DictionarySchemaClauseContext.class,0);
		}
		public DictionaryEngineClauseContext dictionaryEngineClause() {
			return getRuleContext(DictionaryEngineClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public CreateDictionaryStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateDictionaryStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateDatabaseStmtContext extends CreateStmtContext {
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public EngineExprContext engineExpr() {
			return getRuleContext(EngineExprContext.class,0);
		}
		public CreateDatabaseStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateDatabaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateLiveViewStmtContext extends CreateStmtContext {
		public TerminalNode LIVE() { return getToken(ClickHouseParser.LIVE, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public TerminalNode TIMEOUT() { return getToken(ClickHouseParser.TIMEOUT, 0); }
		public DestinationClauseContext destinationClause() {
			return getRuleContext(DestinationClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public CreateLiveViewStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateLiveViewStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateMaterializedViewStmtContext extends CreateStmtContext {
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public DestinationClauseContext destinationClause() {
			return getRuleContext(DestinationClauseContext.class,0);
		}
		public EngineClauseContext engineClause() {
			return getRuleContext(EngineClauseContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public TerminalNode POPULATE() { return getToken(ClickHouseParser.POPULATE, 0); }
		public CreateMaterializedViewStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateMaterializedViewStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableStmtContext extends CreateStmtContext {
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public EngineClauseContext engineClause() {
			return getRuleContext(EngineClauseContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public CreateTableStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateStmtContext createStmt() throws RecognitionException {
		CreateStmtContext _localctx = new CreateStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_createStmt);
		int _la;
		try {
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				_localctx = new CreateDatabaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(449);
				match(DATABASE);
				setState(453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(450);
					match(IF);
					setState(451);
					match(NOT);
					setState(452);
					match(EXISTS);
					}
					break;
				}
				setState(455);
				databaseIdentifier();
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(456);
					clusterClause();
					}
				}

				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENGINE) {
					{
					setState(459);
					engineExpr();
					}
				}

				}
				break;
			case 2:
				_localctx = new CreateDictionaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(463);
				match(DICTIONARY);
				setState(467);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(464);
					match(IF);
					setState(465);
					match(NOT);
					setState(466);
					match(EXISTS);
					}
					break;
				}
				setState(469);
				tableIdentifier();
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UUID) {
					{
					setState(470);
					uuidClause();
					}
				}

				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(473);
					clusterClause();
					}
				}

				setState(476);
				dictionarySchemaClause();
				setState(477);
				dictionaryEngineClause();
				}
				break;
			case 3:
				_localctx = new CreateLiveViewStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(479);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(480);
				match(LIVE);
				setState(481);
				match(VIEW);
				setState(485);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(482);
					match(IF);
					setState(483);
					match(NOT);
					setState(484);
					match(EXISTS);
					}
					break;
				}
				setState(487);
				tableIdentifier();
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UUID) {
					{
					setState(488);
					uuidClause();
					}
				}

				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(491);
					clusterClause();
					}
				}

				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(494);
					match(WITH);
					setState(495);
					match(TIMEOUT);
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DECIMAL_LITERAL) {
						{
						setState(496);
						match(DECIMAL_LITERAL);
						}
					}

					}
				}

				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(501);
					destinationClause();
					}
				}

				setState(505);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(504);
					tableSchemaClause();
					}
					break;
				}
				setState(507);
				subqueryClause();
				}
				break;
			case 4:
				_localctx = new CreateMaterializedViewStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(509);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(510);
				match(MATERIALIZED);
				setState(511);
				match(VIEW);
				setState(515);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(512);
					match(IF);
					setState(513);
					match(NOT);
					setState(514);
					match(EXISTS);
					}
					break;
				}
				setState(517);
				tableIdentifier();
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UUID) {
					{
					setState(518);
					uuidClause();
					}
				}

				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(521);
					clusterClause();
					}
				}

				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==LPAREN) {
					{
					setState(524);
					tableSchemaClause();
					}
				}

				setState(532);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TO:
					{
					setState(527);
					destinationClause();
					}
					break;
				case ENGINE:
					{
					setState(528);
					engineClause();
					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==POPULATE) {
						{
						setState(529);
						match(POPULATE);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(534);
				subqueryClause();
				}
				break;
			case 5:
				_localctx = new CreateTableStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(536);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(537);
					match(TEMPORARY);
					}
				}

				setState(540);
				match(TABLE);
				setState(544);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(541);
					match(IF);
					setState(542);
					match(NOT);
					setState(543);
					match(EXISTS);
					}
					break;
				}
				setState(546);
				tableIdentifier();
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UUID) {
					{
					setState(547);
					uuidClause();
					}
				}

				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(550);
					clusterClause();
					}
				}

				setState(554);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(553);
					tableSchemaClause();
					}
					break;
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENGINE) {
					{
					setState(556);
					engineClause();
					}
				}

				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(559);
					subqueryClause();
					}
				}

				}
				break;
			case 6:
				_localctx = new CreateViewStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(562);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(563);
					match(OR);
					setState(564);
					match(REPLACE);
					}
				}

				setState(567);
				match(VIEW);
				setState(571);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(568);
					match(IF);
					setState(569);
					match(NOT);
					setState(570);
					match(EXISTS);
					}
					break;
				}
				setState(573);
				tableIdentifier();
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UUID) {
					{
					setState(574);
					uuidClause();
					}
				}

				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(577);
					clusterClause();
					}
				}

				setState(581);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(580);
					tableSchemaClause();
					}
					break;
				}
				setState(583);
				subqueryClause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionarySchemaClauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<DictionaryAttrDfntContext> dictionaryAttrDfnt() {
			return getRuleContexts(DictionaryAttrDfntContext.class);
		}
		public DictionaryAttrDfntContext dictionaryAttrDfnt(int i) {
			return getRuleContext(DictionaryAttrDfntContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public DictionarySchemaClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionarySchemaClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionarySchemaClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionarySchemaClauseContext dictionarySchemaClause() throws RecognitionException {
		DictionarySchemaClauseContext _localctx = new DictionarySchemaClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dictionarySchemaClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(LPAREN);
			setState(588);
			dictionaryAttrDfnt();
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(589);
				match(COMMA);
				setState(590);
				dictionaryAttrDfnt();
				}
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(596);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryAttrDfntContext extends ParserRuleContext {
		public Set<String> attrs = new HashSet();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(ClickHouseParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(ClickHouseParser.DEFAULT, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> EXPRESSION() { return getTokens(ClickHouseParser.EXPRESSION); }
		public TerminalNode EXPRESSION(int i) {
			return getToken(ClickHouseParser.EXPRESSION, i);
		}
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public List<TerminalNode> HIERARCHICAL() { return getTokens(ClickHouseParser.HIERARCHICAL); }
		public TerminalNode HIERARCHICAL(int i) {
			return getToken(ClickHouseParser.HIERARCHICAL, i);
		}
		public List<TerminalNode> INJECTIVE() { return getTokens(ClickHouseParser.INJECTIVE); }
		public TerminalNode INJECTIVE(int i) {
			return getToken(ClickHouseParser.INJECTIVE, i);
		}
		public List<TerminalNode> IS_OBJECT_ID() { return getTokens(ClickHouseParser.IS_OBJECT_ID); }
		public TerminalNode IS_OBJECT_ID(int i) {
			return getToken(ClickHouseParser.IS_OBJECT_ID, i);
		}
		public DictionaryAttrDfntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryAttrDfnt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionaryAttrDfnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryAttrDfntContext dictionaryAttrDfnt() throws RecognitionException {
		DictionaryAttrDfntContext _localctx = new DictionaryAttrDfntContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dictionaryAttrDfnt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			identifier();
			setState(599);
			columnTypeExpr();
			setState(621);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(619);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(600);
						if (!(!_localctx.attrs.contains("default"))) throw new FailedPredicateException(this, "!$attrs.count(\"default\")");
						setState(601);
						match(DEFAULT);
						setState(602);
						literal();
						_localctx.attrs.add("default");
						}
						break;
					case 2:
						{
						setState(605);
						if (!(!_localctx.attrs.contains("expression"))) throw new FailedPredicateException(this, "!$attrs.count(\"expression\")");
						setState(606);
						match(EXPRESSION);
						setState(607);
						columnExpr(0);
						_localctx.attrs.add("expression");
						}
						break;
					case 3:
						{
						setState(610);
						if (!(!_localctx.attrs.contains("hierarchical"))) throw new FailedPredicateException(this, "!$attrs.count(\"hierarchical\")");
						setState(611);
						match(HIERARCHICAL);
						_localctx.attrs.add("hierarchical");
						}
						break;
					case 4:
						{
						setState(613);
						if (!(!_localctx.attrs.contains("injective"))) throw new FailedPredicateException(this, "!$attrs.count(\"injective\")");
						setState(614);
						match(INJECTIVE);
						_localctx.attrs.add("injective");
						}
						break;
					case 5:
						{
						setState(616);
						if (!(!_localctx.attrs.contains("is_object_id"))) throw new FailedPredicateException(this, "!$attrs.count(\"is_object_id\")");
						setState(617);
						match(IS_OBJECT_ID);
						_localctx.attrs.add("is_object_id");
						}
						break;
					}
					}
				}
				setState(623);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryEngineClauseContext extends ParserRuleContext {
		public Set<String> clauses = new HashSet<>();
		public DictionaryPrimaryKeyClauseContext dictionaryPrimaryKeyClause() {
			return getRuleContext(DictionaryPrimaryKeyClauseContext.class,0);
		}
		public List<SourceClauseContext> sourceClause() {
			return getRuleContexts(SourceClauseContext.class);
		}
		public SourceClauseContext sourceClause(int i) {
			return getRuleContext(SourceClauseContext.class,i);
		}
		public List<LifetimeClauseContext> lifetimeClause() {
			return getRuleContexts(LifetimeClauseContext.class);
		}
		public LifetimeClauseContext lifetimeClause(int i) {
			return getRuleContext(LifetimeClauseContext.class,i);
		}
		public List<LayoutClauseContext> layoutClause() {
			return getRuleContexts(LayoutClauseContext.class);
		}
		public LayoutClauseContext layoutClause(int i) {
			return getRuleContext(LayoutClauseContext.class,i);
		}
		public List<RangeClauseContext> rangeClause() {
			return getRuleContexts(RangeClauseContext.class);
		}
		public RangeClauseContext rangeClause(int i) {
			return getRuleContext(RangeClauseContext.class,i);
		}
		public List<DictionarySettingsClauseContext> dictionarySettingsClause() {
			return getRuleContexts(DictionarySettingsClauseContext.class);
		}
		public DictionarySettingsClauseContext dictionarySettingsClause(int i) {
			return getRuleContext(DictionarySettingsClauseContext.class,i);
		}
		public DictionaryEngineClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryEngineClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionaryEngineClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryEngineClauseContext dictionaryEngineClause() throws RecognitionException {
		DictionaryEngineClauseContext _localctx = new DictionaryEngineClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dictionaryEngineClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(624);
				dictionaryPrimaryKeyClause();
				}
				break;
			}
			setState(649);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(647);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						setState(627);
						if (!(!_localctx.clauses.contains("source"))) throw new FailedPredicateException(this, "!$clauses.contains(\"source\")");
						setState(628);
						sourceClause();
						_localctx.clauses.add("source");
						}
						break;
					case 2:
						{
						setState(631);
						if (!(!_localctx.clauses.contains("lifetime"))) throw new FailedPredicateException(this, "!$clauses.contains(\"lifetime\")");
						setState(632);
						lifetimeClause();
						_localctx.clauses.add("lifetime");
						}
						break;
					case 3:
						{
						setState(635);
						if (!(!_localctx.clauses.contains("layout"))) throw new FailedPredicateException(this, "!$clauses.contains(\"layout\")");
						setState(636);
						layoutClause();
						_localctx.clauses.add("layout");
						}
						break;
					case 4:
						{
						setState(639);
						if (!(!_localctx.clauses.contains("range"))) throw new FailedPredicateException(this, "!$clauses.contains(\"range\")");
						setState(640);
						rangeClause();
						_localctx.clauses.add("range");
						}
						break;
					case 5:
						{
						setState(643);
						if (!(!_localctx.clauses.contains("settings"))) throw new FailedPredicateException(this, "!$clauses.contains(\"settings\")");
						setState(644);
						dictionarySettingsClause();
						_localctx.clauses.add("settings");
						}
						break;
					}
					}
				}
				setState(651);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryPrimaryKeyClauseContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ClickHouseParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseParser.KEY, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public DictionaryPrimaryKeyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryPrimaryKeyClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionaryPrimaryKeyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryPrimaryKeyClauseContext dictionaryPrimaryKeyClause() throws RecognitionException {
		DictionaryPrimaryKeyClauseContext _localctx = new DictionaryPrimaryKeyClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dictionaryPrimaryKeyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(PRIMARY);
			setState(653);
			match(KEY);
			setState(654);
			columnExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryArgExprContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public DictionaryArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryArgExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionaryArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryArgExprContext dictionaryArgExpr() throws RecognitionException {
		DictionaryArgExprContext _localctx = new DictionaryArgExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dictionaryArgExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			identifier();
			setState(663);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AFTER:
			case ALIAS:
			case ALL:
			case ALTER:
			case AND:
			case ANTI:
			case ANY:
			case ARRAY:
			case AS:
			case ASCENDING:
			case ASOF:
			case ASYNC:
			case ATTACH:
			case BETWEEN:
			case BOTH:
			case BY:
			case CASE:
			case CAST:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CODEC:
			case COLLATE:
			case COLUMN:
			case COMMENT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CUBE:
			case DATABASE:
			case DATABASES:
			case DATE:
			case DAY:
			case DEDUPLICATE:
			case DEFAULT:
			case DELAY:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DESCRIBE:
			case DETACH:
			case DICTIONARIES:
			case DICTIONARY:
			case DISK:
			case DISTINCT:
			case DISTRIBUTED:
			case DROP:
			case ELSE:
			case END:
			case ENGINE:
			case EVENTS:
			case EXISTS:
			case EXPLAIN:
			case EXPRESSION:
			case EXTRACT:
			case FETCHES:
			case FINAL:
			case FIRST:
			case FLUSH:
			case FOR:
			case FORMAT:
			case FREEZE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GLOBAL:
			case GRANULARITY:
			case GROUP:
			case HAVING:
			case HIERARCHICAL:
			case HOUR:
			case ID:
			case IF:
			case ILIKE:
			case IN:
			case INDEX:
			case INJECTIVE:
			case INNER:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case IS_OBJECT_ID:
			case JOIN:
			case KEY:
			case KILL:
			case LAST:
			case LAYOUT:
			case LEADING:
			case LEFT:
			case LIFETIME:
			case LIKE:
			case LIMIT:
			case LIVE:
			case LOCAL:
			case LOGS:
			case MATERIALIZED:
			case MAX:
			case MERGES:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MOVE:
			case MUTATION:
			case NO:
			case NOT:
			case NULLS:
			case OFFSET:
			case ON:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case OUTER:
			case OUTFILE:
			case PARTITION:
			case POPULATE:
			case PREWHERE:
			case PRIMARY:
			case QUARTER:
			case RANGE:
			case RELOAD:
			case REMOVE:
			case RENAME:
			case REPLACE:
			case REPLICA:
			case REPLICATED:
			case RIGHT:
			case ROLLUP:
			case SAMPLE:
			case SECOND:
			case SELECT:
			case SEMI:
			case SENDS:
			case SET:
			case SETTINGS:
			case SHOW:
			case SOURCE:
			case START:
			case STOP:
			case SUBSTRING:
			case SYNC:
			case SYNTAX:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TEMPORARY:
			case TEST:
			case THEN:
			case TIES:
			case TIMEOUT:
			case TIMESTAMP:
			case TO:
			case TOP:
			case TOTALS:
			case TRAILING:
			case TRIM:
			case TRUNCATE:
			case TTL:
			case TYPE:
			case UNION:
			case UPDATE:
			case USE:
			case USING:
			case UUID:
			case VALUES:
			case VIEW:
			case VOLUME:
			case WATCH:
			case WEEK:
			case WHEN:
			case WHERE:
			case WITH:
			case YEAR:
			case JSON_FALSE:
			case JSON_TRUE:
			case IDENTIFIER:
				{
				setState(657);
				identifier();
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(658);
					match(LPAREN);
					setState(659);
					match(RPAREN);
					}
				}

				}
				break;
			case INF:
			case NAN_SQL:
			case NULL_SQL:
			case FLOATING_LITERAL:
			case OCTAL_LITERAL:
			case DECIMAL_LITERAL:
			case HEXADECIMAL_LITERAL:
			case STRING_LITERAL:
			case DASH:
			case DOT:
			case PLUS:
				{
				setState(662);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceClauseContext extends ParserRuleContext {
		public TerminalNode SOURCE() { return getToken(ClickHouseParser.SOURCE, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ClickHouseParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ClickHouseParser.LPAREN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ClickHouseParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ClickHouseParser.RPAREN, i);
		}
		public List<DictionaryArgExprContext> dictionaryArgExpr() {
			return getRuleContexts(DictionaryArgExprContext.class);
		}
		public DictionaryArgExprContext dictionaryArgExpr(int i) {
			return getRuleContext(DictionaryArgExprContext.class,i);
		}
		public SourceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSourceClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceClauseContext sourceClause() throws RecognitionException {
		SourceClauseContext _localctx = new SourceClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sourceClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(SOURCE);
			setState(666);
			match(LPAREN);
			setState(667);
			identifier();
			setState(668);
			match(LPAREN);
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT) | (1L << FREEZE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (QUARTER - 64)) | (1L << (RANGE - 64)) | (1L << (RELOAD - 64)) | (1L << (REMOVE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)))) != 0)) {
				{
				{
				setState(669);
				dictionaryArgExpr();
				}
				}
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(675);
			match(RPAREN);
			setState(676);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LifetimeClauseContext extends ParserRuleContext {
		public TerminalNode LIFETIME() { return getToken(ClickHouseParser.LIFETIME, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> DECIMAL_LITERAL() { return getTokens(ClickHouseParser.DECIMAL_LITERAL); }
		public TerminalNode DECIMAL_LITERAL(int i) {
			return getToken(ClickHouseParser.DECIMAL_LITERAL, i);
		}
		public TerminalNode MIN() { return getToken(ClickHouseParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(ClickHouseParser.MAX, 0); }
		public LifetimeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lifetimeClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLifetimeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LifetimeClauseContext lifetimeClause() throws RecognitionException {
		LifetimeClauseContext _localctx = new LifetimeClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lifetimeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(LIFETIME);
			setState(679);
			match(LPAREN);
			setState(689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				{
				setState(680);
				match(DECIMAL_LITERAL);
				}
				break;
			case MIN:
				{
				setState(681);
				match(MIN);
				setState(682);
				match(DECIMAL_LITERAL);
				setState(683);
				match(MAX);
				setState(684);
				match(DECIMAL_LITERAL);
				}
				break;
			case MAX:
				{
				setState(685);
				match(MAX);
				setState(686);
				match(DECIMAL_LITERAL);
				setState(687);
				match(MIN);
				setState(688);
				match(DECIMAL_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(691);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LayoutClauseContext extends ParserRuleContext {
		public TerminalNode LAYOUT() { return getToken(ClickHouseParser.LAYOUT, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ClickHouseParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ClickHouseParser.LPAREN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ClickHouseParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ClickHouseParser.RPAREN, i);
		}
		public List<DictionaryArgExprContext> dictionaryArgExpr() {
			return getRuleContexts(DictionaryArgExprContext.class);
		}
		public DictionaryArgExprContext dictionaryArgExpr(int i) {
			return getRuleContext(DictionaryArgExprContext.class,i);
		}
		public LayoutClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layoutClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLayoutClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayoutClauseContext layoutClause() throws RecognitionException {
		LayoutClauseContext _localctx = new LayoutClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_layoutClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(LAYOUT);
			setState(694);
			match(LPAREN);
			setState(695);
			identifier();
			setState(696);
			match(LPAREN);
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT) | (1L << FREEZE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (QUARTER - 64)) | (1L << (RANGE - 64)) | (1L << (RELOAD - 64)) | (1L << (REMOVE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)))) != 0)) {
				{
				{
				setState(697);
				dictionaryArgExpr();
				}
				}
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(703);
			match(RPAREN);
			setState(704);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeClauseContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(ClickHouseParser.RANGE, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TerminalNode MIN() { return getToken(ClickHouseParser.MIN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode MAX() { return getToken(ClickHouseParser.MAX, 0); }
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitRangeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rangeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(RANGE);
			setState(707);
			match(LPAREN);
			setState(718);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIN:
				{
				setState(708);
				match(MIN);
				setState(709);
				identifier();
				setState(710);
				match(MAX);
				setState(711);
				identifier();
				}
				break;
			case MAX:
				{
				setState(713);
				match(MAX);
				setState(714);
				identifier();
				setState(715);
				match(MIN);
				setState(716);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(720);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionarySettingsClauseContext extends ParserRuleContext {
		public TerminalNode SETTINGS() { return getToken(ClickHouseParser.SETTINGS, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SettingExprListContext settingExprList() {
			return getRuleContext(SettingExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public DictionarySettingsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionarySettingsClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionarySettingsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionarySettingsClauseContext dictionarySettingsClause() throws RecognitionException {
		DictionarySettingsClauseContext _localctx = new DictionarySettingsClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dictionarySettingsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(SETTINGS);
			setState(723);
			match(LPAREN);
			setState(724);
			settingExprList();
			setState(725);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClusterClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(ClickHouseParser.ON, 0); }
		public TerminalNode CLUSTER() { return getToken(ClickHouseParser.CLUSTER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public ClusterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clusterClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitClusterClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClusterClauseContext clusterClause() throws RecognitionException {
		ClusterClauseContext _localctx = new ClusterClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_clusterClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(ON);
			setState(728);
			match(CLUSTER);
			setState(731);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AFTER:
			case ALIAS:
			case ALL:
			case ALTER:
			case AND:
			case ANTI:
			case ANY:
			case ARRAY:
			case AS:
			case ASCENDING:
			case ASOF:
			case ASYNC:
			case ATTACH:
			case BETWEEN:
			case BOTH:
			case BY:
			case CASE:
			case CAST:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CODEC:
			case COLLATE:
			case COLUMN:
			case COMMENT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CUBE:
			case DATABASE:
			case DATABASES:
			case DATE:
			case DAY:
			case DEDUPLICATE:
			case DEFAULT:
			case DELAY:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DESCRIBE:
			case DETACH:
			case DICTIONARIES:
			case DICTIONARY:
			case DISK:
			case DISTINCT:
			case DISTRIBUTED:
			case DROP:
			case ELSE:
			case END:
			case ENGINE:
			case EVENTS:
			case EXISTS:
			case EXPLAIN:
			case EXPRESSION:
			case EXTRACT:
			case FETCHES:
			case FINAL:
			case FIRST:
			case FLUSH:
			case FOR:
			case FORMAT:
			case FREEZE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GLOBAL:
			case GRANULARITY:
			case GROUP:
			case HAVING:
			case HIERARCHICAL:
			case HOUR:
			case ID:
			case IF:
			case ILIKE:
			case IN:
			case INDEX:
			case INJECTIVE:
			case INNER:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case IS_OBJECT_ID:
			case JOIN:
			case KEY:
			case KILL:
			case LAST:
			case LAYOUT:
			case LEADING:
			case LEFT:
			case LIFETIME:
			case LIKE:
			case LIMIT:
			case LIVE:
			case LOCAL:
			case LOGS:
			case MATERIALIZED:
			case MAX:
			case MERGES:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MOVE:
			case MUTATION:
			case NO:
			case NOT:
			case NULLS:
			case OFFSET:
			case ON:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case OUTER:
			case OUTFILE:
			case PARTITION:
			case POPULATE:
			case PREWHERE:
			case PRIMARY:
			case QUARTER:
			case RANGE:
			case RELOAD:
			case REMOVE:
			case RENAME:
			case REPLACE:
			case REPLICA:
			case REPLICATED:
			case RIGHT:
			case ROLLUP:
			case SAMPLE:
			case SECOND:
			case SELECT:
			case SEMI:
			case SENDS:
			case SET:
			case SETTINGS:
			case SHOW:
			case SOURCE:
			case START:
			case STOP:
			case SUBSTRING:
			case SYNC:
			case SYNTAX:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TEMPORARY:
			case TEST:
			case THEN:
			case TIES:
			case TIMEOUT:
			case TIMESTAMP:
			case TO:
			case TOP:
			case TOTALS:
			case TRAILING:
			case TRIM:
			case TRUNCATE:
			case TTL:
			case TYPE:
			case UNION:
			case UPDATE:
			case USE:
			case USING:
			case UUID:
			case VALUES:
			case VIEW:
			case VOLUME:
			case WATCH:
			case WEEK:
			case WHEN:
			case WHERE:
			case WITH:
			case YEAR:
			case JSON_FALSE:
			case JSON_TRUE:
			case IDENTIFIER:
				{
				setState(729);
				identifier();
				}
				break;
			case STRING_LITERAL:
				{
				setState(730);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UuidClauseContext extends ParserRuleContext {
		public TerminalNode UUID() { return getToken(ClickHouseParser.UUID, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public UuidClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uuidClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitUuidClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UuidClauseContext uuidClause() throws RecognitionException {
		UuidClauseContext _localctx = new UuidClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_uuidClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(UUID);
			setState(734);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DestinationClauseContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public DestinationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destinationClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDestinationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestinationClauseContext destinationClause() throws RecognitionException {
		DestinationClauseContext _localctx = new DestinationClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_destinationClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(TO);
			setState(737);
			tableIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryClauseContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public SubqueryClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subqueryClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSubqueryClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryClauseContext subqueryClause() throws RecognitionException {
		SubqueryClauseContext _localctx = new SubqueryClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_subqueryClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			match(AS);
			setState(740);
			selectUnionStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableSchemaClauseContext extends ParserRuleContext {
		public TableSchemaClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSchemaClause; }

		public TableSchemaClauseContext() { }
		public void copyFrom(TableSchemaClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SchemaAsTableClauseContext extends TableSchemaClauseContext {
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SchemaAsTableClauseContext(TableSchemaClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSchemaAsTableClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SchemaAsFunctionClauseContext extends TableSchemaClauseContext {
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public SchemaAsFunctionClauseContext(TableSchemaClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSchemaAsFunctionClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SchemaDescriptionClauseContext extends TableSchemaClauseContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<TableElementExprContext> tableElementExpr() {
			return getRuleContexts(TableElementExprContext.class);
		}
		public TableElementExprContext tableElementExpr(int i) {
			return getRuleContext(TableElementExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public SchemaDescriptionClauseContext(TableSchemaClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSchemaDescriptionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableSchemaClauseContext tableSchemaClause() throws RecognitionException {
		TableSchemaClauseContext _localctx = new TableSchemaClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tableSchemaClause);
		int _la;
		try {
			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				_localctx = new SchemaDescriptionClauseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				match(LPAREN);
				setState(743);
				tableElementExpr();
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(744);
					match(COMMA);
					setState(745);
					tableElementExpr();
					}
					}
					setState(750);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(751);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new SchemaAsTableClauseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				match(AS);
				setState(754);
				tableIdentifier();
				}
				break;
			case 3:
				_localctx = new SchemaAsFunctionClauseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(755);
				match(AS);
				setState(756);
				tableFunctionExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EngineClauseContext extends ParserRuleContext {
		public Set<String> clauses = new HashSet();
		public EngineExprContext engineExpr() {
			return getRuleContext(EngineExprContext.class,0);
		}
		public List<OrderByClauseContext> orderByClause() {
			return getRuleContexts(OrderByClauseContext.class);
		}
		public OrderByClauseContext orderByClause(int i) {
			return getRuleContext(OrderByClauseContext.class,i);
		}
		public List<PartitionByClauseContext> partitionByClause() {
			return getRuleContexts(PartitionByClauseContext.class);
		}
		public PartitionByClauseContext partitionByClause(int i) {
			return getRuleContext(PartitionByClauseContext.class,i);
		}
		public List<PrimaryKeyClauseContext> primaryKeyClause() {
			return getRuleContexts(PrimaryKeyClauseContext.class);
		}
		public PrimaryKeyClauseContext primaryKeyClause(int i) {
			return getRuleContext(PrimaryKeyClauseContext.class,i);
		}
		public List<SampleByClauseContext> sampleByClause() {
			return getRuleContexts(SampleByClauseContext.class);
		}
		public SampleByClauseContext sampleByClause(int i) {
			return getRuleContext(SampleByClauseContext.class,i);
		}
		public List<TtlClauseContext> ttlClause() {
			return getRuleContexts(TtlClauseContext.class);
		}
		public TtlClauseContext ttlClause(int i) {
			return getRuleContext(TtlClauseContext.class,i);
		}
		public List<SettingsClauseContext> settingsClause() {
			return getRuleContexts(SettingsClauseContext.class);
		}
		public SettingsClauseContext settingsClause(int i) {
			return getRuleContext(SettingsClauseContext.class,i);
		}
		public EngineClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engineClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitEngineClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EngineClauseContext engineClause() throws RecognitionException {
		EngineClauseContext _localctx = new EngineClauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_engineClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			engineExpr();
			setState(786);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(784);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						setState(760);
						if (!(!_localctx.clauses.contains("orderByClause"))) throw new FailedPredicateException(this, "!$clauses.contains(\"orderByClause\")");
						setState(761);
						orderByClause();
						_localctx.clauses.add("orderByClause");
						}
						break;
					case 2:
						{
						setState(764);
						if (!(!_localctx.clauses.contains("partitionByClause"))) throw new FailedPredicateException(this, "!$clauses.contains(\"partitionByClause\")");
						setState(765);
						partitionByClause();
						_localctx.clauses.add("partitionByClause");
						}
						break;
					case 3:
						{
						setState(768);
						if (!(!_localctx.clauses.contains("primaryKeyClause"))) throw new FailedPredicateException(this, "!$clauses.contains(\"primaryKeyClause\")");
						setState(769);
						primaryKeyClause();
						_localctx.clauses.add("primaryKeyClause");
						}
						break;
					case 4:
						{
						setState(772);
						if (!(!_localctx.clauses.contains("sampleByClause"))) throw new FailedPredicateException(this, "!$clauses.contains(\"sampleByClause\")");
						setState(773);
						sampleByClause();
						_localctx.clauses.add("sampleByClause");
						}
						break;
					case 5:
						{
						setState(776);
						if (!(!_localctx.clauses.contains("ttlClause"))) throw new FailedPredicateException(this, "!$clauses.contains(\"ttlClause\")");
						setState(777);
						ttlClause();
						_localctx.clauses.add("ttlClause");
						}
						break;
					case 6:
						{
						setState(780);
						if (!(!_localctx.clauses.contains("settingsClause"))) throw new FailedPredicateException(this, "!$clauses.contains(\"settingsClause\")");
						setState(781);
						settingsClause();
						_localctx.clauses.add("settingsClause");
						}
						break;
					}
					}
				}
				setState(788);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionByClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(ClickHouseParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public PartitionByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitPartitionByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionByClauseContext partitionByClause() throws RecognitionException {
		PartitionByClauseContext _localctx = new PartitionByClauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_partitionByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(PARTITION);
			setState(790);
			match(BY);
			setState(791);
			columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryKeyClauseContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ClickHouseParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseParser.KEY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public PrimaryKeyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitPrimaryKeyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyClauseContext primaryKeyClause() throws RecognitionException {
		PrimaryKeyClauseContext _localctx = new PrimaryKeyClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_primaryKeyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(PRIMARY);
			setState(794);
			match(KEY);
			setState(795);
			columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleByClauseContext extends ParserRuleContext {
		public TerminalNode SAMPLE() { return getToken(ClickHouseParser.SAMPLE, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public SampleByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSampleByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleByClauseContext sampleByClause() throws RecognitionException {
		SampleByClauseContext _localctx = new SampleByClauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_sampleByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(SAMPLE);
			setState(798);
			match(BY);
			setState(799);
			columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TtlClauseContext extends ParserRuleContext {
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public List<TtlExprContext> ttlExpr() {
			return getRuleContexts(TtlExprContext.class);
		}
		public TtlExprContext ttlExpr(int i) {
			return getRuleContext(TtlExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public TtlClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ttlClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTtlClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TtlClauseContext ttlClause() throws RecognitionException {
		TtlClauseContext _localctx = new TtlClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ttlClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(TTL);
			setState(802);
			ttlExpr();
			setState(807);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(803);
					match(COMMA);
					setState(804);
					ttlExpr();
					}
					}
				}
				setState(809);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EngineExprContext extends ParserRuleContext {
		public TerminalNode ENGINE() { return getToken(ClickHouseParser.ENGINE, 0); }
		public IdentifierOrNullContext identifierOrNull() {
			return getRuleContext(IdentifierOrNullContext.class,0);
		}
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public EngineExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engineExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitEngineExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EngineExprContext engineExpr() throws RecognitionException {
		EngineExprContext _localctx = new EngineExprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_engineExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(ENGINE);
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_SINGLE) {
				{
				setState(811);
				match(EQ_SINGLE);
				}
			}

			setState(814);
			identifierOrNull();
			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(815);
				match(LPAREN);
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT) | (1L << FREEZE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (QUARTER - 64)) | (1L << (RANGE - 64)) | (1L << (RELOAD - 64)) | (1L << (REMOVE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (FLOATING_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (ASTERISK - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (DASH - 194)) | (1L << (DOT - 194)) | (1L << (LBRACKET - 194)) | (1L << (LPAREN - 194)) | (1L << (PLUS - 194)))) != 0)) {
					{
					setState(816);
					columnExprList();
					}
				}

				setState(819);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableElementExprContext extends ParserRuleContext {
		public TableElementExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElementExpr; }

		public TableElementExprContext() { }
		public void copyFrom(TableElementExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableElementExprConstraintContext extends TableElementExprContext {
		public TerminalNode CONSTRAINT() { return getToken(ClickHouseParser.CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(ClickHouseParser.CHECK, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TableElementExprConstraintContext(TableElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableElementExprConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableElementExprColumnContext extends TableElementExprContext {
		public TableColumnDfntContext tableColumnDfnt() {
			return getRuleContext(TableColumnDfntContext.class,0);
		}
		public TableElementExprColumnContext(TableElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableElementExprColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableElementExprIndexContext extends TableElementExprContext {
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public TableIndexDfntContext tableIndexDfnt() {
			return getRuleContext(TableIndexDfntContext.class,0);
		}
		public TableElementExprIndexContext(TableElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableElementExprIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableElementExprContext tableElementExpr() throws RecognitionException {
		TableElementExprContext _localctx = new TableElementExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tableElementExpr);
		try {
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				_localctx = new TableElementExprColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				tableColumnDfnt();
				}
				break;
			case 2:
				_localctx = new TableElementExprConstraintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(823);
				match(CONSTRAINT);
				setState(824);
				identifier();
				setState(825);
				match(CHECK);
				setState(826);
				columnExpr(0);
				}
				break;
			case 3:
				_localctx = new TableElementExprIndexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(828);
				match(INDEX);
				setState(829);
				tableIndexDfnt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableColumnDfntContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public TableColumnPropertyExprContext tableColumnPropertyExpr() {
			return getRuleContext(TableColumnPropertyExprContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public CodecExprContext codecExpr() {
			return getRuleContext(CodecExprContext.class,0);
		}
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TableColumnDfntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumnDfnt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableColumnDfnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableColumnDfntContext tableColumnDfnt() throws RecognitionException {
		TableColumnDfntContext _localctx = new TableColumnDfntContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tableColumnDfnt);
		int _la;
		try {
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				nestedIdentifier();
				setState(833);
				columnTypeExpr();
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIAS || _la==DEFAULT || _la==MATERIALIZED) {
					{
					setState(834);
					tableColumnPropertyExpr();
					}
				}

				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(837);
					match(COMMENT);
					setState(838);
					match(STRING_LITERAL);
					}
				}

				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODEC) {
					{
					setState(841);
					codecExpr();
					}
				}

				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TTL) {
					{
					setState(844);
					match(TTL);
					setState(845);
					columnExpr(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(848);
				nestedIdentifier();
				setState(850);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(849);
					columnTypeExpr();
					}
					break;
				}
				setState(852);
				tableColumnPropertyExpr();
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(853);
					match(COMMENT);
					setState(854);
					match(STRING_LITERAL);
					}
				}

				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODEC) {
					{
					setState(857);
					codecExpr();
					}
				}

				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TTL) {
					{
					setState(860);
					match(TTL);
					setState(861);
					columnExpr(0);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableColumnPropertyExprContext extends ParserRuleContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(ClickHouseParser.DEFAULT, 0); }
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseParser.MATERIALIZED, 0); }
		public TerminalNode ALIAS() { return getToken(ClickHouseParser.ALIAS, 0); }
		public TableColumnPropertyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumnPropertyExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableColumnPropertyExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableColumnPropertyExprContext tableColumnPropertyExpr() throws RecognitionException {
		TableColumnPropertyExprContext _localctx = new TableColumnPropertyExprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tableColumnPropertyExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			_la = _input.LA(1);
			if ( !(_la==ALIAS || _la==DEFAULT || _la==MATERIALIZED) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(867);
			columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIndexDfntContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(ClickHouseParser.TYPE, 0); }
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public TerminalNode GRANULARITY() { return getToken(ClickHouseParser.GRANULARITY, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public TableIndexDfntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIndexDfnt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableIndexDfnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIndexDfntContext tableIndexDfnt() throws RecognitionException {
		TableIndexDfntContext _localctx = new TableIndexDfntContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tableIndexDfnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			nestedIdentifier();
			setState(870);
			columnExpr(0);
			setState(871);
			match(TYPE);
			setState(872);
			columnTypeExpr();
			setState(873);
			match(GRANULARITY);
			setState(874);
			match(DECIMAL_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodecExprContext extends ParserRuleContext {
		public TerminalNode CODEC() { return getToken(ClickHouseParser.CODEC, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<CodecArgExprContext> codecArgExpr() {
			return getRuleContexts(CodecArgExprContext.class);
		}
		public CodecArgExprContext codecArgExpr(int i) {
			return getRuleContext(CodecArgExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public CodecExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codecExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCodecExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodecExprContext codecExpr() throws RecognitionException {
		CodecExprContext _localctx = new CodecExprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_codecExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(CODEC);
			setState(877);
			match(LPAREN);
			setState(878);
			codecArgExpr();
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(879);
				match(COMMA);
				setState(880);
				codecArgExpr();
				}
				}
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(886);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodecArgExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public CodecArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codecArgExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCodecArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodecArgExprContext codecArgExpr() throws RecognitionException {
		CodecArgExprContext _localctx = new CodecArgExprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_codecArgExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			identifier();
			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(889);
				match(LPAREN);
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT) | (1L << FREEZE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (QUARTER - 64)) | (1L << (RANGE - 64)) | (1L << (RELOAD - 64)) | (1L << (REMOVE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (FLOATING_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (ASTERISK - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (DASH - 194)) | (1L << (DOT - 194)) | (1L << (LBRACKET - 194)) | (1L << (LPAREN - 194)) | (1L << (PLUS - 194)))) != 0)) {
					{
					setState(890);
					columnExprList();
					}
				}

				setState(893);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TtlExprContext extends ParserRuleContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(ClickHouseParser.DELETE, 0); }
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TerminalNode DISK() { return getToken(ClickHouseParser.DISK, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode VOLUME() { return getToken(ClickHouseParser.VOLUME, 0); }
		public TtlExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ttlExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTtlExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TtlExprContext ttlExpr() throws RecognitionException {
		TtlExprContext _localctx = new TtlExprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_ttlExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			columnExpr(0);
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(897);
				match(DELETE);
				}
				break;
			case 2:
				{
				setState(898);
				match(TO);
				setState(899);
				match(DISK);
				setState(900);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				{
				setState(901);
				match(TO);
				setState(902);
				match(VOLUME);
				setState(903);
				match(STRING_LITERAL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeStmtContext extends ParserRuleContext {
		public TableExprContext tableExpr() {
			return getRuleContext(TableExprContext.class,0);
		}
		public TerminalNode DESCRIBE() { return getToken(ClickHouseParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(ClickHouseParser.DESC, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public DescribeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDescribeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeStmtContext describeStmt() throws RecognitionException {
		DescribeStmtContext _localctx = new DescribeStmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_describeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			_la = _input.LA(1);
			if ( !(_la==DESC || _la==DESCRIBE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(907);
				match(TABLE);
				}
				break;
			}
			setState(910);
			tableExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropStmtContext extends ParserRuleContext {
		public DropStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropStmt; }

		public DropStmtContext() { }
		public void copyFrom(DropStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DropDatabaseStmtContext extends DropStmtContext {
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode DETACH() { return getToken(ClickHouseParser.DETACH, 0); }
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public DropDatabaseStmtContext(DropStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDropDatabaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableStmtContext extends DropStmtContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DETACH() { return getToken(ClickHouseParser.DETACH, 0); }
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TerminalNode NO() { return getToken(ClickHouseParser.NO, 0); }
		public TerminalNode DELAY() { return getToken(ClickHouseParser.DELAY, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public DropTableStmtContext(DropStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDropTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropStmtContext dropStmt() throws RecognitionException {
		DropStmtContext _localctx = new DropStmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dropStmt);
		int _la;
		try {
			setState(943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				_localctx = new DropDatabaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(912);
				_la = _input.LA(1);
				if ( !(_la==DETACH || _la==DROP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(913);
				match(DATABASE);
				setState(916);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(914);
					match(IF);
					setState(915);
					match(EXISTS);
					}
					break;
				}
				setState(918);
				databaseIdentifier();
				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(919);
					clusterClause();
					}
				}

				}
				break;
			case 2:
				_localctx = new DropTableStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(922);
				_la = _input.LA(1);
				if ( !(_la==DETACH || _la==DROP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(929);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DICTIONARY:
					{
					setState(923);
					match(DICTIONARY);
					}
					break;
				case TABLE:
				case TEMPORARY:
					{
					setState(925);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TEMPORARY) {
						{
						setState(924);
						match(TEMPORARY);
						}
					}

					setState(927);
					match(TABLE);
					}
					break;
				case VIEW:
					{
					setState(928);
					match(VIEW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(933);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(931);
					match(IF);
					setState(932);
					match(EXISTS);
					}
					break;
				}
				setState(935);
				tableIdentifier();
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(936);
					clusterClause();
					}
				}

				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(939);
					match(NO);
					setState(940);
					match(DELAY);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistsStmtContext extends ParserRuleContext {
		public ExistsStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existsStmt; }

		public ExistsStmtContext() { }
		public void copyFrom(ExistsStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExistsTableStmtContext extends ExistsStmtContext {
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public ExistsTableStmtContext(ExistsStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitExistsTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsDatabaseStmtContext extends ExistsStmtContext {
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public ExistsDatabaseStmtContext(ExistsStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitExistsDatabaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistsStmtContext existsStmt() throws RecognitionException {
		ExistsStmtContext _localctx = new ExistsStmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_existsStmt);
		int _la;
		try {
			setState(958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				_localctx = new ExistsDatabaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(945);
				match(EXISTS);
				setState(946);
				match(DATABASE);
				setState(947);
				databaseIdentifier();
				}
				break;
			case 2:
				_localctx = new ExistsTableStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(948);
				match(EXISTS);
				setState(955);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(949);
					match(DICTIONARY);
					}
					break;
				case 2:
					{
					setState(951);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TEMPORARY) {
						{
						setState(950);
						match(TEMPORARY);
						}
					}

					setState(953);
					match(TABLE);
					}
					break;
				case 3:
					{
					setState(954);
					match(VIEW);
					}
					break;
				}
				setState(957);
				tableIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplainStmtContext extends ParserRuleContext {
		public TerminalNode EXPLAIN() { return getToken(ClickHouseParser.EXPLAIN, 0); }
		public TerminalNode SYNTAX() { return getToken(ClickHouseParser.SYNTAX, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExplainStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explainStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitExplainStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplainStmtContext explainStmt() throws RecognitionException {
		ExplainStmtContext _localctx = new ExplainStmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_explainStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(EXPLAIN);
			setState(961);
			match(SYNTAX);
			setState(962);
			query();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertStmtContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(ClickHouseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(ClickHouseParser.INTO, 0); }
		public DataClauseContext dataClause() {
			return getRuleContext(DataClauseContext.class,0);
		}
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(ClickHouseParser.FUNCTION, 0); }
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public ColumnsClauseContext columnsClause() {
			return getRuleContext(ColumnsClauseContext.class,0);
		}
		public InsertStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitInsertStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStmtContext insertStmt() throws RecognitionException {
		InsertStmtContext _localctx = new InsertStmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_insertStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			match(INSERT);
			setState(965);
			match(INTO);
			setState(967);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(966);
				match(TABLE);
				}
				break;
			}
			setState(972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(969);
				tableIdentifier();
				}
				break;
			case 2:
				{
				setState(970);
				match(FUNCTION);
				setState(971);
				tableFunctionExpr();
				}
				break;
			}
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(974);
				columnsClause();
				}
				break;
			}
			setState(977);
			dataClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnsClauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<NestedIdentifierContext> nestedIdentifier() {
			return getRuleContexts(NestedIdentifierContext.class);
		}
		public NestedIdentifierContext nestedIdentifier(int i) {
			return getRuleContext(NestedIdentifierContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnsClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsClauseContext columnsClause() throws RecognitionException {
		ColumnsClauseContext _localctx = new ColumnsClauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_columnsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			match(LPAREN);
			setState(980);
			nestedIdentifier();
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(981);
				match(COMMA);
				setState(982);
				nestedIdentifier();
				}
				}
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(988);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataClauseContext extends ParserRuleContext {
		public DataClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataClause; }

		public DataClauseContext() { }
		public void copyFrom(DataClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DataClauseValuesContext extends DataClauseContext {
		public TerminalNode VALUES() { return getToken(ClickHouseParser.VALUES, 0); }
		public DataClauseValuesContext(DataClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDataClauseValues(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataClauseFormatContext extends DataClauseContext {
		public TerminalNode FORMAT() { return getToken(ClickHouseParser.FORMAT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataClauseFormatContext(DataClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDataClauseFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataClauseSelectContext extends DataClauseContext {
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ClickHouseParser.EOF, 0); }
		public TerminalNode SEMICOLON() { return getToken(ClickHouseParser.SEMICOLON, 0); }
		public DataClauseSelectContext(DataClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDataClauseSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataClauseContext dataClause() throws RecognitionException {
		DataClauseContext _localctx = new DataClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_dataClause);
		int _la;
		try {
			setState(999);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORMAT:
				_localctx = new DataClauseFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				match(FORMAT);
				setState(991);
				identifier();
				}
				break;
			case VALUES:
				_localctx = new DataClauseValuesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(992);
				match(VALUES);
				}
				break;
			case SELECT:
			case WITH:
			case LPAREN:
				_localctx = new DataClauseSelectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(993);
				selectUnionStmt();
				setState(995);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(994);
					match(SEMICOLON);
					}
				}

				setState(997);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KillStmtContext extends ParserRuleContext {
		public KillStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killStmt; }

		public KillStmtContext() { }
		public void copyFrom(KillStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class KillMutationStmtContext extends KillStmtContext {
		public TerminalNode KILL() { return getToken(ClickHouseParser.KILL, 0); }
		public TerminalNode MUTATION() { return getToken(ClickHouseParser.MUTATION, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TerminalNode SYNC() { return getToken(ClickHouseParser.SYNC, 0); }
		public TerminalNode ASYNC() { return getToken(ClickHouseParser.ASYNC, 0); }
		public TerminalNode TEST() { return getToken(ClickHouseParser.TEST, 0); }
		public KillMutationStmtContext(KillStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitKillMutationStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KillStmtContext killStmt() throws RecognitionException {
		KillStmtContext _localctx = new KillStmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_killStmt);
		int _la;
		try {
			_localctx = new KillMutationStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(KILL);
			setState(1002);
			match(MUTATION);
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1003);
				clusterClause();
				}
			}

			setState(1006);
			whereClause();
			setState(1008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC || _la==SYNC || _la==TEST) {
				{
				setState(1007);
				_la = _input.LA(1);
				if ( !(_la==ASYNC || _la==SYNC || _la==TEST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptimizeStmtContext extends ParserRuleContext {
		public TerminalNode OPTIMIZE() { return getToken(ClickHouseParser.OPTIMIZE, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(ClickHouseParser.FINAL, 0); }
		public TerminalNode DEDUPLICATE() { return getToken(ClickHouseParser.DEDUPLICATE, 0); }
		public OptimizeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optimizeStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitOptimizeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptimizeStmtContext optimizeStmt() throws RecognitionException {
		OptimizeStmtContext _localctx = new OptimizeStmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_optimizeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			match(OPTIMIZE);
			setState(1011);
			match(TABLE);
			setState(1012);
			tableIdentifier();
			setState(1014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1013);
				clusterClause();
				}
			}

			setState(1017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1016);
				partitionClause();
				}
			}

			setState(1020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(1019);
				match(FINAL);
				}
			}

			setState(1023);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEDUPLICATE) {
				{
				setState(1022);
				match(DEDUPLICATE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameStmtContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(ClickHouseParser.RENAME, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public List<TerminalNode> TO() { return getTokens(ClickHouseParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(ClickHouseParser.TO, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public RenameStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitRenameStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameStmtContext renameStmt() throws RecognitionException {
		RenameStmtContext _localctx = new RenameStmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_renameStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			match(RENAME);
			setState(1026);
			match(TABLE);
			setState(1027);
			tableIdentifier();
			setState(1028);
			match(TO);
			setState(1029);
			tableIdentifier();
			setState(1037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1030);
				match(COMMA);
				setState(1031);
				tableIdentifier();
				setState(1032);
				match(TO);
				setState(1033);
				tableIdentifier();
				}
				}
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1040);
				clusterClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectUnionStmtContext extends ParserRuleContext {
		public List<SelectStmtWithParensContext> selectStmtWithParens() {
			return getRuleContexts(SelectStmtWithParensContext.class);
		}
		public SelectStmtWithParensContext selectStmtWithParens(int i) {
			return getRuleContext(SelectStmtWithParensContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(ClickHouseParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(ClickHouseParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(ClickHouseParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(ClickHouseParser.ALL, i);
		}
		public SelectUnionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectUnionStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSelectUnionStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectUnionStmtContext selectUnionStmt() throws RecognitionException {
		SelectUnionStmtContext _localctx = new SelectUnionStmtContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_selectUnionStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			selectStmtWithParens();
			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(1044);
				match(UNION);
				setState(1045);
				match(ALL);
				setState(1046);
				selectStmtWithParens();
				}
				}
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStmtWithParensContext extends ParserRuleContext {
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public SelectStmtWithParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmtWithParens; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSelectStmtWithParens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStmtWithParensContext selectStmtWithParens() throws RecognitionException {
		SelectStmtWithParensContext _localctx = new SelectStmtWithParensContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_selectStmtWithParens);
		try {
			setState(1057);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(1052);
				selectStmt();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1053);
				match(LPAREN);
				setState(1054);
				selectUnionStmt();
				setState(1055);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(ClickHouseParser.SELECT, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(ClickHouseParser.DISTINCT, 0); }
		public TopClauseContext topClause() {
			return getRuleContext(TopClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public ArrayJoinClauseContext arrayJoinClause() {
			return getRuleContext(ArrayJoinClauseContext.class,0);
		}
		public PrewhereClauseContext prewhereClause() {
			return getRuleContext(PrewhereClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public List<TerminalNode> WITH() { return getTokens(ClickHouseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(ClickHouseParser.WITH, i);
		}
		public TerminalNode TOTALS() { return getToken(ClickHouseParser.TOTALS, 0); }
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitByClauseContext limitByClause() {
			return getRuleContext(LimitByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public SettingsClauseContext settingsClause() {
			return getRuleContext(SettingsClauseContext.class,0);
		}
		public TerminalNode CUBE() { return getToken(ClickHouseParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(ClickHouseParser.ROLLUP, 0); }
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSelectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1059);
				withClause();
				}
			}

			setState(1062);
			match(SELECT);
			setState(1064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1063);
				match(DISTINCT);
				}
				break;
			}
			setState(1067);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1066);
				topClause();
				}
				break;
			}
			setState(1069);
			columnExprList();
			setState(1071);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1070);
				fromClause();
				}
			}

			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY || _la==INNER || _la==LEFT) {
				{
				setState(1073);
				arrayJoinClause();
				}
			}

			setState(1077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PREWHERE) {
				{
				setState(1076);
				prewhereClause();
				}
			}

			setState(1080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1079);
				whereClause();
				}
			}

			setState(1083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(1082);
				groupByClause();
				}
			}

			setState(1087);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1085);
				match(WITH);
				setState(1086);
				_la = _input.LA(1);
				if ( !(_la==CUBE || _la==ROLLUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1089);
				match(WITH);
				setState(1090);
				match(TOTALS);
				}
			}

			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(1093);
				havingClause();
				}
			}

			setState(1097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1096);
				orderByClause();
				}
			}

			setState(1100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1099);
				limitByClause();
				}
				break;
			}
			setState(1103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1102);
				limitClause();
				}
			}

			setState(1106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SETTINGS) {
				{
				setState(1105);
				settingsClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public WithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWithClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithClauseContext withClause() throws RecognitionException {
		WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_withClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			match(WITH);
			setState(1109);
			columnExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopClauseContext extends ParserRuleContext {
		public TerminalNode TOP() { return getToken(ClickHouseParser.TOP, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public TerminalNode TIES() { return getToken(ClickHouseParser.TIES, 0); }
		public TopClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTopClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopClauseContext topClause() throws RecognitionException {
		TopClauseContext _localctx = new TopClauseContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_topClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			match(TOP);
			setState(1112);
			match(DECIMAL_LITERAL);
			setState(1115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1113);
				match(WITH);
				setState(1114);
				match(TIES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public JoinExprContext joinExpr() {
			return getRuleContext(JoinExprContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			match(FROM);
			setState(1118);
			joinExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayJoinClauseContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(ClickHouseParser.ARRAY, 0); }
		public TerminalNode JOIN() { return getToken(ClickHouseParser.JOIN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode LEFT() { return getToken(ClickHouseParser.LEFT, 0); }
		public TerminalNode INNER() { return getToken(ClickHouseParser.INNER, 0); }
		public ArrayJoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayJoinClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitArrayJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayJoinClauseContext arrayJoinClause() throws RecognitionException {
		ArrayJoinClauseContext _localctx = new ArrayJoinClauseContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_arrayJoinClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INNER || _la==LEFT) {
				{
				setState(1120);
				_la = _input.LA(1);
				if ( !(_la==INNER || _la==LEFT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1123);
			match(ARRAY);
			setState(1124);
			match(JOIN);
			setState(1125);
			columnExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrewhereClauseContext extends ParserRuleContext {
		public TerminalNode PREWHERE() { return getToken(ClickHouseParser.PREWHERE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public PrewhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prewhereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitPrewhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrewhereClauseContext prewhereClause() throws RecognitionException {
		PrewhereClauseContext _localctx = new PrewhereClauseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_prewhereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			match(PREWHERE);
			setState(1128);
			columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(ClickHouseParser.WHERE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			match(WHERE);
			setState(1131);
			columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(ClickHouseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TerminalNode CUBE() { return getToken(ClickHouseParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(ClickHouseParser.ROLLUP, 0); }
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			match(GROUP);
			setState(1134);
			match(BY);
			setState(1141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1135);
				_la = _input.LA(1);
				if ( !(_la==CUBE || _la==ROLLUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1136);
				match(LPAREN);
				setState(1137);
				columnExprList();
				setState(1138);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(1140);
				columnExprList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(ClickHouseParser.HAVING, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			match(HAVING);
			setState(1144);
			columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(ClickHouseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public OrderExprListContext orderExprList() {
			return getRuleContext(OrderExprListContext.class,0);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_orderByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			match(ORDER);
			setState(1147);
			match(BY);
			setState(1148);
			orderExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitByClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(ClickHouseParser.LIMIT, 0); }
		public LimitExprContext limitExpr() {
			return getRuleContext(LimitExprContext.class,0);
		}
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public LimitByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLimitByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitByClauseContext limitByClause() throws RecognitionException {
		LimitByClauseContext _localctx = new LimitByClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_limitByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			match(LIMIT);
			setState(1151);
			limitExpr();
			setState(1152);
			match(BY);
			setState(1153);
			columnExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(ClickHouseParser.LIMIT, 0); }
		public LimitExprContext limitExpr() {
			return getRuleContext(LimitExprContext.class,0);
		}
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public TerminalNode TIES() { return getToken(ClickHouseParser.TIES, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			match(LIMIT);
			setState(1156);
			limitExpr();
			setState(1159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1157);
				match(WITH);
				setState(1158);
				match(TIES);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SettingsClauseContext extends ParserRuleContext {
		public TerminalNode SETTINGS() { return getToken(ClickHouseParser.SETTINGS, 0); }
		public SettingExprListContext settingExprList() {
			return getRuleContext(SettingExprListContext.class,0);
		}
		public SettingsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settingsClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSettingsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingsClauseContext settingsClause() throws RecognitionException {
		SettingsClauseContext _localctx = new SettingsClauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_settingsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			match(SETTINGS);
			setState(1162);
			settingExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinExprContext extends ParserRuleContext {
		public JoinExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinExpr; }

		public JoinExprContext() { }
		public void copyFrom(JoinExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JoinExprOpContext extends JoinExprContext {
		public List<JoinExprContext> joinExpr() {
			return getRuleContexts(JoinExprContext.class);
		}
		public JoinExprContext joinExpr(int i) {
			return getRuleContext(JoinExprContext.class,i);
		}
		public TerminalNode JOIN() { return getToken(ClickHouseParser.JOIN, 0); }
		public JoinConstraintClauseContext joinConstraintClause() {
			return getRuleContext(JoinConstraintClauseContext.class,0);
		}
		public JoinOpContext joinOp() {
			return getRuleContext(JoinOpContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(ClickHouseParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(ClickHouseParser.LOCAL, 0); }
		public JoinExprOpContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinExprOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinExprTableContext extends JoinExprContext {
		public TableExprContext tableExpr() {
			return getRuleContext(TableExprContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(ClickHouseParser.FINAL, 0); }
		public SampleClauseContext sampleClause() {
			return getRuleContext(SampleClauseContext.class,0);
		}
		public JoinExprTableContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinExprTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinExprParensContext extends JoinExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public JoinExprContext joinExpr() {
			return getRuleContext(JoinExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public JoinExprParensContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinExprParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinExprCrossOpContext extends JoinExprContext {
		public List<JoinExprContext> joinExpr() {
			return getRuleContexts(JoinExprContext.class);
		}
		public JoinExprContext joinExpr(int i) {
			return getRuleContext(JoinExprContext.class,i);
		}
		public JoinOpCrossContext joinOpCross() {
			return getRuleContext(JoinOpCrossContext.class,0);
		}
		public JoinExprCrossOpContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinExprCrossOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinExprContext joinExpr() throws RecognitionException {
		return joinExpr(0);
	}

	private JoinExprContext joinExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JoinExprContext _localctx = new JoinExprContext(_ctx, _parentState);
		JoinExprContext _prevctx = _localctx;
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_joinExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				_localctx = new JoinExprTableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1165);
				tableExpr(0);
				setState(1167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1166);
					match(FINAL);
					}
					break;
				}
				setState(1170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1169);
					sampleClause();
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new JoinExprParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1172);
				match(LPAREN);
				setState(1173);
				joinExpr(0);
				setState(1174);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
					case 1:
						{
						_localctx = new JoinExprCrossOpContext(new JoinExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_joinExpr);
						setState(1178);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1179);
						joinOpCross();
						setState(1180);
						joinExpr(4);
						}
						break;
					case 2:
						{
						_localctx = new JoinExprOpContext(new JoinExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_joinExpr);
						setState(1182);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1184);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==GLOBAL || _la==LOCAL) {
							{
							setState(1183);
							_la = _input.LA(1);
							if ( !(_la==GLOBAL || _la==LOCAL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
						}

						setState(1187);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (ALL - 4)) | (1L << (ANTI - 4)) | (1L << (ANY - 4)) | (1L << (ASOF - 4)) | (1L << (FULL - 4)))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (INNER - 80)) | (1L << (LEFT - 80)) | (1L << (RIGHT - 80)) | (1L << (SEMI - 80)))) != 0)) {
							{
							setState(1186);
							joinOp();
							}
						}

						setState(1189);
						match(JOIN);
						setState(1190);
						joinExpr(0);
						setState(1191);
						joinConstraintClause();
						}
						break;
					}
					}
				}
				setState(1197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JoinOpContext extends ParserRuleContext {
		public JoinOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinOp; }

		public JoinOpContext() { }
		public void copyFrom(JoinOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JoinOpFullContext extends JoinOpContext {
		public TerminalNode FULL() { return getToken(ClickHouseParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(ClickHouseParser.OUTER, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseParser.ANY, 0); }
		public JoinOpFullContext(JoinOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinOpFull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinOpInnerContext extends JoinOpContext {
		public TerminalNode INNER() { return getToken(ClickHouseParser.INNER, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseParser.ANY, 0); }
		public TerminalNode ASOF() { return getToken(ClickHouseParser.ASOF, 0); }
		public JoinOpInnerContext(JoinOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinOpInner(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinOpLeftRightContext extends JoinOpContext {
		public TerminalNode LEFT() { return getToken(ClickHouseParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(ClickHouseParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(ClickHouseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(ClickHouseParser.SEMI, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseParser.ALL, 0); }
		public TerminalNode ANTI() { return getToken(ClickHouseParser.ANTI, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseParser.ANY, 0); }
		public TerminalNode ASOF() { return getToken(ClickHouseParser.ASOF, 0); }
		public JoinOpLeftRightContext(JoinOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinOpLeftRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinOpContext joinOp() throws RecognitionException {
		JoinOpContext _localctx = new JoinOpContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_joinOp);
		int _la;
		try {
			setState(1241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				_localctx = new JoinOpInnerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1199);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) {
						{
						setState(1198);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(1201);
					match(INNER);
					}
					break;
				case 2:
					{
					setState(1202);
					match(INNER);
					setState(1204);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) {
						{
						setState(1203);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					break;
				case 3:
					{
					setState(1206);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new JoinOpLeftRightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1210);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) {
						{
						setState(1209);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(1212);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1214);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(1213);
						match(OUTER);
						}
					}

					}
					break;
				case 2:
					{
					setState(1216);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1218);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(1217);
						match(OUTER);
						}
					}

					setState(1221);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) {
						{
						setState(1220);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new JoinOpFullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1226);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL || _la==ANY) {
						{
						setState(1225);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(1228);
					match(FULL);
					setState(1230);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(1229);
						match(OUTER);
						}
					}

					}
					break;
				case 2:
					{
					setState(1232);
					match(FULL);
					setState(1234);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(1233);
						match(OUTER);
						}
					}

					setState(1237);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL || _la==ANY) {
						{
						setState(1236);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinOpCrossContext extends ParserRuleContext {
		public TerminalNode CROSS() { return getToken(ClickHouseParser.CROSS, 0); }
		public TerminalNode JOIN() { return getToken(ClickHouseParser.JOIN, 0); }
		public TerminalNode GLOBAL() { return getToken(ClickHouseParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(ClickHouseParser.LOCAL, 0); }
		public TerminalNode COMMA() { return getToken(ClickHouseParser.COMMA, 0); }
		public JoinOpCrossContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinOpCross; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinOpCross(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinOpCrossContext joinOpCross() throws RecognitionException {
		JoinOpCrossContext _localctx = new JoinOpCrossContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_joinOpCross);
		int _la;
		try {
			setState(1249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CROSS:
			case GLOBAL:
			case LOCAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==LOCAL) {
					{
					setState(1243);
					_la = _input.LA(1);
					if ( !(_la==GLOBAL || _la==LOCAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1246);
				match(CROSS);
				setState(1247);
				match(JOIN);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(1248);
				match(COMMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinConstraintClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(ClickHouseParser.ON, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode USING() { return getToken(ClickHouseParser.USING, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public JoinConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinConstraintClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinConstraintClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinConstraintClauseContext joinConstraintClause() throws RecognitionException {
		JoinConstraintClauseContext _localctx = new JoinConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_joinConstraintClause);
		try {
			setState(1260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1251);
				match(ON);
				setState(1252);
				columnExprList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1253);
				match(USING);
				setState(1254);
				match(LPAREN);
				setState(1255);
				columnExprList();
				setState(1256);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1258);
				match(USING);
				setState(1259);
				columnExprList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleClauseContext extends ParserRuleContext {
		public TerminalNode SAMPLE() { return getToken(ClickHouseParser.SAMPLE, 0); }
		public List<RatioExprContext> ratioExpr() {
			return getRuleContexts(RatioExprContext.class);
		}
		public RatioExprContext ratioExpr(int i) {
			return getRuleContext(RatioExprContext.class,i);
		}
		public TerminalNode OFFSET() { return getToken(ClickHouseParser.OFFSET, 0); }
		public SampleClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSampleClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleClauseContext sampleClause() throws RecognitionException {
		SampleClauseContext _localctx = new SampleClauseContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_sampleClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			match(SAMPLE);
			setState(1263);
			ratioExpr();
			setState(1266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1264);
				match(OFFSET);
				setState(1265);
				ratioExpr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitExprContext extends ParserRuleContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ClickHouseParser.COMMA, 0); }
		public TerminalNode OFFSET() { return getToken(ClickHouseParser.OFFSET, 0); }
		public LimitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLimitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitExprContext limitExpr() throws RecognitionException {
		LimitExprContext _localctx = new LimitExprContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_limitExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			columnExpr(0);
			setState(1271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET || _la==COMMA) {
				{
				setState(1269);
				_la = _input.LA(1);
				if ( !(_la==OFFSET || _la==COMMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1270);
				columnExpr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderExprListContext extends ParserRuleContext {
		public List<OrderExprContext> orderExpr() {
			return getRuleContexts(OrderExprContext.class);
		}
		public OrderExprContext orderExpr(int i) {
			return getRuleContext(OrderExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public OrderExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderExprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitOrderExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderExprListContext orderExprList() throws RecognitionException {
		OrderExprListContext _localctx = new OrderExprListContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_orderExprList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			orderExpr();
			setState(1278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1274);
					match(COMMA);
					setState(1275);
					orderExpr();
					}
					}
				}
				setState(1280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderExprContext extends ParserRuleContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(ClickHouseParser.NULLS, 0); }
		public TerminalNode COLLATE() { return getToken(ClickHouseParser.COLLATE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode ASCENDING() { return getToken(ClickHouseParser.ASCENDING, 0); }
		public TerminalNode DESCENDING() { return getToken(ClickHouseParser.DESCENDING, 0); }
		public TerminalNode DESC() { return getToken(ClickHouseParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(ClickHouseParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(ClickHouseParser.LAST, 0); }
		public OrderExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitOrderExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderExprContext orderExpr() throws RecognitionException {
		OrderExprContext _localctx = new OrderExprContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_orderExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			columnExpr(0);
			setState(1283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1282);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASCENDING) | (1L << DESC) | (1L << DESCENDING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1285);
				match(NULLS);
				setState(1286);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1289);
				match(COLLATE);
				setState(1290);
				match(STRING_LITERAL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RatioExprContext extends ParserRuleContext {
		public List<NumberLiteralContext> numberLiteral() {
			return getRuleContexts(NumberLiteralContext.class);
		}
		public NumberLiteralContext numberLiteral(int i) {
			return getRuleContext(NumberLiteralContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(ClickHouseParser.SLASH, 0); }
		public RatioExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ratioExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitRatioExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RatioExprContext ratioExpr() throws RecognitionException {
		RatioExprContext _localctx = new RatioExprContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_ratioExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			numberLiteral();
			setState(1296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1294);
				match(SLASH);
				setState(1295);
				numberLiteral();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SettingExprListContext extends ParserRuleContext {
		public List<SettingExprContext> settingExpr() {
			return getRuleContexts(SettingExprContext.class);
		}
		public SettingExprContext settingExpr(int i) {
			return getRuleContext(SettingExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public SettingExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settingExprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSettingExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingExprListContext settingExprList() throws RecognitionException {
		SettingExprListContext _localctx = new SettingExprListContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_settingExprList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
			settingExpr();
			setState(1303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1299);
					match(COMMA);
					setState(1300);
					settingExpr();
					}
					}
				}
				setState(1305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SettingExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public SettingExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settingExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSettingExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingExprContext settingExpr() throws RecognitionException {
		SettingExprContext _localctx = new SettingExprContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_settingExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			identifier();
			setState(1307);
			match(EQ_SINGLE);
			setState(1308);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetStmtContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(ClickHouseParser.SET, 0); }
		public SettingExprListContext settingExprList() {
			return getRuleContext(SettingExprListContext.class,0);
		}
		public SetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStmtContext setStmt() throws RecognitionException {
		SetStmtContext _localctx = new SetStmtContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_setStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310);
			match(SET);
			setState(1311);
			settingExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowStmtContext extends ParserRuleContext {
		public ShowStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showStmt; }

		public ShowStmtContext() { }
		public void copyFrom(ShowStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShowCreateDatabaseStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public ShowCreateDatabaseStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowCreateDatabaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowDatabasesStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(ClickHouseParser.DATABASES, 0); }
		public ShowDatabasesStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowDatabasesStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public ShowCreateTableStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowCreateTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(ClickHouseParser.TABLES, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(ClickHouseParser.LIKE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public ShowTablesStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowTablesStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowDictionariesStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode DICTIONARIES() { return getToken(ClickHouseParser.DICTIONARIES, 0); }
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public ShowDictionariesStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowDictionariesStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateDictionaryStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ShowCreateDictionaryStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowCreateDictionaryStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowStmtContext showStmt() throws RecognitionException {
		ShowStmtContext _localctx = new ShowStmtContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_showStmt);
		int _la;
		try {
			setState(1355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				_localctx = new ShowCreateDatabaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1313);
				match(SHOW);
				setState(1314);
				match(CREATE);
				setState(1315);
				match(DATABASE);
				setState(1316);
				databaseIdentifier();
				}
				break;
			case 2:
				_localctx = new ShowCreateDictionaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1317);
				match(SHOW);
				setState(1318);
				match(CREATE);
				setState(1319);
				match(DICTIONARY);
				setState(1320);
				tableIdentifier();
				}
				break;
			case 3:
				_localctx = new ShowCreateTableStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1321);
				match(SHOW);
				setState(1322);
				match(CREATE);
				setState(1324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1323);
					match(TEMPORARY);
					}
					break;
				}
				setState(1327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1326);
					match(TABLE);
					}
					break;
				}
				setState(1329);
				tableIdentifier();
				}
				break;
			case 4:
				_localctx = new ShowDatabasesStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1330);
				match(SHOW);
				setState(1331);
				match(DATABASES);
				}
				break;
			case 5:
				_localctx = new ShowDictionariesStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1332);
				match(SHOW);
				setState(1333);
				match(DICTIONARIES);
				setState(1336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(1334);
					match(FROM);
					setState(1335);
					databaseIdentifier();
					}
				}

				}
				break;
			case 6:
				_localctx = new ShowTablesStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1338);
				match(SHOW);
				setState(1340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(1339);
					match(TEMPORARY);
					}
				}

				setState(1342);
				match(TABLES);
				setState(1345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(1343);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1344);
					databaseIdentifier();
					}
				}

				setState(1350);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LIKE:
					{
					setState(1347);
					match(LIKE);
					setState(1348);
					match(STRING_LITERAL);
					}
					break;
				case WHERE:
					{
					setState(1349);
					whereClause();
					}
					break;
				case EOF:
				case FORMAT:
				case INTO:
				case LIMIT:
				case SEMICOLON:
					break;
				default:
					break;
				}
				setState(1353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(1352);
					limitClause();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SystemStmtContext extends ParserRuleContext {
		public TerminalNode SYSTEM() { return getToken(ClickHouseParser.SYSTEM, 0); }
		public TerminalNode FLUSH() { return getToken(ClickHouseParser.FLUSH, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(ClickHouseParser.DISTRIBUTED, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LOGS() { return getToken(ClickHouseParser.LOGS, 0); }
		public TerminalNode RELOAD() { return getToken(ClickHouseParser.RELOAD, 0); }
		public TerminalNode DICTIONARIES() { return getToken(ClickHouseParser.DICTIONARIES, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TerminalNode START() { return getToken(ClickHouseParser.START, 0); }
		public TerminalNode STOP() { return getToken(ClickHouseParser.STOP, 0); }
		public TerminalNode SENDS() { return getToken(ClickHouseParser.SENDS, 0); }
		public TerminalNode FETCHES() { return getToken(ClickHouseParser.FETCHES, 0); }
		public TerminalNode MERGES() { return getToken(ClickHouseParser.MERGES, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public TerminalNode REPLICATED() { return getToken(ClickHouseParser.REPLICATED, 0); }
		public TerminalNode SYNC() { return getToken(ClickHouseParser.SYNC, 0); }
		public TerminalNode REPLICA() { return getToken(ClickHouseParser.REPLICA, 0); }
		public SystemStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSystemStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemStmtContext systemStmt() throws RecognitionException {
		SystemStmtContext _localctx = new SystemStmtContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_systemStmt);
		int _la;
		try {
			setState(1391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1357);
				match(SYSTEM);
				setState(1358);
				match(FLUSH);
				setState(1359);
				match(DISTRIBUTED);
				setState(1360);
				tableIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1361);
				match(SYSTEM);
				setState(1362);
				match(FLUSH);
				setState(1363);
				match(LOGS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1364);
				match(SYSTEM);
				setState(1365);
				match(RELOAD);
				setState(1366);
				match(DICTIONARIES);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1367);
				match(SYSTEM);
				setState(1368);
				match(RELOAD);
				setState(1369);
				match(DICTIONARY);
				setState(1370);
				tableIdentifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1371);
				match(SYSTEM);
				setState(1372);
				_la = _input.LA(1);
				if ( !(_la==START || _la==STOP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1380);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DISTRIBUTED:
					{
					setState(1373);
					match(DISTRIBUTED);
					setState(1374);
					match(SENDS);
					}
					break;
				case FETCHES:
					{
					setState(1375);
					match(FETCHES);
					}
					break;
				case MERGES:
				case TTL:
					{
					setState(1377);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TTL) {
						{
						setState(1376);
						match(TTL);
						}
					}

					setState(1379);
					match(MERGES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1382);
				tableIdentifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1383);
				match(SYSTEM);
				setState(1384);
				_la = _input.LA(1);
				if ( !(_la==START || _la==STOP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1385);
				match(REPLICATED);
				setState(1386);
				match(SENDS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1387);
				match(SYSTEM);
				setState(1388);
				match(SYNC);
				setState(1389);
				match(REPLICA);
				setState(1390);
				tableIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TruncateStmtContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(ClickHouseParser.TRUNCATE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TruncateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTruncateStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruncateStmtContext truncateStmt() throws RecognitionException {
		TruncateStmtContext _localctx = new TruncateStmtContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_truncateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			match(TRUNCATE);
			setState(1395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1394);
				match(TEMPORARY);
				}
				break;
			}
			setState(1398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1397);
				match(TABLE);
				}
				break;
			}
			setState(1402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1400);
				match(IF);
				setState(1401);
				match(EXISTS);
				}
				break;
			}
			setState(1404);
			tableIdentifier();
			setState(1406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1405);
				clusterClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseStmtContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(ClickHouseParser.USE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public UseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitUseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseStmtContext useStmt() throws RecognitionException {
		UseStmtContext _localctx = new UseStmtContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_useStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			match(USE);
			setState(1409);
			databaseIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WatchStmtContext extends ParserRuleContext {
		public TerminalNode WATCH() { return getToken(ClickHouseParser.WATCH, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EVENTS() { return getToken(ClickHouseParser.EVENTS, 0); }
		public TerminalNode LIMIT() { return getToken(ClickHouseParser.LIMIT, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public WatchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_watchStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWatchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WatchStmtContext watchStmt() throws RecognitionException {
		WatchStmtContext _localctx = new WatchStmtContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_watchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1411);
			match(WATCH);
			setState(1412);
			tableIdentifier();
			setState(1414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EVENTS) {
				{
				setState(1413);
				match(EVENTS);
				}
			}

			setState(1418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1416);
				match(LIMIT);
				setState(1417);
				match(DECIMAL_LITERAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnTypeExprContext extends ParserRuleContext {
		public ColumnTypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnTypeExpr; }

		public ColumnTypeExprContext() { }
		public void copyFrom(ColumnTypeExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnTypeExprNestedContext extends ColumnTypeExprContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<ColumnTypeExprContext> columnTypeExpr() {
			return getRuleContexts(ColumnTypeExprContext.class);
		}
		public ColumnTypeExprContext columnTypeExpr(int i) {
			return getRuleContext(ColumnTypeExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnTypeExprNestedContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnTypeExprNested(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnTypeExprParamContext extends ColumnTypeExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnTypeExprParamContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnTypeExprParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnTypeExprSimpleContext extends ColumnTypeExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnTypeExprSimpleContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnTypeExprSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnTypeExprComplexContext extends ColumnTypeExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<ColumnTypeExprContext> columnTypeExpr() {
			return getRuleContexts(ColumnTypeExprContext.class);
		}
		public ColumnTypeExprContext columnTypeExpr(int i) {
			return getRuleContext(ColumnTypeExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnTypeExprComplexContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnTypeExprComplex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnTypeExprEnumContext extends ColumnTypeExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnTypeExprEnumContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnTypeExprEnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnTypeExprContext columnTypeExpr() throws RecognitionException {
		ColumnTypeExprContext _localctx = new ColumnTypeExprContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_columnTypeExpr);
		int _la;
		try {
			setState(1467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				_localctx = new ColumnTypeExprSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1420);
				identifier();
				}
				break;
			case 2:
				_localctx = new ColumnTypeExprNestedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1421);
				identifier();
				setState(1422);
				match(LPAREN);
				setState(1423);
				identifier();
				setState(1424);
				columnTypeExpr();
				setState(1431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1425);
					match(COMMA);
					setState(1426);
					identifier();
					setState(1427);
					columnTypeExpr();
					}
					}
					setState(1433);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1434);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new ColumnTypeExprEnumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1436);
				identifier();
				setState(1437);
				match(LPAREN);
				setState(1438);
				enumValue();
				setState(1443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1439);
					match(COMMA);
					setState(1440);
					enumValue();
					}
					}
					setState(1445);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1446);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new ColumnTypeExprComplexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1448);
				identifier();
				setState(1449);
				match(LPAREN);
				setState(1450);
				columnTypeExpr();
				setState(1455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1451);
					match(COMMA);
					setState(1452);
					columnTypeExpr();
					}
					}
					setState(1457);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1458);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new ColumnTypeExprParamContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1460);
				identifier();
				setState(1461);
				match(LPAREN);
				setState(1463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT) | (1L << FREEZE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (QUARTER - 64)) | (1L << (RANGE - 64)) | (1L << (RELOAD - 64)) | (1L << (REMOVE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (FLOATING_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (ASTERISK - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (DASH - 194)) | (1L << (DOT - 194)) | (1L << (LBRACKET - 194)) | (1L << (LPAREN - 194)) | (1L << (PLUS - 194)))) != 0)) {
					{
					setState(1462);
					columnExprList();
					}
				}

				setState(1465);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnExprListContext extends ParserRuleContext {
		public List<ColumnsExprContext> columnsExpr() {
			return getRuleContexts(ColumnsExprContext.class);
		}
		public ColumnsExprContext columnsExpr(int i) {
			return getRuleContext(ColumnsExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnExprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnExprListContext columnExprList() throws RecognitionException {
		ColumnExprListContext _localctx = new ColumnExprListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_columnExprList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1469);
			columnsExpr();
			setState(1474);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1470);
					match(COMMA);
					setState(1471);
					columnsExpr();
					}
					}
				}
				setState(1476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnsExprContext extends ParserRuleContext {
		public ColumnsExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnsExpr; }

		public ColumnsExprContext() { }
		public void copyFrom(ColumnsExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnsExprColumnContext extends ColumnsExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnsExprColumnContext(ColumnsExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnsExprColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnsExprAsteriskContext extends ColumnsExprContext {
		public TerminalNode ASTERISK() { return getToken(ClickHouseParser.ASTERISK, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public ColumnsExprAsteriskContext(ColumnsExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnsExprAsterisk(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnsExprSubqueryContext extends ColumnsExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnsExprSubqueryContext(ColumnsExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnsExprSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsExprContext columnsExpr() throws RecognitionException {
		ColumnsExprContext _localctx = new ColumnsExprContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_columnsExpr);
		int _la;
		try {
			setState(1488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				_localctx = new ColumnsExprAsteriskContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT) | (1L << FREEZE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (QUARTER - 64)) | (1L << (RANGE - 64)) | (1L << (RELOAD - 64)) | (1L << (REMOVE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)))) != 0)) {
					{
					setState(1477);
					tableIdentifier();
					setState(1478);
					match(DOT);
					}
				}

				setState(1482);
				match(ASTERISK);
				}
				break;
			case 2:
				_localctx = new ColumnsExprSubqueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1483);
				match(LPAREN);
				setState(1484);
				selectUnionStmt();
				setState(1485);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new ColumnsExprColumnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1487);
				columnExpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnExprContext extends ParserRuleContext {
		public ColumnExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnExpr; }

		public ColumnExprContext() { }
		public void copyFrom(ColumnExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnExprTernaryOpContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode QUERY() { return getToken(ClickHouseParser.QUERY, 0); }
		public TerminalNode COLON() { return getToken(ClickHouseParser.COLON, 0); }
		public ColumnExprTernaryOpContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprTernaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprAliasContext extends ColumnExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnExprAliasContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprAlias(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprExtractContext extends ColumnExprContext {
		public TerminalNode EXTRACT() { return getToken(ClickHouseParser.EXTRACT, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprExtractContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprNegateContext extends ColumnExprContext {
		public TerminalNode DASH() { return getToken(ClickHouseParser.DASH, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnExprNegateContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprSubqueryContext extends ColumnExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprSubqueryContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprLiteralContext extends ColumnExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ColumnExprLiteralContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprArrayContext extends ColumnExprContext {
		public TerminalNode LBRACKET() { return getToken(ClickHouseParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ClickHouseParser.RBRACKET, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnExprArrayContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprSubstringContext extends ColumnExprContext {
		public TerminalNode SUBSTRING() { return getToken(ClickHouseParser.SUBSTRING, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TerminalNode FOR() { return getToken(ClickHouseParser.FOR, 0); }
		public ColumnExprSubstringContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprCastContext extends ColumnExprContext {
		public TerminalNode CAST() { return getToken(ClickHouseParser.CAST, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprCastContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprOrContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(ClickHouseParser.OR, 0); }
		public ColumnExprOrContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprPrecedence1Context extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(ClickHouseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(ClickHouseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(ClickHouseParser.PERCENT, 0); }
		public ColumnExprPrecedence1Context(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprPrecedence1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprPrecedence2Context extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ClickHouseParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(ClickHouseParser.DASH, 0); }
		public TerminalNode CONCAT() { return getToken(ClickHouseParser.CONCAT, 0); }
		public ColumnExprPrecedence2Context(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprPrecedence2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprPrecedence3Context extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode EQ_DOUBLE() { return getToken(ClickHouseParser.EQ_DOUBLE, 0); }
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public TerminalNode NOT_EQ() { return getToken(ClickHouseParser.NOT_EQ, 0); }
		public TerminalNode LE() { return getToken(ClickHouseParser.LE, 0); }
		public TerminalNode GE() { return getToken(ClickHouseParser.GE, 0); }
		public TerminalNode LT() { return getToken(ClickHouseParser.LT, 0); }
		public TerminalNode GT() { return getToken(ClickHouseParser.GT, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public TerminalNode LIKE() { return getToken(ClickHouseParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(ClickHouseParser.ILIKE, 0); }
		public TerminalNode GLOBAL() { return getToken(ClickHouseParser.GLOBAL, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public ColumnExprPrecedence3Context(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprPrecedence3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprIntervalContext extends ColumnExprContext {
		public TerminalNode INTERVAL() { return getToken(ClickHouseParser.INTERVAL, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public ColumnExprIntervalContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprIsNullContext extends ColumnExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode IS() { return getToken(ClickHouseParser.IS, 0); }
		public TerminalNode NULL_SQL() { return getToken(ClickHouseParser.NULL_SQL, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public ColumnExprIsNullContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprIsNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprTrimContext extends ColumnExprContext {
		public TerminalNode TRIM() { return getToken(ClickHouseParser.TRIM, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TerminalNode BOTH() { return getToken(ClickHouseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(ClickHouseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(ClickHouseParser.TRAILING, 0); }
		public ColumnExprTrimContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprTrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprTupleContext extends ColumnExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprTupleContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprTuple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprArrayAccessContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode LBRACKET() { return getToken(ClickHouseParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ClickHouseParser.RBRACKET, 0); }
		public ColumnExprArrayAccessContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprBetweenContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(ClickHouseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(ClickHouseParser.AND, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public ColumnExprBetweenContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprBetween(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprParensContext extends ColumnExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprParensContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprTimestampContext extends ColumnExprContext {
		public TerminalNode TIMESTAMP() { return getToken(ClickHouseParser.TIMESTAMP, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public ColumnExprTimestampContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprTimestamp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprAndContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(ClickHouseParser.AND, 0); }
		public ColumnExprAndContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprTupleAccessContext extends ColumnExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public ColumnExprTupleAccessContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprTupleAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprCaseContext extends ColumnExprContext {
		public TerminalNode CASE() { return getToken(ClickHouseParser.CASE, 0); }
		public TerminalNode END() { return getToken(ClickHouseParser.END, 0); }
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public List<TerminalNode> WHEN() { return getTokens(ClickHouseParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(ClickHouseParser.WHEN, i);
		}
		public List<TerminalNode> THEN() { return getTokens(ClickHouseParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(ClickHouseParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(ClickHouseParser.ELSE, 0); }
		public ColumnExprCaseContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprDateContext extends ColumnExprContext {
		public TerminalNode DATE() { return getToken(ClickHouseParser.DATE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public ColumnExprDateContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprDate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprNotContext extends ColumnExprContext {
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnExprNotContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprIdentifierContext extends ColumnExprContext {
		public ColumnIdentifierContext columnIdentifier() {
			return getRuleContext(ColumnIdentifierContext.class,0);
		}
		public ColumnExprIdentifierContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprFunctionContext extends ColumnExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(ClickHouseParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ClickHouseParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ClickHouseParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ClickHouseParser.RPAREN, i);
		}
		public TerminalNode DISTINCT() { return getToken(ClickHouseParser.DISTINCT, 0); }
		public ColumnArgListContext columnArgList() {
			return getRuleContext(ColumnArgListContext.class,0);
		}
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnExprFunctionContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprAsteriskContext extends ColumnExprContext {
		public TerminalNode ASTERISK() { return getToken(ClickHouseParser.ASTERISK, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public ColumnExprAsteriskContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprAsterisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnExprContext columnExpr() throws RecognitionException {
		return columnExpr(0);
	}

	private ColumnExprContext columnExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ColumnExprContext _localctx = new ColumnExprContext(_ctx, _parentState);
		ColumnExprContext _prevctx = _localctx;
		int _startState = 168;
		enterRecursionRule(_localctx, 168, RULE_columnExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				_localctx = new ColumnExprCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1491);
				match(CASE);
				setState(1493);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1492);
					columnExpr(0);
					}
					break;
				}
				setState(1500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1495);
					match(WHEN);
					setState(1496);
					columnExpr(0);
					setState(1497);
					match(THEN);
					setState(1498);
					columnExpr(0);
					}
					}
					setState(1502);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1504);
					match(ELSE);
					setState(1505);
					columnExpr(0);
					}
				}

				setState(1508);
				match(END);
				}
				break;
			case 2:
				{
				_localctx = new ColumnExprCastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1510);
				match(CAST);
				setState(1511);
				match(LPAREN);
				setState(1512);
				columnExpr(0);
				setState(1513);
				match(AS);
				setState(1514);
				columnTypeExpr();
				setState(1515);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new ColumnExprDateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1517);
				match(DATE);
				setState(1518);
				match(STRING_LITERAL);
				}
				break;
			case 4:
				{
				_localctx = new ColumnExprExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1519);
				match(EXTRACT);
				setState(1520);
				match(LPAREN);
				setState(1521);
				interval();
				setState(1522);
				match(FROM);
				setState(1523);
				columnExpr(0);
				setState(1524);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new ColumnExprIntervalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1526);
				match(INTERVAL);
				setState(1527);
				columnExpr(0);
				setState(1528);
				interval();
				}
				break;
			case 6:
				{
				_localctx = new ColumnExprSubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1530);
				match(SUBSTRING);
				setState(1531);
				match(LPAREN);
				setState(1532);
				columnExpr(0);
				setState(1533);
				match(FROM);
				setState(1534);
				columnExpr(0);
				setState(1537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1535);
					match(FOR);
					setState(1536);
					columnExpr(0);
					}
				}

				setState(1539);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new ColumnExprTimestampContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1541);
				match(TIMESTAMP);
				setState(1542);
				match(STRING_LITERAL);
				}
				break;
			case 8:
				{
				_localctx = new ColumnExprTrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1543);
				match(TRIM);
				setState(1544);
				match(LPAREN);
				setState(1545);
				_la = _input.LA(1);
				if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1546);
				match(STRING_LITERAL);
				setState(1547);
				match(FROM);
				setState(1548);
				columnExpr(0);
				setState(1549);
				match(RPAREN);
				}
				break;
			case 9:
				{
				_localctx = new ColumnExprFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1551);
				identifier();
				setState(1557);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1552);
					match(LPAREN);
					setState(1554);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT) | (1L << FREEZE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (QUARTER - 64)) | (1L << (RANGE - 64)) | (1L << (RELOAD - 64)) | (1L << (REMOVE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (FLOATING_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (ASTERISK - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (DASH - 194)) | (1L << (DOT - 194)) | (1L << (LBRACKET - 194)) | (1L << (LPAREN - 194)) | (1L << (PLUS - 194)))) != 0)) {
						{
						setState(1553);
						columnExprList();
						}
					}

					setState(1556);
					match(RPAREN);
					}
					break;
				}
				setState(1559);
				match(LPAREN);
				setState(1561);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1560);
					match(DISTINCT);
					}
					break;
				}
				setState(1564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT) | (1L << FREEZE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (QUARTER - 64)) | (1L << (RANGE - 64)) | (1L << (RELOAD - 64)) | (1L << (REMOVE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (FLOATING_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (ASTERISK - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (DASH - 194)) | (1L << (DOT - 194)) | (1L << (LBRACKET - 194)) | (1L << (LPAREN - 194)) | (1L << (PLUS - 194)))) != 0)) {
					{
					setState(1563);
					columnArgList();
					}
				}

				setState(1566);
				match(RPAREN);
				}
				break;
			case 10:
				{
				_localctx = new ColumnExprLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1568);
				literal();
				}
				break;
			case 11:
				{
				_localctx = new ColumnExprNegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1569);
				match(DASH);
				setState(1570);
				columnExpr(17);
				}
				break;
			case 12:
				{
				_localctx = new ColumnExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1571);
				match(NOT);
				setState(1572);
				columnExpr(12);
				}
				break;
			case 13:
				{
				_localctx = new ColumnExprAsteriskContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT) | (1L << FREEZE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (QUARTER - 64)) | (1L << (RANGE - 64)) | (1L << (RELOAD - 64)) | (1L << (REMOVE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)))) != 0)) {
					{
					setState(1573);
					tableIdentifier();
					setState(1574);
					match(DOT);
					}
				}

				setState(1578);
				match(ASTERISK);
				}
				break;
			case 14:
				{
				_localctx = new ColumnExprSubqueryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1579);
				match(LPAREN);
				setState(1580);
				selectUnionStmt();
				setState(1581);
				match(RPAREN);
				}
				break;
			case 15:
				{
				_localctx = new ColumnExprParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1583);
				match(LPAREN);
				setState(1584);
				columnExpr(0);
				setState(1585);
				match(RPAREN);
				}
				break;
			case 16:
				{
				_localctx = new ColumnExprTupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1587);
				match(LPAREN);
				setState(1588);
				columnExprList();
				setState(1589);
				match(RPAREN);
				}
				break;
			case 17:
				{
				_localctx = new ColumnExprArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1591);
				match(LBRACKET);
				setState(1593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT) | (1L << FREEZE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (QUARTER - 64)) | (1L << (RANGE - 64)) | (1L << (RELOAD - 64)) | (1L << (REMOVE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (FLOATING_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (ASTERISK - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (DASH - 194)) | (1L << (DOT - 194)) | (1L << (LBRACKET - 194)) | (1L << (LPAREN - 194)) | (1L << (PLUS - 194)))) != 0)) {
					{
					setState(1592);
					columnExprList();
					}
				}

				setState(1595);
				match(RBRACKET);
				}
				break;
			case 18:
				{
				_localctx = new ColumnExprIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1596);
				columnIdentifier();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1670);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1668);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
					case 1:
						{
						_localctx = new ColumnExprPrecedence1Context(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1599);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1600);
						_la = _input.LA(1);
						if ( !(((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (ASTERISK - 188)) | (1L << (PERCENT - 188)) | (1L << (SLASH - 188)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1601);
						columnExpr(17);
						}
						break;
					case 2:
						{
						_localctx = new ColumnExprPrecedence2Context(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1602);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1603);
						_la = _input.LA(1);
						if ( !(((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (CONCAT - 193)) | (1L << (DASH - 193)) | (1L << (PLUS - 193)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1604);
						columnExpr(16);
						}
						break;
					case 3:
						{
						_localctx = new ColumnExprPrecedence3Context(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1605);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1624);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
						case 1:
							{
							setState(1606);
							match(EQ_DOUBLE);
							}
							break;
						case 2:
							{
							setState(1607);
							match(EQ_SINGLE);
							}
							break;
						case 3:
							{
							setState(1608);
							match(NOT_EQ);
							}
							break;
						case 4:
							{
							setState(1609);
							match(LE);
							}
							break;
						case 5:
							{
							setState(1610);
							match(GE);
							}
							break;
						case 6:
							{
							setState(1611);
							match(LT);
							}
							break;
						case 7:
							{
							setState(1612);
							match(GT);
							}
							break;
						case 8:
							{
							setState(1614);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==GLOBAL) {
								{
								setState(1613);
								match(GLOBAL);
								}
							}

							setState(1617);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NOT) {
								{
								setState(1616);
								match(NOT);
								}
							}

							setState(1619);
							match(IN);
							}
							break;
						case 9:
							{
							setState(1621);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NOT) {
								{
								setState(1620);
								match(NOT);
								}
							}

							setState(1623);
							_la = _input.LA(1);
							if ( !(_la==ILIKE || _la==LIKE) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							break;
						}
						setState(1626);
						columnExpr(15);
						}
						break;
					case 4:
						{
						_localctx = new ColumnExprAndContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1627);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1628);
						match(AND);
						setState(1629);
						columnExpr(12);
						}
						break;
					case 5:
						{
						_localctx = new ColumnExprOrContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1630);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1631);
						match(OR);
						setState(1632);
						columnExpr(11);
						}
						break;
					case 6:
						{
						_localctx = new ColumnExprBetweenContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1633);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1635);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1634);
							match(NOT);
							}
						}

						setState(1637);
						match(BETWEEN);
						setState(1638);
						columnExpr(0);
						setState(1639);
						match(AND);
						setState(1640);
						columnExpr(10);
						}
						break;
					case 7:
						{
						_localctx = new ColumnExprTernaryOpContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1642);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1643);
						match(QUERY);
						setState(1644);
						columnExpr(0);
						setState(1645);
						match(COLON);
						setState(1646);
						columnExpr(8);
						}
						break;
					case 8:
						{
						_localctx = new ColumnExprArrayAccessContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1648);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1649);
						match(LBRACKET);
						setState(1650);
						columnExpr(0);
						setState(1651);
						match(RBRACKET);
						}
						break;
					case 9:
						{
						_localctx = new ColumnExprTupleAccessContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1653);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1654);
						match(DOT);
						setState(1655);
						match(DECIMAL_LITERAL);
						}
						break;
					case 10:
						{
						_localctx = new ColumnExprIsNullContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1656);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1657);
						match(IS);
						setState(1659);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1658);
							match(NOT);
							}
						}

						setState(1661);
						match(NULL_SQL);
						}
						break;
					case 11:
						{
						_localctx = new ColumnExprAliasContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1662);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1666);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case DATE:
						case FIRST:
						case ID:
						case KEY:
						case IDENTIFIER:
							{
							setState(1663);
							alias();
							}
							break;
						case AS:
							{
							setState(1664);
							match(AS);
							setState(1665);
							identifier();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					}
				}
				setState(1672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ColumnArgListContext extends ParserRuleContext {
		public List<ColumnArgExprContext> columnArgExpr() {
			return getRuleContexts(ColumnArgExprContext.class);
		}
		public ColumnArgExprContext columnArgExpr(int i) {
			return getRuleContext(ColumnArgExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnArgList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnArgListContext columnArgList() throws RecognitionException {
		ColumnArgListContext _localctx = new ColumnArgListContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_columnArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
			columnArgExpr();
			setState(1678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1674);
				match(COMMA);
				setState(1675);
				columnArgExpr();
				}
				}
				setState(1680);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnArgExprContext extends ParserRuleContext {
		public ColumnLambdaExprContext columnLambdaExpr() {
			return getRuleContext(ColumnLambdaExprContext.class,0);
		}
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnArgExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnArgExprContext columnArgExpr() throws RecognitionException {
		ColumnArgExprContext _localctx = new ColumnArgExprContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_columnArgExpr);
		try {
			setState(1683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1681);
				columnLambdaExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1682);
				columnExpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnLambdaExprContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(ClickHouseParser.ARROW, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnLambdaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnLambdaExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnLambdaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnLambdaExprContext columnLambdaExpr() throws RecognitionException {
		ColumnLambdaExprContext _localctx = new ColumnLambdaExprContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_columnLambdaExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1685);
				match(LPAREN);
				setState(1686);
				identifier();
				setState(1691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1687);
					match(COMMA);
					setState(1688);
					identifier();
					}
					}
					setState(1693);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1694);
				match(RPAREN);
				}
				break;
			case AFTER:
			case ALIAS:
			case ALL:
			case ALTER:
			case AND:
			case ANTI:
			case ANY:
			case ARRAY:
			case AS:
			case ASCENDING:
			case ASOF:
			case ASYNC:
			case ATTACH:
			case BETWEEN:
			case BOTH:
			case BY:
			case CASE:
			case CAST:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CODEC:
			case COLLATE:
			case COLUMN:
			case COMMENT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CUBE:
			case DATABASE:
			case DATABASES:
			case DATE:
			case DAY:
			case DEDUPLICATE:
			case DEFAULT:
			case DELAY:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DESCRIBE:
			case DETACH:
			case DICTIONARIES:
			case DICTIONARY:
			case DISK:
			case DISTINCT:
			case DISTRIBUTED:
			case DROP:
			case ELSE:
			case END:
			case ENGINE:
			case EVENTS:
			case EXISTS:
			case EXPLAIN:
			case EXPRESSION:
			case EXTRACT:
			case FETCHES:
			case FINAL:
			case FIRST:
			case FLUSH:
			case FOR:
			case FORMAT:
			case FREEZE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GLOBAL:
			case GRANULARITY:
			case GROUP:
			case HAVING:
			case HIERARCHICAL:
			case HOUR:
			case ID:
			case IF:
			case ILIKE:
			case IN:
			case INDEX:
			case INJECTIVE:
			case INNER:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case IS_OBJECT_ID:
			case JOIN:
			case KEY:
			case KILL:
			case LAST:
			case LAYOUT:
			case LEADING:
			case LEFT:
			case LIFETIME:
			case LIKE:
			case LIMIT:
			case LIVE:
			case LOCAL:
			case LOGS:
			case MATERIALIZED:
			case MAX:
			case MERGES:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MOVE:
			case MUTATION:
			case NO:
			case NOT:
			case NULLS:
			case OFFSET:
			case ON:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case OUTER:
			case OUTFILE:
			case PARTITION:
			case POPULATE:
			case PREWHERE:
			case PRIMARY:
			case QUARTER:
			case RANGE:
			case RELOAD:
			case REMOVE:
			case RENAME:
			case REPLACE:
			case REPLICA:
			case REPLICATED:
			case RIGHT:
			case ROLLUP:
			case SAMPLE:
			case SECOND:
			case SELECT:
			case SEMI:
			case SENDS:
			case SET:
			case SETTINGS:
			case SHOW:
			case SOURCE:
			case START:
			case STOP:
			case SUBSTRING:
			case SYNC:
			case SYNTAX:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TEMPORARY:
			case TEST:
			case THEN:
			case TIES:
			case TIMEOUT:
			case TIMESTAMP:
			case TO:
			case TOP:
			case TOTALS:
			case TRAILING:
			case TRIM:
			case TRUNCATE:
			case TTL:
			case TYPE:
			case UNION:
			case UPDATE:
			case USE:
			case USING:
			case UUID:
			case VALUES:
			case VIEW:
			case VOLUME:
			case WATCH:
			case WEEK:
			case WHEN:
			case WHERE:
			case WITH:
			case YEAR:
			case JSON_FALSE:
			case JSON_TRUE:
			case IDENTIFIER:
				{
				setState(1696);
				identifier();
				setState(1701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1697);
					match(COMMA);
					setState(1698);
					identifier();
					}
					}
					setState(1703);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1706);
			match(ARROW);
			setState(1707);
			columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnIdentifierContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public ColumnIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnIdentifierContext columnIdentifier() throws RecognitionException {
		ColumnIdentifierContext _localctx = new ColumnIdentifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_columnIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(1709);
				tableIdentifier();
				setState(1710);
				match(DOT);
				}
				break;
			}
			setState(1714);
			nestedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedIdentifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public NestedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitNestedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedIdentifierContext nestedIdentifier() throws RecognitionException {
		NestedIdentifierContext _localctx = new NestedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_nestedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1716);
			identifier();
			setState(1719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1717);
				match(DOT);
				setState(1718);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableExprContext extends ParserRuleContext {
		public TableExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableExpr; }

		public TableExprContext() { }
		public void copyFrom(TableExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableExprIdentifierContext extends TableExprContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableExprIdentifierContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableExprIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableExprSubqueryContext extends TableExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TableExprSubqueryContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableExprSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableExprAliasContext extends TableExprContext {
		public TableExprContext tableExpr() {
			return getRuleContext(TableExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableExprAliasContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableExprAlias(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableExprFunctionContext extends TableExprContext {
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public TableExprFunctionContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableExprFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableExprContext tableExpr() throws RecognitionException {
		return tableExpr(0);
	}

	private TableExprContext tableExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TableExprContext _localctx = new TableExprContext(_ctx, _parentState);
		TableExprContext _prevctx = _localctx;
		int _startState = 180;
		enterRecursionRule(_localctx, 180, RULE_tableExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				_localctx = new TableExprIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1722);
				tableIdentifier();
				}
				break;
			case 2:
				{
				_localctx = new TableExprFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1723);
				tableFunctionExpr();
				}
				break;
			case 3:
				{
				_localctx = new TableExprSubqueryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1724);
				match(LPAREN);
				setState(1725);
				selectUnionStmt();
				setState(1726);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1738);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TableExprAliasContext(new TableExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_tableExpr);
					setState(1730);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1734);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DATE:
					case FIRST:
					case ID:
					case KEY:
					case IDENTIFIER:
						{
						setState(1731);
						alias();
						}
						break;
					case AS:
						{
						setState(1732);
						match(AS);
						setState(1733);
						identifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1740);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TableFunctionExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TableArgListContext tableArgList() {
			return getRuleContext(TableArgListContext.class,0);
		}
		public TableFunctionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFunctionExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableFunctionExprContext tableFunctionExpr() throws RecognitionException {
		TableFunctionExprContext _localctx = new TableFunctionExprContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_tableFunctionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1741);
			identifier();
			setState(1742);
			match(LPAREN);
			setState(1744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT) | (1L << FREEZE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (QUARTER - 64)) | (1L << (RANGE - 64)) | (1L << (RELOAD - 64)) | (1L << (REMOVE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (FLOATING_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (DASH - 194)) | (1L << (DOT - 194)) | (1L << (PLUS - 194)))) != 0)) {
				{
				setState(1743);
				tableArgList();
				}
			}

			setState(1746);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(1748);
				databaseIdentifier();
				setState(1749);
				match(DOT);
				}
				break;
			}
			setState(1753);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableArgListContext extends ParserRuleContext {
		public List<TableArgExprContext> tableArgExpr() {
			return getRuleContexts(TableArgExprContext.class);
		}
		public TableArgExprContext tableArgExpr(int i) {
			return getRuleContext(TableArgExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public TableArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableArgList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableArgListContext tableArgList() throws RecognitionException {
		TableArgListContext _localctx = new TableArgListContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_tableArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			tableArgExpr();
			setState(1760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1756);
				match(COMMA);
				setState(1757);
				tableArgExpr();
				}
				}
				setState(1762);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableArgExprContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TableArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableArgExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableArgExprContext tableArgExpr() throws RecognitionException {
		TableArgExprContext _localctx = new TableArgExprContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_tableArgExpr);
		try {
			setState(1766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1763);
				tableIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1764);
				tableFunctionExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1765);
				literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabaseIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DatabaseIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDatabaseIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseIdentifierContext databaseIdentifier() throws RecognitionException {
		DatabaseIdentifierContext _localctx = new DatabaseIdentifierContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_databaseIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1768);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingLiteralContext extends ParserRuleContext {
		public TerminalNode FLOATING_LITERAL() { return getToken(ClickHouseParser.FLOATING_LITERAL, 0); }
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public List<TerminalNode> DECIMAL_LITERAL() { return getTokens(ClickHouseParser.DECIMAL_LITERAL); }
		public TerminalNode DECIMAL_LITERAL(int i) {
			return getToken(ClickHouseParser.DECIMAL_LITERAL, i);
		}
		public TerminalNode OCTAL_LITERAL() { return getToken(ClickHouseParser.OCTAL_LITERAL, 0); }
		public FloatingLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitFloatingLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingLiteralContext floatingLiteral() throws RecognitionException {
		FloatingLiteralContext _localctx = new FloatingLiteralContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_floatingLiteral);
		int _la;
		try {
			setState(1778);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOATING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1770);
				match(FLOATING_LITERAL);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1771);
				match(DOT);
				setState(1772);
				_la = _input.LA(1);
				if ( !(_la==OCTAL_LITERAL || _la==DECIMAL_LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1773);
				match(DECIMAL_LITERAL);
				setState(1774);
				match(DOT);
				setState(1776);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1775);
					_la = _input.LA(1);
					if ( !(_la==OCTAL_LITERAL || _la==DECIMAL_LITERAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberLiteralContext extends ParserRuleContext {
		public FloatingLiteralContext floatingLiteral() {
			return getRuleContext(FloatingLiteralContext.class,0);
		}
		public TerminalNode OCTAL_LITERAL() { return getToken(ClickHouseParser.OCTAL_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEXADECIMAL_LITERAL() { return getToken(ClickHouseParser.HEXADECIMAL_LITERAL, 0); }
		public TerminalNode INF() { return getToken(ClickHouseParser.INF, 0); }
		public TerminalNode NAN_SQL() { return getToken(ClickHouseParser.NAN_SQL, 0); }
		public TerminalNode PLUS() { return getToken(ClickHouseParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(ClickHouseParser.DASH, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DASH || _la==PLUS) {
				{
				setState(1780);
				_la = _input.LA(1);
				if ( !(_la==DASH || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1783);
				floatingLiteral();
				}
				break;
			case 2:
				{
				setState(1784);
				match(OCTAL_LITERAL);
				}
				break;
			case 3:
				{
				setState(1785);
				match(DECIMAL_LITERAL);
				}
				break;
			case 4:
				{
				setState(1786);
				match(HEXADECIMAL_LITERAL);
				}
				break;
			case 5:
				{
				setState(1787);
				match(INF);
				}
				break;
			case 6:
				{
				setState(1788);
				match(NAN_SQL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode NULL_SQL() { return getToken(ClickHouseParser.NULL_SQL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_literal);
		try {
			setState(1794);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INF:
			case NAN_SQL:
			case FLOATING_LITERAL:
			case OCTAL_LITERAL:
			case DECIMAL_LITERAL:
			case HEXADECIMAL_LITERAL:
			case DASH:
			case DOT:
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1791);
				numberLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1792);
				match(STRING_LITERAL);
				}
				break;
			case NULL_SQL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1793);
				match(NULL_SQL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode SECOND() { return getToken(ClickHouseParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(ClickHouseParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(ClickHouseParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(ClickHouseParser.DAY, 0); }
		public TerminalNode WEEK() { return getToken(ClickHouseParser.WEEK, 0); }
		public TerminalNode MONTH() { return getToken(ClickHouseParser.MONTH, 0); }
		public TerminalNode QUARTER() { return getToken(ClickHouseParser.QUARTER, 0); }
		public TerminalNode YEAR() { return getToken(ClickHouseParser.YEAR, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			_la = _input.LA(1);
			if ( !(_la==DAY || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (HOUR - 72)) | (1L << (MINUTE - 72)) | (1L << (MONTH - 72)) | (1L << (QUARTER - 72)) | (1L << (SECOND - 72)))) != 0) || _la==WEEK || _la==YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode AFTER() { return getToken(ClickHouseParser.AFTER, 0); }
		public TerminalNode ALIAS() { return getToken(ClickHouseParser.ALIAS, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(ClickHouseParser.ALTER, 0); }
		public TerminalNode AND() { return getToken(ClickHouseParser.AND, 0); }
		public TerminalNode ANTI() { return getToken(ClickHouseParser.ANTI, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseParser.ANY, 0); }
		public TerminalNode ARRAY() { return getToken(ClickHouseParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public TerminalNode ASCENDING() { return getToken(ClickHouseParser.ASCENDING, 0); }
		public TerminalNode ASOF() { return getToken(ClickHouseParser.ASOF, 0); }
		public TerminalNode ASYNC() { return getToken(ClickHouseParser.ASYNC, 0); }
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode BETWEEN() { return getToken(ClickHouseParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(ClickHouseParser.BOTH, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public TerminalNode CASE() { return getToken(ClickHouseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(ClickHouseParser.CAST, 0); }
		public TerminalNode CHECK() { return getToken(ClickHouseParser.CHECK, 0); }
		public TerminalNode CLEAR() { return getToken(ClickHouseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(ClickHouseParser.CLUSTER, 0); }
		public TerminalNode CODEC() { return getToken(ClickHouseParser.CODEC, 0); }
		public TerminalNode COLLATE() { return getToken(ClickHouseParser.COLLATE, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode CONSTRAINT() { return getToken(ClickHouseParser.CONSTRAINT, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode CROSS() { return getToken(ClickHouseParser.CROSS, 0); }
		public TerminalNode CUBE() { return getToken(ClickHouseParser.CUBE, 0); }
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(ClickHouseParser.DATABASES, 0); }
		public TerminalNode DATE() { return getToken(ClickHouseParser.DATE, 0); }
		public TerminalNode DEDUPLICATE() { return getToken(ClickHouseParser.DEDUPLICATE, 0); }
		public TerminalNode DEFAULT() { return getToken(ClickHouseParser.DEFAULT, 0); }
		public TerminalNode DELAY() { return getToken(ClickHouseParser.DELAY, 0); }
		public TerminalNode DELETE() { return getToken(ClickHouseParser.DELETE, 0); }
		public TerminalNode DESCRIBE() { return getToken(ClickHouseParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(ClickHouseParser.DESC, 0); }
		public TerminalNode DESCENDING() { return getToken(ClickHouseParser.DESCENDING, 0); }
		public TerminalNode DETACH() { return getToken(ClickHouseParser.DETACH, 0); }
		public TerminalNode DICTIONARIES() { return getToken(ClickHouseParser.DICTIONARIES, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TerminalNode DISK() { return getToken(ClickHouseParser.DISK, 0); }
		public TerminalNode DISTINCT() { return getToken(ClickHouseParser.DISTINCT, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(ClickHouseParser.DISTRIBUTED, 0); }
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode ELSE() { return getToken(ClickHouseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(ClickHouseParser.END, 0); }
		public TerminalNode ENGINE() { return getToken(ClickHouseParser.ENGINE, 0); }
		public TerminalNode EVENTS() { return getToken(ClickHouseParser.EVENTS, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(ClickHouseParser.EXPLAIN, 0); }
		public TerminalNode EXPRESSION() { return getToken(ClickHouseParser.EXPRESSION, 0); }
		public TerminalNode EXTRACT() { return getToken(ClickHouseParser.EXTRACT, 0); }
		public TerminalNode FETCHES() { return getToken(ClickHouseParser.FETCHES, 0); }
		public TerminalNode FINAL() { return getToken(ClickHouseParser.FINAL, 0); }
		public TerminalNode FIRST() { return getToken(ClickHouseParser.FIRST, 0); }
		public TerminalNode FLUSH() { return getToken(ClickHouseParser.FLUSH, 0); }
		public TerminalNode FOR() { return getToken(ClickHouseParser.FOR, 0); }
		public TerminalNode FORMAT() { return getToken(ClickHouseParser.FORMAT, 0); }
		public TerminalNode FREEZE() { return getToken(ClickHouseParser.FREEZE, 0); }
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TerminalNode FULL() { return getToken(ClickHouseParser.FULL, 0); }
		public TerminalNode FUNCTION() { return getToken(ClickHouseParser.FUNCTION, 0); }
		public TerminalNode GLOBAL() { return getToken(ClickHouseParser.GLOBAL, 0); }
		public TerminalNode GRANULARITY() { return getToken(ClickHouseParser.GRANULARITY, 0); }
		public TerminalNode GROUP() { return getToken(ClickHouseParser.GROUP, 0); }
		public TerminalNode HAVING() { return getToken(ClickHouseParser.HAVING, 0); }
		public TerminalNode HIERARCHICAL() { return getToken(ClickHouseParser.HIERARCHICAL, 0); }
		public TerminalNode ID() { return getToken(ClickHouseParser.ID, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode ILIKE() { return getToken(ClickHouseParser.ILIKE, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public TerminalNode INJECTIVE() { return getToken(ClickHouseParser.INJECTIVE, 0); }
		public TerminalNode INNER() { return getToken(ClickHouseParser.INNER, 0); }
		public TerminalNode INSERT() { return getToken(ClickHouseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(ClickHouseParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(ClickHouseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(ClickHouseParser.IS, 0); }
		public TerminalNode IS_OBJECT_ID() { return getToken(ClickHouseParser.IS_OBJECT_ID, 0); }
		public TerminalNode JOIN() { return getToken(ClickHouseParser.JOIN, 0); }
		public TerminalNode JSON_FALSE() { return getToken(ClickHouseParser.JSON_FALSE, 0); }
		public TerminalNode JSON_TRUE() { return getToken(ClickHouseParser.JSON_TRUE, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseParser.KEY, 0); }
		public TerminalNode KILL() { return getToken(ClickHouseParser.KILL, 0); }
		public TerminalNode LAST() { return getToken(ClickHouseParser.LAST, 0); }
		public TerminalNode LAYOUT() { return getToken(ClickHouseParser.LAYOUT, 0); }
		public TerminalNode LEADING() { return getToken(ClickHouseParser.LEADING, 0); }
		public TerminalNode LEFT() { return getToken(ClickHouseParser.LEFT, 0); }
		public TerminalNode LIFETIME() { return getToken(ClickHouseParser.LIFETIME, 0); }
		public TerminalNode LIKE() { return getToken(ClickHouseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(ClickHouseParser.LIMIT, 0); }
		public TerminalNode LIVE() { return getToken(ClickHouseParser.LIVE, 0); }
		public TerminalNode LOCAL() { return getToken(ClickHouseParser.LOCAL, 0); }
		public TerminalNode LOGS() { return getToken(ClickHouseParser.LOGS, 0); }
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseParser.MATERIALIZED, 0); }
		public TerminalNode MAX() { return getToken(ClickHouseParser.MAX, 0); }
		public TerminalNode MERGES() { return getToken(ClickHouseParser.MERGES, 0); }
		public TerminalNode MIN() { return getToken(ClickHouseParser.MIN, 0); }
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode MOVE() { return getToken(ClickHouseParser.MOVE, 0); }
		public TerminalNode MUTATION() { return getToken(ClickHouseParser.MUTATION, 0); }
		public TerminalNode NO() { return getToken(ClickHouseParser.NO, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode NULLS() { return getToken(ClickHouseParser.NULLS, 0); }
		public TerminalNode OFFSET() { return getToken(ClickHouseParser.OFFSET, 0); }
		public TerminalNode ON() { return getToken(ClickHouseParser.ON, 0); }
		public TerminalNode OPTIMIZE() { return getToken(ClickHouseParser.OPTIMIZE, 0); }
		public TerminalNode OR() { return getToken(ClickHouseParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(ClickHouseParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(ClickHouseParser.OUTER, 0); }
		public TerminalNode OUTFILE() { return getToken(ClickHouseParser.OUTFILE, 0); }
		public TerminalNode PARTITION() { return getToken(ClickHouseParser.PARTITION, 0); }
		public TerminalNode POPULATE() { return getToken(ClickHouseParser.POPULATE, 0); }
		public TerminalNode PREWHERE() { return getToken(ClickHouseParser.PREWHERE, 0); }
		public TerminalNode PRIMARY() { return getToken(ClickHouseParser.PRIMARY, 0); }
		public TerminalNode RANGE() { return getToken(ClickHouseParser.RANGE, 0); }
		public TerminalNode RELOAD() { return getToken(ClickHouseParser.RELOAD, 0); }
		public TerminalNode REMOVE() { return getToken(ClickHouseParser.REMOVE, 0); }
		public TerminalNode RENAME() { return getToken(ClickHouseParser.RENAME, 0); }
		public TerminalNode REPLACE() { return getToken(ClickHouseParser.REPLACE, 0); }
		public TerminalNode REPLICA() { return getToken(ClickHouseParser.REPLICA, 0); }
		public TerminalNode REPLICATED() { return getToken(ClickHouseParser.REPLICATED, 0); }
		public TerminalNode RIGHT() { return getToken(ClickHouseParser.RIGHT, 0); }
		public TerminalNode ROLLUP() { return getToken(ClickHouseParser.ROLLUP, 0); }
		public TerminalNode SAMPLE() { return getToken(ClickHouseParser.SAMPLE, 0); }
		public TerminalNode SELECT() { return getToken(ClickHouseParser.SELECT, 0); }
		public TerminalNode SEMI() { return getToken(ClickHouseParser.SEMI, 0); }
		public TerminalNode SENDS() { return getToken(ClickHouseParser.SENDS, 0); }
		public TerminalNode SET() { return getToken(ClickHouseParser.SET, 0); }
		public TerminalNode SETTINGS() { return getToken(ClickHouseParser.SETTINGS, 0); }
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode SOURCE() { return getToken(ClickHouseParser.SOURCE, 0); }
		public TerminalNode START() { return getToken(ClickHouseParser.START, 0); }
		public TerminalNode STOP() { return getToken(ClickHouseParser.STOP, 0); }
		public TerminalNode SUBSTRING() { return getToken(ClickHouseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(ClickHouseParser.SYNC, 0); }
		public TerminalNode SYNTAX() { return getToken(ClickHouseParser.SYNTAX, 0); }
		public TerminalNode SYSTEM() { return getToken(ClickHouseParser.SYSTEM, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(ClickHouseParser.TABLES, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public TerminalNode TEST() { return getToken(ClickHouseParser.TEST, 0); }
		public TerminalNode THEN() { return getToken(ClickHouseParser.THEN, 0); }
		public TerminalNode TIES() { return getToken(ClickHouseParser.TIES, 0); }
		public TerminalNode TIMEOUT() { return getToken(ClickHouseParser.TIMEOUT, 0); }
		public TerminalNode TIMESTAMP() { return getToken(ClickHouseParser.TIMESTAMP, 0); }
		public TerminalNode TOTALS() { return getToken(ClickHouseParser.TOTALS, 0); }
		public TerminalNode TRAILING() { return getToken(ClickHouseParser.TRAILING, 0); }
		public TerminalNode TRIM() { return getToken(ClickHouseParser.TRIM, 0); }
		public TerminalNode TRUNCATE() { return getToken(ClickHouseParser.TRUNCATE, 0); }
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TerminalNode TOP() { return getToken(ClickHouseParser.TOP, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public TerminalNode TYPE() { return getToken(ClickHouseParser.TYPE, 0); }
		public TerminalNode UNION() { return getToken(ClickHouseParser.UNION, 0); }
		public TerminalNode UPDATE() { return getToken(ClickHouseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(ClickHouseParser.USE, 0); }
		public TerminalNode USING() { return getToken(ClickHouseParser.USING, 0); }
		public TerminalNode UUID() { return getToken(ClickHouseParser.UUID, 0); }
		public TerminalNode VALUES() { return getToken(ClickHouseParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TerminalNode VOLUME() { return getToken(ClickHouseParser.VOLUME, 0); }
		public TerminalNode WATCH() { return getToken(ClickHouseParser.WATCH, 0); }
		public TerminalNode WHEN() { return getToken(ClickHouseParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(ClickHouseParser.WHERE, 0); }
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1798);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT) | (1L << FREEZE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MODIFY - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (RANGE - 64)) | (1L << (RELOAD - 64)) | (1L << (REMOVE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordForAliasContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(ClickHouseParser.DATE, 0); }
		public TerminalNode FIRST() { return getToken(ClickHouseParser.FIRST, 0); }
		public TerminalNode ID() { return getToken(ClickHouseParser.ID, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseParser.KEY, 0); }
		public KeywordForAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordForAlias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitKeywordForAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordForAliasContext keywordForAlias() throws RecognitionException {
		KeywordForAliasContext _localctx = new KeywordForAliasContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_keywordForAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1800);
			_la = _input.LA(1);
			if ( !(((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (DATE - 33)) | (1L << (FIRST - 33)) | (1L << (ID - 33)) | (1L << (KEY - 33)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ClickHouseParser.IDENTIFIER, 0); }
		public KeywordForAliasContext keywordForAlias() {
			return getRuleContext(KeywordForAliasContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_alias);
		try {
			setState(1804);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1802);
				match(IDENTIFIER);
				}
				break;
			case DATE:
			case FIRST:
			case ID:
			case KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1803);
				keywordForAlias();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ClickHouseParser.IDENTIFIER, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_identifier);
		try {
			setState(1809);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1806);
				match(IDENTIFIER);
				}
				break;
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case QUARTER:
			case SECOND:
			case WEEK:
			case YEAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1807);
				interval();
				}
				break;
			case AFTER:
			case ALIAS:
			case ALL:
			case ALTER:
			case AND:
			case ANTI:
			case ANY:
			case ARRAY:
			case AS:
			case ASCENDING:
			case ASOF:
			case ASYNC:
			case ATTACH:
			case BETWEEN:
			case BOTH:
			case BY:
			case CASE:
			case CAST:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CODEC:
			case COLLATE:
			case COLUMN:
			case COMMENT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CUBE:
			case DATABASE:
			case DATABASES:
			case DATE:
			case DEDUPLICATE:
			case DEFAULT:
			case DELAY:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DESCRIBE:
			case DETACH:
			case DICTIONARIES:
			case DICTIONARY:
			case DISK:
			case DISTINCT:
			case DISTRIBUTED:
			case DROP:
			case ELSE:
			case END:
			case ENGINE:
			case EVENTS:
			case EXISTS:
			case EXPLAIN:
			case EXPRESSION:
			case EXTRACT:
			case FETCHES:
			case FINAL:
			case FIRST:
			case FLUSH:
			case FOR:
			case FORMAT:
			case FREEZE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GLOBAL:
			case GRANULARITY:
			case GROUP:
			case HAVING:
			case HIERARCHICAL:
			case ID:
			case IF:
			case ILIKE:
			case IN:
			case INDEX:
			case INJECTIVE:
			case INNER:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case IS_OBJECT_ID:
			case JOIN:
			case KEY:
			case KILL:
			case LAST:
			case LAYOUT:
			case LEADING:
			case LEFT:
			case LIFETIME:
			case LIKE:
			case LIMIT:
			case LIVE:
			case LOCAL:
			case LOGS:
			case MATERIALIZED:
			case MAX:
			case MERGES:
			case MIN:
			case MODIFY:
			case MOVE:
			case MUTATION:
			case NO:
			case NOT:
			case NULLS:
			case OFFSET:
			case ON:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case OUTER:
			case OUTFILE:
			case PARTITION:
			case POPULATE:
			case PREWHERE:
			case PRIMARY:
			case RANGE:
			case RELOAD:
			case REMOVE:
			case RENAME:
			case REPLACE:
			case REPLICA:
			case REPLICATED:
			case RIGHT:
			case ROLLUP:
			case SAMPLE:
			case SELECT:
			case SEMI:
			case SENDS:
			case SET:
			case SETTINGS:
			case SHOW:
			case SOURCE:
			case START:
			case STOP:
			case SUBSTRING:
			case SYNC:
			case SYNTAX:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TEMPORARY:
			case TEST:
			case THEN:
			case TIES:
			case TIMEOUT:
			case TIMESTAMP:
			case TO:
			case TOP:
			case TOTALS:
			case TRAILING:
			case TRIM:
			case TRUNCATE:
			case TTL:
			case TYPE:
			case UNION:
			case UPDATE:
			case USE:
			case USING:
			case UUID:
			case VALUES:
			case VIEW:
			case VOLUME:
			case WATCH:
			case WHEN:
			case WHERE:
			case WITH:
			case JSON_FALSE:
			case JSON_TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1808);
				keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierOrNullContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NULL_SQL() { return getToken(ClickHouseParser.NULL_SQL, 0); }
		public IdentifierOrNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierOrNull; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitIdentifierOrNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierOrNullContext identifierOrNull() throws RecognitionException {
		IdentifierOrNullContext _localctx = new IdentifierOrNullContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_identifierOrNull);
		try {
			setState(1813);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AFTER:
			case ALIAS:
			case ALL:
			case ALTER:
			case AND:
			case ANTI:
			case ANY:
			case ARRAY:
			case AS:
			case ASCENDING:
			case ASOF:
			case ASYNC:
			case ATTACH:
			case BETWEEN:
			case BOTH:
			case BY:
			case CASE:
			case CAST:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CODEC:
			case COLLATE:
			case COLUMN:
			case COMMENT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CUBE:
			case DATABASE:
			case DATABASES:
			case DATE:
			case DAY:
			case DEDUPLICATE:
			case DEFAULT:
			case DELAY:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DESCRIBE:
			case DETACH:
			case DICTIONARIES:
			case DICTIONARY:
			case DISK:
			case DISTINCT:
			case DISTRIBUTED:
			case DROP:
			case ELSE:
			case END:
			case ENGINE:
			case EVENTS:
			case EXISTS:
			case EXPLAIN:
			case EXPRESSION:
			case EXTRACT:
			case FETCHES:
			case FINAL:
			case FIRST:
			case FLUSH:
			case FOR:
			case FORMAT:
			case FREEZE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GLOBAL:
			case GRANULARITY:
			case GROUP:
			case HAVING:
			case HIERARCHICAL:
			case HOUR:
			case ID:
			case IF:
			case ILIKE:
			case IN:
			case INDEX:
			case INJECTIVE:
			case INNER:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case IS_OBJECT_ID:
			case JOIN:
			case KEY:
			case KILL:
			case LAST:
			case LAYOUT:
			case LEADING:
			case LEFT:
			case LIFETIME:
			case LIKE:
			case LIMIT:
			case LIVE:
			case LOCAL:
			case LOGS:
			case MATERIALIZED:
			case MAX:
			case MERGES:
			case MIN:
			case MINUTE:
			case MODIFY:
			case MONTH:
			case MOVE:
			case MUTATION:
			case NO:
			case NOT:
			case NULLS:
			case OFFSET:
			case ON:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case OUTER:
			case OUTFILE:
			case PARTITION:
			case POPULATE:
			case PREWHERE:
			case PRIMARY:
			case QUARTER:
			case RANGE:
			case RELOAD:
			case REMOVE:
			case RENAME:
			case REPLACE:
			case REPLICA:
			case REPLICATED:
			case RIGHT:
			case ROLLUP:
			case SAMPLE:
			case SECOND:
			case SELECT:
			case SEMI:
			case SENDS:
			case SET:
			case SETTINGS:
			case SHOW:
			case SOURCE:
			case START:
			case STOP:
			case SUBSTRING:
			case SYNC:
			case SYNTAX:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TEMPORARY:
			case TEST:
			case THEN:
			case TIES:
			case TIMEOUT:
			case TIMESTAMP:
			case TO:
			case TOP:
			case TOTALS:
			case TRAILING:
			case TRIM:
			case TRUNCATE:
			case TTL:
			case TYPE:
			case UNION:
			case UPDATE:
			case USE:
			case USING:
			case UUID:
			case VALUES:
			case VIEW:
			case VOLUME:
			case WATCH:
			case WEEK:
			case WHEN:
			case WHERE:
			case WITH:
			case YEAR:
			case JSON_FALSE:
			case JSON_TRUE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1811);
				identifier();
				}
				break;
			case NULL_SQL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1812);
				match(NULL_SQL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumValueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitEnumValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1815);
			match(STRING_LITERAL);
			setState(1816);
			match(EQ_SINGLE);
			setState(1817);
			numberLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return dictionaryAttrDfnt_sempred((DictionaryAttrDfntContext)_localctx, predIndex);
		case 13:
			return dictionaryEngineClause_sempred((DictionaryEngineClauseContext)_localctx, predIndex);
		case 26:
			return engineClause_sempred((EngineClauseContext)_localctx, predIndex);
		case 64:
			return joinExpr_sempred((JoinExprContext)_localctx, predIndex);
		case 84:
			return columnExpr_sempred((ColumnExprContext)_localctx, predIndex);
		case 90:
			return tableExpr_sempred((TableExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean dictionaryAttrDfnt_sempred(DictionaryAttrDfntContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !_localctx.attrs.contains("default");
		case 1:
			return !_localctx.attrs.contains("expression");
		case 2:
			return !_localctx.attrs.contains("hierarchical");
		case 3:
			return !_localctx.attrs.contains("injective");
		case 4:
			return !_localctx.attrs.contains("is_object_id");
		}
		return true;
	}
	private boolean dictionaryEngineClause_sempred(DictionaryEngineClauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return !_localctx.clauses.contains("source");
		case 6:
			return !_localctx.clauses.contains("lifetime");
		case 7:
			return !_localctx.clauses.contains("layout");
		case 8:
			return !_localctx.clauses.contains("range");
		case 9:
			return !_localctx.clauses.contains("settings");
		}
		return true;
	}
	private boolean engineClause_sempred(EngineClauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return !_localctx.clauses.contains("orderByClause");
		case 11:
			return !_localctx.clauses.contains("partitionByClause");
		case 12:
			return !_localctx.clauses.contains("primaryKeyClause");
		case 13:
			return !_localctx.clauses.contains("sampleByClause");
		case 14:
			return !_localctx.clauses.contains("ttlClause");
		case 15:
			return !_localctx.clauses.contains("settingsClause");
		}
		return true;
	}
	private boolean joinExpr_sempred(JoinExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean columnExpr_sempred(ColumnExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 16);
		case 19:
			return precpred(_ctx, 15);
		case 20:
			return precpred(_ctx, 14);
		case 21:
			return precpred(_ctx, 11);
		case 22:
			return precpred(_ctx, 10);
		case 23:
			return precpred(_ctx, 9);
		case 24:
			return precpred(_ctx, 8);
		case 25:
			return precpred(_ctx, 19);
		case 26:
			return precpred(_ctx, 18);
		case 27:
			return precpred(_ctx, 13);
		case 28:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean tableExpr_sempred(TableExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00dd\u071e\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\3\2\3\2\3\2\3\2\5\2\u00db\n\2\3\2\3\2\5\2\u00df\n\2\3\2\5\2\u00e2\n"+
		"\2\3\2\5\2\u00e5\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3\u00f9\n\3\3\4\3\4\3\4\3\4\5\4\u00ff\n\4\3\4"+
		"\3\4\3\4\7\4\u0104\n\4\f\4\16\4\u0107\13\4\3\5\3\5\3\5\3\5\3\5\5\5\u010e"+
		"\n\5\3\5\3\5\3\5\5\5\u0113\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u011a\n\5\3\5\3"+
		"\5\3\5\5\5\u011f\n\5\3\5\3\5\3\5\3\5\5\5\u0125\n\5\3\5\3\5\3\5\3\5\5\5"+
		"\u012b\n\5\3\5\3\5\3\5\5\5\u0130\n\5\3\5\3\5\3\5\3\5\5\5\u0136\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0144\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u014b\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0152\n\5\3\5\3\5\3\5\3"+
		"\5\5\5\u0158\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0161\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5\u016b\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u0175\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5\u0189\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0191\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u01a0\n\5\3\6\3\6\3"+
		"\6\7\6\u01a5\n\6\f\6\16\6\u01a8\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u01b5\n\t\3\n\3\n\3\n\3\n\5\n\u01bb\n\n\3\13\3\13\3\13"+
		"\3\13\5\13\u01c1\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u01c8\n\f\3\f\3\f\5\f\u01cc"+
		"\n\f\3\f\5\f\u01cf\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u01d6\n\f\3\f\3\f\5\f\u01da"+
		"\n\f\3\f\5\f\u01dd\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01e8\n"+
		"\f\3\f\3\f\5\f\u01ec\n\f\3\f\5\f\u01ef\n\f\3\f\3\f\3\f\5\f\u01f4\n\f\5"+
		"\f\u01f6\n\f\3\f\5\f\u01f9\n\f\3\f\5\f\u01fc\n\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u0206\n\f\3\f\3\f\5\f\u020a\n\f\3\f\5\f\u020d\n\f\3\f\5"+
		"\f\u0210\n\f\3\f\3\f\3\f\5\f\u0215\n\f\5\f\u0217\n\f\3\f\3\f\3\f\3\f\5"+
		"\f\u021d\n\f\3\f\3\f\3\f\3\f\5\f\u0223\n\f\3\f\3\f\5\f\u0227\n\f\3\f\5"+
		"\f\u022a\n\f\3\f\5\f\u022d\n\f\3\f\5\f\u0230\n\f\3\f\5\f\u0233\n\f\3\f"+
		"\3\f\3\f\5\f\u0238\n\f\3\f\3\f\3\f\3\f\5\f\u023e\n\f\3\f\3\f\5\f\u0242"+
		"\n\f\3\f\5\f\u0245\n\f\3\f\5\f\u0248\n\f\3\f\3\f\5\f\u024c\n\f\3\r\3\r"+
		"\3\r\3\r\7\r\u0252\n\r\f\r\16\r\u0255\13\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u026e\n\16\f\16\16\16\u0271\13\16\3\17\5\17\u0274"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u028a\n\17\f\17\16\17\u028d\13"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u0297\n\21\3\21\5\21"+
		"\u029a\n\21\3\22\3\22\3\22\3\22\3\22\7\22\u02a1\n\22\f\22\16\22\u02a4"+
		"\13\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u02b4\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u02bd\n"+
		"\24\f\24\16\24\u02c0\13\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u02d1\n\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u02de\n\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u02ed\n\33\f\33\16\33\u02f0"+
		"\13\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u02f8\n\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0313\n\34\f\34\16\34\u0316"+
		"\13\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 "+
		"\3 \3 \3 \7 \u0328\n \f \16 \u032b\13 \3!\3!\5!\u032f\n!\3!\3!\3!\5!\u0334"+
		"\n!\3!\5!\u0337\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0341\n\"\3#\3"+
		"#\3#\5#\u0346\n#\3#\3#\5#\u034a\n#\3#\5#\u034d\n#\3#\3#\5#\u0351\n#\3"+
		"#\3#\5#\u0355\n#\3#\3#\3#\5#\u035a\n#\3#\5#\u035d\n#\3#\3#\5#\u0361\n"+
		"#\5#\u0363\n#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\7&\u0374\n"+
		"&\f&\16&\u0377\13&\3&\3&\3\'\3\'\3\'\5\'\u037e\n\'\3\'\5\'\u0381\n\'\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\5(\u038b\n(\3)\3)\5)\u038f\n)\3)\3)\3*\3*\3*\3"+
		"*\5*\u0397\n*\3*\3*\5*\u039b\n*\3*\3*\3*\5*\u03a0\n*\3*\3*\5*\u03a4\n"+
		"*\3*\3*\5*\u03a8\n*\3*\3*\5*\u03ac\n*\3*\3*\5*\u03b0\n*\5*\u03b2\n*\3"+
		"+\3+\3+\3+\3+\3+\5+\u03ba\n+\3+\3+\5+\u03be\n+\3+\5+\u03c1\n+\3,\3,\3"+
		",\3,\3-\3-\3-\5-\u03ca\n-\3-\3-\3-\5-\u03cf\n-\3-\5-\u03d2\n-\3-\3-\3"+
		".\3.\3.\3.\7.\u03da\n.\f.\16.\u03dd\13.\3.\3.\3/\3/\3/\3/\3/\5/\u03e6"+
		"\n/\3/\3/\5/\u03ea\n/\3\60\3\60\3\60\5\60\u03ef\n\60\3\60\3\60\5\60\u03f3"+
		"\n\60\3\61\3\61\3\61\3\61\5\61\u03f9\n\61\3\61\5\61\u03fc\n\61\3\61\5"+
		"\61\u03ff\n\61\3\61\5\61\u0402\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\7\62\u040e\n\62\f\62\16\62\u0411\13\62\3\62\5\62\u0414"+
		"\n\62\3\63\3\63\3\63\3\63\7\63\u041a\n\63\f\63\16\63\u041d\13\63\3\64"+
		"\3\64\3\64\3\64\3\64\5\64\u0424\n\64\3\65\5\65\u0427\n\65\3\65\3\65\5"+
		"\65\u042b\n\65\3\65\5\65\u042e\n\65\3\65\3\65\5\65\u0432\n\65\3\65\5\65"+
		"\u0435\n\65\3\65\5\65\u0438\n\65\3\65\5\65\u043b\n\65\3\65\5\65\u043e"+
		"\n\65\3\65\3\65\5\65\u0442\n\65\3\65\3\65\5\65\u0446\n\65\3\65\5\65\u0449"+
		"\n\65\3\65\5\65\u044c\n\65\3\65\5\65\u044f\n\65\3\65\5\65\u0452\n\65\3"+
		"\65\5\65\u0455\n\65\3\66\3\66\3\66\3\67\3\67\3\67\3\67\5\67\u045e\n\67"+
		"\38\38\38\39\59\u0464\n9\39\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3<"+
		"\3<\3<\3<\5<\u0478\n<\3=\3=\3=\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@"+
		"\5@\u048a\n@\3A\3A\3A\3B\3B\3B\5B\u0492\nB\3B\5B\u0495\nB\3B\3B\3B\3B"+
		"\5B\u049b\nB\3B\3B\3B\3B\3B\3B\5B\u04a3\nB\3B\5B\u04a6\nB\3B\3B\3B\3B"+
		"\7B\u04ac\nB\fB\16B\u04af\13B\3C\5C\u04b2\nC\3C\3C\3C\5C\u04b7\nC\3C\5"+
		"C\u04ba\nC\3C\5C\u04bd\nC\3C\3C\5C\u04c1\nC\3C\3C\5C\u04c5\nC\3C\5C\u04c8"+
		"\nC\5C\u04ca\nC\3C\5C\u04cd\nC\3C\3C\5C\u04d1\nC\3C\3C\5C\u04d5\nC\3C"+
		"\5C\u04d8\nC\5C\u04da\nC\5C\u04dc\nC\3D\5D\u04df\nD\3D\3D\3D\5D\u04e4"+
		"\nD\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u04ef\nE\3F\3F\3F\3F\5F\u04f5\nF\3G"+
		"\3G\3G\5G\u04fa\nG\3H\3H\3H\7H\u04ff\nH\fH\16H\u0502\13H\3I\3I\5I\u0506"+
		"\nI\3I\3I\5I\u050a\nI\3I\3I\5I\u050e\nI\3J\3J\3J\5J\u0513\nJ\3K\3K\3K"+
		"\7K\u0518\nK\fK\16K\u051b\13K\3L\3L\3L\3L\3M\3M\3M\3N\3N\3N\3N\3N\3N\3"+
		"N\3N\3N\3N\3N\5N\u052f\nN\3N\5N\u0532\nN\3N\3N\3N\3N\3N\3N\3N\5N\u053b"+
		"\nN\3N\3N\5N\u053f\nN\3N\3N\3N\5N\u0544\nN\3N\3N\3N\5N\u0549\nN\3N\5N"+
		"\u054c\nN\5N\u054e\nN\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\5O\u0564\nO\3O\5O\u0567\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O"+
		"\u0572\nO\3P\3P\5P\u0576\nP\3P\5P\u0579\nP\3P\3P\5P\u057d\nP\3P\3P\5P"+
		"\u0581\nP\3Q\3Q\3Q\3R\3R\3R\5R\u0589\nR\3R\3R\5R\u058d\nR\3S\3S\3S\3S"+
		"\3S\3S\3S\3S\3S\7S\u0598\nS\fS\16S\u059b\13S\3S\3S\3S\3S\3S\3S\3S\7S\u05a4"+
		"\nS\fS\16S\u05a7\13S\3S\3S\3S\3S\3S\3S\3S\7S\u05b0\nS\fS\16S\u05b3\13"+
		"S\3S\3S\3S\3S\3S\5S\u05ba\nS\3S\3S\5S\u05be\nS\3T\3T\3T\7T\u05c3\nT\f"+
		"T\16T\u05c6\13T\3U\3U\3U\5U\u05cb\nU\3U\3U\3U\3U\3U\3U\5U\u05d3\nU\3V"+
		"\3V\3V\5V\u05d8\nV\3V\3V\3V\3V\3V\6V\u05df\nV\rV\16V\u05e0\3V\3V\5V\u05e5"+
		"\nV\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\5V\u0604\nV\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\5V\u0615\nV\3V\5V\u0618\nV\3V\3V\5V\u061c\nV\3V\5V\u061f\nV"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u062b\nV\3V\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\5V\u063c\nV\3V\3V\5V\u0640\nV\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\5V\u0651\nV\3V\5V\u0654\nV\3V\3V\5V\u0658\nV"+
		"\3V\5V\u065b\nV\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u0666\nV\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u067e\nV\3V\3V"+
		"\3V\3V\3V\5V\u0685\nV\7V\u0687\nV\fV\16V\u068a\13V\3W\3W\3W\7W\u068f\n"+
		"W\fW\16W\u0692\13W\3X\3X\5X\u0696\nX\3Y\3Y\3Y\3Y\7Y\u069c\nY\fY\16Y\u069f"+
		"\13Y\3Y\3Y\3Y\3Y\3Y\7Y\u06a6\nY\fY\16Y\u06a9\13Y\5Y\u06ab\nY\3Y\3Y\3Y"+
		"\3Z\3Z\3Z\5Z\u06b3\nZ\3Z\3Z\3[\3[\3[\5[\u06ba\n[\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\5\\\u06c3\n\\\3\\\3\\\3\\\3\\\5\\\u06c9\n\\\7\\\u06cb\n\\\f\\\16"+
		"\\\u06ce\13\\\3]\3]\3]\5]\u06d3\n]\3]\3]\3^\3^\3^\5^\u06da\n^\3^\3^\3"+
		"_\3_\3_\7_\u06e1\n_\f_\16_\u06e4\13_\3`\3`\3`\5`\u06e9\n`\3a\3a\3b\3b"+
		"\3b\3b\3b\3b\5b\u06f3\nb\5b\u06f5\nb\3c\5c\u06f8\nc\3c\3c\3c\3c\3c\3c"+
		"\5c\u0700\nc\3d\3d\3d\5d\u0705\nd\3e\3e\3f\3f\3g\3g\3h\3h\5h\u070f\nh"+
		"\3i\3i\3i\5i\u0714\ni\3j\3j\5j\u0718\nj\3k\3k\3k\3k\3k\2\5\u0082\u00aa"+
		"\u00b6l\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\2\35\b\2\5\5\31\31\34\34&&ee\u00a5\u00a5\4\2\20\20\36\36\5\2\5"+
		"\5&&ee\4\2))++\4\2,,\62\62\5\2\17\17\u0094\u0094\u009a\u009a\4\2  \u0087"+
		"\u0087\4\2RR^^\4\2EEcc\5\2\6\6\n\n\16\16\6\2\6\6\t\n\16\16\u008b\u008b"+
		"\4\2^^\u0086\u0086\4\2\6\6\n\n\4\2ss\u00c2\u00c2\4\2\r\r)*\4\2==[[\4\2"+
		"BBNN\3\2\u0091\u0092\5\2\22\22]]\u00a2\u00a2\5\2\u00be\u00be\u00d0\u00d0"+
		"\u00d9\u00d9\4\2\u00c3\u00c4\u00d1\u00d1\4\2MM``\3\2\u00b9\u00ba\4\2\u00c4"+
		"\u00c4\u00d1\u00d1\n\2$$JJiikk~~\u0089\u0089\u00b0\u00b0\u00b4\u00b4\16"+
		"\2\4#%IKOQhjjlmopr}\177\u0088\u008a\u00af\u00b1\u00b3\u00b5\u00b6\6\2"+
		"##==KKYY\2\u081c\2\u00e4\3\2\2\2\4\u00f8\3\2\2\2\6\u00fa\3\2\2\2\b\u019f"+
		"\3\2\2\2\n\u01a1\3\2\2\2\f\u01a9\3\2\2\2\16\u01ad\3\2\2\2\20\u01b4\3\2"+
		"\2\2\22\u01b6\3\2\2\2\24\u01bc\3\2\2\2\26\u024b\3\2\2\2\30\u024d\3\2\2"+
		"\2\32\u0258\3\2\2\2\34\u0273\3\2\2\2\36\u028e\3\2\2\2 \u0292\3\2\2\2\""+
		"\u029b\3\2\2\2$\u02a8\3\2\2\2&\u02b7\3\2\2\2(\u02c4\3\2\2\2*\u02d4\3\2"+
		"\2\2,\u02d9\3\2\2\2.\u02df\3\2\2\2\60\u02e2\3\2\2\2\62\u02e5\3\2\2\2\64"+
		"\u02f7\3\2\2\2\66\u02f9\3\2\2\28\u0317\3\2\2\2:\u031b\3\2\2\2<\u031f\3"+
		"\2\2\2>\u0323\3\2\2\2@\u032c\3\2\2\2B\u0340\3\2\2\2D\u0362\3\2\2\2F\u0364"+
		"\3\2\2\2H\u0367\3\2\2\2J\u036e\3\2\2\2L\u037a\3\2\2\2N\u0382\3\2\2\2P"+
		"\u038c\3\2\2\2R\u03b1\3\2\2\2T\u03c0\3\2\2\2V\u03c2\3\2\2\2X\u03c6\3\2"+
		"\2\2Z\u03d5\3\2\2\2\\\u03e9\3\2\2\2^\u03eb\3\2\2\2`\u03f4\3\2\2\2b\u0403"+
		"\3\2\2\2d\u0415\3\2\2\2f\u0423\3\2\2\2h\u0426\3\2\2\2j\u0456\3\2\2\2l"+
		"\u0459\3\2\2\2n\u045f\3\2\2\2p\u0463\3\2\2\2r\u0469\3\2\2\2t\u046c\3\2"+
		"\2\2v\u046f\3\2\2\2x\u0479\3\2\2\2z\u047c\3\2\2\2|\u0480\3\2\2\2~\u0485"+
		"\3\2\2\2\u0080\u048b\3\2\2\2\u0082\u049a\3\2\2\2\u0084\u04db\3\2\2\2\u0086"+
		"\u04e3\3\2\2\2\u0088\u04ee\3\2\2\2\u008a\u04f0\3\2\2\2\u008c\u04f6\3\2"+
		"\2\2\u008e\u04fb\3\2\2\2\u0090\u0503\3\2\2\2\u0092\u050f\3\2\2\2\u0094"+
		"\u0514\3\2\2\2\u0096\u051c\3\2\2\2\u0098\u0520\3\2\2\2\u009a\u054d\3\2"+
		"\2\2\u009c\u0571\3\2\2\2\u009e\u0573\3\2\2\2\u00a0\u0582\3\2\2\2\u00a2"+
		"\u0585\3\2\2\2\u00a4\u05bd\3\2\2\2\u00a6\u05bf\3\2\2\2\u00a8\u05d2\3\2"+
		"\2\2\u00aa\u063f\3\2\2\2\u00ac\u068b\3\2\2\2\u00ae\u0695\3\2\2\2\u00b0"+
		"\u06aa\3\2\2\2\u00b2\u06b2\3\2\2\2\u00b4\u06b6\3\2\2\2\u00b6\u06c2\3\2"+
		"\2\2\u00b8\u06cf\3\2\2\2\u00ba\u06d9\3\2\2\2\u00bc\u06dd\3\2\2\2\u00be"+
		"\u06e8\3\2\2\2\u00c0\u06ea\3\2\2\2\u00c2\u06f4\3\2\2\2\u00c4\u06f7\3\2"+
		"\2\2\u00c6\u0704\3\2\2\2\u00c8\u0706\3\2\2\2\u00ca\u0708\3\2\2\2\u00cc"+
		"\u070a\3\2\2\2\u00ce\u070e\3\2\2\2\u00d0\u0713\3\2\2\2\u00d2\u0717\3\2"+
		"\2\2\u00d4\u0719\3\2\2\2\u00d6\u00da\5\4\3\2\u00d7\u00d8\7U\2\2\u00d8"+
		"\u00d9\7y\2\2\u00d9\u00db\7\u00bc\2\2\u00da\u00d7\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00dd\7@\2\2\u00dd\u00df\5\u00d2j\2"+
		"\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00e2"+
		"\7\u00d8\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e5\3\2\2"+
		"\2\u00e3\u00e5\5X-\2\u00e4\u00d6\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\3\3"+
		"\2\2\2\u00e6\u00f9\5\6\4\2\u00e7\u00f9\5\22\n\2\u00e8\u00f9\5\24\13\2"+
		"\u00e9\u00f9\5\26\f\2\u00ea\u00f9\5P)\2\u00eb\u00f9\5R*\2\u00ec\u00f9"+
		"\5T+\2\u00ed\u00f9\5V,\2\u00ee\u00f9\5^\60\2\u00ef\u00f9\5`\61\2\u00f0"+
		"\u00f9\5b\62\2\u00f1\u00f9\5d\63\2\u00f2\u00f9\5\u0098M\2\u00f3\u00f9"+
		"\5\u009aN\2\u00f4\u00f9\5\u009cO\2\u00f5\u00f9\5\u009eP\2\u00f6\u00f9"+
		"\5\u00a0Q\2\u00f7\u00f9\5\u00a2R\2\u00f8\u00e6\3\2\2\2\u00f8\u00e7\3\2"+
		"\2\2\u00f8\u00e8\3\2\2\2\u00f8\u00e9\3\2\2\2\u00f8\u00ea\3\2\2\2\u00f8"+
		"\u00eb\3\2\2\2\u00f8\u00ec\3\2\2\2\u00f8\u00ed\3\2\2\2\u00f8\u00ee\3\2"+
		"\2\2\u00f8\u00ef\3\2\2\2\u00f8\u00f0\3\2\2\2\u00f8\u00f1\3\2\2\2\u00f8"+
		"\u00f2\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f8\u00f5\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\5\3\2\2\2\u00fa\u00fb"+
		"\7\7\2\2\u00fb\u00fc\7\u0097\2\2\u00fc\u00fe\5\u00ba^\2\u00fd\u00ff\5"+
		",\27\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0105\5\b\5\2\u0101\u0102\7\u00c2\2\2\u0102\u0104\5\b\5\2\u0103\u0101"+
		"\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\7\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7\3\2\2\u0109\u010d\7\33\2"+
		"\2\u010a\u010b\7L\2\2\u010b\u010c\7p\2\2\u010c\u010e\7\67\2\2\u010d\u010a"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0112\5D#\2\u0110"+
		"\u0111\7\4\2\2\u0111\u0113\5\u00b4[\2\u0112\u0110\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u01a0\3\2\2\2\u0114\u0115\7\3\2\2\u0115\u0119\7O\2\2\u0116"+
		"\u0117\7L\2\2\u0117\u0118\7p\2\2\u0118\u011a\7\67\2\2\u0119\u0116\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011e\5H%\2\u011c\u011d"+
		"\7\4\2\2\u011d\u011f\5\u00b4[\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2"+
		"\2\u011f\u01a0\3\2\2\2\u0120\u0121\7\20\2\2\u0121\u0124\5\20\t\2\u0122"+
		"\u0123\7B\2\2\u0123\u0125\5\u00ba^\2\u0124\u0122\3\2\2\2\u0124\u0125\3"+
		"\2\2\2\u0125\u01a0\3\2\2\2\u0126\u0127\7\27\2\2\u0127\u012a\7\33\2\2\u0128"+
		"\u0129\7L\2\2\u0129\u012b\7\67\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u012f\5\u00b4[\2\u012d\u012e\7N\2\2\u012e"+
		"\u0130\5\20\t\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u01a0\3"+
		"\2\2\2\u0131\u0132\7\34\2\2\u0132\u0135\7\33\2\2\u0133\u0134\7L\2\2\u0134"+
		"\u0136\7\67\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3"+
		"\2\2\2\u0137\u0138\5\u00b4[\2\u0138\u0139\7\u00bc\2\2\u0139\u01a0\3\2"+
		"\2\2\u013a\u013b\7(\2\2\u013b\u013c\7\u00b2\2\2\u013c\u01a0\5\u00aaV\2"+
		"\u013d\u013e\7,\2\2\u013e\u01a0\5\20\t\2\u013f\u0140\7\62\2\2\u0140\u0143"+
		"\7\33\2\2\u0141\u0142\7L\2\2\u0142\u0144\7\67\2\2\u0143\u0141\3\2\2\2"+
		"\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u01a0\5\u00b4[\2\u0146"+
		"\u0147\7\62\2\2\u0147\u014a\7O\2\2\u0148\u0149\7L\2\2\u0149\u014b\7\67"+
		"\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u01a0\5\u00b4[\2\u014d\u014e\7\62\2\2\u014e\u01a0\5\20\t\2\u014f\u0151"+
		"\7A\2\2\u0150\u0152\5\20\t\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u01a0\3\2\2\2\u0153\u0154\7j\2\2\u0154\u0157\7\33\2\2\u0155\u0156\7L"+
		"\2\2\u0156\u0158\7\67\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015a\5\u00b4[\2\u015a\u015b\5J&\2\u015b\u01a0\3"+
		"\2\2\2\u015c\u015d\7j\2\2\u015d\u0160\7\33\2\2\u015e\u015f\7L\2\2\u015f"+
		"\u0161\7\67\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3"+
		"\2\2\2\u0162\u0163\5\u00b4[\2\u0163\u0164\7\34\2\2\u0164\u0165\7\u00bc"+
		"\2\2\u0165\u01a0\3\2\2\2\u0166\u0167\7j\2\2\u0167\u016a\7\33\2\2\u0168"+
		"\u0169\7L\2\2\u0169\u016b\7\67\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c\u016d\5\u00b4[\2\u016d\u016e\7\u0081\2"+
		"\2\u016e\u016f\5\16\b\2\u016f\u01a0\3\2\2\2\u0170\u0171\7j\2\2\u0171\u0174"+
		"\7\33\2\2\u0172\u0173\7L\2\2\u0173\u0175\7\67\2\2\u0174\u0172\3\2\2\2"+
		"\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u01a0\5D#\2\u0177\u0178"+
		"\7j\2\2\u0178\u0179\7w\2\2\u0179\u017a\7\23\2\2\u017a\u01a0\5\u00aaV\2"+
		"\u017b\u017c\7j\2\2\u017c\u01a0\5> \2\u017d\u017e\7l\2\2\u017e\u0188\5"+
		"\20\t\2\u017f\u0180\7\u009f\2\2\u0180\u0181\7/\2\2\u0181\u0189\7\u00bc"+
		"\2\2\u0182\u0183\7\u009f\2\2\u0183\u0184\7\u00ae\2\2\u0184\u0189\7\u00bc"+
		"\2\2\u0185\u0186\7\u009f\2\2\u0186\u0187\7\u0097\2\2\u0187\u0189\5\u00ba"+
		"^\2\u0188\u017f\3\2\2\2\u0188\u0182\3\2\2\2\u0188\u0185\3\2\2\2\u0189"+
		"\u01a0\3\2\2\2\u018a\u018b\7\u0081\2\2\u018b\u01a0\7\u00a5\2\2\u018c\u018d"+
		"\7\u0082\2\2\u018d\u0190\7\33\2\2\u018e\u018f\7L\2\2\u018f\u0191\7\67"+
		"\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0193\5\u00b4[\2\u0193\u0194\7\u009f\2\2\u0194\u0195\5\u00b4[\2\u0195"+
		"\u01a0\3\2\2\2\u0196\u0197\7\u0083\2\2\u0197\u0198\5\20\t\2\u0198\u0199"+
		"\7B\2\2\u0199\u019a\5\u00ba^\2\u019a\u01a0\3\2\2\2\u019b\u019c\7\u00a8"+
		"\2\2\u019c\u019d\5\n\6\2\u019d\u019e\5t;\2\u019e\u01a0\3\2\2\2\u019f\u0108"+
		"\3\2\2\2\u019f\u0114\3\2\2\2\u019f\u0120\3\2\2\2\u019f\u0126\3\2\2\2\u019f"+
		"\u0131\3\2\2\2\u019f\u013a\3\2\2\2\u019f\u013d\3\2\2\2\u019f\u013f\3\2"+
		"\2\2\u019f\u0146\3\2\2\2\u019f\u014d\3\2\2\2\u019f\u014f\3\2\2\2\u019f"+
		"\u0153\3\2\2\2\u019f\u015c\3\2\2\2\u019f\u0166\3\2\2\2\u019f\u0170\3\2"+
		"\2\2\u019f\u0177\3\2\2\2\u019f\u017b\3\2\2\2\u019f\u017d\3\2\2\2\u019f"+
		"\u018a\3\2\2\2\u019f\u018c\3\2\2\2\u019f\u0196\3\2\2\2\u019f\u019b\3\2"+
		"\2\2\u01a0\t\3\2\2\2\u01a1\u01a6\5\f\7\2\u01a2\u01a3\7\u00c2\2\2\u01a3"+
		"\u01a5\5\f\7\2\u01a4\u01a2\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2"+
		"\2\2\u01a6\u01a7\3\2\2\2\u01a7\13\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa"+
		"\5\u00b4[\2\u01aa\u01ab\7\u00c7\2\2\u01ab\u01ac\5\u00aaV\2\u01ac\r\3\2"+
		"\2\2\u01ad\u01ae\t\2\2\2\u01ae\17\3\2\2\2\u01af\u01b0\7z\2\2\u01b0\u01b5"+
		"\5\u00aaV\2\u01b1\u01b2\7z\2\2\u01b2\u01b3\7K\2\2\u01b3\u01b5\7\u00bc"+
		"\2\2\u01b4\u01af\3\2\2\2\u01b4\u01b1\3\2\2\2\u01b5\21\3\2\2\2\u01b6\u01b7"+
		"\7\20\2\2\u01b7\u01b8\7.\2\2\u01b8\u01ba\5\u00ba^\2\u01b9\u01bb\5,\27"+
		"\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\23\3\2\2\2\u01bc\u01bd"+
		"\7\26\2\2\u01bd\u01be\7\u0097\2\2\u01be\u01c0\5\u00ba^\2\u01bf\u01c1\5"+
		"\20\t\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\25\3\2\2\2\u01c2"+
		"\u01c3\t\3\2\2\u01c3\u01c7\7!\2\2\u01c4\u01c5\7L\2\2\u01c5\u01c6\7p\2"+
		"\2\u01c6\u01c8\7\67\2\2\u01c7\u01c4\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01c9\3\2\2\2\u01c9\u01cb\5\u00c0a\2\u01ca\u01cc\5,\27\2\u01cb\u01ca"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01cf\5@!\2\u01ce"+
		"\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u024c\3\2\2\2\u01d0\u01d1\t\3"+
		"\2\2\u01d1\u01d5\7.\2\2\u01d2\u01d3\7L\2\2\u01d3\u01d4\7p\2\2\u01d4\u01d6"+
		"\7\67\2\2\u01d5\u01d2\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2"+
		"\u01d7\u01d9\5\u00ba^\2\u01d8\u01da\5.\30\2\u01d9\u01d8\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01dd\5,\27\2\u01dc\u01db\3\2"+
		"\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\5\30\r\2\u01df"+
		"\u01e0\5\34\17\2\u01e0\u024c\3\2\2\2\u01e1\u01e2\t\3\2\2\u01e2\u01e3\7"+
		"b\2\2\u01e3\u01e7\7\u00ad\2\2\u01e4\u01e5\7L\2\2\u01e5\u01e6\7p\2\2\u01e6"+
		"\u01e8\7\67\2\2\u01e7\u01e4\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3"+
		"\2\2\2\u01e9\u01eb\5\u00ba^\2\u01ea\u01ec\5.\30\2\u01eb\u01ea\3\2\2\2"+
		"\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01ef\5,\27\2\u01ee\u01ed"+
		"\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f5\3\2\2\2\u01f0\u01f1\7\u00b3\2"+
		"\2\u01f1\u01f3\7\u009d\2\2\u01f2\u01f4\7\u00ba\2\2\u01f3\u01f2\3\2\2\2"+
		"\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01f0\3\2\2\2\u01f5\u01f6"+
		"\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f9\5\60\31\2\u01f8\u01f7\3\2\2\2"+
		"\u01f8\u01f9\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01fc\5\64\33\2\u01fb\u01fa"+
		"\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\5\62\32\2"+
		"\u01fe\u024c\3\2\2\2\u01ff\u0200\t\3\2\2\u0200\u0201\7e\2\2\u0201\u0205"+
		"\7\u00ad\2\2\u0202\u0203\7L\2\2\u0203\u0204\7p\2\2\u0204\u0206\7\67\2"+
		"\2\u0205\u0202\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209"+
		"\5\u00ba^\2\u0208\u020a\5.\30\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2"+
		"\2\u020a\u020c\3\2\2\2\u020b\u020d\5,\27\2\u020c\u020b\3\2\2\2\u020c\u020d"+
		"\3\2\2\2\u020d\u020f\3\2\2\2\u020e\u0210\5\64\33\2\u020f\u020e\3\2\2\2"+
		"\u020f\u0210\3\2\2\2\u0210\u0216\3\2\2\2\u0211\u0217\5\60\31\2\u0212\u0214"+
		"\5\66\34\2\u0213\u0215\7{\2\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2\2\2"+
		"\u0215\u0217\3\2\2\2\u0216\u0211\3\2\2\2\u0216\u0212\3\2\2\2\u0217\u0218"+
		"\3\2\2\2\u0218\u0219\5\62\32\2\u0219\u024c\3\2\2\2\u021a\u021c\t\3\2\2"+
		"\u021b\u021d\7\u0099\2\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021e\u0222\7\u0097\2\2\u021f\u0220\7L\2\2\u0220\u0221"+
		"\7p\2\2\u0221\u0223\7\67\2\2\u0222\u021f\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0224\3\2\2\2\u0224\u0226\5\u00ba^\2\u0225\u0227\5.\30\2\u0226\u0225"+
		"\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0229\3\2\2\2\u0228\u022a\5,\27\2\u0229"+
		"\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c\3\2\2\2\u022b\u022d\5\64"+
		"\33\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022f\3\2\2\2\u022e"+
		"\u0230\5\66\34\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232\3"+
		"\2\2\2\u0231\u0233\5\62\32\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233"+
		"\u024c\3\2\2\2\u0234\u0237\t\3\2\2\u0235\u0236\7v\2\2\u0236\u0238\7\u0083"+
		"\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239"+
		"\u023d\7\u00ad\2\2\u023a\u023b\7L\2\2\u023b\u023c\7p\2\2\u023c\u023e\7"+
		"\67\2\2\u023d\u023a\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2\2\u023f"+
		"\u0241\5\u00ba^\2\u0240\u0242\5.\30\2\u0241\u0240\3\2\2\2\u0241\u0242"+
		"\3\2\2\2\u0242\u0244\3\2\2\2\u0243\u0245\5,\27\2\u0244\u0243\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245\u0247\3\2\2\2\u0246\u0248\5\64\33\2\u0247\u0246\3"+
		"\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\5\62\32\2\u024a"+
		"\u024c\3\2\2\2\u024b\u01c2\3\2\2\2\u024b\u01d0\3\2\2\2\u024b\u01e1\3\2"+
		"\2\2\u024b\u01ff\3\2\2\2\u024b\u021a\3\2\2\2\u024b\u0234\3\2\2\2\u024c"+
		"\27\3\2\2\2\u024d\u024e\7\u00cd\2\2\u024e\u0253\5\32\16\2\u024f\u0250"+
		"\7\u00c2\2\2\u0250\u0252\5\32\16\2\u0251\u024f\3\2\2\2\u0252\u0255\3\2"+
		"\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2\2\2\u0255"+
		"\u0253\3\2\2\2\u0256\u0257\7\u00d7\2\2\u0257\31\3\2\2\2\u0258\u0259\5"+
		"\u00d0i\2\u0259\u026f\5\u00a4S\2\u025a\u025b\6\16\2\3\u025b\u025c\7&\2"+
		"\2\u025c\u025d\5\u00c6d\2\u025d\u025e\b\16\1\2\u025e\u026e\3\2\2\2\u025f"+
		"\u0260\6\16\3\3\u0260\u0261\79\2\2\u0261\u0262\5\u00aaV\2\u0262\u0263"+
		"\b\16\1\2\u0263\u026e\3\2\2\2\u0264\u0265\6\16\4\3\u0265\u0266\7I\2\2"+
		"\u0266\u026e\b\16\1\2\u0267\u0268\6\16\5\3\u0268\u0269\7Q\2\2\u0269\u026e"+
		"\b\16\1\2\u026a\u026b\6\16\6\3\u026b\u026c\7W\2\2\u026c\u026e\b\16\1\2"+
		"\u026d\u025a\3\2\2\2\u026d\u025f\3\2\2\2\u026d\u0264\3\2\2\2\u026d\u0267"+
		"\3\2\2\2\u026d\u026a\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2\2\2\u026f"+
		"\u0270\3\2\2\2\u0270\33\3\2\2\2\u0271\u026f\3\2\2\2\u0272\u0274\5\36\20"+
		"\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u028b\3\2\2\2\u0275\u0276"+
		"\6\17\7\3\u0276\u0277\5\"\22\2\u0277\u0278\b\17\1\2\u0278\u028a\3\2\2"+
		"\2\u0279\u027a\6\17\b\3\u027a\u027b\5$\23\2\u027b\u027c\b\17\1\2\u027c"+
		"\u028a\3\2\2\2\u027d\u027e\6\17\t\3\u027e\u027f\5&\24\2\u027f\u0280\b"+
		"\17\1\2\u0280\u028a\3\2\2\2\u0281\u0282\6\17\n\3\u0282\u0283\5(\25\2\u0283"+
		"\u0284\b\17\1\2\u0284\u028a\3\2\2\2\u0285\u0286\6\17\13\3\u0286\u0287"+
		"\5*\26\2\u0287\u0288\b\17\1\2\u0288\u028a\3\2\2\2\u0289\u0275\3\2\2\2"+
		"\u0289\u0279\3\2\2\2\u0289\u027d\3\2\2\2\u0289\u0281\3\2\2\2\u0289\u0285"+
		"\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"\35\3\2\2\2\u028d\u028b\3\2\2\2\u028e\u028f\7}\2\2\u028f\u0290\7Y\2\2"+
		"\u0290\u0291\5\u00a6T\2\u0291\37\3\2\2\2\u0292\u0299\5\u00d0i\2\u0293"+
		"\u0296\5\u00d0i\2\u0294\u0295\7\u00cd\2\2\u0295\u0297\7\u00d7\2\2\u0296"+
		"\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u029a\3\2\2\2\u0298\u029a\5\u00c6"+
		"d\2\u0299\u0293\3\2\2\2\u0299\u0298\3\2\2\2\u029a!\3\2\2\2\u029b\u029c"+
		"\7\u0090\2\2\u029c\u029d\7\u00cd\2\2\u029d\u029e\5\u00d0i\2\u029e\u02a2"+
		"\7\u00cd\2\2\u029f\u02a1\5 \21\2\u02a0\u029f\3\2\2\2\u02a1\u02a4\3\2\2"+
		"\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5\3\2\2\2\u02a4\u02a2"+
		"\3\2\2\2\u02a5\u02a6\7\u00d7\2\2\u02a6\u02a7\7\u00d7\2\2\u02a7#\3\2\2"+
		"\2\u02a8\u02a9\7_\2\2\u02a9\u02b3\7\u00cd\2\2\u02aa\u02b4\7\u00ba\2\2"+
		"\u02ab\u02ac\7h\2\2\u02ac\u02ad\7\u00ba\2\2\u02ad\u02ae\7f\2\2\u02ae\u02b4"+
		"\7\u00ba\2\2\u02af\u02b0\7f\2\2\u02b0\u02b1\7\u00ba\2\2\u02b1\u02b2\7"+
		"h\2\2\u02b2\u02b4\7\u00ba\2\2\u02b3\u02aa\3\2\2\2\u02b3\u02ab\3\2\2\2"+
		"\u02b3\u02af\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\7\u00d7\2\2\u02b6"+
		"%\3\2\2\2\u02b7\u02b8\7\\\2\2\u02b8\u02b9\7\u00cd\2\2\u02b9\u02ba\5\u00d0"+
		"i\2\u02ba\u02be\7\u00cd\2\2\u02bb\u02bd\5 \21\2\u02bc\u02bb\3\2\2\2\u02bd"+
		"\u02c0\3\2\2\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c1\3\2"+
		"\2\2\u02c0\u02be\3\2\2\2\u02c1\u02c2\7\u00d7\2\2\u02c2\u02c3\7\u00d7\2"+
		"\2\u02c3\'\3\2\2\2\u02c4\u02c5\7\177\2\2\u02c5\u02d0\7\u00cd\2\2\u02c6"+
		"\u02c7\7h\2\2\u02c7\u02c8\5\u00d0i\2\u02c8\u02c9\7f\2\2\u02c9\u02ca\5"+
		"\u00d0i\2\u02ca\u02d1\3\2\2\2\u02cb\u02cc\7f\2\2\u02cc\u02cd\5\u00d0i"+
		"\2\u02cd\u02ce\7h\2\2\u02ce\u02cf\5\u00d0i\2\u02cf\u02d1\3\2\2\2\u02d0"+
		"\u02c6\3\2\2\2\u02d0\u02cb\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\7\u00d7"+
		"\2\2\u02d3)\3\2\2\2\u02d4\u02d5\7\u008e\2\2\u02d5\u02d6\7\u00cd\2\2\u02d6"+
		"\u02d7\5\u0094K\2\u02d7\u02d8\7\u00d7\2\2\u02d8+\3\2\2\2\u02d9\u02da\7"+
		"t\2\2\u02da\u02dd\7\30\2\2\u02db\u02de\5\u00d0i\2\u02dc\u02de\7\u00bc"+
		"\2\2\u02dd\u02db\3\2\2\2\u02dd\u02dc\3\2\2\2\u02de-\3\2\2\2\u02df\u02e0"+
		"\7\u00ab\2\2\u02e0\u02e1\7\u00bc\2\2\u02e1/\3\2\2\2\u02e2\u02e3\7\u009f"+
		"\2\2\u02e3\u02e4\5\u00ba^\2\u02e4\61\3\2\2\2\u02e5\u02e6\7\f\2\2\u02e6"+
		"\u02e7\5d\63\2\u02e7\63\3\2\2\2\u02e8\u02e9\7\u00cd\2\2\u02e9\u02ee\5"+
		"B\"\2\u02ea\u02eb\7\u00c2\2\2\u02eb\u02ed\5B\"\2\u02ec\u02ea\3\2\2\2\u02ed"+
		"\u02f0\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f1\3\2"+
		"\2\2\u02f0\u02ee\3\2\2\2\u02f1\u02f2\7\u00d7\2\2\u02f2\u02f8\3\2\2\2\u02f3"+
		"\u02f4\7\f\2\2\u02f4\u02f8\5\u00ba^\2\u02f5\u02f6\7\f\2\2\u02f6\u02f8"+
		"\5\u00b8]\2\u02f7\u02e8\3\2\2\2\u02f7\u02f3\3\2\2\2\u02f7\u02f5\3\2\2"+
		"\2\u02f8\65\3\2\2\2\u02f9\u0314\5@!\2\u02fa\u02fb\6\34\f\3\u02fb\u02fc"+
		"\5z>\2\u02fc\u02fd\b\34\1\2\u02fd\u0313\3\2\2\2\u02fe\u02ff\6\34\r\3\u02ff"+
		"\u0300\58\35\2\u0300\u0301\b\34\1\2\u0301\u0313\3\2\2\2\u0302\u0303\6"+
		"\34\16\3\u0303\u0304\5:\36\2\u0304\u0305\b\34\1\2\u0305\u0313\3\2\2\2"+
		"\u0306\u0307\6\34\17\3\u0307\u0308\5<\37\2\u0308\u0309\b\34\1\2\u0309"+
		"\u0313\3\2\2\2\u030a\u030b\6\34\20\3\u030b\u030c\5> \2\u030c\u030d\b\34"+
		"\1\2\u030d\u0313\3\2\2\2\u030e\u030f\6\34\21\3\u030f\u0310\5\u0080A\2"+
		"\u0310\u0311\b\34\1\2\u0311\u0313\3\2\2\2\u0312\u02fa\3\2\2\2\u0312\u02fe"+
		"\3\2\2\2\u0312\u0302\3\2\2\2\u0312\u0306\3\2\2\2\u0312\u030a\3\2\2\2\u0312"+
		"\u030e\3\2\2\2\u0313\u0316\3\2\2\2\u0314\u0312\3\2\2\2\u0314\u0315\3\2"+
		"\2\2\u0315\67\3\2\2\2\u0316\u0314\3\2\2\2\u0317\u0318\7z\2\2\u0318\u0319"+
		"\7\23\2\2\u0319\u031a\5\u00aaV\2\u031a9\3\2\2\2\u031b\u031c\7}\2\2\u031c"+
		"\u031d\7Y\2\2\u031d\u031e\5\u00aaV\2\u031e;\3\2\2\2\u031f\u0320\7\u0088"+
		"\2\2\u0320\u0321\7\23\2\2\u0321\u0322\5\u00aaV\2\u0322=\3\2\2\2\u0323"+
		"\u0324\7\u00a5\2\2\u0324\u0329\5N(\2\u0325\u0326\7\u00c2\2\2\u0326\u0328"+
		"\5N(\2\u0327\u0325\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u0327\3\2\2\2\u0329"+
		"\u032a\3\2\2\2\u032a?\3\2\2\2\u032b\u0329\3\2\2\2\u032c\u032e\7\65\2\2"+
		"\u032d\u032f\7\u00c7\2\2\u032e\u032d\3\2\2\2\u032e\u032f\3\2\2\2\u032f"+
		"\u0330\3\2\2\2\u0330\u0336\5\u00d2j\2\u0331\u0333\7\u00cd\2\2\u0332\u0334"+
		"\5\u00a6T\2\u0333\u0332\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0335\3\2\2"+
		"\2\u0335\u0337\7\u00d7\2\2\u0336\u0331\3\2\2\2\u0336\u0337\3\2\2\2\u0337"+
		"A\3\2\2\2\u0338\u0341\5D#\2\u0339\u033a\7\35\2\2\u033a\u033b\5\u00d0i"+
		"\2\u033b\u033c\7\26\2\2\u033c\u033d\5\u00aaV\2\u033d\u0341\3\2\2\2\u033e"+
		"\u033f\7O\2\2\u033f\u0341\5H%\2\u0340\u0338\3\2\2\2\u0340\u0339\3\2\2"+
		"\2\u0340\u033e\3\2\2\2\u0341C\3\2\2\2\u0342\u0343\5\u00b4[\2\u0343\u0345"+
		"\5\u00a4S\2\u0344\u0346\5F$\2\u0345\u0344\3\2\2\2\u0345\u0346\3\2\2\2"+
		"\u0346\u0349\3\2\2\2\u0347\u0348\7\34\2\2\u0348\u034a\7\u00bc\2\2\u0349"+
		"\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034c\3\2\2\2\u034b\u034d\5J"+
		"&\2\u034c\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u0350\3\2\2\2\u034e"+
		"\u034f\7\u00a5\2\2\u034f\u0351\5\u00aaV\2\u0350\u034e\3\2\2\2\u0350\u0351"+
		"\3\2\2\2\u0351\u0363\3\2\2\2\u0352\u0354\5\u00b4[\2\u0353\u0355\5\u00a4"+
		"S\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\3\2\2\2\u0356"+
		"\u0359\5F$\2\u0357\u0358\7\34\2\2\u0358\u035a\7\u00bc\2\2\u0359\u0357"+
		"\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035c\3\2\2\2\u035b\u035d\5J&\2\u035c"+
		"\u035b\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u0360\3\2\2\2\u035e\u035f\7\u00a5"+
		"\2\2\u035f\u0361\5\u00aaV\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361"+
		"\u0363\3\2\2\2\u0362\u0342\3\2\2\2\u0362\u0352\3\2\2\2\u0363E\3\2\2\2"+
		"\u0364\u0365\t\4\2\2\u0365\u0366\5\u00aaV\2\u0366G\3\2\2\2\u0367\u0368"+
		"\5\u00b4[\2\u0368\u0369\5\u00aaV\2\u0369\u036a\7\u00a6\2\2\u036a\u036b"+
		"\5\u00a4S\2\u036b\u036c\7F\2\2\u036c\u036d\7\u00ba\2\2\u036dI\3\2\2\2"+
		"\u036e\u036f\7\31\2\2\u036f\u0370\7\u00cd\2\2\u0370\u0375\5L\'\2\u0371"+
		"\u0372\7\u00c2\2\2\u0372\u0374\5L\'\2\u0373\u0371\3\2\2\2\u0374\u0377"+
		"\3\2\2\2\u0375\u0373\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0378\3\2\2\2\u0377"+
		"\u0375\3\2\2\2\u0378\u0379\7\u00d7\2\2\u0379K\3\2\2\2\u037a\u0380\5\u00d0"+
		"i\2\u037b\u037d\7\u00cd\2\2\u037c\u037e\5\u00a6T\2\u037d\u037c\3\2\2\2"+
		"\u037d\u037e\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0381\7\u00d7\2\2\u0380"+
		"\u037b\3\2\2\2\u0380\u0381\3\2\2\2\u0381M\3\2\2\2\u0382\u038a\5\u00aa"+
		"V\2\u0383\u038b\7(\2\2\u0384\u0385\7\u009f\2\2\u0385\u0386\7/\2\2\u0386"+
		"\u038b\7\u00bc\2\2\u0387\u0388\7\u009f\2\2\u0388\u0389\7\u00ae\2\2\u0389"+
		"\u038b\7\u00bc\2\2\u038a\u0383\3\2\2\2\u038a\u0384\3\2\2\2\u038a\u0387"+
		"\3\2\2\2\u038a\u038b\3\2\2\2\u038bO\3\2\2\2\u038c\u038e\t\5\2\2\u038d"+
		"\u038f\7\u0097\2\2\u038e\u038d\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390"+
		"\3\2\2\2\u0390\u0391\5\u00b6\\\2\u0391Q\3\2\2\2\u0392\u0393\t\6\2\2\u0393"+
		"\u0396\7!\2\2\u0394\u0395\7L\2\2\u0395\u0397\7\67\2\2\u0396\u0394\3\2"+
		"\2\2\u0396\u0397\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u039a\5\u00c0a\2\u0399"+
		"\u039b\5,\27\2\u039a\u0399\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u03b2\3\2"+
		"\2\2\u039c\u03a3\t\6\2\2\u039d\u03a4\7.\2\2\u039e\u03a0\7\u0099\2\2\u039f"+
		"\u039e\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a4\7\u0097"+
		"\2\2\u03a2\u03a4\7\u00ad\2\2\u03a3\u039d\3\2\2\2\u03a3\u039f\3\2\2\2\u03a3"+
		"\u03a2\3\2\2\2\u03a4\u03a7\3\2\2\2\u03a5\u03a6\7L\2\2\u03a6\u03a8\7\67"+
		"\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9"+
		"\u03ab\5\u00ba^\2\u03aa\u03ac\5,\27\2\u03ab\u03aa\3\2\2\2\u03ab\u03ac"+
		"\3\2\2\2\u03ac\u03af\3\2\2\2\u03ad\u03ae\7o\2\2\u03ae\u03b0\7\'\2\2\u03af"+
		"\u03ad\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b2\3\2\2\2\u03b1\u0392\3\2"+
		"\2\2\u03b1\u039c\3\2\2\2\u03b2S\3\2\2\2\u03b3\u03b4\7\67\2\2\u03b4\u03b5"+
		"\7!\2\2\u03b5\u03c1\5\u00c0a\2\u03b6\u03bd\7\67\2\2\u03b7\u03be\7.\2\2"+
		"\u03b8\u03ba\7\u0099\2\2\u03b9\u03b8\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba"+
		"\u03bb\3\2\2\2\u03bb\u03be\7\u0097\2\2\u03bc\u03be\7\u00ad\2\2\u03bd\u03b7"+
		"\3\2\2\2\u03bd\u03b9\3\2\2\2\u03bd\u03bc\3\2\2\2\u03bd\u03be\3\2\2\2\u03be"+
		"\u03bf\3\2\2\2\u03bf\u03c1\5\u00ba^\2\u03c0\u03b3\3\2\2\2\u03c0\u03b6"+
		"\3\2\2\2\u03c1U\3\2\2\2\u03c2\u03c3\78\2\2\u03c3\u03c4\7\u0095\2\2\u03c4"+
		"\u03c5\5\4\3\2\u03c5W\3\2\2\2\u03c6\u03c7\7S\2\2\u03c7\u03c9\7U\2\2\u03c8"+
		"\u03ca\7\u0097\2\2\u03c9\u03c8\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03ce"+
		"\3\2\2\2\u03cb\u03cf\5\u00ba^\2\u03cc\u03cd\7D\2\2\u03cd\u03cf\5\u00b8"+
		"]\2\u03ce\u03cb\3\2\2\2\u03ce\u03cc\3\2\2\2\u03cf\u03d1\3\2\2\2\u03d0"+
		"\u03d2\5Z.\2\u03d1\u03d0\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\3\2\2"+
		"\2\u03d3\u03d4\5\\/\2\u03d4Y\3\2\2\2\u03d5\u03d6\7\u00cd\2\2\u03d6\u03db"+
		"\5\u00b4[\2\u03d7\u03d8\7\u00c2\2\2\u03d8\u03da\5\u00b4[\2\u03d9\u03d7"+
		"\3\2\2\2\u03da\u03dd\3\2\2\2\u03db\u03d9\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc"+
		"\u03de\3\2\2\2\u03dd\u03db\3\2\2\2\u03de\u03df\7\u00d7\2\2\u03df[\3\2"+
		"\2\2\u03e0\u03e1\7@\2\2\u03e1\u03ea\5\u00d0i\2\u03e2\u03ea\7\u00ac\2\2"+
		"\u03e3\u03e5\5d\63\2\u03e4\u03e6\7\u00d8\2\2\u03e5\u03e4\3\2\2\2\u03e5"+
		"\u03e6\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e8\7\2\2\3\u03e8\u03ea\3\2"+
		"\2\2\u03e9\u03e0\3\2\2\2\u03e9\u03e2\3\2\2\2\u03e9\u03e3\3\2\2\2\u03ea"+
		"]\3\2\2\2\u03eb\u03ec\7Z\2\2\u03ec\u03ee\7m\2\2\u03ed\u03ef\5,\27\2\u03ee"+
		"\u03ed\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f2\5t"+
		";\2\u03f1\u03f3\t\7\2\2\u03f2\u03f1\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3"+
		"_\3\2\2\2\u03f4\u03f5\7u\2\2\u03f5\u03f6\7\u0097\2\2\u03f6\u03f8\5\u00ba"+
		"^\2\u03f7\u03f9\5,\27\2\u03f8\u03f7\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9"+
		"\u03fb\3\2\2\2\u03fa\u03fc\5\20\t\2\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3"+
		"\2\2\2\u03fc\u03fe\3\2\2\2\u03fd\u03ff\7<\2\2\u03fe\u03fd\3\2\2\2\u03fe"+
		"\u03ff\3\2\2\2\u03ff\u0401\3\2\2\2\u0400\u0402\7%\2\2\u0401\u0400\3\2"+
		"\2\2\u0401\u0402\3\2\2\2\u0402a\3\2\2\2\u0403\u0404\7\u0082\2\2\u0404"+
		"\u0405\7\u0097\2\2\u0405\u0406\5\u00ba^\2\u0406\u0407\7\u009f\2\2\u0407"+
		"\u040f\5\u00ba^\2\u0408\u0409\7\u00c2\2\2\u0409\u040a\5\u00ba^\2\u040a"+
		"\u040b\7\u009f\2\2\u040b\u040c\5\u00ba^\2\u040c\u040e\3\2\2\2\u040d\u0408"+
		"\3\2\2\2\u040e\u0411\3\2\2\2\u040f\u040d\3\2\2\2\u040f\u0410\3\2\2\2\u0410"+
		"\u0413\3\2\2\2\u0411\u040f\3\2\2\2\u0412\u0414\5,\27\2\u0413\u0412\3\2"+
		"\2\2\u0413\u0414\3\2\2\2\u0414c\3\2\2\2\u0415\u041b\5f\64\2\u0416\u0417"+
		"\7\u00a7\2\2\u0417\u0418\7\6\2\2\u0418\u041a\5f\64\2\u0419\u0416\3\2\2"+
		"\2\u041a\u041d\3\2\2\2\u041b\u0419\3\2\2\2\u041b\u041c\3\2\2\2\u041ce"+
		"\3\2\2\2\u041d\u041b\3\2\2\2\u041e\u0424\5h\65\2\u041f\u0420\7\u00cd\2"+
		"\2\u0420\u0421\5d\63\2\u0421\u0422\7\u00d7\2\2\u0422\u0424\3\2\2\2\u0423"+
		"\u041e\3\2\2\2\u0423\u041f\3\2\2\2\u0424g\3\2\2\2\u0425\u0427\5j\66\2"+
		"\u0426\u0425\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u042a"+
		"\7\u008a\2\2\u0429\u042b\7\60\2\2\u042a\u0429\3\2\2\2\u042a\u042b\3\2"+
		"\2\2\u042b\u042d\3\2\2\2\u042c\u042e\5l\67\2\u042d\u042c\3\2\2\2\u042d"+
		"\u042e\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0431\5\u00a6T\2\u0430\u0432"+
		"\5n8\2\u0431\u0430\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0434\3\2\2\2\u0433"+
		"\u0435\5p9\2\u0434\u0433\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0437\3\2\2"+
		"\2\u0436\u0438\5r:\2\u0437\u0436\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u043a"+
		"\3\2\2\2\u0439\u043b\5t;\2\u043a\u0439\3\2\2\2\u043a\u043b\3\2\2\2\u043b"+
		"\u043d\3\2\2\2\u043c\u043e\5v<\2\u043d\u043c\3\2\2\2\u043d\u043e\3\2\2"+
		"\2\u043e\u0441\3\2\2\2\u043f\u0440\7\u00b3\2\2\u0440\u0442\t\b\2\2\u0441"+
		"\u043f\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0445\3\2\2\2\u0443\u0444\7\u00b3"+
		"\2\2\u0444\u0446\7\u00a1\2\2\u0445\u0443\3\2\2\2\u0445\u0446\3\2\2\2\u0446"+
		"\u0448\3\2\2\2\u0447\u0449\5x=\2\u0448\u0447\3\2\2\2\u0448\u0449\3\2\2"+
		"\2\u0449\u044b\3\2\2\2\u044a\u044c\5z>\2\u044b\u044a\3\2\2\2\u044b\u044c"+
		"\3\2\2\2\u044c\u044e\3\2\2\2\u044d\u044f\5|?\2\u044e\u044d\3\2\2\2\u044e"+
		"\u044f\3\2\2\2\u044f\u0451\3\2\2\2\u0450\u0452\5~@\2\u0451\u0450\3\2\2"+
		"\2\u0451\u0452\3\2\2\2\u0452\u0454\3\2\2\2\u0453\u0455\5\u0080A\2\u0454"+
		"\u0453\3\2\2\2\u0454\u0455\3\2\2\2\u0455i\3\2\2\2\u0456\u0457\7\u00b3"+
		"\2\2\u0457\u0458\5\u00a6T\2\u0458k\3\2\2\2\u0459\u045a\7\u00a0\2\2\u045a"+
		"\u045d\7\u00ba\2\2\u045b\u045c\7\u00b3\2\2\u045c\u045e\7\u009c\2\2\u045d"+
		"\u045b\3\2\2\2\u045d\u045e\3\2\2\2\u045em\3\2\2\2\u045f\u0460\7B\2\2\u0460"+
		"\u0461\5\u0082B\2\u0461o\3\2\2\2\u0462\u0464\t\t\2\2\u0463\u0462\3\2\2"+
		"\2\u0463\u0464\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0466\7\13\2\2\u0466"+
		"\u0467\7X\2\2\u0467\u0468\5\u00a6T\2\u0468q\3\2\2\2\u0469\u046a\7|\2\2"+
		"\u046a\u046b\5\u00aaV\2\u046bs\3\2\2\2\u046c\u046d\7\u00b2\2\2\u046d\u046e"+
		"\5\u00aaV\2\u046eu\3\2\2\2\u046f\u0470\7G\2\2\u0470\u0477\7\23\2\2\u0471"+
		"\u0472\t\b\2\2\u0472\u0473\7\u00cd\2\2\u0473\u0474\5\u00a6T\2\u0474\u0475"+
		"\7\u00d7\2\2\u0475\u0478\3\2\2\2\u0476\u0478\5\u00a6T\2\u0477\u0471\3"+
		"\2\2\2\u0477\u0476\3\2\2\2\u0478w\3\2\2\2\u0479\u047a\7H\2\2\u047a\u047b"+
		"\5\u00aaV\2\u047by\3\2\2\2\u047c\u047d\7w\2\2\u047d\u047e\7\23\2\2\u047e"+
		"\u047f\5\u008eH\2\u047f{\3\2\2\2\u0480\u0481\7a\2\2\u0481\u0482\5\u008c"+
		"G\2\u0482\u0483\7\23\2\2\u0483\u0484\5\u00a6T\2\u0484}\3\2\2\2\u0485\u0486"+
		"\7a\2\2\u0486\u0489\5\u008cG\2\u0487\u0488\7\u00b3\2\2\u0488\u048a\7\u009c"+
		"\2\2\u0489\u0487\3\2\2\2\u0489\u048a\3\2\2\2\u048a\177\3\2\2\2\u048b\u048c"+
		"\7\u008e\2\2\u048c\u048d\5\u0094K\2\u048d\u0081\3\2\2\2\u048e\u048f\b"+
		"B\1\2\u048f\u0491\5\u00b6\\\2\u0490\u0492\7<\2\2\u0491\u0490\3\2\2\2\u0491"+
		"\u0492\3\2\2\2\u0492\u0494\3\2\2\2\u0493\u0495\5\u008aF\2\u0494\u0493"+
		"\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u049b\3\2\2\2\u0496\u0497\7\u00cd\2"+
		"\2\u0497\u0498\5\u0082B\2\u0498\u0499\7\u00d7\2\2\u0499\u049b\3\2\2\2"+
		"\u049a\u048e\3\2\2\2\u049a\u0496\3\2\2\2\u049b\u04ad\3\2\2\2\u049c\u049d"+
		"\f\5\2\2\u049d\u049e\5\u0086D\2\u049e\u049f\5\u0082B\6\u049f\u04ac\3\2"+
		"\2\2\u04a0\u04a2\f\6\2\2\u04a1\u04a3\t\n\2\2\u04a2\u04a1\3\2\2\2\u04a2"+
		"\u04a3\3\2\2\2\u04a3\u04a5\3\2\2\2\u04a4\u04a6\5\u0084C\2\u04a5\u04a4"+
		"\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a8\7X\2\2\u04a8"+
		"\u04a9\5\u0082B\2\u04a9\u04aa\5\u0088E\2\u04aa\u04ac\3\2\2\2\u04ab\u049c"+
		"\3\2\2\2\u04ab\u04a0\3\2\2\2\u04ac\u04af\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ad"+
		"\u04ae\3\2\2\2\u04ae\u0083\3\2\2\2\u04af\u04ad\3\2\2\2\u04b0\u04b2\t\13"+
		"\2\2\u04b1\u04b0\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3"+
		"\u04ba\7R\2\2\u04b4\u04b6\7R\2\2\u04b5\u04b7\t\13\2\2\u04b6\u04b5\3\2"+
		"\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04ba\3\2\2\2\u04b8\u04ba\t\13\2\2\u04b9"+
		"\u04b1\3\2\2\2\u04b9\u04b4\3\2\2\2\u04b9\u04b8\3\2\2\2\u04ba\u04dc\3\2"+
		"\2\2\u04bb\u04bd\t\f\2\2\u04bc\u04bb\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd"+
		"\u04be\3\2\2\2\u04be\u04c0\t\r\2\2\u04bf\u04c1\7x\2\2\u04c0\u04bf\3\2"+
		"\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04ca\3\2\2\2\u04c2\u04c4\t\r\2\2\u04c3"+
		"\u04c5\7x\2\2\u04c4\u04c3\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c7\3\2"+
		"\2\2\u04c6\u04c8\t\f\2\2\u04c7\u04c6\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8"+
		"\u04ca\3\2\2\2\u04c9\u04bc\3\2\2\2\u04c9\u04c2\3\2\2\2\u04ca\u04dc\3\2"+
		"\2\2\u04cb\u04cd\t\16\2\2\u04cc\u04cb\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd"+
		"\u04ce\3\2\2\2\u04ce\u04d0\7C\2\2\u04cf\u04d1\7x\2\2\u04d0\u04cf\3\2\2"+
		"\2\u04d0\u04d1\3\2\2\2\u04d1\u04da\3\2\2\2\u04d2\u04d4\7C\2\2\u04d3\u04d5"+
		"\7x\2\2\u04d4\u04d3\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d7\3\2\2\2\u04d6"+
		"\u04d8\t\16\2\2\u04d7\u04d6\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04da\3"+
		"\2\2\2\u04d9\u04cc\3\2\2\2\u04d9\u04d2\3\2\2\2\u04da\u04dc\3\2\2\2\u04db"+
		"\u04b9\3\2\2\2\u04db\u04c9\3\2\2\2\u04db\u04d9\3\2\2\2\u04dc\u0085\3\2"+
		"\2\2\u04dd\u04df\t\n\2\2\u04de\u04dd\3\2\2\2\u04de\u04df\3\2\2\2\u04df"+
		"\u04e0\3\2\2\2\u04e0\u04e1\7\37\2\2\u04e1\u04e4\7X\2\2\u04e2\u04e4\7\u00c2"+
		"\2\2\u04e3\u04de\3\2\2\2\u04e3\u04e2\3\2\2\2\u04e4\u0087\3\2\2\2\u04e5"+
		"\u04e6\7t\2\2\u04e6\u04ef\5\u00a6T\2\u04e7\u04e8\7\u00aa\2\2\u04e8\u04e9"+
		"\7\u00cd\2\2\u04e9\u04ea\5\u00a6T\2\u04ea\u04eb\7\u00d7\2\2\u04eb\u04ef"+
		"\3\2\2\2\u04ec\u04ed\7\u00aa\2\2\u04ed\u04ef\5\u00a6T\2\u04ee\u04e5\3"+
		"\2\2\2\u04ee\u04e7\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ef\u0089\3\2\2\2\u04f0"+
		"\u04f1\7\u0088\2\2\u04f1\u04f4\5\u0092J\2\u04f2\u04f3\7s\2\2\u04f3\u04f5"+
		"\5\u0092J\2\u04f4\u04f2\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u008b\3\2\2"+
		"\2\u04f6\u04f9\5\u00aaV\2\u04f7\u04f8\t\17\2\2\u04f8\u04fa\5\u00aaV\2"+
		"\u04f9\u04f7\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u008d\3\2\2\2\u04fb\u0500"+
		"\5\u0090I\2\u04fc\u04fd\7\u00c2\2\2\u04fd\u04ff\5\u0090I\2\u04fe\u04fc"+
		"\3\2\2\2\u04ff\u0502\3\2\2\2\u0500\u04fe\3\2\2\2\u0500\u0501\3\2\2\2\u0501"+
		"\u008f\3\2\2\2\u0502\u0500\3\2\2\2\u0503\u0505\5\u00aaV\2\u0504\u0506"+
		"\t\20\2\2\u0505\u0504\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0509\3\2\2\2"+
		"\u0507\u0508\7r\2\2\u0508\u050a\t\21\2\2\u0509\u0507\3\2\2\2\u0509\u050a"+
		"\3\2\2\2\u050a\u050d\3\2\2\2\u050b\u050c\7\32\2\2\u050c\u050e\7\u00bc"+
		"\2\2\u050d\u050b\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u0091\3\2\2\2\u050f"+
		"\u0512\5\u00c4c\2\u0510\u0511\7\u00d9\2\2\u0511\u0513\5\u00c4c\2\u0512"+
		"\u0510\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0093\3\2\2\2\u0514\u0519\5\u0096"+
		"L\2\u0515\u0516\7\u00c2\2\2\u0516\u0518\5\u0096L\2\u0517\u0515\3\2\2\2"+
		"\u0518\u051b\3\2\2\2\u0519\u0517\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u0095"+
		"\3\2\2\2\u051b\u0519\3\2\2\2\u051c\u051d\5\u00d0i\2\u051d\u051e\7\u00c7"+
		"\2\2\u051e\u051f\5\u00c6d\2\u051f\u0097\3\2\2\2\u0520\u0521\7\u008d\2"+
		"\2\u0521\u0522\5\u0094K\2\u0522\u0099\3\2\2\2\u0523\u0524\7\u008f\2\2"+
		"\u0524\u0525\7\36\2\2\u0525\u0526\7!\2\2\u0526\u054e\5\u00c0a\2\u0527"+
		"\u0528\7\u008f\2\2\u0528\u0529\7\36\2\2\u0529\u052a\7.\2\2\u052a\u054e"+
		"\5\u00ba^\2\u052b\u052c\7\u008f\2\2\u052c\u052e\7\36\2\2\u052d\u052f\7"+
		"\u0099\2\2\u052e\u052d\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0531\3\2\2\2"+
		"\u0530\u0532\7\u0097\2\2\u0531\u0530\3\2\2\2\u0531\u0532\3\2\2\2\u0532"+
		"\u0533\3\2\2\2\u0533\u054e\5\u00ba^\2\u0534\u0535\7\u008f\2\2\u0535\u054e"+
		"\7\"\2\2\u0536\u0537\7\u008f\2\2\u0537\u053a\7-\2\2\u0538\u0539\7B\2\2"+
		"\u0539\u053b\5\u00c0a\2\u053a\u0538\3\2\2\2\u053a\u053b\3\2\2\2\u053b"+
		"\u054e\3\2\2\2\u053c\u053e\7\u008f\2\2\u053d\u053f\7\u0099\2\2\u053e\u053d"+
		"\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0543\7\u0098\2"+
		"\2\u0541\u0542\t\22\2\2\u0542\u0544\5\u00c0a\2\u0543\u0541\3\2\2\2\u0543"+
		"\u0544\3\2\2\2\u0544\u0548\3\2\2\2\u0545\u0546\7`\2\2\u0546\u0549\7\u00bc"+
		"\2\2\u0547\u0549\5t;\2\u0548\u0545\3\2\2\2\u0548\u0547\3\2\2\2\u0548\u0549"+
		"\3\2\2\2\u0549\u054b\3\2\2\2\u054a\u054c\5~@\2\u054b\u054a\3\2\2\2\u054b"+
		"\u054c\3\2\2\2\u054c\u054e\3\2\2\2\u054d\u0523\3\2\2\2\u054d\u0527\3\2"+
		"\2\2\u054d\u052b\3\2\2\2\u054d\u0534\3\2\2\2\u054d\u0536\3\2\2\2\u054d"+
		"\u053c\3\2\2\2\u054e\u009b\3\2\2\2\u054f\u0550\7\u0096\2\2\u0550\u0551"+
		"\7>\2\2\u0551\u0552\7\61\2\2\u0552\u0572\5\u00ba^\2\u0553\u0554\7\u0096"+
		"\2\2\u0554\u0555\7>\2\2\u0555\u0572\7d\2\2\u0556\u0557\7\u0096\2\2\u0557"+
		"\u0558\7\u0080\2\2\u0558\u0572\7-\2\2\u0559\u055a\7\u0096\2\2\u055a\u055b"+
		"\7\u0080\2\2\u055b\u055c\7.\2\2\u055c\u0572\5\u00ba^\2\u055d\u055e\7\u0096"+
		"\2\2\u055e\u0566\t\23\2\2\u055f\u0560\7\61\2\2\u0560\u0567\7\u008c\2\2"+
		"\u0561\u0567\7;\2\2\u0562\u0564\7\u00a5\2\2\u0563\u0562\3\2\2\2\u0563"+
		"\u0564\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0567\7g\2\2\u0566\u055f\3\2"+
		"\2\2\u0566\u0561\3\2\2\2\u0566\u0563\3\2\2\2\u0567\u0568\3\2\2\2\u0568"+
		"\u0572\5\u00ba^\2\u0569\u056a\7\u0096\2\2\u056a\u056b\t\23\2\2\u056b\u056c"+
		"\7\u0085\2\2\u056c\u0572\7\u008c\2\2\u056d\u056e\7\u0096\2\2\u056e\u056f"+
		"\7\u0094\2\2\u056f\u0570\7\u0084\2\2\u0570\u0572\5\u00ba^\2\u0571\u054f"+
		"\3\2\2\2\u0571\u0553\3\2\2\2\u0571\u0556\3\2\2\2\u0571\u0559\3\2\2\2\u0571"+
		"\u055d\3\2\2\2\u0571\u0569\3\2\2\2\u0571\u056d\3\2\2\2\u0572\u009d\3\2"+
		"\2\2\u0573\u0575\7\u00a4\2\2\u0574\u0576\7\u0099\2\2\u0575\u0574\3\2\2"+
		"\2\u0575\u0576\3\2\2\2\u0576\u0578\3\2\2\2\u0577\u0579\7\u0097\2\2\u0578"+
		"\u0577\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057c\3\2\2\2\u057a\u057b\7L"+
		"\2\2\u057b\u057d\7\67\2\2\u057c\u057a\3\2\2\2\u057c\u057d\3\2\2\2\u057d"+
		"\u057e\3\2\2\2\u057e\u0580\5\u00ba^\2\u057f\u0581\5,\27\2\u0580\u057f"+
		"\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u009f\3\2\2\2\u0582\u0583\7\u00a9\2"+
		"\2\u0583\u0584\5\u00c0a\2\u0584\u00a1\3\2\2\2\u0585\u0586\7\u00af\2\2"+
		"\u0586\u0588\5\u00ba^\2\u0587\u0589\7\66\2\2\u0588\u0587\3\2\2\2\u0588"+
		"\u0589\3\2\2\2\u0589\u058c\3\2\2\2\u058a\u058b\7a\2\2\u058b\u058d\7\u00ba"+
		"\2\2\u058c\u058a\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u00a3\3\2\2\2\u058e"+
		"\u05be\5\u00d0i\2\u058f\u0590\5\u00d0i\2\u0590\u0591\7\u00cd\2\2\u0591"+
		"\u0592\5\u00d0i\2\u0592\u0599\5\u00a4S\2\u0593\u0594\7\u00c2\2\2\u0594"+
		"\u0595\5\u00d0i\2\u0595\u0596\5\u00a4S\2\u0596\u0598\3\2\2\2\u0597\u0593"+
		"\3\2\2\2\u0598\u059b\3\2\2\2\u0599\u0597\3\2\2\2\u0599\u059a\3\2\2\2\u059a"+
		"\u059c\3\2\2\2\u059b\u0599\3\2\2\2\u059c\u059d\7\u00d7\2\2\u059d\u05be"+
		"\3\2\2\2\u059e\u059f\5\u00d0i\2\u059f\u05a0\7\u00cd\2\2\u05a0\u05a5\5"+
		"\u00d4k\2\u05a1\u05a2\7\u00c2\2\2\u05a2\u05a4\5\u00d4k\2\u05a3\u05a1\3"+
		"\2\2\2\u05a4\u05a7\3\2\2\2\u05a5\u05a3\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6"+
		"\u05a8\3\2\2\2\u05a7\u05a5\3\2\2\2\u05a8\u05a9\7\u00d7\2\2\u05a9\u05be"+
		"\3\2\2\2\u05aa\u05ab\5\u00d0i\2\u05ab\u05ac\7\u00cd\2\2\u05ac\u05b1\5"+
		"\u00a4S\2\u05ad\u05ae\7\u00c2\2\2\u05ae\u05b0\5\u00a4S\2\u05af\u05ad\3"+
		"\2\2\2\u05b0\u05b3\3\2\2\2\u05b1\u05af\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2"+
		"\u05b4\3\2\2\2\u05b3\u05b1\3\2\2\2\u05b4\u05b5\7\u00d7\2\2\u05b5\u05be"+
		"\3\2\2\2\u05b6\u05b7\5\u00d0i\2\u05b7\u05b9\7\u00cd\2\2\u05b8\u05ba\5"+
		"\u00a6T\2\u05b9\u05b8\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bb\3\2\2\2"+
		"\u05bb\u05bc\7\u00d7\2\2\u05bc\u05be\3\2\2\2\u05bd\u058e\3\2\2\2\u05bd"+
		"\u058f\3\2\2\2\u05bd\u059e\3\2\2\2\u05bd\u05aa\3\2\2\2\u05bd\u05b6\3\2"+
		"\2\2\u05be\u00a5\3\2\2\2\u05bf\u05c4\5\u00a8U\2\u05c0\u05c1\7\u00c2\2"+
		"\2\u05c1\u05c3\5\u00a8U\2\u05c2\u05c0\3\2\2\2\u05c3\u05c6\3\2\2\2\u05c4"+
		"\u05c2\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u00a7\3\2\2\2\u05c6\u05c4\3\2"+
		"\2\2\u05c7\u05c8\5\u00ba^\2\u05c8\u05c9\7\u00c5\2\2\u05c9\u05cb\3\2\2"+
		"\2\u05ca\u05c7\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05d3"+
		"\7\u00be\2\2\u05cd\u05ce\7\u00cd\2\2\u05ce\u05cf\5d\63\2\u05cf\u05d0\7"+
		"\u00d7\2\2\u05d0\u05d3\3\2\2\2\u05d1\u05d3\5\u00aaV\2\u05d2\u05ca\3\2"+
		"\2\2\u05d2\u05cd\3\2\2\2\u05d2\u05d1\3\2\2\2\u05d3\u00a9\3\2\2\2\u05d4"+
		"\u05d5\bV\1\2\u05d5\u05d7\7\24\2\2\u05d6\u05d8\5\u00aaV\2\u05d7\u05d6"+
		"\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05de\3\2\2\2\u05d9\u05da\7\u00b1\2"+
		"\2\u05da\u05db\5\u00aaV\2\u05db\u05dc\7\u009b\2\2\u05dc\u05dd\5\u00aa"+
		"V\2\u05dd\u05df\3\2\2\2\u05de\u05d9\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0"+
		"\u05de\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e4\3\2\2\2\u05e2\u05e3\7\63"+
		"\2\2\u05e3\u05e5\5\u00aaV\2\u05e4\u05e2\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5"+
		"\u05e6\3\2\2\2\u05e6\u05e7\7\64\2\2\u05e7\u0640\3\2\2\2\u05e8\u05e9\7"+
		"\25\2\2\u05e9\u05ea\7\u00cd\2\2\u05ea\u05eb\5\u00aaV\2\u05eb\u05ec\7\f"+
		"\2\2\u05ec\u05ed\5\u00a4S\2\u05ed\u05ee\7\u00d7\2\2\u05ee\u0640\3\2\2"+
		"\2\u05ef\u05f0\7#\2\2\u05f0\u0640\7\u00bc\2\2\u05f1\u05f2\7:\2\2\u05f2"+
		"\u05f3\7\u00cd\2\2\u05f3\u05f4\5\u00c8e\2\u05f4\u05f5\7B\2\2\u05f5\u05f6"+
		"\5\u00aaV\2\u05f6\u05f7\7\u00d7\2\2\u05f7\u0640\3\2\2\2\u05f8\u05f9\7"+
		"T\2\2\u05f9\u05fa\5\u00aaV\2\u05fa\u05fb\5\u00c8e\2\u05fb\u0640\3\2\2"+
		"\2\u05fc\u05fd\7\u0093\2\2\u05fd\u05fe\7\u00cd\2\2\u05fe\u05ff\5\u00aa"+
		"V\2\u05ff\u0600\7B\2\2\u0600\u0603\5\u00aaV\2\u0601\u0602\7?\2\2\u0602"+
		"\u0604\5\u00aaV\2\u0603\u0601\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u0605"+
		"\3\2\2\2\u0605\u0606\7\u00d7\2\2\u0606\u0640\3\2\2\2\u0607\u0608\7\u009e"+
		"\2\2\u0608\u0640\7\u00bc\2\2\u0609\u060a\7\u00a3\2\2\u060a\u060b\7\u00cd"+
		"\2\2\u060b\u060c\t\24\2\2\u060c\u060d\7\u00bc\2\2\u060d\u060e\7B\2\2\u060e"+
		"\u060f\5\u00aaV\2\u060f\u0610\7\u00d7\2\2\u0610\u0640\3\2\2\2\u0611\u0617"+
		"\5\u00d0i\2\u0612\u0614\7\u00cd\2\2\u0613\u0615\5\u00a6T\2\u0614\u0613"+
		"\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u0618\7\u00d7\2"+
		"\2\u0617\u0612\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u061b"+
		"\7\u00cd\2\2\u061a\u061c\7\60\2\2\u061b\u061a\3\2\2\2\u061b\u061c\3\2"+
		"\2\2\u061c\u061e\3\2\2\2\u061d\u061f\5\u00acW\2\u061e\u061d\3\2\2\2\u061e"+
		"\u061f\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0621\7\u00d7\2\2\u0621\u0640"+
		"\3\2\2\2\u0622\u0640\5\u00c6d\2\u0623\u0624\7\u00c4\2\2\u0624\u0640\5"+
		"\u00aaV\23\u0625\u0626\7p\2\2\u0626\u0640\5\u00aaV\16\u0627\u0628\5\u00ba"+
		"^\2\u0628\u0629\7\u00c5\2\2\u0629\u062b\3\2\2\2\u062a\u0627\3\2\2\2\u062a"+
		"\u062b\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u0640\7\u00be\2\2\u062d\u062e"+
		"\7\u00cd\2\2\u062e\u062f\5d\63\2\u062f\u0630\7\u00d7\2\2\u0630\u0640\3"+
		"\2\2\2\u0631\u0632\7\u00cd\2\2\u0632\u0633\5\u00aaV\2\u0633\u0634\7\u00d7"+
		"\2\2\u0634\u0640\3\2\2\2\u0635\u0636\7\u00cd\2\2\u0636\u0637\5\u00a6T"+
		"\2\u0637\u0638\7\u00d7\2\2\u0638\u0640\3\2\2\2\u0639\u063b\7\u00cb\2\2"+
		"\u063a\u063c\5\u00a6T\2\u063b\u063a\3\2\2\2\u063b\u063c\3\2\2\2\u063c"+
		"\u063d\3\2\2\2\u063d\u0640\7\u00d6\2\2\u063e\u0640\5\u00b2Z\2\u063f\u05d4"+
		"\3\2\2\2\u063f\u05e8\3\2\2\2\u063f\u05ef\3\2\2\2\u063f\u05f1\3\2\2\2\u063f"+
		"\u05f8\3\2\2\2\u063f\u05fc\3\2\2\2\u063f\u0607\3\2\2\2\u063f\u0609\3\2"+
		"\2\2\u063f\u0611\3\2\2\2\u063f\u0622\3\2\2\2\u063f\u0623\3\2\2\2\u063f"+
		"\u0625\3\2\2\2\u063f\u062a\3\2\2\2\u063f\u062d\3\2\2\2\u063f\u0631\3\2"+
		"\2\2\u063f\u0635\3\2\2\2\u063f\u0639\3\2\2\2\u063f\u063e\3\2\2\2\u0640"+
		"\u0688\3\2\2\2\u0641\u0642\f\22\2\2\u0642\u0643\t\25\2\2\u0643\u0687\5"+
		"\u00aaV\23\u0644\u0645\f\21\2\2\u0645\u0646\t\26\2\2\u0646\u0687\5\u00aa"+
		"V\22\u0647\u065a\f\20\2\2\u0648\u065b\7\u00c6\2\2\u0649\u065b\7\u00c7"+
		"\2\2\u064a\u065b\7\u00cf\2\2\u064b\u065b\7\u00cc\2\2\u064c\u065b\7\u00c8"+
		"\2\2\u064d\u065b\7\u00ce\2\2\u064e\u065b\7\u00c9\2\2\u064f\u0651\7E\2"+
		"\2\u0650\u064f\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0653\3\2\2\2\u0652\u0654"+
		"\7p\2\2\u0653\u0652\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0655\3\2\2\2\u0655"+
		"\u065b\7N\2\2\u0656\u0658\7p\2\2\u0657\u0656\3\2\2\2\u0657\u0658\3\2\2"+
		"\2\u0658\u0659\3\2\2\2\u0659\u065b\t\27\2\2\u065a\u0648\3\2\2\2\u065a"+
		"\u0649\3\2\2\2\u065a\u064a\3\2\2\2\u065a\u064b\3\2\2\2\u065a\u064c\3\2"+
		"\2\2\u065a\u064d\3\2\2\2\u065a\u064e\3\2\2\2\u065a\u0650\3\2\2\2\u065a"+
		"\u0657\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u0687\5\u00aaV\21\u065d\u065e"+
		"\f\r\2\2\u065e\u065f\7\b\2\2\u065f\u0687\5\u00aaV\16\u0660\u0661\f\f\2"+
		"\2\u0661\u0662\7v\2\2\u0662\u0687\5\u00aaV\r\u0663\u0665\f\13\2\2\u0664"+
		"\u0666\7p\2\2\u0665\u0664\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u0667\3\2"+
		"\2\2\u0667\u0668\7\21\2\2\u0668\u0669\5\u00aaV\2\u0669\u066a\7\b\2\2\u066a"+
		"\u066b\5\u00aaV\f\u066b\u0687\3\2\2\2\u066c\u066d\f\n\2\2\u066d\u066e"+
		"\7\u00d2\2\2\u066e\u066f\5\u00aaV\2\u066f\u0670\7\u00c1\2\2\u0670\u0671"+
		"\5\u00aaV\n\u0671\u0687\3\2\2\2\u0672\u0673\f\25\2\2\u0673\u0674\7\u00cb"+
		"\2\2\u0674\u0675\5\u00aaV\2\u0675\u0676\7\u00d6\2\2\u0676\u0687\3\2\2"+
		"\2\u0677\u0678\f\24\2\2\u0678\u0679\7\u00c5\2\2\u0679\u0687\7\u00ba\2"+
		"\2\u067a\u067b\f\17\2\2\u067b\u067d\7V\2\2\u067c\u067e\7p\2\2\u067d\u067c"+
		"\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0687\7q\2\2\u0680"+
		"\u0684\f\t\2\2\u0681\u0685\5\u00ceh\2\u0682\u0683\7\f\2\2\u0683\u0685"+
		"\5\u00d0i\2\u0684\u0681\3\2\2\2\u0684\u0682\3\2\2\2\u0685\u0687\3\2\2"+
		"\2\u0686\u0641\3\2\2\2\u0686\u0644\3\2\2\2\u0686\u0647\3\2\2\2\u0686\u065d"+
		"\3\2\2\2\u0686\u0660\3\2\2\2\u0686\u0663\3\2\2\2\u0686\u066c\3\2\2\2\u0686"+
		"\u0672\3\2\2\2\u0686\u0677\3\2\2\2\u0686\u067a\3\2\2\2\u0686\u0680\3\2"+
		"\2\2\u0687\u068a\3\2\2\2\u0688\u0686\3\2\2\2\u0688\u0689\3\2\2\2\u0689"+
		"\u00ab\3\2\2\2\u068a\u0688\3\2\2\2\u068b\u0690\5\u00aeX\2\u068c\u068d"+
		"\7\u00c2\2\2\u068d\u068f\5\u00aeX\2\u068e\u068c\3\2\2\2\u068f\u0692\3"+
		"\2\2\2\u0690\u068e\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u00ad\3\2\2\2\u0692"+
		"\u0690\3\2\2\2\u0693\u0696\5\u00b0Y\2\u0694\u0696\5\u00aaV\2\u0695\u0693"+
		"\3\2\2\2\u0695\u0694\3\2\2\2\u0696\u00af\3\2\2\2\u0697\u0698\7\u00cd\2"+
		"\2\u0698\u069d\5\u00d0i\2\u0699\u069a\7\u00c2\2\2\u069a\u069c\5\u00d0"+
		"i\2\u069b\u0699\3\2\2\2\u069c\u069f\3\2\2\2\u069d\u069b\3\2\2\2\u069d"+
		"\u069e\3\2\2\2\u069e\u06a0\3\2\2\2\u069f\u069d\3\2\2\2\u06a0\u06a1\7\u00d7"+
		"\2\2\u06a1\u06ab\3\2\2\2\u06a2\u06a7\5\u00d0i\2\u06a3\u06a4\7\u00c2\2"+
		"\2\u06a4\u06a6\5\u00d0i\2\u06a5\u06a3\3\2\2\2\u06a6\u06a9\3\2\2\2\u06a7"+
		"\u06a5\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06ab\3\2\2\2\u06a9\u06a7\3\2"+
		"\2\2\u06aa\u0697\3\2\2\2\u06aa\u06a2\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac"+
		"\u06ad\7\u00bd\2\2\u06ad\u06ae\5\u00aaV\2\u06ae\u00b1\3\2\2\2\u06af\u06b0"+
		"\5\u00ba^\2\u06b0\u06b1\7\u00c5\2\2\u06b1\u06b3\3\2\2\2\u06b2\u06af\3"+
		"\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b4\u06b5\5\u00b4[\2"+
		"\u06b5\u00b3\3\2\2\2\u06b6\u06b9\5\u00d0i\2\u06b7\u06b8\7\u00c5\2\2\u06b8"+
		"\u06ba\5\u00d0i\2\u06b9\u06b7\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u00b5"+
		"\3\2\2\2\u06bb\u06bc\b\\\1\2\u06bc\u06c3\5\u00ba^\2\u06bd\u06c3\5\u00b8"+
		"]\2\u06be\u06bf\7\u00cd\2\2\u06bf\u06c0\5d\63\2\u06c0\u06c1\7\u00d7\2"+
		"\2\u06c1\u06c3\3\2\2\2\u06c2\u06bb\3\2\2\2\u06c2\u06bd\3\2\2\2\u06c2\u06be"+
		"\3\2\2\2\u06c3\u06cc\3\2\2\2\u06c4\u06c8\f\3\2\2\u06c5\u06c9\5\u00ceh"+
		"\2\u06c6\u06c7\7\f\2\2\u06c7\u06c9\5\u00d0i\2\u06c8\u06c5\3\2\2\2\u06c8"+
		"\u06c6\3\2\2\2\u06c9\u06cb\3\2\2\2\u06ca\u06c4\3\2\2\2\u06cb\u06ce\3\2"+
		"\2\2\u06cc\u06ca\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u00b7\3\2\2\2\u06ce"+
		"\u06cc\3\2\2\2\u06cf\u06d0\5\u00d0i\2\u06d0\u06d2\7\u00cd\2\2\u06d1\u06d3"+
		"\5\u00bc_\2\u06d2\u06d1\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u06d4\3\2\2"+
		"\2\u06d4\u06d5\7\u00d7\2\2\u06d5\u00b9\3\2\2\2\u06d6\u06d7\5\u00c0a\2"+
		"\u06d7\u06d8\7\u00c5\2\2\u06d8\u06da\3\2\2\2\u06d9\u06d6\3\2\2\2\u06d9"+
		"\u06da\3\2\2\2\u06da\u06db\3\2\2\2\u06db\u06dc\5\u00d0i\2\u06dc\u00bb"+
		"\3\2\2\2\u06dd\u06e2\5\u00be`\2\u06de\u06df\7\u00c2\2\2\u06df\u06e1\5"+
		"\u00be`\2\u06e0\u06de\3\2\2\2\u06e1\u06e4\3\2\2\2\u06e2\u06e0\3\2\2\2"+
		"\u06e2\u06e3\3\2\2\2\u06e3\u00bd\3\2\2\2\u06e4\u06e2\3\2\2\2\u06e5\u06e9"+
		"\5\u00ba^\2\u06e6\u06e9\5\u00b8]\2\u06e7\u06e9\5\u00c6d\2\u06e8\u06e5"+
		"\3\2\2\2\u06e8\u06e6\3\2\2\2\u06e8\u06e7\3\2\2\2\u06e9\u00bf\3\2\2\2\u06ea"+
		"\u06eb\5\u00d0i\2\u06eb\u00c1\3\2\2\2\u06ec\u06f5\7\u00b8\2\2\u06ed\u06ee"+
		"\7\u00c5\2\2\u06ee\u06f5\t\30\2\2\u06ef\u06f0\7\u00ba\2\2\u06f0\u06f2"+
		"\7\u00c5\2\2\u06f1\u06f3\t\30\2\2\u06f2\u06f1\3\2\2\2\u06f2\u06f3\3\2"+
		"\2\2\u06f3\u06f5\3\2\2\2\u06f4\u06ec\3\2\2\2\u06f4\u06ed\3\2\2\2\u06f4"+
		"\u06ef\3\2\2\2\u06f5\u00c3\3\2\2\2\u06f6\u06f8\t\31\2\2\u06f7\u06f6\3"+
		"\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06ff\3\2\2\2\u06f9\u0700\5\u00c2b\2"+
		"\u06fa\u0700\7\u00b9\2\2\u06fb\u0700\7\u00ba\2\2\u06fc\u0700\7\u00bb\2"+
		"\2\u06fd\u0700\7P\2\2\u06fe\u0700\7n\2\2\u06ff\u06f9\3\2\2\2\u06ff\u06fa"+
		"\3\2\2\2\u06ff\u06fb\3\2\2\2\u06ff\u06fc\3\2\2\2\u06ff\u06fd\3\2\2\2\u06ff"+
		"\u06fe\3\2\2\2\u0700\u00c5\3\2\2\2\u0701\u0705\5\u00c4c\2\u0702\u0705"+
		"\7\u00bc\2\2\u0703\u0705\7q\2\2\u0704\u0701\3\2\2\2\u0704\u0702\3\2\2"+
		"\2\u0704\u0703\3\2\2\2\u0705\u00c7\3\2\2\2\u0706\u0707\t\32\2\2\u0707"+
		"\u00c9\3\2\2\2\u0708\u0709\t\33\2\2\u0709\u00cb\3\2\2\2\u070a\u070b\t"+
		"\34\2\2\u070b\u00cd\3\2\2\2\u070c\u070f\7\u00b7\2\2\u070d\u070f\5\u00cc"+
		"g\2\u070e\u070c\3\2\2\2\u070e\u070d\3\2\2\2\u070f\u00cf\3\2\2\2\u0710"+
		"\u0714\7\u00b7\2\2\u0711\u0714\5\u00c8e\2\u0712\u0714\5\u00caf\2\u0713"+
		"\u0710\3\2\2\2\u0713\u0711\3\2\2\2\u0713\u0712\3\2\2\2\u0714\u00d1\3\2"+
		"\2\2\u0715\u0718\5\u00d0i\2\u0716\u0718\7q\2\2\u0717\u0715\3\2\2\2\u0717"+
		"\u0716\3\2\2\2\u0718\u00d3\3\2\2\2\u0719\u071a\7\u00bc\2\2\u071a\u071b"+
		"\7\u00c7\2\2\u071b\u071c\5\u00c4c\2\u071c\u00d5\3\2\2\2\u00f4\u00da\u00de"+
		"\u00e1\u00e4\u00f8\u00fe\u0105\u010d\u0112\u0119\u011e\u0124\u012a\u012f"+
		"\u0135\u0143\u014a\u0151\u0157\u0160\u016a\u0174\u0188\u0190\u019f\u01a6"+
		"\u01b4\u01ba\u01c0\u01c7\u01cb\u01ce\u01d5\u01d9\u01dc\u01e7\u01eb\u01ee"+
		"\u01f3\u01f5\u01f8\u01fb\u0205\u0209\u020c\u020f\u0214\u0216\u021c\u0222"+
		"\u0226\u0229\u022c\u022f\u0232\u0237\u023d\u0241\u0244\u0247\u024b\u0253"+
		"\u026d\u026f\u0273\u0289\u028b\u0296\u0299\u02a2\u02b3\u02be\u02d0\u02dd"+
		"\u02ee\u02f7\u0312\u0314\u0329\u032e\u0333\u0336\u0340\u0345\u0349\u034c"+
		"\u0350\u0354\u0359\u035c\u0360\u0362\u0375\u037d\u0380\u038a\u038e\u0396"+
		"\u039a\u039f\u03a3\u03a7\u03ab\u03af\u03b1\u03b9\u03bd\u03c0\u03c9\u03ce"+
		"\u03d1\u03db\u03e5\u03e9\u03ee\u03f2\u03f8\u03fb\u03fe\u0401\u040f\u0413"+
		"\u041b\u0423\u0426\u042a\u042d\u0431\u0434\u0437\u043a\u043d\u0441\u0445"+
		"\u0448\u044b\u044e\u0451\u0454\u045d\u0463\u0477\u0489\u0491\u0494\u049a"+
		"\u04a2\u04a5\u04ab\u04ad\u04b1\u04b6\u04b9\u04bc\u04c0\u04c4\u04c7\u04c9"+
		"\u04cc\u04d0\u04d4\u04d7\u04d9\u04db\u04de\u04e3\u04ee\u04f4\u04f9\u0500"+
		"\u0505\u0509\u050d\u0512\u0519\u052e\u0531\u053a\u053e\u0543\u0548\u054b"+
		"\u054d\u0563\u0566\u0571\u0575\u0578\u057c\u0580\u0588\u058c\u0599\u05a5"+
		"\u05b1\u05b9\u05bd\u05c4\u05ca\u05d2\u05d7\u05e0\u05e4\u0603\u0614\u0617"+
		"\u061b\u061e\u062a\u063b\u063f\u0650\u0653\u0657\u065a\u0665\u067d\u0684"+
		"\u0686\u0688\u0690\u0695\u069d\u06a7\u06aa\u06b2\u06b9\u06c2\u06c8\u06cc"+
		"\u06d2\u06d9\u06e2\u06e8\u06f2\u06f4\u06f7\u06ff\u0704\u070e\u0713\u0717";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}