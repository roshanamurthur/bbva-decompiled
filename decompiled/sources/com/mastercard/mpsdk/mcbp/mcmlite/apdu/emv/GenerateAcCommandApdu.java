package com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv;

import androidx.appcompat.widget.g0;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.CommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu.InvalidCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu.InvalidLc;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu.InvalidP1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class GenerateAcCommandApdu extends CommandApdu {
    public static final byte EXPECTED_LE = 0;
    public static final byte EXPECTED_P2 = 0;
    public static final int MIN_LC_VALUE = 45;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f50782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f50783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f50784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f50785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f50786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f50787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f50788i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f50789j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f50790k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte f50791l;
    public final byte[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f50792n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f50793o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f50794p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f50795q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f50796r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f50797s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f50798t;

    public GenerateAcCommandApdu(byte[] bArr) {
        super(bArr);
        if (getType() != CommandApdu.Type.GENERATE_AC) {
            throw new InvalidCommandApdu("Expected a GENERATE AC C-APDU, found: " + getType());
        }
        byte p4 = getP1();
        if ((p4 & 15) != 0 || (p4 & Constants.CVR_B2b87_11_RFU) == -64 || getP2() != 0) {
            throw new InvalidP1("Invalid P1 or P2 value: " + ((int) getP1()) + ", " + ((int) getP2()));
        }
        if (bArr[bArr.length - 1] != 0) {
            throw new InvalidCommandApdu("Invalid LE value for the GENERATE AC C-APDU");
        }
        short s4 = (short) (bArr[4] & 255);
        if (s4 < 45) {
            throw new InvalidLc(g0.c("Invalid LC for a GENERATE AC C-APDU: ", s4));
        }
        if (s4 + 6 != bArr.length) {
            throw new InvalidLc("Invalid GENERATE AC APDU length (does not match LC)");
        }
        byte p10 = getP1();
        int i10 = p10 & Constants.CVR_B2b87_11_RFU;
        this.f50795q = i10 == 0;
        this.f50796r = i10 == 64;
        this.f50797s = i10 == -128;
        this.f50798t = (p10 & 16) == 16;
        int i11 = (short) (bArr[4] & 255);
        byte[] bArr2 = new byte[i11];
        this.f50782c = bArr2;
        System.arraycopy(bArr, 5, bArr2, 0, i11);
        this.f50783d = Arrays.copyOfRange(bArr2, 0, 6);
        this.f50784e = Arrays.copyOfRange(bArr2, 6, 12);
        this.f50785f = Arrays.copyOfRange(bArr2, 12, 14);
        this.f50786g = Arrays.copyOfRange(bArr2, 14, 19);
        this.f50787h = Arrays.copyOfRange(bArr2, 19, 21);
        this.f50788i = Arrays.copyOfRange(bArr2, 21, 24);
        this.f50789j = Arrays.copyOfRange(bArr2, 24, 25);
        this.f50790k = Arrays.copyOfRange(bArr2, 25, 29);
        this.f50791l = bArr2[29];
        this.m = Arrays.copyOfRange(bArr2, 30, 32);
        this.f50792n = Arrays.copyOfRange(bArr2, 32, 40);
        this.f50793o = Arrays.copyOfRange(bArr2, 40, 43);
        this.f50794p = Arrays.copyOfRange(bArr2, 43, 45);
    }

    public final byte[] getAmountOther() {
        return this.f50784e;
    }

    public final byte[] getAuthorizedAmount() {
        return this.f50783d;
    }

    public final byte[] getCdol() {
        return this.f50782c;
    }

    public final byte[] getCvmResults() {
        return this.f50793o;
    }

    public final byte[] getDataAuthenticationCode() {
        return this.m;
    }

    public final byte[] getIccDynamicNumber() {
        return this.f50792n;
    }

    public final byte[] getMerchantCategoryCode() {
        return this.f50794p;
    }

    public final byte[] getTerminalCountryCode() {
        return this.f50785f;
    }

    public byte getTerminalType() {
        return this.f50791l;
    }

    public final byte[] getTerminalVerificationResults() {
        return this.f50786g;
    }

    public final byte[] getTransactionCurrencyCode() {
        return this.f50787h;
    }

    public final byte[] getTransactionDate() {
        return this.f50788i;
    }

    public final byte[] getTransactionType() {
        return this.f50789j;
    }

    public final byte[] getUnpredictableNumber() {
        return this.f50790k;
    }

    public final boolean isAacRequested() {
        return this.f50795q;
    }

    public final boolean isArqcRequested() {
        return this.f50797s;
    }

    public final boolean isCombinedDdaAcGenerationRequested() {
        return this.f50798t;
    }

    public final boolean isTcRequested() {
        return this.f50796r;
    }
}
