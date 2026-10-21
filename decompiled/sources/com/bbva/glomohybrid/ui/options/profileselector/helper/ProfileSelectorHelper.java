package com.bbva.glomohybrid.ui.options.profileselector.helper;

import android.content.Context;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomohybrid.ui.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProfileSelectorHelper.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\b\u001a\u00020\u0004¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/profileselector/helper/ProfileSelectorHelper;", "", "Lcom/bbva/glomo/user/domain/model/UserType;", "userType", "", "stringFrom", "string", "userTypeFrom", "getDefault", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nProfileSelectorHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileSelectorHelper.kt\ncom/bbva/glomohybrid/ui/options/profileselector/helper/ProfileSelectorHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
public final class ProfileSelectorHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f34689a;

    /* JADX INFO: compiled from: ProfileSelectorHelper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserType.values().length];
            try {
                iArr[UserType.PERSONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserType.ENTERPRISE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ProfileSelectorHelper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34689a = context;
    }

    @NotNull
    public final String getDefault() {
        String string = this.f34689a.getString(R.string.user_type_selector_default);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @NotNull
    public final String stringFrom(@NotNull UserType userType) {
        int i10;
        Intrinsics.checkNotNullParameter(userType, "userType");
        int i11 = WhenMappings.$EnumSwitchMapping$0[userType.ordinal()];
        if (i11 == 1) {
            i10 = R.string.user_type_option_1;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = R.string.user_type_option_2;
        }
        String string = this.f34689a.getString(i10);
        Intrinsics.checkNotNullExpressionValue(string, "let(...)");
        return string;
    }

    @NotNull
    public final UserType userTypeFrom(@Nullable String string) {
        int i10 = R.string.user_type_option_1;
        Context context = this.f34689a;
        if (Intrinsics.areEqual(string, context.getString(i10))) {
            return UserType.PERSONAL;
        }
        return Intrinsics.areEqual(string, context.getString(R.string.user_type_option_2)) ? UserType.ENTERPRISE : UserType.PERSONAL;
    }
}
