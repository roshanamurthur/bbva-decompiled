package wh;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GetProcessingOptionsCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ReadRecordCommandApdu;

/* JADX INFO: compiled from: ContactlessReadySubState.java */
/* JADX INFO: loaded from: classes10.dex */
public interface c {
    byte[] a(ReadRecordCommandApdu readRecordCommandApdu);

    byte[] b(ComputeCcCommandApdu computeCcCommandApdu);

    byte[] c(GenerateAcCommandApdu generateAcCommandApdu);

    void cancelPayment();

    byte[] d(GetProcessingOptionsCommandApdu getProcessingOptionsCommandApdu);
}
