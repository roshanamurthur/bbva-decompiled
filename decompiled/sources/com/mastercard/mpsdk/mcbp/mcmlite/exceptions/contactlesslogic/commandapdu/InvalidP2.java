package com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ResponseApduFactory;

/* JADX INFO: loaded from: classes10.dex */
public class InvalidP2 extends InvalidCommandApdu {
    public InvalidP2(String str) {
        super(str, ResponseApduFactory.wrongParameterP1P2());
    }
}
