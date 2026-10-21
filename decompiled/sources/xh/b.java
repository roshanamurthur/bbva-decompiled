package xh;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.DolValues;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.input.CvmResults;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.input.MobileSupportIndicator;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.input.TerminalRiskManagementData;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.CdCvmSupport;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.PersistentTransactionContext;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalTechnology;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalType;

/* JADX INFO: compiled from: TerminalInformationMchip.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements TerminalInformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TerminalType f94657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TerminalTechnology f94658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PersistentTransactionContext f94659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CdCvmSupport f94660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DolValues f94661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DolValues f94662f;

    public b(GenerateAcCommandApdu generateAcCommandApdu, DolValues dolValues, DolValues dolValues2) {
        TerminalRiskManagementData terminalRiskManagementDataOf = TerminalRiskManagementData.of(dolValues);
        MobileSupportIndicator mobileSupportIndicatorOf = MobileSupportIndicator.of(dolValues);
        CvmResults cvmResultsOf = CvmResults.of(generateAcCommandApdu.getCvmResults(), mobileSupportIndicatorOf);
        this.f94657a = TerminalType.of(generateAcCommandApdu.getTerminalType());
        this.f94658b = TerminalTechnology.CONTACTLESS_EMV;
        this.f94659c = PersistentTransactionContext.forMchip(mobileSupportIndicatorOf);
        this.f94660d = CdCvmSupport.forMchip(cvmResultsOf, terminalRiskManagementDataOf);
        this.f94661e = dolValues;
        this.f94662f = dolValues2;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation
    public final CdCvmSupport getCdCvmSupport() {
        return this.f94660d;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation
    public final byte[] getDiscretionaryDataByTag(String str) {
        byte[] valueByTag;
        DolValues dolValues = this.f94662f;
        if (dolValues != null && (valueByTag = dolValues.getValueByTag(str)) != null) {
            return valueByTag;
        }
        DolValues dolValues2 = this.f94661e;
        if (dolValues2 == null) {
            return null;
        }
        return dolValues2.getValueByTag(str);
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation
    public final PersistentTransactionContext getPersistentTransactionContext() {
        return this.f94659c;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation
    public final TerminalTechnology getTerminalTechnology() {
        return this.f94658b;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation
    public final TerminalType getTerminalType() {
        return this.f94657a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(PersistentTransactionContext.class.toString());
        sb2.append("\n  Terminal Type: ");
        sb2.append(this.f94657a);
        sb2.append("\n  Terminal Technology: ");
        sb2.append(this.f94658b);
        sb2.append("\n  Persistent Transaction Context: ");
        sb2.append(this.f94659c);
        sb2.append("\n  CD-CVM Support: ");
        sb2.append(this.f94660d);
        sb2.append("\n  Discretionary Data [TAG|VALUE] HEX: \n");
        DolValues dolValues = this.f94661e;
        if (dolValues != null) {
            sb2.append(dolValues.toString());
        }
        DolValues dolValues2 = this.f94662f;
        if (dolValues2 != null) {
            sb2.append(dolValues2.toString());
        }
        sb2.append(RootService.LINE_BREAK);
        return sb2.toString();
    }
}
