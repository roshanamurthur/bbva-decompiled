package net.lingala.zip4j.model;

import net.lingala.zip4j.headers.HeaderSignature;

/* JADX INFO: loaded from: classes12.dex */
public class EndOfCentralDirectoryRecord extends ZipHeader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f85029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f85031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f85032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f85033i = "";

    public EndOfCentralDirectoryRecord() {
        setSignature(HeaderSignature.END_OF_CENTRAL_DIRECTORY);
    }

    public String getComment() {
        return this.f85033i;
    }

    public int getNumberOfThisDisk() {
        return this.f85026b;
    }

    public int getNumberOfThisDiskStartOfCentralDir() {
        return this.f85027c;
    }

    public long getOffsetOfEndOfCentralDirectory() {
        return this.f85032h;
    }

    public long getOffsetOfStartOfCentralDirectory() {
        return this.f85031g;
    }

    public int getSizeOfCentralDirectory() {
        return this.f85030f;
    }

    public int getTotalNumberOfEntriesInCentralDirectory() {
        return this.f85029e;
    }

    public int getTotalNumberOfEntriesInCentralDirectoryOnThisDisk() {
        return this.f85028d;
    }

    public void setComment(String str) {
        if (str != null) {
            this.f85033i = str;
        }
    }

    public void setNumberOfThisDisk(int i10) {
        this.f85026b = i10;
    }

    public void setNumberOfThisDiskStartOfCentralDir(int i10) {
        this.f85027c = i10;
    }

    public void setOffsetOfEndOfCentralDirectory(long j10) {
        this.f85032h = j10;
    }

    public void setOffsetOfStartOfCentralDirectory(long j10) {
        this.f85031g = j10;
    }

    public void setSizeOfCentralDirectory(int i10) {
        this.f85030f = i10;
    }

    public void setTotalNumberOfEntriesInCentralDirectory(int i10) {
        this.f85029e = i10;
    }

    public void setTotalNumberOfEntriesInCentralDirectoryOnThisDisk(int i10) {
        this.f85028d = i10;
    }
}
