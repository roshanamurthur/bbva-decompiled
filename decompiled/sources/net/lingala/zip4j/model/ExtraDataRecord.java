package net.lingala.zip4j.model;

/* JADX INFO: loaded from: classes12.dex */
public class ExtraDataRecord extends ZipHeader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f85034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f85036d;

    public byte[] getData() {
        return this.f85036d;
    }

    public long getHeader() {
        return this.f85034b;
    }

    public int getSizeOfData() {
        return this.f85035c;
    }

    public void setData(byte[] bArr) {
        this.f85036d = bArr;
    }

    public void setHeader(long j10) {
        this.f85034b = j10;
    }

    public void setSizeOfData(int i10) {
        this.f85035c = i10;
    }
}
