# Bulk File Rename Tool

**Team Members:**
- Gaven Van Skyock

**Project Description:**
This project is a bulk file rename tool that allows users to select a folder, display its content, and rename multiple files based on a specified pattern.

## Class Distribution

1. **FileRenamerApp** (Main application class)
    - Author: Gaven Van Skyock
    - Description: Main application class for the Bulk File Rename Tool. It initializes the FileListDisplay and FileRenamer instances, coordinating operations between them.

2. **FolderSelector** (Class to handle folder selection)
    - Author: Gaven Van Skyock
    - Description: Class to handle folder selection for the Bulk File Rename Tool. It includes methods to show the folder selection dialog and return the selected folder.

3. **FileListDisplay** (Class to display the content of a selected folder)
    - Author: Gaven Van Skyock
    - Description: Class for displaying the contents of a selected folder. It uses Swing components to create a graphical user interface (GUI) for displaying files, and includes methods to update the file list and handle user interactions.

4. **FileRenamer** (Class to handle file renaming based on a pattern)
    - Author: Gaven Van Skyock
    - Description: Class to handle file renaming based on a pattern for the Bulk File Rename Tool. It includes methods to set and rename files based on a specified pattern.

## Running the Application

To run the Bulk File Rename Tool, execute the main method in the `FileRenamerApp` class. The application will prompt you to select a folder, display its content, and perform bulk file renaming based on a specified pattern.

### Instructions:

1. Compile the source files.
2. Run the `FileRenamerApp` class.

## Additional Notes

- This project uses Swing for the graphical user interface and follows a modular class structure to handle different aspects of the bulk file rename functionality.
- The `FolderSelector` class provides a convenient way to select folders for file renaming.
- The `FileListDisplay` class handles the display of files within a selected folder.
- The `FileRenamer` class contains the core logic for renaming files based on a specified pattern.
