package net.lingala.zip4j.model;

/* JADX INFO: loaded from: classes12.dex */
public class Zip64ExtendedInfo extends ZipHeader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f85064c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f85065d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f85066e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85067f = -1;

    public long getCompressedSize() {
        return this.f85064c;
    }

    public int getDiskNumberStart() {
        return this.f85067f;
    }

    public long getOffsetLocalHeader() {
        return this.f85066e;
    }

    public int getSize() {
        return this.f85063b;
    }

    public long getUncompressedSize() {
        return this.f85065d;
    }

    public void setCompressedSize(long j10) {
        this.f85064c = j10;
    }

    public void setDiskNumberStart(int i10) {
        this.f85067f = i10;
    }

    public void setOffsetLocalHeader(long j10) {
        this.f85066e = j10;
    }

    public void setSize(int i10) {
        this.f85063b = i10;
    }

    public void setUncompressedSize(long j10) {
        this.f85065d = j10;
    }
}
