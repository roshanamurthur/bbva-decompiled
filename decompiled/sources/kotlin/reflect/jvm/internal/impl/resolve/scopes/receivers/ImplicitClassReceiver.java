package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ImplicitClassReceiver.kt */
/* JADX INFO: loaded from: classes12.dex */
public class ImplicitClassReceiver implements ImplicitReceiver, ThisClassReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ClassDescriptor f81624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ClassDescriptor f81625b;

    public ImplicitClassReceiver(@NotNull ClassDescriptor classDescriptor, @Nullable ImplicitClassReceiver implicitClassReceiver) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        this.f81624a = classDescriptor;
        this.f81625b = classDescriptor;
    }

    public boolean equals(@Nullable Object obj) {
        ImplicitClassReceiver implicitClassReceiver = obj instanceof ImplicitClassReceiver ? (ImplicitClassReceiver) obj : null;
        return Intrinsics.areEqual(this.f81624a, implicitClassReceiver != null ? implicitClassReceiver.f81624a : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver
    @NotNull
    public final ClassDescriptor getClassDescriptor() {
        return this.f81624a;
    }

    public int hashCode() {
        return this.f81624a.hashCode();
    }

    @NotNull
    public String toString() {
        return "Class{" + getType() + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    @NotNull
    public SimpleType getType() {
        SimpleType defaultType = this.f81624a.getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
        return defaultType;
    }
}
