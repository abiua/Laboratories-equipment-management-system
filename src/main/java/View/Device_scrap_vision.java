package View;

import com.gec.controller.scrapController;
import com.gec.controller.typeController;
import com.gec.entity.DeviceScrap;
import com.gec.entity.DeviceType;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Device_scrap_vision {
    //创建窗口，以列表展示从数据库中获取的数据
    private static void showFrame(String s) {

        //1，设定窗口
        JFrame frame = new JFrame("设备报废管理");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension dimension = kit.getScreenSize();
        frame.setBounds(0, 0, dimension.width, dimension.height);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);


        //添加button
        JButton button = new JButton("查询");
        button.setBounds(50, 10, 50, 30);
        JButton button1 =new JButton("所有信息");
        button.setBounds(100,10,100,30);
        JButton button2 =new JButton("返回");
        button1.setBounds(200,10,50,30);

        //添加label
        JTextField jTextField = new JTextField("", 20);
        jTextField.setBounds(1, 10, 240, 30);


        //通过panel组合button，label
        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setSize(200, 100);
        panel.add(jTextField);
        panel.add(button);
        panel.add(button1);
        panel.add(button2);

        typeController typeController = new typeController();
        java.util.List<DeviceType> data_list = typeController.select();

        scrapController scrapController = new scrapController();
        List<DeviceScrap> data_scrap = scrapController.select();
        //2,添加table
        JTable table = null;
        String[] index = {"id", "name", "model", "type", "spec", "price"
                , "date", "factory", "batch", "buyerID", "buyerName"};
        Object[][] data = new Object[data_list.size()][index.length];
        //3,向data中添加数据
        int k = 0;
        for (int i = 0; i < data_scrap.size(); i++) {
            DeviceScrap ds = data_scrap.get(i);

            for (int j = 0; j < data_list.size(); j++) {
                DeviceType dt = data_list.get(j);
                if (ds.getId().equals(dt.getId())) {
                    data[k][0] = dt.getId();
                    data[k][1] = dt.getName();
                    data[k][2] = dt.getModel();
                    data[k][3] = dt.getType();
                    data[k][4] = dt.getSpec();
                    data[k][5] = dt.getPrice();
                    data[k][6] = dt.getDate();
                    data[k][7] = dt.getFactory();
                    data[k][8] = dt.getBatch();
                    data[k][9] = dt.getBuyerID();
                    data[k][10] = dt.getBuyerName();
                    System.out.println(data[k][1]);
                    k++;
                }
            }
        }

        //4,创建一个默认的表格模型
        DefaultTableModel defaultModel = new DefaultTableModel(data, index);
        table=new JTable(defaultModel);
        table.setBackground(Color.gray);
        table.setPreferredScrollableViewportSize(new Dimension(100, 80));//JTable的高度和宽度按照设定
        table.setFillsViewportHeight(true);

        //5，给表格设置滚动条
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(table);

        System.out.println("成功");
        Font font = new Font("宋体", Font.BOLD, 13);
        frame.add(jScrollPane,BorderLayout.CENTER);
        frame.setVisible(true);

        //6，添加表格、滚动条到容器中
        frame.add(panel, BorderLayout.NORTH);
        frame.add(jScrollPane,BorderLayout.CENTER);
        frame.setVisible(true);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String select = jTextField.getText();

                typeController typeController = new typeController();
                java.util.List<DeviceType> data_list = typeController.select();

                scrapController scrapController = new scrapController();
                List<DeviceScrap> data_scrap = scrapController.select();
                //2,添加table
                JTable table =null;
                String [] index={"id", "name", "model", "type", "spec", "price"
                        , "date", "factory", "batch", "buyerID", "buyerName"};
                Object [][] data=new Object[data_list.size()][index.length];
                //3,向data中添加数据
                int k = 0;
                for (int i = 0; i < data_scrap.size(); i++) {
                    DeviceScrap ds = data_scrap.get(i);
                    String value = "";
                    if (s.equals("type")) {
                        value = ds.getType();
                    }

                    if (value.equals(select)) {
                        for (int j = 0;j < data_list.size();j++) {
                            DeviceType dt = data_list.get(j);
                            if (ds.getId().equals(dt.getId())) {
                                data[k][0] = dt.getId();
                                data[k][1] = dt.getName();
                                data[k][2] = dt.getModel();
                                data[k][3] = dt.getType();
                                data[k][4] = dt.getSpec();
                                data[k][5] = dt.getPrice();
                                data[k][6] = dt.getDate();
                                data[k][7] = dt.getFactory();
                                data[k][8] = dt.getBatch();
                                data[k][9] = dt.getBuyerID();
                                data[k][10] = dt.getBuyerName();
                                System.out.println(data[k][1]);
                                k++;
                            }
                        }
                    }
                }
                //4,创建一个默认的表格模型
                DefaultTableModel defaultModel = new DefaultTableModel(data, index);
                table=new JTable(defaultModel);
                table.setBackground(Color.gray);
                table.setPreferredScrollableViewportSize(new Dimension(100, 80));//JTable的高度和宽度按照设定
                table.setFillsViewportHeight(true);

                //5，给表格设置滚动条
                JScrollPane jScrollPane = new JScrollPane();
                jScrollPane.setViewportView(table);

                System.out.println("成功");
                Font font = new Font("宋体", Font.BOLD, 13);
                frame.add(jScrollPane,BorderLayout.CENTER);
                frame.setVisible(true);

            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                typeController typeController = new typeController();
                java.util.List<DeviceType> data_list = typeController.select();

                scrapController scrapController = new scrapController();
                List<DeviceScrap> data_scrap = scrapController.select();
                //2,添加table
                JTable table =null;
                String [] index={"id", "name", "model", "type", "spec", "price"
                        , "date", "factory", "batch", "buyerID", "buyerName"};
                Object [][] data=new Object[data_list.size()][index.length];
                //3,向data中添加数据
                int k = 0;
                for (int i = 0; i < data_scrap.size(); i++) {
                    DeviceScrap ds = data_scrap.get(i);
                    for (int j = 0;j < data_list.size();j++) {
                        DeviceType dt = data_list.get(j);
                        if (ds.getId().equals(dt.getId())) {
                            data[k][0] = dt.getId();
                            data[k][1] = dt.getName();
                            data[k][2] = dt.getModel();
                            data[k][3] = dt.getType();
                            data[k][4] = dt.getSpec();
                            data[k][5] = dt.getPrice();
                            data[k][6] = dt.getDate();
                            data[k][7] = dt.getFactory();
                            data[k][8] = dt.getBatch();
                            data[k][9] = dt.getBuyerID();
                            data[k][10] = dt.getBuyerName();
                            System.out.println(data[k][1]);
                            k++;
                        }
                    }
                }

                //4,创建一个默认的表格模型
                DefaultTableModel defaultModel = new DefaultTableModel(data, index);
                table=new JTable(defaultModel);
                table.setBackground(Color.gray);
                table.setPreferredScrollableViewportSize(new Dimension(100, 80));//JTable的高度和宽度按照设定
                table.setFillsViewportHeight(true);

                //5，给表格设置滚动条
                JScrollPane jScrollPane = new JScrollPane();
                jScrollPane.setViewportView(table);

                System.out.println("成功");
                Font font = new Font("宋体", Font.BOLD, 13);
                frame.add(jScrollPane,BorderLayout.CENTER);
                frame.setVisible(true);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }

    public void data(String data) {

        showFrame(data);
    }
}
