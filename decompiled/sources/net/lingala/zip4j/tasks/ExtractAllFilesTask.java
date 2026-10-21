package net.lingala.zip4j.tasks;

import java.io.IOException;
import net.lingala.zip4j.headers.HeaderUtil;
import net.lingala.zip4j.io.inputstream.SplitInputStream;
import net.lingala.zip4j.io.inputstream.ZipInputStream;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.UnzipParameters;
import net.lingala.zip4j.model.Zip4jConfig;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.progress.ProgressMonitor;
import net.lingala.zip4j.util.UnzipUtil;

/* JADX INFO: loaded from: classes12.dex */
public class ExtractAllFilesTask extends AbstractExtractFileTask<ExtractAllFilesTaskParameters> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final char[] f85127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SplitInputStream f85128g;

    public static class ExtractAllFilesTaskParameters extends AbstractZipTaskParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85129a;

        public ExtractAllFilesTaskParameters(String str, Zip4jConfig zip4jConfig) {
            super(zip4jConfig);
            this.f85129a = str;
        }
    }

    public ExtractAllFilesTask(ZipModel zipModel, char[] cArr, UnzipParameters unzipParameters, AsyncZipTask.AsyncTaskParameters asyncTaskParameters) {
        super(zipModel, unzipParameters, asyncTaskParameters);
        this.f85127f = cArr;
    }

    public final ZipInputStream a(Zip4jConfig zip4jConfig) throws IOException {
        this.f85128g = UnzipUtil.createSplitInputStream(getZipModel());
        ZipModel zipModel = getZipModel();
        FileHeader fileHeader = (zipModel.getCentralDirectory() == null || zipModel.getCentralDirectory().getFileHeaders() == null || zipModel.getCentralDirectory().getFileHeaders().size() == 0) ? null : zipModel.getCentralDirectory().getFileHeaders().get(0);
        if (fileHeader != null) {
            this.f85128g.prepareExtractionForFileHeader(fileHeader);
        }
        return new ZipInputStream(this.f85128g, this.f85127f, zip4jConfig);
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public long calculateTotalWork(ExtractAllFilesTaskParameters extractAllFilesTaskParameters) {
        return HeaderUtil.getTotalUncompressedSizeOfAllFileHeaders(getZipModel().getCentralDirectory().getFileHeaders());
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public void executeTask(ExtractAllFilesTaskParameters extractAllFilesTaskParameters, ProgressMonitor progressMonitor) throws IOException {
        try {
            ZipInputStream zipInputStreamA = a(extractAllFilesTaskParameters.zip4jConfig);
            try {
                for (FileHeader fileHeader : getZipModel().getCentralDirectory().getFileHeaders()) {
                    if (fileHeader.getFileName().startsWith("__MACOSX")) {
                        progressMonitor.updateWorkCompleted(fileHeader.getUncompressedSize());
                    } else {
                        this.f85128g.prepareExtractionForFileHeader(fileHeader);
                        extractFile(zipInputStreamA, fileHeader, extractAllFilesTaskParameters.f85129a, null, progressMonitor, new byte[extractAllFilesTaskParameters.zip4jConfig.getBufferSize()]);
                        verifyIfTaskIsCancelled();
                    }
                }
                zipInputStreamA.close();
                SplitInputStream splitInputStream = this.f85128g;
                if (splitInputStream != null) {
                    splitInputStream.close();
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        zipInputStreamA.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            SplitInputStream splitInputStream2 = this.f85128g;
            if (splitInputStream2 != null) {
                splitInputStream2.close();
            }
            throw th5;
        }
    }
}
