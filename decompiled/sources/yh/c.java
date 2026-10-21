package yh;

import com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel.CryptogramInput;
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

/* JADX INFO: compiled from: TransactionInformationRemotePayment.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements TransactionInformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductType f94830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionRange f94831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransactionType f94832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExpectedUserActionOnPoi f94833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Currency f94834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f94835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f94836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Purpose f94837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConditionOfUse f94838i;

    public c(byte[] bArr, CryptogramInput cryptogramInput) {
        byte b10 = cryptogramInput.getTransactionType()[0];
        byte[] amountAuthorized = cryptogramInput.getAmountAuthorized();
        byte[] amountOther = cryptogramInput.getAmountOther();
        byte[] transactionCurrencyCode = cryptogramInput.getTransactionCurrencyCode();
        this.f94830a = ProductType.UNKNOWN;
        this.f94832c = TransactionType.of(b10, null, amountAuthorized);
        this.f94831b = TransactionRange.UNKNOWN;
        this.f94833d = ExpectedUserActionOnPoi.forRemotePayment();
        Currency currencyByCode = Iso4217CurrencyUtils.getCurrencyByCode(transactionCurrencyCode);
        this.f94834e = currencyByCode;
        this.f94835f = Iso4217CurrencyUtils.convertBcdAmountToDouble(amountAuthorized, currencyByCode);
        this.f94836g = Iso4217CurrencyUtils.convertBinaryAmountToDouble(amountOther, currencyByCode);
        this.f94837h = Purpose.forRemotePayment();
        this.f94838i = ConditionOfUse.of(cryptogramInput.getTerminalCountryCode(), bArr);
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final double getAuthorizedAmount() {
        return this.f94835f;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final ConditionOfUse getConditionOfUse() {
        return this.f94838i;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final Currency getCurrency() {
        return this.f94834e;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final ExpectedUserActionOnPoi getExpectedUserActionOnPoi() {
        return this.f94833d;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final double getOtherAmount() {
        return this.f94836g;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final ProductType getProductType() {
        return this.f94830a;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final Purpose getPurpose() {
        return this.f94837h;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final TransactionRange getTransactionRange() {
        return this.f94831b;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final TransactionType getTransactionType() {
        return this.f94832c;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation
    public final boolean hasTerminalDelegatedCdCvm() {
        return false;
    }

    public final String toString() {
        Currency currency = this.f94834e;
        return c.class.toString() + "\n  Product Type: " + this.f94830a + "\n  Terminal Request: " + this.f94837h + "\n  Transaction Range: " + this.f94831b + "\n  Transaction Type: " + this.f94832c + "\n  ExpectedUserActionOnPoi: " + this.f94833d + "\n  Currency: " + (currency == null ? AbstractJsonLexerKt.NULL : currency.getCurrencyCode()) + "\n  Authorized Amount: " + this.f94835f + "\n  Other Amount: " + this.f94836g + "\n  Has Terminal Delegated CD CVM: false\n";
    }
}
