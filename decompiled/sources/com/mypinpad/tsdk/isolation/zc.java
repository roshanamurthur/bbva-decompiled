package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/zc;", "Lcom/mypinpad/tsdk/i/yl;", "Lcom/mypinpad/tsdk/i/yl$setCompoundDrawableTintBlendMode;", "p0", "Lcom/mypinpad/tsdk/i/yr;", "setX", "(Lcom/mypinpad/tsdk/i/yl$setCompoundDrawableTintBlendMode;)Lcom/mypinpad/tsdk/i/yr;", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class zc implements yl {

    @NotNull
    public static final zc INSTANCE = new zc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f62305a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f62306b = 1;

    static {
        int i10 = f62306b;
        int i11 = (i10 ^ 55) + ((i10 & 55) << 1);
        f62305a = i11 % 128;
        int i12 = i11 % 2;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        yl.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (yl.setCompoundDrawableTintBlendMode) objArr[1];
        int i13 = ((-1) << 1) - ((f62305a + 36) ^ (-1));
        f62306b = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(setcompounddrawabletintblendmode, "");
        zs zsVar = (zs) setcompounddrawabletintblendmode;
        zj zjVar = (zj) zs.setCompoundDrawableTintBlendMode(new Object[]{zsVar}, 155528025, -155528023, System.identityHashCode(zsVar));
        zs zsVar2 = (zs) zs.setCompoundDrawableTintBlendMode(new Object[]{zsVar, 0, (zg) zj.setDividerPadding(new Object[]{zjVar, zsVar}, 1841712575, -1841712560, System.identityHashCode(zjVar)), null, 0, 0, 0, 61}, -711435087, 711435088, 0);
        yr yrVar = (yr) zs.setCompoundDrawableTintBlendMode(new Object[]{zsVar2, (yk) zs.setCompoundDrawableTintBlendMode(new Object[]{zsVar}, 541338608, -541338597, System.identityHashCode(zsVar))}, -173228024, 173228032, System.identityHashCode(zsVar2));
        int i15 = f62306b;
        int i16 = (i15 ^ 33) + ((i15 & 33) << 1);
        f62305a = i16 % 128;
        int i17 = i16 % 2;
        return yrVar;
    }

    @Override // com.mypinpad.tsdk.isolation.yl
    @NotNull
    public final yr setX(@NotNull yl.setCompoundDrawableTintBlendMode p4) throws IOException {
        return (yr) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, 1750893473, -1750893473, System.identityHashCode(this));
    }
}
