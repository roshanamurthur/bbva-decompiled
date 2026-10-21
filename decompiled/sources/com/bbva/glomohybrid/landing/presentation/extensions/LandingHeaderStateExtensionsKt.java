package com.bbva.glomohybrid.landing.presentation.extensions;

import android.content.Context;
import com.bbva.cells.componentkit.model.dsl.Resource;
import com.bbva.cells.componentkit.model.dsl.ResourceId;
import com.bbva.cells.componentkit.model.dsl.SettingsKt;
import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.component.ui.landing.access.model.LandingAccessButton;
import com.bbva.component.ui.landing.access.model.LandingAccessConfiguration;
import com.bbva.component.ui.landing.access.model.LandingAccessLink;
import com.bbva.component.ui.landing.access.model.LandingImage;
import com.bbva.component.ui.message.card.model.Button;
import com.bbva.component.ui.message.card.model.ButtonStyle;
import com.bbva.component.ui.message.card.model.ImageSize;
import com.bbva.component.ui.message.card.model.MessageCardState;
import com.bbva.component.ui.message.card.model.TypeMessage;
import com.bbva.glomohybrid.base.models.UserAvatarModel;
import com.bbva.glomohybrid.landing.R;
import com.bbva.glomohybrid.landing.domain.model.LandingHeaderMessageModel;
import com.bbva.glomohybrid.landing.presentation.constants.LandingAccessViewConstants;
import com.bbva.glomohybrid.landing.presentation.constants.LandingGreetingScheduleConstants;
import com.bbva.glomohybrid.landing.presentation.model.LandingGreetingRange;
import com.bbva.glomohybrid.landing.presentation.model.LandingHeaderState;
import com.bbva.glomoutils.CalendarExtensionsKt;
import com.bbva.glomoutils.time.CalendarProvider;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import m9.b;
import m9.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingHeaderStateExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState;", "Landroid/content/Context;", "context", "Lcom/bbva/component/ui/landing/access/model/LandingAccessConfiguration;", "mapToAccessViewState", "Lcom/bbva/component/ui/landing/access/model/LandingAccessButton;", "mapToAccessButton", "Lcom/bbva/component/ui/message/card/model/MessageCardState;", "mapToBlockerMessage", "Landing_mexicoRelease"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingHeaderStateExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingHeaderStateExtensions.kt\ncom/bbva/glomohybrid/landing/presentation/extensions/LandingHeaderStateExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"})
public final class LandingHeaderStateExtensionsKt {

    /* JADX INFO: compiled from: LandingHeaderStateExtensions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LandingHeaderState.AccessType.values().length];
            try {
                iArr[LandingHeaderState.AccessType.BIOMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: LandingHeaderStateExtensions.kt */
    public static final class a extends Lambda implements Function1<TextSettings, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f33048p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LandingHeaderState f33049q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, LandingHeaderState landingHeaderState) {
            super(1);
            this.f33048p0 = str;
            this.f33049q0 = landingHeaderState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextSettings textSettings) {
            TextSettings textSettings2 = textSettings;
            Intrinsics.checkNotNullParameter(textSettings2, "$this$textSettings");
            textSettings2.setText(new Resource(this.f33048p0, (ResourceId) null, 2, (DefaultConstructorMarker) null));
            textSettings2.setView(SettingsKt.viewSettings(new com.bbva.glomohybrid.landing.presentation.extensions.a(this.f33049q0)));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final LandingAccessButton mapToAccessButton(@NotNull LandingHeaderState landingHeaderState, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(landingHeaderState, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        LandingHeaderState.AccessType accessType = landingHeaderState.getAccessType();
        String string = context.getString((accessType != null && WhenMappings.$EnumSwitchMapping$0[accessType.ordinal()] == 1) ? R.string.button_landing_go_to_biometric_login : R.string.button_landing_go_to_login);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new LandingAccessButton(LandingAccessViewConstants.ID_EVENT_LOGIN_NAVIGATION, SettingsKt.textSettings(new a(string, landingHeaderState)));
    }

    @NotNull
    public static final LandingAccessConfiguration mapToAccessViewState(@NotNull LandingHeaderState landingHeaderState, @NotNull Context context) {
        String string;
        TextSettings textSettings;
        Intrinsics.checkNotNullParameter(landingHeaderState, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        UserAvatarModel avatar = landingHeaderState.getAvatar();
        Object obj = null;
        String base64 = avatar != null ? avatar.getBase64() : null;
        String userFullName = landingHeaderState.getUserFullName();
        if (userFullName == null || !(!l.isBlank(userFullName))) {
            userFullName = null;
        }
        LandingImage landingImage = new LandingImage(base64, null, userFullName);
        String userName = landingHeaderState.getUserName();
        if (userName == null || l.isBlank(userName)) {
            Calendar calendar = CalendarProvider.INSTANCE.get();
            for (Object obj2 : LandingGreetingScheduleConstants.INSTANCE.getRanges()) {
                LandingGreetingRange landingGreetingRange = (LandingGreetingRange) obj2;
                if (CalendarExtensionsKt.isTimeInRange(calendar, landingGreetingRange.getStart(), landingGreetingRange.getEnd())) {
                    obj = obj2;
                    break;
                }
            }
            LandingGreetingRange landingGreetingRange2 = (LandingGreetingRange) obj;
            if (landingGreetingRange2 == null || (string = context.getString(landingGreetingRange2.getResource())) == null) {
                string = context.getString(R.string.place_holder_greeting, "");
            }
            Intrinsics.checkNotNull(string);
            textSettings = SettingsKt.textSettings(new b(string));
        } else {
            String string2 = context.getString(R.string.place_holder_greeting, landingHeaderState.getUserName());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            textSettings = SettingsKt.textSettings(new m9.a(string2));
        }
        TextSettings textSettings2 = textSettings;
        String string3 = context.getString(R.string.label_change_user);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new LandingAccessConfiguration(landingImage, textSettings2, (TextSettings) null, (TextSettings) null, new LandingAccessLink(LandingAccessViewConstants.ID_EVENT_CHANGE_USER, SettingsKt.textSettings(new d(string3, landingHeaderState)), (ResourceId) null, 4, (DefaultConstructorMarker) null), mapToAccessButton(landingHeaderState, context), 4, (DefaultConstructorMarker) null);
    }

    @Nullable
    public static final MessageCardState mapToBlockerMessage(@NotNull LandingHeaderState landingHeaderState, @NotNull Context context) {
        String image;
        String string;
        String string2;
        String string3;
        String image2;
        String string4;
        String str;
        String description;
        Intrinsics.checkNotNullParameter(landingHeaderState, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        LandingHeaderState.Type type = landingHeaderState.getType();
        if (Intrinsics.areEqual(type, LandingHeaderState.Type.Blocked.INSTANCE)) {
            String id = landingHeaderState.getType().getId();
            LandingHeaderMessageModel message = landingHeaderState.getMessage();
            if (message == null || (image2 = message.getImage()) == null) {
                image2 = "ic_warning_illus";
            }
            String str2 = image2;
            ImageSize imageSize = ImageSize.SMALL;
            LandingHeaderMessageModel message2 = landingHeaderState.getMessage();
            if (message2 == null || (string4 = message2.getTitle()) == null) {
                string4 = context.getString(R.string.label_app_not_available_title);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            }
            String str3 = string4;
            LandingHeaderMessageModel message3 = landingHeaderState.getMessage();
            if (message3 == null || (description = message3.getDescription()) == null) {
                String string5 = context.getString(R.string.label_app_not_available_message);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                str = string5;
            } else {
                str = description;
            }
            return new MessageCardState(id, (TypeMessage) null, str2, imageSize, (String) null, str3, str, (Button) null, (List) null, (String) null, 914, (DefaultConstructorMarker) null);
        }
        if (!(type instanceof LandingHeaderState.Type.BlockedForUpdate)) {
            if (Intrinsics.areEqual(type, LandingHeaderState.Type.Enabled.INSTANCE)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        String packageId = ((LandingHeaderState.Type.BlockedForUpdate) landingHeaderState.getType()).getPackageId();
        String id2 = landingHeaderState.getType().getId();
        LandingHeaderMessageModel message4 = landingHeaderState.getMessage();
        if (message4 == null || (image = message4.getImage()) == null) {
            image = "ill_force_update";
        }
        String str4 = image;
        ImageSize imageSize2 = ImageSize.SMALL;
        LandingHeaderMessageModel message5 = landingHeaderState.getMessage();
        if (message5 == null || (string = message5.getTitle()) == null) {
            string = context.getString(R.string.label_app_not_available_for_update_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        String str5 = string;
        LandingHeaderMessageModel message6 = landingHeaderState.getMessage();
        if (message6 == null || (string2 = message6.getDescription()) == null) {
            string2 = context.getString(R.string.label_app_not_available_for_update_message);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        }
        String str6 = string2;
        LandingHeaderMessageModel message7 = landingHeaderState.getMessage();
        if (message7 == null || (string3 = message7.getButton()) == null) {
            string3 = context.getString(R.string.label_app_not_available_for_update_button);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        }
        return new MessageCardState(id2, (TypeMessage) null, str4, imageSize2, (String) null, str5, str6, new Button(packageId, string3, ButtonStyle.LINK), CollectionsKt__CollectionsKt.emptyList(), (String) null, 530, (DefaultConstructorMarker) null);
    }
}
