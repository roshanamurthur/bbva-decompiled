package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class cn extends t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f54829g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f54830h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ArrayList f54831f;

    public cn() {
        super(setAnimation.getHoldTime().setDividerPadding());
        this.f54831f = new ArrayList();
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int onFocusChangeListener;
        int i13;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ((~(i14 | i15)) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + (i11 * (-209)) + (i10 * (-209));
        int i17 = ~i12;
        if ((((~(i10 | i15 | i12)) | (~(i11 | i14 | i17))) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + (((~(i15 | i17)) | (~(i14 | i12))) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + i16 != 1) {
            cn cnVar = (cn) objArr[0];
            int i18 = f54829g;
            int i19 = i18 & 3;
            int i20 = -(-((i18 ^ 3) | i19));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            f54830h = i21 % 128;
            int i22 = i21 % 2;
            ArrayList arrayList = cnVar.f54831f;
            if (i22 != 0) {
                return arrayList;
            }
            int i23 = 7 / 0;
            return arrayList;
        }
        cn cnVar2 = (cn) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i24 = f54830h + 71;
        f54829g = i24 % 128;
        if (i24 % 2 != 0) {
            onFocusChangeListener = super.setOnFocusChangeListener(bArr, iIntValue);
            i13 = 1;
        } else {
            onFocusChangeListener = super.setOnFocusChangeListener(bArr, iIntValue);
            i13 = 0;
        }
        while (i13 < cnVar2.setCompoundDrawableTintBlendMode().length) {
            co coVar = new co(cnVar2.setCompoundDrawableTintBlendMode(), i13);
            byte bByteValue = ((Byte) co.setX(new Object[]{coVar}, -1540617402, 1540617405, System.identityHashCode(coVar))).byteValue();
            int i25 = (bByteValue & (-4)) | ((~bByteValue) & 3);
            int i26 = (bByteValue & 3) << 1;
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            int i28 = i13 | i27;
            int i29 = i28 << 1;
            int i30 = -((~(i13 & i27)) & i28);
            i13 = (i30 | i29) + (i29 & i30);
            cnVar2.f54831f.add(coVar);
            int i31 = f54830h;
            int i32 = (i31 ^ 35) + ((i31 & 35) << 1);
            f54829g = i32 % 128;
            int i33 = i32 % 2;
        }
        int i34 = f54830h;
        int i35 = ((i34 ^ 98) + ((i34 & 98) << 1)) - 1;
        f54829g = i35 % 128;
        if (i35 % 2 == 0) {
            return Integer.valueOf(onFocusChangeListener);
        }
        int i36 = 2 / 0;
        return Integer.valueOf(onFocusChangeListener);
    }

    @NotNull
    public final List<co> setNavigationOnClickListener() {
        return (List) setDividerPadding(new Object[]{this}, -2019104287, 2019104287, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList, com.mypinpad.tsdk.isolation.setLeftTopRightBottom
    public final int setOnFocusChangeListener(@Nullable byte[] bArr, int i10) {
        return ((Integer) setDividerPadding(new Object[]{this, bArr, Integer.valueOf(i10)}, -1855675278, 1855675279, i10)).intValue();
    }
}
