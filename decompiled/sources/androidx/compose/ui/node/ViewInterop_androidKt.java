package androidx.compose.ui.node;

import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ViewInterop.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0000\u001a\u000e\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u0002H\u0000\u001a\f\u0010\u000e\u001a\u00020\f*\u00020\u0002H\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/node/ViewAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/View;", "", "id", "Lkotlin/Function0;", "factory", "getOrAddAdapter", "(Landroid/view/View;ILkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/ViewAdapter;", "", "key", "tagKey", "Landroidx/compose/ui/node/MergedViewAdapter;", "getViewAdapterIfExists", "getViewAdapter", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n+ 2 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,97:1\n54#2:98\n55#2,4:108\n116#3,2:99\n33#3,6:101\n118#3:107\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n*L\n45#1:98\n45#1:108,4\n45#1:99,2\n45#1:101,6\n45#1:107\n*E\n"})
public final class ViewInterop_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f16939a = tagKey("ViewAdapter");

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final <T extends ViewAdapter> T getOrAddAdapter(@NotNull View view, int i10, @NotNull Function0<? extends T> factory) {
        ViewAdapter viewAdapter;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(factory, "factory");
        MergedViewAdapter viewAdapter2 = getViewAdapter(view);
        List<ViewAdapter> adapters = viewAdapter2.getAdapters();
        int size = adapters.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                viewAdapter = null;
                break;
            }
            viewAdapter = adapters.get(i11);
            if (viewAdapter.getId() == i10) {
                break;
            }
            i11++;
        }
        T t10 = viewAdapter instanceof ViewAdapter ? (T) viewAdapter : null;
        if (t10 != null) {
            return t10;
        }
        T tInvoke = factory.invoke();
        viewAdapter2.getAdapters().add(tInvoke);
        return tInvoke;
    }

    @NotNull
    public static final MergedViewAdapter getViewAdapter(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int i10 = f16939a;
        Object tag = view.getTag(i10);
        MergedViewAdapter mergedViewAdapter = tag instanceof MergedViewAdapter ? (MergedViewAdapter) tag : null;
        if (mergedViewAdapter != null) {
            return mergedViewAdapter;
        }
        MergedViewAdapter mergedViewAdapter2 = new MergedViewAdapter();
        view.setTag(i10, mergedViewAdapter2);
        return mergedViewAdapter2;
    }

    @Nullable
    public static final MergedViewAdapter getViewAdapterIfExists(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(f16939a);
        if (tag instanceof MergedViewAdapter) {
            return (MergedViewAdapter) tag;
        }
        return null;
    }

    public static final int tagKey(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key.hashCode() | 50331648;
    }
}
