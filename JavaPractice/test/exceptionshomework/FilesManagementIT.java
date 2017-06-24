/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionshomework;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MariusNeagu
 */
public class FilesManagementIT {
    
    public FilesManagementIT() {
    }

    /**
     * Test of WriteInFile method, of class FilesManagement.
     */
    @Test
    public void testWriteInFile() {
        System.out.println("WriteInFile");
        FilesManagement.WriteInFile();
    }

    /**
     * Test of ReadFromFile method, of class FilesManagement.
     */
    @Test
    public void testReadFromFile() {
        System.out.println("ReadFromFile");
        FilesManagement.ReadFromFile();
    }

    /**
     * Test of WriteInEmptyFile method, of class FilesManagement.
     */
    @Test
    public void testWriteInEmptyFile() {
        System.out.println("WriteInEmptyFile");
        FilesManagement.WriteInEmptyFile();
    }

    /**
     * Test of DeleteContentOfFile method, of class FilesManagement.
     */
    @Test
    public void testDeleteContentOfFile() {
        System.out.println("DeleteContentOfFile");
        FilesManagement.DeleteContentOfFile();
    }
    
}
