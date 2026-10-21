package com.mastercard.sonic.utils;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SingletonHolder.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00002\u00020\u0003B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/mastercard/sonic/utils/SingletonHolder;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "", "arg", "getInstance", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "creator", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public class SingletonHolder<T, A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Function1<? super A, ? extends T> f51583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public volatile T f51584b;

    public SingletonHolder(@NotNull Function1<? super A, ? extends T> creator) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        this.f51583a = creator;
    }

    public final T getInstance(A arg) {
        T t10 = this.f51584b;
        if (t10 == null) {
            synchronized (this) {
                t10 = this.f51584b;
                if (t10 == null) {
                    Function1<? super A, ? extends T> function1 = this.f51583a;
                    Intrinsics.checkNotNull(function1);
                    T tInvoke = function1.invoke(arg);
                    this.f51584b = tInvoke;
                    this.f51583a = null;
                    t10 = tInvoke;
                }
            }
        }
        return t10;
    }
}
