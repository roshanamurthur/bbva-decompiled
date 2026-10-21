package com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.CommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu.ConditionsOfUseNotSatisfied;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu.InvalidCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu.InvalidLc;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu.InvalidP1;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;

/* JADX INFO: loaded from: classes10.dex */
public class GetProcessingOptionsCommandApdu extends CommandApdu {
    public static final byte COMMAND_TEMPLATE_TAG = -125;
    public static final byte EXPECTED_LE = 0;
    public static final byte EXPECTED_P1 = 0;
    public static final byte EXPECTED_P2 = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f50801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f50802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f50803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f50804f;

    public GetProcessingOptionsCommandApdu(byte[] bArr, DolRequestList dolRequestList) {
        super(bArr);
        if (getType() != CommandApdu.Type.GET_PROCESSING_OPTIONS) {
            throw new InvalidCommandApdu("Expected a GPO C-APDU, found: " + getType());
        }
        if (getP1() != 0 || getP2() != 0) {
            throw new InvalidP1("Invalid P1 or P2 value: " + ((int) getP1()) + ", " + ((int) getP2()));
        }
        int i10 = 1;
        if (bArr[bArr.length - 1] != 0) {
            throw new InvalidCommandApdu("Invalid LE value for the GPO C-APDU");
        }
        int i11 = (short) (bArr[4] & 255);
        if (i11 + 6 != bArr.length) {
            throw new InvalidLc("Invalid ComputeCC C-APDU length (does not match LC info)");
        }
        byte[] bArr2 = new byte[i11];
        byte b10 = 0;
        System.arraycopy(bArr, 5, bArr2, 0, i11);
        if (bArr2[0] != -125) {
            throw new ConditionsOfUseNotSatisfied("GPO C-APDU: Invalid C-DATA Tag");
        }
        int i12 = bArr[6] & 255;
        if (i12 == 129) {
            i10 = 2;
        } else if (i12 >= 129) {
            throw new InvalidLc("GPO C-APDU: Invalid C-DATA Length");
        }
        int i13 = i10 + 1;
        byte b11 = (byte) i13;
        int i14 = (short) (bArr2[i10] & 255);
        if (i11 - i14 != i13) {
            throw new InvalidLc("GPO C-APDU: Invalid C-DATA Length");
        }
        byte[] bArr3 = new byte[i14];
        this.f50804f = bArr3;
        System.arraycopy(bArr2, b11, bArr3, 0, i14);
        DolValues dolValuesOf = DolValues.of(dolRequestList, bArr3);
        if (dolRequestList == null) {
            throw new InvalidLc("GPO C-APDU: Invalid PDOL list length");
        }
        if (dolRequestList.getExpectedDolLength() != (bArr2[i10] & 255)) {
            throw new InvalidLc("GPO C-APDU: Invalid PDOL list length");
        }
        byte[] valueByTag = dolValuesOf.getValueByTag("9F35");
        if (valueByTag != null && valueByTag.length != 0) {
            b10 = valueByTag[0];
        }
        this.f50801c = b10;
        this.f50802d = dolValuesOf.getValueByTag("9F1D");
        this.f50803e = dolValuesOf.getValueByTag("9F1A");
        if (McmLiteUtils.isTerminalOffline(getTerminalType())) {
            throw new ConditionsOfUseNotSatisfied("Terminal is OffLine only");
        }
    }

    public final byte[] getPdol() {
        return this.f50804f;
    }

    public final byte[] getTerminalCountryCode() {
        return this.f50803e;
    }

    public final byte[] getTerminalRiskManagementData() {
        return this.f50802d;
    }

    public final byte getTerminalType() {
        return this.f50801c;
    }
}
