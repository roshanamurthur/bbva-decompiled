package net.lingala.zip4j.tasks;

import java.io.IOException;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderWriter;
import net.lingala.zip4j.io.outputstream.SplitOutputStream;
import net.lingala.zip4j.model.EndOfCentralDirectoryRecord;
import net.lingala.zip4j.model.Zip4jConfig;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.progress.ProgressMonitor;

/* JADX INFO: loaded from: classes12.dex */
public class SetCommentTask extends AsyncZipTask<SetCommentTaskTaskParameters> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZipModel f85145d;

    public static class SetCommentTaskTaskParameters extends AbstractZipTaskParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85146a;

        public SetCommentTaskTaskParameters(String str, Zip4jConfig zip4jConfig) {
            super(zip4jConfig);
            this.f85146a = str;
        }
    }

    public SetCommentTask(ZipModel zipModel, AsyncZipTask.AsyncTaskParameters asyncTaskParameters) {
        super(asyncTaskParameters);
        this.f85145d = zipModel;
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public long calculateTotalWork(SetCommentTaskTaskParameters setCommentTaskTaskParameters) {
        return 0L;
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public ProgressMonitor.Task getTask() {
        return ProgressMonitor.Task.SET_COMMENT;
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public void executeTask(SetCommentTaskTaskParameters setCommentTaskTaskParameters, ProgressMonitor progressMonitor) throws IOException {
        if (setCommentTaskTaskParameters.f85146a == null) {
            throw new ZipException("comment is null, cannot update Zip file with comment");
        }
        ZipModel zipModel = this.f85145d;
        EndOfCentralDirectoryRecord endOfCentralDirectoryRecord = zipModel.getEndOfCentralDirectoryRecord();
        endOfCentralDirectoryRecord.setComment(setCommentTaskTaskParameters.f85146a);
        SplitOutputStream splitOutputStream = new SplitOutputStream(zipModel.getZipFile());
        try {
            if (zipModel.isZip64Format()) {
                splitOutputStream.seek(zipModel.getZip64EndOfCentralDirectoryRecord().getOffsetStartCentralDirectoryWRTStartDiskNumber());
            } else {
                splitOutputStream.seek(endOfCentralDirectoryRecord.getOffsetOfStartOfCentralDirectory());
            }
            new HeaderWriter().finalizeZipFileWithoutValidations(zipModel, splitOutputStream, setCommentTaskTaskParameters.zip4jConfig.getCharset());
            splitOutputStream.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    splitOutputStream.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }
}
