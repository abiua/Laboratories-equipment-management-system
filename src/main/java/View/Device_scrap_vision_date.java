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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Device_scrap_vision_date {
    static void showFrame(String s){

        //1，设定窗口
        JFrame frame =new JFrame("设备运行管理");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension dimension = kit.getScreenSize();
        frame.setBounds(0, 0, dimension.width, dimension.height);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);



        //添加button
        JButton button =new JButton("查询");
        button.setBounds(250,10,50,30);
        JButton button1 =new JButton("所有信息");
        button.setBounds(300,10,100,30);
        JButton button2 =new JButton("返回");
        button1.setBounds(400,10,50,30);

        //添加label
        JTextField jTextField =new JTextField("", 20);
        jTextField.setBounds(1,10,240,30);

        JComboBox box=new JComboBox();
        box.addItem("选择时间检索方式");
        box.addItem("month");
        box.addItem("year");
        box.addItem("quarter");
        box.setBounds(400,5, 200, 30);
        frame.add(box);
        String[] list_box = {"month", "year", "quarter"};

        //通过panel组合button，label
        JPanel panel =new JPanel();
        panel.setBackground(Color.gray);
        panel.setSize(200,100);
        panel.add(jTextField);
        panel.add(button);
        panel.add(button1);
        panel.add(button2);

        typeController typeController = new typeController();
        java.util.List<DeviceType> data_list = typeController.select();

        scrapController scrapController = new scrapController();
        java.util.List<DeviceScrap> data_scrap = scrapController.select();
        //2,添加table
        JTable table =null;
        String [] index={"id", "name", "model", "type", "spec", "price"
                , "date", "factory", "batch", "buyerID", "buyerName"};
        Object [][] data=new Object[data_list.size()][index.length];
        //3,向data中添加数据
        int k = 0;
        for (int i = 0; i < data_scrap.size(); i++) {
            DeviceScrap dr = data_scrap.get(i);
            for (int j = 0;j < data_list.size();j++) {
                DeviceType dt = data_list.get(j);
                if (dr.getId().equals(dt.getId())) {
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

        //6，添加表格、滚动条到容器中
        frame.add(panel, BorderLayout.NORTH);
        frame.add(jScrollPane,BorderLayout.CENTER);
        frame.setVisible(true);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String select = jTextField.getText();
                int d = box.getSelectedIndex();

                typeController typeController = new typeController();
                java.util.List<DeviceType> data_list = typeController.select();

                // 添加table
                JTable table =null;
                String [] index={"id", "name", "model", "type", "spec", "price"
                        , "date", "factory", "batch", "buyerID", "buyerName"};
                Object [][] data=new Object[data_list.size()][index.length];
                // 向data中添加数据
                int k = 0;

                List<List<DeviceScrap>> list_data_scrap = new ArrayList<>();
                Map<String,String> map = new HashMap<>();
                if (d - 1 < 3) {
                    map.put(list_box[d - 1], jTextField.getText());

                    list_data_scrap.add(scrapController.selectByDate(map));
                } else {
                    int quarter = Integer.parseInt(jTextField.getText());
                    for (int i = 1 + (quarter - 1) * 3; i <= quarter * 3; i++)
                        map.put("month", jTextField.getText());
                    list_data_scrap.add(scrapController.selectByDate(map));
                }

                for (int m = 0; m < list_data_scrap.size(); m++) {
                    List<DeviceScrap> data_scrap = list_data_scrap.get(m);

                    for (int i = 0; i < data_scrap.size(); i++) {
                        DeviceScrap dr = data_scrap.get(i);


                        for (int j = 0; j < data_list.size(); j++) {
                            DeviceType dt = data_list.get(j);
                            if (dr.getId().equals(dt.getId())) {
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
                                k++;
                            }
                        }

                    }
                }
                // 创建一个默认的表格模型
                DefaultTableModel defaultModel = new DefaultTableModel(data, index);
                table=new JTable(defaultModel);
                table.setBackground(Color.gray);
                table.setPreferredScrollableViewportSize(new Dimension(100, 80));
                table.setFillsViewportHeight(true);

                // 给表格设置滚动条
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
                List<DeviceType> data_list = typeController.select();

                scrapController scrapController = new scrapController();
                java.util.List<DeviceScrap> data_scrap = scrapController.select();
                //2,添加table
                JTable table =null;
                String [] index={"id", "name", "model", "type", "spec", "price"
                        , "date", "factory", "batch", "buyerID", "buyerName"};
                Object [][] data=new Object[data_list.size()][index.length];
                //3,向data中添加数据
                int k = 0;
                for (int i = 0; i < data_scrap.size(); i++) {
                    DeviceScrap dr = data_scrap.get(i);
                    for (int j = 0;j < data_list.size();j++) {
                        DeviceType dt = data_list.get(j);
                        if (dr.getId().equals(dt.getId())) {
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
