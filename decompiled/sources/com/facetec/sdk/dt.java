package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
public enum dt {
    Unknown,
    InvalidMrzKey,
    ResponseError,
    ConnectionError,
    UnknownRetry,
    IncompatibleDoc;

    /* JADX INFO: renamed from: com.facetec.sdk.dt$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f41367b;

        static {
            int[] iArr = new int[dt.values().length];
            f41367b = iArr;
            try {
                iArr[dt.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41367b[dt.InvalidMrzKey.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41367b[dt.ResponseError.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41367b[dt.ConnectionError.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41367b[dt.UnknownRetry.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41367b[dt.IncompatibleDoc.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }
}
