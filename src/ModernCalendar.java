import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormatSymbols;
import java.util.Calendar;

public class ModernCalendar extends JFrame {
    private JLabel monthLabel;
    private JPanel calendarPanel;

    public ModernCalendar() {
        setTitle("Modern Calendar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        monthLabel = new JLabel();
        monthLabel.setHorizontalAlignment(JLabel.CENTER);

        calendarPanel = new JPanel(new GridLayout(0, 7));
        updateCalendar();

        JButton prevButton = new JButton("<< Prev");
        prevButton.addActionListener(e -> previousMonth());

        JButton nextButton = new JButton("Next >>");
        nextButton.addActionListener(e -> nextMonth());

        JPanel controlPanel = new JPanel();
        controlPanel.add(prevButton);
        controlPanel.add(monthLabel);
        controlPanel.add(nextButton);

        setLayout(new BorderLayout());
        add(controlPanel, BorderLayout.NORTH);
        add(calendarPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private void updateCalendar() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);

        monthLabel.setText(new DateFormatSymbols().getMonths()[month] + " " + year);

        calendar.set(year, month, 1);
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int lastDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        calendarPanel.removeAll();

        for (int i = 1; i < firstDayOfWeek; i++) {
            calendarPanel.add(new JLabel(""));
        }

        for (int day = 1; day <= lastDayOfMonth; day++) {
    final int currentDay = day; // Make the variable effectively final
    JButton dayButton = new JButton(String.valueOf(day));
    dayButton.addActionListener(e -> System.out.println("Clicked on day " + currentDay));
    calendarPanel.add(dayButton);
}

revalidate();
repaint();

    }

    private void previousMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -1);
        updateCalendar();
    }

    private void nextMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        updateCalendar();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ModernCalendar());
    }
}
