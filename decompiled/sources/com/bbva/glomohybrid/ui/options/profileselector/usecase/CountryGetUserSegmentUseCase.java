package com.bbva.glomohybrid.ui.options.profileselector.usecase;

import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CountryGetUserSegmentUseCase.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/profileselector/usecase/CountryGetUserSegmentUseCase;", "Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "Lcom/bbva/glomo/user/domain/model/UserType;", "", "()V", "execute", "params", "Companion", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CountryGetUserSegmentUseCase implements UseCaseWithParams<UserType, String> {

    @NotNull
    public static final String USER_SEGMENT_GLOBAL_ENTERPRISE = "003006";

    @NotNull
    public static final String USER_SEGMENT_GLOBAL_PERSONAL = "003001";

    /* JADX INFO: compiled from: CountryGetUserSegmentUseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserType.values().length];
            try {
                iArr[UserType.ENTERPRISE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.bbva.glomoutils.usecase.UseCaseWithParams
    @NotNull
    public String execute(@NotNull UserType params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return WhenMappings.$EnumSwitchMapping$0[params.ordinal()] == 1 ? USER_SEGMENT_GLOBAL_ENTERPRISE : USER_SEGMENT_GLOBAL_PERSONAL;
    }
}
