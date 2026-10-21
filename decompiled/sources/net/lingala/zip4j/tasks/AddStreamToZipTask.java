package net.lingala.zip4j.tasks;

import java.io.IOException;
import java.io.InputStream;
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
import net.lingala.zip4j.progress.ProgressMonitor;
import net.lingala.zip4j.util.Zip4jUtil;

/* JADX INFO: loaded from: classes12.dex */
public class AddStreamToZipTask extends AbstractAddFileToZipTask<AddStreamToZipTaskParameters> {

    public static class AddStreamToZipTaskParameters extends AbstractZipTaskParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputStream f85117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ZipParameters f85118b;

        public AddStreamToZipTaskParameters(InputStream inputStream, ZipParameters zipParameters, Zip4jConfig zip4jConfig) {
            super(zip4jConfig);
            this.f85117a = inputStream;
            this.f85118b = zipParameters;
        }
    }

    public AddStreamToZipTask(ZipModel zipModel, char[] cArr, HeaderWriter headerWriter, AsyncZipTask.AsyncTaskParameters asyncTaskParameters) {
        super(zipModel, cArr, headerWriter, asyncTaskParameters);
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public long calculateTotalWork(AddStreamToZipTaskParameters addStreamToZipTaskParameters) {
        return 0L;
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public void executeTask(AddStreamToZipTaskParameters addStreamToZipTaskParameters, ProgressMonitor progressMonitor) throws IOException {
        g(addStreamToZipTaskParameters.f85118b);
        ZipParameters zipParameters = addStreamToZipTaskParameters.f85118b;
        if (!Zip4jUtil.isStringNotNullAndNotEmpty(zipParameters.getFileNameInZip())) {
            throw new ZipException("fileNameInZip has to be set in zipParameters when adding stream");
        }
        ZipModel zipModel = getZipModel();
        Zip4jConfig zip4jConfig = addStreamToZipTaskParameters.zip4jConfig;
        FileHeader fileHeader = HeaderUtil.getFileHeader(zipModel, zipParameters.getFileNameInZip());
        if (fileHeader != null) {
            f(fileHeader, progressMonitor, zip4jConfig);
        }
        zipParameters.setWriteExtendedLocalFileHeader(true);
        if (zipParameters.getCompressionMethod().equals(CompressionMethod.STORE)) {
            zipParameters.setEntrySize(0L);
        }
        SplitOutputStream splitOutputStream = new SplitOutputStream(getZipModel().getZipFile(), getZipModel().getSplitLength());
        try {
            Zip4jConfig zip4jConfig2 = addStreamToZipTaskParameters.zip4jConfig;
            ZipModel zipModel2 = this.f85108d;
            if (zipModel2.getZipFile().exists()) {
                splitOutputStream.seek(HeaderUtil.getOffsetStartOfCentralDirectory(zipModel2));
            }
            ZipOutputStream zipOutputStream = new ZipOutputStream(splitOutputStream, this.f85109e, zip4jConfig2, zipModel2);
            try {
                byte[] bArr = new byte[addStreamToZipTaskParameters.zip4jConfig.getBufferSize()];
                zipOutputStream.putNextEntry(zipParameters);
                if (!zipParameters.getFileNameInZip().endsWith("/") && !zipParameters.getFileNameInZip().endsWith("\\")) {
                    while (true) {
                        int i10 = addStreamToZipTaskParameters.f85117a.read(bArr);
                        if (i10 == -1) {
                            break;
                        } else {
                            zipOutputStream.write(bArr, 0, i10);
                        }
                    }
                }
                FileHeader fileHeaderCloseEntry = zipOutputStream.closeEntry();
                if (CompressionMethod.STORE.equals(Zip4jUtil.getCompressionMethod(fileHeaderCloseEntry))) {
                    this.f85110f.updateLocalFileHeader(fileHeaderCloseEntry, getZipModel(), splitOutputStream);
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
}
