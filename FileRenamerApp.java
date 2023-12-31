package bulk_File_Rename_Tool;
import javax.swing.SwingUtilities;
import java.io.File;
import java.util.ArrayList;

/*
Bulk File Rename Tool
Author: Gaven Van Skyock
Date: 11/13/2023
Description: Main application class for the Bulk File Rename Tool.
*/

public class FileRenamerApp {
    // Attributes
    private String selectedFolder;
    private String[] selectedFiles;

    // Constructors
    public FileRenamerApp() {
        // Default constructor
    }

    public FileRenamerApp(String selectedFolder, String[] selectedFiles) {
        this.selectedFolder = selectedFolder;
        this.selectedFiles = selectedFiles;
    }

    // Getters and Setters
    public String getSelectedFolder() {
        return selectedFolder;
    }

    public void setSelectedFolder(String selectedFolder) {
        this.selectedFolder = selectedFolder;
    }

    public String[] getSelectedFiles() {
        return selectedFiles;
    }

    public void setSelectedFiles(String[] selectedFiles) {
        this.selectedFiles = selectedFiles;
    }

    // Methods
    public void run() {
        // Create an instance of FileListDisplay and show the GUI
        FileListDisplay fileListDisplay = new FileListDisplay();
        SwingUtilities.invokeLater(() -> fileListDisplay.getFrame().setVisible(true));

        // Similar to FileListDisplay, these are just placeholders, the folder path and files
        String dummyFolderPath = "path/to/your/dummy/folder";
        String[] dummyFiles = {"file1.txt", "file2.txt", "file3.txt"};

        fileListDisplay.setFolderPath(dummyFolderPath);
        fileListDisplay.setFileNames(dummyFiles);

        // Retrieve the selected folder and files from FileListDisplay
        String selectedFolder = fileListDisplay.getFolderPath();
        String[] selectedFiles = fileListDisplay.getSelectedFileNames();

        // Create an instance of FileRenamer and set the files to be renamed
        FileRenamer fileRenamer = new FileRenamer();
        ArrayList<File> files = new ArrayList<>();
        for (String fileName : selectedFiles) {
            files.add(new File(selectedFolder, fileName));
        }
        fileRenamer.setFiles(files);
        // Sets the file renaming pattern, not a real pattern currently, just demonstration
        String dummyPattern = "holiday";
        fileRenamer.renameFiles(dummyPattern);
    }

    public static void main(String[] args) {
        // Create an instance of FileRenamerApp and run the application
        FileRenamerApp fileRenamerApp = new FileRenamerApp();
        fileRenamerApp.run();
    }
}