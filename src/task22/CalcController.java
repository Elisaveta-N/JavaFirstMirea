package task22;

import javax.swing.JOptionPane;

public class CalcController implements OnCalcEventListener {
    CalcModel model;
    CalcView view;

    public void ExecuteCalculator()
    {
        model = new CalcModel();
        view = new CalcView();
        view.registerOnCalcEventListener(this);
    }

    @Override
    public void onCalcEvent(String key) {
        if(model.addSymbol(key))
        {

            view.setText(view.getText() + key);
            if(key.equals("=")) {
                view.setText(view.getText() + " " + model.getExpression());
            }
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Try to perform invalid operation", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
}
