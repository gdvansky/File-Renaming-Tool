package bulk_File_Rename_Tool;
import java.io.File;
import java.util.ArrayList;

/*
Bulk File Rename Tool
Author: Gaven Van Skyock
Date: 11/13/2023
Description: Class to handle file renaming based on a pattern for the Bulk File Rename Tool.
*/

public class FileRenamer {
    private ArrayList<File> files;

    public FileRenamer() {
        // Initialize any necessary components or settings
        this.files = new ArrayList<>();
    }

    public void setFiles(ArrayList<File> files) {
        // Set the list of files to be renamed
        this.files = files;
    }

    public void renameFiles(String pattern) {
        // Implement logic to rename files based on the provided pattern
        if (files == null || files.isEmpty()) {
            System.out.println("No files to rename.");
            return;
        }

        for (int i = 0; i < files.size(); i++) {
            File file = files.get(i);
            String fileName = file.getName();
            String extension = "";

            // Split the file name into name and extension
            int dotIndex = fileName.lastIndexOf('.');
            if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
                extension = fileName.substring(dotIndex);
                fileName = fileName.substring(0, dotIndex);
            }

            // Construct the new file name based on the pattern
            String newName = pattern + (i + 1) + extension;

            // Create a new file with the updated name
            File newFile = new File(file.getParent(), newName);

            // Rename the file
            if (file.renameTo(newFile)) {
                System.out.println("Renamed: " + file.getName() + " to " + newFile.getName());
            } else {
                System.out.println("Failed to rename: " + file.getName());
            }
        }
    }
}