package com.google.zxing.client.result;

import androidx.core.net.MailTo;

/* JADX INFO: loaded from: classes10.dex */
public final class EmailAddressParsedResult extends ParsedResult {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f49730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f49731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f49732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f49733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f49734f;

    public EmailAddressParsedResult(String[] strArr, String[] strArr2, String[] strArr3, String str, String str2) {
        super(ParsedResultType.EMAIL_ADDRESS);
        this.f49730b = strArr;
        this.f49731c = strArr2;
        this.f49732d = strArr3;
        this.f49733e = str;
        this.f49734f = str2;
    }

    public String[] getBCCs() {
        return this.f49732d;
    }

    public String getBody() {
        return this.f49734f;
    }

    public String[] getCCs() {
        return this.f49731c;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb2 = new StringBuilder(30);
        ParsedResult.maybeAppend(this.f49730b, sb2);
        ParsedResult.maybeAppend(this.f49731c, sb2);
        ParsedResult.maybeAppend(this.f49732d, sb2);
        ParsedResult.maybeAppend(this.f49733e, sb2);
        ParsedResult.maybeAppend(this.f49734f, sb2);
        return sb2.toString();
    }

    @Deprecated
    public String getEmailAddress() {
        String[] strArr = this.f49730b;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return strArr[0];
    }

    @Deprecated
    public String getMailtoURI() {
        return MailTo.MAILTO_SCHEME;
    }

    public String getSubject() {
        return this.f49733e;
    }

    public String[] getTos() {
        return this.f49730b;
    }
}
