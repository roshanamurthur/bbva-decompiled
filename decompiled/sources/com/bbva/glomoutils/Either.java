package com.bbva.glomoutils;

import androidx.camera.core.impl.a;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Either.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003:\u0003\b\t\nB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/bbva/glomoutils/Either;", ExifInterface.LONGITUDE_EAST, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "()V", "isLeft", "", "isRight", "Companion", "Left", "Right", "Lcom/bbva/glomoutils/Either$Left;", "Lcom/bbva/glomoutils/Either$Right;", "gl-utils_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Either<E, V> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: Either.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JB\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00050\n¨\u0006\f"}, d2 = {"Lcom/bbva/glomoutils/Either$Companion;", "", "()V", "cond", "Lcom/bbva/glomoutils/Either;", ExifInterface.LONGITUDE_EAST, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "predicate", "", "ifTrue", "Lkotlin/Function0;", "ifFalse", "gl-utils_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <E, V> Either<E, V> cond(boolean predicate, @NotNull Function0<? extends V> ifTrue, @NotNull Function0<? extends E> ifFalse) {
            Intrinsics.checkNotNullParameter(ifTrue, "ifTrue");
            Intrinsics.checkNotNullParameter(ifFalse, "ifFalse");
            return predicate ? EitherKt.right(ifTrue.invoke()) : EitherKt.left(ifFalse.invoke());
        }
    }

    /* JADX INFO: compiled from: Either.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00028\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0004\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0006\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0005¨\u0006\u0016"}, d2 = {"Lcom/bbva/glomoutils/Either$Left;", ExifInterface.LONGITUDE_EAST, "Lcom/bbva/glomoutils/Either;", "", "component1", "()Ljava/lang/Object;", "error", "copy", "(Ljava/lang/Object;)Lcom/bbva/glomoutils/Either$Left;", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/Object;", "getError", "<init>", "(Ljava/lang/Object;)V", "gl-utils_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Left<E> extends Either {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final E error;

        public Left(E e5) {
            super(null);
            this.error = e5;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Left copy$default(Left left, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = left.error;
            }
            return left.copy(obj);
        }

        public final E component1() {
            return this.error;
        }

        @NotNull
        public final Left<E> copy(E error) {
            return new Left<>(error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Left) && Intrinsics.areEqual(this.error, ((Left) other).error);
        }

        public final E getError() {
            return this.error;
        }

        public int hashCode() {
            E e5 = this.error;
            if (e5 == null) {
                return 0;
            }
            return e5.hashCode();
        }

        @NotNull
        public String toString() {
            return a.e(new StringBuilder("Left(error="), this.error, ")");
        }
    }

    /* JADX INFO: compiled from: Either.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00020\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00028\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0004\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0006\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0005¨\u0006\u0016"}, d2 = {"Lcom/bbva/glomoutils/Either$Right;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/bbva/glomoutils/Either;", "", "component1", "()Ljava/lang/Object;", "value", "copy", "(Ljava/lang/Object;)Lcom/bbva/glomoutils/Either$Right;", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/Object;", "getValue", "<init>", "(Ljava/lang/Object;)V", "gl-utils_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Right<V> extends Either {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final V value;

        public Right(V v3) {
            super(null);
            this.value = v3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Right copy$default(Right right, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = right.value;
            }
            return right.copy(obj);
        }

        public final V component1() {
            return this.value;
        }

        @NotNull
        public final Right<V> copy(V value) {
            return new Right<>(value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Right) && Intrinsics.areEqual(this.value, ((Right) other).value);
        }

        public final V getValue() {
            return this.value;
        }

        public int hashCode() {
            V v3 = this.value;
            if (v3 == null) {
                return 0;
            }
            return v3.hashCode();
        }

        @NotNull
        public String toString() {
            return a.e(new StringBuilder("Right(value="), this.value, ")");
        }
    }

    public Either() {
    }

    public /* synthetic */ Either(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean isLeft() {
        return this instanceof Left;
    }

    public final boolean isRight() {
        return this instanceof Right;
    }
}
