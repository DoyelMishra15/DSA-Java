import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class EventManagementSystem {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/college";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "123";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EventManagementSystem::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Event Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel(new GridLayout(3, 1));

        JButton registerBtn = new JButton("Register");
        JButton loginBtn = new JButton("Login");
        JButton exitBtn = new JButton("Exit");

        panel.add(registerBtn);
        panel.add(loginBtn);
        panel.add(exitBtn);

        registerBtn.addActionListener(e -> showRegisterDialog(frame));
        loginBtn.addActionListener(e -> showLoginDialog(frame));
        exitBtn.addActionListener(e -> System.exit(0));

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    private static void showRegisterDialog(JFrame parent) {
        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        Object[] fields = {
            "Name:", nameField,
            "Email:", emailField,
            "Password:", passwordField
        };

        int result = JOptionPane.showConfirmDialog(parent, fields, "Register", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            try (Connection conn = getConnection()) {
                String query = "INSERT INTO users (name, email, password, role) VALUES (?, ?, ?, 'user')";
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, nameField.getText());
                stmt.setString(2, emailField.getText());
                stmt.setString(3, new String(passwordField.getPassword()));
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(parent, "Registration successful.");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(parent, "Error: " + e.getMessage());
            }
        }
    }

    private static void showLoginDialog(JFrame parent) {
        JTextField emailField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        Object[] fields = {
            "Email:", emailField,
            "Password:", passwordField
        };

        int result = JOptionPane.showConfirmDialog(parent, fields, "Login", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            try (Connection conn = getConnection()) {
                String query = "SELECT * FROM users WHERE email=? AND password=?";
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, emailField.getText());
                stmt.setString(2, new String(passwordField.getPassword()));
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    showDashboard(parent);
                } else {
                    JOptionPane.showMessageDialog(parent, "Invalid credentials.");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(parent, "Error: " + e.getMessage());
            }
        }
    }

    private static void showDashboard(JFrame parent) {
        JFrame dashboard = new JFrame("Dashboard");
        dashboard.setSize(400, 300);
        dashboard.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 1));
        JButton addEventBtn = new JButton("Add Event");
        JButton viewEventsBtn = new JButton("View Events");
        JButton logoutBtn = new JButton("Logout");

        panel.add(addEventBtn);
        panel.add(viewEventsBtn);
        panel.add(logoutBtn);

        addEventBtn.addActionListener(e -> showAddEventDialog(dashboard));
        viewEventsBtn.addActionListener(e -> showEventsDialog(dashboard));
        logoutBtn.addActionListener(e -> dashboard.dispose());

        dashboard.getContentPane().add(panel);
        dashboard.setVisible(true);
    }

    private static void showAddEventDialog(JFrame parent) {
        JTextField nameField = new JTextField();
        JTextField locationField = new JTextField();
        JTextField dateField = new JTextField();
        JTextField timeField = new JTextField();
        JTextField descField = new JTextField();
        JTextField organizerField = new JTextField();

        Object[] fields = {
            "Event Name:", nameField,
            "Location:", locationField,
            "Date (YYYY-MM-DD):", dateField,
            "Time (HH:MM:SS):", timeField,
            "Description:", descField,
            "Organizer:", organizerField
        };

        int result = JOptionPane.showConfirmDialog(parent, fields, "Add Event", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            try (Connection conn = getConnection()) {
                String query = "INSERT INTO events (name, location, date, time, description, organizer) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, nameField.getText());
                stmt.setString(2, locationField.getText());
                stmt.setDate(3, Date.valueOf(dateField.getText()));
                stmt.setTime(4, Time.valueOf(timeField.getText()));
                stmt.setString(5, descField.getText());
                stmt.setString(6, organizerField.getText());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(parent, "Event added successfully.");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(parent, "Error: " + e.getMessage());
            }
        }
    }

    private static void showEventsDialog(JFrame parent) {
        try (Connection conn = getConnection()) {
            String query = "SELECT * FROM events";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            StringBuilder sb = new StringBuilder();
            while (rs.next()) {
                sb.append("ID: ").append(rs.getInt("event_id"))
                  .append(", Name: ").append(rs.getString("name"))
                  .append(", Location: ").append(rs.getString("location"))
                  .append(", Date: ").append(rs.getDate("date"))
                  .append(", Time: ").append(rs.getTime("time"))
                  .append(", Organizer: ").append(rs.getString("organizer"))
                  .append(", Desc: ").append(rs.getString("description"))
                  .append("\n\n");
            }
            JOptionPane.showMessageDialog(parent, new JScrollPane(new JTextArea(sb.toString(), 15, 30)), "Event List", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(parent, "Error: " + e.getMessage());
        }
    }
}