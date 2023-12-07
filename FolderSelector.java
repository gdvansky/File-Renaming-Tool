package bulk_File_Rename_Tool;
import javax.swing.*;
import java.io.File;

/*
Bulk File Rename Tool
Author: Gaven Van Skyock
Date: 11/13/2023
Description: Class to handle folder selection for the Bulk File Rename Tool.
*/

public class FolderSelector {
    private JFrame frame;
    private JFileChooser fileChooser;

    public FolderSelector() {
        // Initialize GUI components for folder selection
        frame = new JFrame("Folder Selector");
        fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        // Add necessary GUI components and set up event listeners
        // ...
    }

    public File selectFolder() {
        // Implement logic to show the folder selection dialog and return the selected folder
        int result = fileChooser.showOpenDialog(frame);

        if (result == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        // Demonstrate using FolderSelector in a simple way
        FolderSelector folderSelector = new FolderSelector();
        File selectedFolder = folderSelector.selectFolder();

        if (selectedFolder != null) {
            System.out.println("Selected folder: " + selectedFolder.getAbsolutePath());
        } else {
            System.out.println("Folder selection canceled.");
        }
    }
}