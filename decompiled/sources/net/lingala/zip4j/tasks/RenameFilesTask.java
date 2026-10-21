package net.lingala.zip4j.tasks;

import java.util.ArrayList;
import java.util.Map;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderUtil;
import net.lingala.zip4j.headers.HeaderWriter;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.Zip4jConfig;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.progress.ProgressMonitor;
import net.lingala.zip4j.util.RawIO;

/* JADX INFO: loaded from: classes12.dex */
public class RenameFilesTask extends b<RenameFilesTaskParameters> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZipModel f85141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HeaderWriter f85142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RawIO f85143f;

    public static class RenameFilesTaskParameters extends AbstractZipTaskParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, String> f85144a;

        public RenameFilesTaskParameters(Map<String, String> map, Zip4jConfig zip4jConfig) {
            super(zip4jConfig);
            this.f85144a = map;
        }
    }

    public RenameFilesTask(ZipModel zipModel, HeaderWriter headerWriter, RawIO rawIO, AsyncZipTask.AsyncTaskParameters asyncTaskParameters) {
        super(asyncTaskParameters);
        this.f85141d = zipModel;
        this.f85142e = headerWriter;
        this.f85143f = rawIO;
    }

    public final void e(ArrayList arrayList, FileHeader fileHeader, String str, byte[] bArr, int i10) throws ZipException {
        String fileName = fileHeader.getFileName();
        ZipModel zipModel = this.f85141d;
        FileHeader fileHeader2 = HeaderUtil.getFileHeader(zipModel, fileName);
        if (fileHeader2 == null) {
            throw new ZipException("could not find any header with name: " + fileHeader.getFileName());
        }
        fileHeader2.setFileName(str);
        fileHeader2.setFileNameLength(bArr.length);
        long j10 = i10;
        b.d(arrayList, zipModel, fileHeader2, j10);
        zipModel.getEndOfCentralDirectoryRecord().setOffsetOfStartOfCentralDirectory(zipModel.getEndOfCentralDirectoryRecord().getOffsetOfStartOfCentralDirectory() + j10);
        if (zipModel.isZip64Format()) {
            zipModel.getZip64EndOfCentralDirectoryRecord().setOffsetStartCentralDirectoryWRTStartDiskNumber(zipModel.getZip64EndOfCentralDirectoryRecord().getOffsetStartCentralDirectoryWRTStartDiskNumber() + j10);
            zipModel.getZip64EndOfCentralDirectoryLocator().setOffsetZip64EndOfCentralDirectoryRecord(zipModel.getZip64EndOfCentralDirectoryLocator().getOffsetZip64EndOfCentralDirectoryRecord() + j10);
        }
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public ProgressMonitor.Task getTask() {
        return ProgressMonitor.Task.RENAME_FILE;
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public long calculateTotalWork(RenameFilesTaskParameters renameFilesTaskParameters) {
        return this.f85141d.getZipFile().length();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x022c */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0240 */
    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeTask(net.lingala.zip4j.tasks.RenameFilesTask.RenameFilesTaskParameters r29, net.lingala.zip4j.progress.ProgressMonitor r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.lingala.zip4j.tasks.RenameFilesTask.executeTask(net.lingala.zip4j.tasks.RenameFilesTask$RenameFilesTaskParameters, net.lingala.zip4j.progress.ProgressMonitor):void");
    }
}
