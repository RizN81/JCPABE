package cpabe.policyparser;

import java.text.ParseException;

public class ASTExpression extends SimpleNode {
    private String type = null;

    public ASTExpression(int id) {
        super(id);
    }

    public ASTExpression(ParseTree p, int id) {
        super(p, id);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) throws ParseException {
        if (this.type != null) {
            if (!this.type.equals(type))
                throw new ParseException("Different Type already set. (Dont mix and/or without parenthesis)");
        } else {
            this.type = type;
        }
    }

    public String toString() {
        return "Expressiontype: " + type;
    }
}
