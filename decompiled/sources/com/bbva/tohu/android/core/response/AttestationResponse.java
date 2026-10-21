package com.bbva.tohu.android.core.response;

/* JADX INFO: loaded from: classes6.dex */
public class AttestationResponse {
    private String[] apkCertificateDigestSha256;
    private String apkDigestSha256;
    private String apkPackageName;
    private Boolean basicIntegrity;
    private Boolean ctsProfileMatch;
    private String error;
    private String nonce;
    private Long timestampMs;

    public String[] getApkCertificateDigestSha256() {
        return this.apkCertificateDigestSha256;
    }

    public String getApkDigestSha256() {
        return this.apkDigestSha256;
    }

    public String getApkPackageName() {
        return this.apkPackageName;
    }

    public Boolean getBasicIntegrity() {
        return this.basicIntegrity;
    }

    public Boolean getCtsProfileMatch() {
        return this.ctsProfileMatch;
    }

    public String getError() {
        return this.error;
    }

    public String getNonce() {
        return this.nonce;
    }

    public Long getTimestampMs() {
        return this.timestampMs;
    }

    public void setApkCertificateDigestSha256(String[] strArr) {
        this.apkCertificateDigestSha256 = strArr;
    }

    public void setApkDigestSha256(String str) {
        this.apkDigestSha256 = str;
    }

    public void setApkPackageName(String str) {
        this.apkPackageName = str;
    }

    public void setBasicIntegrity(Boolean bool) {
        this.basicIntegrity = bool;
    }

    public void setCtsProfileMatch(Boolean bool) {
        this.ctsProfileMatch = bool;
    }

    public void setError(String str) {
        this.error = str;
    }

    public void setNonce(String str) {
        this.nonce = str;
    }

    public void setTimestampMs(Long l6) {
        this.timestampMs = l6;
    }
}
