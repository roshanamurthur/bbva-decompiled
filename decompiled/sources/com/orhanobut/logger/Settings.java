package com.orhanobut.logger;

import bh.a;

/* JADX INFO: loaded from: classes11.dex */
public final class Settings {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LogAdapter f63727d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f63724a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f63725b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f63726c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LogLevel f63728e = LogLevel.FULL;

    public LogAdapter getLogAdapter() {
        if (this.f63727d == null) {
            this.f63727d = new a();
        }
        return this.f63727d;
    }

    public LogLevel getLogLevel() {
        return this.f63728e;
    }

    public int getMethodCount() {
        return this.f63724a;
    }

    public int getMethodOffset() {
        return this.f63726c;
    }

    public Settings hideThreadInfo() {
        this.f63725b = false;
        return this;
    }

    public boolean isShowThreadInfo() {
        return this.f63725b;
    }

    public Settings logAdapter(LogAdapter logAdapter) {
        this.f63727d = logAdapter;
        return this;
    }

    public Settings logLevel(LogLevel logLevel) {
        this.f63728e = logLevel;
        return this;
    }

    public Settings methodCount(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f63724a = i10;
        return this;
    }

    public Settings methodOffset(int i10) {
        this.f63726c = i10;
        return this;
    }

    public void reset() {
        this.f63724a = 2;
        this.f63726c = 0;
        this.f63725b = true;
        this.f63728e = LogLevel.FULL;
    }
}
