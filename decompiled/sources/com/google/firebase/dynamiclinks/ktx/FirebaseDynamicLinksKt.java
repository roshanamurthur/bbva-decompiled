package com.google.firebase.dynamiclinks.ktx;

import android.net.Uri;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;
import com.google.firebase.dynamiclinks.ShortDynamicLink;
import com.google.firebase.ktx.Firebase;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FirebaseDynamicLinks.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0007\u001a\u00020\b*\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\r\u001a+\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\r\u001a\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\u0011H\u0086\u0002\u001a\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\u0012H\u0086\u0002\u001a\r\u0010\u0013\u001a\u00020\u0014*\u00020\u0011H\u0086\u0002\u001a\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u00020\u0012H\u0086\u0002\u001a\r\u0010\u0015\u001a\u00020\u0016*\u00020\u0011H\u0086\u0002\u001a\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017*\u00020\u0012H\u0086\u0002\u001a#\u0010\u0019\u001a\u00020\u001a*\u00020\u00032\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\r\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001c\u001a#\u0010\u001d\u001a\u00020\b*\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\r\u001a;\u0010\u001d\u001a\u00020\b*\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\r\u001a+\u0010\"\u001a\u00020\b*\u00020\t2\u0006\u0010#\u001a\u00020\u00012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\r\u001a#\u0010%\u001a\u00020\b*\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\r\u001a#\u0010'\u001a\u00020\b*\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\r\u001a)\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120**\u00020\u00032\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\r\u001a1\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120**\u00020\u00032\u0006\u0010+\u001a\u00020\u00142\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\r\u001a#\u0010,\u001a\u00020\b*\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006."}, d2 = {"LIBRARY_NAME", "", "dynamicLinks", "Lcom/google/firebase/dynamiclinks/FirebaseDynamicLinks;", "Lcom/google/firebase/ktx/Firebase;", "getDynamicLinks", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/dynamiclinks/FirebaseDynamicLinks;", "androidParameters", "", "Lcom/google/firebase/dynamiclinks/DynamicLink$Builder;", "init", "Lkotlin/Function1;", "Lcom/google/firebase/dynamiclinks/DynamicLink$AndroidParameters$Builder;", "Lkotlin/ExtensionFunctionType;", "packageName", "component1", "Landroid/net/Uri;", "Lcom/google/firebase/dynamiclinks/PendingDynamicLinkData;", "Lcom/google/firebase/dynamiclinks/ShortDynamicLink;", "component2", "", "component3", "", "", "Lcom/google/firebase/dynamiclinks/ShortDynamicLink$Warning;", DynamicLink.Builder.KEY_DYNAMIC_LINK, "Lcom/google/firebase/dynamiclinks/DynamicLink;", "app", "Lcom/google/firebase/FirebaseApp;", "googleAnalyticsParameters", "Lcom/google/firebase/dynamiclinks/DynamicLink$GoogleAnalyticsParameters$Builder;", "source", "medium", "campaign", "iosParameters", "bundleId", "Lcom/google/firebase/dynamiclinks/DynamicLink$IosParameters$Builder;", "itunesConnectAnalyticsParameters", "Lcom/google/firebase/dynamiclinks/DynamicLink$ItunesConnectAnalyticsParameters$Builder;", "navigationInfoParameters", "Lcom/google/firebase/dynamiclinks/DynamicLink$NavigationInfoParameters$Builder;", "shortLinkAsync", "Lcom/google/android/gms/tasks/Task;", DynamicLink.Builder.KEY_SUFFIX, "socialMetaTagParameters", "Lcom/google/firebase/dynamiclinks/DynamicLink$SocialMetaTagParameters$Builder;", "com.google.firebase-firebase-dynamic-links-ktx"}, k = 2, mv = {1, 1, 16})
public final class FirebaseDynamicLinksKt {

    @NotNull
    public static final String LIBRARY_NAME = "fire-dl-ktx";

    public static final void androidParameters(@NotNull DynamicLink.Builder builder, @NotNull Function1<? super DynamicLink.AndroidParameters.Builder, Unit> function1) {
        DynamicLink.AndroidParameters.Builder builder2 = new DynamicLink.AndroidParameters.Builder();
        function1.invoke(builder2);
        builder.setAndroidParameters(builder2.build());
    }

    @Nullable
    public static final Uri component1(@NotNull ShortDynamicLink shortDynamicLink) {
        return shortDynamicLink.getShortLink();
    }

    @Nullable
    public static final Uri component2(@NotNull ShortDynamicLink shortDynamicLink) {
        return shortDynamicLink.getPreviewLink();
    }

    @NotNull
    public static final List<ShortDynamicLink.Warning> component3(@NotNull ShortDynamicLink shortDynamicLink) {
        List warnings = shortDynamicLink.getWarnings();
        Intrinsics.checkExpressionValueIsNotNull(warnings, "warnings");
        return warnings;
    }

    @NotNull
    public static final DynamicLink dynamicLink(@NotNull FirebaseDynamicLinks firebaseDynamicLinks, @NotNull Function1<? super DynamicLink.Builder, Unit> function1) {
        DynamicLink.Builder builderCreateDynamicLink = FirebaseDynamicLinks.getInstance().createDynamicLink();
        Intrinsics.checkExpressionValueIsNotNull(builderCreateDynamicLink, "FirebaseDynamicLinks.get…nce().createDynamicLink()");
        function1.invoke(builderCreateDynamicLink);
        DynamicLink dynamicLinkBuildDynamicLink = builderCreateDynamicLink.buildDynamicLink();
        Intrinsics.checkExpressionValueIsNotNull(dynamicLinkBuildDynamicLink, "builder.buildDynamicLink()");
        return dynamicLinkBuildDynamicLink;
    }

    @NotNull
    public static final FirebaseDynamicLinks dynamicLinks(@NotNull Firebase firebase, @NotNull FirebaseApp firebaseApp) {
        FirebaseDynamicLinks firebaseDynamicLinks = FirebaseDynamicLinks.getInstance(firebaseApp);
        Intrinsics.checkExpressionValueIsNotNull(firebaseDynamicLinks, "FirebaseDynamicLinks.getInstance(app)");
        return firebaseDynamicLinks;
    }

    @NotNull
    public static final FirebaseDynamicLinks getDynamicLinks(@NotNull Firebase firebase) {
        FirebaseDynamicLinks firebaseDynamicLinks = FirebaseDynamicLinks.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(firebaseDynamicLinks, "FirebaseDynamicLinks.getInstance()");
        return firebaseDynamicLinks;
    }

    public static final void googleAnalyticsParameters(@NotNull DynamicLink.Builder builder, @NotNull Function1<? super DynamicLink.GoogleAnalyticsParameters.Builder, Unit> function1) {
        DynamicLink.GoogleAnalyticsParameters.Builder builder2 = new DynamicLink.GoogleAnalyticsParameters.Builder();
        function1.invoke(builder2);
        builder.setGoogleAnalyticsParameters(builder2.build());
    }

    public static final void iosParameters(@NotNull DynamicLink.Builder builder, @NotNull String str, @NotNull Function1<? super DynamicLink.IosParameters.Builder, Unit> function1) {
        DynamicLink.IosParameters.Builder builder2 = new DynamicLink.IosParameters.Builder(str);
        function1.invoke(builder2);
        builder.setIosParameters(builder2.build());
    }

    public static final void itunesConnectAnalyticsParameters(@NotNull DynamicLink.Builder builder, @NotNull Function1<? super DynamicLink.ItunesConnectAnalyticsParameters.Builder, Unit> function1) {
        DynamicLink.ItunesConnectAnalyticsParameters.Builder builder2 = new DynamicLink.ItunesConnectAnalyticsParameters.Builder();
        function1.invoke(builder2);
        builder.setItunesConnectAnalyticsParameters(builder2.build());
    }

    public static final void navigationInfoParameters(@NotNull DynamicLink.Builder builder, @NotNull Function1<? super DynamicLink.NavigationInfoParameters.Builder, Unit> function1) {
        DynamicLink.NavigationInfoParameters.Builder builder2 = new DynamicLink.NavigationInfoParameters.Builder();
        function1.invoke(builder2);
        builder.setNavigationInfoParameters(builder2.build());
    }

    @NotNull
    public static final Task<ShortDynamicLink> shortLinkAsync(@NotNull FirebaseDynamicLinks firebaseDynamicLinks, @NotNull Function1<? super DynamicLink.Builder, Unit> function1) {
        DynamicLink.Builder builderCreateDynamicLink = FirebaseDynamicLinks.getInstance().createDynamicLink();
        Intrinsics.checkExpressionValueIsNotNull(builderCreateDynamicLink, "FirebaseDynamicLinks.get…nce().createDynamicLink()");
        function1.invoke(builderCreateDynamicLink);
        Task<ShortDynamicLink> taskBuildShortDynamicLink = builderCreateDynamicLink.buildShortDynamicLink();
        Intrinsics.checkExpressionValueIsNotNull(taskBuildShortDynamicLink, "builder.buildShortDynamicLink()");
        return taskBuildShortDynamicLink;
    }

    public static final void socialMetaTagParameters(@NotNull DynamicLink.Builder builder, @NotNull Function1<? super DynamicLink.SocialMetaTagParameters.Builder, Unit> function1) {
        DynamicLink.SocialMetaTagParameters.Builder builder2 = new DynamicLink.SocialMetaTagParameters.Builder();
        function1.invoke(builder2);
        builder.setSocialMetaTagParameters(builder2.build());
    }

    @Nullable
    public static final Uri component1(@NotNull PendingDynamicLinkData pendingDynamicLinkData) {
        return pendingDynamicLinkData.getLink();
    }

    public static final int component2(@NotNull PendingDynamicLinkData pendingDynamicLinkData) {
        return pendingDynamicLinkData.getMinimumAppVersion();
    }

    public static final long component3(@NotNull PendingDynamicLinkData pendingDynamicLinkData) {
        return pendingDynamicLinkData.getClickTimestamp();
    }

    public static final void androidParameters(@NotNull DynamicLink.Builder builder, @NotNull String str, @NotNull Function1<? super DynamicLink.AndroidParameters.Builder, Unit> function1) {
        DynamicLink.AndroidParameters.Builder builder2 = new DynamicLink.AndroidParameters.Builder(str);
        function1.invoke(builder2);
        builder.setAndroidParameters(builder2.build());
    }

    public static final void googleAnalyticsParameters(@NotNull DynamicLink.Builder builder, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super DynamicLink.GoogleAnalyticsParameters.Builder, Unit> function1) {
        DynamicLink.GoogleAnalyticsParameters.Builder builder2 = new DynamicLink.GoogleAnalyticsParameters.Builder(str, str2, str3);
        function1.invoke(builder2);
        builder.setGoogleAnalyticsParameters(builder2.build());
    }

    @NotNull
    public static final Task<ShortDynamicLink> shortLinkAsync(@NotNull FirebaseDynamicLinks firebaseDynamicLinks, int i10, @NotNull Function1<? super DynamicLink.Builder, Unit> function1) {
        DynamicLink.Builder builderCreateDynamicLink = FirebaseDynamicLinks.getInstance().createDynamicLink();
        Intrinsics.checkExpressionValueIsNotNull(builderCreateDynamicLink, "FirebaseDynamicLinks.get…nce().createDynamicLink()");
        function1.invoke(builderCreateDynamicLink);
        Task<ShortDynamicLink> taskBuildShortDynamicLink = builderCreateDynamicLink.buildShortDynamicLink(i10);
        Intrinsics.checkExpressionValueIsNotNull(taskBuildShortDynamicLink, "builder.buildShortDynamicLink(suffix)");
        return taskBuildShortDynamicLink;
    }
}
