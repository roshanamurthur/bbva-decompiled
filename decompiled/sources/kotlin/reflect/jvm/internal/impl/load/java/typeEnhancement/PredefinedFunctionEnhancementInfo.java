package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class PredefinedFunctionEnhancementInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final TypeEnhancementInfo f80829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<TypeEnhancementInfo> f80830b;

    /* JADX WARN: Multi-variable type inference failed */
    public PredefinedFunctionEnhancementInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    public final List<TypeEnhancementInfo> getParametersInfo() {
        return this.f80830b;
    }

    @Nullable
    public final TypeEnhancementInfo getReturnTypeInfo() {
        return this.f80829a;
    }

    public PredefinedFunctionEnhancementInfo(@Nullable TypeEnhancementInfo typeEnhancementInfo, @NotNull List<TypeEnhancementInfo> parametersInfo) {
        Intrinsics.checkNotNullParameter(parametersInfo, "parametersInfo");
        this.f80829a = typeEnhancementInfo;
        this.f80830b = parametersInfo;
    }

    public /* synthetic */ PredefinedFunctionEnhancementInfo(TypeEnhancementInfo typeEnhancementInfo, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : typeEnhancementInfo, (i10 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
