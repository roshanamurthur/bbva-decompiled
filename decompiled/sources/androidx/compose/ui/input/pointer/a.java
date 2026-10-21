package androidx.compose.ui.input.pointer;

import e1.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: PointerIcon.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ d f16487p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ PointerIcon f16488q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f16489r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function1<PointerIcon, Unit> f16490s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, PointerIcon pointerIcon, boolean z10, b bVar) {
        super(0);
        this.f16487p0 = dVar;
        this.f16488q0 = pointerIcon;
        this.f16489r0 = z10;
        this.f16490s0 = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        d dVar = this.f16487p0;
        dVar.getClass();
        PointerIcon icon = this.f16488q0;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Function1<PointerIcon, Unit> onSetIcon = this.f16490s0;
        Intrinsics.checkNotNullParameter(onSetIcon, "onSetIcon");
        if (!Intrinsics.areEqual(dVar.f68260a, icon) && dVar.f68265f && !dVar.f68264e) {
            onSetIcon.invoke(icon);
        }
        dVar.f68260a = icon;
        dVar.f68261b = this.f16489r0;
        dVar.f68262c = onSetIcon;
        return Unit.INSTANCE;
    }
}
