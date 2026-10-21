package kotlin;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeepRecursive.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0004\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0087\u0002¢\u0006\u0004\b\u0004\u0010\u0005*r\b\u0002\u0010\u000b\"5\b\u0001\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\t\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\n25\b\u0001\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\t\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\n¨\u0006\f"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlin/DeepRecursiveFunction;", "value", "invoke", "(Lkotlin/DeepRecursiveFunction;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlin/DeepRecursiveScope;", "", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "DeepRecursiveFunctionBlock", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
public final class DeepRecursiveKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Object f79377a;

    static {
        Result.Companion companion = Result.INSTANCE;
        f79377a = Result.m5535constructorimpl(ek.a.getCOROUTINE_SUSPENDED());
    }

    @SinceKotlin(version = "1.7")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T, R> R invoke(@NotNull DeepRecursiveFunction<T, R> deepRecursiveFunction, T t10) {
        Intrinsics.checkNotNullParameter(deepRecursiveFunction, "<this>");
        return (R) new ak.a(deepRecursiveFunction.getBlock$kotlin_stdlib(), t10).runCallLoop();
    }
}
