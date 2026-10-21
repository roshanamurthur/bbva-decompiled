package xh;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel.CryptogramInput;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.CdCvmSupport;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.PersistentTransactionContext;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalTechnology;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalType;

/* JADX INFO: compiled from: TerminalInformationRemotePayment.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements TerminalInformation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TerminalTechnology f94664b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TerminalType f94663a = TerminalType.CARDHOLDER_OPERATED;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PersistentTransactionContext f94665c = PersistentTransactionContext.UNKNOWN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CdCvmSupport f94666d = CdCvmSupport.UNKNOWN;

    public c(CryptogramInput cryptogramInput) {
        this.f94664b = TerminalTechnology.forRemotePayment(cryptogramInput.getCryptogramType());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation
    public final CdCvmSupport getCdCvmSupport() {
        return this.f94666d;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation
    public final byte[] getDiscretionaryDataByTag(String str) {
        return null;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation
    public final PersistentTransactionContext getPersistentTransactionContext() {
        return this.f94665c;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation
    public final TerminalTechnology getTerminalTechnology() {
        return this.f94664b;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation
    public final TerminalType getTerminalType() {
        return this.f94663a;
    }

    public final String toString() {
        return PersistentTransactionContext.class.toString() + "\n  Terminal Type: " + this.f94663a + "\n  Terminal Technology: " + this.f94664b + "\n  Persistent Transaction Context: " + this.f94665c + "\n  CD-CVM Support: " + this.f94666d + "\n  Discretionary Data [TAG|VALUE] HEX: \n" + RootService.LINE_BREAK;
    }
}
