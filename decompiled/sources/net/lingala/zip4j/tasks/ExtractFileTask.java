package net.lingala.zip4j.tasks;

import androidx.camera.camera2.internal.h0;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderUtil;
import net.lingala.zip4j.io.inputstream.SplitInputStream;
import net.lingala.zip4j.io.inputstream.ZipInputStream;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.UnzipParameters;
import net.lingala.zip4j.model.Zip4jConfig;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.progress.ProgressMonitor;
import net.lingala.zip4j.util.FileUtils;
import net.lingala.zip4j.util.UnzipUtil;
import net.lingala.zip4j.util.Zip4jUtil;

/* JADX INFO: loaded from: classes12.dex */
public class ExtractFileTask extends AbstractExtractFileTask<ExtractFileTaskParameters> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final char[] f85130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SplitInputStream f85131g;

    public static class ExtractFileTaskParameters extends AbstractZipTaskParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f85133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f85134c;

        public ExtractFileTaskParameters(String str, String str2, String str3, Zip4jConfig zip4jConfig) {
            super(zip4jConfig);
            this.f85132a = str;
            this.f85133b = str2;
            this.f85134c = str3;
        }
    }

    public ExtractFileTask(ZipModel zipModel, char[] cArr, UnzipParameters unzipParameters, AsyncZipTask.AsyncTaskParameters asyncTaskParameters) {
        super(zipModel, unzipParameters, asyncTaskParameters);
        this.f85130f = cArr;
    }

    public final List<FileHeader> a(String str) throws ZipException {
        if (FileUtils.isZipEntryDirectory(str)) {
            return HeaderUtil.getFileHeadersUnderDirectory(getZipModel().getCentralDirectory().getFileHeaders(), str);
        }
        FileHeader fileHeader = HeaderUtil.getFileHeader(getZipModel(), str);
        if (fileHeader != null) {
            return Collections.singletonList(fileHeader);
        }
        throw new ZipException(h0.b("No file found with name ", str, " in zip file"), ZipException.Type.FILE_NOT_FOUND);
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public long calculateTotalWork(ExtractFileTaskParameters extractFileTaskParameters) throws ZipException {
        return HeaderUtil.getTotalUncompressedSizeOfAllFileHeaders(a(extractFileTaskParameters.f85133b));
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public void executeTask(ExtractFileTaskParameters extractFileTaskParameters, ProgressMonitor progressMonitor) throws IOException {
        List<FileHeader> listA = a(extractFileTaskParameters.f85133b);
        try {
            Zip4jConfig zip4jConfig = extractFileTaskParameters.zip4jConfig;
            this.f85131g = UnzipUtil.createSplitInputStream(getZipModel());
            ZipInputStream zipInputStream = new ZipInputStream(this.f85131g, this.f85130f, zip4jConfig);
            try {
                byte[] bArr = new byte[extractFileTaskParameters.zip4jConfig.getBufferSize()];
                for (FileHeader fileHeader : listA) {
                    this.f85131g.prepareExtractionForFileHeader(fileHeader);
                    String strReplaceFirst = extractFileTaskParameters.f85134c;
                    String str = extractFileTaskParameters.f85133b;
                    if (Zip4jUtil.isStringNotNullAndNotEmpty(strReplaceFirst) && FileUtils.isZipEntryDirectory(str)) {
                        strReplaceFirst = fileHeader.getFileName().replaceFirst(str, strReplaceFirst.concat(strReplaceFirst.endsWith("/") ? "" : "/"));
                    }
                    extractFile(zipInputStream, fileHeader, extractFileTaskParameters.f85132a, strReplaceFirst, progressMonitor, bArr);
                }
                zipInputStream.close();
                SplitInputStream splitInputStream = this.f85131g;
                if (splitInputStream != null) {
                    splitInputStream.close();
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        zipInputStream.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            SplitInputStream splitInputStream2 = this.f85131g;
            if (splitInputStream2 != null) {
                splitInputStream2.close();
            }
            throw th5;
        }
    }
}
