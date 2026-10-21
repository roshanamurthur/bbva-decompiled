package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class SignalHit extends AbstractHit {
    String body;
    String contentType;
    int timeout;
    String url;

    public NetworkService.HttpCommand getHttpCommand() {
        return StringUtils.isNullOrEmpty(this.body) ? NetworkService.HttpCommand.GET : NetworkService.HttpCommand.POST;
    }
}
