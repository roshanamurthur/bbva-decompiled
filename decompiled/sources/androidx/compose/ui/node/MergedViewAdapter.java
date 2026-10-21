package androidx.compose.ui.node;

import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ViewInterop.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/node/MergedViewAdapter;", "Landroidx/compose/ui/node/ViewAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "", "id", "Lkotlin/Function0;", "factory", "get", "(ILkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/ViewAdapter;", "Landroid/view/View;", "view", "Landroid/view/ViewGroup;", "parent", "", "willInsert", "didInsert", "didUpdate", "", "a", "Ljava/util/List;", "getAdapters", "()Ljava/util/List;", "adapters", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getId", "()I", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,97:1\n116#2,2:98\n33#2,6:100\n118#2:106\n33#2,6:107\n33#2,6:113\n33#2,6:119\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n*L\n54#1:98,2\n54#1:100,6\n54#1:106\n62#1:107,6\n66#1:113,6\n70#1:119,6\n*E\n"})
public final class MergedViewAdapter implements ViewAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList f16871a = new ArrayList();

    @Override // androidx.compose.ui.node.ViewAdapter
    public void didInsert(@NotNull View view, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        ArrayList arrayList = this.f16871a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((ViewAdapter) arrayList.get(i10)).didInsert(view, parent);
        }
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public void didUpdate(@NotNull View view, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        ArrayList arrayList = this.f16871a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((ViewAdapter) arrayList.get(i10)).didUpdate(view, parent);
        }
    }

    @NotNull
    public final <T extends ViewAdapter> T get(int id, @NotNull Function0<? extends T> factory) {
        ViewAdapter viewAdapter;
        Intrinsics.checkNotNullParameter(factory, "factory");
        List<ViewAdapter> adapters = getAdapters();
        int size = adapters.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                viewAdapter = null;
                break;
            }
            viewAdapter = adapters.get(i10);
            if (viewAdapter.getId() == id) {
                break;
            }
            i10++;
        }
        T t10 = viewAdapter instanceof ViewAdapter ? (T) viewAdapter : null;
        if (t10 != null) {
            return t10;
        }
        T tInvoke = factory.invoke();
        getAdapters().add(tInvoke);
        return tInvoke;
    }

    @NotNull
    public final List<ViewAdapter> getAdapters() {
        return this.f16871a;
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public int getId() {
        return 0;
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public void willInsert(@NotNull View view, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        ArrayList arrayList = this.f16871a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((ViewAdapter) arrayList.get(i10)).willInsert(view, parent);
        }
    }
}
