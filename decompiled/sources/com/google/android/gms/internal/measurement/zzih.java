package com.google.android.gms.internal.measurement;

import androidx.collection.f;
import androidx.fragment.app.a;
import com.google.android.gms.internal.measurement.zzig;
import com.google.android.gms.internal.measurement.zzih;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzih<MessageType extends zzih<MessageType, BuilderType>, BuilderType extends zzig<MessageType, BuilderType>> implements zzlc {
    protected int zzb = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void zzbo(Iterable iterable, List list) {
        zzkf.zze(iterable);
        if (iterable instanceof zzkm) {
            List listZzh = ((zzkm) iterable).zzh();
            zzkm zzkmVar = (zzkm) list;
            int size = list.size();
            for (Object obj : listZzh) {
                if (obj == null) {
                    int size2 = zzkmVar.size();
                    StringBuilder sbA = a.a(37, "Element at index ");
                    sbA.append(size2 - size);
                    sbA.append(" is null.");
                    String string = sbA.toString();
                    int size3 = zzkmVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(string);
                        }
                        zzkmVar.remove(size3);
                    }
                } else if (obj instanceof zzix) {
                    zzkmVar.zzi((zzix) obj);
                } else {
                    zzkmVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzlj) {
            list.addAll(iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(iterable.size() + list.size());
        }
        int size4 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                int size5 = list.size();
                StringBuilder sbA2 = a.a(37, "Element at index ");
                sbA2.append(size5 - size4);
                sbA2.append(" is null.");
                String string2 = sbA2.toString();
                int size6 = list.size();
                while (true) {
                    size6--;
                    if (size6 < size4) {
                        throw new NullPointerException(string2);
                    }
                    list.remove(size6);
                }
            } else {
                list.add(obj2);
            }
        }
    }

    public int zzbm() {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final zzix zzbn() {
        try {
            int iZzbr = zzbr();
            zzix zzixVar = zzix.zzb;
            byte[] bArr = new byte[iZzbr];
            zzje zzjeVarZzC = zzje.zzC(bArr);
            zzbF(zzjeVarZzC);
            zzjeVarZzC.zzD();
            return new zziv(bArr);
        } catch (IOException e5) {
            String name = getClass().getName();
            throw new RuntimeException(f.c(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e5);
        }
    }

    public void zzbp(int i10) {
        throw null;
    }

    public final byte[] zzbq() {
        try {
            byte[] bArr = new byte[zzbr()];
            zzje zzjeVarZzC = zzje.zzC(bArr);
            zzbF(zzjeVarZzC);
            zzjeVarZzC.zzD();
            return bArr;
        } catch (IOException e5) {
            String name = getClass().getName();
            throw new RuntimeException(f.c(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e5);
        }
    }
}
