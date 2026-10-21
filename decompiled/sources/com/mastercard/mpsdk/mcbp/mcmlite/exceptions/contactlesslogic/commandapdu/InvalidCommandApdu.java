package com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ResponseApduFactory;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.ContactlessLogicException;

/* JADX INFO: loaded from: classes10.dex */
public class InvalidCommandApdu extends ContactlessLogicException {
    public InvalidCommandApdu(String str) {
        super(str, ResponseApduFactory.softwareUnknown());
    }

    public InvalidCommandApdu(String str, byte[] bArr) {
        super(str, bArr);
    }
}
