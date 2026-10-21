package net.lingala.zip4j.model;

/* JADX INFO: loaded from: classes12.dex */
public class Zip64EndOfCentralDirectoryRecord extends ZipHeader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f85053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f85056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f85058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f85059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f85060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f85061j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f85062k;

    public byte[] getExtensibleDataSector() {
        return this.f85062k;
    }

    public int getNumberOfThisDisk() {
        return this.f85056e;
    }

    public int getNumberOfThisDiskStartOfCentralDirectory() {
        return this.f85057f;
    }

    public long getOffsetStartCentralDirectoryWRTStartDiskNumber() {
        return this.f85061j;
    }

    public long getSizeOfCentralDirectory() {
        return this.f85060i;
    }

    public long getSizeOfZip64EndCentralDirectoryRecord() {
        return this.f85053b;
    }

    public long getTotalNumberOfEntriesInCentralDirectory() {
        return this.f85059h;
    }

    public long getTotalNumberOfEntriesInCentralDirectoryOnThisDisk() {
        return this.f85058g;
    }

    public int getVersionMadeBy() {
        return this.f85054c;
    }

    public int getVersionNeededToExtract() {
        return this.f85055d;
    }

    public void setExtensibleDataSector(byte[] bArr) {
        this.f85062k = bArr;
    }

    public void setNumberOfThisDisk(int i10) {
        this.f85056e = i10;
    }

    public void setNumberOfThisDiskStartOfCentralDirectory(int i10) {
        this.f85057f = i10;
    }

    public void setOffsetStartCentralDirectoryWRTStartDiskNumber(long j10) {
        this.f85061j = j10;
    }

    public void setSizeOfCentralDirectory(long j10) {
        this.f85060i = j10;
    }

    public void setSizeOfZip64EndCentralDirectoryRecord(long j10) {
        this.f85053b = j10;
    }

    public void setTotalNumberOfEntriesInCentralDirectory(long j10) {
        this.f85059h = j10;
    }

    public void setTotalNumberOfEntriesInCentralDirectoryOnThisDisk(long j10) {
        this.f85058g = j10;
    }

    public void setVersionMadeBy(int i10) {
        this.f85054c = i10;
    }

    public void setVersionNeededToExtract(int i10) {
        this.f85055d = i10;
    }
}
