package com.clickhouse.parser.ast;

import com.clickhouse.parser.AstVisitor;
import lombok.EqualsAndHashCode;
import org.antlr.v4.runtime.tree.TerminalNode;

@EqualsAndHashCode
public class Literal extends INode {

    private LiteralType type;

    // STRING is stored without quotes and interpolated with escape-sequences.
    protected String token;

    enum LiteralType
    {
        NULL_LITERAL,
        NUMBER,
        STRING,
    }

    protected Literal(LiteralType type, String token) {
        this.type = type;
        this.token = token;
    }

    public static Literal createNull() {
        return new Literal(LiteralType.NULL_LITERAL, "");
    }

    public static NumberLiteral createNumber(TerminalNode literal) {
        return createNumber(literal, false);
    }

    public static NumberLiteral createNumber(TerminalNode literal, boolean negative) {
        NumberLiteral number = new NumberLiteral(literal);
        if (negative) {
            number.makeNegative();
        }
        return number;
    }

    // checks first symbol for '-' character
    public static NumberLiteral createNumber(String literal) {
        boolean hasMinus = literal.charAt(0) == '-';
        NumberLiteral number = new NumberLiteral(hasMinus ? literal.substring(1) : literal);
        if (hasMinus) {
            number.makeNegative();
        }
        return number;
    }

    public static StringLiteral createString(TerminalNode literal) {
        return new StringLiteral(literal);
    }

    // without quotes
    public static StringLiteral createString(String literal) {
        return new StringLiteral(literal);
    }

    public String asString() {
        if (type.equals(LiteralType.NULL_LITERAL)) {
            return "NULL";
        }
        return token;
    }

    public String asStringWithoutQuote() {
        if (token.startsWith("'") && token.endsWith("'")) {
            return token.substring(1, token.length() - 1);
        } else {
            return token;
        }
    }

    Integer asNumber(boolean minus) {
        // TODO:
        /*
        Integer number;
        String str = (minus ? "-" : "+") + token;
        if (token.length() > 2 && (token.charAt(1) == 'x' || token.charAt(1) == 'X')) {
            return Integer.parseInt(token, 8);
        } else if (token.length() > 1 && (token.charAt(0) == '0')) {

        } else {

        }
        return number;
         */
        return null;
    }

    private String dumpInfo () {
        return token;
    }

    public boolean is(LiteralType what) {
        return type == what;
    }

    @Override
    public String toString() {
        return type == LiteralType.STRING ? "'" + token + "'" : token;
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitLiteral(this);
    }

}
