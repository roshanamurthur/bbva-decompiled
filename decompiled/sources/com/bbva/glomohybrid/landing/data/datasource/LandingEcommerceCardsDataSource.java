package com.bbva.glomohybrid.landing.data.datasource;

import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingECommerceCardModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LandingEcommerceCardsDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/landing/data/datasource/LandingEcommerceCardsDataSource;", "", "", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceCardModel;", "get", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingEcommerceCardsDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingEcommerceCardsDataSource.kt\ncom/bbva/glomohybrid/landing/data/datasource/LandingEcommerceCardsDataSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class LandingEcommerceCardsDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f32523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f32524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Json f32525c;

    /* JADX INFO: compiled from: LandingEcommerceCardsDataSource.kt */
    public static final class a extends Lambda implements Function1<JsonBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f32526p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(JsonBuilder jsonBuilder) {
            JsonBuilder Json = jsonBuilder;
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
            return Unit.INSTANCE;
        }
    }

    public LandingEcommerceCardsDataSource(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f32523a = storage;
        this.f32524b = "ecommerceSelectedCards";
        this.f32525c = JsonKt.Json$default(null, a.f32526p0, 1, null);
    }

    @NotNull
    public final List<LandingECommerceCardModel> get() {
        Object objM5535constructorimpl;
        String string$default = MainStorage.getString$default(this.f32523a, this.f32524b, null, false, null, 14, null);
        if (string$default == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl((List) this.f32525c.decodeFromString(BuiltinSerializersKt.ListSerializer(LandingECommerceCardModel.INSTANCE.serializer()), string$default));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        List<LandingECommerceCardModel> list = (List) objM5535constructorimpl;
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }
}
