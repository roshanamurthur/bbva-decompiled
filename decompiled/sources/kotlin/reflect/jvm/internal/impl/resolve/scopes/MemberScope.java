package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import bk.w;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MemberScope.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface MemberScope extends ResolutionScope {

    @NotNull
    public static final Companion Companion = Companion.f81597a;

    /* JADX INFO: compiled from: MemberScope.kt */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f81597a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f81598b = a.f81599p0;

        /* JADX INFO: compiled from: MemberScope.kt */
        public static final class a extends Lambda implements Function1<Name, Boolean> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f81599p0 = new a(1);

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Name it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.TRUE;
            }
        }

        @NotNull
        public final Function1<Name, Boolean> getALL_NAME_FILTER() {
            return f81598b;
        }
    }

    /* JADX INFO: compiled from: MemberScope.kt */
    public static final class DefaultImpls {
        public static void recordLookup(@NotNull MemberScope memberScope, @NotNull Name name, @NotNull LookupLocation location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            ResolutionScope.DefaultImpls.recordLookup(memberScope, name, location);
        }
    }

    /* JADX INFO: compiled from: MemberScope.kt */
    public static final class Empty extends MemberScopeImpl {

        @NotNull
        public static final Empty INSTANCE = new Empty();

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        public Set<Name> getClassifierNames() {
            return w.emptySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        public Set<Name> getFunctionNames() {
            return w.emptySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        public Set<Name> getVariableNames() {
            return w.emptySet();
        }
    }

    @Nullable
    Set<Name> getClassifierNames();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    Collection<? extends SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation);

    @NotNull
    Collection<? extends PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation);

    @NotNull
    Set<Name> getFunctionNames();

    @NotNull
    Set<Name> getVariableNames();
}
