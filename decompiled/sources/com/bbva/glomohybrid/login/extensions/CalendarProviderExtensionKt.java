package com.bbva.glomohybrid.login.extensions;

import android.content.Context;
import com.bbva.cells.componentkit.model.dsl.Resource;
import com.bbva.cells.componentkit.model.dsl.ResourceId;
import com.bbva.cells.componentkit.model.dsl.SettingsKt;
import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.glomohybrid.login.R;
import com.bbva.glomohybrid.login.domain.model.LoginGreetingRange;
import com.bbva.glomohybrid.login.presentation.constants.LoginGreetingScheduleConstants;
import com.bbva.glomoutils.CalendarExtensionsKt;
import com.bbva.glomoutils.time.CalendarProvider;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CalendarProviderExtension.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"greetingsText", "Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "Lcom/bbva/glomoutils/time/CalendarProvider;", "context", "Landroid/content/Context;", "name", "", "Login_mexicoGoogleRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCalendarProviderExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarProviderExtension.kt\ncom/bbva/glomohybrid/login/extensions/CalendarProviderExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1#2:20\n*E\n"})
public final class CalendarProviderExtensionKt {

    /* JADX INFO: compiled from: CalendarProviderExtension.kt */
    public static final class a extends Lambda implements Function1<TextSettings, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f33467p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f33467p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextSettings textSettings) {
            TextSettings textSettings2 = textSettings;
            Intrinsics.checkNotNullParameter(textSettings2, "$this$textSettings");
            textSettings2.setText(new Resource(this.f33467p0, (ResourceId) null, 2, (DefaultConstructorMarker) null));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final TextSettings greetingsText(@NotNull CalendarProvider calendarProvider, @NotNull Context context, @Nullable String str) {
        Object next;
        String string;
        LoginGreetingRange loginGreetingRange;
        Intrinsics.checkNotNullParameter(calendarProvider, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Iterator<T> it = LoginGreetingScheduleConstants.INSTANCE.getRanges().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            loginGreetingRange = (LoginGreetingRange) next;
        } while (!CalendarExtensionsKt.isTimeInRange(calendarProvider.get(), loginGreetingRange.getStart(), loginGreetingRange.getEnd()));
        LoginGreetingRange loginGreetingRange2 = (LoginGreetingRange) next;
        if (loginGreetingRange2 == null || (string = context.getString(loginGreetingRange2.getResource(), str)) == null) {
            string = context.getString(R.string.login_place_holder_greeting, "");
        }
        Intrinsics.checkNotNull(string);
        return SettingsKt.textSettings(new a(string));
    }

    public static /* synthetic */ TextSettings greetingsText$default(CalendarProvider calendarProvider, Context context, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return greetingsText(calendarProvider, context, str);
    }
}
