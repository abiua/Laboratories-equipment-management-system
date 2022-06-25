package View;

import javax.swing.*;
import java.awt.*;

public class login_false {
    public void login_false() {
        JFrame jFrame = new JFrame();
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension dimension = kit.getScreenSize();
        jFrame.setBounds(0, 0, dimension.width, dimension.height);

        JLabel jLabel = new JLabel("账号或密码错误 请重试");
        jLabel.setBackground(Color.red);
        jLabel.setForeground(Color.red);
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);

        jFrame.add(jLabel);

        jFrame.setVisible(true);
    }

}
