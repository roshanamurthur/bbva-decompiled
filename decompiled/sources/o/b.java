package o;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import androidx.biometric.BiometricFragment;
import androidx.biometric.R;
import androidx.lifecycle.Observer;
import com.nulabinc.zxcvbn.Guess;

/* JADX INFO: compiled from: BiometricFragment.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Observer<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BiometricFragment f85228a;

    public b(BiometricFragment biometricFragment) {
        this.f85228a = biometricFragment;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a7  */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(a aVar) {
        int i10;
        KeyguardManager keyguardManagerA;
        a aVar2 = aVar;
        if (aVar2 != null) {
            BiometricFragment biometricFragment = this.f85228a;
            biometricFragment.getClass();
            int i11 = aVar2.f85226a;
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                case 6:
                default:
                    i11 = 8;
                    break;
            }
            Context context = biometricFragment.getContext();
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 29 || !((i11 == 7 || i11 == 9) && context != null && (keyguardManagerA = l.a(context)) != null && l.b(keyguardManagerA) && androidx.biometric.c.b(biometricFragment.f1741q0.a()))) {
                boolean zE = biometricFragment.e();
                CharSequence charSequenceA = aVar2.f85227b;
                if (zE) {
                    if (charSequenceA == null) {
                        charSequenceA = androidx.biometric.i.a(biometricFragment.getContext(), i11);
                    }
                    if (i11 == 5) {
                        int i13 = biometricFragment.f1741q0.f1782x0;
                        if (i13 == 0 || i13 == 3) {
                            biometricFragment.h(i11, charSequenceA);
                        }
                        biometricFragment.dismiss();
                    } else {
                        if (biometricFragment.f1741q0.N0) {
                            biometricFragment.g(i11, charSequenceA);
                        } else {
                            biometricFragment.j(charSequenceA);
                            Handler handler = biometricFragment.f1740p0;
                            h hVar = new h(biometricFragment, i11, charSequenceA);
                            Context context2 = biometricFragment.getContext();
                            if (context2 != null) {
                                String str = Build.MODEL;
                                if (i12 != 28) {
                                    i10 = Guess.REFERENCE_YEAR;
                                } else {
                                    int i14 = R.array.hide_fingerprint_instantly_prefixes;
                                    if (str == null) {
                                        i10 = Guess.REFERENCE_YEAR;
                                    } else {
                                        String[] stringArray = context2.getResources().getStringArray(i14);
                                        int length = stringArray.length;
                                        i10 = 0;
                                        int i15 = 0;
                                        while (true) {
                                            if (i15 >= length) {
                                                i10 = Guess.REFERENCE_YEAR;
                                            } else if (!str.startsWith(stringArray[i15])) {
                                                i15++;
                                            }
                                        }
                                    }
                                }
                            } else {
                                i10 = Guess.REFERENCE_YEAR;
                            }
                            handler.postDelayed(hVar, i10);
                        }
                        biometricFragment.f1741q0.N0 = true;
                    }
                } else {
                    if (charSequenceA == null) {
                        charSequenceA = biometricFragment.getString(R.string.default_error_msg) + " " + i11;
                    }
                    biometricFragment.g(i11, charSequenceA);
                }
            } else {
                biometricFragment.f();
            }
            biometricFragment.f1741q0.b(null);
        }
    }
}
