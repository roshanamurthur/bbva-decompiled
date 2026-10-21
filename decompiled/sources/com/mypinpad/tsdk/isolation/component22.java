package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/component22;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setY", "()I", "setDividerPadding", "", "p1", "", "p2", "<init>", "(ILjava/lang/String;Ljava/lang/Throwable;)V"}, k = 1, mv = {1, 5, 1})
public abstract class component22 extends RuntimeException {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f54869q0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int setDividerPadding;

    public /* synthetic */ component22(int i10, String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : th2);
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        component22 component22Var = (component22) objArr[0];
        int i13 = f54869q0;
        int i14 = i13 & 75;
        int i15 = (i13 ^ 75) | i14;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        int i17 = i16 % 128;
        int i18 = i16 % 2;
        int i19 = component22Var.setDividerPadding;
        if (i18 == 0) {
            int i20 = 29 / 0;
        }
        int i21 = i17 + 54;
        int i22 = (i21 ^ (-1)) + (i21 << 1);
        f54869q0 = i22 % 128;
        if (i22 % 2 == 0) {
            return Integer.valueOf(i19);
        }
        throw null;
    }

    @JvmName(name = "setY")
    public final int setY() {
        return ((Integer) setDividerPadding(new Object[]{this}, 641547583, -641547583, System.identityHashCode(this))).intValue();
    }

    public component22(int i10, @Nullable String str, @Nullable Throwable th2) {
        String strValueOf;
        if (str != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append(": ");
            sb2.append((Object) str);
            strValueOf = sb2.toString();
        } else {
            strValueOf = String.valueOf(i10);
        }
        super(strValueOf, th2);
        this.setDividerPadding = i10;
    }
}
