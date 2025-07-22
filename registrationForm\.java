import javax.swing.*;
import java.awt.*;

public class RegistrationForm {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Title
        JLabel title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(150, 10, 300, 30);
        frame.add(title);

        // Name
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(50, 60, 100, 25);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 60, 200, 25);
        frame.add(nameField);

        // Mobile
        JLabel mobileLabel = new JLabel("Mobile");
        mobileLabel.setBounds(50, 90, 100, 25);
        frame.add(mobileLabel);

        JTextField mobileField = new JTextField();
        mobileField.setBounds(150, 90, 200, 25);
        frame.add(mobileField);

        // Gender
        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setBounds(50, 120, 100, 25);
        frame.add(genderLabel);

        JRadioButton male = new JRadioButton("Male", true);
        male.setBounds(150, 120, 70, 25);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(220, 120, 80, 25);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        frame.add(male);
        frame.add(female);

        // DOB
        JLabel dobLabel = new JLabel("DOB");
        dobLabel.setBounds(50, 150, 100, 25);
        frame.add(dobLabel);

        String[] days = new String[31];
        for (int i = 1; i <= 31; i++) days[i - 1] = Integer.toString(i);
        JComboBox<String> day = new JComboBox<>(days);
        day.setBounds(150, 150, 50, 25);

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                           "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        JComboBox<String> month = new JComboBox<>(months);
        month.setBounds(210, 150, 60, 25);

        String[] years = new String[100];
        for (int i = 0; i < 100; i++) years[i] = Integer.toString(1950 + i);
        JComboBox<String> year = new JComboBox<>(years);
        year.setBounds(280, 150, 70, 25);

        frame.add(day);
        frame.add(month);
        frame.add(year);

        // Address
        JLabel addressLabel = new JLabel("Address");
        addressLabel.setBounds(50, 180, 100, 25);
        frame.add(addressLabel);

        JTextArea addressArea = new JTextArea();
        addressArea.setBounds(150, 180, 200, 60);
        addressArea.setLineWrap(true);
        frame.add(addressArea);

        // Terms
        JCheckBox terms = new JCheckBox("Accept Terms And Conditions.");
        terms.setBounds(50, 250, 300, 25);
        frame.add(terms);

        // Submit and Reset buttons
        JButton submit = new JButton("Submit");
        submit.setBounds(150, 290, 90, 30);
        JButton reset = new JButton("Reset");
        reset.setBounds(260, 290, 90, 30);
        frame.add(submit);
        frame.add(reset);

        // Make the frame visible
        frame.setVisible(true);
    }
}
