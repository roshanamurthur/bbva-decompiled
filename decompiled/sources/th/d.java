package th;

import com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.rule.Rule;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Advice;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Assessment;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Reason;
import java.util.ArrayList;

/* JADX INFO: compiled from: CredentialsAvailable.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements Rule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Assessment f93606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f93607b;

    public d(boolean z10) {
        ArrayList arrayList = new ArrayList();
        this.f93607b = arrayList;
        if (z10) {
            this.f93606a = Assessment.AGREE;
        } else {
            this.f93606a = Assessment.ABORT;
            arrayList.add(Reason.CREDENTIALS_NOT_AVAILABLE);
        }
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.rule.Rule
    public final Advice check() {
        return new Advice(this.f93606a, this.f93607b);
    }
}
