/*
 * This is the main class TestFilesManagement that test
 * all the methos created in FilesManagement
 */
package exceptionshomework;

/**
 * Test all four methods created in FilesManagement class
 * @author MariusNeagu
 */
public class TestFileManagement {
    public static void main (String[] args){
    FilesManagement.WriteInFile();
    FilesManagement.ReadFromFile();
    FilesManagement.WriteInEmptyFile();
    FilesManagement.DeleteContentOfFile();
    }
}
