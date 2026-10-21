package wh;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GetProcessingOptionsCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ReadRecordCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ResponseApduFactory;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless.GetProcessingOptions;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless.ReadRecord;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.ContactlessContext;

/* JADX INFO: compiled from: ContactlessSelectedState.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ContactlessContext f94252a;

    @Override // wh.c
    public final byte[] a(ReadRecordCommandApdu readRecordCommandApdu) {
        return ReadRecord.of(readRecordCommandApdu, this.f94252a).getResponse();
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
        ContactlessContext contactlessContext = this.f94252a;
        if (contactlessContext != null) {
            contactlessContext.wipe();
        }
    }

    @Override // wh.c
    public final byte[] d(GetProcessingOptionsCommandApdu getProcessingOptionsCommandApdu) {
        return GetProcessingOptions.response(getProcessingOptionsCommandApdu, this.f94252a);
    }
}
