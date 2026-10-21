package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.FullyDrawnReporterOwner;
import androidx.activity.ViewTreeFullyDrawnReporterOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReportDrawn.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0004R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/activity/compose/LocalFullyDrawnReporterOwner;", "", "Landroidx/activity/FullyDrawnReporterOwner;", "fullyDrawnReporterOwner", "Landroidx/compose/runtime/ProvidedValue;", "provides", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/activity/FullyDrawnReporterOwner;", "current", "<init>", "()V", "activity-compose_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/LocalFullyDrawnReporterOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,176:1\n76#2:177\n76#2:178\n76#2:179\n23#3,8:180\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/LocalFullyDrawnReporterOwner\n*L\n106#1:177\n107#1:178\n108#1:179\n108#1:180,8\n*E\n"})
public final class LocalFullyDrawnReporterOwner {
    public static final int $stable = 0;

    @NotNull
    public static final LocalFullyDrawnReporterOwner INSTANCE = new LocalFullyDrawnReporterOwner();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<FullyDrawnReporterOwner> f404a = CompositionLocalKt.compositionLocalOf$default(null, a.f405p0, 1, null);

    /* JADX INFO: compiled from: ReportDrawn.kt */
    public static final class a extends Lambda implements Function0<FullyDrawnReporterOwner> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f405p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ FullyDrawnReporterOwner invoke() {
            return null;
        }
    }

    @Composable
    @JvmName(name = "getCurrent")
    @Nullable
    public final FullyDrawnReporterOwner getCurrent(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(540186968);
        FullyDrawnReporterOwner fullyDrawnReporterOwner = (FullyDrawnReporterOwner) composer.consume(f404a);
        composer.startReplaceableGroup(1606493384);
        if (fullyDrawnReporterOwner == null) {
            fullyDrawnReporterOwner = ViewTreeFullyDrawnReporterOwner.get((View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView()));
        }
        composer.endReplaceableGroup();
        if (fullyDrawnReporterOwner == null) {
            Object baseContext = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof FullyDrawnReporterOwner) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            fullyDrawnReporterOwner = (FullyDrawnReporterOwner) baseContext;
        }
        composer.endReplaceableGroup();
        return fullyDrawnReporterOwner;
    }

    @NotNull
    public final ProvidedValue<FullyDrawnReporterOwner> provides(@NotNull FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        return f404a.provides(fullyDrawnReporterOwner);
    }
}
