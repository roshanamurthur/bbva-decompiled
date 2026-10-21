package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.fasterxml.jackson.core.JsonPointer;
import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NameResolverImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class NameResolverImpl implements NameResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ProtoBuf.StringTable f81247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ProtoBuf.QualifiedNameTable f81248b;

    /* JADX INFO: compiled from: NameResolverImpl.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.values().length];
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NameResolverImpl(@NotNull ProtoBuf.StringTable strings, @NotNull ProtoBuf.QualifiedNameTable qualifiedNames) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(qualifiedNames, "qualifiedNames");
        this.f81247a = strings;
        this.f81248b = qualifiedNames;
    }

    public final Triple<List<String>, List<String>, Boolean> a(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i10 != -1) {
            ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName = this.f81248b.getQualifiedName(i10);
            String string = this.f81247a.getString(qualifiedName.getShortName());
            ProtoBuf.QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.getKind();
            Intrinsics.checkNotNull(kind);
            int i11 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i11 == 1) {
                linkedList2.addFirst(string);
            } else if (i11 == 2) {
                linkedList.addFirst(string);
            } else if (i11 == 3) {
                linkedList2.addFirst(string);
                z10 = true;
            }
            i10 = qualifiedName.getParentQualifiedName();
        }
        return new Triple<>(linkedList, linkedList2, Boolean.valueOf(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getQualifiedClassName(int i10) {
        Triple<List<String>, List<String>, Boolean> tripleA = a(i10);
        List<String> listComponent1 = tripleA.component1();
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(tripleA.component2(), Constant.DOT_STRING, null, null, 0, null, null, 62, null);
        if (listComponent1.isEmpty()) {
            return strJoinToString$default;
        }
        return CollectionsKt___CollectionsKt.joinToString$default(listComponent1, "/", null, null, 0, null, null, 62, null) + JsonPointer.SEPARATOR + strJoinToString$default;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getString(int i10) {
        String string = this.f81247a.getString(i10);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i10) {
        return a(i10).getThird().booleanValue();
    }
}
