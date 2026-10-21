package yh;

import androidx.appcompat.app.i;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.DolValues;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.input.CvmResults;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.input.MobileSupportIndicator;
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

/* JADX INFO: compiled from: TransactionInformationMchip.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements TransactionInformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductType f94820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionRange f94821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransactionType f94822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExpectedUserActionOnPoi f94823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Currency f94824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f94825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f94826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Purpose f94827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConditionOfUse f94828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f94829j;

    public b(byte[] bArr, byte[] bArr2, GenerateAcCommandApdu generateAcCommandApdu, DolValues dolValues) {
        byte b10 = generateAcCommandApdu.getTransactionType()[0];
        byte[] authorizedAmount = generateAcCommandApdu.getAuthorizedAmount();
        byte[] amountOther = generateAcCommandApdu.getAmountOther();
        byte[] merchantCategoryCode = generateAcCommandApdu.getMerchantCategoryCode();
        CvmResults cvmResultsOf = CvmResults.of(generateAcCommandApdu.getCvmResults(), MobileSupportIndicator.of(dolValues));
        byte[] transactionCurrencyCode = generateAcCommandApdu.getTransactionCurrencyCode();
        this.f94820a = ProductType.a(bArr);
        this.f94822c = TransactionType.of(b10, merchantCategoryCode, authorizedAmount);
        this.f94821b = cvmResultsOf == null ? TransactionRange.UNKNOWN : cvmResultsOf.isNoCvmToBePerformed() ? TransactionRange.LOW_VALUE : TransactionRange.HIGH_VALUE;
        this.f94823d = ExpectedUserActionOnPoi.forMchip(cvmResultsOf);
        Currency currencyByCode = Iso4217CurrencyUtils.getCurrencyByCode(transactionCurrencyCode);
        this.f94824e = currencyByCode;
        this.f94825f = Iso4217CurrencyUtils.convertBcdAmountToDouble(authorizedAmount, currencyByCode);
        this.f94826g = Iso4217CurrencyUtils.convertBinaryAmountToDouble(amountOther, currencyByCode);
        this.f94829j = cvmResultsOf.isCdCvmToBePerformed();
        this.f94827h = Purpose.forMchip(generateAcCommandApdu);
        this.f94828i = ConditionOfUse.of(generateAcCommandApdu.getTerminalCountryCode(), bArr2);
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final double getAuthorizedAmount() {
        return this.f94825f;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final ConditionOfUse getConditionOfUse() {
        return this.f94828i;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final Currency getCurrency() {
        return this.f94824e;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final ExpectedUserActionOnPoi getExpectedUserActionOnPoi() {
        return this.f94823d;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final double getOtherAmount() {
        return this.f94826g;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final ProductType getProductType() {
        return this.f94820a;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final Purpose getPurpose() {
        return this.f94827h;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final TransactionRange getTransactionRange() {
        return this.f94821b;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final TransactionType getTransactionType() {
        return this.f94822c;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final boolean hasTerminalDelegatedCdCvm() {
        return this.f94829j;
    }

    public final String toString() {
        Currency currency = this.f94824e;
        String currencyCode = currency == null ? AbstractJsonLexerKt.NULL : currency.getCurrencyCode();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b.class.toString());
        sb2.append("\n  Product Type: ");
        sb2.append(this.f94820a);
        sb2.append("\n  Terminal Request: ");
        sb2.append(this.f94827h);
        sb2.append("\n  Transaction Range: ");
        sb2.append(this.f94821b);
        sb2.append("\n  Transaction Type: ");
        sb2.append(this.f94822c);
        sb2.append("\n  ExpectedUserActionOnPoi: ");
        sb2.append(this.f94823d);
        sb2.append("\n  Currency: ");
        sb2.append(currencyCode);
        sb2.append("\n  Authorized Amount: ");
        sb2.append(this.f94825f);
        sb2.append("\n  Other Amount: ");
        sb2.append(this.f94826g);
        sb2.append("\n  Has Terminal Delegated CD CVM: ");
        return i.c(sb2, this.f94829j, RootService.LINE_BREAK);
    }
}
