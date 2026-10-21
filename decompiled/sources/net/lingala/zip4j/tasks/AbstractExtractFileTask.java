package net.lingala.zip4j.tasks;

import androidx.camera.camera2.internal.compat.u;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.io.inputstream.ZipInputStream;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.LocalFileHeader;
import net.lingala.zip4j.model.UnzipParameters;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.progress.ProgressMonitor;
import net.lingala.zip4j.util.BitUtils;
import net.lingala.zip4j.util.InternalZipConstants;
import net.lingala.zip4j.util.UnzipUtil;
import net.lingala.zip4j.util.Zip4jUtil;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractExtractFileTask<T> extends AsyncZipTask<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZipModel f85111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final UnzipParameters f85112e;

    public AbstractExtractFileTask(ZipModel zipModel, UnzipParameters unzipParameters, AsyncZipTask.AsyncTaskParameters asyncTaskParameters) {
        super(asyncTaskParameters);
        this.f85111d = zipModel;
        this.f85112e = unzipParameters;
    }

    /* JADX WARN: Code duplicated, block: B:95:0x018d  */
    public void extractFile(ZipInputStream zipInputStream, FileHeader fileHeader, String str, String str2, ProgressMonitor progressMonitor, byte[] bArr) throws Exception {
        byte[] externalFileAttributes = fileHeader.getExternalFileAttributes();
        if (externalFileAttributes == null || externalFileAttributes.length < 4 || !BitUtils.isBitSet(externalFileAttributes[3], 5) || this.f85112e.isExtractSymbolicLinks()) {
            String str3 = InternalZipConstants.FILE_SEPARATOR;
            if (!str.endsWith(str3)) {
                str = u.f(str, str3);
            }
            String fileName = fileHeader.getFileName();
            if (!Zip4jUtil.isStringNotNullAndNotEmpty(str2)) {
                str2 = fileName;
            }
            File file = new File(androidx.camera.core.impl.utils.a.b(str, str3, str2));
            progressMonitor.setFileName(file.getAbsolutePath());
            if (!file.getCanonicalPath().startsWith(new File(str).getCanonicalPath() + File.separator)) {
                throw new ZipException("illegal file name that breaks out of the target directory: " + fileHeader.getFileName());
            }
            if (BitUtils.isBitSet(fileHeader.getGeneralPurposeFlag()[0], 6)) {
                throw new ZipException("Entry with name " + fileHeader.getFileName() + " is encrypted with Strong Encryption. Zip4j does not support Strong Encryption, as this is patented.");
            }
            LocalFileHeader nextEntry = zipInputStream.getNextEntry(fileHeader, false);
            if (nextEntry == null) {
                throw new ZipException("Could not read corresponding local file header for file header: " + fileHeader.getFileName());
            }
            if (!fileHeader.getFileName().equals(nextEntry.getFileName())) {
                throw new ZipException("File header and local file header mismatch");
            }
            if (!fileHeader.isDirectory()) {
                byte[] externalFileAttributes2 = fileHeader.getExternalFileAttributes();
                if (externalFileAttributes2 != null && externalFileAttributes2.length >= 4 && BitUtils.isBitSet(externalFileAttributes2[3], 5)) {
                    int uncompressedSize = (int) fileHeader.getUncompressedSize();
                    byte[] bArr2 = new byte[uncompressedSize];
                    if (zipInputStream.read(bArr2) != uncompressedSize) {
                        throw new ZipException("Could not read complete entry");
                    }
                    progressMonitor.updateWorkCompleted(uncompressedSize);
                    String str4 = new String(bArr2);
                    if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
                        throw new ZipException("Could not create parent directories");
                    }
                    try {
                        Files.createSymbolicLink(file.toPath(), Paths.get(str4, new String[0]), new FileAttribute[0]);
                    } catch (NoSuchMethodError unused) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            fileOutputStream.write(str4.getBytes());
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th4) {
                                    th2.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        }
                    }
                } else {
                    if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
                        throw new ZipException("Unable to create parent directories: " + file.getParentFile());
                    }
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        while (true) {
                            try {
                                int i10 = zipInputStream.read(bArr);
                                if (i10 == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i10);
                                progressMonitor.updateWorkCompleted(i10);
                                verifyIfTaskIsCancelled();
                            } catch (Throwable th5) {
                                try {
                                    throw th5;
                                } catch (Throwable th6) {
                                    try {
                                        fileOutputStream2.close();
                                    } catch (Throwable th7) {
                                        th5.addSuppressed(th7);
                                    }
                                    throw th6;
                                }
                            }
                            if (file.exists()) {
                                file.delete();
                            }
                            throw e;
                        }
                        fileOutputStream2.close();
                    } catch (Exception e5) {
                        if (file.exists()) {
                            file.delete();
                        }
                        throw e5;
                    }
                }
            } else if (!file.exists() && !file.mkdirs()) {
                throw new ZipException("Could not create directory: " + file);
            }
            UnzipUtil.applyFileAttributes(fileHeader, file);
        }
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public ProgressMonitor.Task getTask() {
        return ProgressMonitor.Task.EXTRACT_ENTRY;
    }

    public ZipModel getZipModel() {
        return this.f85111d;
    }
}
