package androidx.lifecycle.compose;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.lifecycle.LifecycleOwner;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LocalLifecycleOwner.android.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\"#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/lifecycle/LifecycleOwner;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalLifecycleOwner", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "lifecycle-runtime-compose_release"}, k = 2, mv = {1, 8, 0})
@JvmName(name = "LocalLifecycleOwnerKt")
@SourceDebugExtension({"SMAP\nLocalLifecycleOwner.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalLifecycleOwner.android.kt\nandroidx/lifecycle/compose/LocalLifecycleOwnerKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,66:1\n18987#2,2:67\n*S KotlinDebug\n*F\n+ 1 LocalLifecycleOwner.android.kt\nandroidx/lifecycle/compose/LocalLifecycleOwnerKt\n*L\n49#1:67,2\n*E\n"})
public final class LocalLifecycleOwnerKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<LifecycleOwner> f22169a;

    /* JADX INFO: compiled from: LocalLifecycleOwner.android.kt */
    public static final class a extends Lambda implements Function0<LifecycleOwner> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f22170p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final LifecycleOwner invoke() {
            throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present".toString());
        }
    }

    static {
        Object objM5535constructorimpl;
        ProvidableCompositionLocal providableCompositionLocal;
        try {
            Result.Companion companion = Result.INSTANCE;
            ClassLoader classLoader = LifecycleOwner.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", new Class[0]);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    Object objInvoke = method.invoke(null, new Object[0]);
                    if (objInvoke instanceof ProvidableCompositionLocal) {
                        providableCompositionLocal = (ProvidableCompositionLocal) objInvoke;
                        break;
                    }
                } else if (!(annotations[i10] instanceof Deprecated)) {
                    i10++;
                }
                providableCompositionLocal = null;
                break;
            }
            objM5535constructorimpl = Result.m5535constructorimpl(providableCompositionLocal);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        ProvidableCompositionLocal<LifecycleOwner> providableCompositionLocalStaticCompositionLocalOf = (ProvidableCompositionLocal) (Result.m5540isFailureimpl(objM5535constructorimpl) ? null : objM5535constructorimpl);
        if (providableCompositionLocalStaticCompositionLocalOf == null) {
            providableCompositionLocalStaticCompositionLocalOf = CompositionLocalKt.staticCompositionLocalOf(a.f22170p0);
        }
        f22169a = providableCompositionLocalStaticCompositionLocalOf;
    }

    @NotNull
    public static final ProvidableCompositionLocal<LifecycleOwner> getLocalLifecycleOwner() {
        return f22169a;
    }

    public static /* synthetic */ void getLocalLifecycleOwner$annotations() {
    }
}
