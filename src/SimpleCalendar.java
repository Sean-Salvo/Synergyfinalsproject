package synergyfinalsproject;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class MedicalInfo extends javax.swing.JFrame {
    private JLabel monthLabel;
    private JButton prevButton, nextButton;
    private JTable calendarTable;
    private DefaultTableModel calendarTableModel;
    private JScrollPane calendarScrollPane;
    private Calendar calendar;

    public MedicalInfo() {
        initComponents();
        initCalendar();
    }

    private void initCalendar() {
        JPanel calendarPanel = new JPanel(new BorderLayout());

        monthLabel = new JLabel();
        prevButton = new JButton("<<");
        nextButton = new JButton(">>");
        calendarTableModel = new DefaultTableModel();
        calendarTable = new JTable(calendarTableModel);
        calendarScrollPane = new JScrollPane(calendarTable);
        calendar = Calendar.getInstance();

        calendarTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        calendarTable.setDefaultEditor(Object.class, null); // Disable cell editing
        calendarTable.setRowHeight(40);

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(prevButton, BorderLayout.WEST);
        topPanel.add(monthLabel, BorderLayout.CENTER);
        topPanel.add(nextButton, BorderLayout.EAST);

        calendarPanel.add(topPanel, BorderLayout.NORTH);
        calendarPanel.add(calendarScrollPane, BorderLayout.CENTER);

        jPanel4.add(calendarPanel); // Add the calendar panel to your existing jPanel4
        updateCalendar();

        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calendar.add(Calendar.MONTH, -1);
                updateCalendar();
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calendar.add(Calendar.MONTH, 1);
                updateCalendar();
            }
        });
    }

    private void updateCalendar() {
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy");
        monthLabel.setText(sdf.format(calendar.getTime()));

        String[] columnNames = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        calendarTableModel.setColumnIdentifiers(columnNames);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);

        calendar.set(year, month, 1);

        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK);

        calendarTableModel.setRowCount(0);

        int row = 0;
        int day = 1;

        for (int i = 0; i < 6; i++) {
            calendarTableModel.addRow(new Object[]{null, null, null, null, null, null, null});
            for (int j = startDay - 1; j < 7; j++) {
                if (day <= maxDay) {
                    calendarTableModel.setValueAt(day, row, j);
                    day++;
                }
            }
            startDay = 1;
            row++;
        }
    }

    // ... rest of your code
}
