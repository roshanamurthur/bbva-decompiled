package com.bbva.glomohybrid.login.presentation.constants;

import com.bbva.glomohybrid.login.R;
import com.bbva.glomohybrid.login.domain.model.LoginGreetingRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LoginGreetingScheduleConstants.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/constants/LoginGreetingScheduleConstants;", "", "()V", "ranges", "", "Lcom/bbva/glomohybrid/login/domain/model/LoginGreetingRange;", "getRanges", "()Ljava/util/List;", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LoginGreetingScheduleConstants {

    @NotNull
    public static final LoginGreetingScheduleConstants INSTANCE = new LoginGreetingScheduleConstants();

    @NotNull
    public final List<LoginGreetingRange> getRanges() {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new LoginGreetingRange[]{new LoginGreetingRange("00:00", "11:59", R.string.login_label_greeting_good_morning), new LoginGreetingRange("12:00", "18:59", R.string.login_label_greeting_good_afternoon), new LoginGreetingRange("19:00", "23:59", R.string.login_label_greeting_good_evening)});
    }
}
