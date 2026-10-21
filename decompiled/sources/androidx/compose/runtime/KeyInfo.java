package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/KeyInfo;", "", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getKey", "()I", "key", "b", "Ljava/lang/Object;", "getObjectKey", "()Ljava/lang/Object;", "objectKey", "c", "getLocation", "location", "d", "getNodes", "nodes", "e", "getIndex", FirebaseAnalytics.Param.INDEX, "<init>", "(ILjava/lang/Object;III)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class KeyInfo {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Object objectKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int location;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int nodes;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int index;

    public KeyInfo(int i10, @Nullable Object obj, int i11, int i12, int i13) {
        this.key = i10;
        this.objectKey = obj;
        this.location = i11;
        this.nodes = i12;
        this.index = i13;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getKey() {
        return this.key;
    }

    public final int getLocation() {
        return this.location;
    }

    public final int getNodes() {
        return this.nodes;
    }

    @Nullable
    public final Object getObjectKey() {
        return this.objectKey;
    }
}
