package net.lingala.zip4j.model;

/* JADX INFO: loaded from: classes12.dex */
public class ArchiveExtraDataRecord extends ZipHeader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f85018c;

    public String getExtraFieldData() {
        return this.f85018c;
    }

    public int getExtraFieldLength() {
        return this.f85017b;
    }

    public void setExtraFieldData(String str) {
        this.f85018c = str;
    }

    public void setExtraFieldLength(int i10) {
        this.f85017b = i10;
    }
}
