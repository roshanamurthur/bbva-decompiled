package com.bbva.glomohybrid.landing.domain.mapper;

import ad.d;
import com.bbva.component.dm.settings.domain.model.VisualMessageConfiguration;
import com.bbva.glomohybrid.landing.domain.model.LandingHeaderMessageModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingHeaderMessageMapper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/mapper/LandingHeaderMessageMapper;", "", "Lcom/bbva/component/dm/settings/domain/model/VisualMessageConfiguration;", "message", "Lcom/bbva/glomohybrid/landing/domain/model/LandingHeaderMessageModel;", "map", "", "host", "<init>", "(Ljava/lang/String;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingHeaderMessageMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingHeaderMessageMapper.kt\ncom/bbva/glomohybrid/landing/domain/mapper/LandingHeaderMessageMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,17:1\n1#2:18\n*E\n"})
public final class LandingHeaderMessageMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f32659a;

    public LandingHeaderMessageMapper(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.f32659a = host;
    }

    @NotNull
    public final LandingHeaderMessageModel map(@Nullable VisualMessageConfiguration message) {
        String strF = d.f(new StringBuilder(), this.f32659a, message != null ? message.getIcon() : null);
        if ((message != null ? message.getIcon() : null) == null) {
            strF = null;
        }
        return new LandingHeaderMessageModel(strF, message != null ? message.getTitle() : null, message != null ? message.getDescription() : null, message != null ? message.getButton() : null);
    }
}
