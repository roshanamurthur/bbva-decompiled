package androidx.savedstate;

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

/* JADX INFO: compiled from: ViewTreeSavedStateRegistryOwner.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"findViewTreeSavedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroid/view/View;", "get", "setViewTreeSavedStateRegistryOwner", "", "owner", SetCommand.ID, "savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName(name = "ViewTreeSavedStateRegistryOwner")
public final class ViewTreeSavedStateRegistryOwner {

    /* JADX INFO: compiled from: ViewTreeSavedStateRegistryOwner.kt */
    public static final class a extends Lambda implements Function1<View, View> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f23411p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final View invoke(View view) {
            View view2 = view;
            Intrinsics.checkNotNullParameter(view2, "view");
            Object parent = view2.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ViewTreeSavedStateRegistryOwner.kt */
    public static final class b extends Lambda implements Function1<View, SavedStateRegistryOwner> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f23412p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final SavedStateRegistryOwner invoke(View view) {
            View view2 = view;
            Intrinsics.checkNotNullParameter(view2, "view");
            Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
            if (tag instanceof SavedStateRegistryOwner) {
                return (SavedStateRegistryOwner) tag;
            }
            return null;
        }
    }

    @JvmName(name = "get")
    @Nullable
    public static final SavedStateRegistryOwner get(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (SavedStateRegistryOwner) SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.mapNotNull(SequencesKt__SequencesKt.generateSequence(view, a.f23411p0), b.f23412p0));
    }

    @JvmName(name = SetCommand.ID)
    public static final void set(@NotNull View view, @Nullable SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }
}
