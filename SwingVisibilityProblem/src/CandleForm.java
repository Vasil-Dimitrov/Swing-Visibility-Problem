

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

//import psi01.common.Distance;
//import psi01.common.HandPosition;
//import psi01.common.MainClass;
//import psi01.common.TimeWheelFirst;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class CandleForm extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public static CandleForm dialog;
	private JRadioButton rdbtnExtinguish;
	private JComboBox<String> handCbExtinguish;
	private JComboBox<String> rimeCbExtinguish;
	private JComboBox<String> distanceCbExtinguish;
	private JRadioButton glassRbExtinguish;
	private JLabel pointsExtinguish;
	private JRadioButton rdbtnIgnite;
	private JComboBox<String> handCbIgnite;
	private JComboBox<String> timeCbIgnite;
	private JComboBox<String> distanceCbIgnite;
	private JRadioButton glassRbIgnite;
	private JLabel pointsIgnite;
	private JLabel lblTotalPoints;
//	private JLabel lblCurrentPoints;
	
	private JButton btnCurrent;
	private JButton btnHelp;
	private JButton btnOk;

	/**
	 * Launch the application.
	 */
	public static void main(String arg[]) {
		try {
			dialog = new CandleForm();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setLocation(ShowStats.frame.getLocation());
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CandleForm() {
		// If the setAlwaysOnTop here is removed the problem is fixed //
		setAlwaysOnTop(true); // <---- THIS HERE
//		setIconImage(Toolkit.getDefaultToolkit().getImage(CandleForm.class.getResource("/psi01/resources/candle_20.png")));
		setResizable(false);
		initComponents();
		createEvents();
	}
	
	//////////////////////////////////////////////////////////////
	// This method contains all of the code for creating and 
	// initializing components.
	//////////////////////////////////////////////////////////////
	public void initComponents(){	
		setName("dialog01");
		setTitle("Candle Exercise");
		setBounds(100, 100, 356, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		btnCurrent = new JButton("Current");
		btnCurrent.setEnabled(false);
		btnCurrent.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCurrent.setFocusPainted(false);
		btnCurrent.setBounds(89, 218, 80, 25);
		contentPanel.add(btnCurrent);

		JLabel lblExtinguish = new JLabel("Extinguish");
		lblExtinguish.setFont(new Font("Arial", Font.BOLD, 13));
		lblExtinguish.setHorizontalAlignment(SwingConstants.CENTER);
		lblExtinguish.setBounds(94, 30, 89, 16);
		contentPanel.add(lblExtinguish);

		JLabel lblIgnite = new JLabel("Ignite");
		lblIgnite.setHorizontalAlignment(SwingConstants.CENTER);
		lblIgnite.setFont(new Font("Arial", Font.BOLD, 13));
		lblIgnite.setBounds(211, 30, 118, 16);
		contentPanel.add(lblIgnite);

		btnHelp = new JButton("Click!");
		btnHelp.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnHelp.setFocusPainted(false);
//		btnHelp.setIcon(new ImageIcon(WheelForm.class.getResource("/psi01/resources/question1_16.png")));
		btnHelp.setBounds(12, 218, 68, 25);
		contentPanel.add(btnHelp);

		btnOk = new JButton("Apply Changes");
		btnOk.setEnabled(false);
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnOk.setBounds(210, 218, 119, 25);
		contentPanel.add(btnOk);

		JLabel lblHand = new JLabel("Hand:");
		lblHand.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHand.setBounds(12, 62, 56, 16);
		contentPanel.add(lblHand);

		JLabel lblDistance = new JLabel("Distance:");
		lblDistance.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDistance.setBounds(12, 120, 56, 16);
		contentPanel.add(lblDistance);

		JLabel lblSpeed = new JLabel("Time:");
		lblSpeed.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSpeed.setBounds(12, 91, 56, 16);
		contentPanel.add(lblSpeed);

		JLabel lblTroughGlass = new JLabel("Trough Glass:");
		lblTroughGlass.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTroughGlass.setBounds(12, 149, 87, 16);
		contentPanel.add(lblTroughGlass);

		handCbExtinguish = new JComboBox<String>();
		handCbExtinguish.setFont(new Font("Tahoma", Font.PLAIN, 13));
		handCbExtinguish.setFocusable(false);
//		handCbExtinguish.setModel(new DefaultComboBoxModel(HandPosition.values()));
		handCbExtinguish.setBounds(94, 59, 89, 22);
		contentPanel.add(handCbExtinguish);

		distanceCbExtinguish = new JComboBox<String>();
		distanceCbExtinguish.setFont(new Font("Tahoma", Font.PLAIN, 13));
		distanceCbExtinguish.setFocusable(false);
//		distanceCbExtinguish.setModel(new DefaultComboBoxModel(Distance.values()));
		distanceCbExtinguish.setBounds(94, 117, 89, 22);
		contentPanel.add(distanceCbExtinguish);

		rimeCbExtinguish = new JComboBox<String>();
		rimeCbExtinguish.setFont(new Font("Tahoma", Font.PLAIN, 13));
//		rimeCbExtinguish.setModel(new DefaultComboBoxModel(TimeWheelFirst.values()));
		rimeCbExtinguish.setBounds(94, 88, 89, 22);
		contentPanel.add(rimeCbExtinguish);

		handCbIgnite = new JComboBox<String>();
		handCbIgnite.setFont(new Font("Tahoma", Font.PLAIN, 13));
//		handCbIgnite.setModel(new DefaultComboBoxModel(HandPosition.values()));
		handCbIgnite.setFocusable(false);
		handCbIgnite.setBounds(228, 59, 89, 22);
		contentPanel.add(handCbIgnite);

		timeCbIgnite = new JComboBox<String>();
		timeCbIgnite.setFont(new Font("Tahoma", Font.PLAIN, 13));
//		timeCbIgnite.setModel(new DefaultComboBoxModel(TimeWheelFirst.values()));
		timeCbIgnite.setFocusable(false);
		timeCbIgnite.setBounds(228, 88, 89, 22);
		contentPanel.add(timeCbIgnite);

		distanceCbIgnite = new JComboBox<String>();
		distanceCbIgnite.setFont(new Font("Tahoma", Font.PLAIN, 13));
//		distanceCbIgnite.setModel(new DefaultComboBoxModel(Distance.values()));
		distanceCbIgnite.setFocusable(false);
		distanceCbIgnite.setBounds(228, 117, 89, 22);
		contentPanel.add(distanceCbIgnite);

		glassRbExtinguish = new JRadioButton("Yes");
		glassRbExtinguish.setFont(new Font("Tahoma", Font.PLAIN, 13));
		glassRbExtinguish.setBounds(107, 145, 60, 25);
		contentPanel.add(glassRbExtinguish);

		glassRbIgnite = new JRadioButton("Yes");
		glassRbIgnite.setFont(new Font("Tahoma", Font.PLAIN, 13));
		glassRbIgnite.setBounds(240, 145, 60, 25);
		contentPanel.add(glassRbIgnite);

		rdbtnExtinguish = new JRadioButton("");
		rdbtnExtinguish.setBounds(126, 5, 25, 25);
		contentPanel.add(rdbtnExtinguish);

		rdbtnIgnite = new JRadioButton("");
		rdbtnIgnite.setBounds(259, 5, 25, 25);
		contentPanel.add(rdbtnIgnite);

//		lblCurrentPoints = new JLabel((MainClass.getExercisesArray()[3].getPoints()
//				+ MainClass.getExercisesArray()[4].getPoints()) + "p");
//		lblCurrentPoints.setBounds(151, 219, 56, 22);
//		contentPanel.add(lblCurrentPoints);

		JLabel lblPoints = new JLabel("Points:");
		lblPoints.setBounds(12, 178, 56, 16);
		contentPanel.add(lblPoints);

		pointsExtinguish = new JLabel("0p");
		pointsExtinguish.setHorizontalAlignment(SwingConstants.CENTER);
		pointsExtinguish.setBounds(82, 178, 89, 16);
		contentPanel.add(pointsExtinguish);

		pointsIgnite = new JLabel("0p");
		pointsIgnite.setHorizontalAlignment(SwingConstants.CENTER);
		pointsIgnite.setBounds(216, 179, 89, 16);
		contentPanel.add(pointsIgnite);

		lblTotalPoints = new JLabel("/ 0p");
		lblTotalPoints.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTotalPoints.setBounds(284, 179, 45, 16);
		contentPanel.add(lblTotalPoints);

	}
	
	//////////////////////////////////////////////////////////////
	// This method contains all of the code for creating events  
	//////////////////////////////////////////////////////////////
	public void createEvents(){
//		btnCurrent.addActionListener((ActionEvent e) -> CandleCurrentDialog.run());
		btnHelp.addActionListener((ActionEvent e) -> CandleExplanationDialog.run());
		btnOk.addActionListener((ActionEvent e) -> saveChanges());
		ActionListener updatePointsListener = (ActionEvent e) -> updatePoints();
		handCbExtinguish.addActionListener(updatePointsListener);
		distanceCbExtinguish.addActionListener(updatePointsListener);
		rimeCbExtinguish.addActionListener(updatePointsListener);
		handCbIgnite.addActionListener(updatePointsListener);
		timeCbIgnite.addActionListener(updatePointsListener);
		distanceCbIgnite.addActionListener(updatePointsListener);
		glassRbExtinguish.addActionListener(updatePointsListener);
		glassRbIgnite.addActionListener(updatePointsListener);
		rdbtnExtinguish.addActionListener(updatePointsListener);
		rdbtnIgnite.addActionListener(updatePointsListener);
	}

	public void updatePoints() {
		pointsExtinguish.setText(getExtinguishPoints() + "p");
		pointsIgnite.setText(getIgnitePoints() + "p");
		lblTotalPoints.setText("/ " + (getExtinguishPoints() + getIgnitePoints()) + "p");
		validate();
	}

	public int getExtinguishPoints() {
		int num;
		if (!rdbtnExtinguish.isSelected())
			return 0;
		num = getHandPoint(handCbExtinguish.getSelectedIndex());
		num += getDistanceTimePoint(distanceCbExtinguish.getSelectedIndex());
		num += getDistanceTimePoint(rimeCbExtinguish.getSelectedIndex());
		if (glassRbExtinguish.isSelected())
			num += 2;
		return num*3;
	}

	public int getIgnitePoints() {
		int num;
		if (!rdbtnIgnite.isSelected())
			return 0;
		num = getHandPoint(handCbIgnite.getSelectedIndex());
		num += getDistanceTimePoint(distanceCbIgnite.getSelectedIndex());
		num += getDistanceTimePoint(timeCbIgnite.getSelectedIndex());
		if (glassRbIgnite.isSelected())
			num += 2;
		return num*6;
	}


	public int getHandPoint(int index) {
		switch (index) {
		case 1:
			return 1;
		case 2:
			return 2;
		case 3:
			return 4;
		default:
			return 0;
		}
	}

	public int getDistanceTimePoint(int index) {
		switch (index) {
		case 1:
			return 1;
		case 2:
			return 2;
		case 3:
			return 3;
		case 4:
			return 5;
		default:
			return 0;
		}
	}

	public void saveChanges() {
//		if (getExtinguishPoints() >= MainClass.getExercisesArray()[3].getPoints()) {
//			MainClass.getExercisesArray()[3].setHand(handCbExtinguish.getSelectedIndex());
//			MainClass.getExercisesArray()[3].setDistance(distanceCbExtinguish.getSelectedIndex());
//			MainClass.getExercisesArray()[3].setSpeed(rimeCbExtinguish.getSelectedIndex());
//			MainClass.getExercisesArray()[3].setTroughGlass(glassRbExtinguish.isSelected());
//		}
//		if (getIgnitePoints() >= MainClass.getExercisesArray()[4].getPoints()) {
//			MainClass.getExercisesArray()[4].setHand(handCbIgnite.getSelectedIndex());
//			MainClass.getExercisesArray()[4].setDistance(distanceCbIgnite.getSelectedIndex());
//			MainClass.getExercisesArray()[4].setSpeed(timeCbIgnite.getSelectedIndex());
//			MainClass.getExercisesArray()[4].setTroughGlass(glassRbIgnite.isSelected());
//		}
//		lblCurrentPoints.setText((MainClass.getExercisesArray()[3].getPoints()
//				+ MainClass.getExercisesArray()[4].getPoints()) + "p");
	}

}
