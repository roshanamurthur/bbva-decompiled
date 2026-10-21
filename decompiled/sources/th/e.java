package th;

import com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.rule.Rule;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Advice;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Assessment;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Reason;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.ExpectedUserActionOnPoi;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionRange;
import java.util.ArrayList;

/* JADX INFO: compiled from: CvmSuccessful.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e implements Rule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Assessment f93608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f93609b;

    public e(boolean z10, boolean z11, boolean z12, boolean z13, TransactionInformation transactionInformation) {
        ExpectedUserActionOnPoi expectedUserActionOnPoi;
        ArrayList arrayList = new ArrayList();
        this.f93609b = arrayList;
        if (!z10) {
            if (transactionInformation.getTransactionRange() == TransactionRange.LOW_VALUE || ((expectedUserActionOnPoi = transactionInformation.getExpectedUserActionOnPoi()) != ExpectedUserActionOnPoi.NONE && expectedUserActionOnPoi != ExpectedUserActionOnPoi.UNKNOWN)) {
                this.f93608a = Assessment.AGREE;
                return;
            } else {
                this.f93608a = Assessment.DECLINE;
                arrayList.add(Reason.INSUFFICIENT_POI_AUTHENTICATION);
                return;
            }
        }
        if (z12 && !z11) {
            this.f93608a = Assessment.ABORT;
            arrayList.add(Reason.MISSING_CD_CVM);
        } else if (z13) {
            this.f93608a = Assessment.AGREE;
        } else {
            this.f93608a = Assessment.ABORT;
            arrayList.add(Reason.INSUFFICIENT_CD_CVM);
        }
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.rule.Rule
    public final Advice check() {
        return new Advice(this.f93608a, this.f93609b);
    }
}
