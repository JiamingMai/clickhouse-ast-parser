package com.clickhouse.parser.ast;

import com.clickhouse.parser.AstVisitor;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public class TableIdentifier extends Identifier {

    private Identifier db;

    public TableIdentifier(TableIdentifier tableIdentifier) {
        super(null != tableIdentifier ? tableIdentifier.getName() : "");
        if (null != tableIdentifier && null != tableIdentifier.db) {
            this.db = new DatabaseIdentifier(tableIdentifier.db);
        }
    }

    public TableIdentifier(Identifier database, Identifier name) {
        super(null != name ? name.getName() : "");
        db = new DatabaseIdentifier(database);
    }

    public Identifier getDatabase() {
        return db;
    }

    public String getQualifiedName(String joinnerSymbol) {
        if (null != db && !db.getQualifiedName().isEmpty()) {
            return db.getQualifiedName() + joinnerSymbol + getName();
        } else {
            return getName();
        }
    }

    public String getQualifiedName() {
        if (null != db && !db.getQualifiedName().isEmpty()) {
            return db.getQualifiedName() + "." + getName();
        } else {
            return getName();
        }
    }

    void makeCompound() {
        if (null != db) {
            name = db.getName() + "." + getName();
        }
    }

    @Override
    public <T> T accept(AstVisitor<T> astVisitor) {
        return astVisitor.visitTableIdentifier(this);
    }
}
