package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0007ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0007ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019"}, d2 = {"Lcom/mypinpad/tsdk/i/setWillNotCacheDrawing;", "", "Lkotlin/UInt;", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setX", "()I", "", "b", "D", "setCompoundDrawableTintBlendMode", "()D", "setDividerPadding", "p0", "p1", "<init>", "(IDLkotlin/jvm/internal/DefaultConstructorMarker;)V"}, k = 1, mv = {1, 5, 1})
public final class setWillNotCacheDrawing {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int setX;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final double setDividerPadding;

    public setWillNotCacheDrawing(int i10, double d2, DefaultConstructorMarker defaultConstructorMarker) {
        this.setX = i10;
        this.setDividerPadding = d2;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ((i11 | i13) * (-1434)) + (i11 * 1435) + (i10 * (-716));
        int i15 = ~i12;
        int i16 = ~(i15 | i11);
        int i17 = ~(i10 | i11);
        int i18 = i13 | (~i11);
        return (((i17 | (~(i18 | i15))) | (~(i11 | i12))) * 717) + ((((i16 | i17) | (~(i18 | i12))) * 717) + i14) != 1 ? Integer.valueOf(((setWillNotCacheDrawing) objArr[0]).setX) : Double.valueOf(((setWillNotCacheDrawing) objArr[0]).setDividerPadding);
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final double setCompoundDrawableTintBlendMode() {
        return ((Double) setOnFocusChangeListener(new Object[]{this}, -1209949171, 1209949172, System.identityHashCode(this))).doubleValue();
    }

    @JvmName(name = "setX")
    public final int setX() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, 333209654, -333209654, System.identityHashCode(this))).intValue();
    }
}
