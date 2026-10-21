package org.koin.java;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: KoinJavaComponent.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JC\u0010\u0003\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\fH\u0007¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0007JE\u0010\u0010\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\fH\u0007¢\u0006\u0002\u0010\rJD\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0012\"\u0004\b\u0000\u0010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\fH\u0007JF\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00040\u0012\"\u0004\b\u0000\u0010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\fH\u0007¨\u0006\u0014"}, d2 = {"Lorg/koin/java/KoinJavaComponent;", "", "()V", "get", ExifInterface.GPS_DIRECTION_TRUE, "clazz", "Ljava/lang/Class;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Ljava/lang/Class;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getKoin", "Lorg/koin/core/Koin;", "getOrNull", "inject", "Lkotlin/Lazy;", "injectOrNull", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KoinJavaComponent {

    @NotNull
    public static final KoinJavaComponent INSTANCE = new KoinJavaComponent();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: KoinJavaComponent.kt */
    public static final class a<T> extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Class<?> f92493p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Qualifier f92494q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<ParametersHolder> f92495r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Class<?> cls, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
            super(0);
            this.f92493p0 = cls;
            this.f92494q0 = qualifier;
            this.f92495r0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) KoinJavaComponent.get(this.f92493p0, this.f92494q0, this.f92495r0);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: KoinJavaComponent.kt */
    public static final class b<T> extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Class<?> f92496p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Qualifier f92497q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<ParametersHolder> f92498r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Class<?> cls, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
            super(0);
            this.f92496p0 = cls;
            this.f92497q0 = qualifier;
            this.f92498r0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final T invoke() {
            return (T) KoinJavaComponent.getOrNull(this.f92496p0, this.f92497q0, this.f92498r0);
        }
    }

    @JvmStatic
    @JvmOverloads
    public static final <T> T get(@NotNull Class<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) get$default(clazz, null, null, 6, null);
    }

    public static /* synthetic */ Object get$default(Class cls, Qualifier qualifier, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            qualifier = null;
        }
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        return get(cls, qualifier, function0);
    }

    @JvmStatic
    @NotNull
    public static final Koin getKoin() {
        return KoinPlatformTools.INSTANCE.defaultContext().get();
    }

    @JvmStatic
    @JvmOverloads
    @Nullable
    public static final <T> T getOrNull(@NotNull Class<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) getOrNull$default(clazz, null, null, 6, null);
    }

    public static /* synthetic */ Object getOrNull$default(Class cls, Qualifier qualifier, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            qualifier = null;
        }
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        return getOrNull(cls, qualifier, function0);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T> Lazy<T> inject(@NotNull Class<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return inject$default(clazz, null, null, 6, null);
    }

    public static /* synthetic */ Lazy inject$default(Class cls, Qualifier qualifier, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            qualifier = null;
        }
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        return inject(cls, qualifier, function0);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T> Lazy<T> injectOrNull(@NotNull Class<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return injectOrNull$default(clazz, null, null, 6, null);
    }

    public static /* synthetic */ Lazy injectOrNull$default(Class cls, Qualifier qualifier, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            qualifier = null;
        }
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        return injectOrNull(cls, qualifier, function0);
    }

    @JvmStatic
    @JvmOverloads
    public static final <T> T get(@NotNull Class<?> clazz, @Nullable Qualifier qualifier) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) get$default(clazz, qualifier, null, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    @Nullable
    public static final <T> T getOrNull(@NotNull Class<?> clazz, @Nullable Qualifier qualifier) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) getOrNull$default(clazz, qualifier, null, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T> Lazy<T> inject(@NotNull Class<?> clazz, @Nullable Qualifier qualifier) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return inject$default(clazz, qualifier, null, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T> Lazy<T> injectOrNull(@NotNull Class<?> clazz, @Nullable Qualifier qualifier) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return injectOrNull$default(clazz, qualifier, null, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final <T> T get(@NotNull Class<?> clazz, @Nullable Qualifier qualifier, @Nullable Function0<? extends ParametersHolder> parameters) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) getKoin().get(JvmClassMappingKt.getKotlinClass(clazz), qualifier, parameters);
    }

    @JvmStatic
    @JvmOverloads
    @Nullable
    public static final <T> T getOrNull(@NotNull Class<?> clazz, @Nullable Qualifier qualifier, @Nullable Function0<? extends ParametersHolder> parameters) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) getKoin().getOrNull(JvmClassMappingKt.getKotlinClass(clazz), qualifier, parameters);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T> Lazy<T> inject(@NotNull Class<?> clazz, @Nullable Qualifier qualifier, @Nullable Function0<? extends ParametersHolder> parameters) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new a(clazz, qualifier, parameters));
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T> Lazy<T> injectOrNull(@NotNull Class<?> clazz, @Nullable Qualifier qualifier, @Nullable Function0<? extends ParametersHolder> parameters) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return LazyKt__LazyJVMKt.lazy(new b(clazz, qualifier, parameters));
    }
}
