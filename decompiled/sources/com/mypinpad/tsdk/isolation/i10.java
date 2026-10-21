package com.mypinpad.tsdk.isolation;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/X509Certificate;", "setOnFocusChangeListener", "()Ljava/util/List;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class i10 extends Lambda implements Function0<List<? extends X509Certificate>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ zi f56326p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i10(zi ziVar) {
        super(0);
        this.f56326p0 = ziVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static /* synthetic */ List a(Object[] objArr, int i10, int i11, int i12) {
        List listA;
        int i13 = ~i10;
        int i14 = (~((~i11) | i13)) | i12;
        int i15 = ~(i10 | i11);
        if (((i11 | (~(i12 | i13))) * 376) + (((~(i10 | (~i12))) | i15) * (-376)) + ((i14 | i15) * 376) + (i11 * (-375)) + (i10 * (-375)) != 1) {
            i10 i10Var = (i10) objArr[0];
            yf yfVar = (yf) zi.setY(new Object[]{i10Var.f56326p0}, -1529850706, 1529850709, (int) System.currentTimeMillis());
            Intrinsics.checkNotNull(yfVar);
            List list = (List) yf.setX(new Object[]{yfVar}, 937432037, -937432031, System.identityHashCode(yfVar));
            listA = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            System.identityHashCode(i10Var);
            System.identityHashCode(i10Var);
            while (!(!it.hasNext())) {
                listA.add((X509Certificate) ((Certificate) it.next()));
            }
        } else {
            i10 i10Var2 = (i10) objArr[0];
            listA = a(new Object[]{i10Var2}, 176060619, -176060619, System.identityHashCode(i10Var2));
        }
        return (List) listA;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ List<? extends X509Certificate> invoke() {
        return a(new Object[]{this}, 1354826247, -1354826246, System.identityHashCode(this));
    }
}
