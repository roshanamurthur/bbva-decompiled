package net.lingala.zip4j.model;

import net.lingala.zip4j.headers.HeaderSignature;

/* JADX INFO: loaded from: classes12.dex */
public class LocalFileHeader extends AbstractFileHeader {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte[] f85044t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f85045u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f85046v;

    public LocalFileHeader() {
        setSignature(HeaderSignature.LOCAL_FILE_HEADER);
    }

    public byte[] getExtraField() {
        return this.f85044t;
    }

    public long getOffsetStartOfData() {
        return this.f85045u;
    }

    public boolean isWriteCompressedSizeInZip64ExtraRecord() {
        return this.f85046v;
    }

    public void setExtraField(byte[] bArr) {
        this.f85044t = bArr;
    }

    public void setOffsetStartOfData(long j10) {
        this.f85045u = j10;
    }

    public void setWriteCompressedSizeInZip64ExtraRecord(boolean z10) {
        this.f85046v = z10;
    }
}
