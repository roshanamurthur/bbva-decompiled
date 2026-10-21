package net.lingala.zip4j.tasks;

import java.util.ArrayList;
import java.util.List;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderWriter;
import net.lingala.zip4j.model.EndOfCentralDirectoryRecord;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.Zip4jConfig;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.progress.ProgressMonitor;

/* JADX INFO: loaded from: classes12.dex */
public class RemoveFilesFromZipTask extends b<RemoveFilesFromZipTaskParameters> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZipModel f85138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HeaderWriter f85139e;

    public static class RemoveFilesFromZipTaskParameters extends AbstractZipTaskParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f85140a;

        public RemoveFilesFromZipTaskParameters(List<String> list, Zip4jConfig zip4jConfig) {
            super(zip4jConfig);
            this.f85140a = list;
        }
    }

    public RemoveFilesFromZipTask(ZipModel zipModel, HeaderWriter headerWriter, AsyncZipTask.AsyncTaskParameters asyncTaskParameters) {
        super(asyncTaskParameters);
        this.f85138d = zipModel;
        this.f85139e = headerWriter;
    }

    public final void e(ArrayList arrayList, FileHeader fileHeader, long j10) throws ZipException {
        if (j10 == Long.MIN_VALUE) {
            throw new ArithmeticException("long overflow");
        }
        ZipModel zipModel = this.f85138d;
        b.d(arrayList, zipModel, fileHeader, -j10);
        EndOfCentralDirectoryRecord endOfCentralDirectoryRecord = zipModel.getEndOfCentralDirectoryRecord();
        endOfCentralDirectoryRecord.setOffsetOfStartOfCentralDirectory(endOfCentralDirectoryRecord.getOffsetOfStartOfCentralDirectory() - j10);
        endOfCentralDirectoryRecord.setTotalNumberOfEntriesInCentralDirectory(endOfCentralDirectoryRecord.getTotalNumberOfEntriesInCentralDirectory() - 1);
        if (endOfCentralDirectoryRecord.getTotalNumberOfEntriesInCentralDirectoryOnThisDisk() > 0) {
            endOfCentralDirectoryRecord.setTotalNumberOfEntriesInCentralDirectoryOnThisDisk(endOfCentralDirectoryRecord.getTotalNumberOfEntriesInCentralDirectoryOnThisDisk() - 1);
        }
        if (zipModel.isZip64Format()) {
            zipModel.getZip64EndOfCentralDirectoryRecord().setOffsetStartCentralDirectoryWRTStartDiskNumber(zipModel.getZip64EndOfCentralDirectoryRecord().getOffsetStartCentralDirectoryWRTStartDiskNumber() - j10);
            zipModel.getZip64EndOfCentralDirectoryRecord().setTotalNumberOfEntriesInCentralDirectoryOnThisDisk(zipModel.getZip64EndOfCentralDirectoryRecord().getTotalNumberOfEntriesInCentralDirectory() - 1);
            zipModel.getZip64EndOfCentralDirectoryLocator().setOffsetZip64EndOfCentralDirectoryRecord(zipModel.getZip64EndOfCentralDirectoryLocator().getOffsetZip64EndOfCentralDirectoryRecord() - j10);
        }
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public ProgressMonitor.Task getTask() {
        return ProgressMonitor.Task.REMOVE_ENTRY;
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public long calculateTotalWork(RemoveFilesFromZipTaskParameters removeFilesFromZipTaskParameters) {
        return this.f85138d.getZipFile().length();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0146 */
    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeTask(net.lingala.zip4j.tasks.RemoveFilesFromZipTask.RemoveFilesFromZipTaskParameters r22, net.lingala.zip4j.progress.ProgressMonitor r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.lingala.zip4j.tasks.RemoveFilesFromZipTask.executeTask(net.lingala.zip4j.tasks.RemoveFilesFromZipTask$RemoveFilesFromZipTaskParameters, net.lingala.zip4j.progress.ProgressMonitor):void");
    }
}
