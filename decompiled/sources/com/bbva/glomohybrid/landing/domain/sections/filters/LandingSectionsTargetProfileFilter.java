package com.bbva.glomohybrid.landing.domain.sections.filters;

import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.landing.domain.aem.common.filters.LandingTargetProfileFilter;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardButtonModel;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel;
import com.google.android.gms.common.Scopes;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LandingSectionsTargetProfileFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/sections/filters/LandingSectionsTargetProfileFilter;", "Lcom/bbva/glomohybrid/landing/domain/aem/common/filters/LandingTargetProfileFilter;", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardModel;", "section", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", Scopes.PROFILE, "", "isTargetProfileAvailable", "<init>", "()V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingSectionsTargetProfileFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingSectionsTargetProfileFilter.kt\ncom/bbva/glomohybrid/landing/domain/sections/filters/LandingSectionsTargetProfileFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1726#2,3:42\n*S KotlinDebug\n*F\n+ 1 LandingSectionsTargetProfileFilter.kt\ncom/bbva/glomohybrid/landing/domain/sections/filters/LandingSectionsTargetProfileFilter\n*L\n23#1:42,3\n*E\n"})
public final class LandingSectionsTargetProfileFilter extends LandingTargetProfileFilter {
    public final boolean isTargetProfileAvailable(@NotNull LandingMessageCardModel section, @NotNull UserProfileConfiguration profile) {
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(profile, "profile");
        LandingMessageCardButtonModel link = section.getLink();
        if (link == null || isTargetProfileAvailable(link.getTargetProfile(), profile)) {
            List<LandingMessageCardButtonModel> buttons = section.getButtons();
            if (buttons != null) {
                List<LandingMessageCardButtonModel> list = buttons;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (!isTargetProfileAvailable(((LandingMessageCardButtonModel) it.next()).getTargetProfile(), profile)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
