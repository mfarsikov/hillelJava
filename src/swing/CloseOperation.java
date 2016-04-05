package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by MBCNEWMAIN on 05.04.2016.
 */
public class CloseOperation implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
