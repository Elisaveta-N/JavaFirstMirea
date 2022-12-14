package task22;

import java.util.Stack;

public class CalcModel {
    private Number res;
    Stack<Number> stackNum;
    String cur;

    String strExpression;

    public CalcModel(){
        res = 0;
        cur = "";
        strExpression = "";
        stackNum = new Stack<>();
    }

    public static Number addNumbers(Number a, Number b) {
        if(a instanceof Double || b instanceof Double) {
            return a.doubleValue() + b.doubleValue();
        } else if(a instanceof Float || b instanceof Float) {
            return a.floatValue() + b.floatValue();
        } else if(a instanceof Long || b instanceof Long) {
            return a.longValue() + b.longValue();
        } else {
            return a.intValue() + b.intValue();
        }
    }

    public static Number deltaNumbers(Number a, Number b) {
        if(a instanceof Double || b instanceof Double) {
            return a.doubleValue() - b.doubleValue();
        } else if(a instanceof Float || b instanceof Float) {
            return a.floatValue() - b.floatValue();
        } else if(a instanceof Long || b instanceof Long) {
            return a.longValue() - b.longValue();
        } else {
            return a.intValue() - b.intValue();
        }
    }

    public static Number divNumbers(Number a, Number b) {
        if(a instanceof Double || b instanceof Double) {
            return a.doubleValue() / b.doubleValue();
        } else if(a instanceof Float || b instanceof Float) {
            return a.floatValue() / b.floatValue();
        } else if(a instanceof Long || b instanceof Long) {
            if(a.longValue() % b.longValue() == 0)
                return a.longValue() / b.longValue();
            else
                return a.doubleValue() / b.doubleValue();
        } else {
            if(a.intValue() % b.intValue() == 0)
                return a.intValue() / b.intValue();
            else
                return a.doubleValue() / b.doubleValue();
        }
    }

    public static Number mulNumbers(Number a, Number b) {
        if(a instanceof Double || b instanceof Double) {
            return a.doubleValue() * b.doubleValue();
        } else if(a instanceof Float || b instanceof Float) {
            return a.floatValue() * b.floatValue();
        } else if(a instanceof Long || b instanceof Long) {
            return a.longValue() * b.longValue();
        } else {
            return a.intValue() * b.intValue();
        }
    }

    boolean addSymbol(String s)
    {
        boolean bRes = false;

        switch (s) {
            case "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "." -> {
                cur += s;
                bRes = true;
            }
            case "+", "-", "/", "*" -> {
                if (cur.length() > 0) {
                    if (cur.indexOf('.') == -1)
                        stackNum.push(Integer.parseInt(cur));
                    else
                        stackNum.push(Double.parseDouble(cur));
                    cur = "";
                }
                if (stackNum.size() > 1) {
                    Number b = stackNum.pop();
                    Number a = stackNum.pop();
                    switch (s) {
                        case "+" -> stackNum.push(addNumbers(a, b));
                        case "-" -> stackNum.push(deltaNumbers(a, b));
                        case "/" -> stackNum.push(divNumbers(a, b));
                        case "*" -> stackNum.push(mulNumbers(a, b));
                    }
                    cur = "";
                    bRes = true;
                }
            }
            case " " -> {
                if (cur.length() > 0) {
                    if (cur.indexOf('.') == -1)
                        stackNum.push(Integer.parseInt(cur));
                    else
                        stackNum.push(Double.parseDouble(cur));
                    cur = "";
                }
                bRes = true;
            }
            case "=" -> {
                if (stackNum.size() == 1) {
                    res = stackNum.pop();
                    strExpression = res.toString();
                    cur = "";
                    bRes = true;
                }
            }
        }

        return bRes;
    }

    public String getExpression()
    {
        return strExpression;
    }
/*
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        stack.push("1");
        stack.pop();

        Number n;
        String s = "1.2";
        if(s.indexOf('.') == -1)
            n = Integer.parseInt(s);
        else
            n = Double.parseDouble(s);

        System.out.println(n);

        String equation = "2 3 4 5 6 * + - / =";
        equation = "2 3 * 4 5 * + =";
        CalcModel model = new CalcModel();
        for (int i = 0; i < equation.length(); i++) {
            model.addSymbol(Character.toString(equation.charAt(i)));
        }

        System.out.println(model.getExpression());

    }
    */
}