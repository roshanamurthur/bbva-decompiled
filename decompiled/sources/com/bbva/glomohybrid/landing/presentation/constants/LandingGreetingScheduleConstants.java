package com.bbva.glomohybrid.landing.presentation.constants;

import com.bbva.glomohybrid.landing.R;
import com.bbva.glomohybrid.landing.presentation.model.LandingGreetingRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LandingGreetingScheduleConstants.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/constants/LandingGreetingScheduleConstants;", "", "()V", "ranges", "", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingGreetingRange;", "getRanges", "()Ljava/util/List;", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LandingGreetingScheduleConstants {

    @NotNull
    public static final LandingGreetingScheduleConstants INSTANCE = new LandingGreetingScheduleConstants();

    @NotNull
    public final List<LandingGreetingRange> getRanges() {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new LandingGreetingRange[]{new LandingGreetingRange("00:00", "11:59", R.string.label_greeting_good_morning), new LandingGreetingRange("12:00", "18:59", R.string.label_greeting_good_afternoon), new LandingGreetingRange("19:00", "23:59", R.string.label_greeting_good_evening)});
    }
}
