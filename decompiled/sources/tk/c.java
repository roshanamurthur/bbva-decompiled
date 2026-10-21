package tk;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class c extends Lambda implements Function0<KotlinType> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ JvmBuiltInsCustomizer f93620p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(0);
        this.f93620p0 = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final KotlinType invoke() {
        SimpleType anyType = this.f93620p0.f80173a.getBuiltIns().getAnyType();
        Intrinsics.checkNotNullExpressionValue(anyType, "getAnyType(...)");
        return anyType;
    }
}
