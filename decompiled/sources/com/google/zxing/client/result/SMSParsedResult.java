package com.google.zxing.client.result;

import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public final class SMSParsedResult extends ParsedResult {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f49764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f49765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f49766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f49767e;

    public SMSParsedResult(String str, String str2, String str3, String str4) {
        super(ParsedResultType.SMS);
        this.f49764b = new String[]{str};
        this.f49765c = new String[]{str2};
        this.f49766d = str3;
        this.f49767e = str4;
    }

    public String getBody() {
        return this.f49767e;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb2 = new StringBuilder(100);
        ParsedResult.maybeAppend(this.f49764b, sb2);
        ParsedResult.maybeAppend(this.f49766d, sb2);
        ParsedResult.maybeAppend(this.f49767e, sb2);
        return sb2.toString();
    }

    public String[] getNumbers() {
        return this.f49764b;
    }

    public String getSMSURI() {
        StringBuilder sb2 = new StringBuilder("sms:");
        boolean z10 = true;
        int i10 = 0;
        while (true) {
            String[] strArr = this.f49764b;
            if (i10 >= strArr.length) {
                break;
            }
            if (z10) {
                z10 = false;
            } else {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            sb2.append(strArr[i10]);
            String[] strArr2 = this.f49765c;
            if (strArr2 != null && strArr2[i10] != null) {
                sb2.append(";via=");
                sb2.append(strArr2[i10]);
            }
            i10++;
        }
        String str = this.f49767e;
        boolean z11 = str != null;
        String str2 = this.f49766d;
        boolean z12 = str2 != null;
        if (z11 || z12) {
            sb2.append('?');
            if (z11) {
                sb2.append("body=");
                sb2.append(str);
            }
            if (z12) {
                if (z11) {
                    sb2.append(Typography.amp);
                }
                sb2.append("subject=");
                sb2.append(str2);
            }
        }
        return sb2.toString();
    }

    public String getSubject() {
        return this.f49766d;
    }

    public String[] getVias() {
        return this.f49765c;
    }

    public SMSParsedResult(String[] strArr, String[] strArr2, String str, String str2) {
        super(ParsedResultType.SMS);
        this.f49764b = strArr;
        this.f49765c = strArr2;
        this.f49766d = str;
        this.f49767e = str2;
    }
}
