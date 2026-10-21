package net.lingala.zip4j.model;

import net.lingala.zip4j.headers.HeaderSignature;
import net.lingala.zip4j.model.enums.AesKeyStrength;
import net.lingala.zip4j.model.enums.AesVersion;
import net.lingala.zip4j.model.enums.CompressionMethod;

/* JADX INFO: loaded from: classes12.dex */
public class AESExtraDataRecord extends ZipHeader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AesVersion f84996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f84997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AesKeyStrength f84998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CompressionMethod f84999f;

    public AESExtraDataRecord() {
        setSignature(HeaderSignature.AES_EXTRA_DATA_RECORD);
        this.f84995b = 7;
        this.f84996c = AesVersion.TWO;
        this.f84997d = "AE";
        this.f84998e = AesKeyStrength.KEY_STRENGTH_256;
        this.f84999f = CompressionMethod.DEFLATE;
    }

    public AesKeyStrength getAesKeyStrength() {
        return this.f84998e;
    }

    public AesVersion getAesVersion() {
        return this.f84996c;
    }

    public CompressionMethod getCompressionMethod() {
        return this.f84999f;
    }

    public int getDataSize() {
        return this.f84995b;
    }

    public String getVendorID() {
        return this.f84997d;
    }

    public void setAesKeyStrength(AesKeyStrength aesKeyStrength) {
        this.f84998e = aesKeyStrength;
    }

    public void setAesVersion(AesVersion aesVersion) {
        this.f84996c = aesVersion;
    }

    public void setCompressionMethod(CompressionMethod compressionMethod) {
        this.f84999f = compressionMethod;
    }

    public void setDataSize(int i10) {
        this.f84995b = i10;
    }

    public void setVendorID(String str) {
        this.f84997d = str;
    }
}
