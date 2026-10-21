package com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv;

import androidx.appcompat.widget.g0;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.CommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu.InvalidCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu.InvalidLc;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu.InvalidP1;

/* JADX INFO: loaded from: classes10.dex */
public final class SelectCommandApdu extends CommandApdu {
    public static final byte EXPECTED_LE = 0;
    public static final byte EXPECTED_P1 = 4;
    public static final byte EXPECTED_P2 = 0;
    public static final byte MAX_LC = 16;
    public static final byte MIN_LC = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f50805c;

    public SelectCommandApdu(byte[] bArr) {
        super(bArr);
        if (getType() != CommandApdu.Type.SELECT) {
            throw new InvalidCommandApdu("Expected a SELECT C-APDU, found: " + getType());
        }
        if (getP1() != 4 || getP2() != 0) {
            throw new InvalidP1("Invalid P1 or P2 value: " + ((int) getP1()) + ", " + ((int) getP2()));
        }
        if (bArr[bArr.length - 1] != 0) {
            throw new InvalidCommandApdu("Invalid LE value for the SELECT C-APDU");
        }
        int i10 = bArr[4] & 255;
        if (i10 < 5 || i10 > 16) {
            throw new InvalidLc(g0.c("Invalid LC for a SELECT C-APDU: ", i10));
        }
        if (i10 + 6 != bArr.length) {
            throw new InvalidLc("Invalid SELECT APDU length (does not match LC info)");
        }
        byte[] bArr2 = new byte[i10];
        this.f50805c = bArr2;
        System.arraycopy(bArr, 5, bArr2, 0, i10);
    }

    public final byte[] getFileName() {
        return this.f50805c;
    }
}
