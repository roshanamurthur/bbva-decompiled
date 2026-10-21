package net.lingala.zip4j.model;

import java.util.Objects;
import net.lingala.zip4j.headers.HeaderSignature;

/* JADX INFO: loaded from: classes12.dex */
public class FileHeader extends AbstractFileHeader {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f85037t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f85038u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f85039v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte[] f85040w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public byte[] f85041x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f85042y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f85043z;

    public FileHeader() {
        setSignature(HeaderSignature.CENTRAL_DIRECTORY);
    }

    @Override // net.lingala.zip4j.model.AbstractFileHeader
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        FileHeader fileHeader = (FileHeader) obj;
        return (getZip64ExtendedInfo() != null ? getZip64ExtendedInfo().getOffsetLocalHeader() : getOffsetLocalHeader()) == (fileHeader.getZip64ExtendedInfo() != null ? fileHeader.getZip64ExtendedInfo().getOffsetLocalHeader() : fileHeader.getOffsetLocalHeader());
    }

    public int getDiskNumberStart() {
        return this.f85039v;
    }

    public byte[] getExternalFileAttributes() {
        return this.f85041x;
    }

    public String getFileComment() {
        return this.f85043z;
    }

    public int getFileCommentLength() {
        return this.f85038u;
    }

    public byte[] getInternalFileAttributes() {
        return this.f85040w;
    }

    public long getOffsetLocalHeader() {
        return this.f85042y;
    }

    public int getVersionMadeBy() {
        return this.f85037t;
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = getFileName();
        objArr[1] = Long.valueOf(getZip64ExtendedInfo() != null ? getZip64ExtendedInfo().getOffsetLocalHeader() : getOffsetLocalHeader());
        return Objects.hash(objArr);
    }

    public void setDiskNumberStart(int i10) {
        this.f85039v = i10;
    }

    public void setExternalFileAttributes(byte[] bArr) {
        this.f85041x = bArr;
    }

    public void setFileComment(String str) {
        this.f85043z = str;
    }

    public void setFileCommentLength(int i10) {
        this.f85038u = i10;
    }

    public void setInternalFileAttributes(byte[] bArr) {
        this.f85040w = bArr;
    }

    public void setOffsetLocalHeader(long j10) {
        this.f85042y = j10;
    }

    public void setVersionMadeBy(int i10) {
        this.f85037t = i10;
    }

    public String toString() {
        return getFileName();
    }
}
