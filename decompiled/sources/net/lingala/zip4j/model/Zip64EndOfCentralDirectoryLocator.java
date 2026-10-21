package net.lingala.zip4j.model;

/* JADX INFO: loaded from: classes12.dex */
public class Zip64EndOfCentralDirectoryLocator extends ZipHeader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f85051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85052d;

    public int getNumberOfDiskStartOfZip64EndOfCentralDirectoryRecord() {
        return this.f85050b;
    }

    public long getOffsetZip64EndOfCentralDirectoryRecord() {
        return this.f85051c;
    }

    public int getTotalNumberOfDiscs() {
        return this.f85052d;
    }

    public void setNumberOfDiskStartOfZip64EndOfCentralDirectoryRecord(int i10) {
        this.f85050b = i10;
    }

    public void setOffsetZip64EndOfCentralDirectoryRecord(long j10) {
        this.f85051c = j10;
    }

    public void setTotalNumberOfDiscs(int i10) {
        this.f85052d = i10;
    }
}
