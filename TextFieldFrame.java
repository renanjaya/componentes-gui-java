import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField;

    public TextFieldFrame() {
        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout());

        textField1 = new JTextField(10);
        textField2 = new JTextField("Enter text here");
        add(textField2);

        textField3 = new JTextField("Uneditable text field", 21);
        textField3.setEditable(false);
        add(textField3);

        passwordField = new JPasswordField("Hidden text");
        add(passwordField);

        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }

    private class TextFieldHandler implements ActionListener
    {
        // processa eventos de campo de texto 
        public void actionPerformed( ActionEvent event)
        {
            String string = ""; // declara string a ser exibida 
            
            // usuario pressionou Enter no JTexFiled textFieldl
            if (event.getSource() == textField1)
                string = String .format( "texField: %s " ,event.getActionCommand());

            // usuario pressionou  Enter no JTextField textField2
            else if (event.getSource () == textField2 )
                string = String. format( "textField2: %as" ,event.getActionCommand());

            // usuario pressionou Enter no JTexFiled textFieldl
            if (event.getSource() == textField3)
                string = String .format( "texField: %s " , event.getActionCommand());

            // usuario pressionou Enter no JTexFiled passwordField
            if (event.getSource() == passwordField)
                string = String .format( "passwordField: %s" , event.getActionCommand());

                // exibe o conteúdo de JTextfield
            JOptionPane.showMessageDialog(null, string);
        } // fim do métado actionPerformed
    }  // fim da classe TextFieldHandeler interna private 
} // fim da classe TextFieldFrame