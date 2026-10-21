package kotlin.reflect.jvm.internal.impl.descriptors;

import bk.q;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MultiFieldValueClassRepresentation.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nMultiFieldValueClassRepresentation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiFieldValueClassRepresentation.kt\norg/jetbrains/kotlin/descriptors/MultiFieldValueClassRepresentation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
public final class MultiFieldValueClassRepresentation<Type extends SimpleTypeMarker> extends ValueClassRepresentation<Type> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<Pair<Name, Type>> f80208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<Name, Type> f80209b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MultiFieldValueClassRepresentation(@NotNull List<? extends Pair<Name, ? extends Type>> underlyingPropertyNamesToTypes) {
        super(null);
        Intrinsics.checkNotNullParameter(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.f80208a = underlyingPropertyNamesToTypes;
        Map<Name, Type> map = q.toMap(getUnderlyingPropertyNamesToTypes());
        if (map.size() != getUnderlyingPropertyNamesToTypes().size()) {
            throw new IllegalArgumentException("Some properties have the same names".toString());
        }
        this.f80209b = map;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    public boolean containsPropertyWithName(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f80209b.containsKey(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    @NotNull
    public List<Pair<Name, Type>> getUnderlyingPropertyNamesToTypes() {
        return this.f80208a;
    }

    @NotNull
    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + getUnderlyingPropertyNamesToTypes() + RootService.CLOSE_BRACKET;
    }
}
