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
import net.lingala.zip4j.util.FileUtils;

/* JADX INFO: loaded from: classes12.dex */
public class AddFolderToZipTask extends AbstractAddFileToZipTask<AddFolderToZipTaskParameters> {

    public static class AddFolderToZipTaskParameters extends AbstractZipTaskParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f85115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ZipParameters f85116b;

        public AddFolderToZipTaskParameters(File file, ZipParameters zipParameters, Zip4jConfig zip4jConfig) {
            super(zip4jConfig);
            this.f85115a = file;
            this.f85116b = zipParameters;
        }
    }

    public AddFolderToZipTask(ZipModel zipModel, char[] cArr, HeaderWriter headerWriter, AsyncZipTask.AsyncTaskParameters asyncTaskParameters) {
        super(zipModel, cArr, headerWriter, asyncTaskParameters);
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public long calculateTotalWork(AddFolderToZipTaskParameters addFolderToZipTaskParameters) throws ZipException {
        File file = addFolderToZipTaskParameters.f85115a;
        ZipParameters zipParameters = addFolderToZipTaskParameters.f85116b;
        List<File> filesInDirectoryRecursive = FileUtils.getFilesInDirectoryRecursive(file, zipParameters.isReadHiddenFiles(), zipParameters.isReadHiddenFolders(), zipParameters.getExcludeFileFilter());
        if (zipParameters.isIncludeRootFolder()) {
            filesInDirectoryRecursive.add(addFolderToZipTaskParameters.f85115a);
        }
        return d(filesInDirectoryRecursive, zipParameters);
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public void executeTask(AddFolderToZipTaskParameters addFolderToZipTaskParameters, ProgressMonitor progressMonitor) throws IOException {
        File file = addFolderToZipTaskParameters.f85115a;
        ZipParameters zipParameters = addFolderToZipTaskParameters.f85116b;
        List<File> filesInDirectoryRecursive = FileUtils.getFilesInDirectoryRecursive(file, zipParameters.isReadHiddenFiles(), zipParameters.isReadHiddenFolders(), zipParameters.getExcludeFileFilter());
        boolean zIsIncludeRootFolder = zipParameters.isIncludeRootFolder();
        File file2 = addFolderToZipTaskParameters.f85115a;
        if (zIsIncludeRootFolder) {
            filesInDirectoryRecursive.add(file2);
        }
        String canonicalPath = (!zipParameters.isIncludeRootFolder() || file2.getCanonicalFile().getParentFile() == null) ? file2.getCanonicalPath() : file2.getCanonicalFile().getParentFile().getCanonicalPath();
        zipParameters.setDefaultFolderPath(canonicalPath);
        b(filesInDirectoryRecursive, addFolderToZipTaskParameters.zip4jConfig, zipParameters, progressMonitor);
    }
}
