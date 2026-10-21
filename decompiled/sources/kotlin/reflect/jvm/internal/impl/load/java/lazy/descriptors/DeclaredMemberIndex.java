package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import bk.w;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeclaredMemberIndex.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface DeclaredMemberIndex {

    /* JADX INFO: compiled from: DeclaredMemberIndex.kt */
    public static final class Empty implements DeclaredMemberIndex {

        @NotNull
        public static final Empty INSTANCE = new Empty();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @Nullable
        public JavaField findFieldByName(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @Nullable
        public JavaRecordComponent findRecordComponentByName(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @NotNull
        public Set<Name> getFieldNames() {
            return w.emptySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @NotNull
        public Set<Name> getMethodNames() {
            return w.emptySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @NotNull
        public Set<Name> getRecordComponentNames() {
            return w.emptySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @NotNull
        public List<JavaMethod> findMethodsByName(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @Nullable
    JavaField findFieldByName(@NotNull Name name);

    @NotNull
    Collection<JavaMethod> findMethodsByName(@NotNull Name name);

    @Nullable
    JavaRecordComponent findRecordComponentByName(@NotNull Name name);

    @NotNull
    Set<Name> getFieldNames();

    @NotNull
    Set<Name> getMethodNames();

    @NotNull
    Set<Name> getRecordComponentNames();
}
