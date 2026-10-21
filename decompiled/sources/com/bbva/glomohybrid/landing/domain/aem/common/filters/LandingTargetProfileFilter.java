package com.bbva.glomohybrid.landing.domain.aem.common.filters;

import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomo.user.domain.model.UserTypeKt;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingTargetProfileFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0004¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/aem/common/filters/LandingTargetProfileFilter;", "", "()V", "isTargetProfileAvailable", "", "targetProfile", "", Scopes.PROFILE, "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class LandingTargetProfileFilter {

    /* JADX INFO: compiled from: LandingTargetProfileFilter.kt */
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

    public final boolean isTargetProfileAvailable(@Nullable String targetProfile, @NotNull UserProfileConfiguration profile) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        if (targetProfile == null) {
            return true;
        }
        UserType userType = UserTypeKt.toUserType(targetProfile);
        if (userType == null) {
            return false;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[userType.ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return profile.isEnterpriseProfileAvailable();
        }
        throw new NoWhenBranchMatchedException();
    }
}
