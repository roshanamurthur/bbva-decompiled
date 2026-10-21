package th;

import com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.rule.Rule;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Advice;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Assessment;
import java.util.ArrayList;

/* JADX INFO: compiled from: ContactlessContextMatching.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements Rule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Assessment f93602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f93603b;

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r3.compareTo(r2) == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(byte[] r2, byte[] r3, byte[] r4, byte[] r5, boolean r6) {
        /*
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f93603b = r0
            if (r4 == 0) goto L48
            if (r6 != 0) goto Lf
            goto L48
        Lf:
            if (r5 == 0) goto L3e
            if (r3 == 0) goto L3e
            boolean r3 = java.util.Arrays.equals(r3, r5)
            if (r3 == 0) goto L3e
            if (r2 != 0) goto L1c
            goto L3e
        L1c:
            java.lang.String r2 = com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils.byteArrayToHexString(r2)
            r3 = 10
            java.lang.Long r2 = java.lang.Long.valueOf(r2, r3)
            java.lang.String r4 = com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils.byteArrayToHexString(r4)
            java.lang.Long r3 = java.lang.Long.valueOf(r4, r3)
            if (r6 != 0) goto L37
            int r4 = r3.compareTo(r2)
            r5 = 1
            if (r4 >= r5) goto L48
        L37:
            int r2 = r3.compareTo(r2)
            if (r2 != 0) goto L3e
            goto L48
        L3e:
            com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Assessment r2 = com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Assessment.ERROR
            r1.f93602a = r2
            com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Reason r2 = com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Reason.CONTEXT_NOT_MATCHING
            r0.add(r2)
            goto L4c
        L48:
            com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Assessment r2 = com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Assessment.AGREE
            r1.f93602a = r2
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.b.<init>(byte[], byte[], byte[], byte[], boolean):void");
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.rule.Rule
    public final Advice check() {
        return new Advice(this.f93602a, this.f93603b);
    }
}
