package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;
import androidx.annotation.RestrictTo;
import androidx.datastore.preferences.protobuf.e;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ArgbEvaluator implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArgbEvaluator f23767a = new ArgbEvaluator();

    public static ArgbEvaluator getInstance() {
        return f23767a;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f6, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f10 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f11 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fA = e.a(f11, f10, f6, f10);
        float fA2 = e.a(fPow4, fPow, f6, fPow);
        float fA3 = e.a(fPow5, fPow2, f6, fPow2);
        float fA4 = e.a(fPow6, fPow3, f6, fPow3);
        float fPow7 = ((float) Math.pow(fA2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fA3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fA4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fA * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
