package th;

import com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.rule.Rule;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Advice;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Assessment;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Reason;
import java.util.ArrayList;

/* JADX INFO: compiled from: CredentialsAccessible.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements Rule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Assessment f93604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f93605b;

    public c(boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList = new ArrayList();
        this.f93605b = arrayList;
        if (!z11 || !z12 || z10) {
            this.f93604a = Assessment.AGREE;
        } else {
            this.f93604a = Assessment.ABORT;
            arrayList.add(Reason.CREDENTIALS_NOT_ACCESSIBLE_WITHOUT_CVM);
        }
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.rule.Rule
    public final Advice check() {
        return new Advice(this.f93604a, this.f93605b);
    }
}
