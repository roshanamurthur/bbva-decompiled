package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AbstractTypeChecker.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends Lambda implements Function1<TypeCheckerState.ForkPointContext, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ List<SimpleTypeMarker> f81993p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TypeCheckerState f81994q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ TypeSystemContext f81995r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ SimpleTypeMarker f81996s0;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractTypeChecker.kt */
    public static final class C0451a extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TypeCheckerState f81997p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TypeSystemContext f81998q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SimpleTypeMarker f81999r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ SimpleTypeMarker f82000s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0451a(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
            super(0);
            this.f81997p0 = typeCheckerState;
            this.f81998q0 = typeSystemContext;
            this.f81999r0 = simpleTypeMarker;
            this.f82000s0 = simpleTypeMarker2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(AbstractTypeChecker.INSTANCE.isSubtypeForSameConstructor(this.f81997p0, this.f81998q0.asArgumentList(this.f81999r0), this.f82000s0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ArrayList arrayList, TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker) {
        super(1);
        this.f81993p0 = arrayList;
        this.f81994q0 = typeCheckerState;
        this.f81995r0 = typeSystemContext;
        this.f81996s0 = simpleTypeMarker;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TypeCheckerState.ForkPointContext forkPointContext) {
        invoke2(forkPointContext);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull TypeCheckerState.ForkPointContext runForkingPoint) {
        Intrinsics.checkNotNullParameter(runForkingPoint, "$this$runForkingPoint");
        for (SimpleTypeMarker simpleTypeMarker : this.f81993p0) {
            runForkingPoint.fork(new C0451a(this.f81994q0, this.f81995r0, simpleTypeMarker, this.f81996s0));
        }
    }
}
