package com.mypinpad.tsdk.isolation;

import androidx.appcompat.app.i;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class fp extends t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f55566i = {i.d(fp.class, "sfi_B1b8b4", "getSfi_B1b8b4()B", 0), i.d(fp.class, "recordNumberFlag_B1b3b1", "getRecordNumberFlag_B1b3b1()Lcom/mypinpad/softpos/emv/terminal/kernel/kernel13/model/smarttag/tag/card/RecordNumberFlag;", 0), i.d(fp.class, "recordNumber_B2", "getRecordNumber_B2()B", 0)};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f55567j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f55568k = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final m f55569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final n f55570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final p f55571h;

    static {
        int i10 = f55567j + 31;
        f55568k = i10 % 128;
        int i11 = i10 % 2;
    }

    public fp() {
        super(setAnimation.getScope().setDividerPadding());
        this.f55569f = new m();
        fw.Companion companion = fw.INSTANCE;
        this.f55570g = new n(0, 2, 0, (openContextMenu) fw.Companion.setX(new Object[0], -1048160494, 1048160494, (int) System.currentTimeMillis()));
        this.f55571h = new p(1);
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        int i16 = (i15 * 446) + (((~(i10 | i14 | i12)) | (~(i11 | i13))) * 446) + (((~((~i12) | i14)) | i15) * 446) + (i11 * (-445)) + (i10 * (-445));
        KProperty<Object>[] kPropertyArr = f55566i;
        if (i16 == 1) {
            fp fpVar = (fp) objArr[0];
            int i17 = f55567j;
            int i18 = (i17 & 111) + (i17 | 111);
            f55568k = i18 % 128;
            int i19 = i18 % 2;
            m mVar = fpVar.f55569f;
            byte bByteValue = ((Byte) m.setCompoundDrawableTintBlendMode(new Object[]{mVar, fpVar, kPropertyArr[0]}, 1820788324, -1820788324, System.identityHashCode(mVar))).byteValue();
            int i20 = f55568k;
            int i21 = i20 & 9;
            int i22 = (i21 - (~((i20 ^ 9) | i21))) - 1;
            f55567j = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 2 / 0;
            }
            return Byte.valueOf(bByteValue);
        }
        if (i16 != 2) {
            fp fpVar2 = (fp) objArr[0];
            int i24 = f55567j + 81;
            f55568k = i24 % 128;
            int i25 = i24 % 2;
            p pVar = fpVar2.f55571h;
            byte bByteValue2 = ((Byte) p.setX(new Object[]{pVar, fpVar2, kPropertyArr[2]}, -681277519, 681277519, System.identityHashCode(pVar))).byteValue();
            int i26 = f55567j;
            int i27 = (i26 ^ 53) + ((i26 & 53) << 1);
            f55568k = i27 % 128;
            int i28 = i27 % 2;
            return Byte.valueOf(bByteValue2);
        }
        fp fpVar3 = (fp) objArr[0];
        int i29 = f55568k;
        int i30 = i29 ^ 35;
        int i31 = -(-((i29 & 35) << 1));
        int i32 = (i30 & i31) + (i31 | i30);
        f55567j = i32 % 128;
        int i33 = i32 % 2;
        n nVar = fpVar3.f55570g;
        fw fwVar = (fw) ((Enum) n.setCompoundDrawableTintBlendMode(new Object[]{nVar, fpVar3, kPropertyArr[1]}, 2052976211, -2052976210, System.identityHashCode(nVar)));
        int i34 = f55567j + 116;
        int i35 = (i34 ^ (-1)) + (i34 << 1);
        f55568k = i35 % 128;
        int i36 = i35 % 2;
        return fwVar;
    }

    public final byte getNavBarTitleString() {
        return ((Byte) setOnFocusChangeListener(new Object[]{this}, -1633020428, 1633020429, System.identityHashCode(this))).byteValue();
    }

    @NotNull
    public final fw setLayoutAnimation() {
        return (fw) setOnFocusChangeListener(new Object[]{this}, -160229187, 160229189, System.identityHashCode(this));
    }

    public final byte setNavigationOnClickListener() {
        return ((Byte) setOnFocusChangeListener(new Object[]{this}, 969365535, -969365535, System.identityHashCode(this))).byteValue();
    }
}
