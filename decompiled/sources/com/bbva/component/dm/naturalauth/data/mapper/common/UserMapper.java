package com.bbva.component.dm.naturalauth.data.mapper.common;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UserMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/mapper/common/UserMapper;", "", "", "getGender", "getDocumentType", "getDocumentNumber", "stringUser", "<init>", "(Ljava/lang/String;)V", "Companion", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public final class UserMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f27819a;

    public UserMapper(@NotNull String stringUser) {
        Intrinsics.checkNotNullParameter(stringUser, "stringUser");
        this.f27819a = stringUser;
    }

    @NotNull
    public final String getDocumentNumber() {
        return (String) StringsKt__StringsKt.split$default((CharSequence) this.f27819a, new String[]{"&"}, false, 0, 6, (Object) null).get(1);
    }

    @NotNull
    public final String getDocumentType() {
        return (String) CollectionsKt___CollectionsKt.first(StringsKt__StringsKt.split$default((CharSequence) this.f27819a, new String[]{"&"}, false, 0, 6, (Object) null));
    }

    @NotNull
    public final String getGender() {
        String str = (String) CollectionsKt___CollectionsKt.last(StringsKt__StringsKt.split$default((CharSequence) this.f27819a, new String[]{"&"}, false, 0, 6, (Object) null));
        if (Intrinsics.areEqual(str, "F")) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String upperCase = "F".toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            return upperCase;
        }
        if (!Intrinsics.areEqual(str, "M")) {
            return "X";
        }
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
        String upperCase2 = "M".toUpperCase(locale2);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        return upperCase2;
    }
}
