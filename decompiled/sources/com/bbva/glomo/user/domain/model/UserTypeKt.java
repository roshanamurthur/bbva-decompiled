package com.bbva.glomo.user.domain.model;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UserType.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0004"}, d2 = {"SHOW_USERTYPE_SELECTOR_USECASE_NAME", "", "toUserType", "Lcom/bbva/glomo/user/domain/model/UserType;", "gl-user-domain_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserType.kt\ncom/bbva/glomo/user/domain/model/UserTypeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,11:1\n1#2:12\n*E\n"})
public final class UserTypeKt {

    @NotNull
    public static final String SHOW_USERTYPE_SELECTOR_USECASE_NAME = "ShowUserTypeSelectorName";

    @Nullable
    public static final UserType toUserType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        for (UserType userType : UserType.values()) {
            String value = userType.getValue();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (Intrinsics.areEqual(value, lowerCase)) {
                return userType;
            }
        }
        return null;
    }
}
