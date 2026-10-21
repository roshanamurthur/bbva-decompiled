package net.lingala.zip4j.model;

import net.lingala.zip4j.model.enums.AesKeyStrength;
import net.lingala.zip4j.model.enums.AesVersion;
import net.lingala.zip4j.model.enums.CompressionLevel;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;

/* JADX INFO: loaded from: classes12.dex */
public class ZipParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CompressionMethod f85078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CompressionLevel f85079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EncryptionMethod f85081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f85082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f85083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AesKeyStrength f85084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AesVersion f85085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f85086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f85087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f85088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f85089l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f85090n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f85091o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f85092p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f85093q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f85094r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SymbolicLinkAction f85095s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ExcludeFileFilter f85096t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f85097u;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SymbolicLinkAction {
        private static final /* synthetic */ SymbolicLinkAction[] $VALUES;
        public static final SymbolicLinkAction INCLUDE_LINKED_FILE_ONLY;
        public static final SymbolicLinkAction INCLUDE_LINK_AND_LINKED_FILE;
        public static final SymbolicLinkAction INCLUDE_LINK_ONLY;

        static {
            SymbolicLinkAction symbolicLinkAction = new SymbolicLinkAction("INCLUDE_LINK_ONLY", 0);
            INCLUDE_LINK_ONLY = symbolicLinkAction;
            SymbolicLinkAction symbolicLinkAction2 = new SymbolicLinkAction("INCLUDE_LINKED_FILE_ONLY", 1);
            INCLUDE_LINKED_FILE_ONLY = symbolicLinkAction2;
            SymbolicLinkAction symbolicLinkAction3 = new SymbolicLinkAction("INCLUDE_LINK_AND_LINKED_FILE", 2);
            INCLUDE_LINK_AND_LINKED_FILE = symbolicLinkAction3;
            $VALUES = new SymbolicLinkAction[]{symbolicLinkAction, symbolicLinkAction2, symbolicLinkAction3};
        }

        public SymbolicLinkAction() {
            throw null;
        }

        public static SymbolicLinkAction valueOf(String str) {
            return (SymbolicLinkAction) Enum.valueOf(SymbolicLinkAction.class, str);
        }

        public static SymbolicLinkAction[] values() {
            return (SymbolicLinkAction[]) $VALUES.clone();
        }
    }

    public ZipParameters() {
        this.f85078a = CompressionMethod.DEFLATE;
        this.f85079b = CompressionLevel.NORMAL;
        this.f85080c = false;
        this.f85081d = EncryptionMethod.NONE;
        this.f85082e = true;
        this.f85083f = true;
        this.f85084g = AesKeyStrength.KEY_STRENGTH_256;
        this.f85085h = AesVersion.TWO;
        this.f85086i = true;
        this.m = System.currentTimeMillis();
        this.f85090n = -1L;
        this.f85091o = true;
        this.f85092p = true;
        this.f85095s = SymbolicLinkAction.INCLUDE_LINKED_FILE_ONLY;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public AesKeyStrength getAesKeyStrength() {
        return this.f85084g;
    }

    public AesVersion getAesVersion() {
        return this.f85085h;
    }

    public CompressionLevel getCompressionLevel() {
        return this.f85079b;
    }

    public CompressionMethod getCompressionMethod() {
        return this.f85078a;
    }

    public String getDefaultFolderPath() {
        return this.f85088k;
    }

    public EncryptionMethod getEncryptionMethod() {
        return this.f85081d;
    }

    public long getEntryCRC() {
        return this.f85087j;
    }

    public long getEntrySize() {
        return this.f85090n;
    }

    public ExcludeFileFilter getExcludeFileFilter() {
        return this.f85096t;
    }

    public String getFileComment() {
        return this.f85094r;
    }

    public String getFileNameInZip() {
        return this.f85089l;
    }

    public long getLastModifiedFileTime() {
        return this.m;
    }

    public String getRootFolderNameInZip() {
        return this.f85093q;
    }

    public SymbolicLinkAction getSymbolicLinkAction() {
        return this.f85095s;
    }

    public boolean isEncryptFiles() {
        return this.f85080c;
    }

    public boolean isIncludeRootFolder() {
        return this.f85086i;
    }

    public boolean isOverrideExistingFilesInZip() {
        return this.f85092p;
    }

    public boolean isReadHiddenFiles() {
        return this.f85082e;
    }

    public boolean isReadHiddenFolders() {
        return this.f85083f;
    }

    public boolean isUnixMode() {
        return this.f85097u;
    }

    public boolean isWriteExtendedLocalFileHeader() {
        return this.f85091o;
    }

    public void setAesKeyStrength(AesKeyStrength aesKeyStrength) {
        this.f85084g = aesKeyStrength;
    }

    public void setAesVersion(AesVersion aesVersion) {
        this.f85085h = aesVersion;
    }

    public void setCompressionLevel(CompressionLevel compressionLevel) {
        this.f85079b = compressionLevel;
    }

    public void setCompressionMethod(CompressionMethod compressionMethod) {
        this.f85078a = compressionMethod;
    }

    public void setDefaultFolderPath(String str) {
        this.f85088k = str;
    }

    public void setEncryptFiles(boolean z10) {
        this.f85080c = z10;
    }

    public void setEncryptionMethod(EncryptionMethod encryptionMethod) {
        this.f85081d = encryptionMethod;
    }

    public void setEntryCRC(long j10) {
        this.f85087j = j10;
    }

    public void setEntrySize(long j10) {
        this.f85090n = j10;
    }

    public void setExcludeFileFilter(ExcludeFileFilter excludeFileFilter) {
        this.f85096t = excludeFileFilter;
    }

    public void setFileComment(String str) {
        this.f85094r = str;
    }

    public void setFileNameInZip(String str) {
        this.f85089l = str;
    }

    public void setIncludeRootFolder(boolean z10) {
        this.f85086i = z10;
    }

    public void setLastModifiedFileTime(long j10) {
        if (j10 <= 0) {
            return;
        }
        this.m = j10;
    }

    public void setOverrideExistingFilesInZip(boolean z10) {
        this.f85092p = z10;
    }

    public void setReadHiddenFiles(boolean z10) {
        this.f85082e = z10;
    }

    public void setReadHiddenFolders(boolean z10) {
        this.f85083f = z10;
    }

    public void setRootFolderNameInZip(String str) {
        this.f85093q = str;
    }

    public void setSymbolicLinkAction(SymbolicLinkAction symbolicLinkAction) {
        this.f85095s = symbolicLinkAction;
    }

    public void setUnixMode(boolean z10) {
        this.f85097u = z10;
    }

    public void setWriteExtendedLocalFileHeader(boolean z10) {
        this.f85091o = z10;
    }

    public ZipParameters(ZipParameters zipParameters) {
        this.f85078a = CompressionMethod.DEFLATE;
        this.f85079b = CompressionLevel.NORMAL;
        this.f85080c = false;
        this.f85081d = EncryptionMethod.NONE;
        this.f85082e = true;
        this.f85083f = true;
        this.f85084g = AesKeyStrength.KEY_STRENGTH_256;
        this.f85085h = AesVersion.TWO;
        this.f85086i = true;
        this.m = System.currentTimeMillis();
        this.f85090n = -1L;
        this.f85091o = true;
        this.f85092p = true;
        this.f85095s = SymbolicLinkAction.INCLUDE_LINKED_FILE_ONLY;
        this.f85078a = zipParameters.getCompressionMethod();
        this.f85079b = zipParameters.getCompressionLevel();
        this.f85080c = zipParameters.isEncryptFiles();
        this.f85081d = zipParameters.getEncryptionMethod();
        this.f85082e = zipParameters.isReadHiddenFiles();
        this.f85083f = zipParameters.isReadHiddenFolders();
        this.f85084g = zipParameters.getAesKeyStrength();
        this.f85085h = zipParameters.getAesVersion();
        this.f85086i = zipParameters.isIncludeRootFolder();
        this.f85087j = zipParameters.getEntryCRC();
        this.f85088k = zipParameters.getDefaultFolderPath();
        this.f85089l = zipParameters.getFileNameInZip();
        this.m = zipParameters.getLastModifiedFileTime();
        this.f85090n = zipParameters.getEntrySize();
        this.f85091o = zipParameters.isWriteExtendedLocalFileHeader();
        this.f85092p = zipParameters.isOverrideExistingFilesInZip();
        this.f85093q = zipParameters.getRootFolderNameInZip();
        this.f85094r = zipParameters.getFileComment();
        this.f85095s = zipParameters.getSymbolicLinkAction();
        this.f85096t = zipParameters.getExcludeFileFilter();
        this.f85097u = zipParameters.isUnixMode();
    }
}
