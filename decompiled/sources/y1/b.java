package y1;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ViewFactoryHolder<View> f94730p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ViewFactoryHolder<View> viewFactoryHolder) {
        super(0);
        this.f94730p0 = viewFactoryHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f94730p0.P0.saveHierarchyState(sparseArray);
        return sparseArray;
    }
}
