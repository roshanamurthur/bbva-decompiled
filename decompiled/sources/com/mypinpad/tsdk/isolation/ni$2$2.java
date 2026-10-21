package com.mypinpad.tsdk.isolation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nProcessing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Processing.kt\ncom/mypinpad/tsdk/internal/emvlib/Processing$cardProviderListener$2$1\n+ 2 Processing.kt\ncom/mypinpad/tsdk/internal/emvlib/Processing\n*L\n1#1,246:1\n225#2,6:247\n225#2,6:253\n*S KotlinDebug\n*F\n+ 1 Processing.kt\ncom/mypinpad/tsdk/internal/emvlib/Processing$cardProviderListener$2$1\n*L\n53#1:247,6\n59#1:253,6\n*E\n"})
public final class ni$2$2 implements nd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ ni f57326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Function1<sa, Unit> f57327b;

    public ni$2$2() {
        throw null;
    }

    public static /* synthetic */ void a(Object[] objArr) {
        ni$2$2 ni_2_2 = (ni$2$2) objArr[0];
        ni niVar = ni_2_2.f57326a;
        ng ngVar = ng.setY;
        if (ni.setOnFocusChangeListener(niVar).get() == ngVar || ngVar == null) {
            synchronized (ni.setOnFocusChangeListener(niVar)) {
                niVar.setOnFocusChangeListener().setOnFocusChangeListener(ug.setCompoundDrawableTintBlendMode);
                Unit unit = Unit.INSTANCE;
            }
        }
        Function1<sa, Unit> function1 = ni_2_2.f57327b;
        nh.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = nh.setY;
        function1.invoke((sa) nh.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{sb.setTextAlignment, 0L, null, rz.setCompoundDrawableTintBlendMode, null, null}, -1344801733, 1344801733, (int) System.currentTimeMillis()));
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ((~(i13 | i11)) * (-1182)) + (i11 * (-590)) + (i10 * 592);
        int i15 = ~i11;
        if (((i12 | i13 | i15) * 591) + (((~(i10 | i11)) | (~(i13 | i15 | (~i12)))) * (-591)) + i14 == 1) {
            a(objArr);
            return null;
        }
        ni niVar = ((ni$2$2) objArr[0]).f57326a;
        ng ngVar = ng.setY;
        if (ni.setOnFocusChangeListener(niVar).get() != ngVar && ngVar != null) {
            return null;
        }
        synchronized (ni.setOnFocusChangeListener(niVar)) {
            niVar.setOnFocusChangeListener().setOnFocusChangeListener(ug.setOnFocusChangeListener);
            Unit unit = Unit.INSTANCE;
        }
        return null;
    }

    @Override // com.mypinpad.tsdk.isolation.nd
    public final void setCompoundDrawableTintBlendMode() {
        setX(new Object[]{this}, -654554148, 654554148, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.nd
    public final void setY() {
        setX(new Object[]{this}, 97626399, -97626398, System.identityHashCode(this));
    }
}
