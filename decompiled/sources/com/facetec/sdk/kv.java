package com.facetec.sdk;

import java.io.IOException;
import java.net.Socket;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes9.dex */
public abstract class kv {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static kv f42195e;

    public abstract void a(kb kbVar, SSLSocket sSLSocket, boolean z10);

    public abstract int b(kq.d dVar);

    public abstract ll b(kd kdVar);

    @Nullable
    public abstract IOException b(jw jwVar, @Nullable IOException iOException);

    public abstract void b(kd kdVar, lm lmVar);

    public abstract void b(kj.d dVar, String str, String str2);

    public abstract boolean c(kd kdVar, lm lmVar);

    public abstract void d(kj.d dVar, String str);

    public abstract lm e(kd kdVar, jr jrVar, lj ljVar, kx kxVar);

    public abstract Socket e(kd kdVar, jr jrVar, lj ljVar);

    public abstract boolean e(jr jrVar, jr jrVar2);
}
