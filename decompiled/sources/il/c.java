package il;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IntersectionType.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class c extends Lambda implements Function0<String> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Set<SimpleType> f69723p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LinkedHashSet linkedHashSet) {
        super(0);
        this.f69723p0 = linkedHashSet;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final String invoke() {
        return "This collections cannot be empty! input types: " + CollectionsKt___CollectionsKt.joinToString$default(this.f69723p0, null, null, null, 0, null, null, 63, null);
    }
}
