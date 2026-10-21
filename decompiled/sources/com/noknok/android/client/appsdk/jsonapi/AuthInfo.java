package com.noknok.android.client.appsdk.jsonapi;

import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class AuthInfo {

    @Expose
    public String aaid;

    @Expose
    public int authenticationAlgorithm;
    public List<DiscoveryInfo.Version> supportedUAFVersions;

    @Expose
    public String tcDisplayContentType;

    @Expose
    public List<DisplayPNGCharacteristicsDescriptor> tcDisplayPNGCharacteristics;

    public static class DisplayPNGCharacteristicsDescriptor {

        @Expose
        public byte bitDepth;

        @Expose
        public byte colorType;

        @Expose
        public byte compression;

        @Expose
        public byte filter;

        @Expose
        public long height;

        @Expose
        public byte interlace;

        @Expose
        public List<rgbPaletteEntry> plte = new ArrayList();

        @Expose
        public long width;
    }

    public static class rgbPaletteEntry {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Expose
        public short f62902b;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Expose
        public short f62903g;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @Expose
        public short f62904r;
    }
}
