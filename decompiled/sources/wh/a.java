package wh;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GetProcessingOptionsCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ReadRecordCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ResponseApduFactory;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.ContactlessContext;

/* JADX INFO: compiled from: ContactlessNotSelectedState.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContactlessContext f94248a;

    public a(ContactlessContext contactlessContext) {
        this.f94248a = contactlessContext;
    }

    @Override // wh.c
    public final byte[] a(ReadRecordCommandApdu readRecordCommandApdu) {
        return ResponseApduFactory.conditionsOfUseNotSatisfied();
    }

    @Override // wh.c
    public final byte[] b(ComputeCcCommandApdu computeCcCommandApdu) {
        return ResponseApduFactory.conditionsOfUseNotSatisfied();
    }

    @Override // wh.c
    public final byte[] c(GenerateAcCommandApdu generateAcCommandApdu) {
        return ResponseApduFactory.conditionsOfUseNotSatisfied();
    }

    @Override // wh.c
    public final void cancelPayment() {
        ContactlessContext contactlessContext = this.f94248a;
        if (contactlessContext != null) {
            contactlessContext.wipe();
        }
    }

    @Override // wh.c
    public final byte[] d(GetProcessingOptionsCommandApdu getProcessingOptionsCommandApdu) {
        return ResponseApduFactory.conditionsOfUseNotSatisfied();
    }
}
