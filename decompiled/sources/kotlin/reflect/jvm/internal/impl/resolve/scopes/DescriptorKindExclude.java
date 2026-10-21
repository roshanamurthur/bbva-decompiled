package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MemberScope.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class DescriptorKindExclude {

    /* JADX INFO: compiled from: MemberScope.kt */
    public static final class NonExtensions extends DescriptorKindExclude {

        @NotNull
        public static final NonExtensions INSTANCE = new NonExtensions();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f81573a;

        static {
            DescriptorKindFilter.Companion companion = DescriptorKindFilter.Companion;
            f81573a = (~(companion.getVARIABLES_MASK() | companion.getFUNCTIONS_MASK())) & companion.getALL_KINDS_MASK();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        public int getFullyExcludedDescriptorKinds() {
            return f81573a;
        }
    }

    /* JADX INFO: compiled from: MemberScope.kt */
    public static final class TopLevelPackages extends DescriptorKindExclude {

        @NotNull
        public static final TopLevelPackages INSTANCE = new TopLevelPackages();

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        public int getFullyExcludedDescriptorKinds() {
            return 0;
        }
    }

    public abstract int getFullyExcludedDescriptorKinds();

    public String toString() {
        return getClass().getSimpleName();
    }
}
