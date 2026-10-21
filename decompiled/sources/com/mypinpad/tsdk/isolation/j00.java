package com.mypinpad.tsdk.isolation;

import android.os.Messenger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "setY", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class j00 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f56576r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f56577s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ IsolatedService f56578p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Messenger f56579q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j00(IsolatedService isolatedService, Messenger messenger) {
        super(1);
        this.f56578p0 = isolatedService;
        this.f56579q0 = messenger;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = ~(i13 | i14);
        int i16 = ~i10;
        int i17 = ((i15 | (~(i16 | i12))) * (-370)) + (i11 * 371) + (i10 * 371);
        int i18 = (~(i12 | i13)) | (~(i16 | i14));
        int i19 = ~(i10 | i11);
        if ((i19 * 370) + ((i18 | i19) * (-370)) + i17 != 1) {
            j00 j00Var = (j00) objArr[0];
            String str = (String) objArr[1];
            Intrinsics.checkNotNullParameter(str, "");
            IsolatedService.setOnFocusChangeListener(new Object[]{j00Var.f56578p0, j00Var.f56579q0, new wu(str), xk.setOnLongClickListener}, 1513774517, -1513774510, (int) System.currentTimeMillis());
            int i20 = f56577s0;
            int i21 = ((i20 ^ 27) | (i20 & 27)) << 1;
            int i22 = -(((~i20) & 27) | (i20 & (-28)));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            f56576r0 = i23 % 128;
            if (i23 % 2 == 0) {
                return null;
            }
            throw null;
        }
        j00 j00Var2 = (j00) objArr[0];
        Object obj = objArr[1];
        int i24 = f56576r0 + 9;
        f56577s0 = i24 % 128;
        String str2 = (String) obj;
        if (i24 % 2 == 0) {
            a(new Object[]{j00Var2, str2}, 303890338, -303890338, System.identityHashCode(j00Var2));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        a(new Object[]{j00Var2, str2}, 303890338, -303890338, System.identityHashCode(j00Var2));
        Unit unit2 = Unit.INSTANCE;
        int i25 = f56576r0;
        int i26 = i25 & 95;
        int i27 = (i25 ^ 95) | i26;
        int i28 = (i26 & i27) + (i27 | i26);
        f56577s0 = i28 % 128;
        if (i28 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        return a(new Object[]{this, str}, -755234595, 755234596, System.identityHashCode(this));
    }
}
