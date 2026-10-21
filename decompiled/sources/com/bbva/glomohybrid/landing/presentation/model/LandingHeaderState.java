package com.bbva.glomohybrid.landing.presentation.model;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.UUIDPreferences;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomohybrid.base.models.UserAvatarModel;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingShortcutItemModel;
import com.bbva.glomohybrid.landing.domain.model.LandingAppAccess;
import com.bbva.glomohybrid.landing.domain.model.LandingBackground;
import com.bbva.glomohybrid.landing.domain.model.LandingHeaderFeatureFlagsModel;
import com.bbva.glomohybrid.landing.domain.model.LandingHeaderMessageModel;
import com.bbva.glomohybrid.landing.domain.model.LandingUserSegment;
import com.bbva.slidemenuview.domain.model.UserMenu;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingHeaderState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0002bcB\u0081\u0001\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b`\u0010aJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0085\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0017HÆ\u0001J\t\u0010%\u001a\u00020$HÖ\u0001J\t\u0010'\u001a\u00020&HÖ\u0001J\u0013\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001f\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010 \u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010!\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0013\u0010T\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0013\u0010V\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\bU\u0010SR\u0013\u0010X\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\bW\u0010SR\u0011\u0010\\\u001a\u00020Y8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0011\u0010_\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b]\u0010^¨\u0006d"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState;", "", "", "isNotEmpty", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$Type;", "component1", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", "component2", "Lcom/bbva/glomohybrid/landing/domain/model/LandingUserSegment;", "component3", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$AccessType;", "component4", "Lcom/bbva/glomohybrid/base/models/UserAvatarModel;", "component5", "", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingShortcutItemModel;", "component6", "Lcom/bbva/glomohybrid/landing/domain/model/LandingBackground;", "component7", "Lcom/bbva/glomohybrid/landing/domain/model/LandingHeaderMessageModel;", "component8", "Lcom/bbva/slidemenuview/domain/model/UserMenu;", "component9", "Lcom/bbva/glomohybrid/landing/domain/model/LandingHeaderFeatureFlagsModel;", "component10", "type", "user", "segment", "accessType", "avatar", "shortcuts", "background", "message", "menu", "features", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$Type;", "getType", "()Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$Type;", "b", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", "getUser", "()Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", "c", "Lcom/bbva/glomohybrid/landing/domain/model/LandingUserSegment;", "getSegment", "()Lcom/bbva/glomohybrid/landing/domain/model/LandingUserSegment;", "d", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$AccessType;", "getAccessType", "()Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$AccessType;", "e", "Lcom/bbva/glomohybrid/base/models/UserAvatarModel;", "getAvatar", "()Lcom/bbva/glomohybrid/base/models/UserAvatarModel;", "f", "Ljava/util/List;", "getShortcuts", "()Ljava/util/List;", "g", "Lcom/bbva/glomohybrid/landing/domain/model/LandingBackground;", "getBackground", "()Lcom/bbva/glomohybrid/landing/domain/model/LandingBackground;", "h", "Lcom/bbva/glomohybrid/landing/domain/model/LandingHeaderMessageModel;", "getMessage", "()Lcom/bbva/glomohybrid/landing/domain/model/LandingHeaderMessageModel;", "i", "Lcom/bbva/slidemenuview/domain/model/UserMenu;", "getMenu", "()Lcom/bbva/slidemenuview/domain/model/UserMenu;", "j", "Lcom/bbva/glomohybrid/landing/domain/model/LandingHeaderFeatureFlagsModel;", "getFeatures", "()Lcom/bbva/glomohybrid/landing/domain/model/LandingHeaderFeatureFlagsModel;", "getUserName", "()Ljava/lang/String;", "userName", "getUserSecondName", "userSecondName", "getUserFullName", "userFullName", "Lcom/bbva/glomo/user/domain/model/UserType;", "getUserType", "()Lcom/bbva/glomo/user/domain/model/UserType;", "userType", "getHasSeveralProfiles", "()Z", "hasSeveralProfiles", "<init>", "(Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$Type;Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;Lcom/bbva/glomohybrid/landing/domain/model/LandingUserSegment;Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$AccessType;Lcom/bbva/glomohybrid/base/models/UserAvatarModel;Ljava/util/List;Lcom/bbva/glomohybrid/landing/domain/model/LandingBackground;Lcom/bbva/glomohybrid/landing/domain/model/LandingHeaderMessageModel;Lcom/bbva/slidemenuview/domain/model/UserMenu;Lcom/bbva/glomohybrid/landing/domain/model/LandingHeaderFeatureFlagsModel;)V", "AccessType", UUIDPreferences.TYPE_KEY, "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LandingHeaderState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Type type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final UserProfileConfiguration user;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final LandingUserSegment segment;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final AccessType accessType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final UserAvatarModel avatar;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<LandingShortcutItemModel> shortcuts;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final LandingBackground background;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final LandingHeaderMessageModel message;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final UserMenu menu;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final LandingHeaderFeatureFlagsModel features;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: LandingHeaderState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$AccessType;", "", "Companion", "DEFAULT", "BIOMETRIC", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final class AccessType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AccessType[] $VALUES;
        public static final AccessType BIOMETRIC;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final AccessType DEFAULT;

        /* JADX INFO: compiled from: LandingHeaderState.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$AccessType$Companion;", "", "()V", "fromBiometricAvailability", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$AccessType;", "isBiometricAvailable", "", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nLandingHeaderState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingHeaderState.kt\ncom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$AccessType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final AccessType fromBiometricAvailability(boolean isBiometricAvailable) {
                AccessType accessType = AccessType.BIOMETRIC;
                if (!isBiometricAvailable) {
                    accessType = null;
                }
                return accessType == null ? AccessType.DEFAULT : accessType;
            }
        }

        static {
            AccessType accessType = new AccessType("DEFAULT", 0);
            DEFAULT = accessType;
            AccessType accessType2 = new AccessType("BIOMETRIC", 1);
            BIOMETRIC = accessType2;
            AccessType[] accessTypeArr = {accessType, accessType2};
            $VALUES = accessTypeArr;
            $ENTRIES = EnumEntriesKt.enumEntries(accessTypeArr);
            INSTANCE = new Companion(null);
        }

        public AccessType() {
            throw null;
        }

        @NotNull
        public static EnumEntries<AccessType> getEntries() {
            return $ENTRIES;
        }

        public static AccessType valueOf(String str) {
            return (AccessType) Enum.valueOf(AccessType.class, str);
        }

        public static AccessType[] values() {
            return (AccessType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: LandingHeaderState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0004\u000b\f\n\rB\t\b\u0004¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$Type;", "", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "<init>", "()V", "Companion", "Blocked", "BlockedForUpdate", "Enabled", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$Type$Blocked;", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$Type$BlockedForUpdate;", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$Type$Enabled;", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static abstract class Type {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String id;

        /* JADX INFO: compiled from: LandingHeaderState.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$Type$Blocked;", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$Type;", "", "b", "Ljava/lang/String;", "getID", "()Ljava/lang/String;", "ID", "<init>", "()V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final class Blocked extends Type {

            @NotNull
            public static final Blocked INSTANCE = new Blocked();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public static final String ID = Reflection.getOrCreateKotlinClass(Blocked.class).getSimpleName();

            public Blocked() {
                super(null);
            }

            @Nullable
            public final String getID() {
                return ID;
            }
        }

        /* JADX INFO: compiled from: LandingHeaderState.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$Type$BlockedForUpdate;", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$Type;", "", "component1", "packageId", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "b", "Ljava/lang/String;", "getPackageId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Companion", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class BlockedForUpdate extends Type {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public static final String f33068c = Reflection.getOrCreateKotlinClass(BlockedForUpdate.class).getSimpleName();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String packageId;

            /* JADX INFO: compiled from: LandingHeaderState.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$Type$BlockedForUpdate$Companion;", "", "()V", "ID", "", "getID", "()Ljava/lang/String;", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @Nullable
                public final String getID() {
                    return BlockedForUpdate.f33068c;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BlockedForUpdate(@NotNull String packageId) {
                super(null);
                Intrinsics.checkNotNullParameter(packageId, "packageId");
                this.packageId = packageId;
            }

            public static /* synthetic */ BlockedForUpdate copy$default(BlockedForUpdate blockedForUpdate, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = blockedForUpdate.packageId;
                }
                return blockedForUpdate.copy(str);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getPackageId() {
                return this.packageId;
            }

            @NotNull
            public final BlockedForUpdate copy(@NotNull String packageId) {
                Intrinsics.checkNotNullParameter(packageId, "packageId");
                return new BlockedForUpdate(packageId);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BlockedForUpdate) && Intrinsics.areEqual(this.packageId, ((BlockedForUpdate) other).packageId);
            }

            @NotNull
            public final String getPackageId() {
                return this.packageId;
            }

            public int hashCode() {
                return this.packageId.hashCode();
            }

            @NotNull
            public String toString() {
                return d.f(new StringBuilder("BlockedForUpdate(packageId="), this.packageId, ")");
            }
        }

        /* JADX INFO: compiled from: LandingHeaderState.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$Type$Companion;", "", "()V", "from", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$Type;", "appAccess", "Lcom/bbva/glomohybrid/landing/domain/model/LandingAppAccess;", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Type from(@NotNull LandingAppAccess appAccess) {
                Intrinsics.checkNotNullParameter(appAccess, "appAccess");
                if (Intrinsics.areEqual(appAccess, LandingAppAccess.Available.INSTANCE)) {
                    return Enabled.INSTANCE;
                }
                if (appAccess instanceof LandingAppAccess.NotAvailable) {
                    return Blocked.INSTANCE;
                }
                if (appAccess instanceof LandingAppAccess.NotAvailableForUpdate) {
                    return new BlockedForUpdate(((LandingAppAccess.NotAvailableForUpdate) appAccess).getPackageId());
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        /* JADX INFO: compiled from: LandingHeaderState.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$Type$Enabled;", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState$Type;", "", "b", "Ljava/lang/String;", "getID", "()Ljava/lang/String;", "ID", "<init>", "()V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final class Enabled extends Type {

            @NotNull
            public static final Enabled INSTANCE = new Enabled();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public static final String ID = Reflection.getOrCreateKotlinClass(Enabled.class).getSimpleName();

            public Enabled() {
                super(null);
            }

            @Nullable
            public final String getID() {
                return ID;
            }
        }

        public /* synthetic */ Type(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        public Type() {
            this.id = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        }
    }

    public LandingHeaderState(@NotNull Type type, @Nullable UserProfileConfiguration userProfileConfiguration, @Nullable LandingUserSegment landingUserSegment, @Nullable AccessType accessType, @Nullable UserAvatarModel userAvatarModel, @Nullable List<LandingShortcutItemModel> list, @Nullable LandingBackground landingBackground, @Nullable LandingHeaderMessageModel landingHeaderMessageModel, @Nullable UserMenu userMenu, @Nullable LandingHeaderFeatureFlagsModel landingHeaderFeatureFlagsModel) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.user = userProfileConfiguration;
        this.segment = landingUserSegment;
        this.accessType = accessType;
        this.avatar = userAvatarModel;
        this.shortcuts = list;
        this.background = landingBackground;
        this.message = landingHeaderMessageModel;
        this.menu = userMenu;
        this.features = landingHeaderFeatureFlagsModel;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final LandingHeaderFeatureFlagsModel getFeatures() {
        return this.features;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UserProfileConfiguration getUser() {
        return this.user;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LandingUserSegment getSegment() {
        return this.segment;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AccessType getAccessType() {
        return this.accessType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final UserAvatarModel getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final List<LandingShortcutItemModel> component6() {
        return this.shortcuts;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final LandingBackground getBackground() {
        return this.background;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final LandingHeaderMessageModel getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final UserMenu getMenu() {
        return this.menu;
    }

    @NotNull
    public final LandingHeaderState copy(@NotNull Type type, @Nullable UserProfileConfiguration user, @Nullable LandingUserSegment segment, @Nullable AccessType accessType, @Nullable UserAvatarModel avatar, @Nullable List<LandingShortcutItemModel> shortcuts, @Nullable LandingBackground background, @Nullable LandingHeaderMessageModel message, @Nullable UserMenu menu, @Nullable LandingHeaderFeatureFlagsModel features) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new LandingHeaderState(type, user, segment, accessType, avatar, shortcuts, background, message, menu, features);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingHeaderState)) {
            return false;
        }
        LandingHeaderState landingHeaderState = (LandingHeaderState) other;
        return Intrinsics.areEqual(this.type, landingHeaderState.type) && Intrinsics.areEqual(this.user, landingHeaderState.user) && Intrinsics.areEqual(this.segment, landingHeaderState.segment) && this.accessType == landingHeaderState.accessType && Intrinsics.areEqual(this.avatar, landingHeaderState.avatar) && Intrinsics.areEqual(this.shortcuts, landingHeaderState.shortcuts) && Intrinsics.areEqual(this.background, landingHeaderState.background) && Intrinsics.areEqual(this.message, landingHeaderState.message) && Intrinsics.areEqual(this.menu, landingHeaderState.menu) && Intrinsics.areEqual(this.features, landingHeaderState.features);
    }

    @Nullable
    public final AccessType getAccessType() {
        return this.accessType;
    }

    @Nullable
    public final UserAvatarModel getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final LandingBackground getBackground() {
        return this.background;
    }

    @Nullable
    public final LandingHeaderFeatureFlagsModel getFeatures() {
        return this.features;
    }

    public final boolean getHasSeveralProfiles() {
        UserProfileConfiguration userProfileConfiguration = this.user;
        if (userProfileConfiguration != null) {
            return userProfileConfiguration.isEnterpriseProfileAvailable();
        }
        return false;
    }

    @Nullable
    public final UserMenu getMenu() {
        return this.menu;
    }

    @Nullable
    public final LandingHeaderMessageModel getMessage() {
        return this.message;
    }

    @Nullable
    public final LandingUserSegment getSegment() {
        return this.segment;
    }

    @Nullable
    public final List<LandingShortcutItemModel> getShortcuts() {
        return this.shortcuts;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    @Nullable
    public final UserProfileConfiguration getUser() {
        return this.user;
    }

    @Nullable
    public final String getUserFullName() {
        UserProfileConfiguration userProfileConfiguration = this.user;
        if (userProfileConfiguration != null) {
            return userProfileConfiguration.getFullName();
        }
        return null;
    }

    @Nullable
    public final String getUserName() {
        UserProfileConfiguration userProfileConfiguration = this.user;
        if (userProfileConfiguration != null) {
            return userProfileConfiguration.getName();
        }
        return null;
    }

    @Nullable
    public final String getUserSecondName() {
        UserProfileConfiguration userProfileConfiguration = this.user;
        if (userProfileConfiguration != null) {
            return userProfileConfiguration.getSecondName();
        }
        return null;
    }

    @NotNull
    public final UserType getUserType() {
        UserType type;
        UserProfileConfiguration userProfileConfiguration = this.user;
        return (userProfileConfiguration == null || (type = userProfileConfiguration.getType()) == null) ? UserType.PERSONAL : type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        UserProfileConfiguration userProfileConfiguration = this.user;
        int iHashCode2 = (iHashCode + (userProfileConfiguration == null ? 0 : userProfileConfiguration.hashCode())) * 31;
        LandingUserSegment landingUserSegment = this.segment;
        int iHashCode3 = (iHashCode2 + (landingUserSegment == null ? 0 : landingUserSegment.hashCode())) * 31;
        AccessType accessType = this.accessType;
        int iHashCode4 = (iHashCode3 + (accessType == null ? 0 : accessType.hashCode())) * 31;
        UserAvatarModel userAvatarModel = this.avatar;
        int iHashCode5 = (iHashCode4 + (userAvatarModel == null ? 0 : userAvatarModel.hashCode())) * 31;
        List<LandingShortcutItemModel> list = this.shortcuts;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        LandingBackground landingBackground = this.background;
        int iHashCode7 = (iHashCode6 + (landingBackground == null ? 0 : landingBackground.hashCode())) * 31;
        LandingHeaderMessageModel landingHeaderMessageModel = this.message;
        int iHashCode8 = (iHashCode7 + (landingHeaderMessageModel == null ? 0 : landingHeaderMessageModel.hashCode())) * 31;
        UserMenu userMenu = this.menu;
        int iHashCode9 = (iHashCode8 + (userMenu == null ? 0 : userMenu.hashCode())) * 31;
        LandingHeaderFeatureFlagsModel landingHeaderFeatureFlagsModel = this.features;
        return iHashCode9 + (landingHeaderFeatureFlagsModel != null ? landingHeaderFeatureFlagsModel.hashCode() : 0);
    }

    public final boolean isNotEmpty() {
        return (this.user == null || this.shortcuts == null) ? false : true;
    }

    @NotNull
    public String toString() {
        return "LandingHeaderState(type=" + this.type + ", user=" + this.user + ", segment=" + this.segment + ", accessType=" + this.accessType + ", avatar=" + this.avatar + ", shortcuts=" + this.shortcuts + ", background=" + this.background + ", message=" + this.message + ", menu=" + this.menu + ", features=" + this.features + ")";
    }

    public /* synthetic */ LandingHeaderState(Type type, UserProfileConfiguration userProfileConfiguration, LandingUserSegment landingUserSegment, AccessType accessType, UserAvatarModel userAvatarModel, List list, LandingBackground landingBackground, LandingHeaderMessageModel landingHeaderMessageModel, UserMenu userMenu, LandingHeaderFeatureFlagsModel landingHeaderFeatureFlagsModel, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, (i10 & 2) != 0 ? null : userProfileConfiguration, (i10 & 4) != 0 ? null : landingUserSegment, (i10 & 8) != 0 ? null : accessType, (i10 & 16) != 0 ? null : userAvatarModel, (i10 & 32) != 0 ? null : list, (i10 & 64) != 0 ? null : landingBackground, (i10 & 128) != 0 ? null : landingHeaderMessageModel, (i10 & 256) != 0 ? null : userMenu, (i10 & 512) == 0 ? landingHeaderFeatureFlagsModel : null);
    }
}
