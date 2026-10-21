package androidx.appcompat.widget;

import android.app.Activity;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.params.Ed448PublicKeyParameters;
import org.bouncycastle.crypto.params.X25519PublicKeyParameters;
import org.bouncycastle.crypto.params.X448PublicKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMOtsParameters;
import org.bouncycastle.util.Fingerprint;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: compiled from: AppCompatHintHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class z implements zc.d {
    public static int b(byte[] bArr, int i10, LMOtsParameters lMOtsParameters) {
        int w6 = (1 << lMOtsParameters.getW()) - 1;
        int iC = 0;
        for (int i11 = 0; i11 < (i10 * 8) / lMOtsParameters.getW(); i11++) {
            iC = (iC + w6) - c(i11, lMOtsParameters.getW(), bArr);
        }
        return iC << lMOtsParameters.getLs();
    }

    public static int c(int i10, int i11, byte[] bArr) {
        int i12 = (i10 * i11) / 8;
        return (bArr[i12] >>> (((~i10) & ((8 / i11) - 1)) * i11)) & ((1 << i11) - 1);
    }

    public static boolean d(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return !d(bArr, bArr);
        }
        int i10 = 0;
        for (int i11 = 0; i11 != bArr.length; i11++) {
            i10 |= bArr[i11] ^ bArr2[i11];
        }
        return i10 == 0;
    }

    public static String e(String str, String str2, AsymmetricKeyParameter asymmetricKeyParameter) {
        byte[] encoded;
        StringBuffer stringBuffer = new StringBuffer();
        String strLineSeparator = Strings.lineSeparator();
        if (asymmetricKeyParameter instanceof X448PublicKeyParameters) {
            encoded = ((X448PublicKeyParameters) asymmetricKeyParameter).getEncoded();
        } else if (asymmetricKeyParameter instanceof Ed448PublicKeyParameters) {
            encoded = ((Ed448PublicKeyParameters) asymmetricKeyParameter).getEncoded();
        } else {
            encoded = asymmetricKeyParameter instanceof X25519PublicKeyParameters ? ((X25519PublicKeyParameters) asymmetricKeyParameter).getEncoded() : ((Ed25519PublicKeyParameters) asymmetricKeyParameter).getEncoded();
        }
        stringBuffer.append(str2);
        stringBuffer.append(" ");
        stringBuffer.append(str);
        stringBuffer.append(" [");
        stringBuffer.append(new Fingerprint(encoded).toString());
        stringBuffer.append(Constant.BRACKET_CLOSE);
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("    public data: ");
        stringBuffer.append(Hex.toHexString(encoded));
        stringBuffer.append(strLineSeparator);
        return stringBuffer.toString();
    }

    public static void f(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof WithHint) {
                editorInfo.hintText = ((WithHint) parent).getHint();
                return;
            }
        }
    }

    @Override // zc.d
    public void a(Activity activity) {
    }
}
