package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ComposableLambda.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0016\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007\u001a \u0010\u0012\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007\u001a'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"", "bits", "slot", "bitsForSlot", "sameBits", "differentBits", "Landroidx/compose/runtime/RecomposeScope;", "other", "", "replacableWith", "Landroidx/compose/runtime/Composer;", "composer", "key", "tracked", "", "block", "Landroidx/compose/runtime/internal/ComposableLambda;", "composableLambda", "composableLambdaInstance", "rememberComposableLambda", "(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;", "SLOTS_PER_INT", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "runtime_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposableLambda.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambda.kt\nandroidx/compose/runtime/internal/ComposableLambdaKt\n+ 2 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,632:1\n26#2:633\n1225#3,6:634\n*S KotlinDebug\n*F\n+ 1 ComposableLambda.kt\nandroidx/compose/runtime/internal/ComposableLambdaKt\n*L\n596#1:633\n629#1:634,6\n*E\n"})
public final class ComposableLambdaKt {
    public static final int SLOTS_PER_INT = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Object f15171a = new Object();

    public static final int bitsForSlot(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    @ComposeCompilerApi
    @NotNull
    public static final ComposableLambda composableLambda(@NotNull Composer composer, int i10, boolean z10, @NotNull Object obj) {
        ComposableLambdaImpl composableLambdaImpl;
        composer.startMovableGroup(Integer.rotateLeft(i10, 1), f15171a);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            composableLambdaImpl = new ComposableLambdaImpl(i10, z10, obj);
            composer.updateRememberedValue(composableLambdaImpl);
        } else {
            Intrinsics.checkNotNull(objRememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            composableLambdaImpl = (ComposableLambdaImpl) objRememberedValue;
            composableLambdaImpl.update(obj);
        }
        composer.endMovableGroup();
        return composableLambdaImpl;
    }

    @ComposeCompilerApi
    @NotNull
    public static final ComposableLambda composableLambdaInstance(int i10, boolean z10, @NotNull Object obj) {
        return new ComposableLambdaImpl(i10, z10, obj);
    }

    public static final int differentBits(int i10) {
        return bitsForSlot(2, i10);
    }

    @Composable
    @ComposeCompilerApi
    @NotNull
    public static final ComposableLambda rememberComposableLambda(int i10, boolean z10, @NotNull Object obj, @Nullable Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1573003438, i11, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:628)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new ComposableLambdaImpl(i10, z10, obj);
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) objRememberedValue;
        composableLambdaImpl.update(obj);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return composableLambdaImpl;
    }

    public static final boolean replacableWith(@Nullable RecomposeScope recomposeScope, @NotNull RecomposeScope recomposeScope2) {
        if (recomposeScope != null) {
            if ((recomposeScope instanceof RecomposeScopeImpl) && (recomposeScope2 instanceof RecomposeScopeImpl)) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) recomposeScope;
                if (!recomposeScopeImpl.getValid() || Intrinsics.areEqual(recomposeScope, recomposeScope2) || Intrinsics.areEqual(recomposeScopeImpl.getAnchor(), ((RecomposeScopeImpl) recomposeScope2).getAnchor())) {
                }
            }
            return false;
        }
        return true;
    }

    public static final int sameBits(int i10) {
        return bitsForSlot(1, i10);
    }
}
