package com.veridas.log;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.camera.camera2.internal.k;
import androidx.camera.core.impl.l;
import androidx.camera.core.impl.o;
import androidx.camera.core.impl.q;
import androidx.camera.core.p;
import androidx.camera.view.a;
import androidx.core.app.NotificationCompat;
import androidx.room.e;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.google.firebase.messaging.c;
import com.google.firebase.storage.s;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import m4.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.g;
import uf.f;

/* JADX INFO: compiled from: AndroidThreadedLogger.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J7\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\"\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0006\u0010\u000bJ\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J7\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\"\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\"\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J7\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\"\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\"\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J7\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\"\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\"\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J7\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\"\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\"\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u001a\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J7\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\"\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\"\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0015"}, d2 = {"Lcom/veridas/log/AndroidThreadedLogger;", "Lcom/veridas/log/Logger;", "", LogKeysKt.TAG, NotificationCompat.CATEGORY_MESSAGE, "", "d", "format", "", "", "arg", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "", "tr", "e", "i", SharedPrefsStorage.VERSION_KEY, "w", "wtf", "<init>", "()V", "common-core_release"}, k = 1, mv = {1, 9, 0})
public final class AndroidThreadedLogger implements Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Handler f67219a = new Handler(Looper.getMainLooper());

    @Override // com.veridas.log.Logger
    public void d(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.f67219a.post(new l(tag, msg, 4));
    }

    @Override // com.veridas.log.Logger
    public void e(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.f67219a.post(new k(tag, msg, 4));
    }

    @Override // com.veridas.log.Logger
    public void i(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.f67219a.post(new b(tag, msg));
    }

    @Override // com.veridas.log.Logger
    public void v(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.f67219a.post(new g(tag, msg, 2));
    }

    @Override // com.veridas.log.Logger
    public void w(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.f67219a.post(new q(tag, msg));
    }

    @Override // com.veridas.log.Logger
    public void wtf(@NotNull String tag, @Nullable String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f67219a.post(new o(tag, msg, 3));
    }

    @Override // com.veridas.log.Logger
    public void d(@NotNull String tag, @NotNull String format, @NotNull Object... arg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(arg, "arg");
        this.f67219a.post(new e(tag, format, arg));
    }

    @Override // com.veridas.log.Logger
    public void e(@NotNull String tag, @NotNull String format, @NotNull Object... arg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(arg, "arg");
        this.f67219a.post(new s(tag, format, 1, arg));
    }

    @Override // com.veridas.log.Logger
    public void i(@NotNull String tag, @NotNull String format, @NotNull Object... arg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(arg, "arg");
        this.f67219a.post(new com.appsflyer.internal.g(tag, format, arg));
    }

    @Override // com.veridas.log.Logger
    public void v(@NotNull final String tag, @NotNull final String format, @NotNull final Object... arg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(arg, "arg");
        this.f67219a.post(new Runnable() { // from class: cj.c
            @Override // java.lang.Runnable
            public final void run() {
                String tag2 = tag;
                Intrinsics.checkNotNullParameter(tag2, "$tag");
                String format2 = format;
                Intrinsics.checkNotNullParameter(format2, "$format");
                Object[] arg2 = arg;
                Intrinsics.checkNotNullParameter(arg2, "$arg");
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(arg2, arg2.length);
                Intrinsics.checkNotNullExpressionValue(String.format(format2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)), "format(...)");
            }
        });
    }

    @Override // com.veridas.log.Logger
    public void w(@NotNull String tag, @NotNull String format, @NotNull Object... arg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(arg, "arg");
        this.f67219a.post(new h2.o(tag, format, 3, arg));
    }

    @Override // com.veridas.log.Logger
    public void wtf(@NotNull String tag, @NotNull String format, @NotNull Object... arg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(arg, "arg");
        this.f67219a.post(new f(tag, format, 1, arg));
    }

    @Override // com.veridas.log.Logger
    public void d(@NotNull String tag, @Nullable String msg, @NotNull Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(tr, "tr");
        this.f67219a.post(new c(tag, msg, 1, tr));
    }

    @Override // com.veridas.log.Logger
    public void e(@NotNull String tag, @Nullable String msg, @NotNull Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(tr, "tr");
        this.f67219a.post(new v2.e(tag, msg, 2, tr));
    }

    @Override // com.veridas.log.Logger
    public void i(@NotNull String tag, @Nullable String msg, @NotNull Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(tr, "tr");
        this.f67219a.post(new androidx.room.c(tag, msg, tr));
    }

    @Override // com.veridas.log.Logger
    public void v(@NotNull final String tag, @Nullable final String msg, @NotNull final Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(tr, "tr");
        this.f67219a.post(new Runnable(tag, msg, tr) { // from class: cj.d

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ String f25444p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Throwable f25445q0;

            {
                this.f25445q0 = tr;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String tag2 = this.f25444p0;
                Intrinsics.checkNotNullParameter(tag2, "$tag");
                Throwable tr2 = this.f25445q0;
                Intrinsics.checkNotNullParameter(tr2, "$tr");
            }
        });
    }

    @Override // com.veridas.log.Logger
    public void w(@NotNull final String tag, @Nullable final String msg, @NotNull final Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(tr, "tr");
        this.f67219a.post(new Runnable() { // from class: cj.b
            @Override // java.lang.Runnable
            public final void run() {
                String tag2 = tag;
                Intrinsics.checkNotNullParameter(tag2, "$tag");
                Throwable tr2 = tr;
                Intrinsics.checkNotNullParameter(tr2, "$tr");
                Log.w(tag2, msg, tr2);
            }
        });
    }

    @Override // com.veridas.log.Logger
    public void wtf(@NotNull String tag, @Nullable String msg, @NotNull Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(tr, "tr");
        this.f67219a.post(new com.appsflyer.internal.f(tag, msg, tr));
    }

    @Override // com.veridas.log.Logger
    public void w(@NotNull String tag, @NotNull Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(tr, "tr");
        this.f67219a.post(new p(tag, tr, 2));
    }

    @Override // com.veridas.log.Logger
    public void wtf(@NotNull String tag, @NotNull Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(tr, "tr");
        this.f67219a.post(new a(tag, tr, 5));
    }
}
