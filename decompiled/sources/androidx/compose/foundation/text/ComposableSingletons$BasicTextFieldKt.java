package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BasicTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$BasicTextFieldKt {

    @NotNull
    public static final ComposableSingletons$BasicTextFieldKt INSTANCE = new ComposableSingletons$BasicTextFieldKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f0lambda1 = ComposableLambdaKt.composableLambdaInstance(997835932, false, a.f5803p0);

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f1lambda2 = ComposableLambdaKt.composableLambdaInstance(2105616367, false, b.f5804p0);

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f2lambda3 = ComposableLambdaKt.composableLambdaInstance(434140383, false, c.f5805p0);

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f3lambda4 = ComposableLambdaKt.composableLambdaInstance(-34833998, false, d.f5806p0);

    /* JADX INFO: compiled from: BasicTextField.kt */
    public static final class a extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f5803p0 = new a(3);

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            Function2<? super Composer, ? super Integer, ? extends Unit> innerTextField = function2;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer2.changedInstance(innerTextField) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(997835932, iIntValue, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-1.<anonymous> (BasicTextField.kt:139)");
                }
                innerTextField.invoke(composer2, Integer.valueOf(iIntValue & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BasicTextField.kt */
    public static final class b extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f5804p0 = new b(3);

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            Function2<? super Composer, ? super Integer, ? extends Unit> innerTextField = function2;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer2.changedInstance(innerTextField) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2105616367, iIntValue, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-2.<anonymous> (BasicTextField.kt:285)");
                }
                innerTextField.invoke(composer2, Integer.valueOf(iIntValue & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BasicTextField.kt */
    public static final class c extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f5805p0 = new c(3);

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            Function2<? super Composer, ? super Integer, ? extends Unit> innerTextField = function2;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer2.changedInstance(innerTextField) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(434140383, iIntValue, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-3.<anonymous> (BasicTextField.kt:329)");
                }
                innerTextField.invoke(composer2, Integer.valueOf(iIntValue & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BasicTextField.kt */
    public static final class d extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f5806p0 = new d(3);

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            Function2<? super Composer, ? super Integer, ? extends Unit> innerTextField = function2;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer2.changedInstance(innerTextField) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-34833998, iIntValue, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-4.<anonymous> (BasicTextField.kt:369)");
                }
                innerTextField.invoke(composer2, Integer.valueOf(iIntValue & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$foundation_release, reason: not valid java name */
    public final Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> m494getLambda1$foundation_release() {
        return f0lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$foundation_release, reason: not valid java name */
    public final Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> m495getLambda2$foundation_release() {
        return f1lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$foundation_release, reason: not valid java name */
    public final Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> m496getLambda3$foundation_release() {
        return f2lambda3;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-4$foundation_release, reason: not valid java name */
    public final Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> m497getLambda4$foundation_release() {
        return f3lambda4;
    }
}
