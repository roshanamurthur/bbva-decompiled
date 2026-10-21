package kotlin.reflect.jvm.internal.impl.descriptors;

import bk.d;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InlineClassRepresentation.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nInlineClassRepresentation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassRepresentation.kt\norg/jetbrains/kotlin/descriptors/InlineClassRepresentation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
public final class InlineClassRepresentation<Type extends SimpleTypeMarker> extends ValueClassRepresentation<Type> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Name f80204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Type f80205b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineClassRepresentation(@NotNull Name underlyingPropertyName, @NotNull Type underlyingType) {
        super(null);
        Intrinsics.checkNotNullParameter(underlyingPropertyName, "underlyingPropertyName");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        this.f80204a = underlyingPropertyName;
        this.f80205b = underlyingType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    public boolean containsPropertyWithName(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.areEqual(this.f80204a, name);
    }

    @NotNull
    public final Name getUnderlyingPropertyName() {
        return this.f80204a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    @NotNull
    public List<Pair<Name, Type>> getUnderlyingPropertyNamesToTypes() {
        return d.listOf(TuplesKt.to(this.f80204a, this.f80205b));
    }

    @NotNull
    public final Type getUnderlyingType() {
        return this.f80205b;
    }

    @NotNull
    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f80204a + ", underlyingType=" + this.f80205b + RootService.CLOSE_BRACKET;
    }
}
