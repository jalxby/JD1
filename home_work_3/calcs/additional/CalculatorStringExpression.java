package home_work_3.calcs.additional;

public class CalculatorStringExpression {
    private String expr;

    public CalculatorStringExpression(String expr){
        this.expr = expr;
    }

    public String getExpr() {
        return expr;
    }

    public void parsString(){
        char [] chars = this.expr.toCharArray();
    }
}
