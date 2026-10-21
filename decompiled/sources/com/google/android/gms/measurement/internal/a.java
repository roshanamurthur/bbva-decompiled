package com.google.android.gms.measurement.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import java.util.List;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.crypto.CipherParameters;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a {
    public static int a(List list, int i10, int i11) {
        return (list.hashCode() + i10) * i11;
    }

    public static String b(CipherParameters cipherParameters, String str) {
        return str.concat(cipherParameters.getClass().getName());
    }

    public static Function2 c(ComposeUiNode.Companion companion, Composer composer, MeasurePolicy measurePolicy, Composer composer2, CompositionLocalMap compositionLocalMap) {
        Updater.m2081setimpl(composer, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m2081setimpl(composer2, compositionLocalMap, companion.getSetResolvedCompositionLocals());
        return companion.getSetCompositeKeyHash();
    }

    public static ASN1EncodableVector d(ASN1EncodableVector aSN1EncodableVector, ASN1EncodableVector aSN1EncodableVector2) {
        aSN1EncodableVector2.add(new DERSequence(aSN1EncodableVector));
        return new ASN1EncodableVector();
    }

    public static StringQualifier e(Module module, SingleInstanceFactory singleInstanceFactory, String str) {
        new KoinDefinition(module, singleInstanceFactory);
        return QualifierKt.named(str);
    }

    public static void f(zzfr zzfrVar, String str) {
        zzfrVar.zzay().zzk().zza(str);
    }
}
