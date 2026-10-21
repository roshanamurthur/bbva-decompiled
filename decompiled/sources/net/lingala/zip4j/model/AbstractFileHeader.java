package net.lingala.zip4j.model;

import java.util.List;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;
import net.lingala.zip4j.util.Zip4jUtil;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractFileHeader extends ZipHeader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f85001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CompressionMethod f85002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f85003e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f85007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f85008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f85009k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f85010l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f85011n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Zip64ExtendedInfo f85012o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AESExtraDataRecord f85013p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f85014q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List<ExtraDataRecord> f85015r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f85016s;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f85004f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f85005g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f85006h = 0;
    public EncryptionMethod m = EncryptionMethod.NONE;

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof AbstractFileHeader)) {
            return getFileName().equals(((AbstractFileHeader) obj).getFileName());
        }
        return false;
    }

    public AESExtraDataRecord getAesExtraDataRecord() {
        return this.f85013p;
    }

    public long getCompressedSize() {
        return this.f85005g;
    }

    public CompressionMethod getCompressionMethod() {
        return this.f85002d;
    }

    public long getCrc() {
        return this.f85004f;
    }

    public EncryptionMethod getEncryptionMethod() {
        return this.m;
    }

    public List<ExtraDataRecord> getExtraDataRecords() {
        return this.f85015r;
    }

    public int getExtraFieldLength() {
        return this.f85008j;
    }

    public String getFileName() {
        return this.f85009k;
    }

    public int getFileNameLength() {
        return this.f85007i;
    }

    public byte[] getGeneralPurposeFlag() {
        return this.f85001c;
    }

    public long getLastModifiedTime() {
        return this.f85003e;
    }

    public long getLastModifiedTimeEpoch() {
        return Zip4jUtil.dosToExtendedEpochTme(this.f85003e);
    }

    public long getUncompressedSize() {
        return this.f85006h;
    }

    public int getVersionNeededToExtract() {
        return this.f85000b;
    }

    public Zip64ExtendedInfo getZip64ExtendedInfo() {
        return this.f85012o;
    }

    public boolean isDataDescriptorExists() {
        return this.f85011n;
    }

    public boolean isDirectory() {
        return this.f85016s;
    }

    public boolean isEncrypted() {
        return this.f85010l;
    }

    public boolean isFileNameUTF8Encoded() {
        return this.f85014q;
    }

    public void setAesExtraDataRecord(AESExtraDataRecord aESExtraDataRecord) {
        this.f85013p = aESExtraDataRecord;
    }

    public void setCompressedSize(long j10) {
        this.f85005g = j10;
    }

    public void setCompressionMethod(CompressionMethod compressionMethod) {
        this.f85002d = compressionMethod;
    }

    public void setCrc(long j10) {
        this.f85004f = j10;
    }

    public void setDataDescriptorExists(boolean z10) {
        this.f85011n = z10;
    }

    public void setDirectory(boolean z10) {
        this.f85016s = z10;
    }

    public void setEncrypted(boolean z10) {
        this.f85010l = z10;
    }

    public void setEncryptionMethod(EncryptionMethod encryptionMethod) {
        this.m = encryptionMethod;
    }

    public void setExtraDataRecords(List<ExtraDataRecord> list) {
        this.f85015r = list;
    }

    public void setExtraFieldLength(int i10) {
        this.f85008j = i10;
    }

    public void setFileName(String str) {
        this.f85009k = str;
    }

    public void setFileNameLength(int i10) {
        this.f85007i = i10;
    }

    public void setFileNameUTF8Encoded(boolean z10) {
        this.f85014q = z10;
    }

    public void setGeneralPurposeFlag(byte[] bArr) {
        this.f85001c = bArr;
    }

    public void setLastModifiedTime(long j10) {
        this.f85003e = j10;
    }

    public void setUncompressedSize(long j10) {
        this.f85006h = j10;
    }

    public void setVersionNeededToExtract(int i10) {
        this.f85000b = i10;
    }

    public void setZip64ExtendedInfo(Zip64ExtendedInfo zip64ExtendedInfo) {
        this.f85012o = zip64ExtendedInfo;
    }
}
