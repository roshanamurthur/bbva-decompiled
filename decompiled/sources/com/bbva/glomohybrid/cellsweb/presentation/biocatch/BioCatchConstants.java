package com.bbva.glomohybrid.cellsweb.presentation.biocatch;

import com.bbva.bridge.dispatcher.WebMessage;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BioCatchConstants.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/biocatch/BioCatchConstants;", "", "Lcom/bbva/bridge/dispatcher/WebMessage;", "a", "Lcom/bbva/bridge/dispatcher/WebMessage;", "getCHANGE_PROFILE_PERSONAL_TRACK", "()Lcom/bbva/bridge/dispatcher/WebMessage;", "CHANGE_PROFILE_PERSONAL_TRACK", "b", "getCHANGE_PROFILE_BUSINESS_TRACK", "CHANGE_PROFILE_BUSINESS_TRACK", "c", "getCHANGE_USER_TRACK", "CHANGE_USER_TRACK", "<init>", "()V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class BioCatchConstants {

    @NotNull
    public static final BioCatchConstants INSTANCE = new BioCatchConstants();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final WebMessage CHANGE_PROFILE_PERSONAL_TRACK = new WebMessage(CellsChannels.NATIVE_BIOCATCH_SINGLEAPP_CHANNEL, "click_personal_profile");

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final WebMessage CHANGE_PROFILE_BUSINESS_TRACK = new WebMessage(CellsChannels.NATIVE_BIOCATCH_SINGLEAPP_CHANNEL, "click_business_profile");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final WebMessage CHANGE_USER_TRACK = new WebMessage(CellsChannels.NATIVE_BIOCATCH_SINGLEAPP_CHANNEL, "click_change_user");

    @NotNull
    public final WebMessage getCHANGE_PROFILE_BUSINESS_TRACK() {
        return CHANGE_PROFILE_BUSINESS_TRACK;
    }

    @NotNull
    public final WebMessage getCHANGE_PROFILE_PERSONAL_TRACK() {
        return CHANGE_PROFILE_PERSONAL_TRACK;
    }

    @NotNull
    public final WebMessage getCHANGE_USER_TRACK() {
        return CHANGE_USER_TRACK;
    }
}
