

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class CandleExplanationDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private final JTextArea txtrHi = new JTextArea();
	private static CandleExplanationDialog dialog;

	/**
	 * Launch the application.
	 */
	public static void run() {
		try {
			dialog = new CandleExplanationDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setLocation(CandleForm.dialog.getLocation());
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CandleExplanationDialog() {
		setModal(true);
		setAlwaysOnTop(true);
		setResizable(false);
		setTitle("Mark the text to see");
		setBounds(100, 100, 280, 177);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		txtrHi.setEditable(false);
		txtrHi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtrHi.setLineWrap(true);
		String str = "Some random text appearing here but \n"
					+ "only if it is marked, otherwise the "
					+ "\nprevious dialog must not be set to "
					+ "\n\"Always on top\"\n\n"
					+ "Also only the last symbol is \n"
					+ "always visible!";
		txtrHi.setText(str);
		txtrHi.setBounds(0, 0, 274, 142);
		contentPanel.add(txtrHi);
	}
}
