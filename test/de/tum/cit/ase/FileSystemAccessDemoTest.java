package de.tum.cit.ase;

import de.tum.cit.ase.ares.api.BlacklistPath;
import de.tum.cit.ase.ares.api.Policy;
import de.tum.cit.ase.ares.api.WhitelistPath;
import de.tum.cit.ase.ares.api.jupiter.Public;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import static de.tum.cit.ase.ares.api.util.ReflectionTestUtils.*;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * @author Stephan Krusche (krusche@in.tum.de)
 * @version 5.1 (11.06.2021)
 */
@Public
@WhitelistPath("target") // mainly for Artemis
@BlacklistPath("target/test-classes") // prevent access to test-related classes and resources
class FileSystemAccessDemoTest {

    //<editor-fold desc="ReadTests">

    @Test
    @Policy(value = "test/de/tum/cit/ase/EverythingForbiddenPolicy.yaml")
    void accessFileSystemViaFilesReadArchUnit() {
        Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
        Object fileSystemAccessDemo = newInstance(clazz);
        invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesRead", "pom123.xml");
    }

    @Test
    @Policy(value = "test/de/tum/cit/ase/OnePathAllowedAspectJ.yaml")
    void accessFileSystemViaFilesReadAspectJ() {
        try {
            Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
            Object fileSystemAccessDemo = newInstance(clazz);
            invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesRead", "pom123.xml");
            fail();
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    @Policy(value = "test/de/tum/cit/ase/OnePathAllowedInstrumentation.yaml")
    void accessFileSystemViaFilesReadInstrumentation() {
        try {
            Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
            Object fileSystemAccessDemo = newInstance(clazz);
            invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesRead", "pom123.xml");
            fail();
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }
    //</editor-fold>

    //<editor-fold desc="WriteTests">

    @Test
    @Policy(value = "test/de/tum/cit/ase/EverythingForbiddenPolicy.yaml")
    void accessFileSystemViaFilesWriteArchUnit() {
        Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
        Object fileSystemAccessDemo = newInstance(clazz);
        invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesWrite", "pom123.xml");
    }

    @Test
    @Policy(value = "test/de/tum/cit/ase/OnePathAllowedAspectJ.yaml")
    void accessFileSystemViaFilesWriteAspectJ() {
        try {
            Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
            Object fileSystemAccessDemo = newInstance(clazz);
            invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesWrite", "pom123.xml");
            fail();
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    @Policy(value = "test/de/tum/cit/ase/OnePathAllowedInstrumentation.yaml")
    void accessFileSystemViaFilesWriteInstrumentation() {
        try {
            Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
            Object fileSystemAccessDemo = newInstance(clazz);
            invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesWrite", "pom123.xml");
            fail();
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }
    //</editor-fold>

    //<editor-fold desc="ExecuteTests">

    @Test
    @Policy(value = "test/de/tum/cit/ase/EverythingForbiddenPolicy.yaml")
    void accessFileSystemViaFilesExecuteArchUnit() {
        Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
        Object fileSystemAccessDemo = newInstance(clazz);
        invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesExecute", "pom123.xml");
    }

    @Test
    @Policy(value = "test/de/tum/cit/ase/OnePathAllowedAspectJ.yaml")
    void accessFileSystemViaFilesExecuteAspectJ() {
        try {
            Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
            Object fileSystemAccessDemo = newInstance(clazz);
            invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesExecute", "pom123.xml");
            fail();
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    @Policy(value = "test/de/tum/cit/ase/OnePathAllowedInstrumentation.yaml")
    void accessFileSystemViaFilesExecuteInstrumentation() {
        try {
            Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
            Object fileSystemAccessDemo = newInstance(clazz);
            invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesExecute", "pom123.xml");
            fail();
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }
    //</editor-fold>

    //<editor-fold desc="DeleteTests">

    @Test
    @Policy(value = "test/de/tum/cit/ase/EverythingForbiddenPolicy.yaml")
    void accessFileSystemViaFilesDeleteArchUnit() {
        Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
        Object fileSystemAccessDemo = newInstance(clazz);
        invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesDelete", "pom123.xml");
    }

    @Test
    @Policy(value = "test/de/tum/cit/ase/OnePathAllowedAspectJ.yaml")
    void accessFileSystemViaFilesDeleteAspectJ() {
        try {
            Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
            Object fileSystemAccessDemo = newInstance(clazz);
            invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesDelete", "pom123.xml");
            fail();
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    @Policy(value = "test/de/tum/cit/ase/OnePathAllowedInstrumentation.yaml")
    void accessFileSystemViaFilesDeleteInstrumentation() {
        try {
            Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
            Object fileSystemAccessDemo = newInstance(clazz);
            invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesDelete", "pom123.xml");
            fail();
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }
    //</editor-fold>
}
