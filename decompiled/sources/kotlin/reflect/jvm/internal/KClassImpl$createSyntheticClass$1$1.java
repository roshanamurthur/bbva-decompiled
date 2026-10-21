package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KClassImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014¨\u0006\u0005"}, d2 = {"kotlin/reflect/jvm/internal/KClassImpl$createSyntheticClass$1$1", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/GivenFunctionsMemberScope;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "computeDeclaredFunctions", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
public final class KClassImpl$createSyntheticClass$1$1 extends GivenFunctionsMemberScope {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    @NotNull
    public List<FunctionDescriptor> computeDeclaredFunctions() {
        return CollectionsKt__CollectionsKt.emptyList();
    }
}
