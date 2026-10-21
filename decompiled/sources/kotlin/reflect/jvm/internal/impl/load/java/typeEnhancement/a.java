package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AbstractSignatureParts.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends Lambda implements Function1<Object, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ AbstractSignatureParts<Object> f80843p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ AbstractSignatureParts.a f80844q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AbstractSignatureParts<Object> abstractSignatureParts, AbstractSignatureParts.a aVar) {
        super(1);
        this.f80843p0 = abstractSignatureParts;
        this.f80844q0 = aVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull Object extractNullability) {
        Intrinsics.checkNotNullParameter(extractNullability, "$this$extractNullability");
        return Boolean.valueOf(this.f80843p0.forceWarning(extractNullability, this.f80844q0.getType()));
    }
}
