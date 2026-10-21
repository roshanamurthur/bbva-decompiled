package com.veridas.result;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ResultExtensions.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\u001aZ\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u0002H\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00010\u0006H\u0086\fø\u0001\u0000\u001aZ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u0002H\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00010\u0006H\u0086\fø\u0001\u0000\u001a)\u0010\b\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u0001¢\u0006\u0002\u0010\t\u001a)\u0010\n\u001a\u0004\u0018\u0001H\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u0001¢\u0006\u0002\u0010\t\u001aA\u0010\u000b\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u0006H\u0086\fø\u0001\u0000¢\u0006\u0002\u0010\f\u001aA\u0010\r\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0006H\u0086\fø\u0001\u0000¢\u0006\u0002\u0010\f\u001aN\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u0006H\u0086\fø\u0001\u0000\u001aN\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00100\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0010*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00100\u0006H\u0086\fø\u0001\u0000\u001aH\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u00130\u0006H\u0086\fø\u0001\u0000\u001aH\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00130\u0006H\u0086\fø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"andThen", "Lcom/veridas/result/Result;", "U", ExifInterface.LONGITUDE_EAST, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "transform", "Lkotlin/Function1;", "flatMap", "get", "(Lcom/veridas/result/Result;)Ljava/lang/Object;", "getError", "getErrorOrElse", "(Lcom/veridas/result/Result;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getOrElse", "map", "mapError", "F", "onFailure", "action", "", "onSuccess", "common-core-jvm"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nResultExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResultExtensions.kt\ncom/veridas/result/ResultExtensionsKt\n*L\n1#1,119:1\n62#1,3:120\n*S KotlinDebug\n*F\n+ 1 ResultExtensions.kt\ncom/veridas/result/ResultExtensionsKt\n*L\n75#1:120,3\n*E\n"})
public final class ResultExtensionsKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <V, E, U> Result<U, E> andThen(@NotNull Result<? extends V, ? extends E> result, @NotNull Function1<? super V, ? extends Result<? extends U, ? extends E>> transform) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (result instanceof Ok) {
            return transform.invoke((Object) ((Ok) result).getValue());
        }
        if (result instanceof Err) {
            return result;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <V, E, U> Result<U, E> flatMap(@NotNull Result<? extends V, ? extends E> result, @NotNull Function1<? super V, ? extends Result<? extends U, ? extends E>> transform) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (result instanceof Ok) {
            return transform.invoke((Object) ((Ok) result).getValue());
        }
        if (result instanceof Err) {
            return result;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    public static final <V, E> V get(@NotNull Result<? extends V, ? extends E> result) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        if (result instanceof Ok) {
            return (V) ((Ok) result).getValue();
        }
        if (result instanceof Err) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    public static final <V, E> E getError(@NotNull Result<? extends V, ? extends E> result) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        if (result instanceof Ok) {
            return null;
        }
        if (result instanceof Err) {
            return (E) ((Err) result).getError();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <V, E> E getErrorOrElse(@NotNull Result<? extends V, ? extends E> result, @NotNull Function1<? super V, ? extends E> transform) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (result instanceof Ok) {
            return transform.invoke((Object) ((Ok) result).getValue());
        }
        if (result instanceof Err) {
            return (E) ((Err) result).getError();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <V, E> V getOrElse(@NotNull Result<? extends V, ? extends E> result, @NotNull Function1<? super E, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (result instanceof Ok) {
            return (V) ((Ok) result).getValue();
        }
        if (result instanceof Err) {
            return transform.invoke((Object) ((Err) result).getError());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <V, E, U> Result<U, E> map(@NotNull Result<? extends V, ? extends E> result, @NotNull Function1<? super V, ? extends U> transform) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (result instanceof Ok) {
            return new Ok(transform.invoke((Object) ((Ok) result).getValue()));
        }
        if (result instanceof Err) {
            return result;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <V, E, F> Result<V, F> mapError(@NotNull Result<? extends V, ? extends E> result, @NotNull Function1<? super E, ? extends F> transform) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (result instanceof Ok) {
            return result;
        }
        if (result instanceof Err) {
            return new Err(transform.invoke((Object) ((Err) result).getError()));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <V, E> Result<V, E> onFailure(@NotNull Result<? extends V, ? extends E> result, @NotNull Function1<? super E, Unit> action) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        if (result instanceof Err) {
            action.invoke((Object) ((Err) result).getError());
        }
        return result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <V, E> Result<V, E> onSuccess(@NotNull Result<? extends V, ? extends E> result, @NotNull Function1<? super V, Unit> action) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        if (result instanceof Ok) {
            action.invoke((Object) ((Ok) result).getValue());
        }
        return result;
    }
}
