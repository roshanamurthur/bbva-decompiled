package yh;

import androidx.appcompat.app.i;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.DolValues;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.input.MobileSupportIndicator;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.input.TerminalCapabilities;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalType;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.ConditionOfUse;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.ExpectedUserActionOnPoi;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.ProductType;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.Purpose;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionRange;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionType;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.Iso4217CurrencyUtils;
import java.util.Currency;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.data.util.EglobalUtils;

/* JADX INFO: compiled from: TransactionInformationMagstripe.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements TransactionInformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductType f94811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionRange f94812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransactionType f94813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExpectedUserActionOnPoi f94814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Currency f94815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f94816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Purpose f94817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConditionOfUse f94818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f94819i;

    public a(byte[] bArr, byte[] bArr2, ComputeCcCommandApdu computeCcCommandApdu, DolValues dolValues) {
        TerminalCapabilities terminalCapabilitiesOf = TerminalCapabilities.of(dolValues.getValueByTag(EglobalUtils.CAPABILITIES));
        byte[] authorizedAmount = computeCcCommandApdu.getAuthorizedAmount();
        byte transactionType = computeCcCommandApdu.getTransactionType();
        MobileSupportIndicator mobileSupportIndicatorOf = MobileSupportIndicator.of(computeCcCommandApdu.getMobileSupportIndicator());
        byte[] merchantCategoryCode = computeCcCommandApdu.getMerchantCategoryCode();
        byte[] transactionCurrencyCode = computeCcCommandApdu.getTransactionCurrencyCode();
        this.f94811a = ProductType.a(bArr);
        this.f94813c = TransactionType.of(transactionType, merchantCategoryCode, authorizedAmount);
        this.f94812b = (terminalCapabilitiesOf == null || !terminalCapabilitiesOf.isSupportedByTheTerminal()) ? mobileSupportIndicatorOf.isCdCvmRequired() ? TransactionRange.HIGH_VALUE : TransactionRange.UNKNOWN : terminalCapabilitiesOf.isNoCvmOnlySupported() ? TransactionRange.LOW_VALUE : terminalCapabilitiesOf.isCvmOtherThanNoCvmSupported() ? TransactionRange.HIGH_VALUE : TransactionRange.UNKNOWN;
        this.f94814d = ExpectedUserActionOnPoi.forMagstripe(mobileSupportIndicatorOf, terminalCapabilitiesOf);
        Currency currencyByCode = Iso4217CurrencyUtils.getCurrencyByCode(transactionCurrencyCode);
        this.f94815e = currencyByCode;
        this.f94816f = Iso4217CurrencyUtils.convertBcdAmountToDouble(authorizedAmount, currencyByCode);
        this.f94819i = mobileSupportIndicatorOf.isCdCvmRequired();
        this.f94817g = Purpose.forMagstripe(TerminalType.of(computeCcCommandApdu.getTerminalType()));
        this.f94818h = ConditionOfUse.of(computeCcCommandApdu.getTerminalCountryCode(), bArr2);
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final double getAuthorizedAmount() {
        return this.f94816f;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final ConditionOfUse getConditionOfUse() {
        return this.f94818h;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final Currency getCurrency() {
        return this.f94815e;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final ExpectedUserActionOnPoi getExpectedUserActionOnPoi() {
        return this.f94814d;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final double getOtherAmount() {
        return 0.0d;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final ProductType getProductType() {
        return this.f94811a;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final Purpose getPurpose() {
        return this.f94817g;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final TransactionRange getTransactionRange() {
        return this.f94812b;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final TransactionType getTransactionType() {
        return this.f94813c;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final boolean hasTerminalDelegatedCdCvm() {
        return this.f94819i;
    }

    public final String toString() {
        Currency currency = this.f94815e;
        String currencyCode = currency == null ? AbstractJsonLexerKt.NULL : currency.getCurrencyCode();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a.class.toString());
        sb2.append("\n  Product Type: ");
        sb2.append(this.f94811a);
        sb2.append("\n  Terminal Request: ");
        sb2.append(this.f94817g);
        sb2.append("\n  Transaction Range: ");
        sb2.append(this.f94812b);
        sb2.append("\n  Transaction Type: ");
        sb2.append(this.f94813c);
        sb2.append("\n  ExpectedUserActionOnPoi: ");
        sb2.append(this.f94814d);
        sb2.append("\n  Currency: ");
        sb2.append(currencyCode);
        sb2.append("\n  Authorized Amount: ");
        sb2.append(this.f94816f);
        sb2.append("\n  Other Amount: 0.0\n  Has Terminal Delegated CD CVM: ");
        return i.c(sb2, this.f94819i, RootService.LINE_BREAK);
    }
}
