package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.R;
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

/* JADX INFO: compiled from: ViewTreeLifecycleOwner.android.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"findViewTreeLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "Landroid/view/View;", "get", "setViewTreeLifecycleOwner", "", "lifecycleOwner", SetCommand.ID, "lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName(name = "ViewTreeLifecycleOwner")
public final class ViewTreeLifecycleOwner {

    /* JADX INFO: compiled from: ViewTreeLifecycleOwner.android.kt */
    public static final class a extends Lambda implements Function1<View, View> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f22041p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final View invoke(View view) {
            View currentView = view;
            Intrinsics.checkNotNullParameter(currentView, "currentView");
            Object parent = currentView.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ViewTreeLifecycleOwner.android.kt */
    public static final class b extends Lambda implements Function1<View, LifecycleOwner> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f22042p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final LifecycleOwner invoke(View view) {
            View viewParent = view;
            Intrinsics.checkNotNullParameter(viewParent, "viewParent");
            Object tag = viewParent.getTag(R.id.view_tree_lifecycle_owner);
            if (tag instanceof LifecycleOwner) {
                return (LifecycleOwner) tag;
            }
            return null;
        }
    }

    @JvmName(name = "get")
    @Nullable
    public static final LifecycleOwner get(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (LifecycleOwner) SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.mapNotNull(SequencesKt__SequencesKt.generateSequence(view, a.f22041p0), b.f22042p0));
    }

    @JvmName(name = SetCommand.ID)
    public static final void set(@NotNull View view, @Nullable LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
