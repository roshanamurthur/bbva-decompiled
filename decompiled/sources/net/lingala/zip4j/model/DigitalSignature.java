package net.lingala.zip4j.model;

/* JADX INFO: loaded from: classes12.dex */
public class DigitalSignature extends ZipHeader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f85025c;

    public String getSignatureData() {
        return this.f85025c;
    }

    public int getSizeOfData() {
        return this.f85024b;
    }

    public void setSignatureData(String str) {
        this.f85025c = str;
    }

    public void setSizeOfData(int i10) {
        this.f85024b = i10;
    }
}
