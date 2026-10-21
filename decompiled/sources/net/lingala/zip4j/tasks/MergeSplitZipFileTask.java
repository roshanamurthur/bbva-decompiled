package net.lingala.zip4j.tasks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.List;
import mx.openpay.library.domain.util.Constant;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderSignature;
import net.lingala.zip4j.headers.HeaderWriter;
import net.lingala.zip4j.model.EndOfCentralDirectoryRecord;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.Zip4jConfig;
import net.lingala.zip4j.model.Zip64EndOfCentralDirectoryLocator;
import net.lingala.zip4j.model.Zip64EndOfCentralDirectoryRecord;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.model.enums.RandomAccessFileMode;
import net.lingala.zip4j.progress.ProgressMonitor;
import net.lingala.zip4j.util.FileUtils;
import net.lingala.zip4j.util.RawIO;

/* JADX INFO: loaded from: classes12.dex */
public class MergeSplitZipFileTask extends AsyncZipTask<MergeSplitZipFileTaskParameters> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZipModel f85135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RawIO f85136e;

    public static class MergeSplitZipFileTaskParameters extends AbstractZipTaskParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f85137a;

        public MergeSplitZipFileTaskParameters(File file, Zip4jConfig zip4jConfig) {
            super(zip4jConfig);
            this.f85137a = file;
        }
    }

    public MergeSplitZipFileTask(ZipModel zipModel, AsyncZipTask.AsyncTaskParameters asyncTaskParameters) {
        super(asyncTaskParameters);
        this.f85136e = new RawIO();
        this.f85135d = zipModel;
    }

    public static File a(ZipModel zipModel, int i10) {
        if (i10 == zipModel.getEndOfCentralDirectoryRecord().getNumberOfThisDisk()) {
            return zipModel.getZipFile();
        }
        return new File(zipModel.getZipFile().getPath().substring(0, zipModel.getZipFile().getPath().lastIndexOf(Constant.DOT_STRING)) + (i10 >= 9 ? ".z" : ".z0") + (i10 + 1));
    }

    public static void b(ZipModel zipModel, long j10, FileOutputStream fileOutputStream, Charset charset) throws IOException, CloneNotSupportedException {
        ZipModel zipModel2 = (ZipModel) zipModel.clone();
        zipModel2.getEndOfCentralDirectoryRecord().setOffsetOfStartOfCentralDirectory(j10);
        zipModel2.setSplitArchive(false);
        int size = zipModel2.getCentralDirectory().getFileHeaders().size();
        EndOfCentralDirectoryRecord endOfCentralDirectoryRecord = zipModel2.getEndOfCentralDirectoryRecord();
        endOfCentralDirectoryRecord.setNumberOfThisDisk(0);
        endOfCentralDirectoryRecord.setNumberOfThisDiskStartOfCentralDir(0);
        endOfCentralDirectoryRecord.setTotalNumberOfEntriesInCentralDirectory(size);
        endOfCentralDirectoryRecord.setTotalNumberOfEntriesInCentralDirectoryOnThisDisk(size);
        if (zipModel2.isZip64Format()) {
            if (zipModel2.getZip64EndOfCentralDirectoryLocator() != null) {
                Zip64EndOfCentralDirectoryLocator zip64EndOfCentralDirectoryLocator = zipModel2.getZip64EndOfCentralDirectoryLocator();
                zip64EndOfCentralDirectoryLocator.setNumberOfDiskStartOfZip64EndOfCentralDirectoryRecord(0);
                zip64EndOfCentralDirectoryLocator.setOffsetZip64EndOfCentralDirectoryRecord(zip64EndOfCentralDirectoryLocator.getOffsetZip64EndOfCentralDirectoryRecord() + j10);
                zip64EndOfCentralDirectoryLocator.setTotalNumberOfDiscs(1);
            }
            if (zipModel2.getZip64EndOfCentralDirectoryRecord() != null) {
                Zip64EndOfCentralDirectoryRecord zip64EndOfCentralDirectoryRecord = zipModel2.getZip64EndOfCentralDirectoryRecord();
                zip64EndOfCentralDirectoryRecord.setNumberOfThisDisk(0);
                zip64EndOfCentralDirectoryRecord.setNumberOfThisDiskStartOfCentralDirectory(0);
                zip64EndOfCentralDirectoryRecord.setTotalNumberOfEntriesInCentralDirectoryOnThisDisk(zipModel2.getEndOfCentralDirectoryRecord().getTotalNumberOfEntriesInCentralDirectory());
                zip64EndOfCentralDirectoryRecord.setOffsetStartCentralDirectoryWRTStartDiskNumber(zip64EndOfCentralDirectoryRecord.getOffsetStartCentralDirectoryWRTStartDiskNumber() + j10);
            }
        }
        new HeaderWriter().finalizeZipFileWithoutValidations(zipModel2, fileOutputStream, charset);
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public ProgressMonitor.Task getTask() {
        return ProgressMonitor.Task.MERGE_ZIP_FILES;
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public long calculateTotalWork(MergeSplitZipFileTaskParameters mergeSplitZipFileTaskParameters) {
        ZipModel zipModel = this.f85135d;
        long length = 0;
        if (!zipModel.isSplitArchive()) {
            return 0L;
        }
        for (int i10 = 0; i10 <= zipModel.getEndOfCentralDirectoryRecord().getNumberOfThisDisk(); i10++) {
            length += a(zipModel, i10).length();
        }
        return length;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #2 {all -> 0x0054, blocks: (B:12:0x0038, B:21:0x005f, B:15:0x004e), top: B:78:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0091  */
    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    /* JADX WARN: Code duplicated, block: B:32:0x009f A[Catch: all -> 0x00cf, TryCatch #8 {all -> 0x00cf, blocks: (B:25:0x0080, B:29:0x0095, B:30:0x0099, B:32:0x009f, B:34:0x00ab, B:36:0x00bc), top: B:88:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00ab A[SYNTHETIC] */
    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public void executeTask(MergeSplitZipFileTaskParameters mergeSplitZipFileTaskParameters, ProgressMonitor progressMonitor) throws IOException {
        RandomAccessFile randomAccessFile;
        Throwable th2;
        int i10;
        int i11;
        int i12;
        int i13;
        long j10;
        MergeSplitZipFileTask mergeSplitZipFileTask = this;
        MergeSplitZipFileTaskParameters mergeSplitZipFileTaskParameters2 = mergeSplitZipFileTaskParameters;
        ZipModel zipModel = mergeSplitZipFileTask.f85135d;
        if (!zipModel.isSplitArchive()) {
            ZipException zipException = new ZipException("archive not a split zip file");
            progressMonitor.endProgressMonitor(zipException);
            throw zipException;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(mergeSplitZipFileTaskParameters2.f85137a);
            try {
                int numberOfThisDisk = zipModel.getEndOfCentralDirectoryRecord().getNumberOfThisDisk();
                if (numberOfThisDisk <= 0) {
                    throw new ZipException("zip archive not a split zip file");
                }
                int i14 = 0;
                long j11 = 0;
                int i15 = 0;
                while (i15 <= numberOfThisDisk) {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(a(zipModel, i15), RandomAccessFileMode.READ.getValue());
                    try {
                        long length = randomAccessFile2.length();
                        try {
                            if (i15 == 0) {
                                try {
                                    if (mergeSplitZipFileTask.f85136e.readIntLittleEndian(randomAccessFile2) == HeaderSignature.SPLIT_ZIP.getValue()) {
                                        i10 = 4;
                                        i11 = 4;
                                    } else {
                                        randomAccessFile2.seek(0L);
                                    }
                                    if (i15 == numberOfThisDisk) {
                                        length = zipModel.getEndOfCentralDirectoryRecord().getOffsetOfStartOfCentralDirectory();
                                    }
                                    long j12 = length;
                                    long j13 = i10;
                                    int bufferSize = mergeSplitZipFileTaskParameters2.zip4jConfig.getBufferSize();
                                    i12 = i11;
                                    long j14 = j11;
                                    randomAccessFile = randomAccessFile2;
                                    i13 = i15;
                                    FileUtils.copyFile(randomAccessFile2, fileOutputStream, j13, j12, progressMonitor, bufferSize);
                                    j11 = (j12 - j13) + j14;
                                    List<FileHeader> fileHeaders = zipModel.getCentralDirectory().getFileHeaders();
                                    if (i13 == 0) {
                                        j10 = 0;
                                    } else {
                                        j10 = j11;
                                    }
                                    for (FileHeader fileHeader : fileHeaders) {
                                        if (fileHeader.getDiskNumberStart() == i13) {
                                            fileHeader.setOffsetLocalHeader((fileHeader.getOffsetLocalHeader() + j10) - ((long) i12));
                                            fileHeader.setDiskNumberStart(0);
                                        }
                                    }
                                    verifyIfTaskIsCancelled();
                                    randomAccessFile.close();
                                    i15 = i13 + 1;
                                    mergeSplitZipFileTask = this;
                                    mergeSplitZipFileTaskParameters2 = mergeSplitZipFileTaskParameters;
                                    i14 = i12;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    randomAccessFile = randomAccessFile2;
                                    try {
                                        throw th2;
                                    } catch (Throwable th4) {
                                        try {
                                            randomAccessFile.close();
                                            throw th4;
                                        } catch (Throwable th5) {
                                            th2.addSuppressed(th5);
                                            throw th4;
                                        }
                                    }
                                }
                            }
                            FileUtils.copyFile(randomAccessFile2, fileOutputStream, j13, j12, progressMonitor, bufferSize);
                            j11 = (j12 - j13) + j14;
                            List<FileHeader> fileHeaders2 = zipModel.getCentralDirectory().getFileHeaders();
                            if (i13 == 0) {
                                j10 = 0;
                            } else {
                                j10 = j11;
                            }
                            while (r0.hasNext()) {
                                if (fileHeader.getDiskNumberStart() == i13) {
                                    fileHeader.setOffsetLocalHeader((fileHeader.getOffsetLocalHeader() + j10) - ((long) i12));
                                    fileHeader.setDiskNumberStart(0);
                                }
                            }
                            verifyIfTaskIsCancelled();
                            randomAccessFile.close();
                            i15 = i13 + 1;
                            mergeSplitZipFileTask = this;
                            mergeSplitZipFileTaskParameters2 = mergeSplitZipFileTaskParameters;
                            i14 = i12;
                        } catch (Throwable th6) {
                            th = th6;
                            th2 = th;
                            throw th2;
                        }
                        i11 = i14;
                        i10 = 0;
                        if (i15 == numberOfThisDisk) {
                            length = zipModel.getEndOfCentralDirectoryRecord().getOffsetOfStartOfCentralDirectory();
                        }
                        long j15 = length;
                        long j16 = i10;
                        int bufferSize2 = mergeSplitZipFileTaskParameters2.zip4jConfig.getBufferSize();
                        i12 = i11;
                        long j17 = j11;
                        randomAccessFile = randomAccessFile2;
                        i13 = i15;
                    } catch (Throwable th7) {
                        th = th7;
                        randomAccessFile = randomAccessFile2;
                    }
                }
                b(zipModel, j11, fileOutputStream, mergeSplitZipFileTaskParameters2.zip4jConfig.getCharset());
                progressMonitor.endProgressMonitor();
                fileOutputStream.close();
                return;
            } catch (Throwable th8) {
                try {
                    throw th8;
                } catch (Throwable th9) {
                    try {
                        fileOutputStream.close();
                        throw th9;
                    } catch (Throwable th10) {
                        th8.addSuppressed(th10);
                        throw th9;
                    }
                }
            }
        } catch (CloneNotSupportedException e5) {
            throw new ZipException(e5);
        }
        throw new ZipException(e5);
    }
}
