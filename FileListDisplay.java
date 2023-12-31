package bulk_File_Rename_Tool;
import javax.swing.*;
import java.awt.*;
import java.io.File;

/*
Bulk File Rename Tool
Author: Gaven Van Skyock
Date: 12/07/2023
Description: Class for displaying the contents of a selected folder.
*/

public class FileListDisplay {
    private JFrame frame;
    private JList<File> fileList;
    private DefaultListModel<File> listModel;

    public FileListDisplay() {
        // Initialize GUI components and set up the file list display
        frame = new JFrame("File List Display");
        listModel = new DefaultListModel<>();
        fileList = new JList<>(listModel);

        // Set up the layout
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the file list to a scroll pane and add it to the frame
        JScrollPane scrollPane = new JScrollPane(fileList);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Add a button to refresh the file list
        JButton refreshButton = new JButton("Refresh List");
        refreshButton.addActionListener(e -> refreshFileList());
        frame.add(refreshButton, BorderLayout.SOUTH);

        // Set up event listeners
        fileList.addListSelectionListener(e -> handleFileSelection());

        // Set up initial file list 
        refreshFileList();
    }

    private void refreshFileList() {
        // Further logic will need implemented here, these "dummyFiles" are just placeholders
        listModel.clear();
        File[] dummyFiles = new File("path/to/your/folder").listFiles();
        if (dummyFiles != null) {
            for (File file : dummyFiles) {
                listModel.addElement(file);
            }
        }
    }

    private void handleFileSelection() {
        // Implement logic to handle file selection (e.g., display details or perform actions)
        File selectedFile = fileList.getSelectedValue();
        if (selectedFile != null) {
            System.out.println("Selected file: " + selectedFile.getName());
        }
    }

    public static void main(String[] args) {
        // Create an instance of FileListDisplay and show the GUI
        FileListDisplay fileListDisplay = new FileListDisplay();
        SwingUtilities.invokeLater(() -> fileListDisplay.frame.setVisible(true));
    }
}