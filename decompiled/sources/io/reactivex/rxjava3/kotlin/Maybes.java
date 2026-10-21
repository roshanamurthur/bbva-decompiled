package io.reactivex.rxjava3.kotlin;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function3;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.Triple;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Maybes.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jh\u0010\u0003\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u00050\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0007J\u0086\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u0001\"\b\b\u0003\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2 \b\u0004\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\r0\u000fH\u0087\bø\u0001\u0000J¤\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u0001\"\b\b\u0003\u0010\u0010*\u00020\u0001\"\b\b\u0004\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2&\b\u0004\u0010\u000e\u001a \u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\r0\u0012H\u0087\bø\u0001\u0000JÂ\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u0001\"\b\b\u0003\u0010\u0010*\u00020\u0001\"\b\b\u0004\u0010\u0013*\u00020\u0001\"\b\b\u0005\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\n2,\b\u0004\u0010\u000e\u001a&\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\r0\u0015H\u0087\bø\u0001\u0000Jà\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u0001\"\b\b\u0003\u0010\u0010*\u00020\u0001\"\b\b\u0004\u0010\u0013*\u00020\u0001\"\b\b\u0005\u0010\u0016*\u00020\u0001\"\b\b\u0006\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\n22\b\u0004\u0010\u000e\u001a,\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\r0\u0018H\u0087\bø\u0001\u0000Jþ\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u0001\"\b\b\u0003\u0010\u0010*\u00020\u0001\"\b\b\u0004\u0010\u0013*\u00020\u0001\"\b\b\u0005\u0010\u0016*\u00020\u0001\"\b\b\u0006\u0010\u0019*\u00020\u0001\"\b\b\u0007\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\n28\b\u0004\u0010\u000e\u001a2\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\r0\u001bH\u0087\bø\u0001\u0000J\u009c\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u0001\"\b\b\u0003\u0010\u0010*\u00020\u0001\"\b\b\u0004\u0010\u0013*\u00020\u0001\"\b\b\u0005\u0010\u0016*\u00020\u0001\"\b\b\u0006\u0010\u0019*\u00020\u0001\"\b\b\u0007\u0010\u001c*\u00020\u0001\"\b\b\b\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001c0\n2>\b\u0004\u0010\u000e\u001a8\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\r0\u001eH\u0087\bø\u0001\u0000Jº\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u0001\"\b\b\u0003\u0010\u0010*\u00020\u0001\"\b\b\u0004\u0010\u0013*\u00020\u0001\"\b\b\u0005\u0010\u0016*\u00020\u0001\"\b\b\u0006\u0010\u0019*\u00020\u0001\"\b\b\u0007\u0010\u001c*\u00020\u0001\"\b\b\b\u0010\u001f*\u00020\u0001\"\b\b\t\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001c0\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001f0\n2D\b\u0004\u0010\u000e\u001a>\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H\r0!H\u0087\bø\u0001\u0000JJ\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H$0\"0\u0004\"\b\b\u0000\u0010#*\u00020\u0001\"\b\b\u0001\u0010$*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H#0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H$0\nH\u0007Jh\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010#*\u00020\u0001\"\b\b\u0001\u0010$*\u00020\u0001\"\b\b\u0002\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H#0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H$0\n2\u001a\b\u0004\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H$\u0012\u0004\u0012\u0002H\r0%H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006&"}, d2 = {"Lio/reactivex/rxjava3/kotlin/Maybes;", "", "()V", "zip", "Lio/reactivex/rxjava3/core/Maybe;", "Lkotlin/Triple;", "T1", "T2", "T3", "s1", "Lio/reactivex/rxjava3/core/MaybeSource;", "s2", "s3", "R", "zipper", "Lkotlin/Function3;", "T4", "s4", "Lkotlin/Function4;", "T5", "s5", "Lkotlin/Function5;", "T6", "s6", "Lkotlin/Function6;", DigipassManagerConstants.T7, "s7", "Lkotlin/Function7;", "T8", "s8", "Lkotlin/Function8;", "T9", "s9", "Lkotlin/Function9;", "Lkotlin/Pair;", ExifInterface.GPS_DIRECTION_TRUE, "U", "Lkotlin/Function2;", "rxkotlin"}, k = 1, mv = {1, 4, 0})
public final class Maybes {
    public static final Maybes INSTANCE = new Maybes();

    /* JADX INFO: Add missing generic type declarations: [T, U] */
    /* JADX INFO: compiled from: Maybes.kt */
    public static final class a<T1, T2, R, T, U> implements BiFunction<T, U, Pair<? extends T, ? extends U>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f78141p0 = new a();

        @Override // io.reactivex.rxjava3.functions.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return new Pair(obj, obj2);
        }
    }

    /* JADX INFO: compiled from: Maybes.kt */
    public static final class b<T1, T2, T3, R> implements Function3<T1, T2, T3, Triple<? extends T1, ? extends T2, ? extends T3>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f78142a = new b();

        @Override // io.reactivex.rxjava3.functions.Function3
        public final Object apply(Object obj, Object obj2, Object obj3) {
            return new Triple(obj, obj2, obj3);
        }
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Maybe.zip(s1, s2, zipper)", imports = {"io.reactivex.Maybe"}))
    @SchedulerSupport("none")
    public final <T, U, R> Maybe<R> zip(@NotNull MaybeSource<T> s4, @NotNull MaybeSource<U> s7, @NotNull final Function2<? super T, ? super U, ? extends R> zipper) {
        Intrinsics.checkNotNullParameter(s4, "s1");
        Intrinsics.checkNotNullParameter(s7, "s2");
        Intrinsics.checkNotNullParameter(zipper, "zipper");
        Maybe<R> maybeZip = Maybe.zip(s4, s7, new BiFunction<T, U, R>() { // from class: io.reactivex.rxjava3.kotlin.Maybes.zip.1
            @Override // io.reactivex.rxjava3.functions.BiFunction
            public final R apply(T t10, U u2) {
                Intrinsics.checkNotNullExpressionValue(t10, "t");
                Intrinsics.checkNotNullExpressionValue(u2, "u");
                return (R) zipper.invoke(t10, u2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeZip, "Maybe.zip(s1, s2,\n      …-> zipper.invoke(t, u) })");
        return maybeZip;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final <T, U> Maybe<Pair<T, U>> zip(@NotNull MaybeSource<T> s4, @NotNull MaybeSource<U> s7) {
        Intrinsics.checkNotNullParameter(s4, "s1");
        Intrinsics.checkNotNullParameter(s7, "s2");
        Maybe<Pair<T, U>> maybeZip = Maybe.zip(s4, s7, a.f78141p0);
        Intrinsics.checkNotNullExpressionValue(maybeZip, "Maybe.zip(s1, s2,\n      …n { t, u -> Pair(t, u) })");
        return maybeZip;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Maybe.zip(s1, s2, s3, zipper)", imports = {"io.reactivex.Maybe"}))
    @SchedulerSupport("none")
    public final <T1, T2, T3, R> Maybe<R> zip(@NotNull MaybeSource<T1> s4, @NotNull MaybeSource<T2> s7, @NotNull MaybeSource<T3> s9, @NotNull final kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super T3, ? extends R> zipper) {
        Intrinsics.checkNotNullParameter(s4, "s1");
        Intrinsics.checkNotNullParameter(s7, "s2");
        Intrinsics.checkNotNullParameter(s9, "s3");
        Intrinsics.checkNotNullParameter(zipper, "zipper");
        Maybe<R> maybeZip = Maybe.zip(s4, s7, s9, new Function3<T1, T2, T3, R>() { // from class: io.reactivex.rxjava3.kotlin.Maybes.zip.3
            @Override // io.reactivex.rxjava3.functions.Function3
            public final R apply(T1 t10, T2 t11, T3 t12) {
                Intrinsics.checkNotNullExpressionValue(t10, "t1");
                Intrinsics.checkNotNullExpressionValue(t11, "t2");
                Intrinsics.checkNotNullExpressionValue(t12, "t3");
                return (R) zipper.invoke(t10, t11, t12);
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeZip, "Maybe.zip(s1, s2, s3,\n  …per.invoke(t1, t2, t3) })");
        return maybeZip;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final <T1, T2, T3> Maybe<Triple<T1, T2, T3>> zip(@NotNull MaybeSource<T1> s4, @NotNull MaybeSource<T2> s7, @NotNull MaybeSource<T3> s9) {
        Intrinsics.checkNotNullParameter(s4, "s1");
        Intrinsics.checkNotNullParameter(s7, "s2");
        Intrinsics.checkNotNullParameter(s9, "s3");
        Maybe<Triple<T1, T2, T3>> maybeZip = Maybe.zip(s4, s7, s9, b.f78142a);
        Intrinsics.checkNotNullExpressionValue(maybeZip, "Maybe.zip(s1, s2, s3,\n  … -> Triple(t1, t2, t3) })");
        return maybeZip;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Maybe.zip(s1, s2, s3, s4, zipper)", imports = {"io.reactivex.Maybe"}))
    @SchedulerSupport("none")
    public final <T1, T2, T3, T4, R> Maybe<R> zip(@NotNull MaybeSource<T1> s4, @NotNull MaybeSource<T2> s7, @NotNull MaybeSource<T3> s9, @NotNull MaybeSource<T4> s10, @NotNull final Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> zipper) {
        Intrinsics.checkNotNullParameter(s4, "s1");
        Intrinsics.checkNotNullParameter(s7, "s2");
        Intrinsics.checkNotNullParameter(s9, "s3");
        Intrinsics.checkNotNullParameter(s10, "s4");
        Intrinsics.checkNotNullParameter(zipper, "zipper");
        Maybe<R> maybeZip = Maybe.zip(s4, s7, s9, s10, new io.reactivex.rxjava3.functions.Function4<T1, T2, T3, T4, R>() { // from class: io.reactivex.rxjava3.kotlin.Maybes.zip.5
            @Override // io.reactivex.rxjava3.functions.Function4
            public final R apply(T1 t10, T2 t11, T3 t12, T4 t13) {
                Intrinsics.checkNotNullExpressionValue(t10, "t1");
                Intrinsics.checkNotNullExpressionValue(t11, "t2");
                Intrinsics.checkNotNullExpressionValue(t12, "t3");
                Intrinsics.checkNotNullExpressionValue(t13, "t4");
                return (R) zipper.invoke(t10, t11, t12, t13);
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeZip, "Maybe.zip(s1, s2, s3, s4…invoke(t1, t2, t3, t4) })");
        return maybeZip;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Maybe.zip(s1, s2, s3, s4, s5, zipper)", imports = {"io.reactivex.Maybe"}))
    @SchedulerSupport("none")
    public final <T1, T2, T3, T4, T5, R> Maybe<R> zip(@NotNull MaybeSource<T1> s4, @NotNull MaybeSource<T2> s7, @NotNull MaybeSource<T3> s9, @NotNull MaybeSource<T4> s10, @NotNull MaybeSource<T5> s11, @NotNull final Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> zipper) {
        Intrinsics.checkNotNullParameter(s4, "s1");
        Intrinsics.checkNotNullParameter(s7, "s2");
        Intrinsics.checkNotNullParameter(s9, "s3");
        Intrinsics.checkNotNullParameter(s10, "s4");
        Intrinsics.checkNotNullParameter(s11, "s5");
        Intrinsics.checkNotNullParameter(zipper, "zipper");
        Maybe<R> maybeZip = Maybe.zip(s4, s7, s9, s10, s11, new io.reactivex.rxjava3.functions.Function5<T1, T2, T3, T4, T5, R>() { // from class: io.reactivex.rxjava3.kotlin.Maybes.zip.6
            @Override // io.reactivex.rxjava3.functions.Function5
            public final R apply(T1 t10, T2 t11, T3 t12, T4 t13, T5 t14) {
                Function5 function5 = zipper;
                Intrinsics.checkNotNullExpressionValue(t10, "t1");
                Intrinsics.checkNotNullExpressionValue(t11, "t2");
                Intrinsics.checkNotNullExpressionValue(t12, "t3");
                Intrinsics.checkNotNullExpressionValue(t13, "t4");
                Intrinsics.checkNotNullExpressionValue(t14, "t5");
                return (R) function5.invoke(t10, t11, t12, t13, t14);
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeZip, "Maybe.zip(s1, s2, s3, s4…ke(t1, t2, t3, t4, t5) })");
        return maybeZip;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Maybe.zip(s1, s2, s3, s4, s5, s6, zipper)", imports = {"io.reactivex.Maybe"}))
    @SchedulerSupport("none")
    public final <T1, T2, T3, T4, T5, T6, R> Maybe<R> zip(@NotNull MaybeSource<T1> s4, @NotNull MaybeSource<T2> s7, @NotNull MaybeSource<T3> s9, @NotNull MaybeSource<T4> s10, @NotNull MaybeSource<T5> s11, @NotNull MaybeSource<T6> s12, @NotNull final Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> zipper) {
        Intrinsics.checkNotNullParameter(s4, "s1");
        Intrinsics.checkNotNullParameter(s7, "s2");
        Intrinsics.checkNotNullParameter(s9, "s3");
        Intrinsics.checkNotNullParameter(s10, "s4");
        Intrinsics.checkNotNullParameter(s11, "s5");
        Intrinsics.checkNotNullParameter(s12, "s6");
        Intrinsics.checkNotNullParameter(zipper, "zipper");
        Maybe<R> maybeZip = Maybe.zip(s4, s7, s9, s10, s11, s12, new io.reactivex.rxjava3.functions.Function6<T1, T2, T3, T4, T5, T6, R>() { // from class: io.reactivex.rxjava3.kotlin.Maybes.zip.7
            @Override // io.reactivex.rxjava3.functions.Function6
            public final R apply(T1 t10, T2 t11, T3 t12, T4 t13, T5 t14, T6 t15) {
                Function6 function6 = zipper;
                Intrinsics.checkNotNullExpressionValue(t10, "t1");
                Intrinsics.checkNotNullExpressionValue(t11, "t2");
                Intrinsics.checkNotNullExpressionValue(t12, "t3");
                Intrinsics.checkNotNullExpressionValue(t13, "t4");
                Intrinsics.checkNotNullExpressionValue(t14, "t5");
                Intrinsics.checkNotNullExpressionValue(t15, "t6");
                return (R) function6.invoke(t10, t11, t12, t13, t14, t15);
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeZip, "Maybe.zip(s1, s2, s3, s4…1, t2, t3, t4, t5, t6) })");
        return maybeZip;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Maybe.zip(s1, s2, s3, s4, s5, s6, s7, zipper)", imports = {"io.reactivex.Maybe"}))
    @SchedulerSupport("none")
    public final <T1, T2, T3, T4, T5, T6, T7, R> Maybe<R> zip(@NotNull MaybeSource<T1> s4, @NotNull MaybeSource<T2> s7, @NotNull MaybeSource<T3> s9, @NotNull MaybeSource<T4> s10, @NotNull MaybeSource<T5> s11, @NotNull MaybeSource<T6> s12, @NotNull MaybeSource<T7> s13, @NotNull final Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> zipper) {
        Intrinsics.checkNotNullParameter(s4, "s1");
        Intrinsics.checkNotNullParameter(s7, "s2");
        Intrinsics.checkNotNullParameter(s9, "s3");
        Intrinsics.checkNotNullParameter(s10, "s4");
        Intrinsics.checkNotNullParameter(s11, "s5");
        Intrinsics.checkNotNullParameter(s12, "s6");
        Intrinsics.checkNotNullParameter(s13, "s7");
        Intrinsics.checkNotNullParameter(zipper, "zipper");
        Maybe<R> maybeZip = Maybe.zip(s4, s7, s9, s10, s11, s12, s13, new io.reactivex.rxjava3.functions.Function7<T1, T2, T3, T4, T5, T6, T7, R>() { // from class: io.reactivex.rxjava3.kotlin.Maybes.zip.8
            @Override // io.reactivex.rxjava3.functions.Function7
            public final R apply(T1 t10, T2 t11, T3 t12, T4 t13, T5 t14, T6 t15, T7 t16) {
                Function7 function7 = zipper;
                Intrinsics.checkNotNullExpressionValue(t10, "t1");
                Intrinsics.checkNotNullExpressionValue(t11, "t2");
                Intrinsics.checkNotNullExpressionValue(t12, "t3");
                Intrinsics.checkNotNullExpressionValue(t13, "t4");
                Intrinsics.checkNotNullExpressionValue(t14, "t5");
                Intrinsics.checkNotNullExpressionValue(t15, "t6");
                Intrinsics.checkNotNullExpressionValue(t16, "t7");
                return (R) function7.invoke(t10, t11, t12, t13, t14, t15, t16);
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeZip, "Maybe.zip(s1, s2, s3, s4…2, t3, t4, t5, t6, t7) })");
        return maybeZip;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Maybe.zip(s1, s2, s3, s4, s5, s6, s7, s8, zipper)", imports = {"io.reactivex.Maybe"}))
    @SchedulerSupport("none")
    public final <T1, T2, T3, T4, T5, T6, T7, T8, R> Maybe<R> zip(@NotNull MaybeSource<T1> s4, @NotNull MaybeSource<T2> s7, @NotNull MaybeSource<T3> s9, @NotNull MaybeSource<T4> s10, @NotNull MaybeSource<T5> s11, @NotNull MaybeSource<T6> s12, @NotNull MaybeSource<T7> s13, @NotNull MaybeSource<T8> s14, @NotNull final Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> zipper) {
        Intrinsics.checkNotNullParameter(s4, "s1");
        Intrinsics.checkNotNullParameter(s7, "s2");
        Intrinsics.checkNotNullParameter(s9, "s3");
        Intrinsics.checkNotNullParameter(s10, "s4");
        Intrinsics.checkNotNullParameter(s11, "s5");
        Intrinsics.checkNotNullParameter(s12, "s6");
        Intrinsics.checkNotNullParameter(s13, "s7");
        Intrinsics.checkNotNullParameter(s14, "s8");
        Intrinsics.checkNotNullParameter(zipper, "zipper");
        Maybe<R> maybeZip = Maybe.zip(s4, s7, s9, s10, s11, s12, s13, s14, new io.reactivex.rxjava3.functions.Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>() { // from class: io.reactivex.rxjava3.kotlin.Maybes.zip.9
            @Override // io.reactivex.rxjava3.functions.Function8
            public final R apply(T1 t10, T2 t11, T3 t12, T4 t13, T5 t14, T6 t15, T7 t16, T8 t17) {
                Function8 function8 = zipper;
                Intrinsics.checkNotNullExpressionValue(t10, "t1");
                Intrinsics.checkNotNullExpressionValue(t11, "t2");
                Intrinsics.checkNotNullExpressionValue(t12, "t3");
                Intrinsics.checkNotNullExpressionValue(t13, "t4");
                Intrinsics.checkNotNullExpressionValue(t14, "t5");
                Intrinsics.checkNotNullExpressionValue(t15, "t6");
                Intrinsics.checkNotNullExpressionValue(t16, "t7");
                Intrinsics.checkNotNullExpressionValue(t17, "t8");
                return (R) function8.invoke(t10, t11, t12, t13, t14, t15, t16, t17);
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeZip, "Maybe.zip(s1, s2, s3, s4…3, t4, t5, t6, t7, t8) })");
        return maybeZip;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Maybe.zip(s1, s2, s3, s4, s5, s6, s7, s8, s9, zipper)", imports = {"io.reactivex.Maybe"}))
    @SchedulerSupport("none")
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Maybe<R> zip(@NotNull MaybeSource<T1> s4, @NotNull MaybeSource<T2> s7, @NotNull MaybeSource<T3> s9, @NotNull MaybeSource<T4> s10, @NotNull MaybeSource<T5> s11, @NotNull MaybeSource<T6> s12, @NotNull MaybeSource<T7> s13, @NotNull MaybeSource<T8> s14, @NotNull MaybeSource<T9> s15, @NotNull final Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> zipper) {
        Intrinsics.checkNotNullParameter(s4, "s1");
        Intrinsics.checkNotNullParameter(s7, "s2");
        Intrinsics.checkNotNullParameter(s9, "s3");
        Intrinsics.checkNotNullParameter(s10, "s4");
        Intrinsics.checkNotNullParameter(s11, "s5");
        Intrinsics.checkNotNullParameter(s12, "s6");
        Intrinsics.checkNotNullParameter(s13, "s7");
        Intrinsics.checkNotNullParameter(s14, "s8");
        Intrinsics.checkNotNullParameter(s15, "s9");
        Intrinsics.checkNotNullParameter(zipper, "zipper");
        Maybe<R> maybeZip = Maybe.zip(s4, s7, s9, s10, s11, s12, s13, s14, s15, new io.reactivex.rxjava3.functions.Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>() { // from class: io.reactivex.rxjava3.kotlin.Maybes.zip.10
            @Override // io.reactivex.rxjava3.functions.Function9
            public final R apply(T1 t10, T2 t11, T3 t12, T4 t13, T5 t14, T6 t15, T7 t16, T8 t17, T9 t18) {
                Function9 function9 = zipper;
                Intrinsics.checkNotNullExpressionValue(t10, "t1");
                Intrinsics.checkNotNullExpressionValue(t11, "t2");
                Intrinsics.checkNotNullExpressionValue(t12, "t3");
                Intrinsics.checkNotNullExpressionValue(t13, "t4");
                Intrinsics.checkNotNullExpressionValue(t14, "t5");
                Intrinsics.checkNotNullExpressionValue(t15, "t6");
                Intrinsics.checkNotNullExpressionValue(t16, "t7");
                Intrinsics.checkNotNullExpressionValue(t17, "t8");
                Intrinsics.checkNotNullExpressionValue(t18, "t9");
                return (R) function9.invoke(t10, t11, t12, t13, t14, t15, t16, t17, t18);
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeZip, "Maybe.zip(s1, s2, s3, s4…4, t5, t6, t7, t8, t9) })");
        return maybeZip;
    }
}
