package com.mypinpad.tsdk.isolation;

import android.os.Messenger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "setX", "(Z)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class k00 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f56739r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f56740s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ IsolatedService f56741p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Messenger f56742q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k00(IsolatedService isolatedService, Messenger messenger) {
        super(1);
        this.f56741p0 = isolatedService;
        this.f56742q0 = messenger;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        int i13 = ~i10;
        int i14 = ~(i13 | i12);
        int i15 = ~i12;
        int i16 = ((i14 | (~(i15 | i11))) * (-1808)) + (i11 * (-903)) + (i10 * 905);
        int i17 = ~i11;
        int i18 = i10 | i15;
        if ((((~i18) | (~(i11 | i13)) | (~(i12 | i17))) * 904) + (((~(i18 | i11)) | (~(i13 | i17 | i12))) * 904) + i16 != 1) {
            k00 k00Var = (k00) objArr[0];
            IsolatedService.setOnFocusChangeListener(new Object[]{k00Var.f56741p0, k00Var.f56742q0, new wj(((Boolean) objArr[1]).booleanValue())}, -2024684754, 2024684762, (int) System.currentTimeMillis());
            int i19 = f56740s0;
            int i20 = ((i19 & 96) + (i19 | 96)) - 1;
            f56739r0 = i20 % 128;
            int i21 = i20 % 2;
            return null;
        }
        k00 k00Var2 = (k00) objArr[0];
        Object obj = objArr[1];
        int i22 = f56740s0;
        int i23 = i22 & 117;
        int i24 = (i22 ^ 117) | i23;
        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
        f56739r0 = i25 % 128;
        int i26 = i25 % 2;
        a(new Object[]{k00Var2, Boolean.valueOf(((Boolean) obj).booleanValue())}, 184484339, -184484339, System.identityHashCode(k00Var2));
        Unit unit = Unit.INSTANCE;
        int i27 = f56739r0 + 17;
        f56740s0 = i27 % 128;
        int i28 = i27 % 2;
        return unit;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        return a(new Object[]{this, bool}, -1973372506, 1973372507, System.identityHashCode(this));
    }
}
