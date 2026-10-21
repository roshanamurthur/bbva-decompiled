package net.lingala.zip4j.tasks;

import java.io.File;
import java.io.IOException;
import java.util.List;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderWriter;
import net.lingala.zip4j.model.Zip4jConfig;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.progress.ProgressMonitor;

/* JADX INFO: loaded from: classes12.dex */
public class AddFilesToZipTask extends AbstractAddFileToZipTask<AddFilesToZipTaskParameters> {

    public static class AddFilesToZipTaskParameters extends AbstractZipTaskParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<File> f85113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ZipParameters f85114b;

        public AddFilesToZipTaskParameters(List<File> list, ZipParameters zipParameters, Zip4jConfig zip4jConfig) {
            super(zip4jConfig);
            this.f85113a = list;
            this.f85114b = zipParameters;
        }
    }

    public AddFilesToZipTask(ZipModel zipModel, char[] cArr, HeaderWriter headerWriter, AsyncZipTask.AsyncTaskParameters asyncTaskParameters) {
        super(zipModel, cArr, headerWriter, asyncTaskParameters);
    }

    @Override // net.lingala.zip4j.tasks.AbstractAddFileToZipTask, net.lingala.zip4j.tasks.AsyncZipTask
    public ProgressMonitor.Task getTask() {
        return super.getTask();
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public long calculateTotalWork(AddFilesToZipTaskParameters addFilesToZipTaskParameters) throws ZipException {
        return d(addFilesToZipTaskParameters.f85113a, addFilesToZipTaskParameters.f85114b);
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public void executeTask(AddFilesToZipTaskParameters addFilesToZipTaskParameters, ProgressMonitor progressMonitor) throws IOException {
        g(addFilesToZipTaskParameters.f85114b);
        b(addFilesToZipTaskParameters.f85113a, addFilesToZipTaskParameters.zip4jConfig, addFilesToZipTaskParameters.f85114b, progressMonitor);
    }
}
