package xh;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.DolValues;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.input.MobileSupportIndicator;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.input.TerminalRiskManagementData;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.CdCvmSupport;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.PersistentTransactionContext;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalTechnology;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalType;

/* JADX INFO: compiled from: TerminalInformationMagstripe.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements TerminalInformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TerminalType f94651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TerminalTechnology f94652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PersistentTransactionContext f94653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CdCvmSupport f94654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DolValues f94655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DolValues f94656f;

    public a(ComputeCcCommandApdu computeCcCommandApdu, DolValues dolValues, DolValues dolValues2) {
        MobileSupportIndicator mobileSupportIndicatorOf = MobileSupportIndicator.of(computeCcCommandApdu.getMobileSupportIndicator());
        TerminalRiskManagementData terminalRiskManagementDataOf = TerminalRiskManagementData.of(computeCcCommandApdu.getTerminalRiskManagementData());
        this.f94651a = TerminalType.of(computeCcCommandApdu.getTerminalType());
        this.f94652b = TerminalTechnology.CONTACTLESS_MAGSTRIPE;
        this.f94653c = PersistentTransactionContext.forMagstripe(mobileSupportIndicatorOf);
        this.f94654d = CdCvmSupport.forMagstripe(mobileSupportIndicatorOf, terminalRiskManagementDataOf);
        this.f94655e = dolValues;
        this.f94656f = dolValues2;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation
    public final CdCvmSupport getCdCvmSupport() {
        return this.f94654d;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation
    public final byte[] getDiscretionaryDataByTag(String str) {
        byte[] valueByTag;
        DolValues dolValues = this.f94656f;
        if (dolValues != null && (valueByTag = dolValues.getValueByTag(str)) != null) {
            return valueByTag;
        }
        DolValues dolValues2 = this.f94655e;
        if (dolValues2 == null) {
            return null;
        }
        return dolValues2.getValueByTag(str);
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation
    public final PersistentTransactionContext getPersistentTransactionContext() {
        return this.f94653c;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation
    public final TerminalTechnology getTerminalTechnology() {
        return this.f94652b;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation
    public final TerminalType getTerminalType() {
        return this.f94651a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(PersistentTransactionContext.class.toString());
        sb2.append("\n  Terminal Type: ");
        sb2.append(this.f94651a);
        sb2.append("\n  Terminal Technology: ");
        sb2.append(this.f94652b);
        sb2.append("\n  Persistent Transaction Context: ");
        sb2.append(this.f94653c);
        sb2.append("\n  CD-CVM Support: ");
        sb2.append(this.f94654d);
        sb2.append("\n  Discretionary Data [TAG|VALUE] HEX: \n");
        DolValues dolValues = this.f94655e;
        if (dolValues != null) {
            sb2.append(dolValues.toString());
        }
        DolValues dolValues2 = this.f94656f;
        if (dolValues2 != null) {
            sb2.append(dolValues2.toString());
        }
        sb2.append(RootService.LINE_BREAK);
        return sb2.toString();
    }
}
