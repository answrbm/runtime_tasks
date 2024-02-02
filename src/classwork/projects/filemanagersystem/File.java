package classwork.projects.filemanagersystem;

import java.util.Objects;

public class File {
    String fileName;
    boolean deleteProtection;

    public File() {
    }

    public File(String fileName) {
        this.fileName = fileName;
    }

    public File(String fileName, boolean deleteProtection) {
        this.fileName = fileName;
        this.deleteProtection = deleteProtection;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public boolean isDeleteProtection() {
        return deleteProtection;
    }

    public void setDeleteProtection(boolean deleteProtection) {
        this.deleteProtection = deleteProtection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        File file = (File) o;
        return Objects.equals(fileName, file.fileName);
    }

    @Override
    public int hashCode() {
        return fileName != null ? fileName.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "File{" +
                "fileName='" + fileName + '\'' +
                ", deleteProtection=" + deleteProtection +
                '}';
    }
}
