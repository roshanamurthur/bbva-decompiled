package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$ModalBottomSheet_androidKt {

    @NotNull
    public static final ComposableSingletons$ModalBottomSheet_androidKt INSTANCE = new ComposableSingletons$ModalBottomSheet_androidKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f33lambda1 = ComposableLambdaKt.composableLambdaInstance(2103486466, false, a.f9842p0);

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f34lambda2 = ComposableLambdaKt.composableLambdaInstance(1964472464, false, b.f9843p0);

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f35lambda3 = ComposableLambdaKt.composableLambdaInstance(163832305, false, c.f9844p0);

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f9842p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2103486466, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt.lambda-1.<anonymous> (ModalBottomSheet.android.kt:131)");
                }
                BottomSheetDefaults.INSTANCE.m922DragHandlelgZ2HuY(null, 0.0f, 0.0f, null, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f9843p0 = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1964472464, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt.lambda-2.<anonymous> (ModalBottomSheet.android.kt:290)");
                }
                BottomSheetDefaults.INSTANCE.m922DragHandlelgZ2HuY(null, 0.0f, 0.0f, null, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f9844p0 = new c(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(163832305, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt.lambda-3.<anonymous> (ModalBottomSheet.android.kt:513)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1037getLambda1$material3_release() {
        return f33lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1038getLambda2$material3_release() {
        return f34lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1039getLambda3$material3_release() {
        return f35lambda3;
    }
}
