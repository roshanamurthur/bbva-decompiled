package kotlin.reflect.jvm.internal.impl.types;

import java.io.IOException;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.text.i;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KotlinType.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class SimpleType extends UnwrappedType implements SimpleTypeMarker, TypeArgumentListMarker {
    public SimpleType() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public abstract SimpleType makeNullableAsSpecified(boolean z10);

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public abstract SimpleType replaceAttributes(@NotNull TypeAttributes typeAttributes);

    @NotNull
    public String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        Iterator<AnnotationDescriptor> it = getAnnotations().iterator();
        while (it.hasNext()) {
            i.append(sb2, Constant.BRACKET_OPEN, DescriptorRenderer.renderAnnotation$default(DescriptorRenderer.DEBUG_TEXT, it.next(), null, 2, null), "] ");
        }
        sb2.append(getConstructor());
        if (!getArguments().isEmpty()) {
            CollectionsKt___CollectionsKt.joinTo(getArguments(), sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : "<", (112 & 8) == 0 ? ">" : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null);
        }
        if (isMarkedNullable()) {
            sb2.append("?");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
