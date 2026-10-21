package net.lingala.zip4j.model;

/* JADX INFO: loaded from: classes12.dex */
public class DataDescriptor extends ZipHeader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f85021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f85022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f85023d;

    public long getCompressedSize() {
        return this.f85022c;
    }

    public long getCrc() {
        return this.f85021b;
    }

    public long getUncompressedSize() {
        return this.f85023d;
    }

    public void setCompressedSize(long j10) {
        this.f85022c = j10;
    }

    public void setCrc(long j10) {
        this.f85021b = j10;
    }

    public void setUncompressedSize(long j10) {
        this.f85023d = j10;
    }
}
