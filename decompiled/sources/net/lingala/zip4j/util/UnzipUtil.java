package net.lingala.zip4j.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.io.inputstream.NumberedSplitInputStream;
import net.lingala.zip4j.io.inputstream.SplitInputStream;
import net.lingala.zip4j.io.inputstream.ZipInputStream;
import net.lingala.zip4j.io.inputstream.ZipStandardSplitInputStream;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.ZipModel;

/* JADX INFO: loaded from: classes12.dex */
public class UnzipUtil {
    public static void applyFileAttributes(FileHeader fileHeader, File file) {
        try {
            Path path = file.toPath();
            FileUtils.setFileAttributes(path, fileHeader.getExternalFileAttributes());
            FileUtils.setFileLastModifiedTime(path, fileHeader.getLastModifiedTime());
        } catch (NoSuchMethodError unused) {
            FileUtils.setFileLastModifiedTimeWithoutNio(file, fileHeader.getLastModifiedTime());
        }
    }

    public static SplitInputStream createSplitInputStream(ZipModel zipModel) throws IOException {
        return zipModel.getZipFile().getName().endsWith(InternalZipConstants.SEVEN_ZIP_SPLIT_FILE_EXTENSION_PATTERN) ? new NumberedSplitInputStream(zipModel.getZipFile(), true, zipModel.getEndOfCentralDirectoryRecord().getNumberOfThisDisk()) : new ZipStandardSplitInputStream(zipModel.getZipFile(), zipModel.isSplitArchive(), zipModel.getEndOfCentralDirectoryRecord().getNumberOfThisDisk());
    }

    public static ZipInputStream createZipInputStream(ZipModel zipModel, FileHeader fileHeader, char[] cArr) throws IOException {
        SplitInputStream splitInputStreamCreateSplitInputStream;
        try {
            splitInputStreamCreateSplitInputStream = createSplitInputStream(zipModel);
            try {
                splitInputStreamCreateSplitInputStream.prepareExtractionForFileHeader(fileHeader);
                ZipInputStream zipInputStream = new ZipInputStream(splitInputStreamCreateSplitInputStream, cArr);
                if (zipInputStream.getNextEntry(fileHeader, false) != null) {
                    return zipInputStream;
                }
                throw new ZipException("Could not locate local file header for corresponding file header");
            } catch (IOException e5) {
                e = e5;
                if (splitInputStreamCreateSplitInputStream != null) {
                    splitInputStreamCreateSplitInputStream.close();
                }
                throw e;
            }
        } catch (IOException e7) {
            e = e7;
            splitInputStreamCreateSplitInputStream = null;
        }
    }
}
