package th;

import com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.rule.Rule;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Advice;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Assessment;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Reason;
import java.util.ArrayList;

/* JADX INFO: compiled from: TransactionConditionsAllowed.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f implements Rule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Assessment f93610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f93611b;

    public f(boolean z10) {
        ArrayList arrayList = new ArrayList();
        this.f93611b = arrayList;
        if (z10) {
            this.f93610a = Assessment.AGREE;
        } else {
            this.f93610a = Assessment.DECLINE;
            arrayList.add(Reason.TRANSACTION_CONDITIONS_NOT_ALLOWED);
        }
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.rule.Rule
    public final Advice check() {
        return new Advice(this.f93610a, this.f93611b);
    }
}
