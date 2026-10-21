package com.mastercard.mpsdk.mcbp.mcmlite.impl.output;

import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.McmLiteInvalidInput;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless.ContactlessTransactionContext;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.CdCvmSupport;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactionlogging.ContactlessLog;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;

/* JADX INFO: loaded from: classes10.dex */
public final class ContactlessLogImpl implements ContactlessLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f50878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f50879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f50880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f50881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f50882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f50883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TransactionSummary f50884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f50885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f50886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TerminalInformation f50887j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TransactionInformation f50888k;

    public ContactlessLogImpl(ContactlessTransactionContext contactlessTransactionContext, TerminalInformation terminalInformation, TransactionInformation transactionInformation, byte[] bArr, byte[] bArr2) {
        this.f50878a = McmLiteUtils.copyValue(contactlessTransactionContext.getUnpredictableNumber());
        this.f50879b = McmLiteUtils.copyValue(contactlessTransactionContext.getAtc());
        this.f50880c = McmLiteUtils.copyValue(contactlessTransactionContext.getCryptogram());
        this.f50881d = McmLiteUtils.copyValue(contactlessTransactionContext.getTrxDate());
        this.f50882e = McmLiteUtils.copyValue(contactlessTransactionContext.getAmount());
        this.f50883f = McmLiteUtils.copyValue(contactlessTransactionContext.getCurrencyCode());
        this.f50884g = contactlessTransactionContext.getResult();
        this.f50887j = terminalInformation;
        this.f50888k = transactionInformation;
        this.f50885h = bArr == null ? new byte[0] : bArr;
        this.f50886i = bArr2 == null ? new byte[0] : bArr2;
    }

    public static ContactlessLogImpl forMagstripe(ContactlessTransactionContext contactlessTransactionContext, ContactlessPaymentData contactlessPaymentData, TerminalInformation terminalInformation, TransactionInformation transactionInformation, byte[] bArr, byte[] bArr2) {
        byte[] dynamicTrack1;
        byte[] dynamicTrack2;
        try {
            DynamicTrackData dynamicTrackData = new DynamicTrackData(contactlessPaymentData, bArr2, bArr, contactlessTransactionContext.getUnpredictableNumber(), terminalInformation.getCdCvmSupport() == CdCvmSupport.YES);
            dynamicTrack1 = dynamicTrackData.getDynamicTrack1();
            dynamicTrack2 = dynamicTrackData.getDynamicTrack2();
        } catch (McmLiteInvalidInput unused) {
            dynamicTrack1 = new byte[0];
            dynamicTrack2 = new byte[0];
        }
        return new ContactlessLogImpl(contactlessTransactionContext, terminalInformation, transactionInformation, dynamicTrack1, dynamicTrack2);
    }

    public static ContactlessLogImpl forMchip(ContactlessTransactionContext contactlessTransactionContext, TerminalInformation terminalInformation, TransactionInformation transactionInformation) {
        return new ContactlessLogImpl(contactlessTransactionContext, terminalInformation, transactionInformation, new byte[0], new byte[0]);
    }

    public static ContactlessLogImpl generic(ContactlessTransactionContext contactlessTransactionContext) {
        return new ContactlessLogImpl(contactlessTransactionContext, null, null, new byte[0], new byte[0]);
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactionlogging.ContactlessLog
    public byte[] getAmount() {
        return this.f50882e;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactionlogging.ContactlessLog
    public final byte[] getAtc() {
        return this.f50879b;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactionlogging.ContactlessLog
    public final byte[] getCryptogram() {
        return this.f50880c;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactionlogging.ContactlessLog
    public byte[] getCurrencyNumericCode() {
        return this.f50883f;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactionlogging.ContactlessLog
    public final byte[] getDate() {
        return this.f50881d;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactionlogging.ContactlessLog
    public final byte[] getMagstripeDynamicTrack1Data() {
        return this.f50885h;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactionlogging.ContactlessLog
    public final byte[] getMagstripeDynamicTrack2Data() {
        return this.f50886i;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactionlogging.ContactlessLog
    public TransactionSummary getResult() {
        return this.f50884g;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactionlogging.ContactlessLog
    public TerminalInformation getTerminalInformation() {
        return this.f50887j;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactionlogging.ContactlessLog
    public TransactionInformation getTransactionInformation() {
        return this.f50888k;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactionlogging.ContactlessLog
    public final byte[] getUnpredictableNumber() {
        return this.f50878a;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactionlogging.ContactlessLog
    public final void wipe() {
        McmLiteUtils.clearByteArray(this.f50878a);
        McmLiteUtils.clearByteArray(this.f50879b);
        McmLiteUtils.clearByteArray(this.f50880c);
        McmLiteUtils.clearByteArray(this.f50881d);
        McmLiteUtils.clearByteArray(this.f50882e);
        McmLiteUtils.clearByteArray(this.f50883f);
    }
}
