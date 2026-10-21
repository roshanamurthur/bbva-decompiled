package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ClassData.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ClassData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NameResolver f81650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ProtoBuf.Class f81651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final BinaryVersion f81652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SourceElement f81653d;

    public ClassData(@NotNull NameResolver nameResolver, @NotNull ProtoBuf.Class classProto, @NotNull BinaryVersion metadataVersion, @NotNull SourceElement sourceElement) {
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(classProto, "classProto");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        this.f81650a = nameResolver;
        this.f81651b = classProto;
        this.f81652c = metadataVersion;
        this.f81653d = sourceElement;
    }

    @NotNull
    public final NameResolver component1() {
        return this.f81650a;
    }

    @NotNull
    public final ProtoBuf.Class component2() {
        return this.f81651b;
    }

    @NotNull
    public final BinaryVersion component3() {
        return this.f81652c;
    }

    @NotNull
    public final SourceElement component4() {
        return this.f81653d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassData)) {
            return false;
        }
        ClassData classData = (ClassData) obj;
        return Intrinsics.areEqual(this.f81650a, classData.f81650a) && Intrinsics.areEqual(this.f81651b, classData.f81651b) && Intrinsics.areEqual(this.f81652c, classData.f81652c) && Intrinsics.areEqual(this.f81653d, classData.f81653d);
    }

    public int hashCode() {
        return this.f81653d.hashCode() + ((this.f81652c.hashCode() + ((this.f81651b.hashCode() + (this.f81650a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ClassData(nameResolver=" + this.f81650a + ", classProto=" + this.f81651b + ", metadataVersion=" + this.f81652c + ", sourceElement=" + this.f81653d + RootService.CLOSE_BRACKET;
    }
}
