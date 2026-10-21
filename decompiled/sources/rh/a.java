package rh;

import androidx.work.PeriodicWorkRequest;
import com.google.android.play.core.splitinstall.internal.j;
import com.google.android.play.core.splitinstall.internal.k;
import com.mastercard.mpsdk.mcbp.mcmlite.cvm.riskmanager.CvmRiskManager;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionRange;

/* JADX INFO: compiled from: CvmRiskManagerImpl.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements CvmRiskManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f93090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f93091d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f93092a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f93093b = new k();

    /* JADX INFO: renamed from: rh.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CvmRiskManagerImpl.java */
    public static /* synthetic */ class C0489a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93094a;

        static {
            int[] iArr = new int[TransactionRange.values().length];
            f93094a = iArr;
            try {
                iArr[TransactionRange.LOW_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93094a[TransactionRange.HIGH_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93094a[TransactionRange.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.cvm.riskmanager.CvmRiskManager
    public final boolean isUserSufficientlyAuthenticated(boolean z10, long j10, TransactionInformation transactionInformation) {
        if (j10 > f93091d) {
            f93090c = 0;
            f93091d = j10;
        }
        if (transactionInformation.getTransactionRange() == TransactionRange.LOW_VALUE) {
            int i10 = f93090c;
            this.f93092a.a();
            return i10 < 3;
        }
        if (f93091d + PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS <= System.currentTimeMillis() || !z10) {
            return false;
        }
        int i11 = f93090c;
        this.f93093b.a();
        return i11 < 3;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.cvm.riskmanager.CvmRiskManager
    public final void update(TransactionInformation transactionInformation) {
        int i10 = C0489a.f93094a[transactionInformation.getTransactionRange().ordinal()];
        f93090c++;
    }
}
