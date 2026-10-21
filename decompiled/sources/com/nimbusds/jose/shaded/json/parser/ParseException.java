package com.nimbusds.jose.shaded.json.parser;

import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public class ParseException extends Exception {
    public static final int ERROR_UNEXPECTED_CHAR = 0;
    public static final int ERROR_UNEXPECTED_DUPLICATE_KEY = 5;
    public static final int ERROR_UNEXPECTED_EOF = 3;
    public static final int ERROR_UNEXPECTED_EXCEPTION = 2;
    public static final int ERROR_UNEXPECTED_LEADING_0 = 6;
    public static final int ERROR_UNEXPECTED_TOKEN = 1;
    public static final int ERROR_UNEXPECTED_UNICODE = 4;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f62806p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Object f62807q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f62808r0;

    public ParseException(int i10, int i11, Object obj) {
        super(a(i10, i11, obj));
        this.f62808r0 = i10;
        this.f62806p0 = i11;
        this.f62807q0 = obj;
    }

    public static String a(int i10, int i11, Object obj) {
        StringBuilder sb2 = new StringBuilder();
        if (i11 == 0) {
            sb2.append("Unexpected character (");
            sb2.append(obj);
            sb2.append(") at position ");
            sb2.append(i10);
            sb2.append(Constant.DOT_STRING);
        } else if (i11 == 1) {
            sb2.append("Unexpected token ");
            sb2.append(obj);
            sb2.append(" at position ");
            sb2.append(i10);
            sb2.append(Constant.DOT_STRING);
        } else if (i11 == 2) {
            sb2.append("Unexpected exception ");
            sb2.append(obj);
            sb2.append(" occur at position ");
            sb2.append(i10);
            sb2.append(Constant.DOT_STRING);
        } else if (i11 == 3) {
            sb2.append("Unexpected End Of File position ");
            sb2.append(i10);
            sb2.append(": ");
            sb2.append(obj);
        } else if (i11 == 4) {
            sb2.append("Unexpected unicode escape sequence ");
            sb2.append(obj);
            sb2.append(" at position ");
            sb2.append(i10);
            sb2.append(Constant.DOT_STRING);
        } else if (i11 == 5) {
            sb2.append("Unexpected duplicate key:");
            sb2.append(obj);
            sb2.append(" at position ");
            sb2.append(i10);
            sb2.append(Constant.DOT_STRING);
        } else if (i11 == 6) {
            sb2.append("Unexpected leading 0 in digit for token:");
            sb2.append(obj);
            sb2.append(" at position ");
            sb2.append(i10);
            sb2.append(Constant.DOT_STRING);
        } else {
            sb2.append("Unkown error at position ");
            sb2.append(i10);
            sb2.append(Constant.DOT_STRING);
        }
        return sb2.toString();
    }

    public int getErrorType() {
        return this.f62806p0;
    }

    public int getPosition() {
        return this.f62808r0;
    }

    public Object getUnexpectedObject() {
        return this.f62807q0;
    }

    public ParseException(int i10, Throwable th2) {
        super(a(i10, 2, th2), th2);
        this.f62808r0 = i10;
        this.f62806p0 = 2;
        this.f62807q0 = th2;
    }
}
