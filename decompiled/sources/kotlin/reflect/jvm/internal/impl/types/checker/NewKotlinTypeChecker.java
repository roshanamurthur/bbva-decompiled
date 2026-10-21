package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NewKotlinTypeChecker.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface NewKotlinTypeChecker extends KotlinTypeChecker {

    @NotNull
    public static final Companion Companion = Companion.f82024a;

    /* JADX INFO: compiled from: NewKotlinTypeChecker.kt */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f82024a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final NewKotlinTypeCheckerImpl f82025b = new NewKotlinTypeCheckerImpl(KotlinTypeRefiner.Default.INSTANCE, null, 2, 0 == true ? 1 : 0);

        @NotNull
        public final NewKotlinTypeCheckerImpl getDefault() {
            return f82025b;
        }
    }

    @NotNull
    KotlinTypeRefiner getKotlinTypeRefiner();

    @NotNull
    OverridingUtil getOverridingUtil();
}
