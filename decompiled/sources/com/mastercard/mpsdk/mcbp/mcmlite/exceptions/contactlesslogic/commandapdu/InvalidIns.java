package com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ResponseApduFactory;

/* JADX INFO: loaded from: classes10.dex */
public class InvalidIns extends InvalidCommandApdu {
    public InvalidIns(String str) {
        super(str, ResponseApduFactory.instructionCodeNotSupported());
    }
}
