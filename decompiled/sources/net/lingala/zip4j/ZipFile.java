package net.lingala.zip4j;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderReader;
import net.lingala.zip4j.headers.HeaderUtil;
import net.lingala.zip4j.headers.HeaderWriter;
import net.lingala.zip4j.io.inputstream.NumberedSplitRandomAccessFile;
import net.lingala.zip4j.io.inputstream.ZipInputStream;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.UnzipParameters;
import net.lingala.zip4j.model.Zip4jConfig;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.model.enums.RandomAccessFileMode;
import net.lingala.zip4j.progress.ProgressMonitor;
import net.lingala.zip4j.tasks.AddFilesToZipTask;
import net.lingala.zip4j.tasks.AddFolderToZipTask;
import net.lingala.zip4j.tasks.AddStreamToZipTask;
import net.lingala.zip4j.tasks.AsyncZipTask;
import net.lingala.zip4j.tasks.ExtractAllFilesTask;
import net.lingala.zip4j.tasks.ExtractFileTask;
import net.lingala.zip4j.tasks.MergeSplitZipFileTask;
import net.lingala.zip4j.tasks.RemoveFilesFromZipTask;
import net.lingala.zip4j.tasks.RenameFilesTask;
import net.lingala.zip4j.tasks.SetCommentTask;
import net.lingala.zip4j.util.FileUtils;
import net.lingala.zip4j.util.InternalZipConstants;
import net.lingala.zip4j.util.RawIO;
import net.lingala.zip4j.util.UnzipUtil;
import net.lingala.zip4j.util.Zip4jUtil;

/* JADX INFO: loaded from: classes12.dex */
public class ZipFile implements Closeable {
    public int E0;
    public final ArrayList F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final File f84891p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ZipModel f84892q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f84893r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ProgressMonitor f84894s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f84895t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public char[] f84896u0;
    public final HeaderWriter v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public Charset f84897w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ThreadFactory f84898x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ExecutorService f84899y0;

    public ZipFile(String str) {
        this(new File(str), (char[]) null);
    }

    public final void a(File file, ZipParameters zipParameters, boolean z10) throws ZipException {
        m();
        ZipModel zipModel = this.f84892q0;
        if (zipModel == null) {
            throw new ZipException("internal error: zip model is null");
        }
        if (z10 && zipModel.isSplitArchive()) {
            throw new ZipException("This is a split archive. Zip file format does not allow updating split/spanned files");
        }
        new AddFolderToZipTask(this.f84892q0, this.f84896u0, this.v0, b()).execute(new AddFolderToZipTask.AddFolderToZipTaskParameters(file, zipParameters, e()));
    }

    public void addFile(String str) throws ZipException {
        addFile(str, new ZipParameters());
    }

    public void addFiles(List<File> list) throws ZipException {
        addFiles(list, new ZipParameters());
    }

    public void addFolder(File file) throws ZipException {
        addFolder(file, new ZipParameters());
    }

    public void addStream(InputStream inputStream, ZipParameters zipParameters) throws ZipException {
        if (inputStream == null) {
            throw new ZipException("inputstream is null, cannot add file to zip");
        }
        if (zipParameters == null) {
            throw new ZipException("zip parameters are null");
        }
        setRunInThread(false);
        m();
        if (this.f84892q0 == null) {
            throw new ZipException("internal error: zip model is null");
        }
        if (this.f84891p0.exists() && this.f84892q0.isSplitArchive()) {
            throw new ZipException("Zip file already exists. Zip file format does not allow updating split/spanned files");
        }
        new AddStreamToZipTask(this.f84892q0, this.f84896u0, this.v0, b()).execute(new AddStreamToZipTask.AddStreamToZipTaskParameters(inputStream, zipParameters, e()));
    }

    public final AsyncZipTask.AsyncTaskParameters b() {
        if (this.f84895t0) {
            if (this.f84898x0 == null) {
                this.f84898x0 = Executors.defaultThreadFactory();
            }
            this.f84899y0 = Executors.newSingleThreadExecutor(this.f84898x0);
        }
        return new AsyncZipTask.AsyncTaskParameters(this.f84899y0, this.f84895t0, this.f84894s0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ArrayList arrayList = this.F0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InputStream) it.next()).close();
        }
        arrayList.clear();
    }

    public void createSplitZipFile(List<File> list, ZipParameters zipParameters, boolean z10, long j10) throws ZipException {
        File file = this.f84891p0;
        if (file.exists()) {
            throw new ZipException("zip file: " + file + " already exists. To add files to existing zip file use addFile method");
        }
        if (list == null || list.size() == 0) {
            throw new ZipException("input file List is null, cannot create zip file");
        }
        ZipModel zipModel = new ZipModel();
        this.f84892q0 = zipModel;
        zipModel.setZipFile(this.f84891p0);
        this.f84892q0.setSplitArchive(z10);
        this.f84892q0.setSplitLength(j10);
        new AddFilesToZipTask(this.f84892q0, this.f84896u0, this.v0, b()).execute(new AddFilesToZipTask.AddFilesToZipTaskParameters(list, zipParameters, e()));
    }

    public void createSplitZipFileFromFolder(File file, ZipParameters zipParameters, boolean z10, long j10) throws ZipException {
        if (file == null) {
            throw new ZipException("folderToAdd is null, cannot create zip file from folder");
        }
        if (zipParameters == null) {
            throw new ZipException("input parameters are null, cannot create zip file from folder");
        }
        File file2 = this.f84891p0;
        if (file2.exists()) {
            throw new ZipException("zip file: " + file2 + " already exists. To add files to existing zip file use addFolder method");
        }
        ZipModel zipModel = new ZipModel();
        this.f84892q0 = zipModel;
        zipModel.setZipFile(this.f84891p0);
        this.f84892q0.setSplitArchive(z10);
        if (z10) {
            this.f84892q0.setSplitLength(j10);
        }
        a(file, zipParameters, false);
    }

    public final Zip4jConfig e() {
        return new Zip4jConfig(this.f84897w0, this.E0);
    }

    public void extractAll(String str) throws ZipException {
        extractAll(str, new UnzipParameters());
    }

    public void extractFile(FileHeader fileHeader, String str) throws ZipException {
        extractFile(fileHeader, str, (String) null, new UnzipParameters());
    }

    public int getBufferSize() {
        return this.E0;
    }

    public Charset getCharset() {
        Charset charset = this.f84897w0;
        return charset == null ? InternalZipConstants.CHARSET_UTF_8 : charset;
    }

    public String getComment() throws ZipException {
        if (!this.f84891p0.exists()) {
            throw new ZipException("zip file does not exist, cannot read comment");
        }
        m();
        ZipModel zipModel = this.f84892q0;
        if (zipModel == null) {
            throw new ZipException("zip model is null, cannot read comment");
        }
        if (zipModel.getEndOfCentralDirectoryRecord() != null) {
            return this.f84892q0.getEndOfCentralDirectoryRecord().getComment();
        }
        throw new ZipException("end of central directory record is null, cannot read comment");
    }

    public ExecutorService getExecutorService() {
        return this.f84899y0;
    }

    public File getFile() {
        return this.f84891p0;
    }

    public FileHeader getFileHeader(String str) throws ZipException {
        if (!Zip4jUtil.isStringNotNullAndNotEmpty(str)) {
            throw new ZipException("input file name is emtpy or null, cannot get FileHeader");
        }
        m();
        ZipModel zipModel = this.f84892q0;
        if (zipModel == null || zipModel.getCentralDirectory() == null) {
            return null;
        }
        return HeaderUtil.getFileHeader(this.f84892q0, str);
    }

    public List<FileHeader> getFileHeaders() throws ZipException {
        m();
        ZipModel zipModel = this.f84892q0;
        return (zipModel == null || zipModel.getCentralDirectory() == null) ? Collections.emptyList() : this.f84892q0.getCentralDirectory().getFileHeaders();
    }

    public ZipInputStream getInputStream(FileHeader fileHeader) throws IOException {
        if (fileHeader == null) {
            throw new ZipException("FileHeader is null, cannot get InputStream");
        }
        m();
        ZipModel zipModel = this.f84892q0;
        if (zipModel == null) {
            throw new ZipException("zip model is null, cannot get inputstream");
        }
        ZipInputStream zipInputStreamCreateZipInputStream = UnzipUtil.createZipInputStream(zipModel, fileHeader, this.f84896u0);
        this.F0.add(zipInputStreamCreateZipInputStream);
        return zipInputStreamCreateZipInputStream;
    }

    public ProgressMonitor getProgressMonitor() {
        return this.f84894s0;
    }

    public List<File> getSplitZipFiles() throws ZipException {
        m();
        return FileUtils.getSplitZipFiles(this.f84892q0);
    }

    public boolean isEncrypted() throws ZipException {
        if (this.f84892q0 == null) {
            m();
            if (this.f84892q0 == null) {
                throw new ZipException("Zip Model is null");
            }
        }
        if (this.f84892q0.getCentralDirectory() == null || this.f84892q0.getCentralDirectory().getFileHeaders() == null) {
            throw new ZipException("invalid zip file");
        }
        for (FileHeader fileHeader : this.f84892q0.getCentralDirectory().getFileHeaders()) {
            if (fileHeader != null && fileHeader.isEncrypted()) {
                this.f84893r0 = true;
                break;
            }
        }
        return this.f84893r0;
    }

    public boolean isRunInThread() {
        return this.f84895t0;
    }

    public boolean isSplitArchive() throws ZipException {
        if (this.f84892q0 == null) {
            m();
            if (this.f84892q0 == null) {
                throw new ZipException("Zip Model is null");
            }
        }
        return this.f84892q0.isSplitArchive();
    }

    public boolean isValidZipFile() {
        if (!this.f84891p0.exists()) {
            return false;
        }
        try {
            m();
            if (!this.f84892q0.isSplitArchive()) {
                return true;
            }
            Iterator<File> it = getSplitZipFiles().iterator();
            while (it.hasNext()) {
                if (!it.next().exists()) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final RandomAccessFile l() throws IOException {
        File file = this.f84891p0;
        if (!FileUtils.isNumberedSplitFile(file)) {
            return new RandomAccessFile(file, RandomAccessFileMode.READ.getValue());
        }
        NumberedSplitRandomAccessFile numberedSplitRandomAccessFile = new NumberedSplitRandomAccessFile(file, RandomAccessFileMode.READ.getValue(), FileUtils.getAllSortedNumberedSplitFiles(file));
        numberedSplitRandomAccessFile.openLastSplitFileForReading();
        return numberedSplitRandomAccessFile;
    }

    public final void m() throws ZipException {
        if (this.f84892q0 != null) {
            return;
        }
        File file = this.f84891p0;
        if (!file.exists()) {
            ZipModel zipModel = new ZipModel();
            this.f84892q0 = zipModel;
            zipModel.setZipFile(this.f84891p0);
            return;
        }
        if (!file.canRead()) {
            throw new ZipException("no read access for the input zip file");
        }
        try {
            RandomAccessFile randomAccessFileL = l();
            try {
                ZipModel allHeaders = new HeaderReader().readAllHeaders(randomAccessFileL, e());
                this.f84892q0 = allHeaders;
                allHeaders.setZipFile(file);
                randomAccessFileL.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        randomAccessFileL.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        } catch (ZipException e5) {
            throw e5;
        } catch (IOException e7) {
            throw new ZipException(e7);
        }
    }

    public void mergeSplitFiles(File file) throws ZipException {
        if (file == null) {
            throw new ZipException("outputZipFile is null, cannot merge split files");
        }
        if (file.exists()) {
            throw new ZipException("output Zip File already exists");
        }
        m();
        ZipModel zipModel = this.f84892q0;
        if (zipModel == null) {
            throw new ZipException("zip model is null, corrupt zip file?");
        }
        new MergeSplitZipFileTask(zipModel, b()).execute(new MergeSplitZipFileTask.MergeSplitZipFileTaskParameters(file, e()));
    }

    public void removeFile(FileHeader fileHeader) throws ZipException {
        if (fileHeader == null) {
            throw new ZipException("input file header is null, cannot remove file");
        }
        removeFile(fileHeader.getFileName());
    }

    public void removeFiles(List<String> list) throws ZipException {
        if (list == null) {
            throw new ZipException("fileNames list is null");
        }
        if (list.isEmpty()) {
            return;
        }
        if (this.f84892q0 == null) {
            m();
        }
        if (this.f84892q0.isSplitArchive()) {
            throw new ZipException("Zip file format does not allow updating split/spanned files");
        }
        new RemoveFilesFromZipTask(this.f84892q0, this.v0, b()).execute(new RemoveFilesFromZipTask.RemoveFilesFromZipTaskParameters(list, e()));
    }

    public void renameFile(FileHeader fileHeader, String str) throws ZipException {
        if (fileHeader == null) {
            throw new ZipException("File header is null");
        }
        renameFile(fileHeader.getFileName(), str);
    }

    public void renameFiles(Map<String, String> map) throws ZipException {
        if (map == null) {
            throw new ZipException("fileNamesMap is null");
        }
        if (map.size() == 0) {
            return;
        }
        m();
        if (this.f84892q0.isSplitArchive()) {
            throw new ZipException("Zip file format does not allow updating split/spanned files");
        }
        AsyncZipTask.AsyncTaskParameters asyncTaskParametersB = b();
        new RenameFilesTask(this.f84892q0, this.v0, new RawIO(), asyncTaskParametersB).execute(new RenameFilesTask.RenameFilesTaskParameters(map, e()));
    }

    public void setBufferSize(int i10) {
        if (i10 < 512) {
            throw new IllegalArgumentException("Buffer size cannot be less than 512 bytes");
        }
        this.E0 = i10;
    }

    public void setCharset(Charset charset) throws IllegalArgumentException {
        if (charset == null) {
            throw new IllegalArgumentException("charset cannot be null");
        }
        this.f84897w0 = charset;
    }

    public void setComment(String str) throws ZipException {
        if (str == null) {
            throw new ZipException("input comment is null, cannot update zip file");
        }
        if (!this.f84891p0.exists()) {
            throw new ZipException("zip file does not exist, cannot set comment for zip file");
        }
        m();
        ZipModel zipModel = this.f84892q0;
        if (zipModel == null) {
            throw new ZipException("zipModel is null, cannot update zip file");
        }
        if (zipModel.getEndOfCentralDirectoryRecord() == null) {
            throw new ZipException("end of central directory is null, cannot set comment");
        }
        new SetCommentTask(this.f84892q0, b()).execute(new SetCommentTask.SetCommentTaskTaskParameters(str, e()));
    }

    public void setPassword(char[] cArr) {
        this.f84896u0 = cArr;
    }

    public void setRunInThread(boolean z10) {
        this.f84895t0 = z10;
    }

    public void setThreadFactory(ThreadFactory threadFactory) {
        this.f84898x0 = threadFactory;
    }

    public String toString() {
        return this.f84891p0.toString();
    }

    public ZipFile(String str, char[] cArr) {
        this(new File(str), cArr);
    }

    public void addFile(String str, ZipParameters zipParameters) throws ZipException {
        if (!Zip4jUtil.isStringNotNullAndNotEmpty(str)) {
            throw new ZipException("file to add is null or empty");
        }
        addFiles(Collections.singletonList(new File(str)), zipParameters);
    }

    public void addFiles(List<File> list, ZipParameters zipParameters) throws ZipException {
        if (list == null || list.size() == 0) {
            throw new ZipException("input file List is null or empty");
        }
        if (zipParameters == null) {
            throw new ZipException("input parameters are null");
        }
        m();
        if (this.f84892q0 == null) {
            throw new ZipException("internal error: zip model is null");
        }
        if (this.f84891p0.exists() && this.f84892q0.isSplitArchive()) {
            throw new ZipException("Zip file already exists. Zip file format does not allow updating split/spanned files");
        }
        new AddFilesToZipTask(this.f84892q0, this.f84896u0, this.v0, b()).execute(new AddFilesToZipTask.AddFilesToZipTaskParameters(list, zipParameters, e()));
    }

    public void addFolder(File file, ZipParameters zipParameters) throws ZipException {
        if (file == null) {
            throw new ZipException("input path is null, cannot add folder to zip file");
        }
        if (!file.exists()) {
            throw new ZipException("folder does not exist");
        }
        if (!file.isDirectory()) {
            throw new ZipException("input folder is not a directory");
        }
        if (!file.canRead()) {
            throw new ZipException("cannot read input folder");
        }
        if (zipParameters == null) {
            throw new ZipException("input parameters are null, cannot add folder to zip file");
        }
        a(file, zipParameters, true);
    }

    public void extractAll(String str, UnzipParameters unzipParameters) throws ZipException {
        if (!Zip4jUtil.isStringNotNullAndNotEmpty(str)) {
            throw new ZipException("output path is null or invalid");
        }
        if (!Zip4jUtil.createDirectoryIfNotExists(new File(str))) {
            throw new ZipException("invalid output path");
        }
        if (this.f84892q0 == null) {
            m();
        }
        ZipModel zipModel = this.f84892q0;
        if (zipModel == null) {
            throw new ZipException("Internal error occurred when extracting zip file");
        }
        new ExtractAllFilesTask(zipModel, this.f84896u0, unzipParameters, b()).execute(new ExtractAllFilesTask.ExtractAllFilesTaskParameters(str, e()));
    }

    public void extractFile(FileHeader fileHeader, String str, UnzipParameters unzipParameters) throws ZipException {
        extractFile(fileHeader, str, (String) null, unzipParameters);
    }

    public ZipFile(File file) {
        this(file, (char[]) null);
    }

    public void extractFile(FileHeader fileHeader, String str, String str2, UnzipParameters unzipParameters) throws ZipException {
        if (fileHeader != null) {
            extractFile(fileHeader.getFileName(), str, str2, unzipParameters);
            return;
        }
        throw new ZipException("input file header is null, cannot extract file");
    }

    public void removeFile(String str) throws ZipException {
        if (Zip4jUtil.isStringNotNullAndNotEmpty(str)) {
            removeFiles(Collections.singletonList(str));
            return;
        }
        throw new ZipException("file name is empty or null, cannot remove file");
    }

    public void renameFile(String str, String str2) throws ZipException {
        if (Zip4jUtil.isStringNotNullAndNotEmpty(str)) {
            if (Zip4jUtil.isStringNotNullAndNotEmpty(str2)) {
                renameFiles(Collections.singletonMap(str, str2));
                return;
            }
            throw new ZipException("newFileName is null or empty");
        }
        throw new ZipException("file name to be changed is null or empty");
    }

    public ZipFile(File file, char[] cArr) {
        this.v0 = new HeaderWriter();
        this.f84897w0 = null;
        this.E0 = 4096;
        this.F0 = new ArrayList();
        if (file != null) {
            this.f84891p0 = file;
            this.f84896u0 = cArr;
            this.f84895t0 = false;
            this.f84894s0 = new ProgressMonitor();
            return;
        }
        throw new IllegalArgumentException("input zip file parameter is null");
    }

    public void addFile(File file) throws ZipException {
        addFiles(Collections.singletonList(file), new ZipParameters());
    }

    public void extractFile(String str, String str2) throws ZipException {
        extractFile(str, str2, (String) null, new UnzipParameters());
    }

    public void addFile(File file, ZipParameters zipParameters) throws ZipException {
        addFiles(Collections.singletonList(file), zipParameters);
    }

    public void extractFile(String str, String str2, UnzipParameters unzipParameters) throws ZipException {
        extractFile(str, str2, (String) null, unzipParameters);
    }

    public void extractFile(String str, String str2, String str3) throws ZipException {
        extractFile(str, str2, str3, new UnzipParameters());
    }

    public void extractFile(FileHeader fileHeader, String str, String str2) throws ZipException {
        extractFile(fileHeader, str, str2, new UnzipParameters());
    }

    public void extractFile(String str, String str2, String str3, UnzipParameters unzipParameters) throws ZipException {
        if (Zip4jUtil.isStringNotNullAndNotEmpty(str)) {
            if (Zip4jUtil.isStringNotNullAndNotEmpty(str2)) {
                if (unzipParameters == null) {
                    unzipParameters = new UnzipParameters();
                }
                m();
                new ExtractFileTask(this.f84892q0, this.f84896u0, unzipParameters, b()).execute(new ExtractFileTask.ExtractFileTaskParameters(str2, str, str3, e()));
                return;
            }
            throw new ZipException("destination path is empty or null, cannot extract file");
        }
        throw new ZipException("file to extract is null or empty, cannot extract file");
    }
}
