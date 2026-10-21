package com.veridas.result;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Factory.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a,\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0086\bø\u0001\u0000\u001aF\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0002*\u0002H\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00020\u0007¢\u0006\u0002\b\bH\u0086\fø\u0001\u0000¢\u0006\u0002\u0010\t\u001a=\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000b0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000b*\u0004\u0018\u0001H\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0005H\u0086\fø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"runCatching", "Lcom/veridas/result/Result;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "block", "Lkotlin/Function0;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lcom/veridas/result/Result;", "toResultOr", ExifInterface.LONGITUDE_EAST, "error", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Lcom/veridas/result/Result;", "common-core-jvm"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FactoryKt {
    @NotNull
    public static final <V> Result<V, Throwable> runCatching(@NotNull Function0<? extends V> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return new Ok(block.invoke());
        } catch (Throwable th2) {
            return new Err(th2);
        }
    }

    @NotNull
    public static final <V, E> Result<V, E> toResultOr(@Nullable V v3, @NotNull Function0<? extends E> error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return v3 == null ? new Err(error.invoke()) : new Ok(v3);
    }

    @NotNull
    public static final <T, V> Result<V, Throwable> runCatching(T t10, @NotNull Function1<? super T, ? extends V> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return new Ok(block.invoke(t10));
        } catch (Throwable th2) {
            return new Err(th2);
        }
    }
}
