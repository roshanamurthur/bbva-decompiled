package com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.CommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu.InvalidCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu.InvalidP1;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu.InvalidP2;

/* JADX INFO: loaded from: classes10.dex */
public class ReadRecordCommandApdu extends CommandApdu {
    public static int LE_OFFSET = 4;

    public ReadRecordCommandApdu(byte[] bArr) {
        super(bArr);
        if (getType() != CommandApdu.Type.READ_RECORD) {
            throw new InvalidCommandApdu("Expected a READ_RECORD APDU, found: " + getType());
        }
        if (getP1() == 0) {
            throw new InvalidP1("Invalid Record Number - invalid P1: " + ((int) getP1()));
        }
        if ((getP2() & 7) != 4) {
            throw new InvalidP2("SFI value malformed - invalid P2: " + ((int) getP2()));
        }
        if (bArr[LE_OFFSET] == 0) {
            return;
        }
        throw new InvalidCommandApdu("Invalid LE field: " + ((int) bArr[LE_OFFSET]));
    }

    public final byte getRecordNumber() {
        return getP1();
    }

    public final byte getSfiNumber() {
        return (byte) (getP2() >>> 3);
    }
}
