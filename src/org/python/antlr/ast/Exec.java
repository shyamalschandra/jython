// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class Exec extends stmtType {
    public exprType body;
    public exprType globals;
    public exprType locals;

    private final static String[] fields = new String[] {"body", "globals",
                                                          "locals"};
    public String[] get_fields() { return fields; }

    public Exec(exprType body, exprType globals, exprType locals) {
        this.body = body;
        addChild(body);
        this.globals = globals;
        addChild(globals);
        this.locals = locals;
        addChild(locals);
    }

    public Exec(Token token, exprType body, exprType globals, exprType locals) {
        super(token);
        this.body = body;
        addChild(body);
        this.globals = globals;
        addChild(globals);
        this.locals = locals;
        addChild(locals);
    }

    public Exec(int ttype, Token token, exprType body, exprType globals,
    exprType locals) {
        super(ttype, token);
        this.body = body;
        addChild(body);
        this.globals = globals;
        addChild(globals);
        this.locals = locals;
        addChild(locals);
    }

    public Exec(PythonTree tree, exprType body, exprType globals, exprType
    locals) {
        super(tree);
        this.body = body;
        addChild(body);
        this.globals = globals;
        addChild(globals);
        this.locals = locals;
        addChild(locals);
    }

    public String toString() {
        return "Exec";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Exec(");
        sb.append("body=");
        sb.append(dumpThis(body));
        sb.append(",");
        sb.append("globals=");
        sb.append(dumpThis(globals));
        sb.append(",");
        sb.append("locals=");
        sb.append(dumpThis(locals));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitExec(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (body != null)
            body.accept(visitor);
        if (globals != null)
            globals.accept(visitor);
        if (locals != null)
            locals.accept(visitor);
    }

    public int getLineno() {
        return getLine();
    }

    public int getCol_offset() {
        return getCharPositionInLine();
    }

}
