package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class Checks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Name f82067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Regex f82068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Collection<Name> f82069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function1<FunctionDescriptor, String> f82070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Check[] f82071e;

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f82072p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Void invoke(@NotNull FunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "$this$null");
            return null;
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f82073p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Void invoke(@NotNull FunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "$this$null");
            return null;
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f82074p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Void invoke(@NotNull FunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "$this$null");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Checks(Name name, Regex regex, Collection<Name> collection, Function1<? super FunctionDescriptor, String> function1, Check... checkArr) {
        this.f82067a = name;
        this.f82068b = regex;
        this.f82069c = collection;
        this.f82070d = function1;
        this.f82071e = checkArr;
    }

    @NotNull
    public final CheckResult checkAll(@NotNull FunctionDescriptor functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        for (Check check : this.f82071e) {
            String strInvoke = check.invoke(functionDescriptor);
            if (strInvoke != null) {
                return new CheckResult.IllegalSignature(strInvoke);
            }
        }
        String strInvoke2 = this.f82070d.invoke(functionDescriptor);
        return strInvoke2 != null ? new CheckResult.IllegalSignature(strInvoke2) : CheckResult.SuccessCheck.INSTANCE;
    }

    public final boolean isApplicable(@NotNull FunctionDescriptor functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        Name name = this.f82067a;
        if (name != null && !Intrinsics.areEqual(functionDescriptor.getName(), name)) {
            return false;
        }
        Regex regex = this.f82068b;
        if (regex != null) {
            String strAsString = functionDescriptor.getName().asString();
            Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
            if (!regex.matches(strAsString)) {
                return false;
            }
        }
        Collection<Name> collection = this.f82069c;
        return collection == null || collection.contains(functionDescriptor.getName());
    }

    public /* synthetic */ Checks(Name name, Check[] checkArr, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, checkArr, (Function1<? super FunctionDescriptor, String>) ((i10 & 4) != 0 ? a.f82072p0 : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(@NotNull Name name, @NotNull Check[] checks, @NotNull Function1<? super FunctionDescriptor, String> additionalChecks) {
        this(name, (Regex) null, (Collection<Name>) null, additionalChecks, (Check[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ Checks(Regex regex, Check[] checkArr, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(regex, checkArr, (Function1<? super FunctionDescriptor, String>) ((i10 & 4) != 0 ? b.f82073p0 : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(@NotNull Regex regex, @NotNull Check[] checks, @NotNull Function1<? super FunctionDescriptor, String> additionalChecks) {
        this((Name) null, regex, (Collection<Name>) null, additionalChecks, (Check[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ Checks(Collection collection, Check[] checkArr, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((Collection<Name>) collection, checkArr, (Function1<? super FunctionDescriptor, String>) ((i10 & 4) != 0 ? c.f82074p0 : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(@NotNull Collection<Name> nameList, @NotNull Check[] checks, @NotNull Function1<? super FunctionDescriptor, String> additionalChecks) {
        this((Name) null, (Regex) null, nameList, additionalChecks, (Check[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.checkNotNullParameter(nameList, "nameList");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
    }
}
