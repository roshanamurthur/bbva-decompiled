package com.bbva.actionlauncher;

import com.bbva.actionlauncher.model.PlatformType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ActionLauncher.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH&J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0016H&¨\u0006\u0017"}, d2 = {"Lcom/bbva/actionlauncher/ActionLauncher;", "", "canOpenUri", "", "uri", "Lcom/bbva/actionlauncher/UriValue;", "launchApp", "packageName", "", "launchDialer", "phone", "launchMaps", "uriString", "launchMarket", "", "platformType", "Lcom/bbva/actionlauncher/model/PlatformType;", "launchSettings", "launchShare", "contentValue", "Lcom/bbva/actionlauncher/SharedValue;", "launchView", "Lcom/bbva/actionlauncher/ViewValue;", "actionlauncher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ActionLauncher {
    boolean canOpenUri(@NotNull UriValue uri);

    boolean launchApp(@NotNull String packageName);

    boolean launchDialer(@NotNull String phone);

    boolean launchMaps(@NotNull String uriString);

    void launchMarket(@NotNull String packageName, @NotNull PlatformType platformType);

    boolean launchSettings(@NotNull String packageName);

    boolean launchShare(@NotNull SharedValue contentValue);

    boolean launchView(@NotNull ViewValue contentValue);
}
