package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o1.p;
import o1.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StaticLayoutFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public final class StaticLayoutFactoryDefault implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Companion f17798a = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f17799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static Constructor<StaticLayout> f17800c;

    /* JADX INFO: compiled from: StaticLayoutFactory.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault$Companion;", "", "", "isInitialized", "Z", "Ljava/lang/reflect/Constructor;", "Landroid/text/StaticLayout;", "staticLayoutConstructor", "Ljava/lang/reflect/Constructor;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final Constructor access$getStaticLayoutConstructor(Companion companion) {
            companion.getClass();
            if (StaticLayoutFactoryDefault.f17799b) {
                return StaticLayoutFactoryDefault.f17800c;
            }
            StaticLayoutFactoryDefault.f17799b = true;
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                StaticLayoutFactoryDefault.f17800c = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            } catch (NoSuchMethodException unused) {
                StaticLayoutFactoryDefault.f17800c = null;
            }
            return StaticLayoutFactoryDefault.f17800c;
        }
    }

    @Override // o1.p
    @DoNotInline
    @NotNull
    public StaticLayout a(@NotNull q params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Constructor constructorAccess$getStaticLayoutConstructor = Companion.access$getStaticLayoutConstructor(f17798a);
        StaticLayout staticLayout = null;
        if (constructorAccess$getStaticLayoutConstructor != null) {
            try {
                staticLayout = (StaticLayout) constructorAccess$getStaticLayoutConstructor.newInstance(params.f85245a, Integer.valueOf(params.f85246b), Integer.valueOf(params.f85247c), params.f85248d, Integer.valueOf(params.f85249e), params.f85251g, params.f85250f, Float.valueOf(params.f85255k), Float.valueOf(params.f85256l), Boolean.valueOf(params.f85257n), params.f85253i, Integer.valueOf(params.f85254j), Integer.valueOf(params.f85252h));
            } catch (IllegalAccessException unused) {
                f17800c = null;
            } catch (InstantiationException unused2) {
                f17800c = null;
            } catch (InvocationTargetException unused3) {
                f17800c = null;
            }
        }
        return staticLayout != null ? staticLayout : new StaticLayout(params.f85245a, params.f85246b, params.f85247c, params.f85248d, params.f85249e, params.f85251g, params.f85255k, params.f85256l, params.f85257n, params.f85253i, params.f85254j);
    }
}
