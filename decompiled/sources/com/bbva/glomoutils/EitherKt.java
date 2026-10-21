package com.bbva.glomoutils;

import androidx.exifinterface.media.ExifInterface;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Either.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0005\u001a%\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00070\u0001\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0004\u001a\u0002H\u0007¢\u0006\u0002\u0010\u0005\u001aZ\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\t*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00070\u00012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u0002H\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\u00010\u000bH\u0086\bø\u0001\u0000\u001aP\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0007*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00070\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\r0\u000bH\u0086\bø\u0001\u0000\u001aN\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u00070\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u0011*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00070\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00110\u000bH\u0086\bø\u0001\u0000\u001aN\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00110\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u0011*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00070\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u00110\u000bH\u0086\bø\u0001\u0000\u001aD\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00070\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0007*\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0015H\u0086\bø\u0001\u0000\u001aN\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00170\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u0017*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00070\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u00170\u000bH\u0086\bø\u0001\u0000\u001aN\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\u00070\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\u0007*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00070\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\u000bH\u0086\bø\u0001\u0000\u001a=\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00070\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0007*\u0004\u0018\u0001H\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0015H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001a/\u0010\u001b\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0007*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00070\u00012\u0006\u0010\u000e\u001a\u0002H\u0007¢\u0006\u0002\u0010\u001c\u001a)\u0010\u001d\u001a\u0004\u0018\u0001H\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0007*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00070\u0001¢\u0006\u0002\u0010\u001e\u001a*\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u0002H\t0\u0001\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0!ø\u0001\u0001¢\u0006\u0002\u0010\u0005\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {Parameters.DIRECTION.LEFT, "Lcom/bbva/glomoutils/Either;", ExifInterface.LONGITUDE_EAST, "", "value", "(Ljava/lang/Object;)Lcom/bbva/glomoutils/Either;", Parameters.DIRECTION.RIGHT, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "flatMap", ExifInterface.GPS_DIRECTION_TRUE, "func", "Lkotlin/Function1;", "fold", "", "ifLeft", "ifRight", "foldLeft", "C", "block", "foldRight", "leftIfNull", "Lkotlin/Function0;", "map", "M", "mapLeft", "rightIfNotNull", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Lcom/bbva/glomoutils/Either;", "rightOrElse", "(Lcom/bbva/glomoutils/Either;Ljava/lang/Object;)Ljava/lang/Object;", "rightOrNull", "(Lcom/bbva/glomoutils/Either;)Ljava/lang/Object;", "toEither", "", "Lkotlin/Result;", "gl-utils_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEither.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Either.kt\ncom/bbva/glomoutils/EitherKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n60#1,3:90\n1#2:89\n*S KotlinDebug\n*F\n+ 1 Either.kt\ncom/bbva/glomoutils/EitherKt\n*L\n71#1:90,3\n*E\n"})
public final class EitherKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E, V, T> Either<E, T> flatMap(@NotNull Either<? extends E, ? extends V> either, @NotNull Function1<? super V, ? extends Either<? extends E, ? extends T>> func) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        Intrinsics.checkNotNullParameter(func, "func");
        if (either instanceof Either.Right) {
            return func.invoke((Object) ((Either.Right) either).getValue());
        }
        if (either instanceof Either.Left) {
            return either;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <E, V> void fold(@NotNull Either<? extends E, ? extends V> either, @NotNull Function1<? super E, Unit> ifLeft, @NotNull Function1<? super V, Unit> ifRight) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        Intrinsics.checkNotNullParameter(ifLeft, "ifLeft");
        Intrinsics.checkNotNullParameter(ifRight, "ifRight");
        if (either instanceof Either.Right) {
            ifRight.invoke((Object) ((Either.Right) either).getValue());
        } else if (either instanceof Either.Left) {
            ifLeft.invoke((Object) ((Either.Left) either).getError());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E, V, C> Either<C, V> foldLeft(@NotNull Either<? extends E, ? extends V> either, @NotNull Function1<? super E, ? extends C> block) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (either instanceof Either.Right) {
            return either;
        }
        if (either instanceof Either.Left) {
            return left(block.invoke((Object) ((Either.Left) either).getError()));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E, V, C> Either<E, C> foldRight(@NotNull Either<? extends E, ? extends V> either, @NotNull Function1<? super V, ? extends C> block) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (either instanceof Either.Right) {
            return right(block.invoke((Object) ((Either.Right) either).getValue()));
        }
        if (either instanceof Either.Left) {
            return either;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final <E> Either left(E e5) {
        return new Either.Left(e5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E, V> Either<E, V> leftIfNull(@NotNull Either<? extends E, ? extends V> either, @NotNull Function0<? extends E> block) {
        Either<E, V> eitherRight;
        Intrinsics.checkNotNullParameter(either, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (either instanceof Either.Right) {
            Object value = ((Either.Right) either).getValue();
            return (value == null || (eitherRight = right(value)) == null) ? left(block.invoke()) : eitherRight;
        }
        if (either instanceof Either.Left) {
            return either;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E, V, M> Either<E, M> map(@NotNull Either<? extends E, ? extends V> either, @NotNull Function1<? super V, ? extends M> func) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        Intrinsics.checkNotNullParameter(func, "func");
        if (either instanceof Either.Right) {
            return right(func.invoke((Object) ((Either.Right) either).getValue()));
        }
        if (either instanceof Either.Left) {
            return either;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E, T, V> Either<T, V> mapLeft(@NotNull Either<? extends E, ? extends V> either, @NotNull Function1<? super E, ? extends T> func) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        Intrinsics.checkNotNullParameter(func, "func");
        if (either instanceof Either.Right) {
            return either;
        }
        if (either instanceof Either.Left) {
            return left(func.invoke((Object) ((Either.Left) either).getError()));
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final <V> Either right(V v3) {
        return new Either.Right(v3);
    }

    @NotNull
    public static final <E, V> Either<E, V> rightIfNotNull(@Nullable V v3, @NotNull Function0<? extends E> block) {
        Either<E, V> eitherRight;
        Intrinsics.checkNotNullParameter(block, "block");
        return (v3 == null || (eitherRight = right(v3)) == null) ? left(block.invoke()) : eitherRight;
    }

    public static final <E, V> V rightOrElse(@NotNull Either<? extends E, ? extends V> either, V v3) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        return either instanceof Either.Right ? (V) ((Either.Right) either).getValue() : v3;
    }

    @Nullable
    public static final <E, V> V rightOrNull(@NotNull Either<? extends E, ? extends V> either) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        return (V) rightOrElse(either, null);
    }

    @NotNull
    public static final <T> Either<Throwable, T> toEither(@NotNull Object obj) {
        if (Result.m5541isSuccessimpl(obj)) {
            obj = right(obj);
        }
        Object objM5535constructorimpl = Result.m5535constructorimpl(obj);
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            objM5535constructorimpl = left(thM5538exceptionOrNullimpl);
        }
        return (Either) objM5535constructorimpl;
    }
}
