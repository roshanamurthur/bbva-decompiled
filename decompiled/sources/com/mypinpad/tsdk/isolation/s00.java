package com.mypinpad.tsdk.isolation;

import com.mypinpad.tsdk.api.callbacks.UiMessage;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setX", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class s00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ xc f58181p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function1<UiMessage, Unit> f58182q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ sa f58183r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s00(xc xcVar, Function1<? super UiMessage, Unit> function1, sa saVar) {
        super(0);
        this.f58181p0 = xcVar;
        this.f58182q0 = function1;
        this.f58183r0 = saVar;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        if ((((~(i10 | i11)) | (~(i12 | i13))) * 433) + (((~((~i11) | i12)) | i13) * (-433)) + ((~((~i12) | i13 | i11)) * 433) + (i11 * 434) + (i10 * (-432)) != 1) {
            s00 s00Var = (s00) objArr[0];
            if (!((AtomicBoolean) xc.setX(new Object[]{s00Var.f58181p0}, -1122694538, 1122694545, (int) System.currentTimeMillis())).get()) {
                s00Var.f58182q0.invoke((UiMessage) ry.setDividerPadding(new Object[]{s00Var.f58183r0}, -2090061952, 2090061955, (int) System.currentTimeMillis()));
            }
            return null;
        }
        s00 s00Var2 = (s00) objArr[0];
        System.identityHashCode(s00Var2);
        System.identityHashCode(s00Var2);
        a(new Object[]{s00Var2}, -1618347508, 1618347508, System.identityHashCode(s00Var2));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Unit invoke() {
        return a(new Object[]{this}, 1669664504, -1669664503, System.identityHashCode(this));
    }
}
