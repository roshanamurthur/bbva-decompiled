package androidx.databinding;

import androidx.compose.runtime.Composer;
import com.bbva.glomohybrid.provider.DependenciesProvider;
import com.mypinpad.tsdk.isolation.adh;
import com.mypinpad.tsdk.isolation.afv;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import org.bouncycastle.asn1.ASN1Sequence;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c {
    public static afv a(adh adhVar, Object[] objArr, int i10, int i11, adh adhVar2) {
        adh.setCompoundDrawableTintBlendMode(objArr, i10, i11, System.identityHashCode(adhVar));
        return new afv(adhVar2);
    }

    public static Object b(Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(i10);
        composer.startReplaceableGroup(i11);
        return composer.rememberedValue();
    }

    public static String c(String str, Object obj) {
        return str + obj;
    }

    public static String d(ASN1Sequence aSN1Sequence, StringBuilder sb2) {
        sb2.append(aSN1Sequence.size());
        return sb2.toString();
    }

    public static Scope e(DependenciesProvider dependenciesProvider) {
        return dependenciesProvider.getKoin().getScopeRegistry().getRootScope();
    }

    public static boolean f(Flags.BooleanFlagField booleanFlagField, int i10, String str) {
        Boolean bool = booleanFlagField.get(i10);
        Intrinsics.checkNotNullExpressionValue(bool, str);
        return bool.booleanValue();
    }
}
