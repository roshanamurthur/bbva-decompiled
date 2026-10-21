package com.google.zxing;

/* JADX INFO: loaded from: classes10.dex */
public final class NotFoundException extends ReaderException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final NotFoundException f49652p0;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f49652p0 = notFoundException;
        notFoundException.setStackTrace(ReaderException.NO_TRACE);
    }

    private NotFoundException() {
    }

    public static NotFoundException getNotFoundInstance() {
        return f49652p0;
    }
}
