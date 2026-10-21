package com.mypinpad.tsdk.isolation;

import android.os.Messenger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "setY", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class l00 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f56880r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f56881s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ IsolatedService f56882p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Messenger f56883q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l00(IsolatedService isolatedService, Messenger messenger) {
        super(1);
        this.f56882p0 = isolatedService;
        this.f56883q0 = messenger;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = (((~(i14 | i12)) | (~(i13 | i14)) | (~(i13 | i12))) * (-880)) + (i11 * 881) + (i10 * 881);
        int i16 = i11 | (~(i13 | (~i12)));
        int i17 = ~(i10 | i12);
        if ((i17 * 880) + ((i16 | i17) * (-880)) + i15 == 1) {
            l00 l00Var = (l00) objArr[0];
            String str = (String) objArr[1];
            Intrinsics.checkNotNullParameter(str, "");
            IsolatedService.setOnFocusChangeListener(new Object[]{l00Var.f56882p0, l00Var.f56883q0, new vw(str), xk.setOnLongClickListener}, 1513774517, -1513774510, (int) System.currentTimeMillis());
            int i18 = f56881s0;
            int i19 = (-2) - (((i18 & 92) + (i18 | 92)) ^ (-1));
            f56880r0 = i19 % 128;
            int i20 = i19 % 2;
            return null;
        }
        l00 l00Var2 = (l00) objArr[0];
        Object obj = objArr[1];
        int i21 = f56880r0;
        int i22 = i21 & 39;
        int i23 = (i21 | 39) & (~i22);
        int i24 = i22 << 1;
        int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
        f56881s0 = i25 % 128;
        int i26 = i25 % 2;
        a(new Object[]{l00Var2, (String) obj}, -570742840, 570742841, System.identityHashCode(l00Var2));
        Unit unit = Unit.INSTANCE;
        int i27 = f56880r0;
        int i28 = (((i27 | 50) << 1) - (i27 ^ 50)) - 1;
        f56881s0 = i28 % 128;
        int i29 = i28 % 2;
        return unit;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        return a(new Object[]{this, str}, -1425893951, 1425893951, System.identityHashCode(this));
    }
}
