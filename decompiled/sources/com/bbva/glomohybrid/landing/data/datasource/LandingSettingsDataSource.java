package com.bbva.glomohybrid.landing.data.datasource;

import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomoconfig.constants.RouteConstants;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingECommerceSettingsModel;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingSettingsModel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LandingSettingsDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/landing/data/datasource/LandingSettingsDataSource;", "", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingSettingsModel;", "get", "", "isActiveByDefault", "", "updateECommerce", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingSettingsDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingSettingsDataSource.kt\ncom/bbva/glomohybrid/landing/data/datasource/LandingSettingsDataSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
public final class LandingSettingsDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f32530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f32531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Json f32532c;

    /* JADX INFO: compiled from: LandingSettingsDataSource.kt */
    public static final class a extends Lambda implements Function1<JsonBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f32533p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(JsonBuilder jsonBuilder) {
            JsonBuilder Json = jsonBuilder;
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
            Json.setExplicitNulls(false);
            Json.setEncodeDefaults(true);
            return Unit.INSTANCE;
        }
    }

    public LandingSettingsDataSource(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f32530a = storage;
        this.f32531b = RouteConstants.LANDING_SETTINGS;
        this.f32532c = JsonKt.Json$default(null, a.f32533p0, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final LandingSettingsModel get() {
        Object objM5535constructorimpl;
        LandingECommerceSettingsModel landingECommerceSettingsModel = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        String string$default = MainStorage.getString$default(this.f32530a, this.f32531b, null, false, null, 14, null);
        int i10 = 1;
        if (string$default == null) {
            return new LandingSettingsModel(landingECommerceSettingsModel, i10, (DefaultConstructorMarker) (objArr3 == true ? 1 : 0));
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl((LandingSettingsModel) this.f32532c.decodeFromString(LandingSettingsModel.INSTANCE.serializer(), string$default));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        LandingSettingsModel landingSettingsModel = (LandingSettingsModel) objM5535constructorimpl;
        return landingSettingsModel == null ? new LandingSettingsModel((LandingECommerceSettingsModel) (objArr2 == true ? 1 : 0), i10, (DefaultConstructorMarker) (objArr == true ? 1 : 0)) : landingSettingsModel;
    }

    public final void updateECommerce(boolean isActiveByDefault) {
        LandingSettingsModel landingSettingsModel = new LandingSettingsModel(LandingECommerceSettingsModel.copy$default(get().getECommerce(), null, isActiveByDefault, false, 5, null));
        MainStorage.put$default(this.f32530a, this.f32531b, this.f32532c.encodeToString(LandingSettingsModel.INSTANCE.serializer(), landingSettingsModel), false, null, 12, null);
    }
}
