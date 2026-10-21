package com.mypinpad.tsdk.isolation;

import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class hf extends t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f56185g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f56186h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ArrayList<hc> f56187f;

    public hf() {
        super(setAnimation.setAutoSizeTextTypeUniformWithPresetSizes().setDividerPadding());
        this.f56187f = new ArrayList<>();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x01c5 A[LOOP:1: B:31:0x013e->B:34:0x01c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x01c8 A[EDGE_INSN: B:42:0x01c8->B:35:0x01c8 BREAK  A[LOOP:1: B:31:0x013e->B:34:0x01c5], SYNTHETIC] */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int onFocusChangeListener;
        int length;
        int i13;
        int i14;
        int i15;
        int i16 = ~i12;
        int i17 = ~(i16 | i10);
        int i18 = ~((~i10) | i11);
        int i19 = (((~(i10 | (~i11))) | i18 | i17) * 764) + (((~(i16 | i11)) | i18) * (-1528)) + ((i11 | i17) * 764) + (i11 * (-1527)) + (i10 * 765);
        if (i19 != 1) {
            if (i19 != 2) {
                hf hfVar = (hf) objArr[0];
                int i20 = f56185g;
                int i21 = (i20 ^ 89) + ((i20 & 89) << 1);
                f56186h = i21 % 128;
                int i22 = i21 % 2;
                ArrayList<hc> arrayList = hfVar.f56187f;
                if (i22 == 0) {
                    int i23 = 33 / 0;
                }
                int i24 = i20 & 111;
                int i25 = -(-((i20 ^ 111) | i24));
                int i26 = (i24 & i25) + (i25 | i24);
                f56186h = i26 % 128;
                if (i26 % 2 != 0) {
                    return arrayList;
                }
                throw null;
            }
            hf hfVar2 = (hf) objArr[0];
            ArrayList arrayList2 = new ArrayList();
            Iterator<hc> it = hfVar2.f56187f.iterator();
            int i27 = f56185g;
            int i28 = (i27 ^ 33) + ((33 & i27) << 1);
            f56186h = i28 % 128;
            int i29 = i28 % 2;
            while (it.hasNext()) {
                int i30 = f56185g;
                int i31 = (((i30 | 120) << 1) - (i30 ^ 120)) - 1;
                f56186h = i31 % 128;
                if (i31 % 2 == 0) {
                    hc next = it.next();
                    arrayList2.add((byte[]) hc.setCompoundDrawableTintBlendMode(new Object[]{next}, 1812981238, -1812981236, System.identityHashCode(next)));
                    throw null;
                }
                hc next2 = it.next();
                arrayList2.add((byte[]) hc.setCompoundDrawableTintBlendMode(new Object[]{next2}, 1812981238, -1812981236, System.identityHashCode(next2)));
                int i32 = f56185g;
                int i33 = i32 | 111;
                int i34 = i33 << 1;
                int i35 = -((~(i32 & 111)) & i33);
                int i36 = (i34 & i35) + (i35 | i34);
                f56186h = i36 % 128;
                int i37 = i36 % 2;
            }
            hfVar2.setX((byte[]) setInputExtras.setDividerPadding(new Object[]{arrayList2}, -822524174, 822524177, (int) System.currentTimeMillis()));
            byte[] dividerPadding = super.setDividerPadding();
            int i38 = f56186h;
            int i39 = i38 ^ 39;
            int i40 = -(-((i38 & 39) << 1));
            int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
            f56185g = i41 % 128;
            int i42 = i41 % 2;
            return dividerPadding;
        }
        hf hfVar3 = (hf) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i43 = f56185g;
        int i44 = (i43 & 95) + (i43 | 95);
        f56186h = i44 % 128;
        if (i44 % 2 == 0) {
            onFocusChangeListener = super.setOnFocusChangeListener(bArr, iIntValue);
            length = hfVar3.setCompoundDrawableTintBlendMode().length * 72;
            if (length > 0) {
                i13 = 1;
                i14 = i13;
                while (true) {
                    int i45 = i13 & 1;
                    int i46 = (i13 ^ 1) | i45;
                    i13 = ((i46 & i45) << 1) + (i45 ^ i46);
                    byte[] bArr2 = new byte[3];
                    byte[] bArr3 = new byte[3];
                    System.arraycopy(hfVar3.setCompoundDrawableTintBlendMode(), i14, bArr2, 0, 3);
                    System.arraycopy(hfVar3.setCompoundDrawableTintBlendMode(), ((i14 | 3) << 1) - (i14 ^ 3), bArr3, 0, 3);
                    int i47 = (i14 ^ 6) + ((i14 & 6) << 1);
                    activateSession.Companion companion = activateSession.INSTANCE;
                    activateSession activatesession = (activateSession) activateSession.Companion.setCompoundDrawableTintBlendMode(new Object[]{Byte.valueOf(hfVar3.setCompoundDrawableTintBlendMode()[i47])}, -1225863308, 1225863311, (int) System.currentTimeMillis());
                    int i48 = ((i47 | 1) << 1) - (i47 ^ 1);
                    ValueQualifier.Companion companion2 = ValueQualifier.INSTANCE;
                    ValueQualifier valueQualifier = (ValueQualifier) ValueQualifier.Companion.setDividerPadding(new Object[]{Byte.valueOf(hfVar3.setCompoundDrawableTintBlendMode()[i48])}, 365678160, -365678160, (int) System.currentTimeMillis());
                    int i49 = i48 & 1;
                    i15 = (((i48 ^ 1) | i49) << 1) - ((i48 | 1) & (~i49));
                    hfVar3.f56187f.add(new hc(bArr2, bArr3, activatesession, valueQualifier));
                    if (i13 >= length) {
                        break;
                    }
                    i14 = i15;
                }
            }
        } else {
            onFocusChangeListener = super.setOnFocusChangeListener(bArr, iIntValue);
            length = hfVar3.setCompoundDrawableTintBlendMode().length / 8;
            if (length > 0) {
                i13 = 0;
                i14 = i13;
                while (true) {
                    int i410 = i13 & 1;
                    int i411 = (i13 ^ 1) | i410;
                    i13 = ((i411 & i410) << 1) + (i410 ^ i411);
                    byte[] bArr4 = new byte[3];
                    byte[] bArr5 = new byte[3];
                    System.arraycopy(hfVar3.setCompoundDrawableTintBlendMode(), i14, bArr4, 0, 3);
                    System.arraycopy(hfVar3.setCompoundDrawableTintBlendMode(), ((i14 | 3) << 1) - (i14 ^ 3), bArr5, 0, 3);
                    int i412 = (i14 ^ 6) + ((i14 & 6) << 1);
                    activateSession.Companion companion3 = activateSession.INSTANCE;
                    activateSession activatesession2 = (activateSession) activateSession.Companion.setCompoundDrawableTintBlendMode(new Object[]{Byte.valueOf(hfVar3.setCompoundDrawableTintBlendMode()[i412])}, -1225863308, 1225863311, (int) System.currentTimeMillis());
                    int i413 = ((i412 | 1) << 1) - (i412 ^ 1);
                    ValueQualifier.Companion companion4 = ValueQualifier.INSTANCE;
                    ValueQualifier valueQualifier2 = (ValueQualifier) ValueQualifier.Companion.setDividerPadding(new Object[]{Byte.valueOf(hfVar3.setCompoundDrawableTintBlendMode()[i413])}, 365678160, -365678160, (int) System.currentTimeMillis());
                    int i414 = i413 & 1;
                    i15 = (((i413 ^ 1) | i414) << 1) - ((i413 | 1) & (~i414));
                    hfVar3.f56187f.add(new hc(bArr4, bArr5, activatesession2, valueQualifier2));
                    if (i13 >= length) {
                        break;
                        break;
                    }
                    i14 = i15;
                }
            }
        }
        int i50 = f56185g;
        int i51 = (-2) - (((i50 ^ 66) + ((i50 & 66) << 1)) ^ (-1));
        f56186h = i51 % 128;
        if (i51 % 2 != 0) {
            return Integer.valueOf(onFocusChangeListener);
        }
        throw null;
    }

    @NotNull
    public final ArrayList<hc> getNavBarTitleString() {
        return (ArrayList) setDividerPadding(new Object[]{this}, 1444915724, -1444915724, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList, com.mypinpad.tsdk.isolation.setLeftTopRightBottom
    public final int setOnFocusChangeListener(@Nullable byte[] bArr, int i10) {
        return ((Integer) setDividerPadding(new Object[]{this, bArr, Integer.valueOf(i10)}, 569588592, -569588591, i10)).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList
    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setDividerPadding(new Object[]{this}, -807503455, 807503457, System.identityHashCode(this));
    }
}
