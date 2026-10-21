package com.bbva.glomohybrid.landing.domain.aem.filters;

import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.landing.domain.aem.extensions.LandingAEMItemModelExtensionsKt;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingUserConditionFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\u00020\u0006*\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/aem/filters/LandingUserConditionFilter;", "Lcom/bbva/glomohybrid/landing/domain/aem/filters/BaseLandingConditionFilter;", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;", "aemItemModel", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "user", "", "meetCondition", "(Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;Lcom/bbva/glomo/user/domain/model/RememberedUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isUserValid", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "<init>", "()V", "Companion", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public class LandingUserConditionFilter extends BaseLandingConditionFilter {

    @NotNull
    public static final String ID = "checkUserIds";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id = ID;

    @Override // com.bbva.glomohybrid.landing.domain.aem.filters.LandingAEMConditionFilter
    @NotNull
    public String getId() {
        return this.id;
    }

    public boolean isUserValid(@NotNull LandingAEMModel landingAEMModel, @Nullable RememberedUser rememberedUser) {
        String document;
        List listSplit$default;
        String str;
        Intrinsics.checkNotNullParameter(landingAEMModel, "<this>");
        if (rememberedUser == null || (document = rememberedUser.getDocument()) == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) document, new String[]{"&"}, false, 0, 6, (Object) null)) == null || (str = (String) listSplit$default.get(0)) == null) {
            return true;
        }
        List<String> userIds = LandingAEMItemModelExtensionsKt.getUserIds(landingAEMModel);
        if (userIds != null) {
            return userIds.contains(str);
        }
        return false;
    }

    @Override // com.bbva.glomohybrid.landing.domain.aem.filters.LandingAEMConditionFilter
    @Nullable
    public Object meetCondition(@NotNull LandingAEMModel landingAEMModel, @Nullable RememberedUser rememberedUser, @NotNull Continuation<? super Boolean> continuation) {
        LandingAEMModel landingAEMModelCheckConditions = checkConditions(landingAEMModel);
        return Boxing.boxBoolean(landingAEMModelCheckConditions != null ? isUserValid(landingAEMModelCheckConditions, rememberedUser) : true);
    }
}
