package com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ResponseApduFactory;

/* JADX INFO: loaded from: classes10.dex */
public class InvalidP1 extends InvalidCommandApdu {
    public InvalidP1(String str) {
        super(str, ResponseApduFactory.wrongParameterP1P2());
    }
}
