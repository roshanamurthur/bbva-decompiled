package com.mastercard.sonic.analytics.mixpanel;

import android.content.Context;
import com.mastercard.sonic.BuildConfig;
import com.mastercard.sonic.SonicInternalConstants;
import com.mastercard.sonic.analytics.mixpanel.model.MixPanel;
import com.mastercard.sonic.analytics.mixpanel.model.Properties;
import com.mastercard.sonic.analytics.mixpanel.model.TrackEvent;
import com.mastercard.sonic.controller.SonicEnvironment;
import com.mastercard.sonic.controller.SonicType;
import com.mastercard.sonic.model.SonicMerchant;
import com.mastercard.sonic.observers.EventListener;
import com.mastercard.sonic.observers.ThreadStatus;
import com.mastercard.sonic.utils.SharedPreferenceUtils;
import com.mastercard.sonic.utils.Utils;
import com.mastercard.sonic.utils.calendar.CalendarPart;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MixPanelAnalyticsManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB1\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/mastercard/sonic/analytics/mixpanel/MixPanelAnalyticsManager;", "Lcom/mastercard/sonic/observers/EventListener;", "Lcom/mastercard/sonic/observers/ThreadStatus;", "", "eventType", "event", "", "update", "Lcom/mastercard/sonic/analytics/mixpanel/model/TrackEvent;", "trackEvent", "Lcom/mastercard/sonic/model/SonicMerchant;", "f", "Lcom/mastercard/sonic/model/SonicMerchant;", "getSonicMerchant", "()Lcom/mastercard/sonic/model/SonicMerchant;", "setSonicMerchant", "(Lcom/mastercard/sonic/model/SonicMerchant;)V", "sonicMerchant", "Landroid/content/Context;", "context", "cueName", "cueVersion", "Lcom/mastercard/sonic/controller/SonicEnvironment;", "sonicEnvironment", "<init>", "(Landroid/content/Context;Lcom/mastercard/sonic/model/SonicMerchant;Ljava/lang/String;Ljava/lang/String;Lcom/mastercard/sonic/controller/SonicEnvironment;)V", "Companion", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class MixPanelAnalyticsManager implements EventListener<ThreadStatus> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f51026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f51027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f51028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SonicEnvironment f51029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MixPanel f51030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public SonicMerchant sonicMerchant;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final SharedPreferenceUtils f51032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final CalendarPart f51033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f51034i;

    /* JADX INFO: compiled from: MixPanelAnalyticsManager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SonicType.values().length];
            try {
                iArr[SonicType.SOUND_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SonicType.ANIMATION_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SonicEnvironment.values().length];
            try {
                iArr2[SonicEnvironment.PRODUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: compiled from: MixPanelAnalyticsManager.kt */
    public static final class a extends Lambda implements Function1<String, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) throws InterruptedException {
            String str2 = str;
            if (str2 != null) {
                MixPanelAnalyticsManager.access$syncFileToMixPanelAnalytics(MixPanelAnalyticsManager.this, str2);
            }
            return Unit.INSTANCE;
        }
    }

    public MixPanelAnalyticsManager(@NotNull Context context, @NotNull SonicMerchant sonicMerchant, @NotNull String cueName, @Nullable String str, @NotNull SonicEnvironment sonicEnvironment) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sonicMerchant, "sonicMerchant");
        Intrinsics.checkNotNullParameter(cueName, "cueName");
        Intrinsics.checkNotNullParameter(sonicEnvironment, "sonicEnvironment");
        this.f51026a = context;
        this.f51027b = cueName;
        this.f51028c = str;
        this.f51029d = sonicEnvironment;
        this.sonicMerchant = sonicMerchant;
        SharedPreferenceUtils sharedPreferenceUtils = new SharedPreferenceUtils(context);
        this.f51032g = sharedPreferenceUtils;
        this.f51034i = Dispatchers.getDefault();
        CalendarPart calendarPartForValue = CalendarPart.INSTANCE.getCalendarPartForValue(sharedPreferenceUtils.getAnalyticsFrequency());
        this.f51033h = calendarPartForValue;
        if (MixPanelFileHandling.INSTANCE.getInstance(context).isSyncToAnalyticsRequired(calendarPartForValue, sonicMerchant, this.f51027b, this.f51028c)) {
            e();
        }
    }

    public static final void access$syncFileToMixPanelAnalytics(MixPanelAnalyticsManager mixPanelAnalyticsManager, String str) throws InterruptedException {
        mixPanelAnalyticsManager.getClass();
        BuildersKt__BuildersKt.runBlocking$default(null, new com.mastercard.sonic.analytics.mixpanel.a(mixPanelAnalyticsManager, str, null), 1, null);
    }

    public final void a() {
        MixPanelFileHandling.Companion companion = MixPanelFileHandling.INSTANCE;
        Context context = this.f51026a;
        if (companion.getInstance(context).isSyncToAnalyticsRequired(this.f51033h, this.sonicMerchant, this.f51027b, this.f51028c)) {
            c();
            return;
        }
        MixPanel mixPanel = companion.getInstance(context).getMixPanelMap().get(companion.getInstance(context).getUniqueMixPanelMapKey(this.sonicMerchant.getMerchantId(), this.sonicMerchant.getCountryCode(), this.sonicMerchant.getCity(), this.f51027b));
        if (mixPanel != null) {
            this.f51030e = mixPanel;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    public final boolean b() {
        boolean z10;
        MixPanel mixPanel = this.f51030e;
        if (mixPanel != null) {
            MixPanel mixPanel2 = null;
            if (mixPanel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mixPanel");
                mixPanel = null;
            }
            if (Intrinsics.areEqual(mixPanel.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().getCueName(), this.f51027b)) {
                MixPanel mixPanel3 = this.f51030e;
                if (mixPanel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mixPanel");
                    mixPanel3 = null;
                }
                if (Intrinsics.areEqual(mixPanel3.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().getCueVersion(), this.f51028c)) {
                    MixPanel mixPanel4 = this.f51030e;
                    if (mixPanel4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mixPanel");
                    } else {
                        mixPanel2 = mixPanel4;
                    }
                    if (Intrinsics.areEqual(mixPanel2.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().getMerchantId(), this.sonicMerchant.getMerchantId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        MixPanelFileHandling.Companion companion = MixPanelFileHandling.INSTANCE;
        Context context = this.f51026a;
        return !(z10 || companion.getInstance(context).getMixPanelMap().containsKey(companion.getInstance(context).getUniqueMixPanelMapKey(this.sonicMerchant.getMerchantId(), this.sonicMerchant.getCountryCode(), this.sonicMerchant.getCity(), this.f51027b))) || companion.getInstance(context).getIsMixPanelAnalyticsSyncInProgress();
    }

    public final void c() {
        Utils.Companion companion = Utils.INSTANCE;
        long currentTimestampInUtc = companion.getCurrentTimestampInUtc();
        String timeInFormattedString = companion.getTimeInFormattedString(currentTimestampInUtc);
        Properties.Builder builderSdkVersion = new Properties.Builder().token(WhenMappings.$EnumSwitchMapping$1[this.f51029d.ordinal()] == 1 ? BuildConfig.MIX_PANEL_TOKEN_PRODUCTION : BuildConfig.MIX_PANEL_TOKEN_SANDBOX).time(currentTimestampInUtc).distinctId(this.f51032g.getDistinctId()).insertId("").startTime(timeInFormattedString).endTime(timeInFormattedString).sdkVersion(BuildConfig.VERSION_NAME);
        String packageName = this.f51026a.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        Properties.Builder builderCueName = builderSdkVersion.applicationId(packageName).merchantName(this.sonicMerchant.getMerchantName()).merchantId(this.sonicMerchant.getMerchantId()).merchantCategoryCode(this.sonicMerchant.getMerchantCategoryCodes()).country(this.sonicMerchant.getCountryCode()).city(this.sonicMerchant.getCity()).cueName(this.f51027b);
        String str = this.f51028c;
        Intrinsics.checkNotNull(str);
        this.f51030e = new MixPanel(builderCueName.cueVersion(str).build());
    }

    public final void d() {
        MixPanelFileHandling.Companion companion = MixPanelFileHandling.INSTANCE;
        Context context = this.f51026a;
        if (companion.getInstance(context).getMixPanelEventManager().totalListenersForEventType(SonicInternalConstants.MIX_PANEL_FILE_HANDLING) > 0) {
            f();
        }
        companion.getInstance(context).getMixPanelEventManager().subscribe(SonicInternalConstants.MIX_PANEL_FILE_HANDLING, this);
    }

    public final void e() {
        Context context = this.f51026a;
        if (new SharedPreferenceUtils(context).isAnalyticsEnabled()) {
            MixPanelFileHandling.INSTANCE.getInstance(context).prepareSyncFileToMixPanelAnalytics(new a());
        }
    }

    public final void f() {
        MixPanelFileHandling.Companion companion = MixPanelFileHandling.INSTANCE;
        Context context = this.f51026a;
        if (companion.getInstance(context).getMixPanelEventManager().totalListenersForEventType(SonicInternalConstants.MIX_PANEL_FILE_HANDLING) > 0) {
            companion.getInstance(context).getMixPanelEventManager().unsubscribe(SonicInternalConstants.MIX_PANEL_FILE_HANDLING, this);
        }
    }

    @NotNull
    public final SonicMerchant getSonicMerchant() {
        return this.sonicMerchant;
    }

    public final void setSonicMerchant(@NotNull SonicMerchant sonicMerchant) {
        Intrinsics.checkNotNullParameter(sonicMerchant, "<set-?>");
        this.sonicMerchant = sonicMerchant;
    }

    public final void trackEvent(@NotNull TrackEvent trackEvent) {
        Intrinsics.checkNotNullParameter(trackEvent, "trackEvent");
        this.f51028c = trackEvent.getCueVersion();
        this.f51027b = trackEvent.getCueName();
        MixPanelFileHandling.Companion companion = MixPanelFileHandling.INSTANCE;
        Context context = this.f51026a;
        boolean zIsSyncToAnalyticsRequired = companion.getInstance(context).isSyncToAnalyticsRequired(this.f51033h, this.sonicMerchant, this.f51027b, this.f51028c);
        if (b() || zIsSyncToAnalyticsRequired) {
            c();
        } else {
            a();
        }
        MixPanel mixPanel = this.f51030e;
        MixPanel mixPanel2 = null;
        if (mixPanel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mixPanel");
            mixPanel = null;
        }
        mixPanel.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().setCueVersion(trackEvent.getCueVersion());
        Utils.Companion companion2 = Utils.INSTANCE;
        String timeInFormattedString = companion2.getTimeInFormattedString(companion2.getCurrentTimestampInUtc());
        MixPanel mixPanel3 = this.f51030e;
        if (mixPanel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mixPanel");
            mixPanel3 = null;
        }
        mixPanel3.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().setEndTime(timeInFormattedString);
        MixPanel mixPanel4 = this.f51030e;
        if (mixPanel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mixPanel");
            mixPanel4 = null;
        }
        mixPanel4.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().setHapticsEnabled(trackEvent.getHapticsAnalytics().isEnabled());
        MixPanel mixPanel5 = this.f51030e;
        if (mixPanel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mixPanel");
            mixPanel5 = null;
        }
        mixPanel5.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().setHapticsSupported(trackEvent.getHapticsAnalytics().isSupported());
        if (trackEvent.getVolumeLevel() <= 0 && (trackEvent.getSonicType() == SonicType.SOUND_AND_ANIMATION || trackEvent.getSonicType() == SonicType.SOUND_ONLY)) {
            MixPanel mixPanel6 = this.f51030e;
            if (mixPanel6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mixPanel");
                mixPanel6 = null;
            }
            Properties properties = mixPanel6.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String();
            properties.setMutedPlay(properties.getMutedPlay() + 1);
            properties.getMutedPlay();
        }
        MixPanel mixPanel7 = this.f51030e;
        if (mixPanel7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mixPanel");
            mixPanel7 = null;
        }
        Properties properties2 = mixPanel7.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String();
        properties2.setTotal(properties2.getTotal() + 1);
        properties2.getTotal();
        if (800 == trackEvent.getStatusCode()) {
            MixPanel mixPanel8 = this.f51030e;
            if (mixPanel8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mixPanel");
                mixPanel8 = null;
            }
            Properties properties3 = mixPanel8.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String();
            properties3.setSuccess(properties3.getSuccess() + 1);
            properties3.getSuccess();
            int i10 = WhenMappings.$EnumSwitchMapping$0[trackEvent.getSonicType().ordinal()];
            if (i10 == 1) {
                MixPanel mixPanel9 = this.f51030e;
                if (mixPanel9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mixPanel");
                    mixPanel9 = null;
                }
                Properties properties4 = mixPanel9.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String();
                properties4.setSoundOnly(properties4.getSoundOnly() + 1);
                properties4.getSoundOnly();
            } else if (i10 != 2) {
                MixPanel mixPanel10 = this.f51030e;
                if (mixPanel10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mixPanel");
                    mixPanel10 = null;
                }
                Properties properties5 = mixPanel10.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String();
                properties5.setAnimationAndSound(properties5.getAnimationAndSound() + 1);
                properties5.getAnimationAndSound();
            } else {
                MixPanel mixPanel11 = this.f51030e;
                if (mixPanel11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mixPanel");
                    mixPanel11 = null;
                }
                Properties properties6 = mixPanel11.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String();
                properties6.setAnimationOnly(properties6.getAnimationOnly() + 1);
                properties6.getAnimationOnly();
            }
        } else {
            MixPanel mixPanel12 = this.f51030e;
            if (mixPanel12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mixPanel");
                mixPanel12 = null;
            }
            Properties properties7 = mixPanel12.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String();
            properties7.setFailure(properties7.getFailure() + 1);
            properties7.getFailure();
            if (904 == trackEvent.getStatusCode() || 908 == trackEvent.getStatusCode()) {
                MixPanel mixPanel13 = this.f51030e;
                if (mixPanel13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mixPanel");
                    mixPanel13 = null;
                }
                Properties properties8 = mixPanel13.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String();
                properties8.setUnknownFailure(properties8.getUnknownFailure() + 1);
                properties8.getUnknownFailure();
            } else if (906 == trackEvent.getStatusCode() || (905 == trackEvent.getStatusCode() && SonicType.SOUND_ONLY == trackEvent.getSonicType())) {
                MixPanel mixPanel14 = this.f51030e;
                if (mixPanel14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mixPanel");
                    mixPanel14 = null;
                }
                Properties properties9 = mixPanel14.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String();
                properties9.setSoundFailure(properties9.getSoundFailure() + 1);
                properties9.getSoundFailure();
            } else if (907 == trackEvent.getStatusCode() || (905 == trackEvent.getStatusCode() && SonicType.ANIMATION_ONLY == trackEvent.getSonicType())) {
                MixPanel mixPanel15 = this.f51030e;
                if (mixPanel15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mixPanel");
                    mixPanel15 = null;
                }
                Properties properties10 = mixPanel15.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String();
                properties10.setAnimationFailure(properties10.getAnimationFailure() + 1);
                properties10.getAnimationFailure();
            } else {
                MixPanel mixPanel16 = this.f51030e;
                if (mixPanel16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mixPanel");
                    mixPanel16 = null;
                }
                Properties properties11 = mixPanel16.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String();
                properties11.setAnimationAndSoundFailure(properties11.getAnimationAndSoundFailure() + 1);
                properties11.getAnimationAndSoundFailure();
            }
        }
        if (800 == trackEvent.getHapticsAnalytics().getHapticsStatus() && trackEvent.getHapticsAnalytics().isEnabled() && trackEvent.getHapticsAnalytics().isSupported()) {
            MixPanel mixPanel17 = this.f51030e;
            if (mixPanel17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mixPanel");
                mixPanel17 = null;
            }
            Properties properties12 = mixPanel17.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String();
            properties12.setHapticsPlay(properties12.getHapticsPlay() + 1);
            properties12.getHapticsPlay();
        }
        d();
        if (zIsSyncToAnalyticsRequired) {
            e();
        }
        MixPanelFileHandling singletonHolder = companion.getInstance(context);
        MixPanel mixPanel18 = this.f51030e;
        if (mixPanel18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mixPanel");
        } else {
            mixPanel2 = mixPanel18;
        }
        singletonHolder.addMixPanelDataToFile(mixPanel2);
    }

    @Override // com.mastercard.sonic.observers.EventListener
    public void update(@NotNull String eventType, @NotNull ThreadStatus event) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != ThreadStatus.INITIALIZED) {
            if (event == ThreadStatus.READY_FOR_SYNC) {
                f();
                return;
            }
            return;
        }
        f();
        boolean zB = b();
        Context context = this.f51026a;
        if (zB) {
            c();
            d();
            MixPanelFileHandling singletonHolder = MixPanelFileHandling.INSTANCE.getInstance(context);
            MixPanel mixPanel = this.f51030e;
            if (mixPanel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mixPanel");
                mixPanel = null;
            }
            singletonHolder.addMixPanelDataToFile(mixPanel);
        } else {
            a();
        }
        if (MixPanelFileHandling.INSTANCE.getInstance(context).isSyncToAnalyticsRequired(this.f51033h, this.sonicMerchant, this.f51027b, this.f51028c)) {
            e();
        }
    }
}
