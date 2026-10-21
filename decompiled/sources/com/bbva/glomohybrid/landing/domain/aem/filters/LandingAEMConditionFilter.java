package com.bbva.glomohybrid.landing.domain.aem.filters;

import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingAEMConditionFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/aem/filters/LandingAEMConditionFilter;", "", "id", "", "getId", "()Ljava/lang/String;", "meetCondition", "", "aemItemModel", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;", "user", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "(Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;Lcom/bbva/glomo/user/domain/model/RememberedUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LandingAEMConditionFilter {

    /* JADX INFO: compiled from: LandingAEMConditionFilter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object meetCondition$default(LandingAEMConditionFilter landingAEMConditionFilter, LandingAEMModel landingAEMModel, RememberedUser rememberedUser, Continuation continuation, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: meetCondition");
            }
            if ((i10 & 2) != 0) {
                rememberedUser = null;
            }
            return landingAEMConditionFilter.meetCondition(landingAEMModel, rememberedUser, continuation);
        }
    }

    @NotNull
    String getId();

    @Nullable
    Object meetCondition(@NotNull LandingAEMModel landingAEMModel, @Nullable RememberedUser rememberedUser, @NotNull Continuation<? super Boolean> continuation);
}
