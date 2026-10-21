package com.bbva.glomohybrid.featureflags.repository.mapper;

import com.bbva.glomohybrid.featureflags.domain.model.FeatureFlags;
import com.google.gson.Gson;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FeatureFlagsMapper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/featureflags/repository/mapper/FeatureFlagsMapper;", "", "Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;", "featureFlags", "", "map", "content", "Lcom/google/gson/Gson;", "gson", "<init>", "(Lcom/google/gson/Gson;)V", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nFeatureFlagsMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureFlagsMapper.kt\ncom/bbva/glomohybrid/featureflags/repository/mapper/FeatureFlagsMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1#2:19\n*E\n"})
public final class FeatureFlagsMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Gson f32164a;

    /* JADX WARN: Multi-variable type inference failed */
    public FeatureFlagsMapper() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public final String map(@NotNull FeatureFlags featureFlags) {
        Intrinsics.checkNotNullParameter(featureFlags, "featureFlags");
        return this.f32164a.toJson(featureFlags.getFeatures(), Map.class);
    }

    public FeatureFlagsMapper(@NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f32164a = gson;
    }

    @Nullable
    public final FeatureFlags map(@Nullable String content) {
        if (((content == null || l.isBlank(content)) ? null : content) == null) {
            return null;
        }
        Object objFromJson = this.f32164a.fromJson(content, (Class<Object>) Map.class);
        Intrinsics.checkNotNull(objFromJson, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        return new FeatureFlags((Map) objFromJson);
    }

    public /* synthetic */ FeatureFlagsMapper(Gson gson, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Gson() : gson);
    }
}
