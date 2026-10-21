package androidx.collection;

import com.esotericsoftware.kryo.KryoException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d {
    public static StringBuilder a(CharSequence charSequence, String str, Function1 function1, String str2, CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence2);
        return sb2;
    }

    public static void b(StringBuilder sb2, String str, String str2, KryoException kryoException) {
        sb2.append(str);
        sb2.append(str2);
        kryoException.addTrace(sb2.toString());
    }
}
