package com.bbva.sl.ar.android.sslpinning;

import android.content.Context;
import com.bbva.proguarded.android.sslpinning.c;
import com.bbva.proguarded.android.sslpinning.i;
import com.bbva.proguarded.android.sslpinning.j;
import com.bbva.proguarded.android.sslpinning.u;
import com.bbva.sl.ar.android.sslpinning.exception.InitializationException;
import com.bbva.sl.ar.android.sslpinning.result.ErrorInfo;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public class SSLPinning {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f36589a = Logger.getLogger(SSLPinning.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f36590b = j.class;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f36591c = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static SSLPinning f36592f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SSLChecker f36593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f36594e;

    private SSLPinning(Context context, int i10, boolean z10) throws InitializationException {
        String property;
        Logger logger = f36589a;
        logger.info("Initializing SSLPinning library...");
        c cVar = new c(context, i10, z10);
        this.f36594e = cVar;
        logger.fine("Loading checker ...");
        String canonicalName = i.class.getCanonicalName();
        Class<?> cls = f36590b;
        if (cVar.containsKey(canonicalName)) {
            property = cVar.getProperty(canonicalName);
        } else {
            u.f36173a.finer("Implementation class not found in params for class: ".concat(String.valueOf(canonicalName)));
            property = cls.getCanonicalName();
        }
        i iVar = (i) u.a(property);
        c cVar2 = this.f36594e;
        iVar.f36150a = cVar2.a();
        iVar.f36151b = cVar2.a("com.bbva.sl.ar.sslpinning.pinning.conntimeout", iVar.f36151b);
        iVar.f36152c = cVar2.a("com.bbva.sl.ar.sslpinning.pinning.readtimeout", iVar.f36152c);
        iVar.f36153d = cVar2.a("com.bbva.sl.ar.sslpinning.pinning.usecaches", iVar.f36153d);
        this.f36593d = iVar;
    }

    public static SSLPinning getInstance(Context context, int i10) throws InitializationException {
        return getInstance(context, i10, false);
    }

    public SSLChecker getChecker() {
        return this.f36593d;
    }

    public ErrorInfo getLastUpdateError() {
        return this.f36594e.f36134e;
    }

    public void updateCatalog() {
        this.f36594e.a(this.f36593d);
    }

    public static SSLPinning getInstance(Context context, int i10, boolean z10) throws InitializationException {
        SSLPinning sSLPinning;
        f36589a.info("Getting SSLPinning instance");
        synchronized (f36591c) {
            if (f36592f == null || z10) {
                f36592f = new SSLPinning(context, i10, z10);
            }
            f36592f.updateCatalog();
            sSLPinning = f36592f;
        }
        return sSLPinning;
    }
}
