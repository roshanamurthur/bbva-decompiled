package com.google.zxing;

/* JADX INFO: loaded from: classes10.dex */
public final class FormatException extends ReaderException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final FormatException f49645p0;

    static {
        FormatException formatException = new FormatException();
        f49645p0 = formatException;
        formatException.setStackTrace(ReaderException.NO_TRACE);
    }

    private FormatException() {
    }

    public static FormatException getFormatInstance() {
        return ReaderException.isStackTrace ? new FormatException() : f49645p0;
    }

    public static FormatException getFormatInstance(Throwable th2) {
        return ReaderException.isStackTrace ? new FormatException(th2) : f49645p0;
    }
}
