package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;

/* JADX INFO: compiled from: TrieNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\t\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\"\u0014\u0010\u0004\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0006\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"", FirebaseAnalytics.Param.INDEX, "shift", "indexSegment", "MAX_BRANCHING_FACTOR", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "LOG_MAX_BRANCHING_FACTOR", "MAX_BRANCHING_FACTOR_MINUS_ONE", "MAX_SHIFT", "runtime_release"}, k = 2, mv = {1, 8, 0})
public final class TrieNodeKt {
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 32;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
    public static final int MAX_SHIFT = 30;

    public static final Object[] access$addElementAtIndex(Object[] objArr, int i10, Object obj) {
        Object[] objArr2 = new Object[objArr.length + 1];
        ArraysKt___ArraysJvmKt.copyInto$default(objArr, objArr2, 0, 0, i10, 6, (Object) null);
        ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, i10 + 1, i10, objArr.length);
        objArr2[i10] = obj;
        return objArr2;
    }

    public static final Object[] access$removeCellAtIndex(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ArraysKt___ArraysJvmKt.copyInto$default(objArr, objArr2, 0, 0, i10, 6, (Object) null);
        ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, i10, i10 + 1, objArr.length);
        return objArr2;
    }

    public static final int indexSegment(int i10, int i11) {
        return (i10 >> i11) & 31;
    }
}
