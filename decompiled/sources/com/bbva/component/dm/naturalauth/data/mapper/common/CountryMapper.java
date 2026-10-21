package com.bbva.component.dm.naturalauth.data.mapper.common;

import com.bbva.component.dm.naturalauth.Constants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CountryMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/mapper/common/CountryMapper;", "", "", Constants.backendRequestUserId, "mapUserId", "mapCountry", "country", "<init>", "(Ljava/lang/String;)V", "Companion", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public final class CountryMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f27818a;

    public CountryMapper(@NotNull String country) {
        Intrinsics.checkNotNullParameter(country, "country");
        this.f27818a = country;
    }

    @NotNull
    public final String mapCountry() {
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String str = this.f27818a;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return Intrinsics.areEqual(lowerCase, "ar") ? "arg" : str;
    }

    @NotNull
    public final String mapUserId(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = this.f27818a.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (!Intrinsics.areEqual(lowerCase, "ar")) {
            return userId;
        }
        UserMapper userMapper = new UserMapper(userId);
        return userMapper.getGender() + Constant.DASH_STRING + userMapper.getDocumentType() + Constant.DASH_STRING + userMapper.getDocumentNumber();
    }
}
