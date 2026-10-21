package com.mypinpad.tsdk.isolation;

import androidx.camera.core.impl.utils.c;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class hd extends t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f56179i = {c.e(hd.class, "onDeviceCardholderVerificationSupported_B1b6", "getOnDeviceCardholderVerificationSupported_B1b6()Z", 0), c.e(hd.class, "relayResistanceProtocolSupported_B1b5", "getRelayResistanceProtocolSupported_B1b5()Z", 0), c.e(hd.class, "readAllRecordsEvenWhenNoCda_B1b3", "getReadAllRecordsEvenWhenNoCda_B1b3()Z", 0)};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56180j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f56181k = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f56182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final h f56183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final h f56184h;

    static {
        int i10 = f56180j;
        int i11 = ((i10 | 53) << 1) - (i10 ^ 53);
        f56181k = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public hd() {
        super(setAnimation.setScrollBarStyle().setDividerPadding());
        this.f56182f = new h(0, 5);
        this.f56183g = new h(0, 4);
        this.f56184h = new h(0, 2);
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object onFocusChangeListener;
        int i13 = ~((~i10) | i11);
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~i12;
        int i17 = (((~(i11 | i16)) | (~(i12 | i14)) | i13) * 988) + (((~(i10 | i16)) | i15) * (-1976)) + ((i12 | i13) * 988) + (i11 * 989) + (i10 * (-1975));
        KProperty<Object>[] kPropertyArr = f56179i;
        if (i17 == 1) {
            hd hdVar = (hd) objArr[0];
            int i18 = f56181k + 125;
            f56180j = i18 % 128;
            if (i18 % 2 != 0) {
                h hVar = hdVar.f56183g;
                onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar, hdVar, kPropertyArr[0]}, -709183664, 709183665, System.identityHashCode(hVar));
            } else {
                h hVar2 = hdVar.f56183g;
                onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar2, hdVar, kPropertyArr[1]}, -709183664, 709183665, System.identityHashCode(hVar2));
            }
            return Boolean.valueOf(((Boolean) onFocusChangeListener).booleanValue());
        }
        if (i17 != 2) {
            hd hdVar2 = (hd) objArr[0];
            int i19 = f56181k;
            int i20 = (i19 | 47) << 1;
            int i21 = -(i19 ^ 47);
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            f56180j = i22 % 128;
            int i23 = i22 % 2;
            h hVar3 = hdVar2.f56184h;
            return Boolean.valueOf(((Boolean) (i23 != 0 ? h.setOnFocusChangeListener(new Object[]{hVar3, hdVar2, kPropertyArr[2]}, -709183664, 709183665, System.identityHashCode(hVar3)) : h.setOnFocusChangeListener(new Object[]{hVar3, hdVar2, kPropertyArr[2]}, -709183664, 709183665, System.identityHashCode(hVar3)))).booleanValue());
        }
        hd hdVar3 = (hd) objArr[0];
        int i24 = f56181k;
        int i25 = (i24 & 85) + (i24 | 85);
        f56180j = i25 % 128;
        int i26 = i25 % 2;
        h hVar4 = hdVar3.f56182f;
        boolean zBooleanValue = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar4, hdVar3, kPropertyArr[0]}, -709183664, 709183665, System.identityHashCode(hVar4))).booleanValue();
        int i27 = f56180j;
        int i28 = (i27 & 85) + (i27 | 85);
        f56181k = i28 % 128;
        if (i28 % 2 != 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        throw null;
    }

    public final boolean getNavBarTitleString() {
        return ((Boolean) setY(new Object[]{this}, 1474832131, -1474832130, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setLayoutAnimation() {
        return ((Boolean) setY(new Object[]{this}, 701423058, -701423056, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setNavigationOnClickListener() {
        return ((Boolean) setY(new Object[]{this}, 136707458, -136707458, System.identityHashCode(this))).booleanValue();
    }
}
