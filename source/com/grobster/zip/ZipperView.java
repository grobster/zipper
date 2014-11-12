package com.grobster.zip;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ZipperView {
	// panels
	private JPanel mainPanel;
	private JPanel sourcePanel;
	private JPanel targetPanel;
	private JPanel filterPanel;
	private JPanel zipButtonPanel;
	private JPanel daysPanel;
	
	//labels
	private JLabel sourceLabel;
	private JLabel targetLabel;
	private JLabel filterLabel;
	private JLabel daysLabel;
	
	// textfields
	private JTextField sourceTextField;
	private JTextField targetTextField;
	private JTextField filterTextField;
	private JTextField daysTextField;
	
	//buttons
	private JButton zipButton;
	
	//frames
	private JFrame frame;
	
	public void createView() {
		// create frame
		frame = new JFrame("Zipper v1.0.3");
		frame.setSize(400, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		//create panels
		mainPanel = new JPanel();
		sourcePanel = new JPanel();
		targetPanel = new JPanel();
		filterPanel = new JPanel();
		zipButtonPanel = new JPanel();
		daysPanel = new JPanel();
		
		//create labels
		sourceLabel = new JLabel("Source Directory");
		targetLabel = new JLabel("Target Directory");
		filterLabel = new JLabel("Filter");
		daysLabel = new JLabel("Days");
		
		//create textfields
		sourceTextField = new JTextField(30);
		targetTextField = new JTextField(30);
		filterTextField = new JTextField(5);
		daysTextField = new JTextField(3);
		
		//create button
		zipButton = new JButton("Zip");
		zipButton.addActionListener(new ZipButtonListener());
		
		// layouts
		
		// main panel layout
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		
		//sourcePanel layout
		sourcePanel.add(sourceLabel);
		sourcePanel.add(sourceTextField);
		mainPanel.add(sourcePanel);
		
		//targetPanel layout
		targetPanel.add(targetLabel);
		targetPanel.add(targetTextField);
		mainPanel.add(targetPanel);
		
		// filterPanel layout
		filterPanel.add(filterLabel);
		filterPanel.add(filterTextField);
		mainPanel.add(filterPanel);
		
		//daysPanel layout
		daysPanel.add(daysLabel);
		daysPanel.add(daysTextField);
		mainPanel.add(daysPanel);
		
		//zipButtonPanel layout
		zipButtonPanel.add(zipButton);
		mainPanel.add(zipButtonPanel);

		//frame.pack();
		frame.setVisible(true);
	}
	
	class ZipButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (sourceTextField.getText() != null && targetTextField.getText() != null && filterTextField.getText() != null) {
				Zipper.zipDirectory(sourceTextField.getText(), targetTextField.getText(), filterTextField.getText(), Integer.parseInt(daysTextField.getText()));
			}
		}
	}

}