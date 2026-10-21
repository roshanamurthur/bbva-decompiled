package com.google.zxing;

/* JADX INFO: loaded from: classes10.dex */
public final class ChecksumException extends ReaderException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final ChecksumException f49642p0;

    static {
        ChecksumException checksumException = new ChecksumException();
        f49642p0 = checksumException;
        checksumException.setStackTrace(ReaderException.NO_TRACE);
    }

    private ChecksumException() {
    }

    public static ChecksumException getChecksumInstance() {
        return ReaderException.isStackTrace ? new ChecksumException() : f49642p0;
    }

    public static ChecksumException getChecksumInstance(Throwable th2) {
        return ReaderException.isStackTrace ? new ChecksumException(th2) : f49642p0;
    }
}
