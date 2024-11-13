import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class app {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form_Elvan Yohanes Gultom");
        frame.setSize(450, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel utama dengan CardLayout
        CardLayout card = new CardLayout();
        JPanel mainPanel = new JPanel(card);

        // Panel SIGN UP
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.setBorder(new EmptyBorder(25, 25, 25, 25));
        panel1.setBackground(new Color(220, 240, 255));

        JLabel signupLabel = new JLabel("Create Account");
        signupLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        signupLabel.setFont(new Font("SansSerif", Font.BOLD, 26));
        signupLabel.setForeground(new Color(40, 55, 71));

        JPanel formPanel1 = new JPanel(new GridBagLayout());
        formPanel1.setAlignmentX(Component.CENTER_ALIGNMENT);
        formPanel1.setOpaque(false);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6, 6, 6, 6);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel1.add(new JLabel("Full Name:"), gbc);
        gbc.gridx = 1;
        JTextField fullnameField = new JTextField(18);
        formPanel1.add(fullnameField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel1.add(new JLabel("Email Address:"), gbc);
        gbc.gridx = 1;
        JTextField emailField1 = new JTextField(18);
        formPanel1.add(emailField1, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel1.add(new JLabel("Password:"), gbc);
        gbc.gridx = 1;
        JPasswordField passwordField1 = new JPasswordField(18);
        formPanel1.add(passwordField1, gbc);

        JButton signupButton = new JButton("Sign Up");
        signupButton.setBackground(new Color(0, 123, 167));
        signupButton.setForeground(Color.WHITE);
        signupButton.setFont(new Font("SansSerif", Font.BOLD, 14));
        signupButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel haveaccLabel = new JLabel("Already have an account?");
        haveaccLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton haveaccButton = new JButton("Login");
        haveaccButton.setForeground(new Color(0, 102, 153));
        haveaccButton.setBorder(BorderFactory.createEmptyBorder());
        haveaccButton.setContentAreaFilled(false);
        haveaccButton.setFont(new Font("SansSerif", Font.ITALIC, 12));
        haveaccButton.addActionListener(e -> card.show(mainPanel, "panel2"));
        haveaccButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel1.add(signupLabel);
        panel1.add(Box.createVerticalStrut(15));
        panel1.add(formPanel1);
        panel1.add(Box.createVerticalStrut(20));
        panel1.add(signupButton);
        panel1.add(Box.createVerticalStrut(10));
        panel1.add(haveaccLabel);
        panel1.add(haveaccButton);

        // Panel LOGIN
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel2.setBorder(new EmptyBorder(25, 25, 25, 25));
        panel2.setBackground(new Color(230, 250, 250));

        JLabel loginLabel = new JLabel("Login");
        loginLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginLabel.setFont(new Font("SansSerif", Font.BOLD, 26));
        loginLabel.setForeground(new Color(40, 55, 71));

        JPanel formPanel2 = new JPanel(new GridBagLayout());
        formPanel2.setAlignmentX(Component.CENTER_ALIGNMENT);
        formPanel2.setOpaque(false);

        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel2.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        JTextField emailField2 = new JTextField(18);
        formPanel2.add(emailField2, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel2.add(new JLabel("Password:"), gbc);
        gbc.gridx = 1;
        JPasswordField passwordField2 = new JPasswordField(18);
        formPanel2.add(passwordField2, gbc);

        JButton loginButton = new JButton("Login");
        loginButton.setBackground(new Color(0, 123, 167));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFont(new Font("SansSerif", Font.BOLD, 14));
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel noaccLabel = new JLabel("Don't have an account?");
        noaccLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton noaccButton = new JButton("Sign Up");
        noaccButton.setForeground(new Color(0, 102, 153));
        noaccButton.setBorder(BorderFactory.createEmptyBorder());
        noaccButton.setContentAreaFilled(false);
        noaccButton.setFont(new Font("SansSerif", Font.ITALIC, 12));
        noaccButton.addActionListener(e -> card.show(mainPanel, "panel1"));
        noaccButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel2.add(loginLabel);
        panel2.add(Box.createVerticalStrut(15));
        panel2.add(formPanel2);
        panel2.add(Box.createVerticalStrut(20));
        panel2.add(loginButton);
        panel2.add(Box.createVerticalStrut(10));
        panel2.add(noaccLabel);
        panel2.add(noaccButton);

        // Tambahkan panel ke CardLayout
        mainPanel.add(panel1, "panel1");
        mainPanel.add(panel2, "panel2");
        frame.add(mainPanel);

        // Tampilkan SIGN UP pertama kali
        card.show(mainPanel, "panel1");

        frame.setVisible(true);
    }
}
