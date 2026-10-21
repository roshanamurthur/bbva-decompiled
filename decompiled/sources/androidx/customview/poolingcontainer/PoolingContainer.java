package androidx.customview.poolingcontainer;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p2.a;

/* JADX INFO: compiled from: PoolingContainer.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0003*\u00020\u0007\"(\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\"\u0015\u0010\u000f\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Landroid/view/View;", "Landroidx/customview/poolingcontainer/PoolingContainerListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addPoolingContainerListener", "removePoolingContainerListener", "callPoolingContainerOnRelease", "Landroid/view/ViewGroup;", "callPoolingContainerOnReleaseForChildren", "", "value", "isPoolingContainer", "(Landroid/view/View;)Z", "setPoolingContainer", "(Landroid/view/View;Z)V", "isWithinPoolingContainer", "customview-poolingcontainer_release"}, k = 2, mv = {1, 6, 0})
@JvmName(name = "PoolingContainer")
public final class PoolingContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f20472a = R.id.pooling_container_listener_holder_tag;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f20473b = R.id.is_pooling_container_tag;

    public static final a a(View view) {
        int i10 = f20472a;
        a aVar = (a) view.getTag(i10);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        view.setTag(i10, aVar2);
        return aVar2;
    }

    @SuppressLint({"ExecutorRegistration"})
    public static final void addPoolingContainerListener(@NotNull View view, @NotNull PoolingContainerListener listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        a aVarA = a(view);
        Intrinsics.checkNotNullParameter(listener, "listener");
        aVarA.f92553a.add(listener);
    }

    public static final void callPoolingContainerOnRelease(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Iterator<View> it = ViewKt.getAllViews(view).iterator();
        while (it.hasNext()) {
            ArrayList<PoolingContainerListener> arrayList = a(it.next()).f92553a;
            for (int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList); -1 < lastIndex; lastIndex--) {
                arrayList.get(lastIndex).onRelease();
            }
        }
    }

    public static final void callPoolingContainerOnReleaseForChildren(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Iterator<View> it = ViewGroupKt.getChildren(viewGroup).iterator();
        while (it.hasNext()) {
            ArrayList<PoolingContainerListener> arrayList = a(it.next()).f92553a;
            for (int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList); -1 < lastIndex; lastIndex--) {
                arrayList.get(lastIndex).onRelease();
            }
        }
    }

    public static final boolean isPoolingContainer(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(f20473b);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean isWithinPoolingContainer(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        for (Object obj : ViewKt.getAncestors(view)) {
            if ((obj instanceof View) && isPoolingContainer((View) obj)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"ExecutorRegistration"})
    public static final void removePoolingContainerListener(@NotNull View view, @NotNull PoolingContainerListener listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        a aVarA = a(view);
        Intrinsics.checkNotNullParameter(listener, "listener");
        aVarA.f92553a.remove(listener);
    }

    public static final void setPoolingContainer(@NotNull View view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(f20473b, Boolean.valueOf(z10));
    }
}
