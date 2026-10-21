package androidx.activity;

import android.view.View;
import com.bbva.plugin.localstorage.command.SetCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ViewTreeFullyLoadedReporterOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"findViewTreeFullyDrawnReporterOwner", "Landroidx/activity/FullyDrawnReporterOwner;", "Landroid/view/View;", "get", "setViewTreeFullyDrawnReporterOwner", "", "fullyDrawnReporterOwner", SetCommand.ID, "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName(name = "ViewTreeFullyDrawnReporterOwner")
public final class ViewTreeFullyDrawnReporterOwner {

    /* JADX INFO: compiled from: ViewTreeFullyLoadedReporterOwner.kt */
    public static final class a extends Lambda implements Function1<View, View> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f374p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final View invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            Object parent = it.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ViewTreeFullyLoadedReporterOwner.kt */
    public static final class b extends Lambda implements Function1<View, FullyDrawnReporterOwner> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f375p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final FullyDrawnReporterOwner invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            Object tag = it.getTag(R.id.report_drawn);
            if (tag instanceof FullyDrawnReporterOwner) {
                return (FullyDrawnReporterOwner) tag;
            }
            return null;
        }
    }

    @JvmName(name = "get")
    @Nullable
    public static final FullyDrawnReporterOwner get(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (FullyDrawnReporterOwner) SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.mapNotNull(SequencesKt__SequencesKt.generateSequence(view, a.f374p0), b.f375p0));
    }

    @JvmName(name = SetCommand.ID)
    public static final void set(@NotNull View view, @NotNull FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(R.id.report_drawn, fullyDrawnReporterOwner);
    }
}
