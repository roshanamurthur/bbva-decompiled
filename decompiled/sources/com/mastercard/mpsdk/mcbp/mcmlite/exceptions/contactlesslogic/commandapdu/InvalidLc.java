package com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ResponseApduFactory;

/* JADX INFO: loaded from: classes10.dex */
public class InvalidLc extends InvalidCommandApdu {
    public InvalidLc(String str) {
        super(str, ResponseApduFactory.wrongDataLength());
    }
}
