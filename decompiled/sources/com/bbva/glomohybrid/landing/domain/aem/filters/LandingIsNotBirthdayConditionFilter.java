package com.bbva.glomohybrid.landing.domain.aem.filters;

import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel;
import com.bbva.glomoutils.StringDateExtensionsKt;
import com.google.gson.JsonElement;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingBirthdayConditionFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/aem/filters/LandingIsNotBirthdayConditionFilter;", "Lcom/bbva/glomohybrid/landing/domain/aem/filters/BaseLandingConditionFilter;", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;", "aemItemModel", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "user", "", "meetCondition", "(Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;Lcom/bbva/glomo/user/domain/model/RememberedUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "Companion", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingBirthdayConditionFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingBirthdayConditionFilter.kt\ncom/bbva/glomohybrid/landing/domain/aem/filters/LandingIsNotBirthdayConditionFilter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
public final class LandingIsNotBirthdayConditionFilter extends BaseLandingConditionFilter {

    @NotNull
    public static final String ID = "isNotBirthday";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f32582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    public LandingIsNotBirthdayConditionFilter(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f32582a = storage;
        this.id = ID;
    }

    @Override // com.bbva.glomohybrid.landing.domain.aem.filters.LandingAEMConditionFilter
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // com.bbva.glomohybrid.landing.domain.aem.filters.LandingAEMConditionFilter
    @Nullable
    public Object meetCondition(@NotNull LandingAEMModel landingAEMModel, @Nullable RememberedUser rememberedUser, @NotNull Continuation<? super Boolean> continuation) {
        boolean z10 = true;
        if (checkConditions(landingAEMModel) != null) {
            JsonElement jsonElement = MainStorage.getJson$default(this.f32582a, LocalStorageConstantsKt.KEY_USER_BIRTHDAY, false, null, 6, null).get("value");
            String asString = jsonElement != null ? jsonElement.getAsString() : null;
            if (asString != null && StringDateExtensionsKt.isBirthdayToday(asString)) {
                z10 = false;
            }
        }
        return Boxing.boxBoolean(z10);
    }
}
