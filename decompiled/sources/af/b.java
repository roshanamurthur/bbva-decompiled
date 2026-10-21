package af;

import com.google.android.play.core.splitinstall.internal.zzas;
import com.google.android.play.core.splitinstall.internal.zzbk;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import org.objenesis.ObjenesisException;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements zzas {
    public static Constructor a(Class cls, Constructor constructor) {
        try {
            Class<?> cls2 = Class.forName("sun.reflect.ReflectionFactory");
            try {
                try {
                    try {
                        return (Constructor) cls2.getDeclaredMethod("newConstructorForSerialization", Class.class, Constructor.class).invoke(cls2.getDeclaredMethod("getReflectionFactory", new Class[0]).invoke(null, new Object[0]), cls, constructor);
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e5) {
                        throw new ObjenesisException(e5);
                    }
                } catch (NoSuchMethodException e7) {
                    throw new ObjenesisException(e7);
                }
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e10) {
                throw new ObjenesisException(e10);
            }
        } catch (ClassNotFoundException e11) {
            throw new ObjenesisException(e11);
        }
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzas
    public Object[] zza(Object obj, ArrayList arrayList, File file, ArrayList arrayList2) {
        return (Object[]) zzbk.zze(obj, "makePathElements", Object[].class, List.class, arrayList, File.class, file, List.class, arrayList2);
    }
}
