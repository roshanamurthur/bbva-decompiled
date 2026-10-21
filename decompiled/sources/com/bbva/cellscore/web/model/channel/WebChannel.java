package com.bbva.cellscore.web.model.channel;

import com.bbva.cellscore.channel.model.Channel;

/* JADX INFO: loaded from: classes2.dex */
public class WebChannel<T> extends Channel<T> implements Cloneable {

    public static class Builder<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Channel.BundleAdapter<T> f27117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Channel.ObjectAdapter<T> f27118c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Channel.SaveExecutor<T> f27119d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Channel.RestoreExecutor<T> f27120e;

        public Builder(String str) {
            this.f27116a = str;
        }

        public WebChannel<T> create() {
            return new WebChannel<>(this.f27116a, this.f27118c, this.f27117b, this.f27119d, this.f27120e);
        }

        public Builder<T> onRestore(Channel.RestoreExecutor<T> restoreExecutor) {
            this.f27120e = restoreExecutor;
            return this;
        }

        public Builder<T> onSave(Channel.SaveExecutor<T> saveExecutor) {
            this.f27119d = saveExecutor;
            return this;
        }

        public Builder<T> toNativeObject(Channel.BundleAdapter<T> bundleAdapter) {
            this.f27117b = bundleAdapter;
            return this;
        }

        public Builder<T> toWebObject(Channel.ObjectAdapter<T> objectAdapter) {
            this.f27118c = objectAdapter;
            return this;
        }
    }

    public WebChannel(String str) {
        super(str, Channel.Type.REPLAY);
        setAutoClean(false);
        setSaveOnDestroy(true);
    }

    @Override // com.bbva.cellscore.channel.model.Channel
    public Channel<T> cloneWithName(String str) {
        return new WebChannel(this, str);
    }

    public WebChannel(String str, Channel.ObjectAdapter<T> objectAdapter, Channel.BundleAdapter<T> bundleAdapter, Channel.SaveExecutor<T> saveExecutor, Channel.RestoreExecutor<T> restoreExecutor) {
        super(str, Channel.Type.REPLAY);
        setAutoClean(false);
        setSaveOnDestroy(true);
        setMapAdapter(objectAdapter);
        setBundleAdapter(bundleAdapter);
        setSaveExecutor(saveExecutor);
        setRestoreExecutor(restoreExecutor);
    }

    public WebChannel(WebChannel webChannel, String str) {
        super(webChannel, str);
    }
}
