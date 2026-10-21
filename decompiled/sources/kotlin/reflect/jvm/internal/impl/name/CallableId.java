package kotlin.reflect.jvm.internal.impl.name;

import com.fasterxml.jackson.core.JsonPointer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CallableId.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class CallableId {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FqName f81321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final FqName f81322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Name f81323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final FqName f81324d;

    /* JADX INFO: compiled from: CallableId.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue(FqName.topLevel(SpecialNames.LOCAL), "topLevel(...)");
    }

    public CallableId(@NotNull FqName packageName, @Nullable FqName fqName, @NotNull Name callableName, @Nullable FqName fqName2) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callableName, "callableName");
        this.f81321a = packageName;
        this.f81322b = fqName;
        this.f81323c = callableName;
        this.f81324d = fqName2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallableId)) {
            return false;
        }
        CallableId callableId = (CallableId) obj;
        return Intrinsics.areEqual(this.f81321a, callableId.f81321a) && Intrinsics.areEqual(this.f81322b, callableId.f81322b) && Intrinsics.areEqual(this.f81323c, callableId.f81323c) && Intrinsics.areEqual(this.f81324d, callableId.f81324d);
    }

    public int hashCode() {
        int iHashCode = this.f81321a.hashCode() * 31;
        FqName fqName = this.f81322b;
        int iHashCode2 = (this.f81323c.hashCode() + ((iHashCode + (fqName == null ? 0 : fqName.hashCode())) * 31)) * 31;
        FqName fqName2 = this.f81324d;
        return iHashCode2 + (fqName2 != null ? fqName2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String strAsString = this.f81321a.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        sb2.append(l.replace$default(strAsString, '.', JsonPointer.SEPARATOR, false, 4, (Object) null));
        sb2.append("/");
        FqName fqName = this.f81322b;
        if (fqName != null) {
            sb2.append(fqName);
            sb2.append(Constant.DOT_STRING);
        }
        sb2.append(this.f81323c);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public /* synthetic */ CallableId(FqName fqName, FqName fqName2, Name name, FqName fqName3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fqName, fqName2, name, (i10 & 8) != 0 ? null : fqName3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallableId(@NotNull FqName packageName, @NotNull Name callableName) {
        this(packageName, null, callableName, null, 8, null);
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callableName, "callableName");
    }
}
