package com.mypinpad.tsdk.isolation;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "p0", "", "setOnFocusChangeListener", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class v9 extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ tp f61476p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function1<Object, Unit> f61477q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(tp tpVar, Function1<Object, Unit> function1) {
        super(1);
        this.f61476p0 = tpVar;
        this.f61477q0 = function1;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ((i11 | i13) * (-368)) + (i11 * 185) + (i10 * (-183));
        int i15 = ~i11;
        int i16 = ~i12;
        if ((((~(i10 | i11)) | (~(i16 | i10)) | (~(i13 | i15))) * 184) + ((i10 | i15 | i16) * 184) + i14 == 1) {
            v9 v9Var = (v9) objArr[0];
            a(new Object[]{v9Var, objArr[1]}, 259453427, -259453427, System.identityHashCode(v9Var));
            return Unit.INSTANCE;
        }
        v9 v9Var2 = (v9) objArr[0];
        Object obj = objArr[1];
        try {
            AtomicBoolean x4 = tp.setX(v9Var2.f61476p0);
            tp tpVar = v9Var2.f61476p0;
            Function1<Object, Unit> function1 = v9Var2.f61477q0;
            synchronized (x4) {
                try {
                    if (!tp.setX(tpVar).get()) {
                        function1.invoke(obj);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            tp.setCompoundDrawableTintBlendMode(v9Var2.f61476p0).setY();
            un unVar = obj instanceof un ? (un) obj : null;
            if (unVar == null) {
                return null;
            }
            unVar.junkify();
            return null;
        } catch (Throwable th3) {
            tp.setCompoundDrawableTintBlendMode(v9Var2.f61476p0).setY();
            un unVar2 = obj instanceof un ? (un) obj : null;
            if (unVar2 != null) {
                unVar2.junkify();
            }
            throw th3;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Object obj) {
        return a(new Object[]{this, obj}, -233873659, 233873660, System.identityHashCode(this));
    }
}
