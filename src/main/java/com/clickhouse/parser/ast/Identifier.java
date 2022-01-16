package com.clickhouse.parser.ast;

import com.clickhouse.parser.AstVisitor;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=true)
public class Identifier extends INode {

    protected String name;

    public Identifier(String name) {
        this.name = name;
        // TODO:
        /*
        if (name.front() == '`' || name.front() == '"')
        {
            String s;
            ReadBufferFromMemory in(name.data(), name.size());

            if (name.front() == '`')
                readBackQuotedStringWithSQLStyle(s, in);
            else
                readDoubleQuotedStringWithSQLStyle(s, in);

            assert(in.count() == name.size());
            name = s;
        }
        */
    }

    public Identifier(String name, String nestedName) {
        this(name + "." + nestedName);
    }

    public String getQualifiedName() {
        return name;
    }

    protected String dumpInfo() {
        return getQualifiedName();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Identifier{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitIdentifier(this);
    }
}
