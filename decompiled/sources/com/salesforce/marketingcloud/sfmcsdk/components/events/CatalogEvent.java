package com.salesforce.marketingcloud.sfmcsdk.components.events;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CatalogEvent.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/events/CatalogEvent;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/EngagementEvent;", "name", "", "catalogObject", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/CatalogObject;", "(Ljava/lang/String;Lcom/salesforce/marketingcloud/sfmcsdk/components/events/CatalogObject;)V", "getCatalogObject", "()Lcom/salesforce/marketingcloud/sfmcsdk/components/events/CatalogObject;", "Companion", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/ViewCatalogEvent;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/ViewCatalogDetailEvent;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/QuickViewCatalogEvent;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/ShareCatalogEvent;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/ReviewCatalogEvent;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/CommentCatalogEvent;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/FavoriteCatalogEvent;", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class CatalogEvent extends EngagementEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final CatalogObject catalogObject;

    /* JADX INFO: compiled from: CatalogEvent.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0013"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/events/CatalogEvent$Companion;", "", "()V", "comment", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/CommentCatalogEvent;", "catalogObject", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/CatalogObject;", "favorite", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/FavoriteCatalogEvent;", "quickView", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/QuickViewCatalogEvent;", "review", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/ReviewCatalogEvent;", "share", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/ShareCatalogEvent;", "view", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/ViewCatalogEvent;", "viewDetail", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/ViewCatalogDetailEvent;", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final CommentCatalogEvent comment(@NotNull CatalogObject catalogObject) {
            Intrinsics.checkNotNullParameter(catalogObject, "catalogObject");
            try {
                return new CommentCatalogEvent(catalogObject);
            } catch (Exception unused) {
                return null;
            }
        }

        @JvmStatic
        @Nullable
        public final FavoriteCatalogEvent favorite(@NotNull CatalogObject catalogObject) {
            Intrinsics.checkNotNullParameter(catalogObject, "catalogObject");
            try {
                return new FavoriteCatalogEvent(catalogObject);
            } catch (Exception unused) {
                return null;
            }
        }

        @JvmStatic
        @Nullable
        public final QuickViewCatalogEvent quickView(@NotNull CatalogObject catalogObject) {
            Intrinsics.checkNotNullParameter(catalogObject, "catalogObject");
            try {
                return new QuickViewCatalogEvent(catalogObject);
            } catch (Exception unused) {
                return null;
            }
        }

        @JvmStatic
        @Nullable
        public final ReviewCatalogEvent review(@NotNull CatalogObject catalogObject) {
            Intrinsics.checkNotNullParameter(catalogObject, "catalogObject");
            try {
                return new ReviewCatalogEvent(catalogObject);
            } catch (Exception unused) {
                return null;
            }
        }

        @JvmStatic
        @Nullable
        public final ShareCatalogEvent share(@NotNull CatalogObject catalogObject) {
            Intrinsics.checkNotNullParameter(catalogObject, "catalogObject");
            try {
                return new ShareCatalogEvent(catalogObject);
            } catch (Exception unused) {
                return null;
            }
        }

        @JvmStatic
        @Nullable
        public final ViewCatalogEvent view(@NotNull CatalogObject catalogObject) {
            Intrinsics.checkNotNullParameter(catalogObject, "catalogObject");
            try {
                return new ViewCatalogEvent(catalogObject);
            } catch (Exception unused) {
                return null;
            }
        }

        @JvmStatic
        @Nullable
        public final ViewCatalogDetailEvent viewDetail(@NotNull CatalogObject catalogObject) {
            Intrinsics.checkNotNullParameter(catalogObject, "catalogObject");
            try {
                return new ViewCatalogDetailEvent(catalogObject);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public /* synthetic */ CatalogEvent(String str, CatalogObject catalogObject, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, catalogObject);
    }

    @JvmStatic
    @Nullable
    public static final CommentCatalogEvent comment(@NotNull CatalogObject catalogObject) {
        return INSTANCE.comment(catalogObject);
    }

    @JvmStatic
    @Nullable
    public static final FavoriteCatalogEvent favorite(@NotNull CatalogObject catalogObject) {
        return INSTANCE.favorite(catalogObject);
    }

    @JvmStatic
    @Nullable
    public static final QuickViewCatalogEvent quickView(@NotNull CatalogObject catalogObject) {
        return INSTANCE.quickView(catalogObject);
    }

    @JvmStatic
    @Nullable
    public static final ReviewCatalogEvent review(@NotNull CatalogObject catalogObject) {
        return INSTANCE.review(catalogObject);
    }

    @JvmStatic
    @Nullable
    public static final ShareCatalogEvent share(@NotNull CatalogObject catalogObject) {
        return INSTANCE.share(catalogObject);
    }

    @JvmStatic
    @Nullable
    public static final ViewCatalogEvent view(@NotNull CatalogObject catalogObject) {
        return INSTANCE.view(catalogObject);
    }

    @JvmStatic
    @Nullable
    public static final ViewCatalogDetailEvent viewDetail(@NotNull CatalogObject catalogObject) {
        return INSTANCE.viewDetail(catalogObject);
    }

    @NotNull
    public final CatalogObject getCatalogObject() {
        return this.catalogObject;
    }

    private CatalogEvent(String str, CatalogObject catalogObject) {
        super(str, null);
        this.catalogObject = catalogObject;
    }
}
