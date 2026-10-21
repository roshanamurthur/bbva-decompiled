package com.mypinpad.tsdk.isolation;

import com.mypinpad.tsdk.api.Terminal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setY", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class x00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61706r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f61707s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Terminal, rl, Unit> f61708p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ vr f61709q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x00(Function2<? super Terminal, ? super rl, Unit> function2, vr vrVar) {
        super(0);
        this.f61708p0 = function2;
        this.f61709q0 = vrVar;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11) {
        int i12 = ~i10;
        if (((i10 | i11) * 624) + ((i12 | i11) * 624) + (i12 * (-624)) + (i11 * (-623)) + (i10 * (-623)) == 1) {
            x00 x00Var = (x00) objArr[0];
            Function2<Terminal, rl, Unit> function2 = x00Var.f61708p0;
            vk vkVar = (vk) x00Var.f61709q0;
            function2.invoke(null, new tc(vkVar.setX(), vkVar.setOnFocusChangeListener()));
            int i13 = f61706r0;
            int i14 = (-2) - ((((i13 | 44) << 1) - (i13 ^ 44)) ^ (-1));
            f61707s0 = i14 % 128;
            int i15 = i14 % 2;
            return null;
        }
        x00 x00Var2 = (x00) objArr[0];
        int i16 = f61707s0 + 101;
        f61706r0 = i16 % 128;
        if (i16 % 2 != 0) {
            System.identityHashCode(x00Var2);
            a(new Object[]{x00Var2}, -1454481941, 1454481942);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        System.identityHashCode(x00Var2);
        a(new Object[]{x00Var2}, -1454481941, 1454481942);
        Unit unit2 = Unit.INSTANCE;
        int i17 = f61706r0;
        int i18 = (i17 ^ 75) + ((i17 & 75) << 1);
        f61707s0 = i18 % 128;
        if (i18 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Unit invoke() {
        Object[] objArr = {this};
        System.identityHashCode(this);
        return a(objArr, 909397837, -909397837);
    }
}
