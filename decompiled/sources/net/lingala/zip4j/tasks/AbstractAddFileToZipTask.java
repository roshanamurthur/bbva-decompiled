package net.lingala.zip4j.tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderUtil;
import net.lingala.zip4j.headers.HeaderWriter;
import net.lingala.zip4j.io.outputstream.SplitOutputStream;
import net.lingala.zip4j.io.outputstream.ZipOutputStream;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.Zip4jConfig;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;
import net.lingala.zip4j.progress.ProgressMonitor;
import net.lingala.zip4j.util.BitUtils;
import net.lingala.zip4j.util.CrcUtil;
import net.lingala.zip4j.util.FileUtils;
import net.lingala.zip4j.util.Zip4jUtil;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractAddFileToZipTask<T> extends AsyncZipTask<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZipModel f85108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final char[] f85109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HeaderWriter f85110f;

    public AbstractAddFileToZipTask(ZipModel zipModel, char[] cArr, HeaderWriter headerWriter, AsyncZipTask.AsyncTaskParameters asyncTaskParameters) {
        super(asyncTaskParameters);
        this.f85108d = zipModel;
        this.f85109e = cArr;
        this.f85110f = headerWriter;
    }

    public static ZipParameters e(ZipParameters zipParameters, File file, ProgressMonitor progressMonitor) throws IOException {
        ZipParameters zipParameters2 = new ZipParameters(zipParameters);
        zipParameters2.setLastModifiedFileTime(Zip4jUtil.epochToExtendedDosTime(file.lastModified()));
        if (file.isDirectory()) {
            zipParameters2.setEntrySize(0L);
        } else {
            zipParameters2.setEntrySize(file.length());
        }
        zipParameters2.setWriteExtendedLocalFileHeader(false);
        zipParameters2.setLastModifiedFileTime(file.lastModified());
        if (!Zip4jUtil.isStringNotNullAndNotEmpty(zipParameters.getFileNameInZip())) {
            zipParameters2.setFileNameInZip(FileUtils.getRelativeFileName(file, zipParameters));
        }
        if (file.isDirectory()) {
            zipParameters2.setCompressionMethod(CompressionMethod.STORE);
            zipParameters2.setEncryptionMethod(EncryptionMethod.NONE);
            zipParameters2.setEncryptFiles(false);
        } else {
            if (zipParameters2.isEncryptFiles() && zipParameters2.getEncryptionMethod() == EncryptionMethod.ZIP_STANDARD) {
                progressMonitor.setCurrentTask(ProgressMonitor.Task.CALCULATE_CRC);
                zipParameters2.setEntryCRC(CrcUtil.computeFileCrc(file, progressMonitor));
                progressMonitor.setCurrentTask(ProgressMonitor.Task.ADD_ENTRY);
            }
            if (file.length() == 0) {
                zipParameters2.setCompressionMethod(CompressionMethod.STORE);
            }
        }
        return zipParameters2;
    }

    public final void a(File file, ZipOutputStream zipOutputStream, ZipParameters zipParameters, SplitOutputStream splitOutputStream, ProgressMonitor progressMonitor, byte[] bArr) throws IOException {
        zipOutputStream.putNextEntry(zipParameters);
        if (file.exists() && !file.isDirectory()) {
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                try {
                    int i10 = fileInputStream.read(bArr);
                    if (i10 == -1) {
                        break;
                    }
                    zipOutputStream.write(bArr, 0, i10);
                    progressMonitor.updateWorkCompleted(i10);
                    verifyIfTaskIsCancelled();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            }
            fileInputStream.close();
        }
        FileHeader fileHeaderCloseEntry = zipOutputStream.closeEntry();
        byte[] fileAttributes = FileUtils.getFileAttributes(file);
        fileAttributes[3] = BitUtils.unsetBit(fileAttributes[3], 5);
        fileHeaderCloseEntry.setExternalFileAttributes(fileAttributes);
        this.f85110f.updateLocalFileHeader(fileHeaderCloseEntry, getZipModel(), splitOutputStream);
    }

    public final void b(List list, Zip4jConfig zip4jConfig, ZipParameters zipParameters, ProgressMonitor progressMonitor) throws IOException {
        FileUtils.assertFilesExist(list, zipParameters.getSymbolicLinkAction());
        byte[] bArr = new byte[zip4jConfig.getBufferSize()];
        ArrayList<File> arrayList = new ArrayList(list);
        ZipModel zipModel = this.f85108d;
        if (zipModel.getZipFile().exists()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                if (!Zip4jUtil.isStringNotNullAndNotEmpty(file.getName())) {
                    arrayList.remove(file);
                }
                FileHeader fileHeader = HeaderUtil.getFileHeader(zipModel, FileUtils.getRelativeFileName(file, zipParameters));
                if (fileHeader != null) {
                    if (zipParameters.isOverrideExistingFilesInZip()) {
                        progressMonitor.setCurrentTask(ProgressMonitor.Task.REMOVE_ENTRY);
                        f(fileHeader, progressMonitor, zip4jConfig);
                        verifyIfTaskIsCancelled();
                        progressMonitor.setCurrentTask(ProgressMonitor.Task.ADD_ENTRY);
                    } else {
                        arrayList.remove(file);
                    }
                }
            }
        }
        SplitOutputStream splitOutputStream = new SplitOutputStream(zipModel.getZipFile(), zipModel.getSplitLength());
        try {
            if (zipModel.getZipFile().exists()) {
                splitOutputStream.seek(HeaderUtil.getOffsetStartOfCentralDirectory(zipModel));
            }
            ZipOutputStream zipOutputStream = new ZipOutputStream(splitOutputStream, this.f85109e, zip4jConfig, zipModel);
            try {
                for (File file2 : arrayList) {
                    verifyIfTaskIsCancelled();
                    ZipParameters zipParametersE = e(zipParameters, file2, progressMonitor);
                    progressMonitor.setFileName(file2.getAbsolutePath());
                    if (FileUtils.isSymbolicLink(file2)) {
                        ZipParameters.SymbolicLinkAction symbolicLinkAction = ZipParameters.SymbolicLinkAction.INCLUDE_LINK_ONLY;
                        if (symbolicLinkAction.equals(zipParametersE.getSymbolicLinkAction()) || ZipParameters.SymbolicLinkAction.INCLUDE_LINK_AND_LINKED_FILE.equals(zipParametersE.getSymbolicLinkAction())) {
                            c(file2, zipOutputStream, zipParametersE, splitOutputStream);
                            if (symbolicLinkAction.equals(zipParametersE.getSymbolicLinkAction())) {
                            }
                        }
                    }
                    a(file2, zipOutputStream, zipParametersE, splitOutputStream, progressMonitor, bArr);
                }
                zipOutputStream.close();
                splitOutputStream.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        zipOutputStream.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                try {
                    splitOutputStream.close();
                } catch (Throwable th7) {
                    th5.addSuppressed(th7);
                }
                throw th6;
            }
        }
    }

    public final void c(File file, ZipOutputStream zipOutputStream, ZipParameters zipParameters, SplitOutputStream splitOutputStream) throws IOException {
        ZipParameters zipParameters2 = new ZipParameters(zipParameters);
        String fileNameInZip = zipParameters.getFileNameInZip();
        String name = file.getName();
        if (fileNameInZip.contains("/")) {
            name = fileNameInZip.substring(0, fileNameInZip.lastIndexOf("/") + 1) + name;
        }
        zipParameters2.setFileNameInZip(name);
        zipParameters2.setEncryptFiles(false);
        zipParameters2.setCompressionMethod(CompressionMethod.STORE);
        zipOutputStream.putNextEntry(zipParameters2);
        zipOutputStream.write(FileUtils.readSymbolicLink(file).getBytes());
        FileHeader fileHeaderCloseEntry = zipOutputStream.closeEntry();
        fileHeaderCloseEntry.setExternalFileAttributes(FileUtils.getFileAttributes(file));
        this.f85110f.updateLocalFileHeader(fileHeaderCloseEntry, getZipModel(), splitOutputStream);
    }

    public final long d(List<File> list, ZipParameters zipParameters) throws ZipException {
        long length = 0;
        for (File file : list) {
            if (file.exists()) {
                long length2 = ((zipParameters.isEncryptFiles() && zipParameters.getEncryptionMethod() == EncryptionMethod.ZIP_STANDARD) ? file.length() * 2 : file.length()) + length;
                FileHeader fileHeader = HeaderUtil.getFileHeader(getZipModel(), FileUtils.getRelativeFileName(file, zipParameters));
                length = fileHeader != null ? (getZipModel().getZipFile().length() - fileHeader.getCompressedSize()) + length2 : length2;
            }
        }
        return length;
    }

    public final void f(FileHeader fileHeader, ProgressMonitor progressMonitor, Zip4jConfig zip4jConfig) throws ZipException {
        new RemoveFilesFromZipTask(this.f85108d, this.f85110f, new AsyncZipTask.AsyncTaskParameters(null, false, progressMonitor)).execute(new RemoveFilesFromZipTask.RemoveFilesFromZipTaskParameters(Collections.singletonList(fileHeader.getFileName()), zip4jConfig));
    }

    public final void g(ZipParameters zipParameters) throws ZipException {
        if (zipParameters == null) {
            throw new ZipException("cannot validate zip parameters");
        }
        if (zipParameters.getCompressionMethod() != CompressionMethod.STORE && zipParameters.getCompressionMethod() != CompressionMethod.DEFLATE) {
            throw new ZipException("unsupported compression type");
        }
        if (!zipParameters.isEncryptFiles()) {
            zipParameters.setEncryptionMethod(EncryptionMethod.NONE);
        } else {
            if (zipParameters.getEncryptionMethod() == EncryptionMethod.NONE) {
                throw new ZipException("Encryption method has to be set, when encrypt files flag is set");
            }
            char[] cArr = this.f85109e;
            if (cArr == null || cArr.length <= 0) {
                throw new ZipException("input password is empty or null");
            }
        }
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public ProgressMonitor.Task getTask() {
        return ProgressMonitor.Task.ADD_ENTRY;
    }

    public ZipModel getZipModel() {
        return this.f85108d;
    }
}
