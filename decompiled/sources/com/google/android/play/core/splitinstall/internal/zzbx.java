package com.google.android.play.core.splitinstall.internal;

import androidx.camera.camera2.internal.compat.u;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbx extends RuntimeException {
    public static Object zzc(Callable callable) {
        callable.getClass();
        try {
            return callable.call();
        } catch (RuntimeException e5) {
            throw e5;
        } catch (Exception e7) {
            throw new zzbx("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", e7);
        }
    }

    @Override // java.lang.Throwable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized Exception getCause() {
        Throwable cause;
        cause = super.getCause();
        cause.getClass();
        return (Exception) cause;
    }

    public final Exception zzb(Class cls) {
        int iIndexOf;
        String strG;
        int i10 = 0;
        Class[] clsArr = {cls};
        for (int i11 = 0; i11 <= 0; i11++) {
            Class cls2 = clsArr[i11];
            if (!(!RuntimeException.class.isAssignableFrom(cls2))) {
                Object[] objArr = new Object[2];
                objArr[0] = "getCause";
                objArr[1] = cls2;
                for (int i12 = 0; i12 < 2; i12++) {
                    Object obj = objArr[i12];
                    if (obj == null) {
                        strG = AbstractJsonLexerKt.NULL;
                    } else {
                        try {
                            strG = obj.toString();
                        } catch (Exception e5) {
                            String strB = androidx.camera.core.impl.utils.a.b(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strB), (Throwable) e5);
                            strG = u.g("<", strB, " threw ", e5.getClass().getName(), ">");
                        }
                    }
                    objArr[i12] = strG;
                }
                StringBuilder sb2 = new StringBuilder(118);
                int i13 = 0;
                while (i10 < 2 && (iIndexOf = "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s".indexOf("%s", i13)) != -1) {
                    sb2.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i13, iIndexOf);
                    sb2.append(objArr[i10]);
                    i13 = iIndexOf + 2;
                    i10++;
                }
                sb2.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i13, 86);
                if (i10 < 2) {
                    sb2.append(" [");
                    sb2.append(objArr[i10]);
                    for (int i14 = i10 + 1; i14 < 2; i14++) {
                        sb2.append(", ");
                        sb2.append(objArr[i14]);
                    }
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                }
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        if (cls.isInstance(getCause())) {
            return (Exception) cls.cast(getCause());
        }
        Exception cause = getCause();
        ClassCastException classCastException = new ClassCastException(String.format("getCause(%s) doesn't match underlying exception", cls));
        classCastException.initCause(cause);
        throw classCastException;
    }
}
